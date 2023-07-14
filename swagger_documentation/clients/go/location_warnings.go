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

type LocationWarnings struct {

	// Figshare ID of the entity
	EntityId int64 `json:"entity_id"`

	// Url for entity
	Location string `json:"location"`

	// Issues encountered during the operation
	Warnings []string `json:"warnings"`
}
