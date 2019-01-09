package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteDataBundleResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-13T20:57:40.775Z")

public class DeleteDataBundleResponse {
	@JsonProperty("data_bundle_id")
	private String dataBundleId = null;

	public DeleteDataBundleResponse dataBundleId(String dataBundleId) {
		this.dataBundleId = dataBundleId;
		return this;
	}

	/**
	 * Get dataBundleId
	 * 
	 * @return dataBundleId
	 **/
	@ApiModelProperty(value = "")

	public String getDataBundleId() {
		return dataBundleId;
	}

	public void setDataBundleId(String dataBundleId) {
		this.dataBundleId = dataBundleId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeleteDataBundleResponse deleteDataBundleResponse = (DeleteDataBundleResponse) o;
		return Objects.equals(this.dataBundleId, deleteDataBundleResponse.dataBundleId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataBundleId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeleteDataBundleResponse {\n");

		sb.append("    dataBundleId: ").append(toIndentedString(dataBundleId)).append("\n");
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
