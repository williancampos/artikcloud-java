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
 * Acknowledgement received by a WebSocket in response to a RegisterMessage, MessageIn or ActionIn.
 */
@ApiModel(description = "Acknowledgement received by a WebSocket in response to a RegisterMessage, MessageIn or ActionIn.")

public class Acknowledgement   {
  @SerializedName("mid")
  private String mid = null;

  @SerializedName("cid")
  private String cid = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("code")
  private String code = null;

  public Acknowledgement mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Message ID.
   * @return mid
  **/
  @ApiModelProperty(example = "null", value = "Message ID.")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public Acknowledgement cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Confirmation ID.
   * @return cid
  **/
  @ApiModelProperty(example = "null", value = "Confirmation ID.")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public Acknowledgement message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message.
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "Message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Acknowledgement code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acknowledgement acknowledgement = (Acknowledgement) o;
    return Objects.equals(this.mid, acknowledgement.mid) &&
        Objects.equals(this.cid, acknowledgement.cid) &&
        Objects.equals(this.message, acknowledgement.message) &&
        Objects.equals(this.code, acknowledgement.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid, cid, message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acknowledgement {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

