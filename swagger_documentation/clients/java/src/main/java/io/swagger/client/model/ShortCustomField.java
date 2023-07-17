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

/**
 * ShortCustomField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ShortCustomField {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Custom field type
   */
  @JsonAdapter(FieldTypeEnum.Adapter.class)
  public enum FieldTypeEnum {
    TEXT("text"),
    
    TEXTAREA("textarea"),
    
    DROPDOWN("dropdown"),
    
    URL("url"),
    
    EMAIL("email"),
    
    DATE("date"),
    
    DROPDOWN_LARGE_LIST("dropdown_large_list");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldTypeEnum fromValue(String text) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("field_type")
  private FieldTypeEnum fieldType = null;

  public ShortCustomField id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Custom field id
   * @return id
  **/
  @ApiModelProperty(example = "365", required = true, value = "Custom field id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShortCustomField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Custom field name
   * @return name
  **/
  @ApiModelProperty(example = "my custom field", required = true, value = "Custom field name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShortCustomField fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Custom field type
   * @return fieldType
  **/
  @ApiModelProperty(example = "textarea", required = true, value = "Custom field type")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortCustomField shortCustomField = (ShortCustomField) o;
    return Objects.equals(this.id, shortCustomField.id) &&
        Objects.equals(this.name, shortCustomField.name) &&
        Objects.equals(this.fieldType, shortCustomField.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fieldType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortCustomField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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
