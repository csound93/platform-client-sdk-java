---
title: SearchApi
---

## SearchApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| [**getDocumentationGknSearch**](SearchApi.md#getDocumentationGknSearch)                                     | Search gkn documentation using the q64 value returned from a previous search  |
| [**getDocumentationSearch**](SearchApi.md#getDocumentationSearch)                                           | Search documentation using the q64 value returned from a previous search      |
| [**getGroupsSearch**](SearchApi.md#getGroupsSearch)                                                         | Search groups using the q64 value returned from a previous search             |
| [**getLocationsSearch**](SearchApi.md#getLocationsSearch)                                                   | Search locations using the q64 value returned from a previous search          |
| [**getSearch**](SearchApi.md#getSearch)                                                                     | Search using the q64 value returned from a previous search.                   |
| [**getSearchSuggest**](SearchApi.md#getSearchSuggest)                                                       | Suggest resources using the q64 value returned from a previous suggest query. |
| [**getUsersSearch**](SearchApi.md#getUsersSearch)                                                           | Search users using the q64 value returned from a previous search              |
| [**getVoicemailSearch**](SearchApi.md#getVoicemailSearch)                                                   | Search voicemails using the q64 value returned from a previous search         |
| [**postAnalyticsConversationsTranscriptsQuery**](SearchApi.md#postAnalyticsConversationsTranscriptsQuery)   | Search resources.                                                             |
| [**postDocumentationGknSearch**](SearchApi.md#postDocumentationGknSearch)                                   | Search gkn documentation                                                      |
| [**postDocumentationSearch**](SearchApi.md#postDocumentationSearch)                                         | Search documentation                                                          |
| [**postGroupsSearch**](SearchApi.md#postGroupsSearch)                                                       | Search groups                                                                 |
| [**postKnowledgeKnowledgebaseSearch**](SearchApi.md#postKnowledgeKnowledgebaseSearch)                       | Search Documents                                                              |
| [**postLocationsSearch**](SearchApi.md#postLocationsSearch)                                                 | Search locations                                                              |
| [**postSearch**](SearchApi.md#postSearch)                                                                   | Search resources.                                                             |
| [**postSearchSuggest**](SearchApi.md#postSearchSuggest)                                                     | Suggest resources.                                                            |
| [**postSpeechandtextanalyticsTranscriptsSearch**](SearchApi.md#postSpeechandtextanalyticsTranscriptsSearch) | Search resources.                                                             |
| [**postUsersSearch**](SearchApi.md#postUsersSearch)                                                         | Search users                                                                  |
| [**postVoicemailSearch**](SearchApi.md#postVoicemailSearch)                                                 | Search voicemails                                                             |

{: class="table-striped"}

<a name="getDocumentationGknSearch"></a>

# **getDocumentationGknSearch**

> [GKNDocumentationSearchResponse](GKNDocumentationSearchResponse.md) getDocumentationGknSearch(q64)

Search gkn documentation using the q64 value returned from a previous search

Wraps GET /api/v2/documentation/gkn/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
try {
    GKNDocumentationSearchResponse result = apiInstance.getDocumentationGknSearch(q64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getDocumentationGknSearch");
    e.printStackTrace();
}
```

### Parameters

| Name    | Type       | Description | Notes |
| ------- | ---------- | ----------- | ----- |
| **q64** | **String** | q64         |

{: class="table-striped"}

### Return type

[**GKNDocumentationSearchResponse**](GKNDocumentationSearchResponse.md)

<a name="getDocumentationSearch"></a>

# **getDocumentationSearch**

> [DocumentationSearchResponse](DocumentationSearchResponse.md) getDocumentationSearch(q64)

Search documentation using the q64 value returned from a previous search

Wraps GET /api/v2/documentation/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
try {
    DocumentationSearchResponse result = apiInstance.getDocumentationSearch(q64);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getDocumentationSearch");
    e.printStackTrace();
}
```

### Parameters

| Name    | Type       | Description | Notes |
| ------- | ---------- | ----------- | ----- |
| **q64** | **String** | q64         |

{: class="table-striped"}

### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse.md)

<a name="getGroupsSearch"></a>

# **getGroupsSearch**

> [GroupsSearchResponse](GroupsSearchResponse.md) getGroupsSearch(q64, expand)

Search groups using the q64 value returned from a previous search

Wraps GET /api/v2/groups/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    GroupsSearchResponse result = apiInstance.getGroupsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getGroupsSearch");
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

[**GroupsSearchResponse**](GroupsSearchResponse.md)

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
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Provides more details about a specified resource
try {
    LocationsSearchResponse result = apiInstance.getLocationsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getLocationsSearch");
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

<a name="getSearch"></a>

# **getSearch**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.md) getSearch(q64, expand, profile)

Search using the q64 value returned from a previous search.

Wraps GET /api/v2/search

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearch(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ----------- | ----------------------------------- | ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **q64**     | **String**                          | q64                             |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, images, addressVerificationDetails |
| **profile** | **Boolean**                         | profile                         | [optional] [default to true]                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

{: class="table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

<a name="getSearchSuggest"></a>

# **getSearchSuggest**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.md) getSearchSuggest(q64, expand, profile)

Suggest resources using the q64 value returned from a previous suggest query.

Wraps GET /api/v2/search/suggest

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.getSearchSuggest(q64, expand, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearchSuggest");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ----------- | ----------------------------------- | ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **q64**     | **String**                          | q64                             |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, callerUser.routingStatus, callerUser.primaryPresence, callerUser.conversationSummary, callerUser.outOfOffice, callerUser.geolocation, images, addressVerificationDetails |
| **profile** | **Boolean**                         | profile                         | [optional] [default to true]                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

{: class="table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

<a name="getUsersSearch"></a>

# **getUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.md) getUsersSearch(q64, expand, integrationPresenceSource)

Search users using the q64 value returned from a previous search

Wraps GET /api/v2/users/search

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | integrationPresenceSource
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getUsersSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description               | Notes                                                              |
| ----------------------------- | ----------------------------------- | ------------------------- | ------------------------------------------------------------------ |
| **q64**                       | **String**                          | q64                       |
| **expand**                    | [**List&lt;String&gt;**](String.md) | expand                    | [optional]                                                         |
| **integrationPresenceSource** | **String**                          | integrationPresenceSource | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral |

{: class="table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.md)

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
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    VoicemailsSearchResponse result = apiInstance.getVoicemailSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getVoicemailSearch");
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

<a name="postAnalyticsConversationsTranscriptsQuery"></a>

# **postAnalyticsConversationsTranscriptsQuery**

> [AnalyticsConversationWithoutAttributesMultiGetResponse](AnalyticsConversationWithoutAttributesMultiGetResponse.md) postAnalyticsConversationsTranscriptsQuery(body)

Search resources.

Wraps POST /api/v2/analytics/conversations/transcripts/query

Requires ANY permissions:

- analytics:conversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
TranscriptConversationDetailSearchRequest body = new TranscriptConversationDetailSearchRequest(); // TranscriptConversationDetailSearchRequest | Search request options
try {
    AnalyticsConversationWithoutAttributesMultiGetResponse result = apiInstance.postAnalyticsConversationsTranscriptsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postAnalyticsConversationsTranscriptsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                                          | Description            | Notes |
| -------- | --------------------------------------------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**TranscriptConversationDetailSearchRequest**](TranscriptConversationDetailSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**AnalyticsConversationWithoutAttributesMultiGetResponse**](AnalyticsConversationWithoutAttributesMultiGetResponse.md)

<a name="postDocumentationGknSearch"></a>

# **postDocumentationGknSearch**

> [GKNDocumentationSearchResponse](GKNDocumentationSearchResponse.md) postDocumentationGknSearch(body)

Search gkn documentation

Wraps POST /api/v2/documentation/gkn/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
GKNDocumentationSearchRequest body = new GKNDocumentationSearchRequest(); // GKNDocumentationSearchRequest | Search request options
try {
    GKNDocumentationSearchResponse result = apiInstance.postDocumentationGknSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationGknSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                  | Description            | Notes |
| -------- | --------------------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**GKNDocumentationSearchRequest**](GKNDocumentationSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**GKNDocumentationSearchResponse**](GKNDocumentationSearchResponse.md)

<a name="postDocumentationSearch"></a>

# **postDocumentationSearch**

> [DocumentationSearchResponse](DocumentationSearchResponse.md) postDocumentationSearch(body)

Search documentation

Wraps POST /api/v2/documentation/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.SearchApi;


SearchApi apiInstance = new SearchApi();
DocumentationSearchRequest body = new DocumentationSearchRequest(); // DocumentationSearchRequest | Search request options
try {
    DocumentationSearchResponse result = apiInstance.postDocumentationSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postDocumentationSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description            | Notes |
| -------- | --------------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**DocumentationSearchRequest**](DocumentationSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**DocumentationSearchResponse**](DocumentationSearchResponse.md)

<a name="postGroupsSearch"></a>

# **postGroupsSearch**

> [GroupsSearchResponse](GroupsSearchResponse.md) postGroupsSearch(body)

Search groups

Wraps POST /api/v2/groups/search

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
GroupSearchRequest body = new GroupSearchRequest(); // GroupSearchRequest | Search request options
try {
    GroupsSearchResponse result = apiInstance.postGroupsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postGroupsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                            | Description            | Notes |
| -------- | ----------------------------------------------- | ---------------------- | ----- |
| **body** | [**GroupSearchRequest**](GroupSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**GroupsSearchResponse**](GroupsSearchResponse.md)

<a name="postKnowledgeKnowledgebaseSearch"></a>

# **postKnowledgeKnowledgebaseSearch**

> [KnowledgeSearchResponse](KnowledgeSearchResponse.md) postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body)

Search Documents

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/search

Requires ALL permissions:

- knowledge:knowledgebase:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeSearchRequest body = new KnowledgeSearchRequest(); // KnowledgeSearchRequest |
try {
    KnowledgeSearchResponse result = apiInstance.postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postKnowledgeKnowledgebaseSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                    | Description       | Notes      |
| ------------------- | ------------------------------------------------------- | ----------------- | ---------- |
| **knowledgeBaseId** | **String**                                              | Knowledge base ID |
| **body**            | [**KnowledgeSearchRequest**](KnowledgeSearchRequest.md) |                   | [optional] |

{: class="table-striped"}

### Return type

[**KnowledgeSearchResponse**](KnowledgeSearchResponse.md)

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
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postLocationsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postLocationsSearch");
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

<a name="postSearch"></a>

# **postSearch**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.md) postSearch(body, profile)

Search resources.

Wraps POST /api/v2/search

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
SearchRequest body = new SearchRequest(); // SearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearch(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearch");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                  | Description            | Notes                        |
| ----------- | ------------------------------------- | ---------------------- | ---------------------------- |
| **body**    | [**SearchRequest**](SearchRequest.md) | Search request options |
| **profile** | **Boolean**                           | profile                | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

<a name="postSearchSuggest"></a>

# **postSearchSuggest**

> [JsonNodeSearchResponse](JsonNodeSearchResponse.md) postSearchSuggest(body, profile)

Suggest resources.

Wraps POST /api/v2/search/suggest

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
SuggestSearchRequest body = new SuggestSearchRequest(); // SuggestSearchRequest | Search request options
Boolean profile = true; // Boolean | profile
try {
    JsonNodeSearchResponse result = apiInstance.postSearchSuggest(body, profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSearchSuggest");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                | Description            | Notes                        |
| ----------- | --------------------------------------------------- | ---------------------- | ---------------------------- |
| **body**    | [**SuggestSearchRequest**](SuggestSearchRequest.md) | Search request options |
| **profile** | **Boolean**                                         | profile                | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**JsonNodeSearchResponse**](JsonNodeSearchResponse.md)

<a name="postSpeechandtextanalyticsTranscriptsSearch"></a>

# **postSpeechandtextanalyticsTranscriptsSearch**

> [JsonSearchResponse](JsonSearchResponse.md) postSpeechandtextanalyticsTranscriptsSearch(body)

Search resources.

Wraps POST /api/v2/speechandtextanalytics/transcripts/search

Requires ANY permissions:

- analytics:conversationDetail:view
- recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
TranscriptSearchRequest body = new TranscriptSearchRequest(); // TranscriptSearchRequest | Search request options
try {
    JsonSearchResponse result = apiInstance.postSpeechandtextanalyticsTranscriptsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postSpeechandtextanalyticsTranscriptsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description            | Notes |
| -------- | --------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**TranscriptSearchRequest**](TranscriptSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**JsonSearchResponse**](JsonSearchResponse.md)

<a name="postUsersSearch"></a>

# **postUsersSearch**

> [UsersSearchResponse](UsersSearchResponse.md) postUsersSearch(body)

Search users

Wraps POST /api/v2/users/search

Requires ANY permissions:

- directory:user:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postUsersSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description            | Notes |
| -------- | --------------------------------------------- | ---------------------- | ----- |
| **body** | [**UserSearchRequest**](UserSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**UsersSearchResponse**](UsersSearchResponse.md)

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
import com.mypurecloud.sdk.v2.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SearchApi apiInstance = new SearchApi();
VoicemailSearchRequest body = new VoicemailSearchRequest(); // VoicemailSearchRequest | Search request options
try {
    VoicemailsSearchResponse result = apiInstance.postVoicemailSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#postVoicemailSearch");
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
