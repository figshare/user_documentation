# HR Feed Endpoints

* **[Private](#hrfeed-private-endpoints)**
  - [upload hrfeed file](#upload-hrfeed-file)


## HRFeed Private Endpoints ##

### Upload HRFeed File ###

#### Request ####

```http
POST /v2/institution/hrfeed/upload
```

The request needs to be of type `multipart/form-data` and have its **Content-Type** header set to the same value; the body of the file is sent as the form data.
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
        <Orcid>1122-1299-6202-273X</Orcid>
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
        <Orcid>0000-0002-3109-4308</Orcid>
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

#### Examples ####

The following examples all have the final goal of generating and issuing the upper **HTTP** request.

##### Python #####
One of the simpler examples is in *python*. For this to work one would need to install the *requests* python package.

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

public class HRFeedUploaderExample {
    public static void main(String[] args) {
        try {
            HRFeedUploaderExample hfue = new HRFeedUploaderExample(args[0]);
            hfue.upload();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
        }
    }

    private static final String API_URL = "https://api.figshare.com/v2/institution/hrfeed/upload";
    private static final String TOKEN = "86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df";

    private String fileName = null;

    HRFeedUploaderExample(String fileName) {
        this.fileName = fileName;
    }

    public void upload() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost(API_URL);

        uploadFile.addHeader("Authorization", "token " + TOKEN);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        File file = new File(fileName);

        builder.addBinaryBody("hrfeed", new FileInputStream(file), ContentType.TEXT_PLAIN, file.getName());

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);

        CloseableHttpResponse response = httpClient.execute(uploadFile);
        int status = response.getStatusLine().getStatusCode();

        System.out.println("Status code was: " + status);
    }
}
```

Or if you don't mind getting down and dirty with raw **HTTP**:

```java
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Throwable;
import java.net.URL;
import java.net.HttpURLConnection;

public class HRFeedUploaderExample {
    public static void main(String[] args) {
        try {
            HRFeedUploaderExample hfue = new HRFeedUploaderExample(args[0]);
            hfue.upload();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
        }
    }

    private static final String API_URL = "https://api.figshare.com/v2/institution/hrfeed/upload";
    private static final String TOKEN = "86bbaa5d6d51fc0ae2f2defd3a474dac77ae27179ff6d04dd37e74c531bd6ed059eda584b41356337c362a259e482eb36a34825c805344e0600bb875a77444df";

    private String fileName = null;

    HRFeedUploaderExample(String fileName) {
        this.fileName = fileName;
    }

    public void upload() throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL(API_URL).openConnection();
        String boundary = "123456789boundary987654321";
        byte[] byteBoundary = ("\n--" + boundary + "\n").getBytes("UTF-8");

        con.setDoOutput(true);
        con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        con.setRequestProperty("Authorization", "token " + TOKEN);

        File file = new File(fileName);
        try (OutputStream out = con.getOutputStream()) {
            out.write(byteBoundary);
            out.write(("Content-Disposition: form-data; name=\"hrfeed\"; filename=\"" + fileName + "\"\n\n").getBytes("UTF-8"));
            try (FileInputStream in = new FileInputStream(file)) {
                byte[] data = new byte[(int) file.length()];
                in.read(data);
                out.write(data);
            }
            out.write(byteBoundary);
        }
        int status = con.getResponseCode();
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

namespace HRFeedUploadExample
{
  class MainClass
  {
    private const String API_URL = "https://api.figshare.com/v2/institution/hrfeed/upload";
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

        form.Add (new ByteArrayContent (data, 0, data.Length), "hrfeed", this.fileName);
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
    -F"hrfeed=@feed.csv"\
    https://api.figshare.com/v2/institution/hrfeed/upload
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

#### Notes ####

The *success* response doesn't give much information other than the fact that the system has
understood the request, has received the file and has initiated the necessary tasks.
There are plans for a way to get more in depth information for the state of the **HRFeed Process**.

The *token* given in the upper examples is a general fig**share** API personal token of any of
the admins at the institution. No other user should be able to access this endpoint, apart from
those given the express permission of uploading HR feeds.

