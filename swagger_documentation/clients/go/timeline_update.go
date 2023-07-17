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

type TimelineUpdate struct {

	// Online posted date
	FirstOnline string `json:"firstOnline,omitempty"`

	// Publish date
	PublisherPublication string `json:"publisherPublication,omitempty"`

	// Date when the item was accepted for publication
	PublisherAcceptance string `json:"publisherAcceptance,omitempty"`
}