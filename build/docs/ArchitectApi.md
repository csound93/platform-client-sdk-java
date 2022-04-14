---
title: ArchitectApi
---

## ArchitectApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                               | Description                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------- |
| [**deleteArchitectEmergencygroup**](ArchitectApi.md#deleteArchitectEmergencygroup)                                                   | Deletes a emergency group by ID                                                                                      |
| [**deleteArchitectIvr**](ArchitectApi.md#deleteArchitectIvr)                                                                         | Delete an IVR Config.                                                                                                |
| [**deleteArchitectPrompt**](ArchitectApi.md#deleteArchitectPrompt)                                                                   | Delete specified user prompt                                                                                         |
| [**deleteArchitectPromptResource**](ArchitectApi.md#deleteArchitectPromptResource)                                                   | Delete specified user prompt resource                                                                                |
| [**deleteArchitectPromptResourceAudio**](ArchitectApi.md#deleteArchitectPromptResourceAudio)                                         | Delete specified user prompt resource audio                                                                          |
| [**deleteArchitectPrompts**](ArchitectApi.md#deleteArchitectPrompts)                                                                 | Batch-delete a list of prompts                                                                                       |
| [**deleteArchitectSchedule**](ArchitectApi.md#deleteArchitectSchedule)                                                               | Delete a schedule by id                                                                                              |
| [**deleteArchitectSchedulegroup**](ArchitectApi.md#deleteArchitectSchedulegroup)                                                     | Deletes a schedule group by ID                                                                                       |
| [**deleteArchitectSystempromptResource**](ArchitectApi.md#deleteArchitectSystempromptResource)                                       | Delete a system prompt resource override.                                                                            |
| [**deleteFlow**](ArchitectApi.md#deleteFlow)                                                                                         | Delete flow                                                                                                          |
| [**deleteFlows**](ArchitectApi.md#deleteFlows)                                                                                       | Batch-delete a list of flows                                                                                         |
| [**deleteFlowsDatatable**](ArchitectApi.md#deleteFlowsDatatable)                                                                     | deletes a specific datatable by id                                                                                   |
| [**deleteFlowsDatatableRow**](ArchitectApi.md#deleteFlowsDatatableRow)                                                               | Delete a row entry                                                                                                   |
| [**deleteFlowsMilestone**](ArchitectApi.md#deleteFlowsMilestone)                                                                     | Delete a flow milestone.                                                                                             |
| [**getArchitectDependencytracking**](ArchitectApi.md#getArchitectDependencytracking)                                                 | Get Dependency Tracking objects that have a given display name                                                       |
| [**getArchitectDependencytrackingBuild**](ArchitectApi.md#getArchitectDependencytrackingBuild)                                       | Get Dependency Tracking build status for an organization                                                             |
| [**getArchitectDependencytrackingConsumedresources**](ArchitectApi.md#getArchitectDependencytrackingConsumedresources)               | Get resources that are consumed by a given Dependency Tracking object                                                |
| [**getArchitectDependencytrackingConsumingresources**](ArchitectApi.md#getArchitectDependencytrackingConsumingresources)             | Get resources that consume a given Dependency Tracking object                                                        |
| [**getArchitectDependencytrackingDeletedresourceconsumers**](ArchitectApi.md#getArchitectDependencytrackingDeletedresourceconsumers) | Get Dependency Tracking objects that consume deleted resources                                                       |
| [**getArchitectDependencytrackingObject**](ArchitectApi.md#getArchitectDependencytrackingObject)                                     | Get a Dependency Tracking object                                                                                     |
| [**getArchitectDependencytrackingType**](ArchitectApi.md#getArchitectDependencytrackingType)                                         | Get a Dependency Tracking type.                                                                                      |
| [**getArchitectDependencytrackingTypes**](ArchitectApi.md#getArchitectDependencytrackingTypes)                                       | Get Dependency Tracking types.                                                                                       |
| [**getArchitectDependencytrackingUpdatedresourceconsumers**](ArchitectApi.md#getArchitectDependencytrackingUpdatedresourceconsumers) | Get Dependency Tracking objects that depend on updated resources                                                     |
| [**getArchitectEmergencygroup**](ArchitectApi.md#getArchitectEmergencygroup)                                                         | Gets a emergency group by ID                                                                                         |
| [**getArchitectEmergencygroups**](ArchitectApi.md#getArchitectEmergencygroups)                                                       | Get a list of emergency groups.                                                                                      |
| [**getArchitectIvr**](ArchitectApi.md#getArchitectIvr)                                                                               | Get an IVR config.                                                                                                   |
| [**getArchitectIvrs**](ArchitectApi.md#getArchitectIvrs)                                                                             | Get IVR configs.                                                                                                     |
| [**getArchitectPrompt**](ArchitectApi.md#getArchitectPrompt)                                                                         | Get specified user prompt                                                                                            |
| [**getArchitectPromptHistoryHistoryId**](ArchitectApi.md#getArchitectPromptHistoryHistoryId)                                         | Get generated prompt history                                                                                         |
| [**getArchitectPromptResource**](ArchitectApi.md#getArchitectPromptResource)                                                         | Get specified user prompt resource                                                                                   |
| [**getArchitectPromptResources**](ArchitectApi.md#getArchitectPromptResources)                                                       | Get a pageable list of user prompt resources                                                                         |
| [**getArchitectPrompts**](ArchitectApi.md#getArchitectPrompts)                                                                       | Get a pageable list of user prompts                                                                                  |
| [**getArchitectSchedule**](ArchitectApi.md#getArchitectSchedule)                                                                     | Get a schedule by ID                                                                                                 |
| [**getArchitectSchedulegroup**](ArchitectApi.md#getArchitectSchedulegroup)                                                           | Gets a schedule group by ID                                                                                          |
| [**getArchitectSchedulegroups**](ArchitectApi.md#getArchitectSchedulegroups)                                                         | Get a list of schedule groups.                                                                                       |
| [**getArchitectSchedules**](ArchitectApi.md#getArchitectSchedules)                                                                   | Get a list of schedules.                                                                                             |
| [**getArchitectSystemprompt**](ArchitectApi.md#getArchitectSystemprompt)                                                             | Get a system prompt                                                                                                  |
| [**getArchitectSystempromptHistoryHistoryId**](ArchitectApi.md#getArchitectSystempromptHistoryHistoryId)                             | Get generated prompt history                                                                                         |
| [**getArchitectSystempromptResource**](ArchitectApi.md#getArchitectSystempromptResource)                                             | Get a system prompt resource.                                                                                        |
| [**getArchitectSystempromptResources**](ArchitectApi.md#getArchitectSystempromptResources)                                           | Get system prompt resources.                                                                                         |
| [**getArchitectSystemprompts**](ArchitectApi.md#getArchitectSystemprompts)                                                           | Get System Prompts                                                                                                   |
| [**getFlow**](ArchitectApi.md#getFlow)                                                                                               | Get flow                                                                                                             |
| [**getFlowHistoryHistoryId**](ArchitectApi.md#getFlowHistoryHistoryId)                                                               | Get generated flow history                                                                                           |
| [**getFlowLatestconfiguration**](ArchitectApi.md#getFlowLatestconfiguration)                                                         | Get the latest configuration for flow                                                                                |
| [**getFlowVersion**](ArchitectApi.md#getFlowVersion)                                                                                 | Get flow version                                                                                                     |
| [**getFlowVersionConfiguration**](ArchitectApi.md#getFlowVersionConfiguration)                                                       | Create flow version configuration                                                                                    |
| [**getFlowVersions**](ArchitectApi.md#getFlowVersions)                                                                               | Get flow version list                                                                                                |
| [**getFlows**](ArchitectApi.md#getFlows)                                                                                             | Get a pageable list of flows, filtered by query parameters                                                           |
| [**getFlowsDatatable**](ArchitectApi.md#getFlowsDatatable)                                                                           | Returns a specific datatable by id                                                                                   |
| [**getFlowsDatatableExportJob**](ArchitectApi.md#getFlowsDatatableExportJob)                                                         | Returns the state information about an export job                                                                    |
| [**getFlowsDatatableImportJob**](ArchitectApi.md#getFlowsDatatableImportJob)                                                         | Returns the state information about an import job                                                                    |
| [**getFlowsDatatableImportJobs**](ArchitectApi.md#getFlowsDatatableImportJobs)                                                       | Get all recent import jobs                                                                                           |
| [**getFlowsDatatableRow**](ArchitectApi.md#getFlowsDatatableRow)                                                                     | Returns a specific row for the datatable                                                                             |
| [**getFlowsDatatableRows**](ArchitectApi.md#getFlowsDatatableRows)                                                                   | Returns the rows for the datatable with the given id                                                                 |
| [**getFlowsDatatables**](ArchitectApi.md#getFlowsDatatables)                                                                         | Retrieve a list of datatables for the org                                                                            |
| [**getFlowsDatatablesDivisionview**](ArchitectApi.md#getFlowsDatatablesDivisionview)                                                 | Returns a specific datatable by id                                                                                   |
| [**getFlowsDatatablesDivisionviews**](ArchitectApi.md#getFlowsDatatablesDivisionviews)                                               | Retrieve a list of datatables for the org                                                                            |
| [**getFlowsDivisionviews**](ArchitectApi.md#getFlowsDivisionviews)                                                                   | Get a pageable list of basic flow information objects filterable by query parameters.                                |
| [**getFlowsExecution**](ArchitectApi.md#getFlowsExecution)                                                                           | Get a flow execution&#39;s details. Flow execution details are available for several days after the flow is started. |
| [**getFlowsMilestone**](ArchitectApi.md#getFlowsMilestone)                                                                           | Get a flow milestone                                                                                                 |
| [**getFlowsMilestones**](ArchitectApi.md#getFlowsMilestones)                                                                         | Get a pageable list of flow milestones, filtered by query parameters                                                 |
| [**getFlowsMilestonesDivisionviews**](ArchitectApi.md#getFlowsMilestonesDivisionviews)                                               | Get a pageable list of basic flow milestone information objects filterable by query parameters.                      |
| [**getFlowsOutcome**](ArchitectApi.md#getFlowsOutcome)                                                                               | Get a flow outcome                                                                                                   |
| [**getFlowsOutcomes**](ArchitectApi.md#getFlowsOutcomes)                                                                             | Get a pageable list of flow outcomes, filtered by query parameters                                                   |
| [**getFlowsOutcomesDivisionviews**](ArchitectApi.md#getFlowsOutcomesDivisionviews)                                                   | Get a pageable list of basic flow outcome information objects filterable by query parameters.                        |
| [**postArchitectDependencytrackingBuild**](ArchitectApi.md#postArchitectDependencytrackingBuild)                                     | Rebuild Dependency Tracking data for an organization                                                                 |
| [**postArchitectEmergencygroups**](ArchitectApi.md#postArchitectEmergencygroups)                                                     | Creates a new emergency group                                                                                        |
| [**postArchitectIvrs**](ArchitectApi.md#postArchitectIvrs)                                                                           | Create IVR config.                                                                                                   |
| [**postArchitectPromptHistory**](ArchitectApi.md#postArchitectPromptHistory)                                                         | Generate prompt history                                                                                              |
| [**postArchitectPromptResources**](ArchitectApi.md#postArchitectPromptResources)                                                     | Create a new user prompt resource                                                                                    |
| [**postArchitectPrompts**](ArchitectApi.md#postArchitectPrompts)                                                                     | Create a new user prompt                                                                                             |
| [**postArchitectSchedulegroups**](ArchitectApi.md#postArchitectSchedulegroups)                                                       | Creates a new schedule group                                                                                         |
| [**postArchitectSchedules**](ArchitectApi.md#postArchitectSchedules)                                                                 | Create a new schedule.                                                                                               |
| [**postArchitectSystempromptHistory**](ArchitectApi.md#postArchitectSystempromptHistory)                                             | Generate system prompt history                                                                                       |
| [**postArchitectSystempromptResources**](ArchitectApi.md#postArchitectSystempromptResources)                                         | Create system prompt resource override.                                                                              |
| [**postFlowHistory**](ArchitectApi.md#postFlowHistory)                                                                               | Generate flow history                                                                                                |
| [**postFlowVersions**](ArchitectApi.md#postFlowVersions)                                                                             | Create flow version                                                                                                  |
| [**postFlows**](ArchitectApi.md#postFlows)                                                                                           | Create flow                                                                                                          |
| [**postFlowsActionsCheckin**](ArchitectApi.md#postFlowsActionsCheckin)                                                               | Check-in flow                                                                                                        |
| [**postFlowsActionsCheckout**](ArchitectApi.md#postFlowsActionsCheckout)                                                             | Check-out flow                                                                                                       |
| [**postFlowsActionsDeactivate**](ArchitectApi.md#postFlowsActionsDeactivate)                                                         | Deactivate flow                                                                                                      |
| [**postFlowsActionsPublish**](ArchitectApi.md#postFlowsActionsPublish)                                                               | Publish flow                                                                                                         |
| [**postFlowsActionsRevert**](ArchitectApi.md#postFlowsActionsRevert)                                                                 | Revert flow                                                                                                          |
| [**postFlowsActionsUnlock**](ArchitectApi.md#postFlowsActionsUnlock)                                                                 | Unlock flow                                                                                                          |
| [**postFlowsDatatableExportJobs**](ArchitectApi.md#postFlowsDatatableExportJobs)                                                     | Begin an export process for exporting all rows from a datatable                                                      |
| [**postFlowsDatatableImportJobs**](ArchitectApi.md#postFlowsDatatableImportJobs)                                                     | Begin an import process for importing rows into a datatable                                                          |
| [**postFlowsDatatableRows**](ArchitectApi.md#postFlowsDatatableRows)                                                                 | Create a new row entry for the datatable.                                                                            |
| [**postFlowsDatatables**](ArchitectApi.md#postFlowsDatatables)                                                                       | Create a new datatable with the specified json-schema definition                                                     |
| [**postFlowsExecutions**](ArchitectApi.md#postFlowsExecutions)                                                                       | Launch an instance of a flow definition, for flow types that support it such as the &#39;workflow&#39; type.         |
| [**postFlowsMilestones**](ArchitectApi.md#postFlowsMilestones)                                                                       | Create a flow milestone                                                                                              |
| [**postFlowsOutcomes**](ArchitectApi.md#postFlowsOutcomes)                                                                           | Create a flow outcome                                                                                                |
| [**putArchitectEmergencygroup**](ArchitectApi.md#putArchitectEmergencygroup)                                                         | Updates a emergency group by ID                                                                                      |
| [**putArchitectIvr**](ArchitectApi.md#putArchitectIvr)                                                                               | Update an IVR Config.                                                                                                |
| [**putArchitectPrompt**](ArchitectApi.md#putArchitectPrompt)                                                                         | Update specified user prompt                                                                                         |
| [**putArchitectPromptResource**](ArchitectApi.md#putArchitectPromptResource)                                                         | Update specified user prompt resource                                                                                |
| [**putArchitectSchedule**](ArchitectApi.md#putArchitectSchedule)                                                                     | Update schedule by ID                                                                                                |
| [**putArchitectSchedulegroup**](ArchitectApi.md#putArchitectSchedulegroup)                                                           | Updates a schedule group by ID                                                                                       |
| [**putArchitectSystempromptResource**](ArchitectApi.md#putArchitectSystempromptResource)                                             | Updates a system prompt resource override.                                                                           |
| [**putFlow**](ArchitectApi.md#putFlow)                                                                                               | Update flow                                                                                                          |
| [**putFlowsDatatable**](ArchitectApi.md#putFlowsDatatable)                                                                           | Updates a specific datatable by id                                                                                   |
| [**putFlowsDatatableRow**](ArchitectApi.md#putFlowsDatatableRow)                                                                     | Update a row entry                                                                                                   |
| [**putFlowsMilestone**](ArchitectApi.md#putFlowsMilestone)                                                                           | Updates a flow milestone                                                                                             |
| [**putFlowsOutcome**](ArchitectApi.md#putFlowsOutcome)                                                                               | Updates a flow outcome                                                                                               |

{: class="table-striped"}

<a name="deleteArchitectEmergencygroup"></a>

# **deleteArchitectEmergencygroup**

> Void deleteArchitectEmergencygroup(emergencyGroupId)

Deletes a emergency group by ID

Wraps DELETE /api/v2/architect/emergencygroups/{emergencyGroupId}

Requires ALL permissions:

- routing:emergencyGroup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
try {
    apiInstance.deleteArchitectEmergencygroup(emergencyGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description        | Notes |
| -------------------- | ---------- | ------------------ | ----- |
| **emergencyGroupId** | **String** | Emergency group ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectIvr"></a>

# **deleteArchitectIvr**

> Void deleteArchitectIvr(ivrId)

Delete an IVR Config.

Wraps DELETE /api/v2/architect/ivrs/{ivrId}

Requires ALL permissions:

- routing:callRoute:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
try {
    apiInstance.deleteArchitectIvr(ivrId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectIvr");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **ivrId** | **String** | IVR id      |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPrompt"></a>

# **deleteArchitectPrompt**

> Void deleteArchitectPrompt(promptId, allResources)

Delete specified user prompt

Wraps DELETE /api/v2/architect/prompts/{promptId}

Requires ALL permissions:

- architect:userPrompt:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Boolean allResources = true; // Boolean | Whether or not to delete all the prompt resources
try {
    apiInstance.deleteArchitectPrompt(promptId, allResources);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                                       | Notes      |
| ---------------- | ----------- | ------------------------------------------------- | ---------- |
| **promptId**     | **String**  | Prompt ID                                         |
| **allResources** | **Boolean** | Whether or not to delete all the prompt resources | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPromptResource"></a>

# **deleteArchitectPromptResource**

> Void deleteArchitectPromptResource(promptId, languageCode)

Delete specified user prompt resource

Wraps DELETE /api/v2/architect/prompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectPromptResource(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description | Notes |
| ---------------- | ---------- | ----------- | ----- |
| **promptId**     | **String** | Prompt ID   |
| **languageCode** | **String** | Language    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPromptResourceAudio"></a>

# **deleteArchitectPromptResourceAudio**

> Void deleteArchitectPromptResourceAudio(promptId, languageCode)

Delete specified user prompt resource audio

Wraps DELETE /api/v2/architect/prompts/{promptId}/resources/{languageCode}/audio

Requires ALL permissions:

- architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectPromptResourceAudio(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPromptResourceAudio");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description | Notes |
| ---------------- | ---------- | ----------- | ----- |
| **promptId**     | **String** | Prompt ID   |
| **languageCode** | **String** | Language    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectPrompts"></a>

# **deleteArchitectPrompts**

> [Operation](Operation.md) deleteArchitectPrompts(id)

Batch-delete a list of prompts

Multiple IDs can be specified, in which case all specified prompts will be deleted. Asynchronous. Notification topic: v2.architect.prompts.{promptId}

Wraps DELETE /api/v2/architect/prompts

Requires ALL permissions:

- architect:userPrompt:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> id = Arrays.asList("id_example"); // List<String> | List of Prompt IDs
try {
    Operation result = apiInstance.deleteArchitectPrompts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description        | Notes |
| ------ | ----------------------------------- | ------------------ | ----- |
| **id** | [**List&lt;String&gt;**](String.md) | List of Prompt IDs |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="deleteArchitectSchedule"></a>

# **deleteArchitectSchedule**

> Void deleteArchitectSchedule(scheduleId)

Delete a schedule by id

Wraps DELETE /api/v2/architect/schedules/{scheduleId}

Requires ALL permissions:

- routing:schedule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    apiInstance.deleteArchitectSchedule(scheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectSchedulegroup"></a>

# **deleteArchitectSchedulegroup**

> Void deleteArchitectSchedulegroup(scheduleGroupId)

Deletes a schedule group by ID

Wraps DELETE /api/v2/architect/schedulegroups/{scheduleGroupId}

Requires ALL permissions:

- routing:scheduleGroup:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    apiInstance.deleteArchitectSchedulegroup(scheduleGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **scheduleGroupId** | **String** | Schedule group ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteArchitectSystempromptResource"></a>

# **deleteArchitectSystempromptResource**

> Void deleteArchitectSystempromptResource(promptId, languageCode)

Delete a system prompt resource override.

Wraps DELETE /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    apiInstance.deleteArchitectSystempromptResource(promptId, languageCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description | Notes |
| ---------------- | ---------- | ----------- | ----- |
| **promptId**     | **String** | Prompt ID   |
| **languageCode** | **String** | Language    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteFlow"></a>

# **deleteFlow**

> Void deleteFlow(flowId)

Delete flow

Wraps DELETE /api/v2/flows/{flowId}

Requires ANY permissions:

- architect:flow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
try {
    apiInstance.deleteFlow(flowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **flowId** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteFlows"></a>

# **deleteFlows**

> [Operation](Operation.md) deleteFlows(id)

Batch-delete a list of flows

Multiple IDs can be specified, in which case all specified flows will be deleted. Asynchronous. Notification topic: v2.flows.{flowId}

Wraps DELETE /api/v2/flows

Requires ANY permissions:

- architect:flow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> id = Arrays.asList("id_example"); // List<String> | List of Flow IDs
try {
    Operation result = apiInstance.deleteFlows(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlows");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description      | Notes |
| ------ | ----------------------------------- | ---------------- | ----- |
| **id** | [**List&lt;String&gt;**](String.md) | List of Flow IDs |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="deleteFlowsDatatable"></a>

# **deleteFlowsDatatable**

> Void deleteFlowsDatatable(datatableId, force)

deletes a specific datatable by id

Deletes an entire datatable (including the schema and data) with a given datatableId

Wraps DELETE /api/v2/flows/datatables/{datatableId}

Requires ANY permissions:

- architect:datatable:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Boolean force = false; // Boolean | force delete, even if in use
try {
    apiInstance.deleteFlowsDatatable(datatableId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description                  | Notes                         |
| --------------- | ----------- | ---------------------------- | ----------------------------- |
| **datatableId** | **String**  | id of datatable              |
| **force**       | **Boolean** | force delete, even if in use | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteFlowsDatatableRow"></a>

# **deleteFlowsDatatableRow**

> Void deleteFlowsDatatableRow(datatableId, rowId)

Delete a row entry

Deletes a row with a given rowId (the value of the key field).

Wraps DELETE /api/v2/flows/datatables/{datatableId}/rows/{rowId}

Requires ANY permissions:

- architect:datatable:delete
- architect:datatableRow:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | the key for the row
try {
    apiInstance.deleteFlowsDatatableRow(datatableId, rowId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description         | Notes |
| --------------- | ---------- | ------------------- | ----- |
| **datatableId** | **String** | id of datatable     |
| **rowId**       | **String** | the key for the row |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteFlowsMilestone"></a>

# **deleteFlowsMilestone**

> [Empty](Empty.md) deleteFlowsMilestone(milestoneId)

Delete a flow milestone.

Wraps DELETE /api/v2/flows/milestones/{milestoneId}

Requires ALL permissions:

- architect:flowMilestone:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
try {
    Empty result = apiInstance.deleteFlowsMilestone(milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#deleteFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description       | Notes |
| --------------- | ---------- | ----------------- | ----- |
| **milestoneId** | **String** | flow milestone ID |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="getArchitectDependencytracking"></a>

# **getArchitectDependencytracking**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.md) getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType)

Get Dependency Tracking objects that have a given display name

Wraps GET /api/v2/architect/dependencytracking

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Object name to search for
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
Boolean consumedResources = true; // Boolean | Include resources each result item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume each result item
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList("consumingResourceType_example"); // List<String> | Types of consuming resources to return, if consuming resources are requested
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytracking(name, pageNumber, pageSize, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytracking");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type                                | Description                                                                  | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| ------------------------- | ----------------------------------- | ---------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **name**                  | **String**                          | Object name to search for                                                    |
| **pageNumber**            | **Integer**                         | Page number                                                                  | [optional] [default to 1]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **pageSize**              | **Integer**                         | Page size                                                                    | [optional] [default to 25]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **objectType**            | [**List&lt;String&gt;**](String.md) | Object type(s) to search for                                                 | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumedResources**     | **Boolean**                         | Include resources each result item consumes                                  | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **consumingResources**    | **Boolean**                         | Include resources that consume each result item                              | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **consumedResourceType**  | [**List&lt;String&gt;**](String.md) | Types of consumed resources to return, if consumed resources are requested   | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumingResourceType** | [**List&lt;String&gt;**](String.md) | Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |

{: class="table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.md)

<a name="getArchitectDependencytrackingBuild"></a>

# **getArchitectDependencytrackingBuild**

> [DependencyStatus](DependencyStatus.md) getArchitectDependencytrackingBuild()

Get Dependency Tracking build status for an organization

Wraps GET /api/v2/architect/dependencytracking/build

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    DependencyStatus result = apiInstance.getArchitectDependencytrackingBuild();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingBuild");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**DependencyStatus**](DependencyStatus.md)

<a name="getArchitectDependencytrackingConsumedresources"></a>

# **getArchitectDependencytrackingConsumedresources**

> [ConsumedResourcesEntityListing](ConsumedResourcesEntityListing.md) getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType, pageNumber, pageSize)

Get resources that are consumed by a given Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/consumedresources

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Consuming object ID
String version = "version_example"; // String | Consuming object version
String objectType = "objectType_example"; // String | Consuming object type.  Only versioned types are allowed here.
List<String> resourceType = Arrays.asList("resourceType_example"); // List<String> | Types of consumed resources to show
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ConsumedResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumedresources(id, version, objectType, resourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumedresources");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                                   | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| ---------------- | ----------------------------------- | ------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **id**           | **String**                          | Consuming object ID                                           |
| **version**      | **String**                          | Consuming object version                                      |
| **objectType**   | **String**                          | Consuming object type. Only versioned types are allowed here. | <br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW           |
| **resourceType** | [**List&lt;String&gt;**](String.md) | Types of consumed resources to show                           | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **pageNumber**   | **Integer**                         | Page number                                                   | [optional] [default to 1]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **pageSize**     | **Integer**                         | Page size                                                     | [optional] [default to 25]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

{: class="table-striped"}

### Return type

[**ConsumedResourcesEntityListing**](ConsumedResourcesEntityListing.md)

<a name="getArchitectDependencytrackingConsumingresources"></a>

# **getArchitectDependencytrackingConsumingresources**

> [ConsumingResourcesEntityListing](ConsumingResourcesEntityListing.md) getArchitectDependencytrackingConsumingresources(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter)

Get resources that consume a given Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/consumingresources

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Consumed object ID
String objectType = "objectType_example"; // String | Consumed object type
List<String> resourceType = Arrays.asList("resourceType_example"); // List<String> | Types of consuming resources to show.  Only versioned types are allowed here.
String version = "version_example"; // String | Object version
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String flowFilter = "flowFilter_example"; // String | Show only checkedIn or published flows
try {
    ConsumingResourcesEntityListing result = apiInstance.getArchitectDependencytrackingConsumingresources(id, objectType, resourceType, version, pageNumber, pageSize, flowFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingConsumingresources");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                                                  | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| ---------------- | ----------------------------------- | ---------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **id**           | **String**                          | Consumed object ID                                                           |
| **objectType**   | **String**                          | Consumed object type                                                         | <br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW           |
| **resourceType** | [**List&lt;String&gt;**](String.md) | Types of consuming resources to show. Only versioned types are allowed here. | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **version**      | **String**                          | Object version                                                               | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **pageNumber**   | **Integer**                         | Page number                                                                  | [optional] [default to 1]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **pageSize**     | **Integer**                         | Page size                                                                    | [optional] [default to 25]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **flowFilter**   | **String**                          | Show only checkedIn or published flows                                       | [optional]<br />**Values**: checkedIn, published                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**ConsumingResourcesEntityListing**](ConsumingResourcesEntityListing.md)

<a name="getArchitectDependencytrackingDeletedresourceconsumers"></a>

# **getArchitectDependencytrackingDeletedresourceconsumers**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.md) getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that consume deleted resources

Wraps GET /api/v2/architect/dependencytracking/deletedresourceconsumers

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
String flowFilter = "flowFilter_example"; // String | Show only checkedIn or published flows
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingDeletedresourceconsumers(name, objectType, flowFilter, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingDeletedresourceconsumers");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                | Description                            | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| ------------------------ | ----------------------------------- | -------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **name**                 | **String**                          | Name to search for                     | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **objectType**           | [**List&lt;String&gt;**](String.md) | Object type(s) to search for           | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **flowFilter**           | **String**                          | Show only checkedIn or published flows | [optional]<br />**Values**: checkedIn, published                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| **consumedResources**    | **Boolean**                         | Return consumed resources?             | [optional] [default to false]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| **consumedResourceType** | [**List&lt;String&gt;**](String.md) | Resource type(s) to return             | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **pageNumber**           | **Integer**                         | Page number                            | [optional] [default to 1]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **pageSize**             | **Integer**                         | Page size                              | [optional] [default to 25]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

{: class="table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.md)

<a name="getArchitectDependencytrackingObject"></a>

# **getArchitectDependencytrackingObject**

> [DependencyObject](DependencyObject.md) getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest)

Get a Dependency Tracking object

Wraps GET /api/v2/architect/dependencytracking/object

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String id = "id_example"; // String | Object ID
String version = "version_example"; // String | Object version
String objectType = "objectType_example"; // String | Object type
Boolean consumedResources = true; // Boolean | Include resources this item consumes
Boolean consumingResources = true; // Boolean | Include resources that consume this item
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Types of consumed resources to return, if consumed resources are requested
List<String> consumingResourceType = Arrays.asList("consumingResourceType_example"); // List<String> | Types of consuming resources to return, if consuming resources are requested
Boolean consumedResourceRequest = true; // Boolean | Indicate that this is going to look up a consumed resource object
try {
    DependencyObject result = apiInstance.getArchitectDependencytrackingObject(id, version, objectType, consumedResources, consumingResources, consumedResourceType, consumingResourceType, consumedResourceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingObject");
    e.printStackTrace();
}
```

### Parameters

| Name                        | Type                                | Description                                                                  | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| --------------------------- | ----------------------------------- | ---------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **id**                      | **String**                          | Object ID                                                                    |
| **version**                 | **String**                          | Object version                                                               | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **objectType**              | **String**                          | Object type                                                                  | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumedResources**       | **Boolean**                         | Include resources this item consumes                                         | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **consumingResources**      | **Boolean**                         | Include resources that consume this item                                     | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **consumedResourceType**    | [**List&lt;String&gt;**](String.md) | Types of consumed resources to return, if consumed resources are requested   | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumingResourceType**   | [**List&lt;String&gt;**](String.md) | Types of consuming resources to return, if consuming resources are requested | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumedResourceRequest** | **Boolean**                         | Indicate that this is going to look up a consumed resource object            | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

{: class="table-striped"}

### Return type

[**DependencyObject**](DependencyObject.md)

<a name="getArchitectDependencytrackingType"></a>

# **getArchitectDependencytrackingType**

> [DependencyType](DependencyType.md) getArchitectDependencytrackingType(typeId)

Get a Dependency Tracking type.

Wraps GET /api/v2/architect/dependencytracking/types/{typeId}

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String typeId = "typeId_example"; // String | Type ID
try {
    DependencyType result = apiInstance.getArchitectDependencytrackingType(typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingType");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **typeId** | **String** | Type ID     |

{: class="table-striped"}

### Return type

[**DependencyType**](DependencyType.md)

<a name="getArchitectDependencytrackingTypes"></a>

# **getArchitectDependencytrackingTypes**

> [DependencyTypeEntityListing](DependencyTypeEntityListing.md) getArchitectDependencytrackingTypes(pageNumber, pageSize)

Get Dependency Tracking types.

Wraps GET /api/v2/architect/dependencytracking/types

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyTypeEntityListing result = apiInstance.getArchitectDependencytrackingTypes(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingTypes");
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

[**DependencyTypeEntityListing**](DependencyTypeEntityListing.md)

<a name="getArchitectDependencytrackingUpdatedresourceconsumers"></a>

# **getArchitectDependencytrackingUpdatedresourceconsumers**

> [DependencyObjectEntityListing](DependencyObjectEntityListing.md) getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize)

Get Dependency Tracking objects that depend on updated resources

Wraps GET /api/v2/architect/dependencytracking/updatedresourceconsumers

Requires ALL permissions:

- architect:dependencyTracking:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String name = "name_example"; // String | Name to search for
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type(s) to search for
Boolean consumedResources = false; // Boolean | Return consumed resources?
List<String> consumedResourceType = Arrays.asList("consumedResourceType_example"); // List<String> | Resource type(s) to return
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DependencyObjectEntityListing result = apiInstance.getArchitectDependencytrackingUpdatedresourceconsumers(name, objectType, consumedResources, consumedResourceType, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectDependencytrackingUpdatedresourceconsumers");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                | Description                  | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| ------------------------ | ----------------------------------- | ---------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **name**                 | **String**                          | Name to search for           | [optional]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| **objectType**           | [**List&lt;String&gt;**](String.md) | Object type(s) to search for | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **consumedResources**    | **Boolean**                         | Return consumed resources?   | [optional] [default to false]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| **consumedResourceType** | [**List&lt;String&gt;**](String.md) | Resource type(s) to return   | [optional]<br />**Values**: ACDLANGUAGE, ACDSKILL, ACDWRAPUPCODE, BOTCONNECTORBOT, BOTCONNECTORINTEGRATION, BOTFLOW, BRIDGEACTION, COMMONMODULEFLOW, COMPOSERSCRIPT, CONTACTLIST, DATAACTION, DATATABLE, DIALOGENGINEBOT, DIALOGENGINEBOTVERSION, DIALOGFLOWAGENT, DIALOGFLOWCXAGENT, DIGITALBOTFLOW, EMAILROUTE, EMERGENCYGROUP, FLOWACTION, FLOWDATATYPE, FLOWMILESTONE, FLOWOUTCOME, GROUP, INBOUNDCALLFLOW, INBOUNDCHATFLOW, INBOUNDEMAILFLOW, INBOUNDSHORTMESSAGEFLOW, INQUEUECALLFLOW, INQUEUEEMAILFLOW, INQUEUESHORTMESSAGEFLOW, IVRCONFIGURATION, KNOWLEDGEBASE, KNOWLEDGEBASEDOCUMENT, LANGUAGE, LEXBOT, LEXBOTALIAS, LEXV2BOT, LEXV2BOTALIAS, NLUDOMAIN, NUANCEMIXBOT, NUANCEMIXINTEGRATION, OAUTHCLIENT, OUTBOUNDCALLFLOW, QUEUE, RECORDINGPOLICY, RESPONSE, SCHEDULE, SCHEDULEGROUP, SECUREACTION, SECURECALLFLOW, SURVEYINVITEFLOW, SYSTEMPROMPT, TTSENGINE, TTSVOICE, USER, USERPROMPT, VOICEMAILFLOW, WIDGET, WORKFLOW, WORKITEMFLOW |
| **pageNumber**           | **Integer**                         | Page number                  | [optional] [default to 1]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| **pageSize**             | **Integer**                         | Page size                    | [optional] [default to 25]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

{: class="table-striped"}

### Return type

[**DependencyObjectEntityListing**](DependencyObjectEntityListing.md)

<a name="getArchitectEmergencygroup"></a>

# **getArchitectEmergencygroup**

> [EmergencyGroup](EmergencyGroup.md) getArchitectEmergencygroup(emergencyGroupId)

Gets a emergency group by ID

Wraps GET /api/v2/architect/emergencygroups/{emergencyGroupId}

Requires ALL permissions:

- routing:emergencyGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
try {
    EmergencyGroup result = apiInstance.getArchitectEmergencygroup(emergencyGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type       | Description        | Notes |
| -------------------- | ---------- | ------------------ | ----- |
| **emergencyGroupId** | **String** | Emergency group ID |

{: class="table-striped"}

### Return type

[**EmergencyGroup**](EmergencyGroup.md)

<a name="getArchitectEmergencygroups"></a>

# **getArchitectEmergencygroups**

> [EmergencyGroupListing](EmergencyGroupListing.md) getArchitectEmergencygroups(pageNumber, pageSize, sortBy, sortOrder, name)

Get a list of emergency groups.

Wraps GET /api/v2/architect/emergencygroups

Requires ALL permissions:

- routing:emergencyGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Emergency Group to filter by.
try {
    EmergencyGroupListing result = apiInstance.getArchitectEmergencygroups(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectEmergencygroups");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                               | Notes                        |
| -------------- | ----------- | ----------------------------------------- | ---------------------------- |
| **pageNumber** | **Integer** | Page number                               | [optional] [default to 1]    |
| **pageSize**   | **Integer** | Page size                                 | [optional] [default to 25]   |
| **sortBy**     | **String**  | Sort by                                   | [optional] [default to name] |
| **sortOrder**  | **String**  | Sort order                                | [optional] [default to ASC]  |
| **name**       | **String**  | Name of the Emergency Group to filter by. | [optional]                   |

{: class="table-striped"}

### Return type

[**EmergencyGroupListing**](EmergencyGroupListing.md)

<a name="getArchitectIvr"></a>

# **getArchitectIvr**

> [IVR](IVR.md) getArchitectIvr(ivrId)

Get an IVR config.

Wraps GET /api/v2/architect/ivrs/{ivrId}

Requires ALL permissions:

- routing:callRoute:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
try {
    IVR result = apiInstance.getArchitectIvr(ivrId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvr");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **ivrId** | **String** | IVR id      |

{: class="table-striped"}

### Return type

[**IVR**](IVR.md)

<a name="getArchitectIvrs"></a>

# **getArchitectIvrs**

> [IVREntityListing](IVREntityListing.md) getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name)

Get IVR configs.

Wraps GET /api/v2/architect/ivrs

Requires ALL permissions:

- routing:callRoute:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the IVR to filter by.
try {
    IVREntityListing result = apiInstance.getArchitectIvrs(pageNumber, pageSize, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectIvrs");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                   | Notes                        |
| -------------- | ----------- | ----------------------------- | ---------------------------- |
| **pageNumber** | **Integer** | Page number                   | [optional] [default to 1]    |
| **pageSize**   | **Integer** | Page size                     | [optional] [default to 25]   |
| **sortBy**     | **String**  | Sort by                       | [optional] [default to name] |
| **sortOrder**  | **String**  | Sort order                    | [optional] [default to ASC]  |
| **name**       | **String**  | Name of the IVR to filter by. | [optional]                   |

{: class="table-striped"}

### Return type

[**IVREntityListing**](IVREntityListing.md)

<a name="getArchitectPrompt"></a>

# **getArchitectPrompt**

> [Prompt](Prompt.md) getArchitectPrompt(promptId)

Get specified user prompt

Wraps GET /api/v2/architect/prompts/{promptId}

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
try {
    Prompt result = apiInstance.getArchitectPrompt(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **promptId** | **String** | Prompt ID   |

{: class="table-striped"}

### Return type

[**Prompt**](Prompt.md)

<a name="getArchitectPromptHistoryHistoryId"></a>

# **getArchitectPromptHistoryHistoryId**

> [HistoryListing](HistoryListing.md) getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history

Wraps GET /api/v2/architect/prompts/{promptId}/history/{historyId}

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectPromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                   | Notes                                                                                                   |
| -------------- | ----------------------------------- | --------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| **promptId**   | **String**                          | Prompt ID                                     |
| **historyId**  | **String**                          | History request ID                            |
| **pageNumber** | **Integer**                         | Page number                                   | [optional] [default to 1]                                                                               |
| **pageSize**   | **Integer**                         | Page size                                     | [optional] [default to 25]                                                                              |
| **sortOrder**  | **String**                          | Sort order                                    | [optional] [default to desc]                                                                            |
| **sortBy**     | **String**                          | Sort by                                       | [optional] [default to timestamp]<br />**Values**: action, timestamp, user                              |
| **action**     | [**List&lt;String&gt;**](String.md) | Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |

{: class="table-striped"}

### Return type

[**HistoryListing**](HistoryListing.md)

<a name="getArchitectPromptResource"></a>

# **getArchitectPromptResource**

> [PromptAsset](PromptAsset.md) getArchitectPromptResource(promptId, languageCode)

Get specified user prompt resource

Wraps GET /api/v2/architect/prompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    PromptAsset result = apiInstance.getArchitectPromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description | Notes |
| ---------------- | ---------- | ----------- | ----- |
| **promptId**     | **String** | Prompt ID   |
| **languageCode** | **String** | Language    |

{: class="table-striped"}

### Return type

[**PromptAsset**](PromptAsset.md)

<a name="getArchitectPromptResources"></a>

# **getArchitectPromptResources**

> [PromptAssetEntityListing](PromptAssetEntityListing.md) getArchitectPromptResources(promptId, pageNumber, pageSize)

Get a pageable list of user prompt resources

The returned list is pageable, and query parameters can be used for filtering.

Wraps GET /api/v2/architect/prompts/{promptId}/resources

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    PromptAssetEntityListing result = apiInstance.getArchitectPromptResources(promptId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPromptResources");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **promptId**   | **String**  | Prompt ID   |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**PromptAssetEntityListing**](PromptAssetEntityListing.md)

<a name="getArchitectPrompts"></a>

# **getArchitectPrompts**

> [PromptEntityListing](PromptEntityListing.md) getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder)

Get a pageable list of user prompts

The returned list is pageable, and query parameters can be used for filtering. Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.

Wraps GET /api/v2/architect/prompts

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> name = Arrays.asList("name_example"); // List<String> | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    PromptEntityListing result = apiInstance.getArchitectPrompts(pageNumber, pageSize, name, description, nameOrDescription, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description         | Notes                       |
| --------------------- | ----------------------------------- | ------------------- | --------------------------- |
| **pageNumber**        | **Integer**                         | Page number         | [optional] [default to 1]   |
| **pageSize**          | **Integer**                         | Page size           | [optional] [default to 25]  |
| **name**              | [**List&lt;String&gt;**](String.md) | Name                | [optional]                  |
| **description**       | **String**                          | Description         | [optional]                  |
| **nameOrDescription** | **String**                          | Name or description | [optional]                  |
| **sortBy**            | **String**                          | Sort by             | [optional] [default to id]  |
| **sortOrder**         | **String**                          | Sort order          | [optional] [default to asc] |

{: class="table-striped"}

### Return type

[**PromptEntityListing**](PromptEntityListing.md)

<a name="getArchitectSchedule"></a>

# **getArchitectSchedule**

> [Schedule](Schedule.md) getArchitectSchedule(scheduleId)

Get a schedule by ID

Wraps GET /api/v2/architect/schedules/{scheduleId}

Requires ALL permissions:

- routing:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    Schedule result = apiInstance.getArchitectSchedule(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

[**Schedule**](Schedule.md)

<a name="getArchitectSchedulegroup"></a>

# **getArchitectSchedulegroup**

> [ScheduleGroup](ScheduleGroup.md) getArchitectSchedulegroup(scheduleGroupId)

Gets a schedule group by ID

Wraps GET /api/v2/architect/schedulegroups/{scheduleGroupId}

Requires ALL permissions:

- routing:scheduleGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
try {
    ScheduleGroup result = apiInstance.getArchitectSchedulegroup(scheduleGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **scheduleGroupId** | **String** | Schedule group ID |

{: class="table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.md)

<a name="getArchitectSchedulegroups"></a>

# **getArchitectSchedulegroups**

> [ScheduleGroupEntityListing](ScheduleGroupEntityListing.md) getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId)

Get a list of schedule groups.

Wraps GET /api/v2/architect/schedulegroups

Requires ALL permissions:

- routing:scheduleGroup:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule Group to filter by.
String scheduleIds = "scheduleIds_example"; // String | A comma-delimited list of Schedule IDs to filter by.
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleGroupEntityListing result = apiInstance.getArchitectSchedulegroups(pageNumber, pageSize, sortBy, sortOrder, name, scheduleIds, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedulegroups");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description                                          | Notes                        |
| --------------- | ----------------------------------- | ---------------------------------------------------- | ---------------------------- |
| **pageNumber**  | **Integer**                         | Page number                                          | [optional] [default to 1]    |
| **pageSize**    | **Integer**                         | Page size                                            | [optional] [default to 25]   |
| **sortBy**      | **String**                          | Sort by                                              | [optional] [default to name] |
| **sortOrder**   | **String**                          | Sort order                                           | [optional] [default to ASC]  |
| **name**        | **String**                          | Name of the Schedule Group to filter by.             | [optional]                   |
| **scheduleIds** | **String**                          | A comma-delimited list of Schedule IDs to filter by. | [optional]                   |
| **divisionId**  | [**List&lt;String&gt;**](String.md) | List of divisionIds on which to filter.              | [optional]                   |

{: class="table-striped"}

### Return type

[**ScheduleGroupEntityListing**](ScheduleGroupEntityListing.md)

<a name="getArchitectSchedules"></a>

# **getArchitectSchedules**

> [ScheduleEntityListing](ScheduleEntityListing.md) getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name, divisionId)

Get a list of schedules.

Wraps GET /api/v2/architect/schedules

Requires ALL permissions:

- routing:schedule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name of the Schedule to filter by.
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | List of divisionIds on which to filter.
try {
    ScheduleEntityListing result = apiInstance.getArchitectSchedules(pageNumber, pageSize, sortBy, sortOrder, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                             | Notes                        |
| -------------- | ----------------------------------- | --------------------------------------- | ---------------------------- |
| **pageNumber** | **Integer**                         | Page number                             | [optional] [default to 1]    |
| **pageSize**   | **Integer**                         | Page size                               | [optional] [default to 25]   |
| **sortBy**     | **String**                          | Sort by                                 | [optional] [default to name] |
| **sortOrder**  | **String**                          | Sort order                              | [optional] [default to ASC]  |
| **name**       | **String**                          | Name of the Schedule to filter by.      | [optional]                   |
| **divisionId** | [**List&lt;String&gt;**](String.md) | List of divisionIds on which to filter. | [optional]                   |

{: class="table-striped"}

### Return type

[**ScheduleEntityListing**](ScheduleEntityListing.md)

<a name="getArchitectSystemprompt"></a>

# **getArchitectSystemprompt**

> [SystemPrompt](SystemPrompt.md) getArchitectSystemprompt(promptId)

Get a system prompt

Wraps GET /api/v2/architect/systemprompts/{promptId}

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
try {
    SystemPrompt result = apiInstance.getArchitectSystemprompt(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompt");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **promptId** | **String** | promptId    |

{: class="table-striped"}

### Return type

[**SystemPrompt**](SystemPrompt.md)

<a name="getArchitectSystempromptHistoryHistoryId"></a>

# **getArchitectSystempromptHistoryHistoryId**

> [HistoryListing](HistoryListing.md) getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated prompt history

Wraps GET /api/v2/architect/systemprompts/{promptId}/history/{historyId}

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getArchitectSystempromptHistoryHistoryId(promptId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                   | Notes                                                                                                   |
| -------------- | ----------------------------------- | --------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| **promptId**   | **String**                          | promptId                                      |
| **historyId**  | **String**                          | History request ID                            |
| **pageNumber** | **Integer**                         | Page number                                   | [optional] [default to 1]                                                                               |
| **pageSize**   | **Integer**                         | Page size                                     | [optional] [default to 25]                                                                              |
| **sortOrder**  | **String**                          | Sort order                                    | [optional] [default to desc]                                                                            |
| **sortBy**     | **String**                          | Sort by                                       | [optional] [default to timestamp]<br />**Values**: action, timestamp, user                              |
| **action**     | [**List&lt;String&gt;**](String.md) | Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |

{: class="table-striped"}

### Return type

[**HistoryListing**](HistoryListing.md)

<a name="getArchitectSystempromptResource"></a>

# **getArchitectSystempromptResource**

> [SystemPromptAsset](SystemPromptAsset.md) getArchitectSystempromptResource(promptId, languageCode)

Get a system prompt resource.

Wraps GET /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
try {
    SystemPromptAsset result = apiInstance.getArchitectSystempromptResource(promptId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description | Notes |
| ---------------- | ---------- | ----------- | ----- |
| **promptId**     | **String** | Prompt ID   |
| **languageCode** | **String** | Language    |

{: class="table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.md)

<a name="getArchitectSystempromptResources"></a>

# **getArchitectSystempromptResources**

> [SystemPromptAssetEntityListing](SystemPromptAssetEntityListing.md) getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder)

Get system prompt resources.

Wraps GET /api/v2/architect/systemprompts/{promptId}/resources

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
try {
    SystemPromptAssetEntityListing result = apiInstance.getArchitectSystempromptResources(promptId, pageNumber, pageSize, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystempromptResources");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                       |
| -------------- | ----------- | ----------- | --------------------------- |
| **promptId**   | **String**  | Prompt ID   |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]   |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25]  |
| **sortBy**     | **String**  | Sort by     | [optional] [default to id]  |
| **sortOrder**  | **String**  | Sort order  | [optional] [default to asc] |

{: class="table-striped"}

### Return type

[**SystemPromptAssetEntityListing**](SystemPromptAssetEntityListing.md)

<a name="getArchitectSystemprompts"></a>

# **getArchitectSystemprompts**

> [SystemPromptEntityListing](SystemPromptEntityListing.md) getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription)

Get System Prompts

Wraps GET /api/v2/architect/systemprompts

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
try {
    SystemPromptEntityListing result = apiInstance.getArchitectSystemprompts(pageNumber, pageSize, sortBy, sortOrder, name, description, nameOrDescription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getArchitectSystemprompts");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type        | Description         | Notes                       |
| --------------------- | ----------- | ------------------- | --------------------------- |
| **pageNumber**        | **Integer** | Page number         | [optional] [default to 1]   |
| **pageSize**          | **Integer** | Page size           | [optional] [default to 25]  |
| **sortBy**            | **String**  | Sort by             | [optional] [default to id]  |
| **sortOrder**         | **String**  | Sort order          | [optional] [default to asc] |
| **name**              | **String**  | Name                | [optional]                  |
| **description**       | **String**  | Description         | [optional]                  |
| **nameOrDescription** | **String**  | Name or description | [optional]                  |

{: class="table-striped"}

### Return type

[**SystemPromptEntityListing**](SystemPromptEntityListing.md)

<a name="getFlow"></a>

# **getFlow**

> [Flow](Flow.md) getFlow(flowId, deleted)

Get flow

Wraps GET /api/v2/flows/{flowId}

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Deleted flows
try {
    Flow result = apiInstance.getFlow(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type        | Description   | Notes                         |
| ----------- | ----------- | ------------- | ----------------------------- |
| **flowId**  | **String**  | Flow ID       |
| **deleted** | **Boolean** | Deleted flows | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="getFlowHistoryHistoryId"></a>

# **getFlowHistoryHistoryId**

> [HistoryListing](HistoryListing.md) getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action)

Get generated flow history

Wraps GET /api/v2/flows/{flowId}/history/{historyId}

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String historyId = "historyId_example"; // String | History request ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "desc"; // String | Sort order
String sortBy = "timestamp"; // String | Sort by
List<String> action = Arrays.asList("action_example"); // List<String> | Flow actions to include (omit to include all)
try {
    HistoryListing result = apiInstance.getFlowHistoryHistoryId(flowId, historyId, pageNumber, pageSize, sortOrder, sortBy, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowHistoryHistoryId");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                   | Notes                                                                                                   |
| -------------- | ----------------------------------- | --------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| **flowId**     | **String**                          | Flow ID                                       |
| **historyId**  | **String**                          | History request ID                            |
| **pageNumber** | **Integer**                         | Page number                                   | [optional] [default to 1]                                                                               |
| **pageSize**   | **Integer**                         | Page size                                     | [optional] [default to 25]                                                                              |
| **sortOrder**  | **String**                          | Sort order                                    | [optional] [default to desc]                                                                            |
| **sortBy**     | **String**                          | Sort by                                       | [optional] [default to timestamp]<br />**Values**: action, timestamp, user                              |
| **action**     | [**List&lt;String&gt;**](String.md) | Flow actions to include (omit to include all) | [optional]<br />**Values**: checkin, checkout, create, deactivate, debug, delete, publish, revert, save |

{: class="table-striped"}

### Return type

[**HistoryListing**](HistoryListing.md)

<a name="getFlowLatestconfiguration"></a>

# **getFlowLatestconfiguration**

> Object getFlowLatestconfiguration(flowId, deleted)

Get the latest configuration for flow

Wraps GET /api/v2/flows/{flowId}/latestconfiguration

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Boolean deleted = false; // Boolean | Deleted flows
try {
    Object result = apiInstance.getFlowLatestconfiguration(flowId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowLatestconfiguration");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type        | Description   | Notes                         |
| ----------- | ----------- | ------------- | ----------------------------- |
| **flowId**  | **String**  | Flow ID       |
| **deleted** | **Boolean** | Deleted flows | [optional] [default to false] |

{: class="table-striped"}

### Return type

**Object**

<a name="getFlowVersion"></a>

# **getFlowVersion**

> [FlowVersion](FlowVersion.md) getFlowVersion(flowId, versionId, deleted)

Get flow version

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Deleted flows
try {
    FlowVersion result = apiInstance.getFlowVersion(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersion");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description   | Notes      |
| ------------- | ---------- | ------------- | ---------- |
| **flowId**    | **String** | Flow ID       |
| **versionId** | **String** | Version ID    |
| **deleted**   | **String** | Deleted flows | [optional] |

{: class="table-striped"}

### Return type

[**FlowVersion**](FlowVersion.md)

<a name="getFlowVersionConfiguration"></a>

# **getFlowVersionConfiguration**

> Object getFlowVersionConfiguration(flowId, versionId, deleted)

Create flow version configuration

Wraps GET /api/v2/flows/{flowId}/versions/{versionId}/configuration

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
String versionId = "versionId_example"; // String | Version ID
String deleted = "deleted_example"; // String | Deleted flows
try {
    Object result = apiInstance.getFlowVersionConfiguration(flowId, versionId, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersionConfiguration");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description   | Notes      |
| ------------- | ---------- | ------------- | ---------- |
| **flowId**    | **String** | Flow ID       |
| **versionId** | **String** | Version ID    |
| **deleted**   | **String** | Deleted flows | [optional] |

{: class="table-striped"}

### Return type

**Object**

<a name="getFlowVersions"></a>

# **getFlowVersions**

> [FlowVersionEntityListing](FlowVersionEntityListing.md) getFlowVersions(flowId, pageNumber, pageSize, deleted)

Get flow version list

Wraps GET /api/v2/flows/{flowId}/versions

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean deleted = true; // Boolean | Include Deleted flows
try {
    FlowVersionEntityListing result = apiInstance.getFlowVersions(flowId, pageNumber, pageSize, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowVersions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description           | Notes                      |
| -------------- | ----------- | --------------------- | -------------------------- |
| **flowId**     | **String**  | Flow ID               |
| **pageNumber** | **Integer** | Page number           | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size             | [optional] [default to 25] |
| **deleted**    | **Boolean** | Include Deleted flows | [optional]                 |

{: class="table-striped"}

### Return type

[**FlowVersionEntityListing**](FlowVersionEntityListing.md)

<a name="getFlows"></a>

# **getFlows**

> [FlowEntityListing](FlowEntityListing.md) getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, publishedAfter, publishedBefore, divisionId)

Get a pageable list of flows, filtered by query parameters

If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> type = Arrays.asList("type_example"); // List<String> | Type
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
String publishVersionId = "publishVersionId_example"; // String | Publish version ID
String editableBy = "editableBy_example"; // String | Editable by
String lockedBy = "lockedBy_example"; // String | Locked by
String lockedByClientId = "lockedByClientId_example"; // String | Locked by client ID
String secure = "secure_example"; // String | Secure
Boolean deleted = false; // Boolean | Include deleted
Boolean includeSchemas = false; // Boolean | Include variable schemas
String publishedAfter = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published after
String publishedBefore = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published before
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
try {
    FlowEntityListing result = apiInstance.getFlows(type, pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, publishVersionId, editableBy, lockedBy, lockedByClientId, secure, deleted, includeSchemas, publishedAfter, publishedBefore, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlows");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description              | Notes                                                                                                                                                                                                                                                 |
| --------------------- | ----------------------------------- | ------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **type**              | [**List&lt;String&gt;**](String.md) | Type                     | [optional]<br />**Values**: bot, commonmodule, digitalbot, inboundcall, inboundchat, inboundemail, inboundshortmessage, outboundcall, inqueuecall, inqueueemail, inqueueshortmessage, speech, securecall, surveyinvite, voicemail, workflow, workitem |
| **pageNumber**        | **Integer**                         | Page number              | [optional] [default to 1]                                                                                                                                                                                                                             |
| **pageSize**          | **Integer**                         | Page size                | [optional] [default to 25]                                                                                                                                                                                                                            |
| **sortBy**            | **String**                          | Sort by                  | [optional] [default to id]                                                                                                                                                                                                                            |
| **sortOrder**         | **String**                          | Sort order               | [optional] [default to asc]                                                                                                                                                                                                                           |
| **id**                | [**List&lt;String&gt;**](String.md) | ID                       | [optional]                                                                                                                                                                                                                                            |
| **name**              | **String**                          | Name                     | [optional]                                                                                                                                                                                                                                            |
| **description**       | **String**                          | Description              | [optional]                                                                                                                                                                                                                                            |
| **nameOrDescription** | **String**                          | Name or description      | [optional]                                                                                                                                                                                                                                            |
| **publishVersionId**  | **String**                          | Publish version ID       | [optional]                                                                                                                                                                                                                                            |
| **editableBy**        | **String**                          | Editable by              | [optional]                                                                                                                                                                                                                                            |
| **lockedBy**          | **String**                          | Locked by                | [optional]                                                                                                                                                                                                                                            |
| **lockedByClientId**  | **String**                          | Locked by client ID      | [optional]                                                                                                                                                                                                                                            |
| **secure**            | **String**                          | Secure                   | [optional]<br />**Values**: any, checkedin, published                                                                                                                                                                                                 |
| **deleted**           | **Boolean**                         | Include deleted          | [optional] [default to false]                                                                                                                                                                                                                         |
| **includeSchemas**    | **Boolean**                         | Include variable schemas | [optional] [default to false]                                                                                                                                                                                                                         |
| **publishedAfter**    | **String**                          | Published after          | [optional]                                                                                                                                                                                                                                            |
| **publishedBefore**   | **String**                          | Published before         | [optional]                                                                                                                                                                                                                                            |
| **divisionId**        | [**List&lt;String&gt;**](String.md) | division ID(s)           | [optional]                                                                                                                                                                                                                                            |

{: class="table-striped"}

### Return type

[**FlowEntityListing**](FlowEntityListing.md)

<a name="getFlowsDatatable"></a>

# **getFlowsDatatable**

> [DataTable](DataTable.md) getFlowsDatatable(datatableId, expand)

Returns a specific datatable by id

Given a datatableId returns the datatable object and schema associated with it.

Wraps GET /api/v2/flows/datatables/{datatableId}

Requires ANY permissions:

- architect:datatable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.getFlowsDatatable(datatableId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description                        | Notes                              |
| --------------- | ---------- | ---------------------------------- | ---------------------------------- |
| **datatableId** | **String** | id of datatable                    |
| **expand**      | **String** | Expand instructions for the result | [optional]<br />**Values**: schema |

{: class="table-striped"}

### Return type

[**DataTable**](DataTable.md)

<a name="getFlowsDatatableExportJob"></a>

# **getFlowsDatatableExportJob**

> [DataTableExportJob](DataTableExportJob.md) getFlowsDatatableExportJob(datatableId, exportJobId)

Returns the state information about an export job

Returns the state information about an export job.

Wraps GET /api/v2/flows/datatables/{datatableId}/export/jobs/{exportJobId}

Requires ANY permissions:

- architect:datatable:view
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String exportJobId = "exportJobId_example"; // String | id of export job
try {
    DataTableExportJob result = apiInstance.getFlowsDatatableExportJob(datatableId, exportJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableExportJob");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description      | Notes |
| --------------- | ---------- | ---------------- | ----- |
| **datatableId** | **String** | id of datatable  |
| **exportJobId** | **String** | id of export job |

{: class="table-striped"}

### Return type

[**DataTableExportJob**](DataTableExportJob.md)

<a name="getFlowsDatatableImportJob"></a>

# **getFlowsDatatableImportJob**

> [DataTableImportJob](DataTableImportJob.md) getFlowsDatatableImportJob(datatableId, importJobId)

Returns the state information about an import job

Returns the state information about an import job.

Wraps GET /api/v2/flows/datatables/{datatableId}/import/jobs/{importJobId}

Requires ANY permissions:

- architect:datatable:view
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String importJobId = "importJobId_example"; // String | id of import job
try {
    DataTableImportJob result = apiInstance.getFlowsDatatableImportJob(datatableId, importJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableImportJob");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description      | Notes |
| --------------- | ---------- | ---------------- | ----- |
| **datatableId** | **String** | id of datatable  |
| **importJobId** | **String** | id of import job |

{: class="table-striped"}

### Return type

[**DataTableImportJob**](DataTableImportJob.md)

<a name="getFlowsDatatableImportJobs"></a>

# **getFlowsDatatableImportJobs**

> [DataTableImportEntityListing](DataTableImportEntityListing.md) getFlowsDatatableImportJobs(datatableId, pageNumber, pageSize)

Get all recent import jobs

Get all recent import jobs

Wraps GET /api/v2/flows/datatables/{datatableId}/import/jobs

Requires ANY permissions:

- architect:datatable:edit
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DataTableImportEntityListing result = apiInstance.getFlowsDatatableImportJobs(datatableId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableImportJobs");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description     | Notes                      |
| --------------- | ----------- | --------------- | -------------------------- |
| **datatableId** | **String**  | id of datatable |
| **pageNumber**  | **Integer** | Page number     | [optional] [default to 1]  |
| **pageSize**    | **Integer** | Page size       | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**DataTableImportEntityListing**](DataTableImportEntityListing.md)

<a name="getFlowsDatatableRow"></a>

# **getFlowsDatatableRow**

> [Map&lt;String, Object&gt;](Map.md) getFlowsDatatableRow(datatableId, rowId, showbrief)

Returns a specific row for the datatable

Given a datatableId and a rowId (the value of the key field) this will return the full row contents for that rowId.

Wraps GET /api/v2/flows/datatables/{datatableId}/rows/{rowId}

Requires ANY permissions:

- architect:datatable:view
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | The key for the row
Boolean showbrief = true; // Boolean | if true returns just the key field for the row
try {
    Map<String, Object> result = apiInstance.getFlowsDatatableRow(datatableId, rowId, showbrief);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description                                    | Notes                        |
| --------------- | ----------- | ---------------------------------------------- | ---------------------------- |
| **datatableId** | **String**  | id of datatable                                |
| **rowId**       | **String**  | The key for the row                            |
| **showbrief**   | **Boolean** | if true returns just the key field for the row | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**Map&lt;String, Object&gt;**](Map.md)

<a name="getFlowsDatatableRows"></a>

# **getFlowsDatatableRows**

> [DataTableRowEntityListing](DataTableRowEntityListing.md) getFlowsDatatableRows(datatableId, pageNumber, pageSize, showbrief)

Returns the rows for the datatable with the given id

Returns all of the rows for the datatable with the given datatableId. By default this will just be a truncated list returning the key for each row. Set showBrief to false to return all of the row contents.

Wraps GET /api/v2/flows/datatables/{datatableId}/rows

Requires ANY permissions:

- architect:datatable:view
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean showbrief = true; // Boolean | If true returns just the key value of the row
try {
    DataTableRowEntityListing result = apiInstance.getFlowsDatatableRows(datatableId, pageNumber, pageSize, showbrief);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatableRows");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description                                   | Notes                        |
| --------------- | ----------- | --------------------------------------------- | ---------------------------- |
| **datatableId** | **String**  | id of datatable                               |
| **pageNumber**  | **Integer** | Page number                                   | [optional] [default to 1]    |
| **pageSize**    | **Integer** | Page size                                     | [optional] [default to 25]   |
| **showbrief**   | **Boolean** | If true returns just the key value of the row | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**DataTableRowEntityListing**](DataTableRowEntityListing.md)

<a name="getFlowsDatatables"></a>

# **getFlowsDatatables**

> [DataTablesDomainEntityListing](DataTablesDomainEntityListing.md) getFlowsDatatables(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name)

Retrieve a list of datatables for the org

Returns a metadata list of the datatables associated with this org, including datatableId, name and description.

Wraps GET /api/v2/flows/datatables

Requires ANY permissions:

- architect:datatable:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String expand = "expand_example"; // String | Expand instructions for the result
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
String name = "name_example"; // String | Name to filter by
try {
    DataTablesDomainEntityListing result = apiInstance.getFlowsDatatables(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatables");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                        | Notes                                                |
| -------------- | ----------------------------------- | ---------------------------------- | ---------------------------------------------------- |
| **expand**     | **String**                          | Expand instructions for the result | [optional]<br />**Values**: schema                   |
| **pageNumber** | **Integer**                         | Page number                        | [optional] [default to 1]                            |
| **pageSize**   | **Integer**                         | Page size                          | [optional] [default to 25]                           |
| **sortBy**     | **String**                          | Sort by                            | [optional] [default to id]<br />**Values**: id, name |
| **sortOrder**  | **String**                          | Sort order                         | [optional] [default to ascending]                    |
| **divisionId** | [**List&lt;String&gt;**](String.md) | division ID(s)                     | [optional]                                           |
| **name**       | **String**                          | Name to filter by                  | [optional]                                           |

{: class="table-striped"}

### Return type

[**DataTablesDomainEntityListing**](DataTablesDomainEntityListing.md)

<a name="getFlowsDatatablesDivisionview"></a>

# **getFlowsDatatablesDivisionview**

> [DataTable](DataTable.md) getFlowsDatatablesDivisionview(datatableId, expand)

Returns a specific datatable by id

Given a datatableId returns the datatable object and schema associated with it.

Wraps GET /api/v2/flows/datatables/divisionviews/{datatableId}

Requires ALL permissions:

- architect:datatable:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.getFlowsDatatablesDivisionview(datatableId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatablesDivisionview");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description                        | Notes                              |
| --------------- | ---------- | ---------------------------------- | ---------------------------------- |
| **datatableId** | **String** | id of datatable                    |
| **expand**      | **String** | Expand instructions for the result | [optional]<br />**Values**: schema |

{: class="table-striped"}

### Return type

[**DataTable**](DataTable.md)

<a name="getFlowsDatatablesDivisionviews"></a>

# **getFlowsDatatablesDivisionviews**

> [DataTablesDomainEntityListing](DataTablesDomainEntityListing.md) getFlowsDatatablesDivisionviews(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name)

Retrieve a list of datatables for the org

Returns a metadata list of the datatables associated with this org, including datatableId, name and description.

Wraps GET /api/v2/flows/datatables/divisionviews

Requires ALL permissions:

- architect:datatable:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String expand = "expand_example"; // String | Expand instructions for the result
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
String name = "name_example"; // String | Name to filter by
try {
    DataTablesDomainEntityListing result = apiInstance.getFlowsDatatablesDivisionviews(expand, pageNumber, pageSize, sortBy, sortOrder, divisionId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDatatablesDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                        | Notes                                                |
| -------------- | ----------------------------------- | ---------------------------------- | ---------------------------------------------------- |
| **expand**     | **String**                          | Expand instructions for the result | [optional]<br />**Values**: schema                   |
| **pageNumber** | **Integer**                         | Page number                        | [optional] [default to 1]                            |
| **pageSize**   | **Integer**                         | Page size                          | [optional] [default to 25]                           |
| **sortBy**     | **String**                          | Sort by                            | [optional] [default to id]<br />**Values**: id, name |
| **sortOrder**  | **String**                          | Sort order                         | [optional] [default to ascending]                    |
| **divisionId** | [**List&lt;String&gt;**](String.md) | division ID(s)                     | [optional]                                           |
| **name**       | **String**                          | Name to filter by                  | [optional]                                           |

{: class="table-striped"}

### Return type

[**DataTablesDomainEntityListing**](DataTablesDomainEntityListing.md)

<a name="getFlowsDivisionviews"></a>

# **getFlowsDivisionviews**

> [FlowDivisionViewEntityListing](FlowDivisionViewEntityListing.md) getFlowsDivisionviews(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas)

Get a pageable list of basic flow information objects filterable by query parameters.

This returns a simplified version of /flow consisting of name and type. If one or more IDs are specified, the search will fetch flows that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/divisionviews

Requires ALL permissions:

- architect:flow:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
List<String> type = Arrays.asList("type_example"); // List<String> | Type
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
String publishVersionId = "publishVersionId_example"; // String | Publish version ID
String publishedAfter = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published after
String publishedBefore = "2015-01-01T12:00:00-0600, 2015-01-01T18:00:00Z, 2015-01-01T12:00:00.000-0600, 2015-01-01T18:00:00.000Z, 2015-01-01"; // String | Published before
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
Boolean includeSchemas = false; // Boolean | Include variable schemas
try {
    FlowDivisionViewEntityListing result = apiInstance.getFlowsDivisionviews(type, pageNumber, pageSize, sortBy, sortOrder, id, name, publishVersionId, publishedAfter, publishedBefore, divisionId, includeSchemas);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description              | Notes                                                                                                                                                                                                                                                 |
| -------------------- | ----------------------------------- | ------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **type**             | [**List&lt;String&gt;**](String.md) | Type                     | [optional]<br />**Values**: bot, commonmodule, digitalbot, inboundcall, inboundchat, inboundemail, inboundshortmessage, outboundcall, inqueuecall, inqueueemail, inqueueshortmessage, speech, securecall, surveyinvite, voicemail, workflow, workitem |
| **pageNumber**       | **Integer**                         | Page number              | [optional] [default to 1]                                                                                                                                                                                                                             |
| **pageSize**         | **Integer**                         | Page size                | [optional] [default to 25]                                                                                                                                                                                                                            |
| **sortBy**           | **String**                          | Sort by                  | [optional] [default to id]                                                                                                                                                                                                                            |
| **sortOrder**        | **String**                          | Sort order               | [optional] [default to asc]                                                                                                                                                                                                                           |
| **id**               | [**List&lt;String&gt;**](String.md) | ID                       | [optional]                                                                                                                                                                                                                                            |
| **name**             | **String**                          | Name                     | [optional]                                                                                                                                                                                                                                            |
| **publishVersionId** | **String**                          | Publish version ID       | [optional]                                                                                                                                                                                                                                            |
| **publishedAfter**   | **String**                          | Published after          | [optional]                                                                                                                                                                                                                                            |
| **publishedBefore**  | **String**                          | Published before         | [optional]                                                                                                                                                                                                                                            |
| **divisionId**       | [**List&lt;String&gt;**](String.md) | division ID(s)           | [optional]                                                                                                                                                                                                                                            |
| **includeSchemas**   | **Boolean**                         | Include variable schemas | [optional] [default to false]                                                                                                                                                                                                                         |

{: class="table-striped"}

### Return type

[**FlowDivisionViewEntityListing**](FlowDivisionViewEntityListing.md)

<a name="getFlowsExecution"></a>

# **getFlowsExecution**

> [FlowRuntimeExecution](FlowRuntimeExecution.md) getFlowsExecution(flowExecutionId)

Get a flow execution&#39;s details. Flow execution details are available for several days after the flow is started.

Wraps GET /api/v2/flows/executions/{flowExecutionId}

Requires ANY permissions:

- architect:flowExecution:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowExecutionId = "flowExecutionId_example"; // String | flow execution ID
try {
    FlowRuntimeExecution result = apiInstance.getFlowsExecution(flowExecutionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsExecution");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **flowExecutionId** | **String** | flow execution ID |

{: class="table-striped"}

### Return type

[**FlowRuntimeExecution**](FlowRuntimeExecution.md)

<a name="getFlowsMilestone"></a>

# **getFlowsMilestone**

> [FlowMilestone](FlowMilestone.md) getFlowsMilestone(milestoneId)

Get a flow milestone

Returns a specified flow milestone

Wraps GET /api/v2/flows/milestones/{milestoneId}

Requires ALL permissions:

- architect:flowMilestone:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
try {
    FlowMilestone result = apiInstance.getFlowsMilestone(milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description       | Notes |
| --------------- | ---------- | ----------------- | ----- |
| **milestoneId** | **String** | flow milestone ID |

{: class="table-striped"}

### Return type

[**FlowMilestone**](FlowMilestone.md)

<a name="getFlowsMilestones"></a>

# **getFlowsMilestones**

> [FlowMilestoneListing](FlowMilestoneListing.md) getFlowsMilestones(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId)

Get a pageable list of flow milestones, filtered by query parameters

Multiple IDs can be specified, in which case all matching flow milestones will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/flows/milestones

Requires ALL permissions:

- architect:flowMilestone:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
try {
    FlowMilestoneListing result = apiInstance.getFlowsMilestones(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestones");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description         | Notes                       |
| --------------------- | ----------------------------------- | ------------------- | --------------------------- |
| **pageNumber**        | **Integer**                         | Page number         | [optional] [default to 1]   |
| **pageSize**          | **Integer**                         | Page size           | [optional] [default to 25]  |
| **sortBy**            | **String**                          | Sort by             | [optional] [default to id]  |
| **sortOrder**         | **String**                          | Sort order          | [optional] [default to asc] |
| **id**                | [**List&lt;String&gt;**](String.md) | ID                  | [optional]                  |
| **name**              | **String**                          | Name                | [optional]                  |
| **description**       | **String**                          | Description         | [optional]                  |
| **nameOrDescription** | **String**                          | Name or description | [optional]                  |
| **divisionId**        | [**List&lt;String&gt;**](String.md) | division ID(s)      | [optional]                  |

{: class="table-striped"}

### Return type

[**FlowMilestoneListing**](FlowMilestoneListing.md)

<a name="getFlowsMilestonesDivisionviews"></a>

# **getFlowsMilestonesDivisionviews**

> [FlowMilestoneDivisionViewEntityListing](FlowMilestoneDivisionViewEntityListing.md) getFlowsMilestonesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic flow milestone information objects filterable by query parameters.

This returns flow milestones consisting of name and division. If one or more IDs are specified, the search will fetch flow milestones that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/milestones/divisionviews

Requires ALL permissions:

- architect:flowMilestone:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
try {
    FlowMilestoneDivisionViewEntityListing result = apiInstance.getFlowsMilestonesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsMilestonesDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description    | Notes                       |
| -------------- | ----------------------------------- | -------------- | --------------------------- |
| **pageNumber** | **Integer**                         | Page number    | [optional] [default to 1]   |
| **pageSize**   | **Integer**                         | Page size      | [optional] [default to 25]  |
| **sortBy**     | **String**                          | Sort by        | [optional] [default to id]  |
| **sortOrder**  | **String**                          | Sort order     | [optional] [default to asc] |
| **id**         | [**List&lt;String&gt;**](String.md) | ID             | [optional]                  |
| **name**       | **String**                          | Name           | [optional]                  |
| **divisionId** | [**List&lt;String&gt;**](String.md) | division ID(s) | [optional]                  |

{: class="table-striped"}

### Return type

[**FlowMilestoneDivisionViewEntityListing**](FlowMilestoneDivisionViewEntityListing.md)

<a name="getFlowsOutcome"></a>

# **getFlowsOutcome**

> [FlowOutcome](FlowOutcome.md) getFlowsOutcome(flowOutcomeId)

Get a flow outcome

Returns a specified flow outcome

Wraps GET /api/v2/flows/outcomes/{flowOutcomeId}

Requires ALL permissions:

- architect:flowOutcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowOutcomeId = "flowOutcomeId_example"; // String | flow outcome ID
try {
    FlowOutcome result = apiInstance.getFlowsOutcome(flowOutcomeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcome");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description     | Notes |
| ----------------- | ---------- | --------------- | ----- |
| **flowOutcomeId** | **String** | flow outcome ID |

{: class="table-striped"}

### Return type

[**FlowOutcome**](FlowOutcome.md)

<a name="getFlowsOutcomes"></a>

# **getFlowsOutcomes**

> [FlowOutcomeListing](FlowOutcomeListing.md) getFlowsOutcomes(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId)

Get a pageable list of flow outcomes, filtered by query parameters

Multiple IDs can be specified, in which case all matching flow outcomes will be returned, and no other parameters will be evaluated.

Wraps GET /api/v2/flows/outcomes

Requires ALL permissions:

- architect:flowOutcome:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | Description
String nameOrDescription = "nameOrDescription_example"; // String | Name or description
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
try {
    FlowOutcomeListing result = apiInstance.getFlowsOutcomes(pageNumber, pageSize, sortBy, sortOrder, id, name, description, nameOrDescription, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcomes");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description         | Notes                       |
| --------------------- | ----------------------------------- | ------------------- | --------------------------- |
| **pageNumber**        | **Integer**                         | Page number         | [optional] [default to 1]   |
| **pageSize**          | **Integer**                         | Page size           | [optional] [default to 25]  |
| **sortBy**            | **String**                          | Sort by             | [optional] [default to id]  |
| **sortOrder**         | **String**                          | Sort order          | [optional] [default to asc] |
| **id**                | [**List&lt;String&gt;**](String.md) | ID                  | [optional]                  |
| **name**              | **String**                          | Name                | [optional]                  |
| **description**       | **String**                          | Description         | [optional]                  |
| **nameOrDescription** | **String**                          | Name or description | [optional]                  |
| **divisionId**        | [**List&lt;String&gt;**](String.md) | division ID(s)      | [optional]                  |

{: class="table-striped"}

### Return type

[**FlowOutcomeListing**](FlowOutcomeListing.md)

<a name="getFlowsOutcomesDivisionviews"></a>

# **getFlowsOutcomesDivisionviews**

> [FlowOutcomeDivisionViewEntityListing](FlowOutcomeDivisionViewEntityListing.md) getFlowsOutcomesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId)

Get a pageable list of basic flow outcome information objects filterable by query parameters.

This returns flow outcomes consisting of name and division. If one or more IDs are specified, the search will fetch flow outcomes that match the given ID(s) and not use any additional supplied query parameters in the search.

Wraps GET /api/v2/flows/outcomes/divisionviews

Requires ALL permissions:

- architect:flowOutcome:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "id"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
List<String> id = Arrays.asList("id_example"); // List<String> | ID
String name = "name_example"; // String | Name
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | division ID(s)
try {
    FlowOutcomeDivisionViewEntityListing result = apiInstance.getFlowsOutcomesDivisionviews(pageNumber, pageSize, sortBy, sortOrder, id, name, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#getFlowsOutcomesDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description    | Notes                       |
| -------------- | ----------------------------------- | -------------- | --------------------------- |
| **pageNumber** | **Integer**                         | Page number    | [optional] [default to 1]   |
| **pageSize**   | **Integer**                         | Page size      | [optional] [default to 25]  |
| **sortBy**     | **String**                          | Sort by        | [optional] [default to id]  |
| **sortOrder**  | **String**                          | Sort order     | [optional] [default to asc] |
| **id**         | [**List&lt;String&gt;**](String.md) | ID             | [optional]                  |
| **name**       | **String**                          | Name           | [optional]                  |
| **divisionId** | [**List&lt;String&gt;**](String.md) | division ID(s) | [optional]                  |

{: class="table-striped"}

### Return type

[**FlowOutcomeDivisionViewEntityListing**](FlowOutcomeDivisionViewEntityListing.md)

<a name="postArchitectDependencytrackingBuild"></a>

# **postArchitectDependencytrackingBuild**

> Void postArchitectDependencytrackingBuild()

Rebuild Dependency Tracking data for an organization

Asynchronous. Notification topic: v2.architect.dependencytracking.build

Wraps POST /api/v2/architect/dependencytracking/build

Requires ALL permissions:

- architect:dependencyTracking:rebuild

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
try {
    apiInstance.postArchitectDependencytrackingBuild();
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectDependencytrackingBuild");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="postArchitectEmergencygroups"></a>

# **postArchitectEmergencygroups**

> [EmergencyGroup](EmergencyGroup.md) postArchitectEmergencygroups(body)

Creates a new emergency group

Wraps POST /api/v2/architect/emergencygroups

Requires ALL permissions:

- routing:emergencyGroup:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
EmergencyGroup body = new EmergencyGroup(); // EmergencyGroup |
try {
    EmergencyGroup result = apiInstance.postArchitectEmergencygroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectEmergencygroups");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description | Notes |
| -------- | --------------------------------------- | ----------- | ----- |
| **body** | [**EmergencyGroup**](EmergencyGroup.md) |             |

{: class="table-striped"}

### Return type

[**EmergencyGroup**](EmergencyGroup.md)

<a name="postArchitectIvrs"></a>

# **postArchitectIvrs**

> [IVR](IVR.md) postArchitectIvrs(body)

Create IVR config.

Wraps POST /api/v2/architect/ivrs

Requires ALL permissions:

- routing:callRoute:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
IVR body = new IVR(); // IVR |
try {
    IVR result = apiInstance.postArchitectIvrs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectIvrs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type              | Description | Notes |
| -------- | ----------------- | ----------- | ----- |
| **body** | [**IVR**](IVR.md) |             |

{: class="table-striped"}

### Return type

[**IVR**](IVR.md)

<a name="postArchitectPromptHistory"></a>

# **postArchitectPromptHistory**

> [Operation](Operation.md) postArchitectPromptHistory(promptId)

Generate prompt history

Asynchronous. Notification topic: v2.architect.prompts.{promptId}

Wraps POST /api/v2/architect/prompts/{promptId}/history

Requires ALL permissions:

- architect:userPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
try {
    Operation result = apiInstance.postArchitectPromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptHistory");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **promptId** | **String** | Prompt ID   |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="postArchitectPromptResources"></a>

# **postArchitectPromptResources**

> [PromptAsset](PromptAsset.md) postArchitectPromptResources(promptId, body)

Create a new user prompt resource

Wraps POST /api/v2/architect/prompts/{promptId}/resources

Requires ALL permissions:

- architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
PromptAssetCreate body = new PromptAssetCreate(); // PromptAssetCreate |
try {
    PromptAsset result = apiInstance.postArchitectPromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPromptResources");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                          | Description | Notes |
| ------------ | --------------------------------------------- | ----------- | ----- |
| **promptId** | **String**                                    | Prompt ID   |
| **body**     | [**PromptAssetCreate**](PromptAssetCreate.md) |             |

{: class="table-striped"}

### Return type

[**PromptAsset**](PromptAsset.md)

<a name="postArchitectPrompts"></a>

# **postArchitectPrompts**

> [Prompt](Prompt.md) postArchitectPrompts(body)

Create a new user prompt

Wraps POST /api/v2/architect/prompts

Requires ALL permissions:

- architect:userPrompt:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Prompt body = new Prompt(); // Prompt |
try {
    Prompt result = apiInstance.postArchitectPrompts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectPrompts");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                    | Description | Notes |
| -------- | ----------------------- | ----------- | ----- |
| **body** | [**Prompt**](Prompt.md) |             |

{: class="table-striped"}

### Return type

[**Prompt**](Prompt.md)

<a name="postArchitectSchedulegroups"></a>

# **postArchitectSchedulegroups**

> [ScheduleGroup](ScheduleGroup.md) postArchitectSchedulegroups(body)

Creates a new schedule group

Wraps POST /api/v2/architect/schedulegroups

Requires ALL permissions:

- routing:scheduleGroup:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup |
try {
    ScheduleGroup result = apiInstance.postArchitectSchedulegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedulegroups");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description | Notes |
| -------- | ------------------------------------- | ----------- | ----- |
| **body** | [**ScheduleGroup**](ScheduleGroup.md) |             |

{: class="table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.md)

<a name="postArchitectSchedules"></a>

# **postArchitectSchedules**

> [Schedule](Schedule.md) postArchitectSchedules(body)

Create a new schedule.

Wraps POST /api/v2/architect/schedules

Requires ALL permissions:

- routing:schedule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Schedule body = new Schedule(); // Schedule |
try {
    Schedule result = apiInstance.postArchitectSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                        | Description | Notes |
| -------- | --------------------------- | ----------- | ----- |
| **body** | [**Schedule**](Schedule.md) |             |

{: class="table-striped"}

### Return type

[**Schedule**](Schedule.md)

<a name="postArchitectSystempromptHistory"></a>

# **postArchitectSystempromptHistory**

> [Operation](Operation.md) postArchitectSystempromptHistory(promptId)

Generate system prompt history

Asynchronous. Notification topic: v2.architect.systemprompts.{systemPromptId}

Wraps POST /api/v2/architect/systemprompts/{promptId}/history

Requires ALL permissions:

- architect:systemPrompt:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | promptId
try {
    Operation result = apiInstance.postArchitectSystempromptHistory(promptId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptHistory");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **promptId** | **String** | promptId    |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="postArchitectSystempromptResources"></a>

# **postArchitectSystempromptResources**

> [SystemPromptAsset](SystemPromptAsset.md) postArchitectSystempromptResources(promptId, body)

Create system prompt resource override.

Wraps POST /api/v2/architect/systemprompts/{promptId}/resources

Requires ALL permissions:

- architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset |
try {
    SystemPromptAsset result = apiInstance.postArchitectSystempromptResources(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postArchitectSystempromptResources");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                          | Description | Notes |
| ------------ | --------------------------------------------- | ----------- | ----- |
| **promptId** | **String**                                    | Prompt ID   |
| **body**     | [**SystemPromptAsset**](SystemPromptAsset.md) |             |

{: class="table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.md)

<a name="postFlowHistory"></a>

# **postFlowHistory**

> [Operation](Operation.md) postFlowHistory(flowId)

Generate flow history

Asynchronous. Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/{flowId}/history

Requires ANY permissions:

- architect:flow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
try {
    Operation result = apiInstance.postFlowHistory(flowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowHistory");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **flowId** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="postFlowVersions"></a>

# **postFlowVersions**

> [FlowVersion](FlowVersion.md) postFlowVersions(flowId, body)

Create flow version

Wraps POST /api/v2/flows/{flowId}/versions

Requires ANY permissions:

- architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Object body = null; // Object |
try {
    FlowVersion result = apiInstance.postFlowVersions(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowVersions");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **flowId** | **String** | Flow ID     |
| **body**   | **Object** |             |

{: class="table-striped"}

### Return type

[**FlowVersion**](FlowVersion.md)

<a name="postFlows"></a>

# **postFlows**

> [Flow](Flow.md) postFlows(body, language)

Create flow

Wraps POST /api/v2/flows

Requires ANY permissions:

- architect:flow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
Flow body = new Flow(); // Flow |
String language = "language_example"; // String | Language
try {
    Flow result = apiInstance.postFlows(body, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlows");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                | Description | Notes      |
| ------------ | ------------------- | ----------- | ---------- |
| **body**     | [**Flow**](Flow.md) |             |
| **language** | **String**          | Language    | [optional] |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="postFlowsActionsCheckin"></a>

# **postFlowsActionsCheckin**

> [Operation](Operation.md) postFlowsActionsCheckin(flow)

Check-in flow

Asynchronous. Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/checkin

Requires ANY permissions:

- architect:flow:edit
- architect:flow:unlock

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Operation result = apiInstance.postFlowsActionsCheckin(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckin");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes |
| -------- | ---------- | ----------- | ----- |
| **flow** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="postFlowsActionsCheckout"></a>

# **postFlowsActionsCheckout**

> [Flow](Flow.md) postFlowsActionsCheckout(flow)

Check-out flow

Wraps POST /api/v2/flows/actions/checkout

Requires ANY permissions:

- architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsCheckout(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsCheckout");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes |
| -------- | ---------- | ----------- | ----- |
| **flow** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="postFlowsActionsDeactivate"></a>

# **postFlowsActionsDeactivate**

> [Flow](Flow.md) postFlowsActionsDeactivate(flow)

Deactivate flow

Wraps POST /api/v2/flows/actions/deactivate

Requires ANY permissions:

- architect:flow:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsDeactivate(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsDeactivate");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes |
| -------- | ---------- | ----------- | ----- |
| **flow** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="postFlowsActionsPublish"></a>

# **postFlowsActionsPublish**

> [Operation](Operation.md) postFlowsActionsPublish(flow, version)

Publish flow

Asynchronous. Notification topic: v2.flows.{flowId}

Wraps POST /api/v2/flows/actions/publish

Requires ANY permissions:

- architect:flow:unlock
- architect:flow:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
String version = "version_example"; // String | version
try {
    Operation result = apiInstance.postFlowsActionsPublish(flow, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsPublish");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes      |
| ----------- | ---------- | ----------- | ---------- |
| **flow**    | **String** | Flow ID     |
| **version** | **String** | version     | [optional] |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)

<a name="postFlowsActionsRevert"></a>

# **postFlowsActionsRevert**

> [Flow](Flow.md) postFlowsActionsRevert(flow)

Revert flow

Wraps POST /api/v2/flows/actions/revert

Requires ANY permissions:

- architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsRevert(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsRevert");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes |
| -------- | ---------- | ----------- | ----- |
| **flow** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="postFlowsActionsUnlock"></a>

# **postFlowsActionsUnlock**

> [Flow](Flow.md) postFlowsActionsUnlock(flow)

Unlock flow

Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.

Wraps POST /api/v2/flows/actions/unlock

Requires ANY permissions:

- architect:flow:unlock

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flow = "flow_example"; // String | Flow ID
try {
    Flow result = apiInstance.postFlowsActionsUnlock(flow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsActionsUnlock");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes |
| -------- | ---------- | ----------- | ----- |
| **flow** | **String** | Flow ID     |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="postFlowsDatatableExportJobs"></a>

# **postFlowsDatatableExportJobs**

> [DataTableExportJob](DataTableExportJob.md) postFlowsDatatableExportJobs(datatableId)

Begin an export process for exporting all rows from a datatable

Create an export job for exporting rows. The caller can then poll for status of the export using the token returned in the response

Wraps POST /api/v2/flows/datatables/{datatableId}/export/jobs

Requires ANY permissions:

- architect:datatable:view
- architect:datatableRow:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
try {
    DataTableExportJob result = apiInstance.postFlowsDatatableExportJobs(datatableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableExportJobs");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description     | Notes |
| --------------- | ---------- | --------------- | ----- |
| **datatableId** | **String** | id of datatable |

{: class="table-striped"}

### Return type

[**DataTableExportJob**](DataTableExportJob.md)

<a name="postFlowsDatatableImportJobs"></a>

# **postFlowsDatatableImportJobs**

> [DataTableImportJob](DataTableImportJob.md) postFlowsDatatableImportJobs(datatableId, body)

Begin an import process for importing rows into a datatable

Create an import job for importing rows. The caller can then poll for status of the import using the token returned in the response

Wraps POST /api/v2/flows/datatables/{datatableId}/import/jobs

Requires ANY permissions:

- architect:datatable:edit
- architect:datatableRow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
DataTableImportJob body = new DataTableImportJob(); // DataTableImportJob | import job information
try {
    DataTableImportJob result = apiInstance.postFlowsDatatableImportJobs(datatableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableImportJobs");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                            | Description            | Notes |
| --------------- | ----------------------------------------------- | ---------------------- | ----- |
| **datatableId** | **String**                                      | id of datatable        |
| **body**        | [**DataTableImportJob**](DataTableImportJob.md) | import job information |

{: class="table-striped"}

### Return type

[**DataTableImportJob**](DataTableImportJob.md)

<a name="postFlowsDatatableRows"></a>

# **postFlowsDatatableRows**

> [Map&lt;String, Object&gt;](Map.md) postFlowsDatatableRows(datatableId, dataTableRow)

Create a new row entry for the datatable.

Will add the passed in row entry to the datatable with the given datatableId after verifying it against the schema. The DataTableRow should be a json-ized&#39; stream of key -&gt; value pairs { \&quot;Field1\&quot;: \&quot;XYZZY\&quot;, \&quot;Field2\&quot;: false, \&quot;KEY\&quot;: \&quot;27272\&quot; }

Wraps POST /api/v2/flows/datatables/{datatableId}/rows

Requires ANY permissions:

- architect:datatable:add
- architect:datatableRow:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
Object dataTableRow = null; // Object |
try {
    Map<String, Object> result = apiInstance.postFlowsDatatableRows(datatableId, dataTableRow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatableRows");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description     | Notes |
| ---------------- | ---------- | --------------- | ----- |
| **datatableId**  | **String** | id of datatable |
| **dataTableRow** | **Object** |                 |

{: class="table-striped"}

### Return type

[**Map&lt;String, Object&gt;**](Map.md)

<a name="postFlowsDatatables"></a>

# **postFlowsDatatables**

> [DataTable](DataTable.md) postFlowsDatatables(body)

Create a new datatable with the specified json-schema definition

This will create a new datatable with fields that match the property definitions in the JSON schema. The schema&#39;s title field will be overridden by the name field in the DataTable object. See also http://json-schema.org/

Wraps POST /api/v2/flows/datatables

Requires ANY permissions:

- architect:datatable:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
DataTable body = new DataTable(); // DataTable | datatable json-schema
try {
    DataTable result = apiInstance.postFlowsDatatables(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsDatatables");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description           | Notes |
| -------- | ----------------------------- | --------------------- | ----- |
| **body** | [**DataTable**](DataTable.md) | datatable json-schema |

{: class="table-striped"}

### Return type

[**DataTable**](DataTable.md)

<a name="postFlowsExecutions"></a>

# **postFlowsExecutions**

> [FlowExecutionLaunchResponse](FlowExecutionLaunchResponse.md) postFlowsExecutions(flowLaunchRequest)

Launch an instance of a flow definition, for flow types that support it such as the &#39;workflow&#39; type.

The launch is asynchronous, it returns as soon as the flow starts. You can use the returned ID to query its status if you need.

Wraps POST /api/v2/flows/executions

Requires ANY permissions:

- architect:flow:launch

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowExecutionLaunchRequest flowLaunchRequest = new FlowExecutionLaunchRequest(); // FlowExecutionLaunchRequest |
try {
    FlowExecutionLaunchResponse result = apiInstance.postFlowsExecutions(flowLaunchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsExecutions");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                                            | Description | Notes |
| --------------------- | --------------------------------------------------------------- | ----------- | ----- |
| **flowLaunchRequest** | [**FlowExecutionLaunchRequest**](FlowExecutionLaunchRequest.md) |             |

{: class="table-striped"}

### Return type

[**FlowExecutionLaunchResponse**](FlowExecutionLaunchResponse.md)

<a name="postFlowsMilestones"></a>

# **postFlowsMilestones**

> [FlowMilestone](FlowMilestone.md) postFlowsMilestones(body)

Create a flow milestone

Wraps POST /api/v2/flows/milestones

Requires ALL permissions:

- architect:flowMilestone:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowMilestone body = new FlowMilestone(); // FlowMilestone |
try {
    FlowMilestone result = apiInstance.postFlowsMilestones(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsMilestones");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description | Notes      |
| -------- | ------------------------------------- | ----------- | ---------- |
| **body** | [**FlowMilestone**](FlowMilestone.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**FlowMilestone**](FlowMilestone.md)

<a name="postFlowsOutcomes"></a>

# **postFlowsOutcomes**

> [FlowOutcome](FlowOutcome.md) postFlowsOutcomes(body)

Create a flow outcome

Asynchronous. Notification topic: v2.flows.outcomes.{flowOutcomeId}

Wraps POST /api/v2/flows/outcomes

Requires ALL permissions:

- architect:flowOutcome:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
FlowOutcome body = new FlowOutcome(); // FlowOutcome |
try {
    FlowOutcome result = apiInstance.postFlowsOutcomes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#postFlowsOutcomes");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description | Notes      |
| -------- | --------------------------------- | ----------- | ---------- |
| **body** | [**FlowOutcome**](FlowOutcome.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**FlowOutcome**](FlowOutcome.md)

<a name="putArchitectEmergencygroup"></a>

# **putArchitectEmergencygroup**

> [EmergencyGroup](EmergencyGroup.md) putArchitectEmergencygroup(emergencyGroupId, body)

Updates a emergency group by ID

Wraps PUT /api/v2/architect/emergencygroups/{emergencyGroupId}

Requires ALL permissions:

- routing:emergencyGroup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String emergencyGroupId = "emergencyGroupId_example"; // String | Emergency group ID
EmergencyGroup body = new EmergencyGroup(); // EmergencyGroup |
try {
    EmergencyGroup result = apiInstance.putArchitectEmergencygroup(emergencyGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectEmergencygroup");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                    | Description        | Notes |
| -------------------- | --------------------------------------- | ------------------ | ----- |
| **emergencyGroupId** | **String**                              | Emergency group ID |
| **body**             | [**EmergencyGroup**](EmergencyGroup.md) |                    |

{: class="table-striped"}

### Return type

[**EmergencyGroup**](EmergencyGroup.md)

<a name="putArchitectIvr"></a>

# **putArchitectIvr**

> [IVR](IVR.md) putArchitectIvr(ivrId, body)

Update an IVR Config.

Wraps PUT /api/v2/architect/ivrs/{ivrId}

Requires ALL permissions:

- routing:callRoute:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String ivrId = "ivrId_example"; // String | IVR id
IVR body = new IVR(); // IVR |
try {
    IVR result = apiInstance.putArchitectIvr(ivrId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectIvr");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type              | Description | Notes |
| --------- | ----------------- | ----------- | ----- |
| **ivrId** | **String**        | IVR id      |
| **body**  | [**IVR**](IVR.md) |             |

{: class="table-striped"}

### Return type

[**IVR**](IVR.md)

<a name="putArchitectPrompt"></a>

# **putArchitectPrompt**

> [Prompt](Prompt.md) putArchitectPrompt(promptId, body)

Update specified user prompt

Wraps PUT /api/v2/architect/prompts/{promptId}

Requires ALL permissions:

- architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
Prompt body = new Prompt(); // Prompt |
try {
    Prompt result = apiInstance.putArchitectPrompt(promptId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPrompt");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                    | Description | Notes |
| ------------ | ----------------------- | ----------- | ----- |
| **promptId** | **String**              | Prompt ID   |
| **body**     | [**Prompt**](Prompt.md) |             |

{: class="table-striped"}

### Return type

[**Prompt**](Prompt.md)

<a name="putArchitectPromptResource"></a>

# **putArchitectPromptResource**

> [PromptAsset](PromptAsset.md) putArchitectPromptResource(promptId, languageCode, body)

Update specified user prompt resource

Wraps PUT /api/v2/architect/prompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:userPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
PromptAsset body = new PromptAsset(); // PromptAsset |
try {
    PromptAsset result = apiInstance.putArchitectPromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectPromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                              | Description | Notes |
| ---------------- | --------------------------------- | ----------- | ----- |
| **promptId**     | **String**                        | Prompt ID   |
| **languageCode** | **String**                        | Language    |
| **body**         | [**PromptAsset**](PromptAsset.md) |             |

{: class="table-striped"}

### Return type

[**PromptAsset**](PromptAsset.md)

<a name="putArchitectSchedule"></a>

# **putArchitectSchedule**

> [Schedule](Schedule.md) putArchitectSchedule(scheduleId, body)

Update schedule by ID

Wraps PUT /api/v2/architect/schedules/{scheduleId}

Requires ALL permissions:

- routing:schedule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
Schedule body = new Schedule(); // Schedule |
try {
    Schedule result = apiInstance.putArchitectSchedule(scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                        | Description | Notes |
| -------------- | --------------------------- | ----------- | ----- |
| **scheduleId** | **String**                  | Schedule ID |
| **body**       | [**Schedule**](Schedule.md) |             |

{: class="table-striped"}

### Return type

[**Schedule**](Schedule.md)

<a name="putArchitectSchedulegroup"></a>

# **putArchitectSchedulegroup**

> [ScheduleGroup](ScheduleGroup.md) putArchitectSchedulegroup(scheduleGroupId, body)

Updates a schedule group by ID

Wraps PUT /api/v2/architect/schedulegroups/{scheduleGroupId}

Requires ALL permissions:

- routing:scheduleGroup:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String scheduleGroupId = "scheduleGroupId_example"; // String | Schedule group ID
ScheduleGroup body = new ScheduleGroup(); // ScheduleGroup |
try {
    ScheduleGroup result = apiInstance.putArchitectSchedulegroup(scheduleGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSchedulegroup");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                  | Description       | Notes |
| ------------------- | ------------------------------------- | ----------------- | ----- |
| **scheduleGroupId** | **String**                            | Schedule group ID |
| **body**            | [**ScheduleGroup**](ScheduleGroup.md) |                   |

{: class="table-striped"}

### Return type

[**ScheduleGroup**](ScheduleGroup.md)

<a name="putArchitectSystempromptResource"></a>

# **putArchitectSystempromptResource**

> [SystemPromptAsset](SystemPromptAsset.md) putArchitectSystempromptResource(promptId, languageCode, body)

Updates a system prompt resource override.

Wraps PUT /api/v2/architect/systemprompts/{promptId}/resources/{languageCode}

Requires ALL permissions:

- architect:systemPrompt:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String promptId = "promptId_example"; // String | Prompt ID
String languageCode = "languageCode_example"; // String | Language
SystemPromptAsset body = new SystemPromptAsset(); // SystemPromptAsset |
try {
    SystemPromptAsset result = apiInstance.putArchitectSystempromptResource(promptId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putArchitectSystempromptResource");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                          | Description | Notes |
| ---------------- | --------------------------------------------- | ----------- | ----- |
| **promptId**     | **String**                                    | Prompt ID   |
| **languageCode** | **String**                                    | Language    |
| **body**         | [**SystemPromptAsset**](SystemPromptAsset.md) |             |

{: class="table-striped"}

### Return type

[**SystemPromptAsset**](SystemPromptAsset.md)

<a name="putFlow"></a>

# **putFlow**

> [Flow](Flow.md) putFlow(flowId, body)

Update flow

Wraps PUT /api/v2/flows/{flowId}

Requires ANY permissions:

- architect:flow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowId = "flowId_example"; // String | Flow ID
Flow body = new Flow(); // Flow |
try {
    Flow result = apiInstance.putFlow(flowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlow");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                | Description | Notes |
| ---------- | ------------------- | ----------- | ----- |
| **flowId** | **String**          | Flow ID     |
| **body**   | [**Flow**](Flow.md) |             |

{: class="table-striped"}

### Return type

[**Flow**](Flow.md)

<a name="putFlowsDatatable"></a>

# **putFlowsDatatable**

> [DataTable](DataTable.md) putFlowsDatatable(datatableId, body, expand)

Updates a specific datatable by id

Updates a schema for a datatable with the given datatableId -updates allow only new fields to be added in the schema, no changes or removals of existing fields.

Wraps PUT /api/v2/flows/datatables/{datatableId}

Requires ANY permissions:

- architect:datatable:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
DataTable body = new DataTable(); // DataTable | datatable json-schema
String expand = "expand_example"; // String | Expand instructions for the result
try {
    DataTable result = apiInstance.putFlowsDatatable(datatableId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsDatatable");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                          | Description                        | Notes                              |
| --------------- | ----------------------------- | ---------------------------------- | ---------------------------------- |
| **datatableId** | **String**                    | id of datatable                    |
| **body**        | [**DataTable**](DataTable.md) | datatable json-schema              |
| **expand**      | **String**                    | Expand instructions for the result | [optional]<br />**Values**: schema |

{: class="table-striped"}

### Return type

[**DataTable**](DataTable.md)

<a name="putFlowsDatatableRow"></a>

# **putFlowsDatatableRow**

> [Map&lt;String, Object&gt;](Map.md) putFlowsDatatableRow(datatableId, rowId, body)

Update a row entry

Updates a row with the given rowId (the value of the key field) to the new values. The DataTableRow should be a json-ized&#39; stream of key -&gt; value pairs { \&quot;Field1\&quot;: \&quot;XYZZY\&quot;, \&quot;Field2\&quot;: false, \&quot;KEY\&quot;: \&quot;27272\&quot; }

Wraps PUT /api/v2/flows/datatables/{datatableId}/rows/{rowId}

Requires ANY permissions:

- architect:datatable:edit
- architect:datatableRow:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String datatableId = "datatableId_example"; // String | id of datatable
String rowId = "rowId_example"; // String | the key for the row
Object body = null; // Object | datatable row
try {
    Map<String, Object> result = apiInstance.putFlowsDatatableRow(datatableId, rowId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsDatatableRow");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description         | Notes      |
| --------------- | ---------- | ------------------- | ---------- |
| **datatableId** | **String** | id of datatable     |
| **rowId**       | **String** | the key for the row |
| **body**        | **Object** | datatable row       | [optional] |

{: class="table-striped"}

### Return type

[**Map&lt;String, Object&gt;**](Map.md)

<a name="putFlowsMilestone"></a>

# **putFlowsMilestone**

> [FlowMilestone](FlowMilestone.md) putFlowsMilestone(milestoneId, body)

Updates a flow milestone

Wraps PUT /api/v2/flows/milestones/{milestoneId}

Requires ALL permissions:

- architect:flowMilestone:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String milestoneId = "milestoneId_example"; // String | flow milestone ID
FlowMilestone body = new FlowMilestone(); // FlowMilestone |
try {
    FlowMilestone result = apiInstance.putFlowsMilestone(milestoneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsMilestone");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                  | Description       | Notes      |
| --------------- | ------------------------------------- | ----------------- | ---------- |
| **milestoneId** | **String**                            | flow milestone ID |
| **body**        | [**FlowMilestone**](FlowMilestone.md) |                   | [optional] |

{: class="table-striped"}

### Return type

[**FlowMilestone**](FlowMilestone.md)

<a name="putFlowsOutcome"></a>

# **putFlowsOutcome**

> [Operation](Operation.md) putFlowsOutcome(flowOutcomeId, body)

Updates a flow outcome

Updates a flow outcome. Asynchronous. Notification topic: v2.flowoutcomes.{flowoutcomeId}

Wraps PUT /api/v2/flows/outcomes/{flowOutcomeId}

Requires ALL permissions:

- architect:flowOutcome:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ArchitectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ArchitectApi apiInstance = new ArchitectApi();
String flowOutcomeId = "flowOutcomeId_example"; // String | flow outcome ID
FlowOutcome body = new FlowOutcome(); // FlowOutcome |
try {
    Operation result = apiInstance.putFlowsOutcome(flowOutcomeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchitectApi#putFlowsOutcome");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                              | Description     | Notes      |
| ----------------- | --------------------------------- | --------------- | ---------- |
| **flowOutcomeId** | **String**                        | flow outcome ID |
| **body**          | [**FlowOutcome**](FlowOutcome.md) |                 | [optional] |

{: class="table-striped"}

### Return type

[**Operation**](Operation.md)
