# List licenses

    GET /v2/licenses

Public endpoint, does not need OAuth.

**Success Response**
```
Status: 200 OK
```
Body: A list of [License Presenters](presenters/license.md#licensepresenter)


# List institution licenses

      GET /v2/account/licenses

This is a private endpoint that requires OAuth.   
It will return a list with figshare public licenses *AND* licenses defined for account's institution.

**Success Response**
```
Status: 200 OK
```
A list of [License Presenters](presenters/license.md#licensepresenter)
