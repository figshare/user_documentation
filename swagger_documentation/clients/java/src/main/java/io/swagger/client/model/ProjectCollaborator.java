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
 * ProjectCollaborator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ProjectCollaborator {
  @SerializedName("status")
  private String status = null;

  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("name")
  private String name = null;

  public ProjectCollaborator status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of collaborator invitation
   * @return status
  **/
  @ApiModelProperty(example = "invited", required = true, value = "Status of collaborator invitation")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProjectCollaborator roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Collaborator role
   * @return roleName
  **/
  @ApiModelProperty(example = "Owner", required = true, value = "Collaborator role")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ProjectCollaborator userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Collaborator id
   * @return userId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Collaborator id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public ProjectCollaborator name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Collaborator name
   * @return name
  **/
  @ApiModelProperty(example = "name", required = true, value = "Collaborator name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCollaborator projectCollaborator = (ProjectCollaborator) o;
    return Objects.equals(this.status, projectCollaborator.status) &&
        Objects.equals(this.roleName, projectCollaborator.roleName) &&
        Objects.equals(this.userId, projectCollaborator.userId) &&
        Objects.equals(this.name, projectCollaborator.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, roleName, userId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCollaborator {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
