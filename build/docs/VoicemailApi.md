---
title: VoicemailApi
---

## VoicemailApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                     | Description                                                           |
| -------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| [**deleteVoicemailMessage**](VoicemailApi.md#deleteVoicemailMessage)       | Delete a voicemail message.                                           |
| [**deleteVoicemailMessages**](VoicemailApi.md#deleteVoicemailMessages)     | Delete all voicemail messages                                         |
| [**getVoicemailGroupMailbox**](VoicemailApi.md#getVoicemailGroupMailbox)   | Get the group&#39;s mailbox information                               |
| [**getVoicemailGroupMessages**](VoicemailApi.md#getVoicemailGroupMessages) | List voicemail messages                                               |
| [**getVoicemailGroupPolicy**](VoicemailApi.md#getVoicemailGroupPolicy)     | Get a group&#39;s voicemail policy                                    |
| [**getVoicemailMailbox**](VoicemailApi.md#getVoicemailMailbox)             | Get the current user&#39;s mailbox information                        |
| [**getVoicemailMeMailbox**](VoicemailApi.md#getVoicemailMeMailbox)         | Get the current user&#39;s mailbox information                        |
| [**getVoicemailMeMessages**](VoicemailApi.md#getVoicemailMeMessages)       | List voicemail messages                                               |
| [**getVoicemailMePolicy**](VoicemailApi.md#getVoicemailMePolicy)           | Get the current user&#39;s voicemail policy                           |
| [**getVoicemailMessage**](VoicemailApi.md#getVoicemailMessage)             | Get a voicemail message                                               |
| [**getVoicemailMessageMedia**](VoicemailApi.md#getVoicemailMessageMedia)   | Get media playback URI for this voicemail message                     |
| [**getVoicemailMessages**](VoicemailApi.md#getVoicemailMessages)           | List voicemail messages                                               |
| [**getVoicemailPolicy**](VoicemailApi.md#getVoicemailPolicy)               | Get a policy                                                          |
| [**getVoicemailQueueMessages**](VoicemailApi.md#getVoicemailQueueMessages) | List voicemail messages                                               |
| [**getVoicemailSearch**](VoicemailApi.md#getVoicemailSearch)               | Search voicemails using the q64 value returned from a previous search |
| [**getVoicemailUserpolicy**](VoicemailApi.md#getVoicemailUserpolicy)       | Get a user&#39;s voicemail policy                                     |
| [**patchVoicemailGroupPolicy**](VoicemailApi.md#patchVoicemailGroupPolicy) | Update a group&#39;s voicemail policy                                 |
| [**patchVoicemailMePolicy**](VoicemailApi.md#patchVoicemailMePolicy)       | Update the current user&#39;s voicemail policy                        |
| [**patchVoicemailMessage**](VoicemailApi.md#patchVoicemailMessage)         | Update a voicemail message                                            |
| [**patchVoicemailUserpolicy**](VoicemailApi.md#patchVoicemailUserpolicy)   | Update a user&#39;s voicemail policy                                  |
| [**postVoicemailMessages**](VoicemailApi.md#postVoicemailMessages)         | Copy a voicemail message to a user or group                           |
| [**postVoicemailSearch**](VoicemailApi.md#postVoicemailSearch)             | Search voicemails                                                     |
| [**putVoicemailMessage**](VoicemailApi.md#putVoicemailMessage)             | Update a voicemail message                                            |
| [**putVoicemailPolicy**](VoicemailApi.md#putVoicemailPolicy)               | Update a policy                                                       |
| [**putVoicemailUserpolicy**](VoicemailApi.md#putVoicemailUserpolicy)       | Update a user&#39;s voicemail policy                                  |

{: class="table-striped"}

<a name="deleteVoicemailMessage"></a>

# **deleteVoicemailMessage**

> Void deleteVoicemailMessage(messageId)

Delete a voicemail message.

A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.

Wraps DELETE /api/v2/voicemail/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
try {
    apiInstance.deleteVoicemailMessage(messageId);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **messageId** | **String** | Message ID  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteVoicemailMessages"></a>

# **deleteVoicemailMessages**

> Void deleteVoicemailMessages()

Delete all voicemail messages

Wraps DELETE /api/v2/voicemail/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    apiInstance.deleteVoicemailMessages();
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#deleteVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="getVoicemailGroupMailbox"></a>

# **getVoicemailGroupMailbox**

> [VoicemailMailboxInfo](VoicemailMailboxInfo.md) getVoicemailGroupMailbox(groupId)

Get the group&#39;s mailbox information

Wraps GET /api/v2/voicemail/groups/{groupId}/mailbox

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | groupId
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailGroupMailbox(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupMailbox");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **groupId** | **String** | groupId     |

{: class="table-striped"}

### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.md)

<a name="getVoicemailGroupMessages"></a>

# **getVoicemailGroupMessages**

> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.md) getVoicemailGroupMessages(groupId, pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/groups/{groupId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailGroupMessages(groupId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupMessages");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **groupId**    | **String**  | Group ID    |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.md)

<a name="getVoicemailGroupPolicy"></a>

# **getVoicemailGroupPolicy**

> [VoicemailGroupPolicy](VoicemailGroupPolicy.md) getVoicemailGroupPolicy(groupId)

Get a group&#39;s voicemail policy

Wraps GET /api/v2/voicemail/groups/{groupId}/policy

Requires ANY permissions:

- directory:group:add
- directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
try {
    VoicemailGroupPolicy result = apiInstance.getVoicemailGroupPolicy(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailGroupPolicy");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **groupId** | **String** | Group ID    |

{: class="table-striped"}

### Return type

[**VoicemailGroupPolicy**](VoicemailGroupPolicy.md)

<a name="getVoicemailMailbox"></a>

# **getVoicemailMailbox**

> [VoicemailMailboxInfo](VoicemailMailboxInfo.md) getVoicemailMailbox()

Get the current user&#39;s mailbox information

Wraps GET /api/v2/voicemail/mailbox

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailMailbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.md)

<a name="getVoicemailMeMailbox"></a>

# **getVoicemailMeMailbox**

> [VoicemailMailboxInfo](VoicemailMailboxInfo.md) getVoicemailMeMailbox()

Get the current user&#39;s mailbox information

Wraps GET /api/v2/voicemail/me/mailbox

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailMailboxInfo result = apiInstance.getVoicemailMeMailbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMeMailbox");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**VoicemailMailboxInfo**](VoicemailMailboxInfo.md)

<a name="getVoicemailMeMessages"></a>

# **getVoicemailMeMessages**

> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.md) getVoicemailMeMessages(pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/me/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailMeMessages(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMeMessages");
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

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.md)

<a name="getVoicemailMePolicy"></a>

# **getVoicemailMePolicy**

> [VoicemailUserPolicy](VoicemailUserPolicy.md) getVoicemailMePolicy()

Get the current user&#39;s voicemail policy

Wraps GET /api/v2/voicemail/me/policy

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailUserPolicy result = apiInstance.getVoicemailMePolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMePolicy");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

<a name="getVoicemailMessage"></a>

# **getVoicemailMessage**

> [VoicemailMessage](VoicemailMessage.md) getVoicemailMessage(messageId, expand)

Get a voicemail message

Wraps GET /api/v2/voicemail/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | If the caller is a known user, which fields, if any, to expand
try {
    VoicemailMessage result = apiInstance.getVoicemailMessage(messageId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description                                                    | Notes                                                                                                                                                            |
| ------------- | ----------------------------------- | -------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **messageId** | **String**                          | Message ID                                                     |
| **expand**    | [**List&lt;String&gt;**](String.md) | If the caller is a known user, which fields, if any, to expand | [optional]<br />**Values**: callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation |

{: class="table-striped"}

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

<a name="getVoicemailMessageMedia"></a>

# **getVoicemailMessageMedia**

> [VoicemailMediaInfo](VoicemailMediaInfo.md) getVoicemailMessageMedia(messageId, formatId)

Get media playback URI for this voicemail message

Wraps GET /api/v2/voicemail/messages/{messageId}/media

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
String formatId = "WEBM"; // String | The desired media format.
try {
    VoicemailMediaInfo result = apiInstance.getVoicemailMessageMedia(messageId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessageMedia");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description               | Notes                                                                                              |
| ------------- | ---------- | ------------------------- | -------------------------------------------------------------------------------------------------- |
| **messageId** | **String** | Message ID                |
| **formatId**  | **String** | The desired media format. | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE |

{: class="table-striped"}

### Return type

[**VoicemailMediaInfo**](VoicemailMediaInfo.md)

<a name="getVoicemailMessages"></a>

# **getVoicemailMessages**

> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.md) getVoicemailMessages(ids, expand)

List voicemail messages

Wraps GET /api/v2/voicemail/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String ids = "ids_example"; // String | An optional comma separated list of VoicemailMessage ids
List<String> expand = Arrays.asList("expand_example"); // List<String> | If the caller is a known user, which fields, if any, to expand
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailMessages(ids, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                                                    | Notes                                                                                                                                                            |
| ---------- | ----------------------------------- | -------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **ids**    | **String**                          | An optional comma separated list of VoicemailMessage ids       | [optional]                                                                                                                                                       |
| **expand** | [**List&lt;String&gt;**](String.md) | If the caller is a known user, which fields, if any, to expand | [optional]<br />**Values**: callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation |

{: class="table-striped"}

### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.md)

<a name="getVoicemailPolicy"></a>

# **getVoicemailPolicy**

> [VoicemailOrganizationPolicy](VoicemailOrganizationPolicy.md) getVoicemailPolicy()

Get a policy

Wraps GET /api/v2/voicemail/policy

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
try {
    VoicemailOrganizationPolicy result = apiInstance.getVoicemailPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailPolicy");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md)

<a name="getVoicemailQueueMessages"></a>

# **getVoicemailQueueMessages**

> [VoicemailMessageEntityListing](VoicemailMessageEntityListing.md) getVoicemailQueueMessages(queueId, pageSize, pageNumber)

List voicemail messages

Wraps GET /api/v2/voicemail/queues/{queueId}/messages

Requires ANY permissions:

- voicemail:acdvoicemail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    VoicemailMessageEntityListing result = apiInstance.getVoicemailQueueMessages(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailQueueMessages");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **queueId**    | **String**  | Queue ID    |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**VoicemailMessageEntityListing**](VoicemailMessageEntityListing.md)

<a name="getVoicemailSearch"></a>

# **getVoicemailSearch**

> [VoicemailsSearchResponse](VoicemailsSearchResponse.md) getVoicemailSearch(q64, expand)

Search voicemails using the q64 value returned from a previous search

Wraps GET /api/v2/voicemail/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    VoicemailsSearchResponse result = apiInstance.getVoicemailSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description | Notes      |
| ---------- | ----------------------------------- | ----------- | ---------- |
| **q64**    | **String**                          | q64         |
| **expand** | [**List&lt;String&gt;**](String.md) | expand      | [optional] |

{: class="table-striped"}

### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.md)

<a name="getVoicemailUserpolicy"></a>

# **getVoicemailUserpolicy**

> [VoicemailUserPolicy](VoicemailUserPolicy.md) getVoicemailUserpolicy(userId)

Get a user&#39;s voicemail policy

Wraps GET /api/v2/voicemail/userpolicies/{userId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
try {
    VoicemailUserPolicy result = apiInstance.getVoicemailUserpolicy(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

<a name="patchVoicemailGroupPolicy"></a>

# **patchVoicemailGroupPolicy**

> [VoicemailGroupPolicy](VoicemailGroupPolicy.md) patchVoicemailGroupPolicy(groupId, body)

Update a group&#39;s voicemail policy

Wraps PATCH /api/v2/voicemail/groups/{groupId}/policy

Requires ANY permissions:

- directory:group:add
- directory:group:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String groupId = "groupId_example"; // String | Group ID
VoicemailGroupPolicy body = new VoicemailGroupPolicy(); // VoicemailGroupPolicy | The group's voicemail policy
try {
    VoicemailGroupPolicy result = apiInstance.patchVoicemailGroupPolicy(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailGroupPolicy");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                | Description                      | Notes |
| ----------- | --------------------------------------------------- | -------------------------------- | ----- |
| **groupId** | **String**                                          | Group ID                         |
| **body**    | [**VoicemailGroupPolicy**](VoicemailGroupPolicy.md) | The group&#39;s voicemail policy |

{: class="table-striped"}

### Return type

[**VoicemailGroupPolicy**](VoicemailGroupPolicy.md)

<a name="patchVoicemailMePolicy"></a>

# **patchVoicemailMePolicy**

> [VoicemailUserPolicy](VoicemailUserPolicy.md) patchVoicemailMePolicy(body)

Update the current user&#39;s voicemail policy

Wraps PATCH /api/v2/voicemail/me/policy

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.patchVoicemailMePolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailMePolicy");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description                     | Notes |
| -------- | ------------------------------------------------- | ------------------------------- | ----- |
| **body** | [**VoicemailUserPolicy**](VoicemailUserPolicy.md) | The user&#39;s voicemail policy |

{: class="table-striped"}

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

<a name="patchVoicemailMessage"></a>

# **patchVoicemailMessage**

> [VoicemailMessage](VoicemailMessage.md) patchVoicemailMessage(messageId, body)

Update a voicemail message

A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.

Wraps PATCH /api/v2/voicemail/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
VoicemailMessage body = new VoicemailMessage(); // VoicemailMessage | VoicemailMessage
try {
    VoicemailMessage result = apiInstance.patchVoicemailMessage(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                        | Description      | Notes |
| ------------- | ------------------------------------------- | ---------------- | ----- |
| **messageId** | **String**                                  | Message ID       |
| **body**      | [**VoicemailMessage**](VoicemailMessage.md) | VoicemailMessage |

{: class="table-striped"}

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

<a name="patchVoicemailUserpolicy"></a>

# **patchVoicemailUserpolicy**

> [VoicemailUserPolicy](VoicemailUserPolicy.md) patchVoicemailUserpolicy(userId, body)

Update a user&#39;s voicemail policy

Wraps PATCH /api/v2/voicemail/userpolicies/{userId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.patchVoicemailUserpolicy(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                              | Description                     | Notes |
| ---------- | ------------------------------------------------- | ------------------------------- | ----- |
| **userId** | **String**                                        | User ID                         |
| **body**   | [**VoicemailUserPolicy**](VoicemailUserPolicy.md) | The user&#39;s voicemail policy |

{: class="table-striped"}

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)

<a name="postVoicemailMessages"></a>

# **postVoicemailMessages**

> [VoicemailMessage](VoicemailMessage.md) postVoicemailMessages(body)

Copy a voicemail message to a user or group

Wraps POST /api/v2/voicemail/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
CopyVoicemailMessage body = new CopyVoicemailMessage(); // CopyVoicemailMessage |
try {
    VoicemailMessage result = apiInstance.postVoicemailMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#postVoicemailMessages");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes      |
| -------- | --------------------------------------------------- | ----------- | ---------- |
| **body** | [**CopyVoicemailMessage**](CopyVoicemailMessage.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

<a name="postVoicemailSearch"></a>

# **postVoicemailSearch**

> [VoicemailsSearchResponse](VoicemailsSearchResponse.md) postVoicemailSearch(body)

Search voicemails

Wraps POST /api/v2/voicemail/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailSearchRequest body = new VoicemailSearchRequest(); // VoicemailSearchRequest | Search request options
try {
    VoicemailsSearchResponse result = apiInstance.postVoicemailSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#postVoicemailSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description            | Notes |
| -------- | ------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**VoicemailSearchRequest**](VoicemailSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**VoicemailsSearchResponse**](VoicemailsSearchResponse.md)

<a name="putVoicemailMessage"></a>

# **putVoicemailMessage**

> [VoicemailMessage](VoicemailMessage.md) putVoicemailMessage(messageId, body)

Update a voicemail message

A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.

Wraps PUT /api/v2/voicemail/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String messageId = "messageId_example"; // String | Message ID
VoicemailMessage body = new VoicemailMessage(); // VoicemailMessage | VoicemailMessage
try {
    VoicemailMessage result = apiInstance.putVoicemailMessage(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailMessage");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                        | Description      | Notes |
| ------------- | ------------------------------------------- | ---------------- | ----- |
| **messageId** | **String**                                  | Message ID       |
| **body**      | [**VoicemailMessage**](VoicemailMessage.md) | VoicemailMessage |

{: class="table-striped"}

### Return type

[**VoicemailMessage**](VoicemailMessage.md)

<a name="putVoicemailPolicy"></a>

# **putVoicemailPolicy**

> [VoicemailOrganizationPolicy](VoicemailOrganizationPolicy.md) putVoicemailPolicy(body)

Update a policy

Wraps PUT /api/v2/voicemail/policy

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
VoicemailOrganizationPolicy body = new VoicemailOrganizationPolicy(); // VoicemailOrganizationPolicy | Policy
try {
    VoicemailOrganizationPolicy result = apiInstance.putVoicemailPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailPolicy");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                              | Description | Notes |
| -------- | ----------------------------------------------------------------- | ----------- | ----- |
| **body** | [**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md) | Policy      |

{: class="table-striped"}

### Return type

[**VoicemailOrganizationPolicy**](VoicemailOrganizationPolicy.md)

<a name="putVoicemailUserpolicy"></a>

# **putVoicemailUserpolicy**

> [VoicemailUserPolicy](VoicemailUserPolicy.md) putVoicemailUserpolicy(userId, body)

Update a user&#39;s voicemail policy

Wraps PUT /api/v2/voicemail/userpolicies/{userId}

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VoicemailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VoicemailApi apiInstance = new VoicemailApi();
String userId = "userId_example"; // String | User ID
VoicemailUserPolicy body = new VoicemailUserPolicy(); // VoicemailUserPolicy | The user's voicemail policy
try {
    VoicemailUserPolicy result = apiInstance.putVoicemailUserpolicy(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#putVoicemailUserpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                              | Description                     | Notes |
| ---------- | ------------------------------------------------- | ------------------------------- | ----- |
| **userId** | **String**                                        | User ID                         |
| **body**   | [**VoicemailUserPolicy**](VoicemailUserPolicy.md) | The user&#39;s voicemail policy |

{: class="table-striped"}

### Return type

[**VoicemailUserPolicy**](VoicemailUserPolicy.md)
