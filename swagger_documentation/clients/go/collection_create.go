/* 
 * Figshare API
 *
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type CollectionCreate struct {

	// Grant number or funding authority
	Funding string `json:"funding,omitempty"`

	// Funding creation / update items
	FundingList []FundingCreate `json:"funding_list,omitempty"`

	// Title of collection
	Title string `json:"title"`

	// The collection description. In a publisher case, usually this is the remote collection description
	Description string `json:"description,omitempty"`

	// List of articles to be associated with the collection
	Articles []int32 `json:"articles,omitempty"`

	// List of authors to be associated with the collection. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint.
	Authors []interface{} `json:"authors,omitempty"`

	// List of category ids to be associated with the collection(e.g [1, 23, 33, 66])
	Categories []int64 `json:"categories,omitempty"`

	// List of category source ids to be associated with the collection, supersedes the categories property
	CategoriesBySourceId []string `json:"categories_by_source_id,omitempty"`

	// List of tags to be associated with the collection. Keywords can be used instead
	Tags []string `json:"tags,omitempty"`

	// List of tags to be associated with the collection. Tags can be used instead
	Keywords []string `json:"keywords,omitempty"`

	// List of links to be associated with the collection (e.g [\"http://link1\", \"http://link2\", \"http://link3\"])
	References []string `json:"references,omitempty"`

	// List of key, values pairs to be associated with the collection
	CustomFields interface{} `json:"custom_fields,omitempty"`

	// List of custom fields values, supersedes custom_fields parameter
	CustomFieldsList []CustomArticleFieldAdd `json:"custom_fields_list,omitempty"`

	// Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system.
	Doi string `json:"doi,omitempty"`

	// Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system.
	Handle string `json:"handle,omitempty"`

	// Not applicable to regular users. In a publisher case, this is the publisher article id
	ResourceId string `json:"resource_id,omitempty"`

	// Not applicable to regular users. In a publisher case, this is the publisher article DOI.
	ResourceDoi string `json:"resource_doi,omitempty"`

	// Not applicable to regular users. In a publisher case, this is the publisher article link
	ResourceLink string `json:"resource_link,omitempty"`

	// Not applicable to regular users. In a publisher case, this is the publisher article title.
	ResourceTitle string `json:"resource_title,omitempty"`

	// Not applicable to regular users. In a publisher case, this is the publisher article version
	ResourceVersion int32 `json:"resource_version,omitempty"`

	// Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups
	GroupId int64 `json:"group_id,omitempty"`

	// Various timeline dates
	Timeline TimelineUpdate `json:"timeline,omitempty"`
}