package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccessURL
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-22T12:15:59.889Z[GMT]")


public class AccessURL  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("headers")
  @Valid
  private List<String> headers = null;

  public AccessURL url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A fully resolvable URL that can be used to fetch the actual object bytes.
   * @return url
   **/
  @Schema(required = true, description = "A fully resolvable URL that can be used to fetch the actual object bytes.")
      @NotNull

    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AccessURL headers(List<String> headers) {
    this.headers = headers;
    return this;
  }

  public AccessURL addHeadersItem(String headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<String>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * An optional list of headers to include in the HTTP request to `url`. These headers can be used to provide auth tokens required to fetch the object bytes.
   * @return headers
   **/
  @Schema(example = "Authorization: Basic Z2E0Z2g6ZHJz", description = "An optional list of headers to include in the HTTP request to `url`. These headers can be used to provide auth tokens required to fetch the object bytes.")
  
    public List<String> getHeaders() {
    return headers;
  }

  public void setHeaders(List<String> headers) {
    this.headers = headers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessURL accessURL = (AccessURL) o;
    return Objects.equals(this.url, accessURL.url) &&
        Objects.equals(this.headers, accessURL.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessURL {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
