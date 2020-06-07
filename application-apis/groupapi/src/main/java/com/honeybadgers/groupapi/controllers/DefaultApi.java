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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T20:08:19.461+02:00[Europe/Berlin]")

@Validated
@Api(value = "default", description = "the default API")
public interface DefaultApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /
     * Get all groups stored in Database
     *
     * @return OK - List of groups (status code 200)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "rootGet", notes = "Get all groups stored in Database", response = GroupModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK - List of groups", response = GroupModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<GroupModel>> rootGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mode\" : \"parallel\", \"paused\" : false, \"working_days\" : [ true, true, true, true, true ], \"parent_id\" : \"parent_id\", \"active_times\" : [ \"{}\", \"{}\" ], \"last_index_number\" : 0, \"id\" : \"id\", \"priority\" : 800, \"deadline\" : \"2000-01-23T04:56:07.000+00:00\", \"parallelism_degree\" : 1, \"type_flag\" : \"batch\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /
     * Create new group and store in Database
     *
     * @param groupModel new group object (required)
     * @return New group was created successfully (status code 200)
     *         or Error while creating group (status code 400)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "rootPost", notes = "Create new group and store in Database", response = ResponseModel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "New group was created successfully", response = ResponseModel.class),
        @ApiResponse(code = 400, message = "Error while creating group", response = ErrorModel.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ResponseModel> rootPost(@ApiParam(value = "new group object" ,required=true )  @Valid @RequestBody GroupModel groupModel) {
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
