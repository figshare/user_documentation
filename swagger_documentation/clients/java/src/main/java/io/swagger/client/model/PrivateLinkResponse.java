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
 * PrivateLinkResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class PrivateLinkResponse {
  @SerializedName("location")
  private String location = null;

  @SerializedName("html_location")
  private String htmlLocation = null;

  @SerializedName("token")
  private String token = null;

  public PrivateLinkResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Url for private link
   * @return location
  **/
  @ApiModelProperty(required = true, value = "Url for private link")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PrivateLinkResponse htmlLocation(String htmlLocation) {
    this.htmlLocation = htmlLocation;
    return this;
  }

   /**
   * HTML url for private link
   * @return htmlLocation
  **/
  @ApiModelProperty(example = "https://figshare.com/s/d5ec7a85bcd6dbe9d9b2", required = true, value = "HTML url for private link")
  public String getHtmlLocation() {
    return htmlLocation;
  }

  public void setHtmlLocation(String htmlLocation) {
    this.htmlLocation = htmlLocation;
  }

  public PrivateLinkResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token for private link
   * @return token
  **/
  @ApiModelProperty(example = "d5ec7a85bcd6dbe9d9b2", required = true, value = "Token for private link")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateLinkResponse privateLinkResponse = (PrivateLinkResponse) o;
    return Objects.equals(this.location, privateLinkResponse.location) &&
        Objects.equals(this.htmlLocation, privateLinkResponse.htmlLocation) &&
        Objects.equals(this.token, privateLinkResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, htmlLocation, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateLinkResponse {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    htmlLocation: ").append(toIndentedString(htmlLocation)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
