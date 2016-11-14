# OAuth

Since January 2016 figshare supports the [OAuth 2.0 Authorization Framework](http://tutorials.jenkov.com/oauth2/index.html). If you're new to OAuth make sure you have at least a basic understanding before moving on.

## Quick guide

To receive a client id and secret you need to register an application in
our system. You can easily do this from the [figshare applications
page](https://figshare.com/account/applications) in your account.

### Authorization endpoint

The authorization endpoint is located at
`https://figshare.com/account/applications/authorize`. The endpoint
supports both
[authorization code grant](http://tools.ietf.org/html/rfc6749#section-4.1.1) and [implicit grant](http://tools.ietf.org/html/rfc6749#section-4.2).

#### Request params

* `client_id`
* `response_type`
* `scope`
* `state`
* `redirect_uri`

#### Response params

User is redirected back to `redirect_uri` with the following params
atted to the query:

**Success** as described in [rfc6749#section-4.1.2](http://tools.ietf.org/html/rfc6749#section-4.1.2) or [rfc6749#section-4.2.2](http://tools.ietf.org/html/rfc6749#section-4.2.2):

* `code`
* `state`

**Error** as described in [rfc6749#4.1.2.1](http://tools.ietf.org/html/rfc6749#section-4.1.2.1):

* `error`
* `error_description`

### Token endpoint

The token endpoint is located at `https://api.figshare.com/v2/token`.
In order to receive an access token you need to make a `POST` request.

To get info about an existing access token use the `GET` method with the usual authorization means.

#### Request

Then endpoint accepts both `application/x-www-form-urlencoded` and
`application/json` content types. It will only respond with JSON
content.

* `client_id`
* `client_secret`
* `grant_type`

and, based on the value of `grant_type`:

* `code`
* `refresh_token`
* `username`
* `password`


##### Response

**Successful responses are always `200` and failed ones are always `400`,
even for failed authorization.**

**Success** response is a JSON as described in [http://tools.ietf.org/html/rfc6749#section-5.1](http://tools.ietf.org/html/rfc6749#section-5.1).

* `access_token`
* `token_type`
* `expires_in`
* `refresh_token`
* `scope` - _not available yet_

**Error** response as described in [rfc6749#section-5.2](http://tools.ietf.org/html/rfc6749#section-5.2)

## Scope

Currently the only scope available is `all` which grants full access to
the resource owner's data. We're working on a more flexible approach.


## Grant Types

The supported grant types at this moment are:

* `authorization_code`
* `refresh_token`
* `password`

