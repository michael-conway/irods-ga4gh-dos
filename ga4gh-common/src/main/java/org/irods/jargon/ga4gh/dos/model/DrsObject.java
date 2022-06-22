package org.irods.jargon.ga4gh.dos.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.irods.jargon.ga4gh.dos.model.AccessMethod;
import org.irods.jargon.ga4gh.dos.model.Checksum;
import org.irods.jargon.ga4gh.dos.model.ContentsObject;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DrsObject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-22T12:15:59.889Z[GMT]")


public class DrsObject  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("self_uri")
  private String selfUri = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("created_time")
  private java.time.OffsetDateTime createdTime = null;

  @JsonProperty("updated_time")
  private java.time.OffsetDateTime updatedTime = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("mime_type")
  private String mimeType = null;

  @JsonProperty("checksums")
  @Valid
  private List<Checksum> checksums = new ArrayList<Checksum>();

  @JsonProperty("access_methods")
  @Valid
  private List<AccessMethod> accessMethods = null;

  @JsonProperty("contents")
  @Valid
  private List<ContentsObject> contents = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("aliases")
  @Valid
  private List<String> aliases = null;

  public DrsObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An identifier unique to this `DrsObject`
   * @return id
   **/
  @Schema(required = true, description = "An identifier unique to this `DrsObject`")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DrsObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A string that can be used to name a `DrsObject`. This string is made up of uppercase and lowercase letters, decimal digits, hypen, period, and underscore [A-Za-z0-9.-_]. See http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap03.html#tag_03_282[portable filenames].
   * @return name
   **/
  @Schema(description = "A string that can be used to name a `DrsObject`. This string is made up of uppercase and lowercase letters, decimal digits, hypen, period, and underscore [A-Za-z0-9.-_]. See http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap03.html#tag_03_282[portable filenames].")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DrsObject selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }

  /**
   * A drs:// hostname-based URI, as defined in the DRS documentation, that tells clients how to access this object. The intent of this field is to make DRS objects self-contained, and therefore easier for clients to store and pass around.  For example, if you arrive at this DRS JSON by resolving a compact identifier-based DRS URI, the `self_uri` presents you with a hostname and properly encoded DRS ID for use in subsequent `access` endpoint calls.
   * @return selfUri
   **/
  @Schema(example = "drs://drs.example.org/314159", required = true, description = "A drs:// hostname-based URI, as defined in the DRS documentation, that tells clients how to access this object. The intent of this field is to make DRS objects self-contained, and therefore easier for clients to store and pass around.  For example, if you arrive at this DRS JSON by resolving a compact identifier-based DRS URI, the `self_uri` presents you with a hostname and properly encoded DRS ID for use in subsequent `access` endpoint calls.")
      @NotNull

    public String getSelfUri() {
    return selfUri;
  }

  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  public DrsObject size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * For blobs, the blob size in bytes. For bundles, the cumulative size, in bytes, of items in the `contents` field.
   * @return size
   **/
  @Schema(required = true, description = "For blobs, the blob size in bytes. For bundles, the cumulative size, in bytes, of items in the `contents` field.")
      @NotNull

    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DrsObject createdTime(java.time.OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Timestamp of content creation in RFC3339. (This is the creation time of the underlying content, not of the JSON object.)
   * @return createdTime
   **/
  @Schema(required = true, description = "Timestamp of content creation in RFC3339. (This is the creation time of the underlying content, not of the JSON object.)")
      @NotNull

    @Valid
    public java.time.OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(java.time.OffsetDateTime offsetDateTime) {
    this.createdTime = offsetDateTime;
  }

  public DrsObject updatedTime(java.time.OffsetDateTime updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Timestamp of content update in RFC3339, identical to `created_time` in systems that do not support updates. (This is the update time of the underlying content, not of the JSON object.)
   * @return updatedTime
   **/
  @Schema(description = "Timestamp of content update in RFC3339, identical to `created_time` in systems that do not support updates. (This is the update time of the underlying content, not of the JSON object.)")
  
    @Valid
    public java.time.OffsetDateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(java.time.OffsetDateTime offsetDateTime) {
    this.updatedTime = offsetDateTime;
  }

  public DrsObject version(String version) {
    this.version = version;
    return this;
  }

  /**
   * A string representing a version. (Some systems may use checksum, a RFC3339 timestamp, or an incrementing version number.)
   * @return version
   **/
  @Schema(description = "A string representing a version. (Some systems may use checksum, a RFC3339 timestamp, or an incrementing version number.)")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DrsObject mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * A string providing the mime-type of the `DrsObject`.
   * @return mimeType
   **/
  @Schema(example = "application/json", description = "A string providing the mime-type of the `DrsObject`.")
  
    public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public DrsObject checksums(List<Checksum> checksums) {
    this.checksums = checksums;
    return this;
  }

  public DrsObject addChecksumsItem(Checksum checksumsItem) {
    this.checksums.add(checksumsItem);
    return this;
  }

  /**
   * The checksum of the `DrsObject`. At least one checksum must be provided. For blobs, the checksum is computed over the bytes in the blob. For bundles, the checksum is computed over a sorted concatenation of the checksums of its top-level contained objects (not recursive, names not included). The list of checksums is sorted alphabetically (hex-code) before concatenation and a further checksum is performed on the concatenated checksum value. For example, if a bundle contains blobs with the following checksums: md5(blob1) = 72794b6d md5(blob2) = 5e089d29 Then the checksum of the bundle is: md5( concat( sort( md5(blob1), md5(blob2) ) ) ) = md5( concat( sort( 72794b6d, 5e089d29 ) ) ) = md5( concat( 5e089d29, 72794b6d ) ) = md5( 5e089d2972794b6d ) = f7a29a04
   * @return checksums
   **/
  @Schema(required = true, description = "The checksum of the `DrsObject`. At least one checksum must be provided. For blobs, the checksum is computed over the bytes in the blob. For bundles, the checksum is computed over a sorted concatenation of the checksums of its top-level contained objects (not recursive, names not included). The list of checksums is sorted alphabetically (hex-code) before concatenation and a further checksum is performed on the concatenated checksum value. For example, if a bundle contains blobs with the following checksums: md5(blob1) = 72794b6d md5(blob2) = 5e089d29 Then the checksum of the bundle is: md5( concat( sort( md5(blob1), md5(blob2) ) ) ) = md5( concat( sort( 72794b6d, 5e089d29 ) ) ) = md5( concat( 5e089d29, 72794b6d ) ) = md5( 5e089d2972794b6d ) = f7a29a04")
      @NotNull
    @Valid
  @Size(min=1)   public List<Checksum> getChecksums() {
    return checksums;
  }

  public void setChecksums(List<Checksum> checksums) {
    this.checksums = checksums;
  }

  public DrsObject accessMethods(List<AccessMethod> accessMethods) {
    this.accessMethods = accessMethods;
    return this;
  }

  public DrsObject addAccessMethodsItem(AccessMethod accessMethodsItem) {
    if (this.accessMethods == null) {
      this.accessMethods = new ArrayList<AccessMethod>();
    }
    this.accessMethods.add(accessMethodsItem);
    return this;
  }

  /**
   * The list of access methods that can be used to fetch the `DrsObject`. Required for single blobs; optional for bundles.
   * @return accessMethods
   **/
  @Schema(description = "The list of access methods that can be used to fetch the `DrsObject`. Required for single blobs; optional for bundles.")
      @Valid
  @Size(min=1)   public List<AccessMethod> getAccessMethods() {
    return accessMethods;
  }

  public void setAccessMethods(List<AccessMethod> accessMethods) {
    this.accessMethods = accessMethods;
  }

  public DrsObject contents(List<ContentsObject> contents) {
    this.contents = contents;
    return this;
  }

  public DrsObject addContentsItem(ContentsObject contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<ContentsObject>();
    }
    this.contents.add(contentsItem);
    return this;
  }

  /**
   * If not set, this `DrsObject` is a single blob. If set, this `DrsObject` is a bundle containing the listed `ContentsObject` s (some of which may be further nested).
   * @return contents
   **/
  @Schema(description = "If not set, this `DrsObject` is a single blob. If set, this `DrsObject` is a bundle containing the listed `ContentsObject` s (some of which may be further nested).")
      @Valid
    public List<ContentsObject> getContents() {
    return contents;
  }

  public void setContents(List<ContentsObject> contents) {
    this.contents = contents;
  }

  public DrsObject description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human readable description of the `DrsObject`.
   * @return description
   **/
  @Schema(description = "A human readable description of the `DrsObject`.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DrsObject aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public DrsObject addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * A list of strings that can be used to find other metadata about this `DrsObject` from external metadata sources. These aliases can be used to represent secondary accession numbers or external GUIDs.
   * @return aliases
   **/
  @Schema(description = "A list of strings that can be used to find other metadata about this `DrsObject` from external metadata sources. These aliases can be used to represent secondary accession numbers or external GUIDs.")
  
    public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrsObject drsObject = (DrsObject) o;
    return Objects.equals(this.id, drsObject.id) &&
        Objects.equals(this.name, drsObject.name) &&
        Objects.equals(this.selfUri, drsObject.selfUri) &&
        Objects.equals(this.size, drsObject.size) &&
        Objects.equals(this.createdTime, drsObject.createdTime) &&
        Objects.equals(this.updatedTime, drsObject.updatedTime) &&
        Objects.equals(this.version, drsObject.version) &&
        Objects.equals(this.mimeType, drsObject.mimeType) &&
        Objects.equals(this.checksums, drsObject.checksums) &&
        Objects.equals(this.accessMethods, drsObject.accessMethods) &&
        Objects.equals(this.contents, drsObject.contents) &&
        Objects.equals(this.description, drsObject.description) &&
        Objects.equals(this.aliases, drsObject.aliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, size, createdTime, updatedTime, version, mimeType, checksums, accessMethods, contents, description, aliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrsObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    checksums: ").append(toIndentedString(checksums)).append("\n");
    sb.append("    accessMethods: ").append(toIndentedString(accessMethods)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
