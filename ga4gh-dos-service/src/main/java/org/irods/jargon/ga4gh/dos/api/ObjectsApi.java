/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.irods.jargon.ga4gh.dos.api;

import javax.validation.Valid;

import org.irods.jargon.ga4gh.dos.model.CreateObjectRequest;
import org.irods.jargon.ga4gh.dos.model.CreateObjectResponse;
import org.irods.jargon.ga4gh.dos.model.DeleteObjectResponse;
import org.irods.jargon.ga4gh.dos.model.ErrorResponse;
import org.irods.jargon.ga4gh.dos.model.GetObjectResponse;
import org.irods.jargon.ga4gh.dos.model.GetObjectVersionsResponse;
import org.irods.jargon.ga4gh.dos.model.ListObjectsResponse;
import org.irods.jargon.ga4gh.dos.model.UpdateObjectRequest;
import org.irods.jargon.ga4gh.dos.model.UpdateObjectResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-07T17:18:44.860Z")

@Api(value = "objects", description = "the objects API")
public interface ObjectsApi {

	@ApiOperation(value = "Make a new Data Object", nickname = "createObject", notes = "", response = CreateObjectResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully created the Data Object.", response = CreateObjectResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<CreateObjectResponse> createObject(
			@ApiParam(value = "The Data Object to be created. The ID scheme is left up to the implementor but should be unique to the server instance.", required = true) @Valid @RequestBody CreateObjectRequest body);

	@ApiOperation(value = "Delete a Data Object index entry", nickname = "deleteObject", notes = "", response = DeleteObjectResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The Data Object was deleted successfully.", response = DeleteObjectResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "The requested Data Object wasn't found.", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects/{object_id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<DeleteObjectResponse> deleteObject(
			@ApiParam(value = "", required = true) @PathVariable("object_id") String objectId);

	@ApiOperation(value = "Retrieve a Data Object", nickname = "getObject", notes = "", response = GetObjectResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The Data Object was found successfully.", response = GetObjectResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "The requested Data Object wasn't found", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects/{object_id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<GetObjectResponse> getObject(
			@ApiParam(value = "", required = true) @PathVariable("object_id") String objectId,
			@ApiParam(value = "If provided will return the requested version of the selected Data Object.") @Valid @RequestParam(value = "version", required = false) String version);

	@ApiOperation(value = "Retrieve all versions of a Data Object", nickname = "getObjectVersions", notes = "", response = GetObjectVersionsResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The versions for the Data Object were returned successfully.", response = GetObjectVersionsResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "The requested Data Object wasn't found.", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects/{object_id}/versions", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<GetObjectVersionsResponse> getObjectVersions(
			@ApiParam(value = "", required = true) @PathVariable("object_id") String objectId);

	@ApiOperation(value = "List the Data Objects", nickname = "listObjects", notes = "", response = ListObjectsResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The Data Objects were listed successfully.", response = ListObjectsResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<ListObjectsResponse> listObjects(
			@ApiParam(value = "If provided will only return Data Objects with the given alias.") @Valid @RequestParam(value = "alias", required = false) String alias,
			@ApiParam(value = "If provided will return only Data Objects with a that URL matches this string.") @Valid @RequestParam(value = "url", required = false) String url,
			@ApiParam(value = "The hexlified checksum that one would like to match on.") @Valid @RequestParam(value = "checksum", required = false) String checksum,
			@ApiParam(value = "If provided will restrict responses to those that match the provided type.  possible values: md5                # most blob stores provide a checksum using this multipart-md5      # multipart uploads provide a specialized tag in S3 sha256 sha512") @Valid @RequestParam(value = "checksum_type", required = false) String checksumType,
			@ApiParam(value = "Specifies the maximum number of results to return in a single page. If unspecified, a system default will be used.") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize,
			@ApiParam(value = "The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `next_page_token` from the previous response.") @Valid @RequestParam(value = "page_token", required = false) String pageToken);

	@ApiOperation(value = "Update a Data Object", nickname = "updateObject", notes = "", response = UpdateObjectResponse.class, tags = {
			"DataRepositoryService", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The Data Object was successfully updated.", response = UpdateObjectResponse.class),
			@ApiResponse(code = 400, message = "The request is malformed.", response = ErrorResponse.class),
			@ApiResponse(code = 401, message = "The request is unauthorized.", response = ErrorResponse.class),
			@ApiResponse(code = 403, message = "The requester is not authorized to perform this action.", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "The requested Data Object wasn't found.", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "An unexpected error occurred.", response = ErrorResponse.class) })
	@RequestMapping(value = "/objects/{object_id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<UpdateObjectResponse> updateObject(
			@ApiParam(value = "The ID of the Data Object to update", required = true) @PathVariable("object_id") String objectId,
			@ApiParam(value = "The new Data Object for the given object_id. If the ID specified in the request body is different than that specified in the path, the Data Object's ID will be replaced with the one in the request body.", required = true) @Valid @RequestBody UpdateObjectRequest body);

}