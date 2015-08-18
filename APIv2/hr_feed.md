# HR Feed Endpoints

* **[Private](#hrfeed-private-endpoints)**
  - [upload hrfeed file](#upload-hrfeed-file)


## HRFeed Private Endpoints ##

### Upload HRFeed File ###

#### Request ####

    POST /v2/institution/hrfeed/upload

The request needs to be a `multipart/form-data` request where the **Content-Type** header is set to the said value and the body of the file is sent as the form data.
A typical request looks like this:

```http
POST /v2/institution/hrfeed/upload HTTP/1.1
Host: api.figshare.com
Content-Length: 975
Accept-Encoding: gzip, deflate
Accept: */*
User-Agent: python-requests/2.5.3 CPython/2.7.10 Linux/4.1.4-1-ARCH
Connection: keep-alive
Content-Type: multipart/form-data; boundary=529448d158064de596afd8f892c84e15
Authorization: token 86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df

--529448d158064de596afd8f892c84e15
Content-Disposition: form-data; name="hrfeed"; filename="feed.xml"

<?xml version="1.0"?>
<HRFeed>
    <Record>
        <UniqueID>1234567</UniqueID>
        <FirstName>Jane</FirstName>
        <LastName>Doe</LastName>
        <Title>Mrs</Title>
        <Initials>JD</Initials>
        <Suffix></Suffix>
        <Email>j.doe@sillymail.io</Email>
        <IsActive>Y</IsActive>
        <UserQuota>1048576000</UserQuota>
        <UserAssociationCriteria>IT</UserAssociationCriteria>
    </Record>
    <Record>
        <UniqueID>1234568</UniqueID>
        <FirstName>John</FirstName>
        <LastName>Smith</LastName>
        <Title>Mr</Title>
        <Initials></Initials>
        <Suffix></Suffix>
        <Email>js@seriousness.com</Email>
        <IsActive>Y</IsActive>
        <UserQuota>10485760000</UserQuota>
        <UserAssociationCriteria></UserAssociationCriteria>
    </Record>
</HRFeed>

--529448d158064de596afd8f892c84e15--

```

For an example the following python code uses request to obtain the upper request:
```python
#!/usr/bin/env python

import requests


FILE_NAME = 'feed.xml'
API_URL = 'https://api.figshare.com/v2/institution/hrfeed/upload'
TOKEN = '86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df'


def main():
    headers = {"Authorization": "token " + TOKEN}
    with open(FILE_NAME, 'rb') as fin:
        files = {'hrfeed': (FILE_NAME, fin)}
        resp = requests.post(API_URL, files=files, headers=headers)

        print(resp.content)

        resp.raise_for_status()

if __name__ == '__main__':
    main()

```

#### Response ####

* Status: `200 OK`
* Body:

    ```json
    {
        "message": "OK"
    }
    ```

#### Errors ####

Standard [error responses](index.md#errors)
Most common:
```json
{
    "message": "Previous feed import not complete.",
    "data": null,
    "errcode": "FigshareAPIException"
}
```
when the feed has already been submitted within a 24 hour span.
