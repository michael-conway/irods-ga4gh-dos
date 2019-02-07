package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetBundleResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-07T17:18:44.860Z")

public class GetBundleResponse {
	@JsonProperty("bundle")
	private Bundle bundle = null;

	public GetBundleResponse bundle(Bundle bundle) {
		this.bundle = bundle;
		return this;
	}

	/**
	 * Get bundle
	 * 
	 * @return bundle
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Bundle getBundle() {
		return bundle;
	}

	public void setBundle(Bundle bundle) {
		this.bundle = bundle;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetBundleResponse getBundleResponse = (GetBundleResponse) o;
		return Objects.equals(this.bundle, getBundleResponse.bundle);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bundle);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetBundleResponse {\n");

		sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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