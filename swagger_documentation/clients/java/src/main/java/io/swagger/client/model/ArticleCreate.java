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
import io.swagger.client.model.CustomArticleFieldAdd;
import io.swagger.client.model.FundingCreate;
import io.swagger.client.model.TimelineUpdate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ArticleCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-14T12:44:49.389+03:00")
public class ArticleCreate {
  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = "";

  @SerializedName("is_metadata_record")
  private Boolean isMetadataRecord = null;

  @SerializedName("metadata_reason")
  private String metadataReason = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("keywords")
  private List<String> keywords = null;

  @SerializedName("references")
  private List<String> references = null;

  @SerializedName("related_materials")
  private  relatedMaterials = null;

  @SerializedName("categories")
  private List<Long> categories = null;

  @SerializedName("categories_by_source_id")
  private List<String> categoriesBySourceId = null;

  @SerializedName("authors")
  private List<Object> authors = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  @SerializedName("custom_fields_list")
  private List<CustomArticleFieldAdd> customFieldsList = null;

  @SerializedName("defined_type")
  private String definedType = null;

  @SerializedName("funding")
  private String funding = "";

  @SerializedName("funding_list")
  private List<FundingCreate> fundingList = null;

  @SerializedName("license")
  private Long license = 0l;

  @SerializedName("doi")
  private String doi = "";

  @SerializedName("handle")
  private String handle = "";

  @SerializedName("resource_doi")
  private String resourceDoi = "";

  @SerializedName("resource_title")
  private String resourceTitle = "";

  @SerializedName("timeline")
  private TimelineUpdate timeline = null;

  @SerializedName("group_id")
  private Long groupId = null;

  public ArticleCreate title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of article
   * @return title
  **/
  @ApiModelProperty(example = "Test article title", required = true, value = "Title of article")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ArticleCreate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The article description. In a publisher case, usually this is the remote article description
   * @return description
  **/
  @ApiModelProperty(example = "Test description of article", value = "The article description. In a publisher case, usually this is the remote article description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ArticleCreate isMetadataRecord(Boolean isMetadataRecord) {
    this.isMetadataRecord = isMetadataRecord;
    return this;
  }

   /**
   * True if article has no files
   * @return isMetadataRecord
  **/
  @ApiModelProperty(example = "true", value = "True if article has no files")
  public Boolean getIsMetadataRecord() {
    return isMetadataRecord;
  }

  public void setIsMetadataRecord(Boolean isMetadataRecord) {
    this.isMetadataRecord = isMetadataRecord;
  }

  public ArticleCreate metadataReason(String metadataReason) {
    this.metadataReason = metadataReason;
    return this;
  }

   /**
   * Article metadata reason
   * @return metadataReason
  **/
  @ApiModelProperty(example = "hosted somewhere else", value = "Article metadata reason")
  public String getMetadataReason() {
    return metadataReason;
  }

  public void setMetadataReason(String metadataReason) {
    this.metadataReason = metadataReason;
  }

  public ArticleCreate tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ArticleCreate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags to be associated with the article. Keywords can be used instead
   * @return tags
  **/
  @ApiModelProperty(example = "[\"tag1\",\"tag2\"]", value = "List of tags to be associated with the article. Keywords can be used instead")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ArticleCreate keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public ArticleCreate addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * List of tags to be associated with the article. Tags can be used instead
   * @return keywords
  **/
  @ApiModelProperty(example = "[\"tag1\",\"tag2\"]", value = "List of tags to be associated with the article. Tags can be used instead")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public ArticleCreate references(List<String> references) {
    this.references = references;
    return this;
  }

  public ArticleCreate addReferencesItem(String referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<String>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * List of links to be associated with the article (e.g [\&quot;http://link1\&quot;, \&quot;http://link2\&quot;, \&quot;http://link3\&quot;])
   * @return references
  **/
  @ApiModelProperty(example = "[\"http://figshare.com\",\"http://api.figshare.com\"]", value = "List of links to be associated with the article (e.g [\"http://link1\", \"http://link2\", \"http://link3\"])")
  public List<String> getReferences() {
    return references;
  }

  public void setReferences(List<String> references) {
    this.references = references;
  }

  public ArticleCreate relatedMaterials( relatedMaterials) {
    this.relatedMaterials = relatedMaterials;
    return this;
  }

  public ArticleCreate addRelatedMaterialsItem( relatedMaterialsItem) {
    if (this.relatedMaterials == null) {
      this.relatedMaterials = ;
    }
    this.relatedMaterials.add(relatedMaterialsItem);
    return this;
  }

   /**
   * List of related materials; supersedes references.
   * @return relatedMaterials
  **/
  @ApiModelProperty(example = "[{\"id\":10432,\"identifier\":\"10.6084/m9.figshare.1407024\",\"identifier_type\":\"DOI\",\"relation\":\"IsSupplementTo\",\"title\":\"Figshare for institutions brochure\",\"is_linkout\":false}]", value = "List of related materials; supersedes references.")
  public  getRelatedMaterials() {
    return relatedMaterials;
  }

  public void setRelatedMaterials( relatedMaterials) {
    this.relatedMaterials = relatedMaterials;
  }

  public ArticleCreate categories(List<Long> categories) {
    this.categories = categories;
    return this;
  }

  public ArticleCreate addCategoriesItem(Long categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Long>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of category ids to be associated with the article(e.g [1, 23, 33, 66])
   * @return categories
  **/
  @ApiModelProperty(example = "[1,10,11]", value = "List of category ids to be associated with the article(e.g [1, 23, 33, 66])")
  public List<Long> getCategories() {
    return categories;
  }

  public void setCategories(List<Long> categories) {
    this.categories = categories;
  }

  public ArticleCreate categoriesBySourceId(List<String> categoriesBySourceId) {
    this.categoriesBySourceId = categoriesBySourceId;
    return this;
  }

  public ArticleCreate addCategoriesBySourceIdItem(String categoriesBySourceIdItem) {
    if (this.categoriesBySourceId == null) {
      this.categoriesBySourceId = new ArrayList<String>();
    }
    this.categoriesBySourceId.add(categoriesBySourceIdItem);
    return this;
  }

   /**
   * List of category source ids to be associated with the article, supersedes the categories property
   * @return categoriesBySourceId
  **/
  @ApiModelProperty(example = "[\"300204\",\"400207\"]", value = "List of category source ids to be associated with the article, supersedes the categories property")
  public List<String> getCategoriesBySourceId() {
    return categoriesBySourceId;
  }

  public void setCategoriesBySourceId(List<String> categoriesBySourceId) {
    this.categoriesBySourceId = categoriesBySourceId;
  }

  public ArticleCreate authors(List<Object> authors) {
    this.authors = authors;
    return this;
  }

  public ArticleCreate addAuthorsItem(Object authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<Object>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * List of authors to be associated with the article. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint.
   * @return authors
  **/
  @ApiModelProperty(example = "[{\"name\":\"John Doe\"},{\"id\":1000008}]", value = "List of authors to be associated with the article. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint.")
  public List<Object> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Object> authors) {
    this.authors = authors;
  }

  public ArticleCreate customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * List of key, values pairs to be associated with the article
   * @return customFields
  **/
  @ApiModelProperty(example = "{\"defined_key\":\"value for it\"}", value = "List of key, values pairs to be associated with the article")
  public Object getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }

  public ArticleCreate customFieldsList(List<CustomArticleFieldAdd> customFieldsList) {
    this.customFieldsList = customFieldsList;
    return this;
  }

  public ArticleCreate addCustomFieldsListItem(CustomArticleFieldAdd customFieldsListItem) {
    if (this.customFieldsList == null) {
      this.customFieldsList = new ArrayList<CustomArticleFieldAdd>();
    }
    this.customFieldsList.add(customFieldsListItem);
    return this;
  }

   /**
   * List of custom fields values, supersedes custom_fields parameter
   * @return customFieldsList
  **/
  @ApiModelProperty(value = "List of custom fields values, supersedes custom_fields parameter")
  public List<CustomArticleFieldAdd> getCustomFieldsList() {
    return customFieldsList;
  }

  public void setCustomFieldsList(List<CustomArticleFieldAdd> customFieldsList) {
    this.customFieldsList = customFieldsList;
  }

  public ArticleCreate definedType(String definedType) {
    this.definedType = definedType;
    return this;
  }

   /**
   * &lt;b&gt;One of:&lt;/b&gt; &lt;code&gt;figure&lt;/code&gt; &lt;code&gt;online resource&lt;/code&gt; &lt;code&gt;preprint&lt;/code&gt; &lt;code&gt;book&lt;/code&gt; &lt;code&gt;conference contribution&lt;/code&gt; &lt;code&gt;media&lt;/code&gt; &lt;code&gt;dataset&lt;/code&gt; &lt;code&gt;poster&lt;/code&gt; &lt;code&gt;journal contribution&lt;/code&gt; &lt;code&gt;presentation&lt;/code&gt; &lt;code&gt;thesis&lt;/code&gt; &lt;code&gt;software&lt;/code&gt;
   * @return definedType
  **/
  @ApiModelProperty(example = "media", value = "<b>One of:</b> <code>figure</code> <code>online resource</code> <code>preprint</code> <code>book</code> <code>conference contribution</code> <code>media</code> <code>dataset</code> <code>poster</code> <code>journal contribution</code> <code>presentation</code> <code>thesis</code> <code>software</code>")
  public String getDefinedType() {
    return definedType;
  }

  public void setDefinedType(String definedType) {
    this.definedType = definedType;
  }

  public ArticleCreate funding(String funding) {
    this.funding = funding;
    return this;
  }

   /**
   * Grant number or funding authority
   * @return funding
  **/
  @ApiModelProperty(value = "Grant number or funding authority")
  public String getFunding() {
    return funding;
  }

  public void setFunding(String funding) {
    this.funding = funding;
  }

  public ArticleCreate fundingList(List<FundingCreate> fundingList) {
    this.fundingList = fundingList;
    return this;
  }

  public ArticleCreate addFundingListItem(FundingCreate fundingListItem) {
    if (this.fundingList == null) {
      this.fundingList = new ArrayList<FundingCreate>();
    }
    this.fundingList.add(fundingListItem);
    return this;
  }

   /**
   * Funding creation / update items
   * @return fundingList
  **/
  @ApiModelProperty(value = "Funding creation / update items")
  public List<FundingCreate> getFundingList() {
    return fundingList;
  }

  public void setFundingList(List<FundingCreate> fundingList) {
    this.fundingList = fundingList;
  }

  public ArticleCreate license(Long license) {
    this.license = license;
    return this;
  }

   /**
   * License id for this article.
   * @return license
  **/
  @ApiModelProperty(example = "1", value = "License id for this article.")
  public Long getLicense() {
    return license;
  }

  public void setLicense(Long license) {
    this.license = license;
  }

  public ArticleCreate doi(String doi) {
    this.doi = doi;
    return this;
  }

   /**
   * Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system.
   * @return doi
  **/
  @ApiModelProperty(value = "Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system.")
  public String getDoi() {
    return doi;
  }

  public void setDoi(String doi) {
    this.doi = doi;
  }

  public ArticleCreate handle(String handle) {
    this.handle = handle;
    return this;
  }

   /**
   * Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system.
   * @return handle
  **/
  @ApiModelProperty(value = "Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system.")
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public ArticleCreate resourceDoi(String resourceDoi) {
    this.resourceDoi = resourceDoi;
    return this;
  }

   /**
   * Not applicable to regular users. In a publisher case, this is the publisher article DOI.
   * @return resourceDoi
  **/
  @ApiModelProperty(value = "Not applicable to regular users. In a publisher case, this is the publisher article DOI.")
  public String getResourceDoi() {
    return resourceDoi;
  }

  public void setResourceDoi(String resourceDoi) {
    this.resourceDoi = resourceDoi;
  }

  public ArticleCreate resourceTitle(String resourceTitle) {
    this.resourceTitle = resourceTitle;
    return this;
  }

   /**
   * Not applicable to regular users. In a publisher case, this is the publisher article title.
   * @return resourceTitle
  **/
  @ApiModelProperty(value = "Not applicable to regular users. In a publisher case, this is the publisher article title.")
  public String getResourceTitle() {
    return resourceTitle;
  }

  public void setResourceTitle(String resourceTitle) {
    this.resourceTitle = resourceTitle;
  }

  public ArticleCreate timeline(TimelineUpdate timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Various timeline dates
   * @return timeline
  **/
  @ApiModelProperty(value = "Various timeline dates")
  public TimelineUpdate getTimeline() {
    return timeline;
  }

  public void setTimeline(TimelineUpdate timeline) {
    this.timeline = timeline;
  }

  public ArticleCreate groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups
   * @return groupId
  **/
  @ApiModelProperty(value = "Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups")
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
    ArticleCreate articleCreate = (ArticleCreate) o;
    return Objects.equals(this.title, articleCreate.title) &&
        Objects.equals(this.description, articleCreate.description) &&
        Objects.equals(this.isMetadataRecord, articleCreate.isMetadataRecord) &&
        Objects.equals(this.metadataReason, articleCreate.metadataReason) &&
        Objects.equals(this.tags, articleCreate.tags) &&
        Objects.equals(this.keywords, articleCreate.keywords) &&
        Objects.equals(this.references, articleCreate.references) &&
        Objects.equals(this.relatedMaterials, articleCreate.relatedMaterials) &&
        Objects.equals(this.categories, articleCreate.categories) &&
        Objects.equals(this.categoriesBySourceId, articleCreate.categoriesBySourceId) &&
        Objects.equals(this.authors, articleCreate.authors) &&
        Objects.equals(this.customFields, articleCreate.customFields) &&
        Objects.equals(this.customFieldsList, articleCreate.customFieldsList) &&
        Objects.equals(this.definedType, articleCreate.definedType) &&
        Objects.equals(this.funding, articleCreate.funding) &&
        Objects.equals(this.fundingList, articleCreate.fundingList) &&
        Objects.equals(this.license, articleCreate.license) &&
        Objects.equals(this.doi, articleCreate.doi) &&
        Objects.equals(this.handle, articleCreate.handle) &&
        Objects.equals(this.resourceDoi, articleCreate.resourceDoi) &&
        Objects.equals(this.resourceTitle, articleCreate.resourceTitle) &&
        Objects.equals(this.timeline, articleCreate.timeline) &&
        Objects.equals(this.groupId, articleCreate.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, isMetadataRecord, metadataReason, tags, keywords, references, relatedMaterials, categories, categoriesBySourceId, authors, customFields, customFieldsList, definedType, funding, fundingList, license, doi, handle, resourceDoi, resourceTitle, timeline, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleCreate {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isMetadataRecord: ").append(toIndentedString(isMetadataRecord)).append("\n");
    sb.append("    metadataReason: ").append(toIndentedString(metadataReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    relatedMaterials: ").append(toIndentedString(relatedMaterials)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    categoriesBySourceId: ").append(toIndentedString(categoriesBySourceId)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customFieldsList: ").append(toIndentedString(customFieldsList)).append("\n");
    sb.append("    definedType: ").append(toIndentedString(definedType)).append("\n");
    sb.append("    funding: ").append(toIndentedString(funding)).append("\n");
    sb.append("    fundingList: ").append(toIndentedString(fundingList)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    doi: ").append(toIndentedString(doi)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    resourceDoi: ").append(toIndentedString(resourceDoi)).append("\n");
    sb.append("    resourceTitle: ").append(toIndentedString(resourceTitle)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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

