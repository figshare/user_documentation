# UploadFilePart

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartNo** | **int64** | File part id | [optional] [default to null]
**StartOffset** | **int64** | Indexes on byte range. zero-based and inclusive | [optional] [default to null]
**EndOffset** | **int64** | Indexes on byte range. zero-based and inclusive | [optional] [default to null]
**Status** | **string** | part status | [optional] [default to null]
**Locked** | **bool** | When a part is being uploaded it is being locked, by setting the locked flag to true. No changes/uploads can happen on this part from other requests. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


