# PrivateAuthorsSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SearchFor** | **string** | Search term | [optional] [default to null]
**Page** | **int64** | Page number. Used for pagination with page_size | [optional] [default to null]
**PageSize** | **int64** | The number of results included on a page. Used for pagination with page | [optional] [default to 10]
**Limit** | **int64** | Number of results included on a page. Used for pagination with query | [optional] [default to null]
**Offset** | **int64** | Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] [default to null]
**Order** | **string** | The field by which to order. Default varies by endpoint/resource. | [optional] [default to null]
**OrderDirection** | **string** | Direction of ordering | [optional] [default to null]
**InstitutionId** | **int64** | Return only authors associated to this institution | [optional] [default to null]
**Orcid** | **string** | Orcid of author | [optional] [default to null]
**GroupId** | **int64** | Return only authors in this group or subgroups of the group | [optional] [default to null]
**IsActive** | **bool** | Return only active authors if True | [optional] [default to null]
**IsPublic** | **bool** | Return only authors that have published items if True | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


