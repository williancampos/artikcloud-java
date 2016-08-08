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
 * Aggregates Histogram Data
 */
@ApiModel(description = "Aggregates Histogram Data")

public class AggregatesHistogramData   {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("max")
  private Float max = null;

  @SerializedName("mean")
  private Float mean = null;

  @SerializedName("min")
  private Float min = null;

  @SerializedName("sum")
  private Float sum = null;

  @SerializedName("ts")
  private Long ts = null;

  @SerializedName("variance")
  private Float variance = null;

  public AggregatesHistogramData count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public AggregatesHistogramData max(Float max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getMax() {
    return max;
  }

  public void setMax(Float max) {
    this.max = max;
  }

  public AggregatesHistogramData mean(Float mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Get mean
   * @return mean
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getMean() {
    return mean;
  }

  public void setMean(Float mean) {
    this.mean = mean;
  }

  public AggregatesHistogramData min(Float min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getMin() {
    return min;
  }

  public void setMin(Float min) {
    this.min = min;
  }

  public AggregatesHistogramData sum(Float sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getSum() {
    return sum;
  }

  public void setSum(Float sum) {
    this.sum = sum;
  }

  public AggregatesHistogramData ts(Long ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public AggregatesHistogramData variance(Float variance) {
    this.variance = variance;
    return this;
  }

   /**
   * Get variance
   * @return variance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getVariance() {
    return variance;
  }

  public void setVariance(Float variance) {
    this.variance = variance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatesHistogramData aggregatesHistogramData = (AggregatesHistogramData) o;
    return Objects.equals(this.count, aggregatesHistogramData.count) &&
        Objects.equals(this.max, aggregatesHistogramData.max) &&
        Objects.equals(this.mean, aggregatesHistogramData.mean) &&
        Objects.equals(this.min, aggregatesHistogramData.min) &&
        Objects.equals(this.sum, aggregatesHistogramData.sum) &&
        Objects.equals(this.ts, aggregatesHistogramData.ts) &&
        Objects.equals(this.variance, aggregatesHistogramData.variance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, max, mean, min, sum, ts, variance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatesHistogramData {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
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

