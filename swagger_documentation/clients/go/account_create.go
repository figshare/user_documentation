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

type AccountCreate struct {

	// Email of account
	Email string `json:"email"`

	// First Name
	FirstName string `json:"first_name"`

	// Last Name
	LastName string `json:"last_name,omitempty"`

	// Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups
	GroupId int64 `json:"group_id,omitempty"`

	// Institution user id
	InstitutionUserId string `json:"institution_user_id,omitempty"`

	// Symplectic user id
	SymplecticUserId string `json:"symplectic_user_id,omitempty"`

	// Account quota
	Quota int64 `json:"quota,omitempty"`

	// Is account active
	IsActive bool `json:"is_active,omitempty"`
}