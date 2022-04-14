---
title: IntegrationsApi
---

## IntegrationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                                | Description                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteIntegration**](IntegrationsApi.md#deleteIntegration)                                                                         | Delete integration.                                                                                                               |
| [**deleteIntegrationsAction**](IntegrationsApi.md#deleteIntegrationsAction)                                                           | Delete an Action                                                                                                                  |
| [**deleteIntegrationsActionDraft**](IntegrationsApi.md#deleteIntegrationsActionDraft)                                                 | Delete a Draft                                                                                                                    |
| [**deleteIntegrationsCredential**](IntegrationsApi.md#deleteIntegrationsCredential)                                                   | Delete a set of credentials                                                                                                       |
| [**getIntegration**](IntegrationsApi.md#getIntegration)                                                                               | Get integration.                                                                                                                  |
| [**getIntegrationConfigCurrent**](IntegrationsApi.md#getIntegrationConfigCurrent)                                                     | Get integration configuration.                                                                                                    |
| [**getIntegrations**](IntegrationsApi.md#getIntegrations)                                                                             | List integrations                                                                                                                 |
| [**getIntegrationsAction**](IntegrationsApi.md#getIntegrationsAction)                                                                 | Retrieves a single Action matching id.                                                                                            |
| [**getIntegrationsActionDraft**](IntegrationsApi.md#getIntegrationsActionDraft)                                                       | Retrieve a Draft                                                                                                                  |
| [**getIntegrationsActionDraftSchema**](IntegrationsApi.md#getIntegrationsActionDraftSchema)                                           | Retrieve schema for a Draft based on filename.                                                                                    |
| [**getIntegrationsActionDraftTemplate**](IntegrationsApi.md#getIntegrationsActionDraftTemplate)                                       | Retrieve templates for a Draft based on filename.                                                                                 |
| [**getIntegrationsActionDraftValidation**](IntegrationsApi.md#getIntegrationsActionDraftValidation)                                   | Validate current Draft configuration.                                                                                             |
| [**getIntegrationsActionSchema**](IntegrationsApi.md#getIntegrationsActionSchema)                                                     | Retrieve schema for an action based on filename.                                                                                  |
| [**getIntegrationsActionTemplate**](IntegrationsApi.md#getIntegrationsActionTemplate)                                                 | Retrieve text of templates for an action based on filename.                                                                       |
| [**getIntegrationsActions**](IntegrationsApi.md#getIntegrationsActions)                                                               | Retrieves all actions associated with filters passed in via query param.                                                          |
| [**getIntegrationsActionsCategories**](IntegrationsApi.md#getIntegrationsActionsCategories)                                           | Retrieves all categories of available Actions                                                                                     |
| [**getIntegrationsActionsDrafts**](IntegrationsApi.md#getIntegrationsActionsDrafts)                                                   | Retrieves all action drafts associated with the filters passed in via query param.                                                |
| [**getIntegrationsBotconnectorIntegrationIdBot**](IntegrationsApi.md#getIntegrationsBotconnectorIntegrationIdBot)                     | Get a specific botConnector bot, plus versions, for this integration                                                              |
| [**getIntegrationsBotconnectorIntegrationIdBotVersions**](IntegrationsApi.md#getIntegrationsBotconnectorIntegrationIdBotVersions)     | Get a list of bot versions for a bot                                                                                              |
| [**getIntegrationsBotconnectorIntegrationIdBots**](IntegrationsApi.md#getIntegrationsBotconnectorIntegrationIdBots)                   | Get a list of botConnector bots for this integration                                                                              |
| [**getIntegrationsBotconnectorIntegrationIdBotsSummaries**](IntegrationsApi.md#getIntegrationsBotconnectorIntegrationIdBotsSummaries) | Get a summary list of botConnector bots for this integration                                                                      |
| [**getIntegrationsClientapps**](IntegrationsApi.md#getIntegrationsClientapps)                                                         | List permitted client app integrations for the logged in user                                                                     |
| [**getIntegrationsClientappsUnifiedcommunications**](IntegrationsApi.md#getIntegrationsClientappsUnifiedcommunications)               | UC integration client application configuration.                                                                                  |
| [**getIntegrationsCredential**](IntegrationsApi.md#getIntegrationsCredential)                                                         | Get a single credential with sensitive fields redacted                                                                            |
| [**getIntegrationsCredentials**](IntegrationsApi.md#getIntegrationsCredentials)                                                       | List multiple sets of credentials                                                                                                 |
| [**getIntegrationsCredentialsTypes**](IntegrationsApi.md#getIntegrationsCredentialsTypes)                                             | List all credential types                                                                                                         |
| [**getIntegrationsEventlog**](IntegrationsApi.md#getIntegrationsEventlog)                                                             | List all events                                                                                                                   |
| [**getIntegrationsEventlogEventId**](IntegrationsApi.md#getIntegrationsEventlogEventId)                                               | Get a single event                                                                                                                |
| [**getIntegrationsSpeechDialogflowAgent**](IntegrationsApi.md#getIntegrationsSpeechDialogflowAgent)                                   | Get details about a Dialogflow agent                                                                                              |
| [**getIntegrationsSpeechDialogflowAgents**](IntegrationsApi.md#getIntegrationsSpeechDialogflowAgents)                                 | Get a list of Dialogflow agents in the customers&#39; Google accounts                                                             |
| [**getIntegrationsSpeechLexBotAlias**](IntegrationsApi.md#getIntegrationsSpeechLexBotAlias)                                           | Get details about a Lex bot alias                                                                                                 |
| [**getIntegrationsSpeechLexBotBotIdAliases**](IntegrationsApi.md#getIntegrationsSpeechLexBotBotIdAliases)                             | Get a list of aliases for a bot in the customer&#39;s AWS accounts                                                                |
| [**getIntegrationsSpeechLexBots**](IntegrationsApi.md#getIntegrationsSpeechLexBots)                                                   | Get a list of Lex bots in the customers&#39; AWS accounts                                                                         |
| [**getIntegrationsSpeechTtsEngine**](IntegrationsApi.md#getIntegrationsSpeechTtsEngine)                                               | Get details about a TTS engine                                                                                                    |
| [**getIntegrationsSpeechTtsEngineVoice**](IntegrationsApi.md#getIntegrationsSpeechTtsEngineVoice)                                     | Get details about a specific voice for a TTS engine                                                                               |
| [**getIntegrationsSpeechTtsEngineVoices**](IntegrationsApi.md#getIntegrationsSpeechTtsEngineVoices)                                   | Get a list of voices for a TTS engine                                                                                             |
| [**getIntegrationsSpeechTtsEngines**](IntegrationsApi.md#getIntegrationsSpeechTtsEngines)                                             | Get a list of TTS engines enabled for org                                                                                         |
| [**getIntegrationsSpeechTtsSettings**](IntegrationsApi.md#getIntegrationsSpeechTtsSettings)                                           | Get TTS settings for an org                                                                                                       |
| [**getIntegrationsType**](IntegrationsApi.md#getIntegrationsType)                                                                     | Get integration type.                                                                                                             |
| [**getIntegrationsTypeConfigschema**](IntegrationsApi.md#getIntegrationsTypeConfigschema)                                             | Get properties config schema for an integration type.                                                                             |
| [**getIntegrationsTypes**](IntegrationsApi.md#getIntegrationsTypes)                                                                   | List integration types                                                                                                            |
| [**getIntegrationsUserapps**](IntegrationsApi.md#getIntegrationsUserapps)                                                             | List permitted user app integrations for the logged in user                                                                       |
| [**patchIntegration**](IntegrationsApi.md#patchIntegration)                                                                           | Update an integration.                                                                                                            |
| [**patchIntegrationsAction**](IntegrationsApi.md#patchIntegrationsAction)                                                             | Patch an Action                                                                                                                   |
| [**patchIntegrationsActionDraft**](IntegrationsApi.md#patchIntegrationsActionDraft)                                                   | Update an existing Draft                                                                                                          |
| [**postIntegrations**](IntegrationsApi.md#postIntegrations)                                                                           | Create an integration.                                                                                                            |
| [**postIntegrationsActionDraft**](IntegrationsApi.md#postIntegrationsActionDraft)                                                     | Create a new Draft from existing Action                                                                                           |
| [**postIntegrationsActionDraftPublish**](IntegrationsApi.md#postIntegrationsActionDraftPublish)                                       | Publish a Draft and make it the active Action configuration                                                                       |
| [**postIntegrationsActionDraftTest**](IntegrationsApi.md#postIntegrationsActionDraftTest)                                             | Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.     |
| [**postIntegrationsActionExecute**](IntegrationsApi.md#postIntegrationsActionExecute)                                                 | Execute Action and return response from 3rd party. Responses will follow the schemas defined on the Action for success and error. |
| [**postIntegrationsActionTest**](IntegrationsApi.md#postIntegrationsActionTest)                                                       | Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.   |
| [**postIntegrationsActions**](IntegrationsApi.md#postIntegrationsActions)                                                             | Create a new Action                                                                                                               |
| [**postIntegrationsActionsDrafts**](IntegrationsApi.md#postIntegrationsActionsDrafts)                                                 | Create a new Draft                                                                                                                |
| [**postIntegrationsCredentials**](IntegrationsApi.md#postIntegrationsCredentials)                                                     | Create a set of credentials                                                                                                       |
| [**postIntegrationsWorkforcemanagementVendorconnection**](IntegrationsApi.md#postIntegrationsWorkforcemanagementVendorconnection)     | Add a vendor connection                                                                                                           |
| [**putIntegrationConfigCurrent**](IntegrationsApi.md#putIntegrationConfigCurrent)                                                     | Update integration configuration.                                                                                                 |
| [**putIntegrationsBotconnectorIntegrationIdBots**](IntegrationsApi.md#putIntegrationsBotconnectorIntegrationIdBots)                   | Set a list of botConnector bots plus versions for this integration                                                                |
| [**putIntegrationsCredential**](IntegrationsApi.md#putIntegrationsCredential)                                                         | Update a set of credentials                                                                                                       |
| [**putIntegrationsSpeechTtsSettings**](IntegrationsApi.md#putIntegrationsSpeechTtsSettings)                                           | Update TTS settings for an org                                                                                                    |

{: class="table-striped"}

<a name="deleteIntegration"></a>

# **deleteIntegration**

> [Integration](Integration.md) deleteIntegration(integrationId)

Delete integration.

Wraps DELETE /api/v2/integrations/{integrationId}

Requires ANY permissions:

- integrations:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
try {
    Integration result = apiInstance.deleteIntegration(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration Id |

{: class="table-striped"}

### Return type

[**Integration**](Integration.md)

<a name="deleteIntegrationsAction"></a>

# **deleteIntegrationsAction**

> Void deleteIntegrationsAction(actionId)

Delete an Action

Wraps DELETE /api/v2/integrations/actions/{actionId}

Requires ANY permissions:

- integrations:action:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsAction(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **actionId** | **String** | actionId    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteIntegrationsActionDraft"></a>

# **deleteIntegrationsActionDraft**

> Void deleteIntegrationsActionDraft(actionId)

Delete a Draft

Wraps DELETE /api/v2/integrations/actions/{actionId}/draft

Requires ANY permissions:

- integrations:action:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    apiInstance.deleteIntegrationsActionDraft(actionId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **actionId** | **String** | actionId    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteIntegrationsCredential"></a>

# **deleteIntegrationsCredential**

> Void deleteIntegrationsCredential(credentialId)

Delete a set of credentials

Wraps DELETE /api/v2/integrations/credentials/{credentialId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
try {
    apiInstance.deleteIntegrationsCredential(credentialId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description   | Notes |
| ---------------- | ---------- | ------------- | ----- |
| **credentialId** | **String** | Credential ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getIntegration"></a>

# **getIntegration**

> [Integration](Integration.md) getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get integration.

Wraps GET /api/v2/integrations/{integrationId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    Integration result = apiInstance.getIntegration(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegration");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                            | Notes                      |
| ----------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **integrationId** | **String**                          | Integration Id                         |
| **pageSize**      | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**    | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**        | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**        | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**      | **String**                          | next page token                        | [optional]                 |
| **previousPage**  | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**Integration**](Integration.md)

<a name="getIntegrationConfigCurrent"></a>

# **getIntegrationConfigCurrent**

> [IntegrationConfiguration](IntegrationConfiguration.md) getIntegrationConfigCurrent(integrationId)

Get integration configuration.

Wraps GET /api/v2/integrations/{integrationId}/config/current

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
try {
    IntegrationConfiguration result = apiInstance.getIntegrationConfigCurrent(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationConfigCurrent");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration Id |

{: class="table-striped"}

### Return type

[**IntegrationConfiguration**](IntegrationConfiguration.md)

<a name="getIntegrations"></a>

# **getIntegrations**

> [IntegrationEntityListing](IntegrationEntityListing.md) getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integrations

Wraps GET /api/v2/integrations

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationEntityListing result = apiInstance.getIntegrations(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrations");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**IntegrationEntityListing**](IntegrationEntityListing.md)

<a name="getIntegrationsAction"></a>

# **getIntegrationsAction**

> [Action](Action.md) getIntegrationsAction(actionId, expand, includeConfig)

Retrieves a single Action matching id.

Wraps GET /api/v2/integrations/actions/{actionId}

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates a field in the response which should be expanded.
Boolean includeConfig = false; // Boolean | Return config in response.
try {
    Action result = apiInstance.getIntegrationsAction(actionId, expand, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                                                 | Notes                                |
| ----------------- | ----------- | ----------------------------------------------------------- | ------------------------------------ |
| **actionId**      | **String**  | actionId                                                    |
| **expand**        | **String**  | Indicates a field in the response which should be expanded. | [optional]<br />**Values**: contract |
| **includeConfig** | **Boolean** | Return config in response.                                  | [optional] [default to false]        |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="getIntegrationsActionDraft"></a>

# **getIntegrationsActionDraft**

> [Action](Action.md) getIntegrationsActionDraft(actionId, expand, includeConfig)

Retrieve a Draft

Wraps GET /api/v2/integrations/actions/{actionId}/draft

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String expand = "expand_example"; // String | Indicates a field in the response which should be expanded.
Boolean includeConfig = false; // Boolean | Return config in response.
try {
    Action result = apiInstance.getIntegrationsActionDraft(actionId, expand, includeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                                                 | Notes                                |
| ----------------- | ----------- | ----------------------------------------------------------- | ------------------------------------ |
| **actionId**      | **String**  | actionId                                                    |
| **expand**        | **String**  | Indicates a field in the response which should be expanded. | [optional]<br />**Values**: contract |
| **includeConfig** | **Boolean** | Return config in response.                                  | [optional] [default to false]        |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="getIntegrationsActionDraftSchema"></a>

# **getIntegrationsActionDraftSchema**

> [JsonSchemaDocument](JsonSchemaDocument.md) getIntegrationsActionDraftSchema(actionId, fileName)

Retrieve schema for a Draft based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/schemas/{fileName}

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this draft.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionDraftSchema(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftSchema");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                         | Notes |
| ------------ | ---------- | --------------------------------------------------- | ----- |
| **actionId** | **String** | actionId                                            |
| **fileName** | **String** | Name of schema file to be retrieved for this draft. |

{: class="table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.md)

<a name="getIntegrationsActionDraftTemplate"></a>

# **getIntegrationsActionDraftTemplate**

> String getIntegrationsActionDraftTemplate(actionId, fileName)

Retrieve templates for a Draft based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/templates/{fileName}

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action draft.
try {
    String result = apiInstance.getIntegrationsActionDraftTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                                  | Notes |
| ------------ | ---------- | ------------------------------------------------------------ | ----- |
| **actionId** | **String** | actionId                                                     |
| **fileName** | **String** | Name of template file to be retrieved for this action draft. |

{: class="table-striped"}

### Return type

**String**

<a name="getIntegrationsActionDraftValidation"></a>

# **getIntegrationsActionDraftValidation**

> [DraftValidationResult](DraftValidationResult.md) getIntegrationsActionDraftValidation(actionId)

Validate current Draft configuration.

Wraps GET /api/v2/integrations/actions/{actionId}/draft/validation

Requires ANY permissions:

- integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    DraftValidationResult result = apiInstance.getIntegrationsActionDraftValidation(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionDraftValidation");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **actionId** | **String** | actionId    |

{: class="table-striped"}

### Return type

[**DraftValidationResult**](DraftValidationResult.md)

<a name="getIntegrationsActionSchema"></a>

# **getIntegrationsActionSchema**

> [JsonSchemaDocument](JsonSchemaDocument.md) getIntegrationsActionSchema(actionId, fileName)

Retrieve schema for an action based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/schemas/{fileName}

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of schema file to be retrieved for this action.
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsActionSchema(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionSchema");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                          | Notes |
| ------------ | ---------- | ---------------------------------------------------- | ----- |
| **actionId** | **String** | actionId                                             |
| **fileName** | **String** | Name of schema file to be retrieved for this action. |

{: class="table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.md)

<a name="getIntegrationsActionTemplate"></a>

# **getIntegrationsActionTemplate**

> String getIntegrationsActionTemplate(actionId, fileName)

Retrieve text of templates for an action based on filename.

Wraps GET /api/v2/integrations/actions/{actionId}/templates/{fileName}

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
String fileName = "fileName_example"; // String | Name of template file to be retrieved for this action.
try {
    String result = apiInstance.getIntegrationsActionTemplate(actionId, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                            | Notes |
| ------------ | ---------- | ------------------------------------------------------ | ----- |
| **actionId** | **String** | actionId                                               |
| **fileName** | **String** | Name of template file to be retrieved for this action. |

{: class="table-striped"}

### Return type

**String**

<a name="getIntegrationsActions"></a>

# **getIntegrationsActions**

> [ActionEntityListing](ActionEntityListing.md) getIntegrationsActions(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions)

Retrieves all actions associated with filters passed in via query param.

Wraps GET /api/v2/integrations/actions

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String category = "category_example"; // String | Filter by category name
String name = "name_example"; // String | Filter by action name. Provide full or just the first part of name.
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
String includeAuthActions = "false"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
try {
    ActionEntityListing result = apiInstance.getIntegrationsActions(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActions");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                                                                                                                                                                                     | Notes                                                      |
| ---------------------- | ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------- |
| **pageSize**           | **Integer** | The total page size requested                                                                                                                                                                                                   | [optional] [default to 25]                                 |
| **pageNumber**         | **Integer** | The page number requested                                                                                                                                                                                                       | [optional] [default to 1]                                  |
| **nextPage**           | **String**  | next page token                                                                                                                                                                                                                 | [optional]                                                 |
| **previousPage**       | **String**  | Previous page token                                                                                                                                                                                                             | [optional]                                                 |
| **sortBy**             | **String**  | Root level field name to sort on.                                                                                                                                                                                               | [optional]                                                 |
| **sortOrder**          | **String**  | Direction to sort &#39;sortBy&#39; field.                                                                                                                                                                                       | [optional] [default to asc]<br />**Values**: ASC, DESC     |
| **category**           | **String**  | Filter by category name                                                                                                                                                                                                         | [optional]                                                 |
| **name**               | **String**  | Filter by action name. Provide full or just the first part of name.                                                                                                                                                             | [optional]                                                 |
| **secure**             | **String**  | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.                                                      | [optional]<br />**Values**: true, false                    |
| **includeAuthActions** | **String**  | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional] [default to false]<br />**Values**: true, false |

{: class="table-striped"}

### Return type

[**ActionEntityListing**](ActionEntityListing.md)

<a name="getIntegrationsActionsCategories"></a>

# **getIntegrationsActionsCategories**

> [CategoryEntityListing](CategoryEntityListing.md) getIntegrationsActionsCategories(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure)

Retrieves all categories of available Actions

Wraps GET /api/v2/integrations/actions/categories

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.  Only 'name' is supported on this endpoint.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
try {
    CategoryEntityListing result = apiInstance.getIntegrationsActionsCategories(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsCategories");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                                                                                                                                                                | Notes                                                  |
| ---------------- | ----------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------ |
| **pageSize**     | **Integer** | The total page size requested                                                                                                                                              | [optional] [default to 25]                             |
| **pageNumber**   | **Integer** | The page number requested                                                                                                                                                  | [optional] [default to 1]                              |
| **nextPage**     | **String**  | next page token                                                                                                                                                            | [optional]                                             |
| **previousPage** | **String**  | Previous page token                                                                                                                                                        | [optional]                                             |
| **sortBy**       | **String**  | Root level field name to sort on. Only &#39;name&#39; is supported on this endpoint.                                                                                       | [optional]                                             |
| **sortOrder**    | **String**  | Direction to sort &#39;sortBy&#39; field.                                                                                                                                  | [optional] [default to asc]<br />**Values**: ASC, DESC |
| **secure**       | **String**  | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. | [optional]<br />**Values**: true, false                |

{: class="table-striped"}

### Return type

[**CategoryEntityListing**](CategoryEntityListing.md)

<a name="getIntegrationsActionsDrafts"></a>

# **getIntegrationsActionsDrafts**

> [ActionEntityListing](ActionEntityListing.md) getIntegrationsActionsDrafts(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions)

Retrieves all action drafts associated with the filters passed in via query param.

Wraps GET /api/v2/integrations/actions/drafts

Requires ANY permissions:

- integrations:action:view
- bridge:actions:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String sortBy = "sortBy_example"; // String | Root level field name to sort on.
String sortOrder = "asc"; // String | Direction to sort 'sortBy' field.
String category = "category_example"; // String | Filter by category name
String name = "name_example"; // String | Filter by action name. Provide full or just the first part of name.
String secure = "secure_example"; // String | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.
String includeAuthActions = "false"; // String | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions.
try {
    ActionEntityListing result = apiInstance.getIntegrationsActionsDrafts(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsActionsDrafts");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                                                                                                                                                                                     | Notes                                                      |
| ---------------------- | ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------- |
| **pageSize**           | **Integer** | The total page size requested                                                                                                                                                                                                   | [optional] [default to 25]                                 |
| **pageNumber**         | **Integer** | The page number requested                                                                                                                                                                                                       | [optional] [default to 1]                                  |
| **nextPage**           | **String**  | next page token                                                                                                                                                                                                                 | [optional]                                                 |
| **previousPage**       | **String**  | Previous page token                                                                                                                                                                                                             | [optional]                                                 |
| **sortBy**             | **String**  | Root level field name to sort on.                                                                                                                                                                                               | [optional]                                                 |
| **sortOrder**          | **String**  | Direction to sort &#39;sortBy&#39; field.                                                                                                                                                                                       | [optional] [default to asc]<br />**Values**: ASC, DESC     |
| **category**           | **String**  | Filter by category name                                                                                                                                                                                                         | [optional]                                                 |
| **name**               | **String**  | Filter by action name. Provide full or just the first part of name.                                                                                                                                                             | [optional]                                                 |
| **secure**             | **String**  | Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions.                                                      | [optional]<br />**Values**: true, false                    |
| **includeAuthActions** | **String**  | Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. | [optional] [default to false]<br />**Values**: true, false |

{: class="table-striped"}

### Return type

[**ActionEntityListing**](ActionEntityListing.md)

<a name="getIntegrationsBotconnectorIntegrationIdBot"></a>

# **getIntegrationsBotconnectorIntegrationIdBot**

> [BotConnectorBot](BotConnectorBot.md) getIntegrationsBotconnectorIntegrationIdBot(integrationId, botId, version)

Get a specific botConnector bot, plus versions, for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/{botId}

Requires ANY permissions:

- integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
String botId = "botId_example"; // String | The botID for this bot
String version = "version_example"; // String | Specific Version
try {
    BotConnectorBot result = apiInstance.getIntegrationsBotconnectorIntegrationIdBot(integrationId, botId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBot");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes      |
| ----------------- | ---------- | ----------------------------------------- | ---------- |
| **integrationId** | **String** | The integration ID for this group of bots |
| **botId**         | **String** | The botID for this bot                    |
| **version**       | **String** | Specific Version                          | [optional] |

{: class="table-striped"}

### Return type

[**BotConnectorBot**](BotConnectorBot.md)

<a name="getIntegrationsBotconnectorIntegrationIdBotVersions"></a>

# **getIntegrationsBotconnectorIntegrationIdBotVersions**

> [BotConnectorBotVersionSummaryEntityListing](BotConnectorBotVersionSummaryEntityListing.md) getIntegrationsBotconnectorIntegrationIdBotVersions(integrationId, botId, pageNumber, pageSize)

Get a list of bot versions for a bot

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/{botId}/versions

Requires ANY permissions:

- integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this bot group
String botId = "botId_example"; // String | The botID for this bot
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotConnectorBotVersionSummaryEntityListing result = apiInstance.getIntegrationsBotconnectorIntegrationIdBotVersions(integrationId, botId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotVersions");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                           | Notes                      |
| ----------------- | ----------- | ------------------------------------- | -------------------------- |
| **integrationId** | **String**  | The integration ID for this bot group |
| **botId**         | **String**  | The botID for this bot                |
| **pageNumber**    | **Integer** | Page number                           | [optional] [default to 1]  |
| **pageSize**      | **Integer** | Page size                             | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**BotConnectorBotVersionSummaryEntityListing**](BotConnectorBotVersionSummaryEntityListing.md)

<a name="getIntegrationsBotconnectorIntegrationIdBots"></a>

# **getIntegrationsBotconnectorIntegrationIdBots**

> [BotList](BotList.md) getIntegrationsBotconnectorIntegrationIdBots(integrationId)

Get a list of botConnector bots for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots

Requires ANY permissions:

- integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
try {
    BotList result = apiInstance.getIntegrationsBotconnectorIntegrationIdBots(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBots");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes |
| ----------------- | ---------- | ----------------------------------------- | ----- |
| **integrationId** | **String** | The integration ID for this group of bots |

{: class="table-striped"}

### Return type

[**BotList**](BotList.md)

<a name="getIntegrationsBotconnectorIntegrationIdBotsSummaries"></a>

# **getIntegrationsBotconnectorIntegrationIdBotsSummaries**

> [BotConnectorBotSummaryEntityListing](BotConnectorBotSummaryEntityListing.md) getIntegrationsBotconnectorIntegrationIdBotsSummaries(integrationId, pageNumber, pageSize)

Get a summary list of botConnector bots for this integration

Wraps GET /api/v2/integrations/botconnector/{integrationId}/bots/summaries

Requires ANY permissions:

- integration:botconnector:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    BotConnectorBotSummaryEntityListing result = apiInstance.getIntegrationsBotconnectorIntegrationIdBotsSummaries(integrationId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsBotconnectorIntegrationIdBotsSummaries");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                               | Notes                      |
| ----------------- | ----------- | ----------------------------------------- | -------------------------- |
| **integrationId** | **String**  | The integration ID for this group of bots |
| **pageNumber**    | **Integer** | Page number                               | [optional] [default to 1]  |
| **pageSize**      | **Integer** | Page size                                 | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**BotConnectorBotSummaryEntityListing**](BotConnectorBotSummaryEntityListing.md)

<a name="getIntegrationsClientapps"></a>

# **getIntegrationsClientapps**

> [ClientAppEntityListing](ClientAppEntityListing.md) getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List permitted client app integrations for the logged in user

Wraps GET /api/v2/integrations/clientapps

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    ClientAppEntityListing result = apiInstance.getIntegrationsClientapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsClientapps");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**ClientAppEntityListing**](ClientAppEntityListing.md)

<a name="getIntegrationsClientappsUnifiedcommunications"></a>

# **getIntegrationsClientappsUnifiedcommunications**

> [UCIntegrationListing](UCIntegrationListing.md) getIntegrationsClientappsUnifiedcommunications(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

UC integration client application configuration.

This endpoint returns basic UI configuration data for all Unified Communications integrations client applications enabled for the current organization.

Wraps GET /api/v2/integrations/clientapps/unifiedcommunications

Requires ANY permissions:

- integration:unifiedCommunications:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    UCIntegrationListing result = apiInstance.getIntegrationsClientappsUnifiedcommunications(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsClientappsUnifiedcommunications");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**UCIntegrationListing**](UCIntegrationListing.md)

<a name="getIntegrationsCredential"></a>

# **getIntegrationsCredential**

> [Credential](Credential.md) getIntegrationsCredential(credentialId)

Get a single credential with sensitive fields redacted

Wraps GET /api/v2/integrations/credentials/{credentialId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
try {
    Credential result = apiInstance.getIntegrationsCredential(credentialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description   | Notes |
| ---------------- | ---------- | ------------- | ----- |
| **credentialId** | **String** | Credential ID |

{: class="table-striped"}

### Return type

[**Credential**](Credential.md)

<a name="getIntegrationsCredentials"></a>

# **getIntegrationsCredentials**

> [CredentialInfoListing](CredentialInfoListing.md) getIntegrationsCredentials(pageNumber, pageSize)

List multiple sets of credentials

Wraps GET /api/v2/integrations/credentials

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    CredentialInfoListing result = apiInstance.getIntegrationsCredentials(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentials");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**CredentialInfoListing**](CredentialInfoListing.md)

<a name="getIntegrationsCredentialsTypes"></a>

# **getIntegrationsCredentialsTypes**

> [CredentialTypeListing](CredentialTypeListing.md) getIntegrationsCredentialsTypes()

List all credential types

Wraps GET /api/v2/integrations/credentials/types

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    CredentialTypeListing result = apiInstance.getIntegrationsCredentialsTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsCredentialsTypes");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CredentialTypeListing**](CredentialTypeListing.md)

<a name="getIntegrationsEventlog"></a>

# **getIntegrationsEventlog**

> [IntegrationEventEntityListing](IntegrationEventEntityListing.md) getIntegrationsEventlog(pageSize, pageNumber, sortBy, sortOrder, entityId)

List all events

Wraps GET /api/v2/integrations/eventlog

Requires ANY permissions:

- integrations:integration:view
- bridge:notification:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "timestamp"; // String | Sort by
String sortOrder = "descending"; // String | Order by
String entityId = "entityId_example"; // String | Include only events with this entity ID
try {
    IntegrationEventEntityListing result = apiInstance.getIntegrationsEventlog(pageSize, pageNumber, sortBy, sortOrder, entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsEventlog");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                             | Notes                              |
| -------------- | ----------- | --------------------------------------- | ---------------------------------- |
| **pageSize**   | **Integer** | Page size                               | [optional] [default to 25]         |
| **pageNumber** | **Integer** | Page number                             | [optional] [default to 1]          |
| **sortBy**     | **String**  | Sort by                                 | [optional] [default to timestamp]  |
| **sortOrder**  | **String**  | Order by                                | [optional] [default to descending] |
| **entityId**   | **String**  | Include only events with this entity ID | [optional]                         |

{: class="table-striped"}

### Return type

[**IntegrationEventEntityListing**](IntegrationEventEntityListing.md)

<a name="getIntegrationsEventlogEventId"></a>

# **getIntegrationsEventlogEventId**

> [IntegrationEvent](IntegrationEvent.md) getIntegrationsEventlogEventId(eventId)

Get a single event

Wraps GET /api/v2/integrations/eventlog/{eventId}

Requires ANY permissions:

- integrations:integration:view
- bridge:notification:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String eventId = "eventId_example"; // String | Event Id
try {
    IntegrationEvent result = apiInstance.getIntegrationsEventlogEventId(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsEventlogEventId");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **eventId** | **String** | Event Id    |

{: class="table-striped"}

### Return type

[**IntegrationEvent**](IntegrationEvent.md)

<a name="getIntegrationsSpeechDialogflowAgent"></a>

# **getIntegrationsSpeechDialogflowAgent**

> [DialogflowAgent](DialogflowAgent.md) getIntegrationsSpeechDialogflowAgent(agentId)

Get details about a Dialogflow agent

Wraps GET /api/v2/integrations/speech/dialogflow/agents/{agentId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String agentId = "agentId_example"; // String | The agent ID
try {
    DialogflowAgent result = apiInstance.getIntegrationsSpeechDialogflowAgent(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowAgent");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description  | Notes |
| ----------- | ---------- | ------------ | ----- |
| **agentId** | **String** | The agent ID |

{: class="table-striped"}

### Return type

[**DialogflowAgent**](DialogflowAgent.md)

<a name="getIntegrationsSpeechDialogflowAgents"></a>

# **getIntegrationsSpeechDialogflowAgents**

> [DialogflowAgentSummaryEntityListing](DialogflowAgentSummaryEntityListing.md) getIntegrationsSpeechDialogflowAgents(pageNumber, pageSize, name)

Get a list of Dialogflow agents in the customers&#39; Google accounts

Wraps GET /api/v2/integrations/speech/dialogflow/agents

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on agent name
try {
    DialogflowAgentSummaryEntityListing result = apiInstance.getIntegrationsSpeechDialogflowAgents(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechDialogflowAgents");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description          | Notes                      |
| -------------- | ----------- | -------------------- | -------------------------- |
| **pageNumber** | **Integer** | Page number          | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size            | [optional] [default to 25] |
| **name**       | **String**  | Filter on agent name | [optional]                 |

{: class="table-striped"}

### Return type

[**DialogflowAgentSummaryEntityListing**](DialogflowAgentSummaryEntityListing.md)

<a name="getIntegrationsSpeechLexBotAlias"></a>

# **getIntegrationsSpeechLexBotAlias**

> [LexBotAlias](LexBotAlias.md) getIntegrationsSpeechLexBotAlias(aliasId)

Get details about a Lex bot alias

Wraps GET /api/v2/integrations/speech/lex/bot/alias/{aliasId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String aliasId = "aliasId_example"; // String | The alias ID
try {
    LexBotAlias result = apiInstance.getIntegrationsSpeechLexBotAlias(aliasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBotAlias");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description  | Notes |
| ----------- | ---------- | ------------ | ----- |
| **aliasId** | **String** | The alias ID |

{: class="table-striped"}

### Return type

[**LexBotAlias**](LexBotAlias.md)

<a name="getIntegrationsSpeechLexBotBotIdAliases"></a>

# **getIntegrationsSpeechLexBotBotIdAliases**

> [LexBotAliasEntityListing](LexBotAliasEntityListing.md) getIntegrationsSpeechLexBotBotIdAliases(botId, pageNumber, pageSize, status, name)

Get a list of aliases for a bot in the customer&#39;s AWS accounts

Wraps GET /api/v2/integrations/speech/lex/bot/{botId}/aliases

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String botId = "botId_example"; // String | The bot ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String status = "status_example"; // String | Filter on alias status
String name = "name_example"; // String | Filter on alias name
try {
    LexBotAliasEntityListing result = apiInstance.getIntegrationsSpeechLexBotBotIdAliases(botId, pageNumber, pageSize, status, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBotBotIdAliases");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description            | Notes                                                          |
| -------------- | ----------- | ---------------------- | -------------------------------------------------------------- |
| **botId**      | **String**  | The bot ID             |
| **pageNumber** | **Integer** | Page number            | [optional] [default to 1]                                      |
| **pageSize**   | **Integer** | Page size              | [optional] [default to 25]                                     |
| **status**     | **String**  | Filter on alias status | [optional]<br />**Values**: READY, FAILED, BUILDING, NOT_BUILT |
| **name**       | **String**  | Filter on alias name   | [optional]                                                     |

{: class="table-striped"}

### Return type

[**LexBotAliasEntityListing**](LexBotAliasEntityListing.md)

<a name="getIntegrationsSpeechLexBots"></a>

# **getIntegrationsSpeechLexBots**

> [LexBotEntityListing](LexBotEntityListing.md) getIntegrationsSpeechLexBots(pageNumber, pageSize, name)

Get a list of Lex bots in the customers&#39; AWS accounts

Wraps GET /api/v2/integrations/speech/lex/bots

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String name = "name_example"; // String | Filter on bot name
try {
    LexBotEntityListing result = apiInstance.getIntegrationsSpeechLexBots(pageNumber, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechLexBots");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description        | Notes                      |
| -------------- | ----------- | ------------------ | -------------------------- |
| **pageNumber** | **Integer** | Page number        | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size          | [optional] [default to 25] |
| **name**       | **String**  | Filter on bot name | [optional]                 |

{: class="table-striped"}

### Return type

[**LexBotEntityListing**](LexBotEntityListing.md)

<a name="getIntegrationsSpeechTtsEngine"></a>

# **getIntegrationsSpeechTtsEngine**

> [TtsEngineEntity](TtsEngineEntity.md) getIntegrationsSpeechTtsEngine(engineId, includeVoices)

Get details about a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
Boolean includeVoices = false; // Boolean | Include voices for the engine
try {
    TtsEngineEntity result = apiInstance.getIntegrationsSpeechTtsEngine(engineId, includeVoices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngine");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                   | Notes                         |
| ----------------- | ----------- | ----------------------------- | ----------------------------- |
| **engineId**      | **String**  | The engine ID                 |
| **includeVoices** | **Boolean** | Include voices for the engine | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**TtsEngineEntity**](TtsEngineEntity.md)

<a name="getIntegrationsSpeechTtsEngineVoice"></a>

# **getIntegrationsSpeechTtsEngineVoice**

> [TtsVoiceEntity](TtsVoiceEntity.md) getIntegrationsSpeechTtsEngineVoice(engineId, voiceId)

Get details about a specific voice for a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}/voices/{voiceId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
String voiceId = "voiceId_example"; // String | The voice ID
try {
    TtsVoiceEntity result = apiInstance.getIntegrationsSpeechTtsEngineVoice(engineId, voiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngineVoice");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description   | Notes |
| ------------ | ---------- | ------------- | ----- |
| **engineId** | **String** | The engine ID |
| **voiceId**  | **String** | The voice ID  |

{: class="table-striped"}

### Return type

[**TtsVoiceEntity**](TtsVoiceEntity.md)

<a name="getIntegrationsSpeechTtsEngineVoices"></a>

# **getIntegrationsSpeechTtsEngineVoices**

> [TtsVoiceEntityListing](TtsVoiceEntityListing.md) getIntegrationsSpeechTtsEngineVoices(engineId, pageNumber, pageSize)

Get a list of voices for a TTS engine

Wraps GET /api/v2/integrations/speech/tts/engines/{engineId}/voices

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String engineId = "engineId_example"; // String | The engine ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    TtsVoiceEntityListing result = apiInstance.getIntegrationsSpeechTtsEngineVoices(engineId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngineVoices");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description   | Notes                      |
| -------------- | ----------- | ------------- | -------------------------- |
| **engineId**   | **String**  | The engine ID |
| **pageNumber** | **Integer** | Page number   | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size     | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**TtsVoiceEntityListing**](TtsVoiceEntityListing.md)

<a name="getIntegrationsSpeechTtsEngines"></a>

# **getIntegrationsSpeechTtsEngines**

> [TtsEngineEntityListing](TtsEngineEntityListing.md) getIntegrationsSpeechTtsEngines(pageNumber, pageSize, includeVoices, name, language)

Get a list of TTS engines enabled for org

Wraps GET /api/v2/integrations/speech/tts/engines

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean includeVoices = false; // Boolean | Include voices for the engine
String name = "name_example"; // String | Filter on engine name
String language = "language_example"; // String | Filter on supported language. If includeVoices=true then the voices are also filtered.
try {
    TtsEngineEntityListing result = apiInstance.getIntegrationsSpeechTtsEngines(pageNumber, pageSize, includeVoices, name, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsEngines");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                                                                            | Notes                         |
| ----------------- | ----------- | -------------------------------------------------------------------------------------- | ----------------------------- |
| **pageNumber**    | **Integer** | Page number                                                                            | [optional] [default to 1]     |
| **pageSize**      | **Integer** | Page size                                                                              | [optional] [default to 25]    |
| **includeVoices** | **Boolean** | Include voices for the engine                                                          | [optional] [default to false] |
| **name**          | **String**  | Filter on engine name                                                                  | [optional]                    |
| **language**      | **String**  | Filter on supported language. If includeVoices=true then the voices are also filtered. | [optional]                    |

{: class="table-striped"}

### Return type

[**TtsEngineEntityListing**](TtsEngineEntityListing.md)

<a name="getIntegrationsSpeechTtsSettings"></a>

# **getIntegrationsSpeechTtsSettings**

> [TtsSettings](TtsSettings.md) getIntegrationsSpeechTtsSettings()

Get TTS settings for an org

Wraps GET /api/v2/integrations/speech/tts/settings

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
try {
    TtsSettings result = apiInstance.getIntegrationsSpeechTtsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsSpeechTtsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**TtsSettings**](TtsSettings.md)

<a name="getIntegrationsType"></a>

# **getIntegrationsType**

> [IntegrationType](IntegrationType.md) getIntegrationsType(typeId)

Get integration type.

Wraps GET /api/v2/integrations/types/{typeId}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String typeId = "typeId_example"; // String | Integration Type Id
try {
    IntegrationType result = apiInstance.getIntegrationsType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsType");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description         | Notes |
| ---------- | ---------- | ------------------- | ----- |
| **typeId** | **String** | Integration Type Id |

{: class="table-striped"}

### Return type

[**IntegrationType**](IntegrationType.md)

<a name="getIntegrationsTypeConfigschema"></a>

# **getIntegrationsTypeConfigschema**

> [JsonSchemaDocument](JsonSchemaDocument.md) getIntegrationsTypeConfigschema(typeId, configType)

Get properties config schema for an integration type.

Wraps GET /api/v2/integrations/types/{typeId}/configschemas/{configType}

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String typeId = "typeId_example"; // String | Integration Type Id
String configType = "configType_example"; // String | Config schema type
try {
    JsonSchemaDocument result = apiInstance.getIntegrationsTypeConfigschema(typeId, configType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypeConfigschema");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description         | Notes                                  |
| -------------- | ---------- | ------------------- | -------------------------------------- |
| **typeId**     | **String** | Integration Type Id |
| **configType** | **String** | Config schema type  | <br />**Values**: properties, advanced |

{: class="table-striped"}

### Return type

[**JsonSchemaDocument**](JsonSchemaDocument.md)

<a name="getIntegrationsTypes"></a>

# **getIntegrationsTypes**

> [IntegrationTypeEntityListing](IntegrationTypeEntityListing.md) getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

List integration types

Wraps GET /api/v2/integrations/types

Requires ANY permissions:

- integrations:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    IntegrationTypeEntityListing result = apiInstance.getIntegrationsTypes(pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsTypes");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**IntegrationTypeEntityListing**](IntegrationTypeEntityListing.md)

<a name="getIntegrationsUserapps"></a>

# **getIntegrationsUserapps**

> [UserAppEntityListing](UserAppEntityListing.md) getIntegrationsUserapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, appHost)

List permitted user app integrations for the logged in user

Wraps GET /api/v2/integrations/userapps

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String appHost = "appHost_example"; // String | The type of UserApp to filter by
try {
    UserAppEntityListing result = apiInstance.getIntegrationsUserapps(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, appHost);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#getIntegrationsUserapps");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |
| **appHost**      | **String**                          | The type of UserApp to filter by       | [optional]                 |

{: class="table-striped"}

### Return type

[**UserAppEntityListing**](UserAppEntityListing.md)

<a name="patchIntegration"></a>

# **patchIntegration**

> [Integration](Integration.md) patchIntegration(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Update an integration.

Wraps PATCH /api/v2/integrations/{integrationId}

Requires ANY permissions:

- integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
Integration body = new Integration(); // Integration | Integration Update
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    Integration result = apiInstance.patchIntegration(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegration");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                            | Notes                      |
| ----------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **integrationId** | **String**                          | Integration Id                         |
| **body**          | [**Integration**](Integration.md)   | Integration Update                     | [optional]                 |
| **pageSize**      | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**    | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**        | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**        | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**      | **String**                          | next page token                        | [optional]                 |
| **previousPage**  | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**Integration**](Integration.md)

<a name="patchIntegrationsAction"></a>

# **patchIntegrationsAction**

> [Action](Action.md) patchIntegrationsAction(actionId, body)

Patch an Action

Wraps PATCH /api/v2/integrations/actions/{actionId}

Requires ANY permissions:

- integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateActionInput body = new UpdateActionInput(); // UpdateActionInput | Input used to patch the Action.
try {
    Action result = apiInstance.patchIntegrationsAction(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsAction");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                          | Description                     | Notes |
| ------------ | --------------------------------------------- | ------------------------------- | ----- |
| **actionId** | **String**                                    | actionId                        |
| **body**     | [**UpdateActionInput**](UpdateActionInput.md) | Input used to patch the Action. |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="patchIntegrationsActionDraft"></a>

# **patchIntegrationsActionDraft**

> [Action](Action.md) patchIntegrationsActionDraft(actionId, body)

Update an existing Draft

Wraps PATCH /api/v2/integrations/actions/{actionId}/draft

Requires ANY permissions:

- integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
UpdateDraftInput body = new UpdateDraftInput(); // UpdateDraftInput | Input used to patch the Action Draft.
try {
    Action result = apiInstance.patchIntegrationsActionDraft(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#patchIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                        | Description                           | Notes |
| ------------ | ------------------------------------------- | ------------------------------------- | ----- |
| **actionId** | **String**                                  | actionId                              |
| **body**     | [**UpdateDraftInput**](UpdateDraftInput.md) | Input used to patch the Action Draft. |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="postIntegrations"></a>

# **postIntegrations**

> [Integration](Integration.md) postIntegrations(body)

Create an integration.

Wraps POST /api/v2/integrations

Requires ANY permissions:

- integrations:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
CreateIntegrationRequest body = new CreateIntegrationRequest(); // CreateIntegrationRequest | Integration
try {
    Integration result = apiInstance.postIntegrations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrations");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description | Notes      |
| -------- | ----------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateIntegrationRequest**](CreateIntegrationRequest.md) | Integration | [optional] |

{: class="table-striped"}

### Return type

[**Integration**](Integration.md)

<a name="postIntegrationsActionDraft"></a>

# **postIntegrationsActionDraft**

> [Action](Action.md) postIntegrationsActionDraft(actionId)

Create a new Draft from existing Action

Wraps POST /api/v2/integrations/actions/{actionId}/draft

Requires ANY permissions:

- integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
try {
    Action result = apiInstance.postIntegrationsActionDraft(actionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraft");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **actionId** | **String** | actionId    |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="postIntegrationsActionDraftPublish"></a>

# **postIntegrationsActionDraftPublish**

> [Action](Action.md) postIntegrationsActionDraftPublish(actionId, body)

Publish a Draft and make it the active Action configuration

Wraps POST /api/v2/integrations/actions/{actionId}/draft/publish

Requires ANY permissions:

- integrations:action:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
PublishDraftInput body = new PublishDraftInput(); // PublishDraftInput | Input used to patch the Action.
try {
    Action result = apiInstance.postIntegrationsActionDraftPublish(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftPublish");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                          | Description                     | Notes |
| ------------ | --------------------------------------------- | ------------------------------- | ----- |
| **actionId** | **String**                                    | actionId                        |
| **body**     | [**PublishDraftInput**](PublishDraftInput.md) | Input used to patch the Action. |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="postIntegrationsActionDraftTest"></a>

# **postIntegrationsActionDraftTest**

> [TestExecutionResult](TestExecutionResult.md) postIntegrationsActionDraftTest(actionId, body)

Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.

Wraps POST /api/v2/integrations/actions/{actionId}/draft/test

Requires ANY permissions:

- integrations:action:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionDraftTest(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionDraftTest");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                       | Notes |
| ------------ | ---------- | ------------------------------------------------- | ----- |
| **actionId** | **String** | actionId                                          |
| **body**     | **Object** | Map of parameters used for variable substitution. |

{: class="table-striped"}

### Return type

[**TestExecutionResult**](TestExecutionResult.md)

<a name="postIntegrationsActionExecute"></a>

# **postIntegrationsActionExecute**

> Object postIntegrationsActionExecute(actionId, body)

Execute Action and return response from 3rd party. Responses will follow the schemas defined on the Action for success and error.

Wraps POST /api/v2/integrations/actions/{actionId}/execute

Requires ANY permissions:

- integrations:action:execute
- bridge:actions:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    Object result = apiInstance.postIntegrationsActionExecute(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionExecute");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                       | Notes |
| ------------ | ---------- | ------------------------------------------------- | ----- |
| **actionId** | **String** | actionId                                          |
| **body**     | **Object** | Map of parameters used for variable substitution. |

{: class="table-striped"}

### Return type

**Object**

<a name="postIntegrationsActionTest"></a>

# **postIntegrationsActionTest**

> [TestExecutionResult](TestExecutionResult.md) postIntegrationsActionTest(actionId, body)

Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.

Wraps POST /api/v2/integrations/actions/{actionId}/test

Requires ANY permissions:

- integrations:action:execute
- bridge:actions:execute

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String actionId = "actionId_example"; // String | actionId
Object body = null; // Object | Map of parameters used for variable substitution.
try {
    TestExecutionResult result = apiInstance.postIntegrationsActionTest(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionTest");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                                       | Notes |
| ------------ | ---------- | ------------------------------------------------- | ----- |
| **actionId** | **String** | actionId                                          |
| **body**     | **Object** | Map of parameters used for variable substitution. |

{: class="table-striped"}

### Return type

[**TestExecutionResult**](TestExecutionResult.md)

<a name="postIntegrationsActions"></a>

# **postIntegrationsActions**

> [Action](Action.md) postIntegrationsActions(body)

Create a new Action

Wraps POST /api/v2/integrations/actions

Requires ANY permissions:

- integrations:action:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action.
try {
    Action result = apiInstance.postIntegrationsActions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActions");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description                  | Notes |
| -------- | ----------------------------------------- | ---------------------------- | ----- |
| **body** | [**PostActionInput**](PostActionInput.md) | Input used to create Action. |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="postIntegrationsActionsDrafts"></a>

# **postIntegrationsActionsDrafts**

> [Action](Action.md) postIntegrationsActionsDrafts(body)

Create a new Draft

Wraps POST /api/v2/integrations/actions/drafts

Requires ANY permissions:

- integrations:action:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
PostActionInput body = new PostActionInput(); // PostActionInput | Input used to create Action Draft.
try {
    Action result = apiInstance.postIntegrationsActionsDrafts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsActionsDrafts");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description                        | Notes |
| -------- | ----------------------------------------- | ---------------------------------- | ----- |
| **body** | [**PostActionInput**](PostActionInput.md) | Input used to create Action Draft. |

{: class="table-striped"}

### Return type

[**Action**](Action.md)

<a name="postIntegrationsCredentials"></a>

# **postIntegrationsCredentials**

> [CredentialInfo](CredentialInfo.md) postIntegrationsCredentials(body)

Create a set of credentials

Wraps POST /api/v2/integrations/credentials

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.postIntegrationsCredentials(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsCredentials");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes      |
| -------- | ------------------------------- | ----------- | ---------- |
| **body** | [**Credential**](Credential.md) | Credential  | [optional] |

{: class="table-striped"}

### Return type

[**CredentialInfo**](CredentialInfo.md)

<a name="postIntegrationsWorkforcemanagementVendorconnection"></a>

# **postIntegrationsWorkforcemanagementVendorconnection**

> [UserActionCategoryEntityListing](UserActionCategoryEntityListing.md) postIntegrationsWorkforcemanagementVendorconnection(body)

Add a vendor connection

Wraps POST /api/v2/integrations/workforcemanagement/vendorconnection

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
VendorConnectionRequest body = new VendorConnectionRequest(); // VendorConnectionRequest |
try {
    UserActionCategoryEntityListing result = apiInstance.postIntegrationsWorkforcemanagementVendorconnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#postIntegrationsWorkforcemanagementVendorconnection");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description | Notes      |
| -------- | --------------------------------------------------------- | ----------- | ---------- |
| **body** | [**VendorConnectionRequest**](VendorConnectionRequest.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**UserActionCategoryEntityListing**](UserActionCategoryEntityListing.md)

<a name="putIntegrationConfigCurrent"></a>

# **putIntegrationConfigCurrent**

> [IntegrationConfiguration](IntegrationConfiguration.md) putIntegrationConfigCurrent(integrationId, body)

Update integration configuration.

Wraps PUT /api/v2/integrations/{integrationId}/config/current

Requires ANY permissions:

- integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | Integration Id
IntegrationConfiguration body = new IntegrationConfiguration(); // IntegrationConfiguration | Integration Configuration
try {
    IntegrationConfiguration result = apiInstance.putIntegrationConfigCurrent(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationConfigCurrent");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                        | Description               | Notes      |
| ----------------- | ----------------------------------------------------------- | ------------------------- | ---------- |
| **integrationId** | **String**                                                  | Integration Id            |
| **body**          | [**IntegrationConfiguration**](IntegrationConfiguration.md) | Integration Configuration | [optional] |

{: class="table-striped"}

### Return type

[**IntegrationConfiguration**](IntegrationConfiguration.md)

<a name="putIntegrationsBotconnectorIntegrationIdBots"></a>

# **putIntegrationsBotconnectorIntegrationIdBots**

> Void putIntegrationsBotconnectorIntegrationIdBots(integrationId, botList)

Set a list of botConnector bots plus versions for this integration

Wraps PUT /api/v2/integrations/botconnector/{integrationId}/bots

Requires ANY permissions:

- integration:botconnector:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String integrationId = "integrationId_example"; // String | The integration ID for this group of bots
BotList botList = new BotList(); // BotList |
try {
    apiInstance.putIntegrationsBotconnectorIntegrationIdBots(integrationId, botList);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsBotconnectorIntegrationIdBots");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                      | Description                               | Notes |
| ----------------- | ------------------------- | ----------------------------------------- | ----- |
| **integrationId** | **String**                | The integration ID for this group of bots |
| **botList**       | [**BotList**](BotList.md) |                                           |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="putIntegrationsCredential"></a>

# **putIntegrationsCredential**

> [CredentialInfo](CredentialInfo.md) putIntegrationsCredential(credentialId, body)

Update a set of credentials

Wraps PUT /api/v2/integrations/credentials/{credentialId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
String credentialId = "credentialId_example"; // String | Credential ID
Credential body = new Credential(); // Credential | Credential
try {
    CredentialInfo result = apiInstance.putIntegrationsCredential(credentialId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsCredential");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                            | Description   | Notes      |
| ---------------- | ------------------------------- | ------------- | ---------- |
| **credentialId** | **String**                      | Credential ID |
| **body**         | [**Credential**](Credential.md) | Credential    | [optional] |

{: class="table-striped"}

### Return type

[**CredentialInfo**](CredentialInfo.md)

<a name="putIntegrationsSpeechTtsSettings"></a>

# **putIntegrationsSpeechTtsSettings**

> [TtsSettings](TtsSettings.md) putIntegrationsSpeechTtsSettings(body)

Update TTS settings for an org

Wraps PUT /api/v2/integrations/speech/tts/settings

Requires ANY permissions:

- integrations:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntegrationsApi apiInstance = new IntegrationsApi();
TtsSettings body = new TtsSettings(); // TtsSettings | Updated TtsSettings
try {
    TtsSettings result = apiInstance.putIntegrationsSpeechTtsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#putIntegrationsSpeechTtsSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description         | Notes |
| -------- | --------------------------------- | ------------------- | ----- |
| **body** | [**TtsSettings**](TtsSettings.md) | Updated TtsSettings |

{: class="table-striped"}

### Return type

[**TtsSettings**](TtsSettings.md)
