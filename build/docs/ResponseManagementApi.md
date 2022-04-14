---
title: ResponseManagementApi
---

## ResponseManagementApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                              | Description                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| [**deleteResponsemanagementLibrary**](ResponseManagementApi.md#deleteResponsemanagementLibrary)                                     | Delete an existing response library.                |
| [**deleteResponsemanagementResponse**](ResponseManagementApi.md#deleteResponsemanagementResponse)                                   | Delete an existing response.                        |
| [**deleteResponsemanagementResponseasset**](ResponseManagementApi.md#deleteResponsemanagementResponseasset)                         | Delete response asset                               |
| [**getResponsemanagementLibraries**](ResponseManagementApi.md#getResponsemanagementLibraries)                                       | Gets a list of existing response libraries.         |
| [**getResponsemanagementLibrary**](ResponseManagementApi.md#getResponsemanagementLibrary)                                           | Get details about an existing response library.     |
| [**getResponsemanagementResponse**](ResponseManagementApi.md#getResponsemanagementResponse)                                         | Get details about an existing response.             |
| [**getResponsemanagementResponseasset**](ResponseManagementApi.md#getResponsemanagementResponseasset)                               | Get response asset information                      |
| [**getResponsemanagementResponseassetsStatusStatusId**](ResponseManagementApi.md#getResponsemanagementResponseassetsStatusStatusId) | Get response asset upload status                    |
| [**getResponsemanagementResponses**](ResponseManagementApi.md#getResponsemanagementResponses)                                       | Gets a list of existing responses.                  |
| [**postResponsemanagementLibraries**](ResponseManagementApi.md#postResponsemanagementLibraries)                                     | Create a response library.                          |
| [**postResponsemanagementResponseassetsSearch**](ResponseManagementApi.md#postResponsemanagementResponseassetsSearch)               | Search response assets                              |
| [**postResponsemanagementResponseassetsUploads**](ResponseManagementApi.md#postResponsemanagementResponseassetsUploads)             | Creates pre-signed url for uploading response asset |
| [**postResponsemanagementResponses**](ResponseManagementApi.md#postResponsemanagementResponses)                                     | Create a response.                                  |
| [**postResponsemanagementResponsesQuery**](ResponseManagementApi.md#postResponsemanagementResponsesQuery)                           | Query responses                                     |
| [**putResponsemanagementLibrary**](ResponseManagementApi.md#putResponsemanagementLibrary)                                           | Update an existing response library.                |
| [**putResponsemanagementResponse**](ResponseManagementApi.md#putResponsemanagementResponse)                                         | Update an existing response.                        |
| [**putResponsemanagementResponseasset**](ResponseManagementApi.md#putResponsemanagementResponseasset)                               | Update response asset                               |

{: class="table-striped"}

<a name="deleteResponsemanagementLibrary"></a>

# **deleteResponsemanagementLibrary**

> Void deleteResponsemanagementLibrary(libraryId)

Delete an existing response library.

This will remove any responses associated with the library.

Wraps DELETE /api/v2/responsemanagement/libraries/{libraryId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    apiInstance.deleteResponsemanagementLibrary(libraryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **libraryId** | **String** | Library ID  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteResponsemanagementResponse"></a>

# **deleteResponsemanagementResponse**

> Void deleteResponsemanagementResponse(responseId)

Delete an existing response.

This will remove the response from any libraries associated with it.

Wraps DELETE /api/v2/responsemanagement/responses/{responseId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
try {
    apiInstance.deleteResponsemanagementResponse(responseId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **responseId** | **String** | Response ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteResponsemanagementResponseasset"></a>

# **deleteResponsemanagementResponseasset**

> Void deleteResponsemanagementResponseasset(responseAssetId)

Delete response asset

Wraps DELETE /api/v2/responsemanagement/responseassets/{responseAssetId}

Requires ANY permissions:

- responseAssets:asset:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseAssetId = "responseAssetId_example"; // String | Asset Id
try {
    apiInstance.deleteResponsemanagementResponseasset(responseAssetId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#deleteResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description | Notes |
| ------------------- | ---------- | ----------- | ----- |
| **responseAssetId** | **String** | Asset Id    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getResponsemanagementLibraries"></a>

# **getResponsemanagementLibraries**

> [LibraryEntityListing](LibraryEntityListing.md) getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter)

Gets a list of existing response libraries.

Wraps GET /api/v2/responsemanagement/libraries

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String messagingTemplateFilter = "messagingTemplateFilter_example"; // String | Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel
try {
    LibraryEntityListing result = apiInstance.getResponsemanagementLibraries(pageNumber, pageSize, messagingTemplateFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementLibraries");
    e.printStackTrace();
}
```

### Parameters

| Name                        | Type        | Description                                                                                                                    | Notes                                |
| --------------------------- | ----------- | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------ |
| **pageNumber**              | **Integer** | Page number                                                                                                                    | [optional] [default to 1]            |
| **pageSize**                | **Integer** | Page size                                                                                                                      | [optional] [default to 25]           |
| **messagingTemplateFilter** | **String**  | Returns a list of libraries that contain responses with at least one messaging template defined for a specific message channel | [optional]<br />**Values**: whatsapp |

{: class="table-striped"}

### Return type

[**LibraryEntityListing**](LibraryEntityListing.md)

<a name="getResponsemanagementLibrary"></a>

# **getResponsemanagementLibrary**

> [Library](Library.md) getResponsemanagementLibrary(libraryId)

Get details about an existing response library.

Wraps GET /api/v2/responsemanagement/libraries/{libraryId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
try {
    Library result = apiInstance.getResponsemanagementLibrary(libraryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **libraryId** | **String** | Library ID  |

{: class="table-striped"}

### Return type

[**Library**](Library.md)

<a name="getResponsemanagementResponse"></a>

# **getResponsemanagementResponse**

> [Response](Response.md) getResponsemanagementResponse(responseId, expand)

Get details about an existing response.

Wraps GET /api/v2/responsemanagement/responses/{responseId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.getResponsemanagementResponse(responseId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                               | Notes                                           |
| -------------- | ---------- | ----------------------------------------- | ----------------------------------------------- |
| **responseId** | **String** | Response ID                               |
| **expand**     | **String** | Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema |

{: class="table-striped"}

### Return type

[**Response**](Response.md)

<a name="getResponsemanagementResponseasset"></a>

# **getResponsemanagementResponseasset**

> [ResponseAsset](ResponseAsset.md) getResponsemanagementResponseasset(responseAssetId)

Get response asset information

Wraps GET /api/v2/responsemanagement/responseassets/{responseAssetId}

Requires ANY permissions:

- responseAssets:asset:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseAssetId = "responseAssetId_example"; // String | Asset Id
try {
    ResponseAsset result = apiInstance.getResponsemanagementResponseasset(responseAssetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description | Notes |
| ------------------- | ---------- | ----------- | ----- |
| **responseAssetId** | **String** | Asset Id    |

{: class="table-striped"}

### Return type

[**ResponseAsset**](ResponseAsset.md)

<a name="getResponsemanagementResponseassetsStatusStatusId"></a>

# **getResponsemanagementResponseassetsStatusStatusId**

> [ResponseAssetStatus](ResponseAssetStatus.md) getResponsemanagementResponseassetsStatusStatusId(statusId)

Get response asset upload status

Wraps GET /api/v2/responsemanagement/responseassets/status/{statusId}

Requires ANY permissions:

- responseAssets:asset:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String statusId = "statusId_example"; // String | Status Id
try {
    ResponseAssetStatus result = apiInstance.getResponsemanagementResponseassetsStatusStatusId(statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponseassetsStatusStatusId");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **statusId** | **String** | Status Id   |

{: class="table-striped"}

### Return type

[**ResponseAssetStatus**](ResponseAssetStatus.md)

<a name="getResponsemanagementResponses"></a>

# **getResponsemanagementResponses**

> [ResponseEntityListing](ResponseEntityListing.md) getResponsemanagementResponses(libraryId, pageNumber, pageSize, expand)

Gets a list of existing responses.

Wraps GET /api/v2/responsemanagement/responses

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    ResponseEntityListing result = apiInstance.getResponsemanagementResponses(libraryId, pageNumber, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#getResponsemanagementResponses");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                               | Notes                                           |
| -------------- | ----------- | ----------------------------------------- | ----------------------------------------------- |
| **libraryId**  | **String**  | Library ID                                |
| **pageNumber** | **Integer** | Page number                               | [optional] [default to 1]                       |
| **pageSize**   | **Integer** | Page size                                 | [optional] [default to 25]                      |
| **expand**     | **String**  | Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema |

{: class="table-striped"}

### Return type

[**ResponseEntityListing**](ResponseEntityListing.md)

<a name="postResponsemanagementLibraries"></a>

# **postResponsemanagementLibraries**

> [Library](Library.md) postResponsemanagementLibraries(body)

Create a response library.

Wraps POST /api/v2/responsemanagement/libraries

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.postResponsemanagementLibraries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementLibraries");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                      | Description | Notes |
| -------- | ------------------------- | ----------- | ----- |
| **body** | [**Library**](Library.md) | Library     |

{: class="table-striped"}

### Return type

[**Library**](Library.md)

<a name="postResponsemanagementResponseassetsSearch"></a>

# **postResponsemanagementResponseassetsSearch**

> [ResponseAssetSearchResults](ResponseAssetSearchResults.md) postResponsemanagementResponseassetsSearch(body, expand)

Search response assets

Wraps POST /api/v2/responsemanagement/responseassets/search

Requires ALL permissions:

- responseAssets:asset:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
ResponseAssetSearchRequest body = new ResponseAssetSearchRequest(); // ResponseAssetSearchRequest | request
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    ResponseAssetSearchResults result = apiInstance.postResponsemanagementResponseassetsSearch(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponseassetsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                            | Description                     | Notes                                      |
| ---------- | --------------------------------------------------------------- | ------------------------------- | ------------------------------------------ |
| **body**   | [**ResponseAssetSearchRequest**](ResponseAssetSearchRequest.md) | request                         |
| **expand** | [**List&lt;String&gt;**](String.md)                             | Which fields, if any, to expand | [optional]<br />**Values**: user, division |

{: class="table-striped"}

### Return type

[**ResponseAssetSearchResults**](ResponseAssetSearchResults.md)

<a name="postResponsemanagementResponseassetsUploads"></a>

# **postResponsemanagementResponseassetsUploads**

> [CreateResponseAssetResponse](CreateResponseAssetResponse.md) postResponsemanagementResponseassetsUploads(body)

Creates pre-signed url for uploading response asset

Wraps POST /api/v2/responsemanagement/responseassets/uploads

Requires ANY permissions:

- responseAssets:asset:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
CreateResponseAssetRequest body = new CreateResponseAssetRequest(); // CreateResponseAssetRequest | request
try {
    CreateResponseAssetResponse result = apiInstance.postResponsemanagementResponseassetsUploads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponseassetsUploads");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description | Notes |
| -------- | --------------------------------------------------------------- | ----------- | ----- |
| **body** | [**CreateResponseAssetRequest**](CreateResponseAssetRequest.md) | request     |

{: class="table-striped"}

### Return type

[**CreateResponseAssetResponse**](CreateResponseAssetResponse.md)

<a name="postResponsemanagementResponses"></a>

# **postResponsemanagementResponses**

> [Response](Response.md) postResponsemanagementResponses(body, expand)

Create a response.

Wraps POST /api/v2/responsemanagement/responses

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
Response body = new Response(); // Response | Response
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.postResponsemanagementResponses(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponses");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                        | Description                               | Notes                                           |
| ---------- | --------------------------- | ----------------------------------------- | ----------------------------------------------- |
| **body**   | [**Response**](Response.md) | Response                                  |
| **expand** | **String**                  | Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema |

{: class="table-striped"}

### Return type

[**Response**](Response.md)

<a name="postResponsemanagementResponsesQuery"></a>

# **postResponsemanagementResponsesQuery**

> [ResponseQueryResults](ResponseQueryResults.md) postResponsemanagementResponsesQuery(body)

Query responses

Wraps POST /api/v2/responsemanagement/responses/query

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
ResponseQueryRequest body = new ResponseQueryRequest(); // ResponseQueryRequest | Response
try {
    ResponseQueryResults result = apiInstance.postResponsemanagementResponsesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#postResponsemanagementResponsesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**ResponseQueryRequest**](ResponseQueryRequest.md) | Response    |

{: class="table-striped"}

### Return type

[**ResponseQueryResults**](ResponseQueryResults.md)

<a name="putResponsemanagementLibrary"></a>

# **putResponsemanagementLibrary**

> [Library](Library.md) putResponsemanagementLibrary(libraryId, body)

Update an existing response library.

Fields that can be updated: name. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/libraries/{libraryId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String libraryId = "libraryId_example"; // String | Library ID
Library body = new Library(); // Library | Library
try {
    Library result = apiInstance.putResponsemanagementLibrary(libraryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementLibrary");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                      | Description | Notes |
| ------------- | ------------------------- | ----------- | ----- |
| **libraryId** | **String**                | Library ID  |
| **body**      | [**Library**](Library.md) | Library     |

{: class="table-striped"}

### Return type

[**Library**](Library.md)

<a name="putResponsemanagementResponse"></a>

# **putResponsemanagementResponse**

> [Response](Response.md) putResponsemanagementResponse(responseId, body, expand)

Update an existing response.

Fields that can be updated: name, libraries, and texts. The most recent version is required for updates.

Wraps PUT /api/v2/responsemanagement/responses/{responseId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseId = "responseId_example"; // String | Response ID
Response body = new Response(); // Response | Response
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    Response result = apiInstance.putResponsemanagementResponse(responseId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementResponse");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                        | Description                               | Notes                                           |
| -------------- | --------------------------- | ----------------------------------------- | ----------------------------------------------- |
| **responseId** | **String**                  | Response ID                               |
| **body**       | [**Response**](Response.md) | Response                                  |
| **expand**     | **String**                  | Expand instructions for the return value. | [optional]<br />**Values**: substitutionsSchema |

{: class="table-striped"}

### Return type

[**Response**](Response.md)

<a name="putResponsemanagementResponseasset"></a>

# **putResponsemanagementResponseasset**

> [ResponseAsset](ResponseAsset.md) putResponsemanagementResponseasset(responseAssetId, body)

Update response asset

Wraps PUT /api/v2/responsemanagement/responseassets/{responseAssetId}

Requires ALL permissions:

- responseAssets:asset:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ResponseManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ResponseManagementApi apiInstance = new ResponseManagementApi();
String responseAssetId = "responseAssetId_example"; // String | Asset Id
ResponseAssetRequest body = new ResponseAssetRequest(); // ResponseAssetRequest | request
try {
    ResponseAsset result = apiInstance.putResponsemanagementResponseasset(responseAssetId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResponseManagementApi#putResponsemanagementResponseasset");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                | Description | Notes |
| ------------------- | --------------------------------------------------- | ----------- | ----- |
| **responseAssetId** | **String**                                          | Asset Id    |
| **body**            | [**ResponseAssetRequest**](ResponseAssetRequest.md) | request     |

{: class="table-striped"}

### Return type

[**ResponseAsset**](ResponseAsset.md)
