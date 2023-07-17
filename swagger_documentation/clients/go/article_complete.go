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

type ArticleComplete struct {

	// Unique identifier for article
	Id int64 `json:"id"`

	// Title of article
	Title string `json:"title"`

	// DOI
	Doi string `json:"doi"`

	// Handle
	Handle string `json:"handle"`

	// Api endpoint for article
	Url string `json:"url"`

	// Public site endpoint for article
	UrlPublicHtml string `json:"url_public_html"`

	// Public Api endpoint for article
	UrlPublicApi string `json:"url_public_api"`

	// Private site endpoint for article
	UrlPrivateHtml string `json:"url_private_html"`

	// Private Api endpoint for article
	UrlPrivateApi string `json:"url_private_api"`

	// Various timeline dates
	Timeline Timeline `json:"timeline"`

	// Thumbnail image
	Thumb string `json:"thumb"`

	// Type of article identifier
	DefinedType int64 `json:"defined_type"`

	// Name of the article type identifier
	DefinedTypeName string `json:"defined_type_name"`
}