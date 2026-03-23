//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.api.model;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Generated;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonAnySetter;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.flink.kubernetes.shaded.com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.api.builder.Editable;
import org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.model.annotation.Group;
import org.apache.flink.kubernetes.shaded.io.fabric8.kubernetes.model.annotation.Version;

@JsonDeserialize(
        using = JsonDeserializer.None.class
)
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"apiVersion", "kind", "allowWatchBookmarks", "continue", "fieldSelector", "labelSelector", "limit", "resourceVersion", "resourceVersionMatch", "sendInitialEvents", "timeoutSeconds", "watch"})
@Version("v1")
@Group("")
public class ListOptions implements Editable<ListOptionsBuilder>, KubernetesResource {
    @JsonProperty("allowWatchBookmarks")
    private Boolean allowWatchBookmarks;
    @JsonProperty("apiVersion")
    private String apiVersion = "v1";
    @JsonProperty("continue")
    private String _continue;
    @JsonProperty("fieldSelector")
    private String fieldSelector;
    @JsonProperty("kind")
    private String kind = "ListOptions";
    @JsonProperty("labelSelector")
    private String labelSelector;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("resourceVersion")
    private String resourceVersion;
    @JsonProperty("resourceVersionMatch")
    private String resourceVersionMatch;
    @JsonProperty("sendInitialEvents")
    private Boolean sendInitialEvents;
    @JsonProperty("timeoutSeconds")
    private Long timeoutSeconds;
    @JsonProperty("watch")
    private Boolean watch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap();

    public ListOptions() {
    }

    public ListOptions(Boolean allowWatchBookmarks, String apiVersion, String _continue, String fieldSelector, String kind, String labelSelector, Long limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Long timeoutSeconds, Boolean watch) {
        this.allowWatchBookmarks = allowWatchBookmarks;
        this.apiVersion = apiVersion;
        this._continue = _continue;
        this.fieldSelector = fieldSelector;
        this.kind = kind;
        this.labelSelector = labelSelector;
        this.limit = limit;
        this.resourceVersion = resourceVersion;
        this.resourceVersionMatch = resourceVersionMatch;
        this.sendInitialEvents = sendInitialEvents;
        this.timeoutSeconds = timeoutSeconds;
        this.watch = watch;
    }

    @JsonProperty("allowWatchBookmarks")
    public Boolean getAllowWatchBookmarks() {
        // Patching to force false
        return Boolean.FALSE;
    }

    @JsonProperty("allowWatchBookmarks")
    public void setAllowWatchBookmarks(Boolean allowWatchBookmarks) {
        this.allowWatchBookmarks = allowWatchBookmarks;
    }

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return this.apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("continue")
    public String getContinue() {
        return this._continue;
    }

    @JsonProperty("continue")
    public void setContinue(String _continue) {
        this._continue = _continue;
    }

    @JsonProperty("fieldSelector")
    public String getFieldSelector() {
        return this.fieldSelector;
    }

    @JsonProperty("fieldSelector")
    public void setFieldSelector(String fieldSelector) {
        this.fieldSelector = fieldSelector;
    }

    @JsonProperty("kind")
    public String getKind() {
        return this.kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("labelSelector")
    public String getLabelSelector() {
        return this.labelSelector;
    }

    @JsonProperty("labelSelector")
    public void setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
    }

    @JsonProperty("limit")
    public Long getLimit() {
        return this.limit;
    }

    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @JsonProperty("resourceVersion")
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    @JsonProperty("resourceVersion")
    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @JsonProperty("resourceVersionMatch")
    public String getResourceVersionMatch() {
        return this.resourceVersionMatch;
    }

    @JsonProperty("resourceVersionMatch")
    public void setResourceVersionMatch(String resourceVersionMatch) {
        this.resourceVersionMatch = resourceVersionMatch;
    }

    @JsonProperty("sendInitialEvents")
    public Boolean getSendInitialEvents() {
        return this.sendInitialEvents;
    }

    @JsonProperty("sendInitialEvents")
    public void setSendInitialEvents(Boolean sendInitialEvents) {
        this.sendInitialEvents = sendInitialEvents;
    }

    @JsonProperty("timeoutSeconds")
    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @JsonProperty("watch")
    public Boolean getWatch() {
        return this.watch;
    }

    @JsonProperty("watch")
    public void setWatch(Boolean watch) {
        this.watch = watch;
    }

    @JsonIgnore
    public ListOptionsBuilder edit() {
        return new ListOptionsBuilder(this);
    }

    @JsonIgnore
    public ListOptionsBuilder toBuilder() {
        return this.edit();
    }

    @JsonAnyGetter
    @JsonIgnore
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Generated
    public String toString() {
        Boolean var10000 = this.getAllowWatchBookmarks();
        return "ListOptions(allowWatchBookmarks=" + var10000 + ", apiVersion=" + this.getApiVersion() + ", _continue=" + this.getContinue() + ", fieldSelector=" + this.getFieldSelector() + ", kind=" + this.getKind() + ", labelSelector=" + this.getLabelSelector() + ", limit=" + this.getLimit() + ", resourceVersion=" + this.getResourceVersion() + ", resourceVersionMatch=" + this.getResourceVersionMatch() + ", sendInitialEvents=" + this.getSendInitialEvents() + ", timeoutSeconds=" + this.getTimeoutSeconds() + ", watch=" + this.getWatch() + ", additionalProperties=" + String.valueOf(this.getAdditionalProperties()) + ")";
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ListOptions)) {
            return false;
        } else {
            ListOptions other = (ListOptions)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$allowWatchBookmarks = this.getAllowWatchBookmarks();
                Object other$allowWatchBookmarks = other.getAllowWatchBookmarks();
                if (this$allowWatchBookmarks == null) {
                    if (other$allowWatchBookmarks != null) {
                        return false;
                    }
                } else if (!this$allowWatchBookmarks.equals(other$allowWatchBookmarks)) {
                    return false;
                }

                Object this$limit = this.getLimit();
                Object other$limit = other.getLimit();
                if (this$limit == null) {
                    if (other$limit != null) {
                        return false;
                    }
                } else if (!this$limit.equals(other$limit)) {
                    return false;
                }

                Object this$sendInitialEvents = this.getSendInitialEvents();
                Object other$sendInitialEvents = other.getSendInitialEvents();
                if (this$sendInitialEvents == null) {
                    if (other$sendInitialEvents != null) {
                        return false;
                    }
                } else if (!this$sendInitialEvents.equals(other$sendInitialEvents)) {
                    return false;
                }

                Object this$timeoutSeconds = this.getTimeoutSeconds();
                Object other$timeoutSeconds = other.getTimeoutSeconds();
                if (this$timeoutSeconds == null) {
                    if (other$timeoutSeconds != null) {
                        return false;
                    }
                } else if (!this$timeoutSeconds.equals(other$timeoutSeconds)) {
                    return false;
                }

                Object this$watch = this.getWatch();
                Object other$watch = other.getWatch();
                if (this$watch == null) {
                    if (other$watch != null) {
                        return false;
                    }
                } else if (!this$watch.equals(other$watch)) {
                    return false;
                }

                Object this$apiVersion = this.getApiVersion();
                Object other$apiVersion = other.getApiVersion();
                if (this$apiVersion == null) {
                    if (other$apiVersion != null) {
                        return false;
                    }
                } else if (!this$apiVersion.equals(other$apiVersion)) {
                    return false;
                }

                Object this$_continue = this.getContinue();
                Object other$_continue = other.getContinue();
                if (this$_continue == null) {
                    if (other$_continue != null) {
                        return false;
                    }
                } else if (!this$_continue.equals(other$_continue)) {
                    return false;
                }

                Object this$fieldSelector = this.getFieldSelector();
                Object other$fieldSelector = other.getFieldSelector();
                if (this$fieldSelector == null) {
                    if (other$fieldSelector != null) {
                        return false;
                    }
                } else if (!this$fieldSelector.equals(other$fieldSelector)) {
                    return false;
                }

                Object this$kind = this.getKind();
                Object other$kind = other.getKind();
                if (this$kind == null) {
                    if (other$kind != null) {
                        return false;
                    }
                } else if (!this$kind.equals(other$kind)) {
                    return false;
                }

                Object this$labelSelector = this.getLabelSelector();
                Object other$labelSelector = other.getLabelSelector();
                if (this$labelSelector == null) {
                    if (other$labelSelector != null) {
                        return false;
                    }
                } else if (!this$labelSelector.equals(other$labelSelector)) {
                    return false;
                }

                Object this$resourceVersion = this.getResourceVersion();
                Object other$resourceVersion = other.getResourceVersion();
                if (this$resourceVersion == null) {
                    if (other$resourceVersion != null) {
                        return false;
                    }
                } else if (!this$resourceVersion.equals(other$resourceVersion)) {
                    return false;
                }

                Object this$resourceVersionMatch = this.getResourceVersionMatch();
                Object other$resourceVersionMatch = other.getResourceVersionMatch();
                if (this$resourceVersionMatch == null) {
                    if (other$resourceVersionMatch != null) {
                        return false;
                    }
                } else if (!this$resourceVersionMatch.equals(other$resourceVersionMatch)) {
                    return false;
                }

                Object this$additionalProperties = this.getAdditionalProperties();
                Object other$additionalProperties = other.getAdditionalProperties();
                if (this$additionalProperties == null) {
                    if (other$additionalProperties != null) {
                        return false;
                    }
                } else if (!this$additionalProperties.equals(other$additionalProperties)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof ListOptions;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $allowWatchBookmarks = this.getAllowWatchBookmarks();
        result = result * 59 + ($allowWatchBookmarks == null ? 43 : $allowWatchBookmarks.hashCode());
        Object $limit = this.getLimit();
        result = result * 59 + ($limit == null ? 43 : $limit.hashCode());
        Object $sendInitialEvents = this.getSendInitialEvents();
        result = result * 59 + ($sendInitialEvents == null ? 43 : $sendInitialEvents.hashCode());
        Object $timeoutSeconds = this.getTimeoutSeconds();
        result = result * 59 + ($timeoutSeconds == null ? 43 : $timeoutSeconds.hashCode());
        Object $watch = this.getWatch();
        result = result * 59 + ($watch == null ? 43 : $watch.hashCode());
        Object $apiVersion = this.getApiVersion();
        result = result * 59 + ($apiVersion == null ? 43 : $apiVersion.hashCode());
        Object $_continue = this.getContinue();
        result = result * 59 + ($_continue == null ? 43 : $_continue.hashCode());
        Object $fieldSelector = this.getFieldSelector();
        result = result * 59 + ($fieldSelector == null ? 43 : $fieldSelector.hashCode());
        Object $kind = this.getKind();
        result = result * 59 + ($kind == null ? 43 : $kind.hashCode());
        Object $labelSelector = this.getLabelSelector();
        result = result * 59 + ($labelSelector == null ? 43 : $labelSelector.hashCode());
        Object $resourceVersion = this.getResourceVersion();
        result = result * 59 + ($resourceVersion == null ? 43 : $resourceVersion.hashCode());
        Object $resourceVersionMatch = this.getResourceVersionMatch();
        result = result * 59 + ($resourceVersionMatch == null ? 43 : $resourceVersionMatch.hashCode());
        Object $additionalProperties = this.getAdditionalProperties();
        result = result * 59 + ($additionalProperties == null ? 43 : $additionalProperties.hashCode());
        return result;
    }
}
