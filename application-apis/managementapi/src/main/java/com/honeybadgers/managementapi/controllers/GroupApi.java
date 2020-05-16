/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.honeybadgers.managementapi.controllers;

import com.honeybadgers.managementapi.models.ErrorModel;
import com.honeybadgers.managementapi.models.ResponseModel;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T01:04:26.284+02:00[Europe/Berlin]")

@Validated
@Api(value = "group", description = "the group API")
public interface GroupApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /group/{group_Id}/start
     * Start scheduling all task assigned to group with given group_Id
     *
     * @param groupId  (required)
     * @return All tasks in group successfully queued for scheduling (status code 200)
     *         or Error - group_Id not found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "groupGroupIdStartPut", notes = "Start scheduling all task assigned to group with given group_Id", response = ResponseModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All tasks in group successfully queued for scheduling", response = ResponseModel.class),
        @ApiResponse(code = 404, message = "Error - group_Id not found", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/group/{group_Id}/start",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<ResponseModel> groupGroupIdStartPut(@ApiParam(value = "",required=true) @PathVariable("group_Id") Long groupId) {
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


    /**
     * PUT /group/{group_Id}/stop
     * Stop scheduling all task assigned to group with given group_Id
     *
     * @param groupId  (required)
     * @return All tasks in group successfully stopped scheduling (status code 200)
     *         or Error - group_Id not found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "groupGroupIdStopPut", notes = "Stop scheduling all task assigned to group with given group_Id", response = ResponseModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All tasks in group successfully stopped scheduling", response = ResponseModel.class),
        @ApiResponse(code = 404, message = "Error - group_Id not found", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/group/{group_Id}/stop",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<ResponseModel> groupGroupIdStopPut(@ApiParam(value = "",required=true) @PathVariable("group_Id") Long groupId) {
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
