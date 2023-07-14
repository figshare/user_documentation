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
 * CollectionPrivateLinkCreator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class CollectionPrivateLinkCreator {
  @SerializedName("expires_date")
  private String expiresDate = null;

  @SerializedName("read_only")
  private Boolean readOnly = null;

  public CollectionPrivateLinkCreator expiresDate(String expiresDate) {
    this.expiresDate = expiresDate;
    return this;
  }

   /**
   * Date when this private link should expire - optional. By default private links expire in 365 days.
   * @return expiresDate
  **/
  @ApiModelProperty(example = "2018-02-22 22:22:22", value = "Date when this private link should expire - optional. By default private links expire in 365 days.")
  public String getExpiresDate() {
    return expiresDate;
  }

  public void setExpiresDate(String expiresDate) {
    this.expiresDate = expiresDate;
  }

  public CollectionPrivateLinkCreator readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional, default true. Set to false to give private link users editing rights for this collection.
   * @return readOnly
  **/
  @ApiModelProperty(example = "true", value = "Optional, default true. Set to false to give private link users editing rights for this collection.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionPrivateLinkCreator collectionPrivateLinkCreator = (CollectionPrivateLinkCreator) o;
    return Objects.equals(this.expiresDate, collectionPrivateLinkCreator.expiresDate) &&
        Objects.equals(this.readOnly, collectionPrivateLinkCreator.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresDate, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionPrivateLinkCreator {\n");
    
    sb.append("    expiresDate: ").append(toIndentedString(expiresDate)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

