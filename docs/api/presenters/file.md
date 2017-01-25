# Public File Presenter

```json
{
    "id": 3000002,
    "name": "test.xls",
    "size": 14848,
    "is_link_only": False,
    "download_url": "https://ndownloader.figshare.com/files/3000002"
}
```


# Private File Presenter

* [Public File Presenter](file.md#privatefilepresenter) +

```json
{
    "status": "created",
    "viewer_type": "",
    "preview_state": "preview_not_available",
    "upload_url": "https://uploads.figshare.com",
    "upload_token": "9dfc5fe3-d617-4d93-ac11-8afe7e984a4b",
    "supplied_md5": "043a51806d646e88cafbf19e7b82846f",
    "computed_md5": "043a51806d646e88cafbf19e7b82846f"
}
```

For linked files (`is_link_only: true`), the `upload_url` and `upload_token` fields are missing (as the files will not be uploaded to figshare).
