package com.honeybadgers.taskapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.honeybadgers.taskapi.models.TaskModelMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-28T20:31:15.167+02:00[Europe/Berlin]")

public class TaskModel   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("group_id")
  private String groupId;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("active_times")
  @Valid
  private List<Object> activeTimes = null;

  @JsonProperty("working_days")
  @Valid
  private List<Boolean> workingDays = null;

  /**
   * Type of this task (relevant for scheduling)
   */
  public enum TypeFlagEnum {
    BATCH("batch"),
    
    REALTIME("realtime");

    private String value;

    TypeFlagEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeFlagEnum fromValue(String value) {
      for (TypeFlagEnum b : TypeFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type_flag")
  private TypeFlagEnum typeFlag = TypeFlagEnum.BATCH;

  /**
   * Mode of task
   */
  public enum ModeEnum {
    SEQUENTIAL("sequential"),
    
    PARALLEL("parallel");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = ModeEnum.PARALLEL;

  @JsonProperty("retries")
  private Integer retries = 0;

  @JsonProperty("paused")
  private Boolean paused = false;

  @JsonProperty("force")
  private Boolean force = false;

  @JsonProperty("index_number")
  private Integer indexNumber;

  @JsonProperty("parallelism_degree")
  private Integer parallelismDegree;

  @JsonProperty("meta")
  @Valid
  private List<TaskModelMeta> meta = null;

  public TaskModel id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Primary id of task object
   * @return id
  */
  @ApiModelProperty(required = true, value = "Primary id of task object")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TaskModel groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Id of group this task is assigned to
   * @return groupId
  */
  @ApiModelProperty(required = true, value = "Id of group this task is assigned to")
  @NotNull

@Size(max=128) 
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public TaskModel priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority of this task for scheduling
   * minimum: 0
   * maximum: 999
   * @return priority
  */
  @ApiModelProperty(value = "Priority of this task for scheduling")

@Min(0) @Max(999) 
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TaskModel activeTimes(List<Object> activeTimes) {
    this.activeTimes = activeTimes;
    return this;
  }

  public TaskModel addActiveTimesItem(Object activeTimesItem) {
    if (this.activeTimes == null) {
      this.activeTimes = new ArrayList<>();
    }
    this.activeTimes.add(activeTimesItem);
    return this;
  }

  /**
   * Array containing time frames, in which tasks are allowed to be dispatched
   * @return activeTimes
  */
  @ApiModelProperty(value = "Array containing time frames, in which tasks are allowed to be dispatched")


  public List<Object> getActiveTimes() {
    return activeTimes;
  }

  public void setActiveTimes(List<Object> activeTimes) {
    this.activeTimes = activeTimes;
  }

  public TaskModel workingDays(List<Boolean> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public TaskModel addWorkingDaysItem(Boolean workingDaysItem) {
    if (this.workingDays == null) {
      this.workingDays = new ArrayList<>();
    }
    this.workingDays.add(workingDaysItem);
    return this;
  }

  /**
   * Boolean array, where each entry indicates, whereas tasks are allowed to be dispatched on that day (Starting with monday)
   * @return workingDays
  */
  @ApiModelProperty(value = "Boolean array, where each entry indicates, whereas tasks are allowed to be dispatched on that day (Starting with monday)")

@Size(min=7,max=7) 
  public List<Boolean> getWorkingDays() {
    return workingDays;
  }

  public void setWorkingDays(List<Boolean> workingDays) {
    this.workingDays = workingDays;
  }

  public TaskModel typeFlag(TypeFlagEnum typeFlag) {
    this.typeFlag = typeFlag;
    return this;
  }

  /**
   * Type of this task (relevant for scheduling)
   * @return typeFlag
  */
  @ApiModelProperty(value = "Type of this task (relevant for scheduling)")


  public TypeFlagEnum getTypeFlag() {
    return typeFlag;
  }

  public void setTypeFlag(TypeFlagEnum typeFlag) {
    this.typeFlag = typeFlag;
  }

  public TaskModel mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Mode of task
   * @return mode
  */
  @ApiModelProperty(value = "Mode of task")


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public TaskModel retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Number of times, this task has been retried
   * minimum: 0
   * @return retries
  */
  @ApiModelProperty(value = "Number of times, this task has been retried")

@Min(0)
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public TaskModel paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * Boolean, which identifies, whereas this group (and all of its tasks) are currently paused
   * @return paused
  */
  @ApiModelProperty(value = "Boolean, which identifies, whereas this group (and all of its tasks) are currently paused")


  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public TaskModel force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * If set to true: send task directly to dispatcher without scheduling
   * @return force
  */
  @ApiModelProperty(value = "If set to true: send task directly to dispatcher without scheduling")


  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  public TaskModel indexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
    return this;
  }

  /**
   * [only with mode = sequential] Index number of task in corresponding sequence
   * minimum: 1
   * @return indexNumber
  */
  @ApiModelProperty(value = "[only with mode = sequential] Index number of task in corresponding sequence")

@Min(1)
  public Integer getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
  }

  public TaskModel parallelismDegree(Integer parallelismDegree) {
    this.parallelismDegree = parallelismDegree;
    return this;
  }

  /**
   * [only with mode = parallel] Number of tasks allowed to be executed at the same time
   * minimum: 1
   * @return parallelismDegree
  */
  @ApiModelProperty(value = "[only with mode = parallel] Number of tasks allowed to be executed at the same time")

@Min(1)
  public Integer getParallelismDegree() {
    return parallelismDegree;
  }

  public void setParallelismDegree(Integer parallelismDegree) {
    this.parallelismDegree = parallelismDegree;
  }

  public TaskModel meta(List<TaskModelMeta> meta) {
    this.meta = meta;
    return this;
  }

  public TaskModel addMetaItem(TaskModelMeta metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<>();
    }
    this.meta.add(metaItem);
    return this;
  }

  /**
   * Key-value object for meta-data
   * @return meta
  */
  @ApiModelProperty(value = "Key-value object for meta-data")

  @Valid

  public List<TaskModelMeta> getMeta() {
    return meta;
  }

  public void setMeta(List<TaskModelMeta> meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskModel taskModel = (TaskModel) o;
    return Objects.equals(this.id, taskModel.id) &&
        Objects.equals(this.groupId, taskModel.groupId) &&
        Objects.equals(this.priority, taskModel.priority) &&
        Objects.equals(this.activeTimes, taskModel.activeTimes) &&
        Objects.equals(this.workingDays, taskModel.workingDays) &&
        Objects.equals(this.typeFlag, taskModel.typeFlag) &&
        Objects.equals(this.mode, taskModel.mode) &&
        Objects.equals(this.retries, taskModel.retries) &&
        Objects.equals(this.paused, taskModel.paused) &&
        Objects.equals(this.force, taskModel.force) &&
        Objects.equals(this.indexNumber, taskModel.indexNumber) &&
        Objects.equals(this.parallelismDegree, taskModel.parallelismDegree) &&
        Objects.equals(this.meta, taskModel.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, priority, activeTimes, workingDays, typeFlag, mode, retries, paused, force, indexNumber, parallelismDegree, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    activeTimes: ").append(toIndentedString(activeTimes)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    typeFlag: ").append(toIndentedString(typeFlag)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    parallelismDegree: ").append(toIndentedString(parallelismDegree)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

