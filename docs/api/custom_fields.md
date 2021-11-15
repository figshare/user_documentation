# Custom fields endpoints

* **[Private](#custom-fields-private-endpoints)**
  - [upload custom_fields file](#upload-custom-fields-file)


## Custom Fields Private Endpoints ##

### Upload Custom Fields File ###

#### Request ####

```http
POST /v2/institution/custom_fields/{custom_field_id}/items/upload
```

The request needs to be of type `multipart/form-data` and have its **Content-Type** header set to the same value; the body of the file is sent as the form data.
A typical request looks like this:

```http
POST institution/custom_fields/{custom_field_id}/items/upload HTTP/1.1
Host: api.figshare.com
Content-Length: 975
Accept-Encoding: gzip, deflate
Accept: */*
User-Agent: python-requests/2.5.3 CPython/2.7.10 Linux/4.1.4-1-ARCH
Connection: keep-alive
Content-Type: multipart/form-data; boundary=529448d158064de596afd8f892c84e15
Authorization: token 86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df

--529448d158064de596afd8f892c84e15
Content-Disposition: form-data; name="external_file"; filename="example_file.csv"

[file content goes there]

--529448d158064de596afd8f892c84e15--

```

#### Examples ####

The following examples all have the final goal of generating and issuing the upper **HTTP** request.

##### Python #####
One of the simpler examples is in *python*. For this to work one would need to install the *requests* python package.

```python
#!/usr/bin/env python

import requests


FILE_NAME = 'example_file.csv'
API_URL = 'https://api.figshare.com/v2/account/institution/custom_fields/{custom_field_id}/items/upload'.format(custom_field_id=1)
TOKEN = '86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df'


def main():
    headers = {"Authorization": "token " + TOKEN}
    with open(FILE_NAME, 'rb') as fin:
        files = {'external_file': (FILE_NAME, fin)}
        resp = requests.post(API_URL, files=files, headers=headers)

        print(resp.content)

        resp.raise_for_status()

if __name__ == '__main__':
    main()

```

##### Java #####
For java one can use apache *httpcomponents*:

```java
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Throwable;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class CSVUploaderExample {
    public static void main(String[] args) {
        try {
            CSVUploaderExample ex = new CSVUploaderExample(args[0]);
            ex.upload();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
        }
    }

    private static final String API_URL = "https://api.figshare.com/v2/account/institution/custom_fields/1/items/upload";
    private static final String TOKEN = "86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df";

    private String fileName = null;

    CSVUploaderExample(String fileName) {
        this.fileName = fileName;
    }

    public void upload() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost(API_URL);

        uploadFile.addHeader("Authorization", "token " + TOKEN);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        File file = new File(fileName);

        builder.addBinaryBody("external_file", new FileInputStream(file), ContentType.TEXT_PLAIN, file.getName());

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);

        CloseableHttpResponse response = httpClient.execute(uploadFile);
        int status = response.getStatusLine().getStatusCode();

        System.out.println("Status code was: " + status);
    }
}
```

##### C# #####
For the **.NET / mono** users there's this snippet of code:

```Csharp

using System;
using System.Net.Http;
using System.IO;
using System.Threading.Tasks;

namespace CSVUploaderExample
{
  class MainClass
  {
    private const String API_URL = "https://api.figshare.com/v2/account/institution/custom_fields/1/items/upload";
    private const String TOKEN = "86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df";
    private String fileName = null;

    public static void Main (string[] args)
    {
      MainClass app = new MainClass (args [0]);
      app.Upload ();
    }

    MainClass(String fileName) {
      this.fileName = fileName;
    }

    public void Upload() {
      HttpClient httpClient = new HttpClient ();
      httpClient.DefaultRequestHeaders.Add ("Authorization", "token " + MainClass.TOKEN);

      MultipartFormDataContent form = new MultipartFormDataContent ();
      using (StreamReader sr = new StreamReader (this.fileName)) {
        String content = sr.ReadToEnd ();
        byte[] data = System.Text.Encoding.UTF8.GetBytes (content);

        form.Add (new ByteArrayContent (data, 0, data.Length), "external_file", this.fileName);
      }

      Task<HttpResponseMessage> task = httpClient.PostAsync (MainClass.API_URL, form);
      task.Wait();
      HttpResponseMessage response = task.Result;
      response.EnsureSuccessStatusCode();

      Console.WriteLine ("Status code was: " + response.StatusCode);

      httpClient.Dispose();
    }
  }
}
```

##### CURL #####
Probably one of the most versatile ways of uploading an HRFeed is through **curl** given the possibility
of integrating it into any other command line utility on linux/unix.

```curl
curl -XPOST\
    -H"Authorization: token 86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df"\
    -F"external_file=@my_file.csv"\
    https://api.figshare.com/v2/account/institution/custom_fields/1/items/upload
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
    "message": "Previous import still in progress!",
    "code": "PreviousCustomFieldUploadNotComplete"
}
```

when the feed has already been submitted within a 60 minutes span.

```json
{
    "message": "You are not allowed to upload values for this custom field",
    "code": "DropdownLargeListFieldUpdateUnauthorizedError"
}
```

when the user is not authorized to make the upload

```json
{
    "message": "This custom field cannot be updated via this method",
    "code": "BadRequest"
}
```

when trying to upload a file for a custom field of a different type besides *dropdown_large_list*


#### Notes ####

The *success* response doesn't give much information other than the fact that the system has
understood the request, has received the file and has initiated the necessary tasks.

The *token* given in the upper examples is a general Fig**share** API personal token belonging to an admin
of the group the custom field has been created in (either institutional admin or group admin). No other users
should be able to use this endpoint (otherwise an *Unauthorised* error will be returned).

By default, a single custom field file can be uploaded every 60 minutes per portal. The timer
 will not automatically reset if the custom field is deleted in the meantime. The delay itself can be customised, 
 by submitting a request to Figshare support.

The only supported file format at the moment is CSV. It is assumed that the file contains a header row 
and thus the first line in it will be ignored. For all further rows, the values in all columns will be concatenated, 
with a single space inserted between each pair of values, and the result will be added as an item for the custom metadata field.
For example, the following file content:

```csv
header1,header2,header 3
123,My awesome field value,456
```
will generate a single custom field value **123 My awesome field value 456**.

The maximum number of characters allowed for a value is 255. All values that are longer than that will simply be ignored.
 
 