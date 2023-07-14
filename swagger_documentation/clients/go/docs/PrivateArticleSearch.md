# PrivateArticleSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SearchFor** | **string** | Search term | [optional] [default to null]
**Page** | **int64** | Page number. Used for pagination with page_size | [optional] [default to null]
**PageSize** | **int64** | The number of results included on a page. Used for pagination with page | [optional] [default to 10]
**Limit** | **int64** | Number of results included on a page. Used for pagination with query | [optional] [default to null]
**Offset** | **int64** | Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] [default to null]
**OrderDirection** | **string** | Direction of ordering | [optional] [default to null]
**Institution** | **int32** | only return collections from this institution | [optional] [default to null]
**PublishedSince** | **string** | Filter by article publishing date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] [default to null]
**ModifiedSince** | **string** | Filter by article modified date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] [default to null]
**Group** | **int32** | only return collections from this group | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


