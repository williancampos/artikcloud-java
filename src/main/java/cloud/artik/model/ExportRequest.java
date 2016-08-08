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
 * Export Request.
 */
@ApiModel(description = "Export Request.")

public class ExportRequest   {
  @SerializedName("endDate")
  private Long endDate = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("sdids")
  private String sdids = null;

  @SerializedName("sdtids")
  private String sdtids = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("trialId")
  private String trialId = null;

  @SerializedName("uids")
  private String uids = null;

  public ExportRequest endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ExportRequest format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public ExportRequest order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ExportRequest sdids(String sdids) {
    this.sdids = sdids;
    return this;
  }

   /**
   * Get sdids
   * @return sdids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdids() {
    return sdids;
  }

  public void setSdids(String sdids) {
    this.sdids = sdids;
  }

  public ExportRequest sdtids(String sdtids) {
    this.sdtids = sdtids;
    return this;
  }

   /**
   * Get sdtids
   * @return sdtids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdtids() {
    return sdtids;
  }

  public void setSdtids(String sdtids) {
    this.sdtids = sdtids;
  }

  public ExportRequest startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ExportRequest trialId(String trialId) {
    this.trialId = trialId;
    return this;
  }

   /**
   * Get trialId
   * @return trialId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTrialId() {
    return trialId;
  }

  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  public ExportRequest uids(String uids) {
    this.uids = uids;
    return this;
  }

   /**
   * Get uids
   * @return uids
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUids() {
    return uids;
  }

  public void setUids(String uids) {
    this.uids = uids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportRequest exportRequest = (ExportRequest) o;
    return Objects.equals(this.endDate, exportRequest.endDate) &&
        Objects.equals(this.format, exportRequest.format) &&
        Objects.equals(this.order, exportRequest.order) &&
        Objects.equals(this.sdids, exportRequest.sdids) &&
        Objects.equals(this.sdtids, exportRequest.sdtids) &&
        Objects.equals(this.startDate, exportRequest.startDate) &&
        Objects.equals(this.trialId, exportRequest.trialId) &&
        Objects.equals(this.uids, exportRequest.uids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, format, order, sdids, sdtids, startDate, trialId, uids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRequest {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    sdtids: ").append(toIndentedString(sdtids)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    uids: ").append(toIndentedString(uids)).append("\n");
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

