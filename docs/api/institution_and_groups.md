# Information about institution and groups

These are private endpoints, OAuth is required.

## Get institution info

    GET /v2/account/institution

**Success Response**

* Status: `200 OK`
* Body: [Institution Presenter](presenters/institution.md)


## List institution articles

    GET /v2/account/institution/articles

Returns the articles from the institution of the account. User must be administrator of the institution.

**Success Response**

* Status: `200 OK`
* Body: A list of [Group Presenter](presenters/group.md)


## List groups

    GET /v2/account/institution/groups

Returns the groups for which the account has administrative privileges (assigned and inherited).

**Success Response**

* Status: `200 OK`
* Body: A list of [Group Presenter](presenters/group.md)
