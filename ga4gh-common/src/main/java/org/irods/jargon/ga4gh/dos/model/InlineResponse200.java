package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.irods.jargon.ga4gh.dos.model.DrsService;
import org.irods.jargon.ga4gh.dos.model.DrsServiceType;
import org.irods.jargon.ga4gh.dos.model.Service;
import org.irods.jargon.ga4gh.dos.model.ServiceOrganization;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-22T12:15:59.889Z[GMT]")


public class InlineResponse200 extends Service implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private DrsServiceType inlineResponse200Type = null;

  public InlineResponse200 inlineResponse200Type(DrsServiceType inlineResponse200Type) {
    this.inlineResponse200Type = inlineResponse200Type;
    return this;
  }

  /**
   * Get inlineResponse200Type
   * @return inlineResponse200Type
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DrsServiceType getInlineResponse200Type() {
    return inlineResponse200Type;
  }

  public void setInlineResponse200Type(DrsServiceType inlineResponse200Type) {
    this.inlineResponse200Type = inlineResponse200Type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.inlineResponse200Type, inlineResponse200.inlineResponse200Type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200Type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200Type: ").append(toIndentedString(inlineResponse200Type)).append("\n");
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
