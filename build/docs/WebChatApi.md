---
title: WebChatApi
---

## WebChatApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                     | Description                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| [**deleteWebchatDeployment**](WebChatApi.md#deleteWebchatDeployment)                                       | Delete a WebChat deployment                                                                |
| [**deleteWebchatGuestConversationMember**](WebChatApi.md#deleteWebchatGuestConversationMember)             | Remove a member from a chat conversation                                                   |
| [**deleteWebchatSettings**](WebChatApi.md#deleteWebchatSettings)                                           | Remove WebChat deployment settings                                                         |
| [**getWebchatDeployment**](WebChatApi.md#getWebchatDeployment)                                             | Get a WebChat deployment                                                                   |
| [**getWebchatDeployments**](WebChatApi.md#getWebchatDeployments)                                           | List WebChat deployments                                                                   |
| [**getWebchatGuestConversationMediarequest**](WebChatApi.md#getWebchatGuestConversationMediarequest)       | Get a media request in the conversation                                                    |
| [**getWebchatGuestConversationMediarequests**](WebChatApi.md#getWebchatGuestConversationMediarequests)     | Get all media requests to the guest in the conversation                                    |
| [**getWebchatGuestConversationMember**](WebChatApi.md#getWebchatGuestConversationMember)                   | Get a web chat conversation member                                                         |
| [**getWebchatGuestConversationMembers**](WebChatApi.md#getWebchatGuestConversationMembers)                 | Get the members of a chat conversation.                                                    |
| [**getWebchatGuestConversationMessage**](WebChatApi.md#getWebchatGuestConversationMessage)                 | Get a web chat conversation message                                                        |
| [**getWebchatGuestConversationMessages**](WebChatApi.md#getWebchatGuestConversationMessages)               | Get the messages of a chat conversation.                                                   |
| [**getWebchatSettings**](WebChatApi.md#getWebchatSettings)                                                 | Get WebChat deployment settings                                                            |
| [**patchWebchatGuestConversationMediarequest**](WebChatApi.md#patchWebchatGuestConversationMediarequest)   | Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED |
| [**postWebchatDeployments**](WebChatApi.md#postWebchatDeployments)                                         | Create WebChat deployment                                                                  |
| [**postWebchatGuestConversationMemberMessages**](WebChatApi.md#postWebchatGuestConversationMemberMessages) | Send a message in a chat conversation.                                                     |
| [**postWebchatGuestConversationMemberTyping**](WebChatApi.md#postWebchatGuestConversationMemberTyping)     | Send a typing-indicator in a chat conversation.                                            |
| [**postWebchatGuestConversations**](WebChatApi.md#postWebchatGuestConversations)                           | Create an ACD chat conversation from an external customer.                                 |
| [**putWebchatDeployment**](WebChatApi.md#putWebchatDeployment)                                             | Update a WebChat deployment                                                                |
| [**putWebchatSettings**](WebChatApi.md#putWebchatSettings)                                                 | Update WebChat deployment settings                                                         |

{: class="table-striped"}

<a name="deleteWebchatDeployment"></a>

# **deleteWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteWebchatDeployment(deploymentId)

Delete a WebChat deployment

Wraps DELETE /api/v2/webchat/deployments/{deploymentId}

Requires ANY permissions:

- webchat:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
try {
    apiInstance.deleteWebchatDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#deleteWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description   | Notes |
| ---------------- | ---------- | ------------- | ----- |
| **deploymentId** | **String** | Deployment Id |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWebchatGuestConversationMember"></a>

# **deleteWebchatGuestConversationMember**

> Void deleteWebchatGuestConversationMember(conversationId, memberId)

Remove a member from a chat conversation

Wraps DELETE /api/v2/webchat/guest/conversations/{conversationId}/members/{memberId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String memberId = "memberId_example"; // String | memberId
try {
    apiInstance.deleteWebchatGuestConversationMember(conversationId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#deleteWebchatGuestConversationMember");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **memberId**       | **String** | memberId       |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWebchatSettings"></a>

# **deleteWebchatSettings**

> Void deleteWebchatSettings()

Remove WebChat deployment settings

Wraps DELETE /api/v2/webchat/settings

Requires ANY permissions:

- webchat:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    apiInstance.deleteWebchatSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#deleteWebchatSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="getWebchatDeployment"></a>

# **getWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.md) getWebchatDeployment(deploymentId)

Get a WebChat deployment

Wraps GET /api/v2/webchat/deployments/{deploymentId}

Requires ANY permissions:

- webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
try {
    WebChatDeployment result = apiInstance.getWebchatDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description   | Notes |
| ---------------- | ---------- | ------------- | ----- |
| **deploymentId** | **String** | Deployment Id |

{: class="table-striped"}

### Return type

[**WebChatDeployment**](WebChatDeployment.md)

<a name="getWebchatDeployments"></a>

# **getWebchatDeployments**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeploymentEntityListing](WebChatDeploymentEntityListing.md) getWebchatDeployments()

List WebChat deployments

Wraps GET /api/v2/webchat/deployments

Requires ANY permissions:

- webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    WebChatDeploymentEntityListing result = apiInstance.getWebchatDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatDeployments");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**WebChatDeploymentEntityListing**](WebChatDeploymentEntityListing.md)

<a name="getWebchatGuestConversationMediarequest"></a>

# **getWebchatGuestConversationMediarequest**

> [WebChatGuestMediaRequest](WebChatGuestMediaRequest.md) getWebchatGuestConversationMediarequest(conversationId, mediaRequestId)

Get a media request in the conversation

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/mediarequests/{mediaRequestId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String mediaRequestId = "mediaRequestId_example"; // String | mediaRequestId
try {
    WebChatGuestMediaRequest result = apiInstance.getWebchatGuestConversationMediarequest(conversationId, mediaRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMediarequest");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **mediaRequestId** | **String** | mediaRequestId |

{: class="table-striped"}

### Return type

[**WebChatGuestMediaRequest**](WebChatGuestMediaRequest.md)

<a name="getWebchatGuestConversationMediarequests"></a>

# **getWebchatGuestConversationMediarequests**

> [WebChatGuestMediaRequestEntityList](WebChatGuestMediaRequestEntityList.md) getWebchatGuestConversationMediarequests(conversationId)

Get all media requests to the guest in the conversation

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/mediarequests

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    WebChatGuestMediaRequestEntityList result = apiInstance.getWebchatGuestConversationMediarequests(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMediarequests");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**WebChatGuestMediaRequestEntityList**](WebChatGuestMediaRequestEntityList.md)

<a name="getWebchatGuestConversationMember"></a>

# **getWebchatGuestConversationMember**

> [WebChatMemberInfo](WebChatMemberInfo.md) getWebchatGuestConversationMember(conversationId, memberId)

Get a web chat conversation member

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/members/{memberId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String memberId = "memberId_example"; // String | memberId
try {
    WebChatMemberInfo result = apiInstance.getWebchatGuestConversationMember(conversationId, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMember");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **memberId**       | **String** | memberId       |

{: class="table-striped"}

### Return type

[**WebChatMemberInfo**](WebChatMemberInfo.md)

<a name="getWebchatGuestConversationMembers"></a>

# **getWebchatGuestConversationMembers**

> [WebChatMemberInfoEntityList](WebChatMemberInfoEntityList.md) getWebchatGuestConversationMembers(conversationId, pageSize, pageNumber, excludeDisconnectedMembers)

Get the members of a chat conversation.

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/members

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
Integer pageSize = 25; // Integer | The number of entries to return per page, or omitted for the default.
Integer pageNumber = 1; // Integer | The page number to return, or omitted for the first page.
Boolean excludeDisconnectedMembers = false; // Boolean | If true, the results will not contain members who have a DISCONNECTED state.
try {
    WebChatMemberInfoEntityList result = apiInstance.getWebchatGuestConversationMembers(conversationId, pageSize, pageNumber, excludeDisconnectedMembers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMembers");
    e.printStackTrace();
}
```

### Parameters

| Name                           | Type        | Description                                                                  | Notes                         |
| ------------------------------ | ----------- | ---------------------------------------------------------------------------- | ----------------------------- |
| **conversationId**             | **String**  | conversationId                                                               |
| **pageSize**                   | **Integer** | The number of entries to return per page, or omitted for the default.        | [optional] [default to 25]    |
| **pageNumber**                 | **Integer** | The page number to return, or omitted for the first page.                    | [optional] [default to 1]     |
| **excludeDisconnectedMembers** | **Boolean** | If true, the results will not contain members who have a DISCONNECTED state. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**WebChatMemberInfoEntityList**](WebChatMemberInfoEntityList.md)

<a name="getWebchatGuestConversationMessage"></a>

# **getWebchatGuestConversationMessage**

> [WebChatMessage](WebChatMessage.md) getWebchatGuestConversationMessage(conversationId, messageId)

Get a web chat conversation message

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    WebChatMessage result = apiInstance.getWebchatGuestConversationMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **messageId**      | **String** | messageId      |

{: class="table-striped"}

### Return type

[**WebChatMessage**](WebChatMessage.md)

<a name="getWebchatGuestConversationMessages"></a>

# **getWebchatGuestConversationMessages**

> [WebChatMessageEntityList](WebChatMessageEntityList.md) getWebchatGuestConversationMessages(conversationId, after, before, sortOrder, maxResults)

Get the messages of a chat conversation.

Wraps GET /api/v2/webchat/guest/conversations/{conversationId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String after = "after_example"; // String | If available, get the messages chronologically after the id of this message
String before = "before_example"; // String | If available, get the messages chronologically before the id of this message
String sortOrder = "ascending"; // String | Sort order
Integer maxResults = 100; // Integer | Limit the returned number of messages, up to a maximum of 100
try {
    WebChatMessageEntityList result = apiInstance.getWebchatGuestConversationMessages(conversationId, after, before, sortOrder, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatGuestConversationMessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                                                  | Notes                                                                    |
| ------------------ | ----------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| **conversationId** | **String**  | conversationId                                                               |
| **after**          | **String**  | If available, get the messages chronologically after the id of this message  | [optional]                                                               |
| **before**         | **String**  | If available, get the messages chronologically before the id of this message | [optional]                                                               |
| **sortOrder**      | **String**  | Sort order                                                                   | [optional] [default to ascending]<br />**Values**: ascending, descending |
| **maxResults**     | **Integer** | Limit the returned number of messages, up to a maximum of 100                | [optional] [default to 100]                                              |

{: class="table-striped"}

### Return type

[**WebChatMessageEntityList**](WebChatMessageEntityList.md)

<a name="getWebchatSettings"></a>

# **getWebchatSettings**

> [WebChatSettings](WebChatSettings.md) getWebchatSettings()

Get WebChat deployment settings

Wraps GET /api/v2/webchat/settings

Requires ANY permissions:

- webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    WebChatSettings result = apiInstance.getWebchatSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**WebChatSettings**](WebChatSettings.md)

<a name="patchWebchatGuestConversationMediarequest"></a>

# **patchWebchatGuestConversationMediarequest**

> [WebChatGuestMediaRequest](WebChatGuestMediaRequest.md) patchWebchatGuestConversationMediarequest(conversationId, mediaRequestId, body)

Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED

Wraps PATCH /api/v2/webchat/guest/conversations/{conversationId}/mediarequests/{mediaRequestId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String mediaRequestId = "mediaRequestId_example"; // String | mediaRequestId
WebChatGuestMediaRequest body = new WebChatGuestMediaRequest(); // WebChatGuestMediaRequest | Request
try {
    WebChatGuestMediaRequest result = apiInstance.patchWebchatGuestConversationMediarequest(conversationId, mediaRequestId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#patchWebchatGuestConversationMediarequest");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                        | Description    | Notes |
| ------------------ | ----------------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                                  | conversationId |
| **mediaRequestId** | **String**                                                  | mediaRequestId |
| **body**           | [**WebChatGuestMediaRequest**](WebChatGuestMediaRequest.md) | Request        |

{: class="table-striped"}

### Return type

[**WebChatGuestMediaRequest**](WebChatGuestMediaRequest.md)

<a name="postWebchatDeployments"></a>

# **postWebchatDeployments**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.md) postWebchatDeployments(body)

Create WebChat deployment

Wraps POST /api/v2/webchat/deployments

Requires ANY permissions:

- webchat:deployment:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
WebChatDeployment body = new WebChatDeployment(); // WebChatDeployment | Deployment
try {
    WebChatDeployment result = apiInstance.postWebchatDeployments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#postWebchatDeployments");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description | Notes |
| -------- | --------------------------------------------- | ----------- | ----- |
| **body** | [**WebChatDeployment**](WebChatDeployment.md) | Deployment  |

{: class="table-striped"}

### Return type

[**WebChatDeployment**](WebChatDeployment.md)

<a name="postWebchatGuestConversationMemberMessages"></a>

# **postWebchatGuestConversationMemberMessages**

> [WebChatMessage](WebChatMessage.md) postWebchatGuestConversationMemberMessages(conversationId, memberId, body)

Send a message in a chat conversation.

Wraps POST /api/v2/webchat/guest/conversations/{conversationId}/members/{memberId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String memberId = "memberId_example"; // String | memberId
CreateWebChatMessageRequest body = new CreateWebChatMessageRequest(); // CreateWebChatMessageRequest | Message
try {
    WebChatMessage result = apiInstance.postWebchatGuestConversationMemberMessages(conversationId, memberId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#postWebchatGuestConversationMemberMessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                              | Description    | Notes |
| ------------------ | ----------------------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                                        | conversationId |
| **memberId**       | **String**                                                        | memberId       |
| **body**           | [**CreateWebChatMessageRequest**](CreateWebChatMessageRequest.md) | Message        |

{: class="table-striped"}

### Return type

[**WebChatMessage**](WebChatMessage.md)

<a name="postWebchatGuestConversationMemberTyping"></a>

# **postWebchatGuestConversationMemberTyping**

> [WebChatTyping](WebChatTyping.md) postWebchatGuestConversationMemberTyping(conversationId, memberId)

Send a typing-indicator in a chat conversation.

Wraps POST /api/v2/webchat/guest/conversations/{conversationId}/members/{memberId}/typing

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Guest Chat JWT
ApiKeyAuth Guest Chat JWT = (ApiKeyAuth) defaultClient.getAuthentication("Guest Chat JWT");
Guest Chat JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Guest Chat JWT.setApiKeyPrefix("Token");

WebChatApi apiInstance = new WebChatApi();
String conversationId = "conversationId_example"; // String | conversationId
String memberId = "memberId_example"; // String | memberId
try {
    WebChatTyping result = apiInstance.postWebchatGuestConversationMemberTyping(conversationId, memberId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#postWebchatGuestConversationMemberTyping");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **memberId**       | **String** | memberId       |

{: class="table-striped"}

### Return type

[**WebChatTyping**](WebChatTyping.md)

<a name="postWebchatGuestConversations"></a>

# **postWebchatGuestConversations**

> [CreateWebChatConversationResponse](CreateWebChatConversationResponse.md) postWebchatGuestConversations(body)

Create an ACD chat conversation from an external customer.

This endpoint will create a new ACD Chat conversation under the specified Chat Deployment. The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted. The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.

Wraps POST /api/v2/webchat/guest/conversations

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebChatApi;


WebChatApi apiInstance = new WebChatApi();
CreateWebChatConversationRequest body = new CreateWebChatConversationRequest(); // CreateWebChatConversationRequest | CreateConversationRequest
try {
    CreateWebChatConversationResponse result = apiInstance.postWebchatGuestConversations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#postWebchatGuestConversations");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                        | Description               | Notes |
| -------- | --------------------------------------------------------------------------- | ------------------------- | ----- |
| **body** | [**CreateWebChatConversationRequest**](CreateWebChatConversationRequest.md) | CreateConversationRequest |

{: class="table-striped"}

### Return type

[**CreateWebChatConversationResponse**](CreateWebChatConversationResponse.md)

<a name="putWebchatDeployment"></a>

# **putWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.md) putWebchatDeployment(deploymentId, body)

Update a WebChat deployment

Wraps PUT /api/v2/webchat/deployments/{deploymentId}

Requires ANY permissions:

- webchat:deployment:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
WebChatDeployment body = new WebChatDeployment(); // WebChatDeployment | Deployment
try {
    WebChatDeployment result = apiInstance.putWebchatDeployment(deploymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#putWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                          | Description   | Notes |
| ---------------- | --------------------------------------------- | ------------- | ----- |
| **deploymentId** | **String**                                    | Deployment Id |
| **body**         | [**WebChatDeployment**](WebChatDeployment.md) | Deployment    |

{: class="table-striped"}

### Return type

[**WebChatDeployment**](WebChatDeployment.md)

<a name="putWebchatSettings"></a>

# **putWebchatSettings**

> [WebChatSettings](WebChatSettings.md) putWebchatSettings(body)

Update WebChat deployment settings

Wraps PUT /api/v2/webchat/settings

Requires ANY permissions:

- webchat:deployment:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
WebChatSettings body = new WebChatSettings(); // WebChatSettings | webChatSettings
try {
    WebChatSettings result = apiInstance.putWebchatSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#putWebchatSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description     | Notes |
| -------- | ----------------------------------------- | --------------- | ----- |
| **body** | [**WebChatSettings**](WebChatSettings.md) | webChatSettings |

{: class="table-striped"}

### Return type

[**WebChatSettings**](WebChatSettings.md)
