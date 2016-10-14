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

public class DeviceTypesInfo   {
  @SerializedName("devicePropertiesEnabled")
  private Boolean devicePropertiesEnabled = null;

  @SerializedName("pMax")
  private Integer pMax = null;

  @SerializedName("modifiedOn")
  private Long modifiedOn = null;

  @SerializedName("dtid")
  private String dtid = null;

  @SerializedName("pMin")
  private Integer pMin = null;

  @SerializedName("taskExpiresAfter")
  private Integer taskExpiresAfter = null;

  @SerializedName("createdOn")
  private Long createdOn = null;

  public DeviceTypesInfo devicePropertiesEnabled(Boolean devicePropertiesEnabled) {
    this.devicePropertiesEnabled = devicePropertiesEnabled;
    return this;
  }

   /**
   * Device Properties Enabled
   * @return devicePropertiesEnabled
  **/
  @ApiModelProperty(example = "null", value = "Device Properties Enabled")
  public Boolean getDevicePropertiesEnabled() {
    return devicePropertiesEnabled;
  }

  public void setDevicePropertiesEnabled(Boolean devicePropertiesEnabled) {
    this.devicePropertiesEnabled = devicePropertiesEnabled;
  }

  public DeviceTypesInfo pMax(Integer pMax) {
    this.pMax = pMax;
    return this;
  }

   /**
   * Pmax value
   * @return pMax
  **/
  @ApiModelProperty(example = "null", value = "Pmax value")
  public Integer getPMax() {
    return pMax;
  }

  public void setPMax(Integer pMax) {
    this.pMax = pMax;
  }

  public DeviceTypesInfo modifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Modified on
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "Modified on")
  public Long getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Long modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public DeviceTypesInfo dtid(String dtid) {
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

  public DeviceTypesInfo pMin(Integer pMin) {
    this.pMin = pMin;
    return this;
  }

   /**
   * Pmin value
   * @return pMin
  **/
  @ApiModelProperty(example = "null", value = "Pmin value")
  public Integer getPMin() {
    return pMin;
  }

  public void setPMin(Integer pMin) {
    this.pMin = pMin;
  }

  public DeviceTypesInfo taskExpiresAfter(Integer taskExpiresAfter) {
    this.taskExpiresAfter = taskExpiresAfter;
    return this;
  }

   /**
   * Default task expiration time in seconds
   * @return taskExpiresAfter
  **/
  @ApiModelProperty(example = "null", value = "Default task expiration time in seconds")
  public Integer getTaskExpiresAfter() {
    return taskExpiresAfter;
  }

  public void setTaskExpiresAfter(Integer taskExpiresAfter) {
    this.taskExpiresAfter = taskExpiresAfter;
  }

  public DeviceTypesInfo createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Created on
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "Created on")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTypesInfo deviceTypesInfo = (DeviceTypesInfo) o;
    return Objects.equals(this.devicePropertiesEnabled, deviceTypesInfo.devicePropertiesEnabled) &&
        Objects.equals(this.pMax, deviceTypesInfo.pMax) &&
        Objects.equals(this.modifiedOn, deviceTypesInfo.modifiedOn) &&
        Objects.equals(this.dtid, deviceTypesInfo.dtid) &&
        Objects.equals(this.pMin, deviceTypesInfo.pMin) &&
        Objects.equals(this.taskExpiresAfter, deviceTypesInfo.taskExpiresAfter) &&
        Objects.equals(this.createdOn, deviceTypesInfo.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePropertiesEnabled, pMax, modifiedOn, dtid, pMin, taskExpiresAfter, createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTypesInfo {\n");
    
    sb.append("    devicePropertiesEnabled: ").append(toIndentedString(devicePropertiesEnabled)).append("\n");
    sb.append("    pMax: ").append(toIndentedString(pMax)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    dtid: ").append(toIndentedString(dtid)).append("\n");
    sb.append("    pMin: ").append(toIndentedString(pMin)).append("\n");
    sb.append("    taskExpiresAfter: ").append(toIndentedString(taskExpiresAfter)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

