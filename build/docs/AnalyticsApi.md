---
title: AnalyticsApi
---

## AnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                   | Description                                                   |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------- |
| [**deleteAnalyticsConversationsDetailsJob**](AnalyticsApi.md#deleteAnalyticsConversationsDetailsJob)                     | Delete/cancel an async request                                |
| [**deleteAnalyticsReportingSchedule**](AnalyticsApi.md#deleteAnalyticsReportingSchedule)                                 | Delete a scheduled report job.                                |
| [**deleteAnalyticsUsersDetailsJob**](AnalyticsApi.md#deleteAnalyticsUsersDetailsJob)                                     | Delete/cancel an async request                                |
| [**getAnalyticsBotflowReportingturns**](AnalyticsApi.md#getAnalyticsBotflowReportingturns)                               | Get Reporting Turns.                                          |
| [**getAnalyticsConversationDetails**](AnalyticsApi.md#getAnalyticsConversationDetails)                                   | Get a conversation by id                                      |
| [**getAnalyticsConversationsDetails**](AnalyticsApi.md#getAnalyticsConversationsDetails)                                 | Gets multiple conversations by id                             |
| [**getAnalyticsConversationsDetailsJob**](AnalyticsApi.md#getAnalyticsConversationsDetailsJob)                           | Get status for async query for conversation details           |
| [**getAnalyticsConversationsDetailsJobResults**](AnalyticsApi.md#getAnalyticsConversationsDetailsJobResults)             | Fetch a page of results for an async query                    |
| [**getAnalyticsConversationsDetailsJobsAvailability**](AnalyticsApi.md#getAnalyticsConversationsDetailsJobsAvailability) | Lookup the datalake availability date and time                |
| [**getAnalyticsReportingExports**](AnalyticsApi.md#getAnalyticsReportingExports)                                         | Get all view export requests for a user                       |
| [**getAnalyticsReportingExportsMetadata**](AnalyticsApi.md#getAnalyticsReportingExportsMetadata)                         | Get all export metadata                                       |
| [**getAnalyticsReportingMetadata**](AnalyticsApi.md#getAnalyticsReportingMetadata)                                       | Get list of reporting metadata.                               |
| [**getAnalyticsReportingReportIdMetadata**](AnalyticsApi.md#getAnalyticsReportingReportIdMetadata)                       | Get a reporting metadata.                                     |
| [**getAnalyticsReportingReportformats**](AnalyticsApi.md#getAnalyticsReportingReportformats)                             | Get a list of report formats                                  |
| [**getAnalyticsReportingSchedule**](AnalyticsApi.md#getAnalyticsReportingSchedule)                                       | Get a scheduled report job.                                   |
| [**getAnalyticsReportingScheduleHistory**](AnalyticsApi.md#getAnalyticsReportingScheduleHistory)                         | Get list of completed scheduled report jobs.                  |
| [**getAnalyticsReportingScheduleHistoryLatest**](AnalyticsApi.md#getAnalyticsReportingScheduleHistoryLatest)             | Get most recently completed scheduled report job.             |
| [**getAnalyticsReportingScheduleHistoryRunId**](AnalyticsApi.md#getAnalyticsReportingScheduleHistoryRunId)               | A completed scheduled report job                              |
| [**getAnalyticsReportingSchedules**](AnalyticsApi.md#getAnalyticsReportingSchedules)                                     | Get a list of scheduled report jobs                           |
| [**getAnalyticsReportingSettings**](AnalyticsApi.md#getAnalyticsReportingSettings)                                       | Get AnalyticsReportingSettings for an organization            |
| [**getAnalyticsReportingTimeperiods**](AnalyticsApi.md#getAnalyticsReportingTimeperiods)                                 | Get a list of report time periods.                            |
| [**getAnalyticsUsersDetailsJob**](AnalyticsApi.md#getAnalyticsUsersDetailsJob)                                           | Get status for async query for user details                   |
| [**getAnalyticsUsersDetailsJobResults**](AnalyticsApi.md#getAnalyticsUsersDetailsJobResults)                             | Fetch a page of results for an async query                    |
| [**getAnalyticsUsersDetailsJobsAvailability**](AnalyticsApi.md#getAnalyticsUsersDetailsJobsAvailability)                 | Lookup the datalake availability date and time                |
| [**patchAnalyticsReportingSettings**](AnalyticsApi.md#patchAnalyticsReportingSettings)                                   | Patch AnalyticsReportingSettings values for an organization   |
| [**postAnalyticsBotsAggregatesQuery**](AnalyticsApi.md#postAnalyticsBotsAggregatesQuery)                                 | Query for bot aggregates                                      |
| [**postAnalyticsConversationDetailsProperties**](AnalyticsApi.md#postAnalyticsConversationDetailsProperties)             | Index conversation properties                                 |
| [**postAnalyticsConversationsAggregatesQuery**](AnalyticsApi.md#postAnalyticsConversationsAggregatesQuery)               | Query for conversation aggregates                             |
| [**postAnalyticsConversationsDetailsJobs**](AnalyticsApi.md#postAnalyticsConversationsDetailsJobs)                       | Query for conversation details asynchronously                 |
| [**postAnalyticsConversationsDetailsQuery**](AnalyticsApi.md#postAnalyticsConversationsDetailsQuery)                     | Query for conversation details                                |
| [**postAnalyticsConversationsTranscriptsQuery**](AnalyticsApi.md#postAnalyticsConversationsTranscriptsQuery)             | Search resources.                                             |
| [**postAnalyticsEvaluationsAggregatesQuery**](AnalyticsApi.md#postAnalyticsEvaluationsAggregatesQuery)                   | Query for evaluation aggregates                               |
| [**postAnalyticsFlowsAggregatesQuery**](AnalyticsApi.md#postAnalyticsFlowsAggregatesQuery)                               | Query for flow aggregates                                     |
| [**postAnalyticsFlowsObservationsQuery**](AnalyticsApi.md#postAnalyticsFlowsObservationsQuery)                           | Query for flow observations                                   |
| [**postAnalyticsJourneysAggregatesQuery**](AnalyticsApi.md#postAnalyticsJourneysAggregatesQuery)                         | Query for journey aggregates                                  |
| [**postAnalyticsQueuesObservationsQuery**](AnalyticsApi.md#postAnalyticsQueuesObservationsQuery)                         | Query for queue observations                                  |
| [**postAnalyticsReportingExports**](AnalyticsApi.md#postAnalyticsReportingExports)                                       | Generate a view export request                                |
| [**postAnalyticsReportingScheduleRunreport**](AnalyticsApi.md#postAnalyticsReportingScheduleRunreport)                   | Place a scheduled report immediately into the reporting queue |
| [**postAnalyticsReportingSchedules**](AnalyticsApi.md#postAnalyticsReportingSchedules)                                   | Create a scheduled report job                                 |
| [**postAnalyticsSurveysAggregatesQuery**](AnalyticsApi.md#postAnalyticsSurveysAggregatesQuery)                           | Query for survey aggregates                                   |
| [**postAnalyticsTranscriptsAggregatesQuery**](AnalyticsApi.md#postAnalyticsTranscriptsAggregatesQuery)                   | Query for transcript aggregates                               |
| [**postAnalyticsUsersAggregatesQuery**](AnalyticsApi.md#postAnalyticsUsersAggregatesQuery)                               | Query for user aggregates                                     |
| [**postAnalyticsUsersDetailsJobs**](AnalyticsApi.md#postAnalyticsUsersDetailsJobs)                                       | Query for user details asynchronously                         |
| [**postAnalyticsUsersDetailsQuery**](AnalyticsApi.md#postAnalyticsUsersDetailsQuery)                                     | Query for user details                                        |
| [**postAnalyticsUsersObservationsQuery**](AnalyticsApi.md#postAnalyticsUsersObservationsQuery)                           | Query for user observations                                   |
| [**putAnalyticsReportingSchedule**](AnalyticsApi.md#putAnalyticsReportingSchedule)                                       | Update a scheduled report job.                                |

{: class="table-striped"}

<a name="deleteAnalyticsConversationsDetailsJob"></a>

# **deleteAnalyticsConversationsDetailsJob**

> Void deleteAnalyticsConversationsDetailsJob(jobId)

Delete/cancel an async request

Wraps DELETE /api/v2/analytics/conversations/details/jobs/{jobId}

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsConversationsDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#deleteAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteAnalyticsReportingSchedule"></a>

# **deleteAnalyticsReportingSchedule**

> Void deleteAnalyticsReportingSchedule(scheduleId)

Delete a scheduled report job.

Wraps DELETE /api/v2/analytics/reporting/schedules/{scheduleId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    apiInstance.deleteAnalyticsReportingSchedule(scheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#deleteAnalyticsReportingSchedule");
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

<a name="deleteAnalyticsUsersDetailsJob"></a>

# **deleteAnalyticsUsersDetailsJob**

> Void deleteAnalyticsUsersDetailsJob(jobId)

Delete/cancel an async request

Wraps DELETE /api/v2/analytics/users/details/jobs/{jobId}

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsUsersDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#deleteAnalyticsUsersDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getAnalyticsBotflowReportingturns"></a>

# **getAnalyticsBotflowReportingturns**

> [ReportingTurnsResponse](ReportingTurnsResponse.md) getAnalyticsBotflowReportingturns(botFlowId, after, pageSize, actionId, sessionId)

Get Reporting Turns.

Wraps GET /api/v2/analytics/botflows/{botFlowId}/reportingturns

Requires ANY permissions:

- analytics:botFlowReportingTurn:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String botFlowId = "botFlowId_example"; // String | ID of the bot flow.
String after = "after_example"; // String | The cursor that points to the ID of the last item in the list of entities that has been returned.
String pageSize = "50"; // String | Max number of entities to return. Maximum of 250
String actionId = "actionId_example"; // String | Optional action ID to get the reporting turns associated to a particular flow action
String sessionId = "sessionId_example"; // String | Optional session ID to get the reporting turns for a particular session
try {
    ReportingTurnsResponse result = apiInstance.getAnalyticsBotflowReportingturns(botFlowId, after, pageSize, actionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsBotflowReportingturns");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                                                                                       | Notes                      |
| ------------- | ---------- | ------------------------------------------------------------------------------------------------- | -------------------------- |
| **botFlowId** | **String** | ID of the bot flow.                                                                               |
| **after**     | **String** | The cursor that points to the ID of the last item in the list of entities that has been returned. | [optional]                 |
| **pageSize**  | **String** | Max number of entities to return. Maximum of 250                                                  | [optional] [default to 50] |
| **actionId**  | **String** | Optional action ID to get the reporting turns associated to a particular flow action              | [optional]                 |
| **sessionId** | **String** | Optional session ID to get the reporting turns for a particular session                           | [optional]                 |

{: class="table-striped"}

### Return type

[**ReportingTurnsResponse**](ReportingTurnsResponse.md)

<a name="getAnalyticsConversationDetails"></a>

# **getAnalyticsConversationDetails**

> [AnalyticsConversationWithoutAttributes](AnalyticsConversationWithoutAttributes.md) getAnalyticsConversationDetails(conversationId)

Get a conversation by id

Wraps GET /api/v2/analytics/conversations/{conversationId}/details

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversationWithoutAttributes result = apiInstance.getAnalyticsConversationDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsConversationDetails");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**AnalyticsConversationWithoutAttributes**](AnalyticsConversationWithoutAttributes.md)

<a name="getAnalyticsConversationsDetails"></a>

# **getAnalyticsConversationsDetails**

> [AnalyticsConversationWithoutAttributesMultiGetResponse](AnalyticsConversationWithoutAttributesMultiGetResponse.md) getAnalyticsConversationsDetails(id)

Gets multiple conversations by id

Wraps GET /api/v2/analytics/conversations/details

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
List<String> id = Arrays.asList("id_example"); // List<String> | Comma-separated conversation ids
try {
    AnalyticsConversationWithoutAttributesMultiGetResponse result = apiInstance.getAnalyticsConversationsDetails(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsConversationsDetails");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description                      | Notes      |
| ------ | ----------------------------------- | -------------------------------- | ---------- |
| **id** | [**List&lt;String&gt;**](String.md) | Comma-separated conversation ids | [optional] |

{: class="table-striped"}

### Return type

[**AnalyticsConversationWithoutAttributesMultiGetResponse**](AnalyticsConversationWithoutAttributesMultiGetResponse.md)

<a name="getAnalyticsConversationsDetailsJob"></a>

# **getAnalyticsConversationsDetailsJob**

> [AsyncQueryStatus](AsyncQueryStatus.md) getAnalyticsConversationsDetailsJob(jobId)

Get status for async query for conversation details

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsConversationsDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

[**AsyncQueryStatus**](AsyncQueryStatus.md)

<a name="getAnalyticsConversationsDetailsJobResults"></a>

# **getAnalyticsConversationsDetailsJobResults**

> [AnalyticsConversationAsyncQueryResponse](AnalyticsConversationAsyncQueryResponse.md) getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize)

Fetch a page of results for an async query

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}/results

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsConversationAsyncQueryResponse result = apiInstance.getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsConversationsDetailsJobResults");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                                                           | Notes      |
| ------------ | ----------- | --------------------------------------------------------------------- | ---------- |
| **jobId**    | **String**  | jobId                                                                 |
| **cursor**   | **String**  | Indicates where to resume query results (not required for first page) | [optional] |
| **pageSize** | **Integer** | The desired maximum number of results                                 | [optional] |

{: class="table-striped"}

### Return type

[**AnalyticsConversationAsyncQueryResponse**](AnalyticsConversationAsyncQueryResponse.md)

<a name="getAnalyticsConversationsDetailsJobsAvailability"></a>

# **getAnalyticsConversationsDetailsJobsAvailability**

> [DataAvailabilityResponse](DataAvailabilityResponse.md) getAnalyticsConversationsDetailsJobsAvailability()

Lookup the datalake availability date and time

Wraps GET /api/v2/analytics/conversations/details/jobs/availability

Requires ANY permissions:

- analytics:conversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsConversationsDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsConversationsDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse.md)

<a name="getAnalyticsReportingExports"></a>

# **getAnalyticsReportingExports**

> [ReportingExportJobListing](ReportingExportJobListing.md) getAnalyticsReportingExports(pageNumber, pageSize)

Get all view export requests for a user

Wraps GET /api/v2/analytics/reporting/exports

Requires ALL permissions:

- analytics:dataExport:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ReportingExportJobListing result = apiInstance.getAnalyticsReportingExports(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingExports");
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

[**ReportingExportJobListing**](ReportingExportJobListing.md)

<a name="getAnalyticsReportingExportsMetadata"></a>

# **getAnalyticsReportingExportsMetadata**

> [ReportingExportMetadataJobListing](ReportingExportMetadataJobListing.md) getAnalyticsReportingExportsMetadata()

Get all export metadata

Wraps GET /api/v2/analytics/reporting/exports/metadata

Requires ALL permissions:

- analytics:dataExport:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    ReportingExportMetadataJobListing result = apiInstance.getAnalyticsReportingExportsMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingExportsMetadata");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ReportingExportMetadataJobListing**](ReportingExportMetadataJobListing.md)

<a name="getAnalyticsReportingMetadata"></a>

# **getAnalyticsReportingMetadata**

> [ReportMetaDataEntityListing](ReportMetaDataEntityListing.md) getAnalyticsReportingMetadata(pageNumber, pageSize, locale)

Get list of reporting metadata.

Wraps GET /api/v2/analytics/reporting/metadata

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String locale = "locale_example"; // String | Locale
try {
    ReportMetaDataEntityListing result = apiInstance.getAnalyticsReportingMetadata(pageNumber, pageSize, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingMetadata");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **locale**     | **String**  | Locale      | [optional]                 |

{: class="table-striped"}

### Return type

[**ReportMetaDataEntityListing**](ReportMetaDataEntityListing.md)

<a name="getAnalyticsReportingReportIdMetadata"></a>

# **getAnalyticsReportingReportIdMetadata**

> [ReportMetaData](ReportMetaData.md) getAnalyticsReportingReportIdMetadata(reportId, locale)

Get a reporting metadata.

Wraps GET /api/v2/analytics/reporting/{reportId}/metadata

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String reportId = "reportId_example"; // String | Report ID
String locale = "locale_example"; // String | Locale
try {
    ReportMetaData result = apiInstance.getAnalyticsReportingReportIdMetadata(reportId, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingReportIdMetadata");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes      |
| ------------ | ---------- | ----------- | ---------- |
| **reportId** | **String** | Report ID   |
| **locale**   | **String** | Locale      | [optional] |

{: class="table-striped"}

### Return type

[**ReportMetaData**](ReportMetaData.md)

<a name="getAnalyticsReportingReportformats"></a>

# **getAnalyticsReportingReportformats**

> List&lt;String&gt; getAnalyticsReportingReportformats()

Get a list of report formats

Get a list of report formats.

Wraps GET /api/v2/analytics/reporting/reportformats

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    List<String> result = apiInstance.getAnalyticsReportingReportformats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingReportformats");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

**List&lt;String&gt;**

<a name="getAnalyticsReportingSchedule"></a>

# **getAnalyticsReportingSchedule**

> [ReportSchedule](ReportSchedule.md) getAnalyticsReportingSchedule(scheduleId)

Get a scheduled report job.

Wraps GET /api/v2/analytics/reporting/schedules/{scheduleId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportSchedule result = apiInstance.getAnalyticsReportingSchedule(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

[**ReportSchedule**](ReportSchedule.md)

<a name="getAnalyticsReportingScheduleHistory"></a>

# **getAnalyticsReportingScheduleHistory**

> [ReportRunEntryEntityDomainListing](ReportRunEntryEntityDomainListing.md) getAnalyticsReportingScheduleHistory(scheduleId, pageNumber, pageSize)

Get list of completed scheduled report jobs.

Wraps GET /api/v2/analytics/reporting/schedules/{scheduleId}/history

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
Integer pageNumber = 1; // Integer |
Integer pageSize = 25; // Integer |
try {
    ReportRunEntryEntityDomainListing result = apiInstance.getAnalyticsReportingScheduleHistory(scheduleId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingScheduleHistory");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **scheduleId** | **String**  | Schedule ID |
| **pageNumber** | **Integer** |             | [optional] [default to 1]  |
| **pageSize**   | **Integer** |             | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**ReportRunEntryEntityDomainListing**](ReportRunEntryEntityDomainListing.md)

<a name="getAnalyticsReportingScheduleHistoryLatest"></a>

# **getAnalyticsReportingScheduleHistoryLatest**

> [ReportRunEntry](ReportRunEntry.md) getAnalyticsReportingScheduleHistoryLatest(scheduleId)

Get most recently completed scheduled report job.

Wraps GET /api/v2/analytics/reporting/schedules/{scheduleId}/history/latest

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportRunEntry result = apiInstance.getAnalyticsReportingScheduleHistoryLatest(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingScheduleHistoryLatest");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

[**ReportRunEntry**](ReportRunEntry.md)

<a name="getAnalyticsReportingScheduleHistoryRunId"></a>

# **getAnalyticsReportingScheduleHistoryRunId**

> [ReportRunEntry](ReportRunEntry.md) getAnalyticsReportingScheduleHistoryRunId(runId, scheduleId)

A completed scheduled report job

A completed scheduled report job.

Wraps GET /api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String runId = "runId_example"; // String | Run ID
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    ReportRunEntry result = apiInstance.getAnalyticsReportingScheduleHistoryRunId(runId, scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingScheduleHistoryRunId");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **runId**      | **String** | Run ID      |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

[**ReportRunEntry**](ReportRunEntry.md)

<a name="getAnalyticsReportingSchedules"></a>

# **getAnalyticsReportingSchedules**

> [ReportScheduleEntityListing](ReportScheduleEntityListing.md) getAnalyticsReportingSchedules(pageNumber, pageSize)

Get a list of scheduled report jobs

Get a list of scheduled report jobs.

Wraps GET /api/v2/analytics/reporting/schedules

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    ReportScheduleEntityListing result = apiInstance.getAnalyticsReportingSchedules(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingSchedules");
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

[**ReportScheduleEntityListing**](ReportScheduleEntityListing.md)

<a name="getAnalyticsReportingSettings"></a>

# **getAnalyticsReportingSettings**

> [AnalyticsReportingSettings](AnalyticsReportingSettings.md) getAnalyticsReportingSettings()

Get AnalyticsReportingSettings for an organization

Wraps GET /api/v2/analytics/reporting/settings

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    AnalyticsReportingSettings result = apiInstance.getAnalyticsReportingSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AnalyticsReportingSettings**](AnalyticsReportingSettings.md)

<a name="getAnalyticsReportingTimeperiods"></a>

# **getAnalyticsReportingTimeperiods**

> List&lt;String&gt; getAnalyticsReportingTimeperiods()

Get a list of report time periods.

Wraps GET /api/v2/analytics/reporting/timeperiods

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    List<String> result = apiInstance.getAnalyticsReportingTimeperiods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsReportingTimeperiods");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

**List&lt;String&gt;**

<a name="getAnalyticsUsersDetailsJob"></a>

# **getAnalyticsUsersDetailsJob**

> [AsyncQueryStatus](AsyncQueryStatus.md) getAnalyticsUsersDetailsJob(jobId)

Get status for async query for user details

Wraps GET /api/v2/analytics/users/details/jobs/{jobId}

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsUsersDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsUsersDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

[**AsyncQueryStatus**](AsyncQueryStatus.md)

<a name="getAnalyticsUsersDetailsJobResults"></a>

# **getAnalyticsUsersDetailsJobResults**

> [AnalyticsUserDetailsAsyncQueryResponse](AnalyticsUserDetailsAsyncQueryResponse.md) getAnalyticsUsersDetailsJobResults(jobId, cursor, pageSize)

Fetch a page of results for an async query

Wraps GET /api/v2/analytics/users/details/jobs/{jobId}/results

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsUserDetailsAsyncQueryResponse result = apiInstance.getAnalyticsUsersDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsUsersDetailsJobResults");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                                                           | Notes      |
| ------------ | ----------- | --------------------------------------------------------------------- | ---------- |
| **jobId**    | **String**  | jobId                                                                 |
| **cursor**   | **String**  | Indicates where to resume query results (not required for first page) | [optional] |
| **pageSize** | **Integer** | The desired maximum number of results                                 | [optional] |

{: class="table-striped"}

### Return type

[**AnalyticsUserDetailsAsyncQueryResponse**](AnalyticsUserDetailsAsyncQueryResponse.md)

<a name="getAnalyticsUsersDetailsJobsAvailability"></a>

# **getAnalyticsUsersDetailsJobsAvailability**

> [DataAvailabilityResponse](DataAvailabilityResponse.md) getAnalyticsUsersDetailsJobsAvailability()

Lookup the datalake availability date and time

Wraps GET /api/v2/analytics/users/details/jobs/availability

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsUsersDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#getAnalyticsUsersDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse.md)

<a name="patchAnalyticsReportingSettings"></a>

# **patchAnalyticsReportingSettings**

> [AnalyticsReportingSettings](AnalyticsReportingSettings.md) patchAnalyticsReportingSettings(body)

Patch AnalyticsReportingSettings values for an organization

Wraps PATCH /api/v2/analytics/reporting/settings

Requires ANY permissions:

- recording:recordingSegment:view
- analytics:conversationDetail:view
- analytics:conversationAggregate:view
- analytics:dashboardConfigurations:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
AnalyticsReportingSettings body = new AnalyticsReportingSettings(); // AnalyticsReportingSettings | AnalyticsReportingSettingsRequest
try {
    AnalyticsReportingSettings result = apiInstance.patchAnalyticsReportingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#patchAnalyticsReportingSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description                       | Notes |
| -------- | --------------------------------------------------------------- | --------------------------------- | ----- |
| **body** | [**AnalyticsReportingSettings**](AnalyticsReportingSettings.md) | AnalyticsReportingSettingsRequest |

{: class="table-striped"}

### Return type

[**AnalyticsReportingSettings**](AnalyticsReportingSettings.md)

<a name="postAnalyticsBotsAggregatesQuery"></a>

# **postAnalyticsBotsAggregatesQuery**

> [BotAggregateQueryResponse](BotAggregateQueryResponse.md) postAnalyticsBotsAggregatesQuery(body)

Query for bot aggregates

Wraps POST /api/v2/analytics/bots/aggregates/query

Requires ANY permissions:

- analytics:botAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
BotAggregationQuery body = new BotAggregationQuery(); // BotAggregationQuery | query
try {
    BotAggregateQueryResponse result = apiInstance.postAnalyticsBotsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsBotsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description | Notes |
| -------- | ------------------------------------------------- | ----------- | ----- |
| **body** | [**BotAggregationQuery**](BotAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**BotAggregateQueryResponse**](BotAggregateQueryResponse.md)

<a name="postAnalyticsConversationDetailsProperties"></a>

# **postAnalyticsConversationDetailsProperties**

> [PropertyIndexRequest](PropertyIndexRequest.md) postAnalyticsConversationDetailsProperties(conversationId, body)

Index conversation properties

Wraps POST /api/v2/analytics/conversations/{conversationId}/details/properties

Requires ANY permissions:

- analytics:conversationProperties:index

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postAnalyticsConversationDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsConversationDetailsProperties");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                | Description    | Notes |
| ------------------ | --------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                          | conversationId |
| **body**           | [**PropertyIndexRequest**](PropertyIndexRequest.md) | request        |

{: class="table-striped"}

### Return type

[**PropertyIndexRequest**](PropertyIndexRequest.md)

<a name="postAnalyticsConversationsAggregatesQuery"></a>

# **postAnalyticsConversationsAggregatesQuery**

> [ConversationAggregateQueryResponse](ConversationAggregateQueryResponse.md) postAnalyticsConversationsAggregatesQuery(body)

Query for conversation aggregates

Wraps POST /api/v2/analytics/conversations/aggregates/query

Requires ANY permissions:

- analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
ConversationAggregationQuery body = new ConversationAggregationQuery(); // ConversationAggregationQuery | query
try {
    ConversationAggregateQueryResponse result = apiInstance.postAnalyticsConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsConversationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description | Notes |
| -------- | ------------------------------------------------------------------- | ----------- | ----- |
| **body** | [**ConversationAggregationQuery**](ConversationAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**ConversationAggregateQueryResponse**](ConversationAggregateQueryResponse.md)

<a name="postAnalyticsConversationsDetailsJobs"></a>

# **postAnalyticsConversationsDetailsJobs**

> [AsyncQueryResponse](AsyncQueryResponse.md) postAnalyticsConversationsDetailsJobs(body)

Query for conversation details asynchronously

Wraps POST /api/v2/analytics/conversations/details/jobs

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
AsyncConversationQuery body = new AsyncConversationQuery(); // AsyncConversationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsConversationsDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsConversationsDetailsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description | Notes |
| -------- | ------------------------------------------------------- | ----------- | ----- |
| **body** | [**AsyncConversationQuery**](AsyncConversationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AsyncQueryResponse**](AsyncQueryResponse.md)

<a name="postAnalyticsConversationsDetailsQuery"></a>

# **postAnalyticsConversationsDetailsQuery**

> [AnalyticsConversationQueryResponse](AnalyticsConversationQueryResponse.md) postAnalyticsConversationsDetailsQuery(body)

Query for conversation details

Wraps POST /api/v2/analytics/conversations/details/query

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postAnalyticsConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsConversationsDetailsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description | Notes |
| -------- | --------------------------------------------- | ----------- | ----- |
| **body** | [**ConversationQuery**](ConversationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse.md)

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
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
TranscriptConversationDetailSearchRequest body = new TranscriptConversationDetailSearchRequest(); // TranscriptConversationDetailSearchRequest | Search request options
try {
    AnalyticsConversationWithoutAttributesMultiGetResponse result = apiInstance.postAnalyticsConversationsTranscriptsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsConversationsTranscriptsQuery");
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

<a name="postAnalyticsEvaluationsAggregatesQuery"></a>

# **postAnalyticsEvaluationsAggregatesQuery**

> [EvaluationAggregateQueryResponse](EvaluationAggregateQueryResponse.md) postAnalyticsEvaluationsAggregatesQuery(body)

Query for evaluation aggregates

Wraps POST /api/v2/analytics/evaluations/aggregates/query

Requires ANY permissions:

- analytics:evaluationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
EvaluationAggregationQuery body = new EvaluationAggregationQuery(); // EvaluationAggregationQuery | query
try {
    EvaluationAggregateQueryResponse result = apiInstance.postAnalyticsEvaluationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsEvaluationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description | Notes |
| -------- | --------------------------------------------------------------- | ----------- | ----- |
| **body** | [**EvaluationAggregationQuery**](EvaluationAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**EvaluationAggregateQueryResponse**](EvaluationAggregateQueryResponse.md)

<a name="postAnalyticsFlowsAggregatesQuery"></a>

# **postAnalyticsFlowsAggregatesQuery**

> [FlowAggregateQueryResponse](FlowAggregateQueryResponse.md) postAnalyticsFlowsAggregatesQuery(body)

Query for flow aggregates

Wraps POST /api/v2/analytics/flows/aggregates/query

Requires ANY permissions:

- analytics:flowAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
FlowAggregationQuery body = new FlowAggregationQuery(); // FlowAggregationQuery | query
try {
    FlowAggregateQueryResponse result = apiInstance.postAnalyticsFlowsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsFlowsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**FlowAggregationQuery**](FlowAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**FlowAggregateQueryResponse**](FlowAggregateQueryResponse.md)

<a name="postAnalyticsFlowsObservationsQuery"></a>

# **postAnalyticsFlowsObservationsQuery**

> [FlowObservationQueryResponse](FlowObservationQueryResponse.md) postAnalyticsFlowsObservationsQuery(body)

Query for flow observations

Wraps POST /api/v2/analytics/flows/observations/query

Requires ANY permissions:

- analytics:flowObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
FlowObservationQuery body = new FlowObservationQuery(); // FlowObservationQuery | query
try {
    FlowObservationQueryResponse result = apiInstance.postAnalyticsFlowsObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsFlowsObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**FlowObservationQuery**](FlowObservationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**FlowObservationQueryResponse**](FlowObservationQueryResponse.md)

<a name="postAnalyticsJourneysAggregatesQuery"></a>

# **postAnalyticsJourneysAggregatesQuery**

> [JourneyAggregateQueryResponse](JourneyAggregateQueryResponse.md) postAnalyticsJourneysAggregatesQuery(body)

Query for journey aggregates

Wraps POST /api/v2/analytics/journeys/aggregates/query

Requires ANY permissions:

- analytics:journeyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
JourneyAggregationQuery body = new JourneyAggregationQuery(); // JourneyAggregationQuery | query
try {
    JourneyAggregateQueryResponse result = apiInstance.postAnalyticsJourneysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsJourneysAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description | Notes |
| -------- | --------------------------------------------------------- | ----------- | ----- |
| **body** | [**JourneyAggregationQuery**](JourneyAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**JourneyAggregateQueryResponse**](JourneyAggregateQueryResponse.md)

<a name="postAnalyticsQueuesObservationsQuery"></a>

# **postAnalyticsQueuesObservationsQuery**

> [QueueObservationQueryResponse](QueueObservationQueryResponse.md) postAnalyticsQueuesObservationsQuery(body)

Query for queue observations

Wraps POST /api/v2/analytics/queues/observations/query

Requires ANY permissions:

- analytics:queueObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
QueueObservationQuery body = new QueueObservationQuery(); // QueueObservationQuery | query
try {
    QueueObservationQueryResponse result = apiInstance.postAnalyticsQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsQueuesObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description | Notes |
| -------- | ----------------------------------------------------- | ----------- | ----- |
| **body** | [**QueueObservationQuery**](QueueObservationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**QueueObservationQueryResponse**](QueueObservationQueryResponse.md)

<a name="postAnalyticsReportingExports"></a>

# **postAnalyticsReportingExports**

> [ReportingExportJobResponse](ReportingExportJobResponse.md) postAnalyticsReportingExports(body)

Generate a view export request

This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead

Wraps POST /api/v2/analytics/reporting/exports

Requires ALL permissions:

- analytics:dataExport:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
ReportingExportJobRequest body = new ReportingExportJobRequest(); // ReportingExportJobRequest | ReportingExportJobRequest
try {
    ReportingExportJobResponse result = apiInstance.postAnalyticsReportingExports(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsReportingExports");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description               | Notes |
| -------- | ------------------------------------------------------------- | ------------------------- | ----- |
| **body** | [**ReportingExportJobRequest**](ReportingExportJobRequest.md) | ReportingExportJobRequest |

{: class="table-striped"}

### Return type

[**ReportingExportJobResponse**](ReportingExportJobResponse.md)

<a name="postAnalyticsReportingScheduleRunreport"></a>

# **postAnalyticsReportingScheduleRunreport**

> [RunNowResponse](RunNowResponse.md) postAnalyticsReportingScheduleRunreport(scheduleId)

Place a scheduled report immediately into the reporting queue

Wraps POST /api/v2/analytics/reporting/schedules/{scheduleId}/runreport

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
try {
    RunNowResponse result = apiInstance.postAnalyticsReportingScheduleRunreport(scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsReportingScheduleRunreport");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **scheduleId** | **String** | Schedule ID |

{: class="table-striped"}

### Return type

[**RunNowResponse**](RunNowResponse.md)

<a name="postAnalyticsReportingSchedules"></a>

# **postAnalyticsReportingSchedules**

> [ReportSchedule](ReportSchedule.md) postAnalyticsReportingSchedules(body)

Create a scheduled report job

Create a scheduled report job.

Wraps POST /api/v2/analytics/reporting/schedules

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
ReportSchedule body = new ReportSchedule(); // ReportSchedule | ReportSchedule
try {
    ReportSchedule result = apiInstance.postAnalyticsReportingSchedules(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsReportingSchedules");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description    | Notes |
| -------- | --------------------------------------- | -------------- | ----- |
| **body** | [**ReportSchedule**](ReportSchedule.md) | ReportSchedule |

{: class="table-striped"}

### Return type

[**ReportSchedule**](ReportSchedule.md)

<a name="postAnalyticsSurveysAggregatesQuery"></a>

# **postAnalyticsSurveysAggregatesQuery**

> [SurveyAggregateQueryResponse](SurveyAggregateQueryResponse.md) postAnalyticsSurveysAggregatesQuery(body)

Query for survey aggregates

Wraps POST /api/v2/analytics/surveys/aggregates/query

Requires ANY permissions:

- analytics:surveyAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
SurveyAggregationQuery body = new SurveyAggregationQuery(); // SurveyAggregationQuery | query
try {
    SurveyAggregateQueryResponse result = apiInstance.postAnalyticsSurveysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsSurveysAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description | Notes |
| -------- | ------------------------------------------------------- | ----------- | ----- |
| **body** | [**SurveyAggregationQuery**](SurveyAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**SurveyAggregateQueryResponse**](SurveyAggregateQueryResponse.md)

<a name="postAnalyticsTranscriptsAggregatesQuery"></a>

# **postAnalyticsTranscriptsAggregatesQuery**

> [TranscriptAggregateQueryResponse](TranscriptAggregateQueryResponse.md) postAnalyticsTranscriptsAggregatesQuery(body)

Query for transcript aggregates

Wraps POST /api/v2/analytics/transcripts/aggregates/query

Requires ANY permissions:

- analytics:speechAndTextAnalyticsAggregates:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
TranscriptAggregationQuery body = new TranscriptAggregationQuery(); // TranscriptAggregationQuery | query
try {
    TranscriptAggregateQueryResponse result = apiInstance.postAnalyticsTranscriptsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsTranscriptsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description | Notes |
| -------- | --------------------------------------------------------------- | ----------- | ----- |
| **body** | [**TranscriptAggregationQuery**](TranscriptAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**TranscriptAggregateQueryResponse**](TranscriptAggregateQueryResponse.md)

<a name="postAnalyticsUsersAggregatesQuery"></a>

# **postAnalyticsUsersAggregatesQuery**

> [UserAggregateQueryResponse](UserAggregateQueryResponse.md) postAnalyticsUsersAggregatesQuery(body)

Query for user aggregates

Wraps POST /api/v2/analytics/users/aggregates/query

Requires ANY permissions:

- analytics:userAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
UserAggregationQuery body = new UserAggregationQuery(); // UserAggregationQuery | query
try {
    UserAggregateQueryResponse result = apiInstance.postAnalyticsUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsUsersAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**UserAggregationQuery**](UserAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**UserAggregateQueryResponse**](UserAggregateQueryResponse.md)

<a name="postAnalyticsUsersDetailsJobs"></a>

# **postAnalyticsUsersDetailsJobs**

> [AsyncQueryResponse](AsyncQueryResponse.md) postAnalyticsUsersDetailsJobs(body)

Query for user details asynchronously

Wraps POST /api/v2/analytics/users/details/jobs

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
AsyncUserDetailsQuery body = new AsyncUserDetailsQuery(); // AsyncUserDetailsQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsUsersDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsUsersDetailsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description | Notes |
| -------- | ----------------------------------------------------- | ----------- | ----- |
| **body** | [**AsyncUserDetailsQuery**](AsyncUserDetailsQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AsyncQueryResponse**](AsyncQueryResponse.md)

<a name="postAnalyticsUsersDetailsQuery"></a>

# **postAnalyticsUsersDetailsQuery**

> [AnalyticsUserDetailsQueryResponse](AnalyticsUserDetailsQueryResponse.md) postAnalyticsUsersDetailsQuery(body)

Query for user details

Wraps POST /api/v2/analytics/users/details/query

Requires ANY permissions:

- analytics:userDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
UserDetailsQuery body = new UserDetailsQuery(); // UserDetailsQuery | query
try {
    AnalyticsUserDetailsQueryResponse result = apiInstance.postAnalyticsUsersDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsUsersDetailsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                        | Description | Notes |
| -------- | ------------------------------------------- | ----------- | ----- |
| **body** | [**UserDetailsQuery**](UserDetailsQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AnalyticsUserDetailsQueryResponse**](AnalyticsUserDetailsQueryResponse.md)

<a name="postAnalyticsUsersObservationsQuery"></a>

# **postAnalyticsUsersObservationsQuery**

> [UserObservationQueryResponse](UserObservationQueryResponse.md) postAnalyticsUsersObservationsQuery(body)

Query for user observations

Wraps POST /api/v2/analytics/users/observations/query

Requires ANY permissions:

- analytics:userObservation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
UserObservationQuery body = new UserObservationQuery(); // UserObservationQuery | query
try {
    UserObservationQueryResponse result = apiInstance.postAnalyticsUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#postAnalyticsUsersObservationsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description | Notes |
| -------- | --------------------------------------------------- | ----------- | ----- |
| **body** | [**UserObservationQuery**](UserObservationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**UserObservationQueryResponse**](UserObservationQueryResponse.md)

<a name="putAnalyticsReportingSchedule"></a>

# **putAnalyticsReportingSchedule**

> [ReportSchedule](ReportSchedule.md) putAnalyticsReportingSchedule(scheduleId, body)

Update a scheduled report job.

Wraps PUT /api/v2/analytics/reporting/schedules/{scheduleId}

Requires ANY permissions:

- reporting:acd:view, reporting:status:view, reporting:interactions:view, reporting:outbound:view, reporting:quality:view, employee

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AnalyticsApi apiInstance = new AnalyticsApi();
String scheduleId = "scheduleId_example"; // String | Schedule ID
ReportSchedule body = new ReportSchedule(); // ReportSchedule | ReportSchedule
try {
    ReportSchedule result = apiInstance.putAnalyticsReportingSchedule(scheduleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsApi#putAnalyticsReportingSchedule");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                    | Description    | Notes |
| -------------- | --------------------------------------- | -------------- | ----- |
| **scheduleId** | **String**                              | Schedule ID    |
| **body**       | [**ReportSchedule**](ReportSchedule.md) | ReportSchedule |

{: class="table-striped"}

### Return type

[**ReportSchedule**](ReportSchedule.md)
