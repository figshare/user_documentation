# Institution and groups endpoints

* **[Private](#private-endpoints)**
  - [show institution info](#show-institution-info)
  - [list groups](#list-groups)


## Private endpoints

These requests require authorization/authentication.  
Missing valid auth will result in 403 and 401 errors.

==========================
### Show institution info

    GET /v2/account/institution

#### Response

* Status: `200 OK`
* Body: [InstitutionPresenter](presenters/institution.md)

==========================
### List groups

    GET /v2/account/institution/groups

#### Response

* Status: `200 OK`
* Body: [GroupPresenter](presenters/group.md)

