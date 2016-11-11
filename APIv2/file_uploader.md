Figshare Upload Service
==============

### Uploads API

#### Upload status

An upload status can be:

* `PENDING` - waiting for it's parts to be uploaded
* `COMPLETED` - all parts were uploaded and the file was assembled on the storage
* `ABORTED` - canceled for some reason(user request, timeout, error)

#### Endpoints

* `GET /upload/<token>` - get upload info

  Response:

  | Status Code               | Explanation               | Body              |
  |---------------------------|---------------------------|-------------------|
  | 200 OK                    | all good                  | _explained below_ |
  | 500 Internal Server Error | internal error            | _empty_           |
  | 404 Not Found             | unknown upload token      | _empty_           |

  **200 OK**

  Body:
  ```js
  {
    token: "upload-token",
    name: "my-file.zip",
    size: 10249281,
    md5: "filemd5",  // as provided on upload creation
    status: "PENDING",
    parts: [
      {
      // upload parts -- see parts API for representation
      }
    ]
}
  ```


### Parts API

#### Part status

* `PENDING` -- part is ready to be uploaded
* `COMPLETE` -- part data has been complete and saved to storage

#### Part locking

When a part is being uploaded it is being locked, by setting the
`locked` flag to true. No changes/uploads can happen on this part from
other requests.

#### Byte ranges

The part range is specified by `startOffset` and `endOffset`. They
indexes zero-based and inclusive. Example:

Given:

* the following file data: "abcdefghij"
* `part1` with `startOffset=0` and `endOffset=3`
* `part2` with `startOffset=4` and `endOffset=7`

Then:

* `part1` is `abcd`
* `part2` is `efgh`

#### Endpoints

* `GET /upload/<token>/<part_no>` - get part info

  Responses:

  | Status Code               | Explanation                         | Body              |
  |---------------------------|-------------------------------------|-------------------|
  | 200 OK                    | all good                            | _explained below_ |
  | 500 Internal Server Error | internal error                      | _empty_           |
  | 404 Not Found             | unknown upload token or part number | _empty_           |

  **200 OK**

  Body:
  ```js
  {
    partNo: 3,
    uploadToken: "UPLOAD_TOKEN",
    startOffset: 1024,
    endOffset: 2047,
    status: "PENDING",
    locked: false,
    completedAt: null,
    uploadUrl: "http://upload.figshare.com/upload/<token>/3",
    infoUrl: "http://upload.figshare.com/upload/<token>/3"
  }
  ```

* `PUT /upload/<token>/<part_no>` - receives part data

  The entire body of the request is piped as-is to S3. It is assumed that the
  body is the correct pice of the file, from `startOffset` to `endOffset`

  While this requests is being processed the part is going to be in a
  locked state. The request can end with a `409` status code if a
  lock for the part could not be obtained.

  **Warning** if content length is less than part size the request will
  timeout

  Responses:

  | Status Code               | Explanation                         | Body              |
  |---------------------------|-------------------------------------|-------------------|
  | 200 OK                    | all good                            | _explained below_ |
  | 500 Internal Server Error | internal error                      | _empty_           |
  | 404 Not Found             | unknown upload token or part number | _empty_           |
  | 409 Conflict              | part data cannot be uploaded        | _empty_           |

  **200 OK**

  Body:
  ```js
  {
    md5: "received part md5"
  }
  ```

* `DELETE /upload/<token>/<part_no>` - reset part data

  This will reset the part to it's `PENDING` state and remove any
  storage meta.

  Responses:

  | Status Code               | Explanation                         | Body    |
  |---------------------------|-------------------------------------|---------|
  | 205 Reset Content         | all good                            | _empty_ |
  | 500 Internal Server Error | internal error                      | _empty_ |
  | 404 Not Found             | unknown upload token or part number | _empty_ |
  | 409 Conflict              | upload completed or part locked     | _empty_ |
