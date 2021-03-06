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
import cloud.artik.model.NormalizedMessage;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Normalized Messages Envelope
 */
@ApiModel(description = "Normalized Messages Envelope")

public class NormalizedMessagesEnvelope   {
  @SerializedName("sdids")
  private String sdids = null;

  @SerializedName("sdid")
  private String sdid = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("endDate")
  private Long endDate = null;

  @SerializedName("order")
  private String order = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("data")
  private List<NormalizedMessage> data = new ArrayList<NormalizedMessage>();

  public NormalizedMessagesEnvelope sdids(String sdids) {
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

  public NormalizedMessagesEnvelope sdid(String sdid) {
    this.sdid = sdid;
    return this;
  }

   /**
   * Get sdid
   * @return sdid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSdid() {
    return sdid;
  }

  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  public NormalizedMessagesEnvelope uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public NormalizedMessagesEnvelope startDate(Long startDate) {
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

  public NormalizedMessagesEnvelope endDate(Long endDate) {
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

  public NormalizedMessagesEnvelope order(String order) {
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

  public NormalizedMessagesEnvelope next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public NormalizedMessagesEnvelope count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public NormalizedMessagesEnvelope size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public NormalizedMessagesEnvelope data(List<NormalizedMessage> data) {
    this.data = data;
    return this;
  }

  public NormalizedMessagesEnvelope addDataItem(NormalizedMessage dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<NormalizedMessage> getData() {
    return data;
  }

  public void setData(List<NormalizedMessage> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedMessagesEnvelope normalizedMessagesEnvelope = (NormalizedMessagesEnvelope) o;
    return Objects.equals(this.sdids, normalizedMessagesEnvelope.sdids) &&
        Objects.equals(this.sdid, normalizedMessagesEnvelope.sdid) &&
        Objects.equals(this.uid, normalizedMessagesEnvelope.uid) &&
        Objects.equals(this.startDate, normalizedMessagesEnvelope.startDate) &&
        Objects.equals(this.endDate, normalizedMessagesEnvelope.endDate) &&
        Objects.equals(this.order, normalizedMessagesEnvelope.order) &&
        Objects.equals(this.next, normalizedMessagesEnvelope.next) &&
        Objects.equals(this.count, normalizedMessagesEnvelope.count) &&
        Objects.equals(this.size, normalizedMessagesEnvelope.size) &&
        Objects.equals(this.data, normalizedMessagesEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdids, sdid, uid, startDate, endDate, order, next, count, size, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedMessagesEnvelope {\n");
    
    sb.append("    sdids: ").append(toIndentedString(sdids)).append("\n");
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

