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
 * Category
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class Category {
  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("source_id")
  private String sourceId = null;

  @SerializedName("taxonomy_id")
  private Long taxonomyId = null;

  public Category parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent category
   * @return parentId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Parent category")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Category id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Category id
   * @return id
  **/
  @ApiModelProperty(example = "11", required = true, value = "Category id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Category title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Category title
   * @return title
  **/
  @ApiModelProperty(example = "Anatomy", required = true, value = "Category title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Category path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path to all ancestor ids
   * @return path
  **/
  @ApiModelProperty(example = "/450/1024/6532", required = true, value = "Path to all ancestor ids")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Category sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * ID in original standard taxonomy
   * @return sourceId
  **/
  @ApiModelProperty(example = "300204", required = true, value = "ID in original standard taxonomy")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Category taxonomyId(Long taxonomyId) {
    this.taxonomyId = taxonomyId;
    return this;
  }

   /**
   * Internal id of taxonomy the category is part of
   * @return taxonomyId
  **/
  @ApiModelProperty(example = "4", required = true, value = "Internal id of taxonomy the category is part of")
  public Long getTaxonomyId() {
    return taxonomyId;
  }

  public void setTaxonomyId(Long taxonomyId) {
    this.taxonomyId = taxonomyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.id, category.id) &&
        Objects.equals(this.title, category.title) &&
        Objects.equals(this.path, category.path) &&
        Objects.equals(this.sourceId, category.sourceId) &&
        Objects.equals(this.taxonomyId, category.taxonomyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, id, title, path, sourceId, taxonomyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    taxonomyId: ").append(toIndentedString(taxonomyId)).append("\n");
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

