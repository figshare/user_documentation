
**Note:** `Public` and `Private` reffer to the kind of endpoint used for obtaining the JSON,
not the status (private/published) of the project.


Public Project Lite Presenter
=============================

```json
{
    "id": 1, 
    "title": "example",
    "published_date": "2016-05-04T19:40:57Z",
    "url": "https://api.figshare.com/v2/projects/5070"
}
```


Private Project Lite Presenter
=============================

```json
{
    "id": 1,
    "title": "example",
    "role": "Owner",
    "storage": "individual",
    "published_date": "2016-05-04T19:40:57Z",
    "url": "https://api.figshare.com/v2/projects/5070"
}
```

* `role` can be: `Owner`, `Collaborator`, or `Viewer`
* `storage` can be: `individual` or `group`


Public Project Full Presenter
=============================

```json
{
    "id": 1, 
    "title": "example", 
    "description": "example description",
    "published_date": "2016-05-04T19:40:57Z",
    "funding": "no funding",
    "url": "https://api.figshare.com/v2/projects/1",
    "figshare_url": "https://figshare.com/projects/example/1",
    "collaborators": [
        {
            "role_name": "Owner",
            "user_id": 1,
            "name": "test"
        },
        {
            "role_name": "Collaborator",
            "user_id": 2,
            "name": "other"
        }
    ]
}
```


Private Project Full Presenter
=============================

```json
{
    "id": 1,
    "title": "example",
    "description": "example description",
    "created_date": "2016-02-03T12:39:46Z",
    "modified_date": "2016-02-03T12:42:27Z",
    "published_date": "2016-05-04T19:40:57Z",
    "funding": "no funding",
    "url": "https://api.figshare.com/v2/projects/1",
    "figshare_url": "https://figshare.com/projects/example/1",
    "collaborators": [
        {
            "role_name": "Owner",
            "user_id": 1,
            "name": "test"
        },
        {
            "role_name": "Collaborator",
            "user_id": 2,
            "name": "other"
        }
    ],
    "storage": "individual",
    "group_id": 0,
    "quota": 0,
    "used_quota": 166164,
    "used_quota_private": 166164,
    "used_quota_public": 0,
    "role": "Owner"
}
```
