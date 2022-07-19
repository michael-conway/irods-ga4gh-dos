package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Type of a GA4GH service
 */
@Schema(description = "Type of a GA4GH service")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-22T12:15:59.889Z[GMT]")


public class ServiceType  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("artifact")
  private String artifact = null;

  @JsonProperty("version")
  private String version = null;

  public ServiceType group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Namespace in reverse domain name format. Use `org.ga4gh` for implementations compliant with official GA4GH specifications. For services with custom APIs not standardized by GA4GH, or implementations diverging from official GA4GH specifications, use a different namespace (e.g. your organization's reverse domain name).
   * @return group
   **/
  @Schema(example = "org.ga4gh", required = true, description = "Namespace in reverse domain name format. Use `org.ga4gh` for implementations compliant with official GA4GH specifications. For services with custom APIs not standardized by GA4GH, or implementations diverging from official GA4GH specifications, use a different namespace (e.g. your organization's reverse domain name).")
      @NotNull

    public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ServiceType artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

  /**
   * Name of the API or GA4GH specification implemented. Official GA4GH types should be assigned as part of standards approval process. Custom artifacts are supported.
   * @return artifact
   **/
  @Schema(example = "beacon", required = true, description = "Name of the API or GA4GH specification implemented. Official GA4GH types should be assigned as part of standards approval process. Custom artifacts are supported.")
      @NotNull

    public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public ServiceType version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the API or specification. GA4GH specifications use semantic versioning.
   * @return version
   **/
  @Schema(example = "1.0.0", required = true, description = "Version of the API or specification. GA4GH specifications use semantic versioning.")
      @NotNull

    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceType serviceType = (ServiceType) o;
    return Objects.equals(this.group, serviceType.group) &&
        Objects.equals(this.artifact, serviceType.artifact) &&
        Objects.equals(this.version, serviceType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, artifact, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceType {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
