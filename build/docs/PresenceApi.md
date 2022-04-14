---
title: PresenceApi
---

## PresenceApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                              | Description                                            |
| ----------------------------------------------------------------------------------- | ------------------------------------------------------ |
| [**deletePresencedefinition**](PresenceApi.md#deletePresencedefinition)             | Delete a Presence Definition                           |
| [**getPresencedefinition**](PresenceApi.md#getPresencedefinition)                   | Get a Presence Definition                              |
| [**getPresencedefinitions**](PresenceApi.md#getPresencedefinitions)                 | Get an Organization&#39;s list of Presence Definitions |
| [**getSystempresences**](PresenceApi.md#getSystempresences)                         | Get the list of SystemPresences                        |
| [**getUserPresence**](PresenceApi.md#getUserPresence)                               | Get a user&#39;s Presence                              |
| [**getUserPresencesMicrosoftteams**](PresenceApi.md#getUserPresencesMicrosoftteams) | Get a user&#39;s Microsoft Teams presence.             |
| [**getUserPresencesPurecloud**](PresenceApi.md#getUserPresencesPurecloud)           | Get a user&#39;s Genesys Cloud presence.               |
| [**getUserPresencesZoomphone**](PresenceApi.md#getUserPresencesZoomphone)           | Get a user&#39;s Zoom Phone presence.                  |
| [**patchUserPresence**](PresenceApi.md#patchUserPresence)                           | Patch a user&#39;s Presence                            |
| [**patchUserPresencesPurecloud**](PresenceApi.md#patchUserPresencesPurecloud)       | Patch a Genesys Cloud user&#39;s presence              |
| [**postPresencedefinitions**](PresenceApi.md#postPresencedefinitions)               | Create a Presence Definition                           |
| [**putPresencedefinition**](PresenceApi.md#putPresencedefinition)                   | Update a Presence Definition                           |
| [**putUsersPresencesBulk**](PresenceApi.md#putUsersPresencesBulk)                   | Update bulk user Presences                             |

{: class="table-striped"}

<a name="deletePresencedefinition"></a>

# **deletePresencedefinition**

> Void deletePresencedefinition(presenceId)

Delete a Presence Definition

Wraps DELETE /api/v2/presencedefinitions/{presenceId}

Requires ALL permissions:

- presence:presenceDefinition:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
try {
    apiInstance.deletePresencedefinition(presenceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#deletePresencedefinition");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description              | Notes |
| -------------- | ---------- | ------------------------ | ----- |
| **presenceId** | **String** | Organization Presence ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getPresencedefinition"></a>

# **getPresencedefinition**

> [OrganizationPresence](OrganizationPresence.md) getPresencedefinition(presenceId, localeCode)

Get a Presence Definition

Wraps GET /api/v2/presencedefinitions/{presenceId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
String localeCode = "localeCode_example"; // String | The locale code to fetch for the presence definition. Use ALL to fetch everything.
try {
    OrganizationPresence result = apiInstance.getPresencedefinition(presenceId, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresencedefinition");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                                                                        | Notes      |
| -------------- | ---------- | ---------------------------------------------------------------------------------- | ---------- |
| **presenceId** | **String** | Organization Presence ID                                                           |
| **localeCode** | **String** | The locale code to fetch for the presence definition. Use ALL to fetch everything. | [optional] |

{: class="table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.md)

<a name="getPresencedefinitions"></a>

# **getPresencedefinitions**

> [OrganizationPresenceEntityListing](OrganizationPresenceEntityListing.md) getPresencedefinitions(pageNumber, pageSize, deleted, localeCode)

Get an Organization&#39;s list of Presence Definitions

Wraps GET /api/v2/presencedefinitions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String deleted = "false"; // String | Deleted query can be TRUE, FALSE or ALL
String localeCode = "localeCode_example"; // String | The locale code to fetch for each presence definition. Use ALL to fetch everything.
try {
    OrganizationPresenceEntityListing result = apiInstance.getPresencedefinitions(pageNumber, pageSize, deleted, localeCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getPresencedefinitions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                                                         | Notes                         |
| -------------- | ----------- | ----------------------------------------------------------------------------------- | ----------------------------- |
| **pageNumber** | **Integer** | Page number                                                                         | [optional] [default to 1]     |
| **pageSize**   | **Integer** | Page size                                                                           | [optional] [default to 25]    |
| **deleted**    | **String**  | Deleted query can be TRUE, FALSE or ALL                                             | [optional] [default to false] |
| **localeCode** | **String**  | The locale code to fetch for each presence definition. Use ALL to fetch everything. | [optional]                    |

{: class="table-striped"}

### Return type

[**OrganizationPresenceEntityListing**](OrganizationPresenceEntityListing.md)

<a name="getSystempresences"></a>

# **getSystempresences**

> [List&lt;SystemPresence&gt;](SystemPresence.md) getSystempresences()

Get the list of SystemPresences

Wraps GET /api/v2/systempresences

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
try {
    List<SystemPresence> result = apiInstance.getSystempresences();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getSystempresences");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**List&lt;SystemPresence&gt;**](SystemPresence.md)

<a name="getUserPresence"></a>

# **getUserPresence**

> [UserPresence](UserPresence.md) getUserPresence(userId, sourceId)

Get a user&#39;s Presence

Get a user&#39;s presence for the specified source that is not specifically listed. Used to support custom presence sources.

Wraps GET /api/v2/users/{userId}/presences/{sourceId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Presence source ID
try {
    UserPresence result = apiInstance.getUserPresence(userId, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresence");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description        | Notes |
| ------------ | ---------- | ------------------ | ----- |
| **userId**   | **String** | user Id            |
| **sourceId** | **String** | Presence source ID |

{: class="table-striped"}

### Return type

[**UserPresence**](UserPresence.md)

<a name="getUserPresencesMicrosoftteams"></a>

# **getUserPresencesMicrosoftteams**

> [PresenceExpand](PresenceExpand.md) getUserPresencesMicrosoftteams(userId)

Get a user&#39;s Microsoft Teams presence.

Gets the presence for a Microsoft Teams user. This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.

Wraps GET /api/v2/users/{userId}/presences/microsoftteams

Requires ANY permissions:

- integration:microsoftTeams:view
- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
try {
    PresenceExpand result = apiInstance.getUserPresencesMicrosoftteams(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresencesMicrosoftteams");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | user Id     |

{: class="table-striped"}

### Return type

[**PresenceExpand**](PresenceExpand.md)

<a name="getUserPresencesPurecloud"></a>

# **getUserPresencesPurecloud**

> [UserPresence](UserPresence.md) getUserPresencesPurecloud(userId)

Get a user&#39;s Genesys Cloud presence.

Get the default Genesys Cloud user presence source PURECLOUD

Wraps GET /api/v2/users/{userId}/presences/purecloud

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
try {
    UserPresence result = apiInstance.getUserPresencesPurecloud(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresencesPurecloud");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | user Id     |

{: class="table-striped"}

### Return type

[**UserPresence**](UserPresence.md)

<a name="getUserPresencesZoomphone"></a>

# **getUserPresencesZoomphone**

> [PresenceExpand](PresenceExpand.md) getUserPresencesZoomphone(userId)

Get a user&#39;s Zoom Phone presence.

Gets the presence for a Zoom user. This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.

Wraps GET /api/v2/users/{userId}/presences/zoomphone

Requires ANY permissions:

- integration:zoomPhone:view
- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
try {
    PresenceExpand result = apiInstance.getUserPresencesZoomphone(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#getUserPresencesZoomphone");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | user Id     |

{: class="table-striped"}

### Return type

[**PresenceExpand**](PresenceExpand.md)

<a name="patchUserPresence"></a>

# **patchUserPresence**

> [UserPresence](UserPresence.md) patchUserPresence(userId, sourceId, body)

Patch a user&#39;s Presence

Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

Wraps PATCH /api/v2/users/{userId}/presences/{sourceId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
String sourceId = "sourceId_example"; // String | Presence source ID
UserPresence body = new UserPresence(); // UserPresence | User presence
try {
    UserPresence result = apiInstance.patchUserPresence(userId, sourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#patchUserPresence");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                | Description        | Notes |
| ------------ | ----------------------------------- | ------------------ | ----- |
| **userId**   | **String**                          | user Id            |
| **sourceId** | **String**                          | Presence source ID |
| **body**     | [**UserPresence**](UserPresence.md) | User presence      |

{: class="table-striped"}

### Return type

[**UserPresence**](UserPresence.md)

<a name="patchUserPresencesPurecloud"></a>

# **patchUserPresencesPurecloud**

> [UserPresence](UserPresence.md) patchUserPresencesPurecloud(userId, body)

Patch a Genesys Cloud user&#39;s presence

The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.

Wraps PATCH /api/v2/users/{userId}/presences/purecloud

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String userId = "userId_example"; // String | user Id
UserPresence body = new UserPresence(); // UserPresence | User presence
try {
    UserPresence result = apiInstance.patchUserPresencesPurecloud(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#patchUserPresencesPurecloud");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description   | Notes |
| ---------- | ----------------------------------- | ------------- | ----- |
| **userId** | **String**                          | user Id       |
| **body**   | [**UserPresence**](UserPresence.md) | User presence |

{: class="table-striped"}

### Return type

[**UserPresence**](UserPresence.md)

<a name="postPresencedefinitions"></a>

# **postPresencedefinitions**

> [OrganizationPresence](OrganizationPresence.md) postPresencedefinitions(body)

Create a Presence Definition

Wraps POST /api/v2/presencedefinitions

Requires ALL permissions:

- presence:presenceDefinition:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
OrganizationPresence body = new OrganizationPresence(); // OrganizationPresence | The Presence Definition to create
try {
    OrganizationPresence result = apiInstance.postPresencedefinitions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#postPresencedefinitions");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description                       | Notes |
| -------- | --------------------------------------------------- | --------------------------------- | ----- |
| **body** | [**OrganizationPresence**](OrganizationPresence.md) | The Presence Definition to create |

{: class="table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.md)

<a name="putPresencedefinition"></a>

# **putPresencedefinition**

> [OrganizationPresence](OrganizationPresence.md) putPresencedefinition(presenceId, body)

Update a Presence Definition

Wraps PUT /api/v2/presencedefinitions/{presenceId}

Requires ALL permissions:

- presence:presenceDefinition:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
String presenceId = "presenceId_example"; // String | Organization Presence ID
OrganizationPresence body = new OrganizationPresence(); // OrganizationPresence | The OrganizationPresence to update
try {
    OrganizationPresence result = apiInstance.putPresencedefinition(presenceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putPresencedefinition");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                                | Description                        | Notes |
| -------------- | --------------------------------------------------- | ---------------------------------- | ----- |
| **presenceId** | **String**                                          | Organization Presence ID           |
| **body**       | [**OrganizationPresence**](OrganizationPresence.md) | The OrganizationPresence to update |

{: class="table-striped"}

### Return type

[**OrganizationPresence**](OrganizationPresence.md)

<a name="putUsersPresencesBulk"></a>

# **putUsersPresencesBulk**

> [List&lt;UserPresence&gt;](UserPresence.md) putUsersPresencesBulk(body)

Update bulk user Presences

Wraps PUT /api/v2/users/presences/bulk

Requires ANY permissions:

- presence:userPresence:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.PresenceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

PresenceApi apiInstance = new PresenceApi();
List<UserPresence> body = Arrays.asList(new UserPresence()); // List<UserPresence> | List of User presences
try {
    List<UserPresence> result = apiInstance.putUsersPresencesBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#putUsersPresencesBulk");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                            | Description            | Notes |
| -------- | ----------------------------------------------- | ---------------------- | ----- |
| **body** | [**List&lt;UserPresence&gt;**](UserPresence.md) | List of User presences |

{: class="table-striped"}

### Return type

[**List&lt;UserPresence&gt;**](UserPresence.md)
