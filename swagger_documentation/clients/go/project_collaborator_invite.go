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

type ProjectCollaboratorInvite struct {

	// Role of the the collaborator inside the project
	RoleName string `json:"role_name"`

	// User id of the collaborator
	UserId int64 `json:"user_id,omitempty"`

	// Collaborator email
	Email string `json:"email,omitempty"`

	// Text sent when inviting the user to the project
	Comment string `json:"comment,omitempty"`
}