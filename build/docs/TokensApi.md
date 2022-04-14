---
title: TokensApi
---

## TokensApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                            | Description                                    |
| ------------------------------------------------- | ---------------------------------------------- |
| [**deleteToken**](TokensApi.md#deleteToken)       | Delete all auth tokens for the specified user. |
| [**deleteTokensMe**](TokensApi.md#deleteTokensMe) | Delete auth token used to make the request.    |
| [**getTokensMe**](TokensApi.md#getTokensMe)       | Fetch information about the current token      |
| [**headTokensMe**](TokensApi.md#headTokensMe)     | Verify user token                              |

{: class="table-striped"}

<a name="deleteToken"></a>

# **deleteToken**

> Void deleteToken(userId)

Delete all auth tokens for the specified user.

Wraps DELETE /api/v2/tokens/{userId}

Requires ANY permissions:

- oauth:token:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteToken(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTokensMe"></a>

# **deleteTokensMe**

> Void deleteTokensMe()

Delete auth token used to make the request.

Wraps DELETE /api/v2/tokens/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    apiInstance.deleteTokensMe();
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="getTokensMe"></a>

# **getTokensMe**

> [TokenInfo](TokenInfo.md) getTokensMe()

Fetch information about the current token

Wraps GET /api/v2/tokens/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    TokenInfo result = apiInstance.getTokensMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#getTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**TokenInfo**](TokenInfo.md)

<a name="headTokensMe"></a>

# **headTokensMe**

> Void headTokensMe()

Verify user token

Wraps HEAD /api/v2/tokens/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    apiInstance.headTokensMe();
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#headTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)
