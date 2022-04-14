---
title: FaxApi
---

## FaxApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                       | Description                  |
| ------------------------------------------------------------ | ---------------------------- |
| [**deleteFaxDocument**](FaxApi.md#deleteFaxDocument)         | Delete a fax document.       |
| [**getFaxDocument**](FaxApi.md#getFaxDocument)               | Get a document.              |
| [**getFaxDocumentContent**](FaxApi.md#getFaxDocumentContent) | Download a fax document.     |
| [**getFaxDocuments**](FaxApi.md#getFaxDocuments)             | Get a list of fax documents. |
| [**getFaxSummary**](FaxApi.md#getFaxSummary)                 | Get fax summary              |
| [**putFaxDocument**](FaxApi.md#putFaxDocument)               | Update a fax document.       |

{: class="table-striped"}

<a name="deleteFaxDocument"></a>

# **deleteFaxDocument**

> Void deleteFaxDocument(documentId)

Delete a fax document.

Wraps DELETE /api/v2/fax/documents/{documentId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    apiInstance.deleteFaxDocument(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#deleteFaxDocument");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **documentId** | **String** | Document ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getFaxDocument"></a>

# **getFaxDocument**

> [FaxDocument](FaxDocument.md) getFaxDocument(documentId)

Get a document.

Wraps GET /api/v2/fax/documents/{documentId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    FaxDocument result = apiInstance.getFaxDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getFaxDocument");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **documentId** | **String** | Document ID |

{: class="table-striped"}

### Return type

[**FaxDocument**](FaxDocument.md)

<a name="getFaxDocumentContent"></a>

# **getFaxDocumentContent**

> [DownloadResponse](DownloadResponse.md) getFaxDocumentContent(documentId)

Download a fax document.

Wraps GET /api/v2/fax/documents/{documentId}/content

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
try {
    DownloadResponse result = apiInstance.getFaxDocumentContent(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getFaxDocumentContent");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **documentId** | **String** | Document ID |

{: class="table-striped"}

### Return type

[**DownloadResponse**](DownloadResponse.md)

<a name="getFaxDocuments"></a>

# **getFaxDocuments**

> [FaxDocumentEntityListing](FaxDocumentEntityListing.md) getFaxDocuments(pageSize, pageNumber)

Get a list of fax documents.

Wraps GET /api/v2/fax/documents

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    FaxDocumentEntityListing result = apiInstance.getFaxDocuments(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getFaxDocuments");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**FaxDocumentEntityListing**](FaxDocumentEntityListing.md)

<a name="getFaxSummary"></a>

# **getFaxSummary**

> [FaxSummary](FaxSummary.md) getFaxSummary()

Get fax summary

Wraps GET /api/v2/fax/summary

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
try {
    FaxSummary result = apiInstance.getFaxSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#getFaxSummary");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**FaxSummary**](FaxSummary.md)

<a name="putFaxDocument"></a>

# **putFaxDocument**

> [FaxDocument](FaxDocument.md) putFaxDocument(documentId, body)

Update a fax document.

Wraps PUT /api/v2/fax/documents/{documentId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.FaxApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

FaxApi apiInstance = new FaxApi();
String documentId = "documentId_example"; // String | Document ID
FaxDocument body = new FaxDocument(); // FaxDocument | Document
try {
    FaxDocument result = apiInstance.putFaxDocument(documentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxApi#putFaxDocument");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                              | Description | Notes |
| -------------- | --------------------------------- | ----------- | ----- |
| **documentId** | **String**                        | Document ID |
| **body**       | [**FaxDocument**](FaxDocument.md) | Document    |

{: class="table-striped"}

### Return type

[**FaxDocument**](FaxDocument.md)
