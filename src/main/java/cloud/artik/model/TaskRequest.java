/**
 * ARTIK Cloud API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.TaskParameters;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 
 */
@ApiModel(description = "")

public class TaskRequest   {
  @SerializedName("filter")
  private String filter = null;

  @SerializedName("taskType")
  private String taskType = null;

  @SerializedName("dtid")
  private String dtid = null;

  @SerializedName("property")
  private String property = null;

  @SerializedName("dids")
  private String dids = null;

  @SerializedName("taskParameters")
  private TaskParameters taskParameters = null;

  public TaskRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "Filter")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public TaskRequest taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Task type
   * @return taskType
  **/
  @ApiModelProperty(example = "null", value = "Task type")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public TaskRequest dtid(String dtid) {
    this.dtid = dtid;
    return this;
  }

   /**
   * Device Type ID
   * @return dtid
  **/
  @ApiModelProperty(example = "null", value = "Device Type ID")
  public String getDtid() {
    return dtid;
  }

  public void setDtid(String dtid) {
    this.dtid = dtid;
  }

  public TaskRequest property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Property
   * @return property
  **/
  @ApiModelProperty(example = "null", value = "Property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public TaskRequest dids(String dids) {
    this.dids = dids;
    return this;
  }

   /**
   * Device IDs
   * @return dids
  **/
  @ApiModelProperty(example = "null", value = "Device IDs")
  public String getDids() {
    return dids;
  }

  public void setDids(String dids) {
    this.dids = dids;
  }

  public TaskRequest taskParameters(TaskParameters taskParameters) {
    this.taskParameters = taskParameters;
    return this;
  }

   /**
   * Task parameters
   * @return taskParameters
  **/
  @ApiModelProperty(example = "null", value = "Task parameters")
  public TaskParameters getTaskParameters() {
    return taskParameters;
  }

  public void setTaskParameters(TaskParameters taskParameters) {
    this.taskParameters = taskParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskRequest taskRequest = (TaskRequest) o;
    return Objects.equals(this.filter, taskRequest.filter) &&
        Objects.equals(this.taskType, taskRequest.taskType) &&
        Objects.equals(this.dtid, taskRequest.dtid) &&
        Objects.equals(this.property, taskRequest.property) &&
        Objects.equals(this.dids, taskRequest.dids) &&
        Objects.equals(this.taskParameters, taskRequest.taskParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, taskType, dtid, property, dids, taskParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRequest {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    dids: ").append(toIndentedString(dids)).append("\n");
    sb.append("    taskParameters: ").append(toIndentedString(taskParameters)).append("\n");
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

