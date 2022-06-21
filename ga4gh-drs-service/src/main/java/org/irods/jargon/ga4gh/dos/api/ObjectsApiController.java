package org.irods.jargon.ga4gh.dos.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import org.irods.jargon.ga4gh.dos.model.AccessURL;
import org.irods.jargon.ga4gh.dos.model.DrsObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-13T12:08:45.878Z[GMT]")
@RestController
public class ObjectsApiController implements ObjectsApi {

    private static final Logger log = LoggerFactory.getLogger(ObjectsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ObjectsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccessURL> getAccessURL(@Parameter(in = ParameterIn.PATH, description = "`DrsObject` identifier", required=true, schema=@Schema()) @PathVariable("object_id") String objectId,@Parameter(in = ParameterIn.PATH, description = "An `access_id` from the `access_methods` list of a `DrsObject`", required=true, schema=@Schema()) @PathVariable("access_id") String accessId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccessURL>(objectMapper.readValue("{\n  \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n  \"url\" : \"url\"\n}", AccessURL.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccessURL>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccessURL>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DrsObject> getObject(@Parameter(in = ParameterIn.PATH, description = "`DrsObject` identifier", required=true, schema=@Schema()) @PathVariable("object_id") String objectId,@Parameter(in = ParameterIn.QUERY, description = "If false and the object_id refers to a bundle, then the ContentsObject array contains only those objects directly contained in the bundle. That is, if the bundle contains other bundles, those other bundles are not recursively included in the result. If true and the object_id refers to a bundle, then the entire set of objects in the bundle is expanded. That is, if the bundle contains aother bundles, then those other bundles are recursively expanded and included in the result. Recursion continues through the entire sub-tree of the bundle. If the object_id refers to a blob, then the query parameter is ignored." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) Boolean expand) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DrsObject>(objectMapper.readValue("{\n  \"checksums\" : [ {\n    \"checksum\" : \"checksum\",\n    \"type\" : \"sha-256\"\n  }, {\n    \"checksum\" : \"checksum\",\n    \"type\" : \"sha-256\"\n  } ],\n  \"created_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"updated_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"aliases\" : [ \"aliases\", \"aliases\" ],\n  \"description\" : \"description\",\n  \"self_uri\" : \"drs://drs.example.org/314159\",\n  \"version\" : \"version\",\n  \"size\" : 0,\n  \"mime_type\" : \"application/json\",\n  \"access_methods\" : [ {\n    \"access_url\" : {\n      \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n      \"url\" : \"url\"\n    },\n    \"access_id\" : \"access_id\",\n    \"type\" : \"s3\",\n    \"region\" : \"us-east-1\"\n  }, {\n    \"access_url\" : {\n      \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n      \"url\" : \"url\"\n    },\n    \"access_id\" : \"access_id\",\n    \"type\" : \"s3\",\n    \"region\" : \"us-east-1\"\n  } ],\n  \"contents\" : [ {\n    \"contents\" : [ null, null ],\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"drs_uri\" : \"drs://drs.example.org/314159\"\n  }, {\n    \"contents\" : [ null, null ],\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"drs_uri\" : \"drs://drs.example.org/314159\"\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"id\"\n}", DrsObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DrsObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DrsObject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccessURL> postAccessURL(@Parameter(in = ParameterIn.PATH, description = "`DrsObject` identifier", required=true, schema=@Schema()) @PathVariable("object_id") String objectId,@Parameter(in = ParameterIn.PATH, description = "An `access_id` from the `access_methods` list of a `DrsObject`", required=true, schema=@Schema()) @PathVariable("access_id") String accessId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccessURL>(objectMapper.readValue("{\n  \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n  \"url\" : \"url\"\n}", AccessURL.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccessURL>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccessURL>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DrsObject> postObject(@Parameter(in = ParameterIn.PATH, description = "`DrsObject` identifier", required=true, schema=@Schema()) @PathVariable("object_id") String objectId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DrsObject>(objectMapper.readValue("{\n  \"checksums\" : [ {\n    \"checksum\" : \"checksum\",\n    \"type\" : \"sha-256\"\n  }, {\n    \"checksum\" : \"checksum\",\n    \"type\" : \"sha-256\"\n  } ],\n  \"created_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"updated_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"aliases\" : [ \"aliases\", \"aliases\" ],\n  \"description\" : \"description\",\n  \"self_uri\" : \"drs://drs.example.org/314159\",\n  \"version\" : \"version\",\n  \"size\" : 0,\n  \"mime_type\" : \"application/json\",\n  \"access_methods\" : [ {\n    \"access_url\" : {\n      \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n      \"url\" : \"url\"\n    },\n    \"access_id\" : \"access_id\",\n    \"type\" : \"s3\",\n    \"region\" : \"us-east-1\"\n  }, {\n    \"access_url\" : {\n      \"headers\" : \"Authorization: Basic Z2E0Z2g6ZHJz\",\n      \"url\" : \"url\"\n    },\n    \"access_id\" : \"access_id\",\n    \"type\" : \"s3\",\n    \"region\" : \"us-east-1\"\n  } ],\n  \"contents\" : [ {\n    \"contents\" : [ null, null ],\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"drs_uri\" : \"drs://drs.example.org/314159\"\n  }, {\n    \"contents\" : [ null, null ],\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"drs_uri\" : \"drs://drs.example.org/314159\"\n  } ],\n  \"name\" : \"name\",\n  \"id\" : \"id\"\n}", DrsObject.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DrsObject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DrsObject>(HttpStatus.NOT_IMPLEMENTED);
    }

}
