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

type PrivateLinkCreator struct {

	// Date when this private link should expire - optional. By default private links expire in 365 days.
	ExpiresDate string `json:"expires_date,omitempty"`

	// Optional, default true. Set to false to give private link users editing rights for this collection.
	ReadOnly bool `json:"read_only,omitempty"`
}
