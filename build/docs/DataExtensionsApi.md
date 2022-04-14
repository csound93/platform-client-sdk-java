---
title: DataExtensionsApi
---

## DataExtensionsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                            | Description                                          |
| --------------------------------------------------------------------------------- | ---------------------------------------------------- |
| [**getDataextensionsCoretype**](DataExtensionsApi.md#getDataextensionsCoretype)   | Get a specific named core type.                      |
| [**getDataextensionsCoretypes**](DataExtensionsApi.md#getDataextensionsCoretypes) | Get the core types from which all schemas are built. |
| [**getDataextensionsLimits**](DataExtensionsApi.md#getDataextensionsLimits)       | Get quantitative limits on schemas                   |

{: class="table-striped"}

<a name="getDataextensionsCoretype"></a>

# **getDataextensionsCoretype**

> [Coretype](Coretype.md) getDataextensionsCoretype(coretypeName)

Get a specific named core type.

Wraps GET /api/v2/dataextensions/coretypes/{coretypeName}

Requires ANY permissions:

- externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataExtensionsApi apiInstance = new DataExtensionsApi();
String coretypeName = "coretypeName_example"; // String | The core type's name
try {
    Coretype result = apiInstance.getDataextensionsCoretype(coretypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExtensionsApi#getDataextensionsCoretype");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description              | Notes                                                                                                   |
| ---------------- | ---------- | ------------------------ | ------------------------------------------------------------------------------------------------------- |
| **coretypeName** | **String** | The core type&#39;s name | <br />**Values**: text, longtext, url, identifier, enum, date, datetime, integer, number, checkbox, tag |

{: class="table-striped"}

### Return type

[**Coretype**](Coretype.md)

<a name="getDataextensionsCoretypes"></a>

# **getDataextensionsCoretypes**

> [CoretypeListing](CoretypeListing.md) getDataextensionsCoretypes()

Get the core types from which all schemas are built.

Wraps GET /api/v2/dataextensions/coretypes

Requires ANY permissions:

- externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataExtensionsApi apiInstance = new DataExtensionsApi();
try {
    CoretypeListing result = apiInstance.getDataextensionsCoretypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExtensionsApi#getDataextensionsCoretypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CoretypeListing**](CoretypeListing.md)

<a name="getDataextensionsLimits"></a>

# **getDataextensionsLimits**

> [SchemaQuantityLimits](SchemaQuantityLimits.md) getDataextensionsLimits()

Get quantitative limits on schemas

Wraps GET /api/v2/dataextensions/limits

Requires ANY permissions:

- externalContacts:customFields:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DataExtensionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DataExtensionsApi apiInstance = new DataExtensionsApi();
try {
    SchemaQuantityLimits result = apiInstance.getDataextensionsLimits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExtensionsApi#getDataextensionsLimits");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**SchemaQuantityLimits**](SchemaQuantityLimits.md)
