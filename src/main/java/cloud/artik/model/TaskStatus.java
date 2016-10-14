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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 
 */
@ApiModel(description = "")

public class TaskStatus   {
  @SerializedName("numAttempts")
  private Integer numAttempts = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("did")
  private String did = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("ts")
  private Long ts = null;

  public TaskStatus numAttempts(Integer numAttempts) {
    this.numAttempts = numAttempts;
    return this;
  }

   /**
   * Number of attempts
   * @return numAttempts
  **/
  @ApiModelProperty(example = "null", value = "Number of attempts")
  public Integer getNumAttempts() {
    return numAttempts;
  }

  public void setNumAttempts(Integer numAttempts) {
    this.numAttempts = numAttempts;
  }

  public TaskStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error Message
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "Error Message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TaskStatus errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error Code
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "Error Code")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public TaskStatus did(String did) {
    this.did = did;
    return this;
  }

   /**
   * Device ID
   * @return did
  **/
  @ApiModelProperty(example = "null", value = "Device ID")
  public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public TaskStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TaskStatus ts(Long ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Timestamp of most recent status change
   * @return ts
  **/
  @ApiModelProperty(example = "null", value = "Timestamp of most recent status change")
  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatus taskStatus = (TaskStatus) o;
    return Objects.equals(this.numAttempts, taskStatus.numAttempts) &&
        Objects.equals(this.errorMessage, taskStatus.errorMessage) &&
        Objects.equals(this.errorCode, taskStatus.errorCode) &&
        Objects.equals(this.did, taskStatus.did) &&
        Objects.equals(this.status, taskStatus.status) &&
        Objects.equals(this.ts, taskStatus.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numAttempts, errorMessage, errorCode, did, status, ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatus {\n");
    
    sb.append("    numAttempts: ").append(toIndentedString(numAttempts)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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

