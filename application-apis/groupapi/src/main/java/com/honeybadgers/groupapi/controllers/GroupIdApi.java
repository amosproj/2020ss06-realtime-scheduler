/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.honeybadgers.groupapi.controllers;

import com.honeybadgers.groupapi.models.ErrorModel;
import com.honeybadgers.groupapi.models.GroupModel;
import com.honeybadgers.groupapi.models.ResponseModel;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-02T17:28:57.438+02:00[Europe/Berlin]")

@Validated
@Api(value = "{group_Id}", description = "the {group_Id} API")
public interface GroupIdApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /{group_Id}/id
     * Delete group from Database
     *
     * @param groupId  (required)
     * @return Group was deleted successfully (status code 200)
     *         or Error while deleting group - group_id not found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "groupIdIdDelete", notes = "Delete group from Database", response = GroupModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Group was deleted successfully", response = GroupModel.class),
        @ApiResponse(code = 404, message = "Error while deleting group - group_id not found", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/{group_Id}/id",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<GroupModel> groupIdIdDelete(@ApiParam(value = "",required=true) @PathVariable("group_Id") String groupId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mode\" : \"parallel\", \"working_days\" : [ true, true, true, true, true ], \"parent_id\" : \"parent_id\", \"active_times\" : [ \"{}\", \"{}\" ], \"last_index_number\" : 0, \"id\" : \"id\", \"priority\" : 800, \"deadline\" : \"2000-01-23T04:56:07.000+00:00\", \"parallelism_degree\" : 1, \"type_flag\" : \"batch\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /{group_Id}/id
     * Return group by group_Id from Database
     *
     * @param groupId  (required)
     * @return Group was returned successfully (status code 200)
     *         or Error while retrieving group - group_Id not found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "groupIdIdGet", notes = "Return group by group_Id from Database", response = GroupModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Group was returned successfully", response = GroupModel.class),
        @ApiResponse(code = 404, message = "Error while retrieving group - group_Id not found", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/{group_Id}/id",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GroupModel> groupIdIdGet(@ApiParam(value = "",required=true) @PathVariable("group_Id") String groupId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mode\" : \"parallel\", \"working_days\" : [ true, true, true, true, true ], \"parent_id\" : \"parent_id\", \"active_times\" : [ \"{}\", \"{}\" ], \"last_index_number\" : 0, \"id\" : \"id\", \"priority\" : 800, \"deadline\" : \"2000-01-23T04:56:07.000+00:00\", \"parallelism_degree\" : 1, \"type_flag\" : \"batch\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /{group_Id}/id
     * Update group in Database
     *
     * @param groupId  (required)
     * @param groupModel group object (required)
     * @return New group was updated successfully (status code 200)
     *         or Error while updating group - invalid group model (status code 400)
     *         or Error while updating group - group_id not found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "groupIdIdPost", notes = "Update group in Database", response = ResponseModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "New group was updated successfully", response = ResponseModel.class),
        @ApiResponse(code = 400, message = "Error while updating group - invalid group model", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Error while updating group - group_id not found", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/{group_Id}/id",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ResponseModel> groupIdIdPost(@ApiParam(value = "",required=true) @PathVariable("group_Id") String groupId,@ApiParam(value = "group object" ,required=true )  @Valid @RequestBody GroupModel groupModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"code\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
