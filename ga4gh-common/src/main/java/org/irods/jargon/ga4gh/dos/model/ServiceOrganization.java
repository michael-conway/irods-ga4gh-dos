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
 * Organization providing the service
 */
@Schema(description = "Organization providing the service")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-22T12:15:59.889Z[GMT]")


public class ServiceOrganization  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  public ServiceOrganization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the organization responsible for the service
   * @return name
   **/
  @Schema(example = "My organization", required = true, description = "Name of the organization responsible for the service")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceOrganization url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the website of the organization (RFC 3986 format)
   * @return url
   **/
  @Schema(example = "https://example.com", required = true, description = "URL of the website of the organization (RFC 3986 format)")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrganization serviceOrganization = (ServiceOrganization) o;
    return Objects.equals(this.name, serviceOrganization.name) &&
        Objects.equals(this.url, serviceOrganization.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrganization {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
