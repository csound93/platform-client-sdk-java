---
title: LocationsApi
---

## LocationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                 | Description                                                          |
| ---------------------------------------------------------------------- | -------------------------------------------------------------------- |
| [**deleteLocation**](LocationsApi.md#deleteLocation)                   | Delete a location                                                    |
| [**getLocation**](LocationsApi.md#getLocation)                         | Get Location by ID.                                                  |
| [**getLocationSublocations**](LocationsApi.md#getLocationSublocations) | Get sublocations for location ID.                                    |
| [**getLocations**](LocationsApi.md#getLocations)                       | Get a list of all locations.                                         |
| [**getLocationsSearch**](LocationsApi.md#getLocationsSearch)           | Search locations using the q64 value returned from a previous search |
| [**patchLocation**](LocationsApi.md#patchLocation)                     | Update a location                                                    |
| [**postLocations**](LocationsApi.md#postLocations)                     | Create a location                                                    |
| [**postLocationsSearch**](LocationsApi.md#postLocationsSearch)         | Search locations                                                     |

{: class="table-striped"}

<a name="deleteLocation"></a>

# **deleteLocation**

> Void deleteLocation(locationId)

Delete a location

Wraps DELETE /api/v2/locations/{locationId}

Requires ALL permissions:

- directory:location:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | Location ID
try {
    apiInstance.deleteLocation(locationId);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **locationId** | **String** | Location ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getLocation"></a>

# **getLocation**

> [LocationDefinition](LocationDefinition.md) getLocation(locationId, expand)

Get Location by ID.

Wraps GET /api/v2/locations/{locationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | Location ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    LocationDefinition result = apiInstance.getLocation(locationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocation");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                     | Notes                                                          |
| -------------- | ----------------------------------- | ------------------------------- | -------------------------------------------------------------- |
| **locationId** | **String**                          | Location ID                     |
| **expand**     | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: images, addressVerificationDetails |

{: class="table-striped"}

### Return type

[**LocationDefinition**](LocationDefinition.md)

<a name="getLocationSublocations"></a>

# **getLocationSublocations**

> [LocationEntityListing](LocationEntityListing.md) getLocationSublocations(locationId)

Get sublocations for location ID.

Wraps GET /api/v2/locations/{locationId}/sublocations

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | Location ID
try {
    LocationEntityListing result = apiInstance.getLocationSublocations(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocationSublocations");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **locationId** | **String** | Location ID |

{: class="table-striped"}

### Return type

[**LocationEntityListing**](LocationEntityListing.md)

<a name="getLocations"></a>

# **getLocations**

> [LocationEntityListing](LocationEntityListing.md) getLocations(pageSize, pageNumber, id, sortOrder)

Get a list of all locations.

Wraps GET /api/v2/locations

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList("id_example"); // List<String> | id
String sortOrder = "sortOrder_example"; // String | Sort order
try {
    LocationEntityListing result = apiInstance.getLocations(pageSize, pageNumber, id, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocations");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description | Notes                                 |
| -------------- | ----------------------------------- | ----------- | ------------------------------------- |
| **pageSize**   | **Integer**                         | Page size   | [optional] [default to 25]            |
| **pageNumber** | **Integer**                         | Page number | [optional] [default to 1]             |
| **id**         | [**List&lt;String&gt;**](String.md) | id          | [optional]                            |
| **sortOrder**  | **String**                          | Sort order  | [optional]<br />**Values**: asc, desc |

{: class="table-striped"}

### Return type

[**LocationEntityListing**](LocationEntityListing.md)

<a name="getLocationsSearch"></a>

# **getLocationsSearch**

> [LocationsSearchResponse](LocationsSearchResponse.md) getLocationsSearch(q64, expand)

Search locations using the q64 value returned from a previous search

Wraps GET /api/v2/locations/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Provides more details about a specified resource
try {
    LocationsSearchResponse result = apiInstance.getLocationsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocationsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                                      | Notes                                                          |
| ---------- | ----------------------------------- | ------------------------------------------------ | -------------------------------------------------------------- |
| **q64**    | **String**                          | q64                                              |
| **expand** | [**List&lt;String&gt;**](String.md) | Provides more details about a specified resource | [optional]<br />**Values**: images, addressVerificationDetails |

{: class="table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.md)

<a name="patchLocation"></a>

# **patchLocation**

> [LocationDefinition](LocationDefinition.md) patchLocation(locationId, body)

Update a location

Wraps PATCH /api/v2/locations/{locationId}

Requires ALL permissions:

- directory:location:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | Location ID
LocationUpdateDefinition body = new LocationUpdateDefinition(); // LocationUpdateDefinition | Location
try {
    LocationDefinition result = apiInstance.patchLocation(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#patchLocation");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                                        | Description | Notes |
| -------------- | ----------------------------------------------------------- | ----------- | ----- |
| **locationId** | **String**                                                  | Location ID |
| **body**       | [**LocationUpdateDefinition**](LocationUpdateDefinition.md) | Location    |

{: class="table-striped"}

### Return type

[**LocationDefinition**](LocationDefinition.md)

<a name="postLocations"></a>

# **postLocations**

> [LocationDefinition](LocationDefinition.md) postLocations(body)

Create a location

Wraps POST /api/v2/locations

Requires ALL permissions:

- directory:location:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
LocationCreateDefinition body = new LocationCreateDefinition(); // LocationCreateDefinition | Location
try {
    LocationDefinition result = apiInstance.postLocations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#postLocations");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description | Notes |
| -------- | ----------------------------------------------------------- | ----------- | ----- |
| **body** | [**LocationCreateDefinition**](LocationCreateDefinition.md) | Location    |

{: class="table-striped"}

### Return type

[**LocationDefinition**](LocationDefinition.md)

<a name="postLocationsSearch"></a>

# **postLocationsSearch**

> [LocationsSearchResponse](LocationsSearchResponse.md) postLocationsSearch(body)

Search locations

Wraps POST /api/v2/locations/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LocationsApi apiInstance = new LocationsApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postLocationsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#postLocationsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description            | Notes |
| -------- | ----------------------------------------------------- | ---------------------- | ----- |
| **body** | [**LocationSearchRequest**](LocationSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.md)
