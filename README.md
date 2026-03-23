## Flink Fabric8 Patch

This project builds a JAR against Flink's shaded dependencies to force the return of fabric8.kubernetes.api.model.ListOptions getAllowWatchBookmarks function to be `FALSE`. 

[Patch](https://github.com/TyRud/flink-fabric8-patch/blob/main/src/main/java/org/apache/flink/kubernetes/shaded/io/fabric8/kubernetes/api/model/ListOptions.java#L80)

This makes outbound kubernetes api calls from the client that would provide the `allowWatchBookmarks=true` parameter, provide it as `false`.

This is done to enable running Flink in kubernetes environments where usage of features under the `WatchLists` feature flag is restricted. 

### Versioning 

- Java 17 (Temurin 17.0.16)
- Flink 2.2.0

### WatchList Feature Flag in K8s versions

See WatchList: 

- [1.34 docs](https://v1-34.docs.kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/#feature-gates-for-alpha-or-beta-features) (The most recent versioned docs at the time of writing this)
- [Current](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/#feature-gates-for-alpha-or-beta-features)

### The Issue

When running Apache Flink in such an environment, the following is observed in the JobManager:

```shell
DEBUG org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.client.dsl.internal.AbstractWatchManager [] - Watching https://100.64.0.1:443/api/v1/namespaces/conduit/configmaps?allowWatchBookmarks=true...
...

ERROR org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.client.dsl.internal.AbstractWatchManager ] - Error received: Status(apiVersion=v1, code=500, details=null, kind=Status, message=a watch stream was requested by the client but the required storage feature RequestWatchProgress is disabled, metadata=ListMeta(_continue=null, remainingItemCount=null, resourceVersion=null, selfLink=null, additionalProperties={}), reason=InternalError, status=Failure, additionalProperties={}), will retry

```

And the following is observed in the TaskManagers: 

```shell
org.apache.flink.util.FlinkException: The TaskExecutor's registration at the ResourceManager pekko.tcp://flink@100.97.37.60:6123/user/rpc/resourcemanager_0 has been rejected: Rejected TaskExecutor registration at the ResourceManager because: The ResourceManager does not recognize this TaskExecutor.
...
```

### With the Fix

```shell
DEBUG org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.client.dsl.internal.AbstractWatchManager [] - Watching https://100.64.0.1:443/api/v1/namespaces/conduit/configmaps?allowWatchBookmarks=false...
```

## Steps 
---

- Pull the source
- Get the `flink-dist-2.2.0.jar` and add it to the root of the project
- package with maven

### Applying the Patch

In my case, I was building a custom docker image to run Flink.

So I put the jar at `/opt/flink/lib` with a `00_` prefix to ensure its loaded before `flink-dist`
