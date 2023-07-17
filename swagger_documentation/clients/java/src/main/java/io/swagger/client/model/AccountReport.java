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
 * AccountReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class AccountReport {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("created_date")
  private String createdDate = null;

  /**
   * Status of the report
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    MISSING("missing"),
    
    PENDING("pending"),
    
    DONE("done");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("download_url")
  private String downloadUrl = null;

  @SerializedName("group_id")
  private Long groupId = null;

  public AccountReport id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * A unique ID for the AccountRecord
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique ID for the AccountRecord")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AccountReport accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account which generated this report.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account which generated this report.")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountReport createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when the AccountReport was requested
   * @return createdDate
  **/
  @ApiModelProperty(example = "2017-05-15T15:12:26Z", required = true, value = "Date when the AccountReport was requested")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public AccountReport status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the report
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the report")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountReport downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * The download link for the generated XLSX
   * @return downloadUrl
  **/
  @ApiModelProperty(example = "https://some.com/storage/path/123/report-456.xlsx", required = true, value = "The download link for the generated XLSX")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AccountReport groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group ID that was used to filter the report, if any.
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "The group ID that was used to filter the report, if any.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountReport accountReport = (AccountReport) o;
    return Objects.equals(this.id, accountReport.id) &&
        Objects.equals(this.accountId, accountReport.accountId) &&
        Objects.equals(this.createdDate, accountReport.createdDate) &&
        Objects.equals(this.status, accountReport.status) &&
        Objects.equals(this.downloadUrl, accountReport.downloadUrl) &&
        Objects.equals(this.groupId, accountReport.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, createdDate, status, downloadUrl, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
