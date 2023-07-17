/*
 * Figshare API
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ArticleEmbargoUpdater
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ArticleEmbargoUpdater {
  @SerializedName("is_embargoed")
  private Boolean isEmbargoed = null;

  @SerializedName("embargo_date")
  private String embargoDate = null;

  /**
   * Embargo can be enabled at the article or the file level. Possible values: article, file
   */
  @JsonAdapter(EmbargoTypeEnum.Adapter.class)
  public enum EmbargoTypeEnum {
    ARTICLE("article"),
    
    FILE("file");

    private String value;

    EmbargoTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmbargoTypeEnum fromValue(String text) {
      for (EmbargoTypeEnum b : EmbargoTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmbargoTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmbargoTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmbargoTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EmbargoTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("embargo_type")
  private EmbargoTypeEnum embargoType = null;

  @SerializedName("embargo_title")
  private String embargoTitle = null;

  @SerializedName("embargo_reason")
  private String embargoReason = null;

  @SerializedName("embargo_options")
  private List<Object> embargoOptions = null;

  public ArticleEmbargoUpdater isEmbargoed(Boolean isEmbargoed) {
    this.isEmbargoed = isEmbargoed;
    return this;
  }

   /**
   * Embargo status
   * @return isEmbargoed
  **/
  @ApiModelProperty(example = "true", required = true, value = "Embargo status")
  public Boolean getIsEmbargoed() {
    return isEmbargoed;
  }

  public void setIsEmbargoed(Boolean isEmbargoed) {
    this.isEmbargoed = isEmbargoed;
  }

  public ArticleEmbargoUpdater embargoDate(String embargoDate) {
    this.embargoDate = embargoDate;
    return this;
  }

   /**
   * Date when the embargo expires and the article gets published, &#39;0&#39; value will set up permanent embargo
   * @return embargoDate
  **/
  @ApiModelProperty(example = "2018-05-22T04:04:04", required = true, value = "Date when the embargo expires and the article gets published, '0' value will set up permanent embargo")
  public String getEmbargoDate() {
    return embargoDate;
  }

  public void setEmbargoDate(String embargoDate) {
    this.embargoDate = embargoDate;
  }

  public ArticleEmbargoUpdater embargoType(EmbargoTypeEnum embargoType) {
    this.embargoType = embargoType;
    return this;
  }

   /**
   * Embargo can be enabled at the article or the file level. Possible values: article, file
   * @return embargoType
  **/
  @ApiModelProperty(example = "file", required = true, value = "Embargo can be enabled at the article or the file level. Possible values: article, file")
  public EmbargoTypeEnum getEmbargoType() {
    return embargoType;
  }

  public void setEmbargoType(EmbargoTypeEnum embargoType) {
    this.embargoType = embargoType;
  }

  public ArticleEmbargoUpdater embargoTitle(String embargoTitle) {
    this.embargoTitle = embargoTitle;
    return this;
  }

   /**
   * Title for embargo
   * @return embargoTitle
  **/
  @ApiModelProperty(example = "File(s) under embargo", value = "Title for embargo")
  public String getEmbargoTitle() {
    return embargoTitle;
  }

  public void setEmbargoTitle(String embargoTitle) {
    this.embargoTitle = embargoTitle;
  }

  public ArticleEmbargoUpdater embargoReason(String embargoReason) {
    this.embargoReason = embargoReason;
    return this;
  }

   /**
   * Reason for setting embargo
   * @return embargoReason
  **/
  @ApiModelProperty(example = "", value = "Reason for setting embargo")
  public String getEmbargoReason() {
    return embargoReason;
  }

  public void setEmbargoReason(String embargoReason) {
    this.embargoReason = embargoReason;
  }

  public ArticleEmbargoUpdater embargoOptions(List<Object> embargoOptions) {
    this.embargoOptions = embargoOptions;
    return this;
  }

  public ArticleEmbargoUpdater addEmbargoOptionsItem(Object embargoOptionsItem) {
    if (this.embargoOptions == null) {
      this.embargoOptions = new ArrayList<Object>();
    }
    this.embargoOptions.add(embargoOptionsItem);
    return this;
  }

   /**
   * List of embargo permissions to be associated with the article. The list must contain &#x60;id&#x60; and can also contain &#x60;group_ids&#x60;(a field that only applies to &#39;logged_in&#39; permissions). The new list replaces old options in the database, and an empty list removes all permissions for this article. Administration permission has to be set up alone but logged in and IP range permissions can be set up together.
   * @return embargoOptions
  **/
  @ApiModelProperty(example = "[{\"id\":1321},{\"id\":3345},{\"id\":54621,\"group_ids\":[4332,5433,678]}]", value = "List of embargo permissions to be associated with the article. The list must contain `id` and can also contain `group_ids`(a field that only applies to 'logged_in' permissions). The new list replaces old options in the database, and an empty list removes all permissions for this article. Administration permission has to be set up alone but logged in and IP range permissions can be set up together.")
  public List<Object> getEmbargoOptions() {
    return embargoOptions;
  }

  public void setEmbargoOptions(List<Object> embargoOptions) {
    this.embargoOptions = embargoOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleEmbargoUpdater articleEmbargoUpdater = (ArticleEmbargoUpdater) o;
    return Objects.equals(this.isEmbargoed, articleEmbargoUpdater.isEmbargoed) &&
        Objects.equals(this.embargoDate, articleEmbargoUpdater.embargoDate) &&
        Objects.equals(this.embargoType, articleEmbargoUpdater.embargoType) &&
        Objects.equals(this.embargoTitle, articleEmbargoUpdater.embargoTitle) &&
        Objects.equals(this.embargoReason, articleEmbargoUpdater.embargoReason) &&
        Objects.equals(this.embargoOptions, articleEmbargoUpdater.embargoOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEmbargoed, embargoDate, embargoType, embargoTitle, embargoReason, embargoOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleEmbargoUpdater {\n");
    
    sb.append("    isEmbargoed: ").append(toIndentedString(isEmbargoed)).append("\n");
    sb.append("    embargoDate: ").append(toIndentedString(embargoDate)).append("\n");
    sb.append("    embargoType: ").append(toIndentedString(embargoType)).append("\n");
    sb.append("    embargoTitle: ").append(toIndentedString(embargoTitle)).append("\n");
    sb.append("    embargoReason: ").append(toIndentedString(embargoReason)).append("\n");
    sb.append("    embargoOptions: ").append(toIndentedString(embargoOptions)).append("\n");
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
