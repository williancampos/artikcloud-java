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
 * Export Status Response.
 */
@ApiModel(description = "Export Status Response.")

public class ExportStatusResponse   {
  @SerializedName("expirationDate")
  private Long expirationDate = null;

  @SerializedName("exportId")
  private String exportId = null;

  @SerializedName("md5")
  private String md5 = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("ttl")
  private String ttl = null;

  public ExportStatusResponse expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ExportStatusResponse exportId(String exportId) {
    this.exportId = exportId;
    return this;
  }

   /**
   * Get exportId
   * @return exportId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExportId() {
    return exportId;
  }

  public void setExportId(String exportId) {
    this.exportId = exportId;
  }

  public ExportStatusResponse md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public ExportStatusResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Export status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Export status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ExportStatusResponse ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportStatusResponse exportStatusResponse = (ExportStatusResponse) o;
    return Objects.equals(this.expirationDate, exportStatusResponse.expirationDate) &&
        Objects.equals(this.exportId, exportStatusResponse.exportId) &&
        Objects.equals(this.md5, exportStatusResponse.md5) &&
        Objects.equals(this.status, exportStatusResponse.status) &&
        Objects.equals(this.ttl, exportStatusResponse.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, exportId, md5, status, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportStatusResponse {\n");
    
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

