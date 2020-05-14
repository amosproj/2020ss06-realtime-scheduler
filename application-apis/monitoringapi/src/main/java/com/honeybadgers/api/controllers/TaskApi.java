/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.honeybadgers.api.controllers;

import com.honeybadgers.api.models.ErrorModel;
import com.honeybadgers.api.models.TaskModel;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-14T16:49:27.805+02:00[Europe/Berlin]")

@Validated
@Api(value = "task", description = "the task API")
public interface TaskApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /task/dispatched/errors
     * Returns an array of tasks with error-feedback from dispatcher
     *
     * @return OK - List of tasks (status code 200)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "taskDispatchedErrorsGet", notes = "Returns an array of tasks with error-feedback from dispatcher", response = TaskModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK - List of tasks", response = TaskModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/task/dispatched/errors",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<TaskModel>> taskDispatchedErrorsGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"maxFailures\" : 0, \"parallelismDegree\" : 5, \"workingDays\" : 1, \"groupId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"priority\" : 80, \"earliestStart\" : \"earliestStart\", \"indexNumber\" : 0, \"typeFlag\" : \"batch\", \"mode\" : \"sequential\", \"latestStart\" : \"latestStart\", \"meta\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ], \"force\" : true, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /task/dispatched
     * Returns an Array with all Tasks currently waiting for feedback from dispatcher
     *
     * @return OK - List of tasks (status code 200)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "taskDispatchedGet", notes = "Returns an Array with all Tasks currently waiting for feedback from dispatcher", response = TaskModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK - List of tasks", response = TaskModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/task/dispatched",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<TaskModel>> taskDispatchedGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"maxFailures\" : 0, \"parallelismDegree\" : 5, \"workingDays\" : 1, \"groupId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"priority\" : 80, \"earliestStart\" : \"earliestStart\", \"indexNumber\" : 0, \"typeFlag\" : \"batch\", \"mode\" : \"sequential\", \"latestStart\" : \"latestStart\", \"meta\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ], \"force\" : true, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /task/scheduled
     * Returns an Array with all Tasks already being scheduled
     *
     * @return OK - List of tasks (status code 200)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "taskScheduledGet", notes = "Returns an Array with all Tasks already being scheduled", response = TaskModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK - List of tasks", response = TaskModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/task/scheduled",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<TaskModel>> taskScheduledGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"maxFailures\" : 0, \"parallelismDegree\" : 5, \"workingDays\" : 1, \"groupId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"priority\" : 80, \"earliestStart\" : \"earliestStart\", \"indexNumber\" : 0, \"typeFlag\" : \"batch\", \"mode\" : \"sequential\", \"latestStart\" : \"latestStart\", \"meta\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ], \"force\" : true, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /task/waiting
     * Returns an Array with all Tasks currently waiting to be scheduled
     *
     * @return OK - List of tasks (status code 200)
     *         or Unauthorized (status code 401)
     */
    @ApiOperation(value = "", nickname = "taskWaitingGet", notes = "Returns an Array with all Tasks currently waiting to be scheduled", response = TaskModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK - List of tasks", response = TaskModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorModel.class) })
    @RequestMapping(value = "/task/waiting",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<TaskModel>> taskWaitingGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"maxFailures\" : 0, \"parallelismDegree\" : 5, \"workingDays\" : 1, \"groupId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"priority\" : 80, \"earliestStart\" : \"earliestStart\", \"indexNumber\" : 0, \"typeFlag\" : \"batch\", \"mode\" : \"sequential\", \"latestStart\" : \"latestStart\", \"meta\" : [ { \"value\" : \"value\", \"key\" : \"key\" }, { \"value\" : \"value\", \"key\" : \"key\" } ], \"force\" : true, \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
