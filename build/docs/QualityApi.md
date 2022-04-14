---
title: QualityApi
---

## QualityApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                             | Description                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [**deleteQualityCalibration**](QualityApi.md#deleteQualityCalibration)                                                             | Delete a calibration by id.                                                                                                                            |
| [**deleteQualityConversationEvaluation**](QualityApi.md#deleteQualityConversationEvaluation)                                       | Delete an evaluation                                                                                                                                   |
| [**deleteQualityForm**](QualityApi.md#deleteQualityForm)                                                                           | Delete an evaluation form.                                                                                                                             |
| [**deleteQualityFormsEvaluation**](QualityApi.md#deleteQualityFormsEvaluation)                                                     | Delete an evaluation form.                                                                                                                             |
| [**deleteQualityFormsSurvey**](QualityApi.md#deleteQualityFormsSurvey)                                                             | Delete a survey form.                                                                                                                                  |
| [**getQualityAgentsActivity**](QualityApi.md#getQualityAgentsActivity)                                                             | Gets a list of Agent Activities                                                                                                                        |
| [**getQualityCalibration**](QualityApi.md#getQualityCalibration)                                                                   | Get a calibration by id. Requires either calibrator id or conversation id                                                                              |
| [**getQualityCalibrations**](QualityApi.md#getQualityCalibrations)                                                                 | Get the list of calibrations                                                                                                                           |
| [**getQualityConversationEvaluation**](QualityApi.md#getQualityConversationEvaluation)                                             | Get an evaluation                                                                                                                                      |
| [**getQualityConversationSurveys**](QualityApi.md#getQualityConversationSurveys)                                                   | Get the surveys for a conversation                                                                                                                     |
| [**getQualityConversationsAuditsQueryTransactionId**](QualityApi.md#getQualityConversationsAuditsQueryTransactionId)               | Get status of audit query execution                                                                                                                    |
| [**getQualityConversationsAuditsQueryTransactionIdResults**](QualityApi.md#getQualityConversationsAuditsQueryTransactionIdResults) | Get results of audit query                                                                                                                             |
| [**getQualityEvaluationsQuery**](QualityApi.md#getQualityEvaluationsQuery)                                                         | Queries Evaluations and returns a paged list                                                                                                           |
| [**getQualityEvaluatorsActivity**](QualityApi.md#getQualityEvaluatorsActivity)                                                     | Get an evaluator activity                                                                                                                              |
| [**getQualityForm**](QualityApi.md#getQualityForm)                                                                                 | Get an evaluation form                                                                                                                                 |
| [**getQualityFormVersions**](QualityApi.md#getQualityFormVersions)                                                                 | Gets all the revisions for a specific evaluation.                                                                                                      |
| [**getQualityForms**](QualityApi.md#getQualityForms)                                                                               | Get the list of evaluation forms                                                                                                                       |
| [**getQualityFormsEvaluation**](QualityApi.md#getQualityFormsEvaluation)                                                           | Get an evaluation form                                                                                                                                 |
| [**getQualityFormsEvaluationVersions**](QualityApi.md#getQualityFormsEvaluationVersions)                                           | Gets all the revisions for a specific evaluation.                                                                                                      |
| [**getQualityFormsEvaluations**](QualityApi.md#getQualityFormsEvaluations)                                                         | Get the list of evaluation forms                                                                                                                       |
| [**getQualityFormsEvaluationsBulkContexts**](QualityApi.md#getQualityFormsEvaluationsBulkContexts)                                 | Retrieve a list of the latest published evaluation form versions by context ids                                                                        |
| [**getQualityFormsSurvey**](QualityApi.md#getQualityFormsSurvey)                                                                   | Get a survey form                                                                                                                                      |
| [**getQualityFormsSurveyVersions**](QualityApi.md#getQualityFormsSurveyVersions)                                                   | Gets all the revisions for a specific survey.                                                                                                          |
| [**getQualityFormsSurveys**](QualityApi.md#getQualityFormsSurveys)                                                                 | Get the list of survey forms                                                                                                                           |
| [**getQualityFormsSurveysBulk**](QualityApi.md#getQualityFormsSurveysBulk)                                                         | Retrieve a list of survey forms by their ids                                                                                                           |
| [**getQualityFormsSurveysBulkContexts**](QualityApi.md#getQualityFormsSurveysBulkContexts)                                         | Retrieve a list of the latest form versions by context ids                                                                                             |
| [**getQualityPublishedform**](QualityApi.md#getQualityPublishedform)                                                               | Get the published evaluation forms.                                                                                                                    |
| [**getQualityPublishedforms**](QualityApi.md#getQualityPublishedforms)                                                             | Get the published evaluation forms.                                                                                                                    |
| [**getQualityPublishedformsEvaluation**](QualityApi.md#getQualityPublishedformsEvaluation)                                         | Get the most recent published version of an evaluation form.                                                                                           |
| [**getQualityPublishedformsEvaluations**](QualityApi.md#getQualityPublishedformsEvaluations)                                       | Get the published evaluation forms.                                                                                                                    |
| [**getQualityPublishedformsSurvey**](QualityApi.md#getQualityPublishedformsSurvey)                                                 | Get the most recent published version of a survey form.                                                                                                |
| [**getQualityPublishedformsSurveys**](QualityApi.md#getQualityPublishedformsSurveys)                                               | Get the published survey forms.                                                                                                                        |
| [**getQualitySurvey**](QualityApi.md#getQualitySurvey)                                                                             | Get a survey for a conversation                                                                                                                        |
| [**getQualitySurveysScorable**](QualityApi.md#getQualitySurveysScorable)                                                           | Get a survey as an end-customer, for the purposes of scoring it.                                                                                       |
| [**patchQualityFormsSurvey**](QualityApi.md#patchQualityFormsSurvey)                                                               | Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form. |
| [**postAnalyticsEvaluationsAggregatesQuery**](QualityApi.md#postAnalyticsEvaluationsAggregatesQuery)                               | Query for evaluation aggregates                                                                                                                        |
| [**postAnalyticsSurveysAggregatesQuery**](QualityApi.md#postAnalyticsSurveysAggregatesQuery)                                       | Query for survey aggregates                                                                                                                            |
| [**postQualityCalibrations**](QualityApi.md#postQualityCalibrations)                                                               | Create a calibration                                                                                                                                   |
| [**postQualityConversationEvaluations**](QualityApi.md#postQualityConversationEvaluations)                                         | Create an evaluation                                                                                                                                   |
| [**postQualityConversationsAuditsQuery**](QualityApi.md#postQualityConversationsAuditsQuery)                                       | Create audit query execution                                                                                                                           |
| [**postQualityEvaluationsAggregatesQueryMe**](QualityApi.md#postQualityEvaluationsAggregatesQueryMe)                               | Query for evaluation aggregates for the current user                                                                                                   |
| [**postQualityEvaluationsScoring**](QualityApi.md#postQualityEvaluationsScoring)                                                   | Score evaluation                                                                                                                                       |
| [**postQualityForms**](QualityApi.md#postQualityForms)                                                                             | Create an evaluation form.                                                                                                                             |
| [**postQualityFormsEvaluations**](QualityApi.md#postQualityFormsEvaluations)                                                       | Create an evaluation form.                                                                                                                             |
| [**postQualityFormsSurveys**](QualityApi.md#postQualityFormsSurveys)                                                               | Create a survey form.                                                                                                                                  |
| [**postQualityPublishedforms**](QualityApi.md#postQualityPublishedforms)                                                           | Publish an evaluation form.                                                                                                                            |
| [**postQualityPublishedformsEvaluations**](QualityApi.md#postQualityPublishedformsEvaluations)                                     | Publish an evaluation form.                                                                                                                            |
| [**postQualityPublishedformsSurveys**](QualityApi.md#postQualityPublishedformsSurveys)                                             | Publish a survey form.                                                                                                                                 |
| [**postQualitySurveysScoring**](QualityApi.md#postQualitySurveysScoring)                                                           | Score survey                                                                                                                                           |
| [**putQualityCalibration**](QualityApi.md#putQualityCalibration)                                                                   | Update a calibration to the specified calibration via PUT. Editable fields include: evaluators, expertEvaluator, and scoringIndex                      |
| [**putQualityConversationEvaluation**](QualityApi.md#putQualityConversationEvaluation)                                             | Update an evaluation                                                                                                                                   |
| [**putQualityForm**](QualityApi.md#putQualityForm)                                                                                 | Update an evaluation form.                                                                                                                             |
| [**putQualityFormsEvaluation**](QualityApi.md#putQualityFormsEvaluation)                                                           | Update an evaluation form.                                                                                                                             |
| [**putQualityFormsSurvey**](QualityApi.md#putQualityFormsSurvey)                                                                   | Update a survey form.                                                                                                                                  |
| [**putQualitySurveysScorable**](QualityApi.md#putQualitySurveysScorable)                                                           | Update a survey as an end-customer, for the purposes of scoring it.                                                                                    |

{: class="table-striped"}

<a name="deleteQualityCalibration"></a>

# **deleteQualityCalibration**

> [Calibration](Calibration.md) deleteQualityCalibration(calibrationId, calibratorId)

Delete a calibration by id.

Wraps DELETE /api/v2/quality/calibrations/{calibrationId}

Requires ANY permissions:

- quality:calibration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
try {
    Calibration result = apiInstance.deleteQualityCalibration(calibrationId, calibratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityCalibration");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **calibrationId** | **String** | Calibration ID |
| **calibratorId**  | **String** | calibratorId   |

{: class="table-striped"}

### Return type

[**Calibration**](Calibration.md)

<a name="deleteQualityConversationEvaluation"></a>

# **deleteQualityConversationEvaluation**

> [Evaluation](Evaluation.md) deleteQualityConversationEvaluation(conversationId, evaluationId, expand)

Delete an evaluation

Wraps DELETE /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}

Requires ANY permissions:

- quality:evaluation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | evaluatorId, evaluationForm
try {
    Evaluation result = apiInstance.deleteQualityConversationEvaluation(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                 | Notes      |
| ------------------ | ---------- | --------------------------- | ---------- |
| **conversationId** | **String** | conversationId              |
| **evaluationId**   | **String** | evaluationId                |
| **expand**         | **String** | evaluatorId, evaluationForm | [optional] |

{: class="table-striped"}

### Return type

[**Evaluation**](Evaluation.md)

<a name="deleteQualityForm"></a>

# **deleteQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteQualityForm(formId)

Delete an evaluation form.

Wraps DELETE /api/v2/quality/forms/{formId}

Requires ANY permissions:

- quality:evaluationForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityForm(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityForm");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteQualityFormsEvaluation"></a>

# **deleteQualityFormsEvaluation**

> Void deleteQualityFormsEvaluation(formId)

Delete an evaluation form.

Wraps DELETE /api/v2/quality/forms/evaluations/{formId}

Requires ANY permissions:

- quality:evaluationForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityFormsEvaluation(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteQualityFormsSurvey"></a>

# **deleteQualityFormsSurvey**

> Void deleteQualityFormsSurvey(formId)

Delete a survey form.

Wraps DELETE /api/v2/quality/forms/surveys/{formId}

Requires ALL permissions:

- quality:surveyForm:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    apiInstance.deleteQualityFormsSurvey(formId);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#deleteQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getQualityAgentsActivity"></a>

# **getQualityAgentsActivity**

> [AgentActivityEntityListing](AgentActivityEntityListing.md) getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group)

Gets a list of Agent Activities

Each item on the list shows one agent&#39;s evaluation activity comprised of the number of evaluations and the highest, average, and lowest standard and critical scores, as well as a sub list showing the number and average score of evaluations for each evaluator for that agent. evaluatorUserId, startTime, and endTime are all filtering criteria. If specified, the only evaluations used to compile the agent activity response will be ones that match the filtering criteria. agentUserId, name, group, and agentTeamId are all agent selection criteria. criteria. If one or more agent selection criteria are specified, then the returned activity will include users that match the criteria even if those users did not have any agent activity or evaluations that do not match any filtering criteria. If no agent selection criteria are specified but an evaluatorUserId is, then the returned activity will be only for those agents that had evaluations where the evaluator is the evaluatorUserId. If no agent selection criteria are specified and no evaluatorUserId is specified, then the returned activity will be for all users

Wraps GET /api/v2/quality/agents/activity

Requires ANY permissions:

- quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
List<String> agentUserId = Arrays.asList("agentUserId_example"); // List<String> | user id of agent requested
String evaluatorUserId = "evaluatorUserId_example"; // String | user id of the evaluator
String name = "name_example"; // String | name
String group = "group_example"; // String | group id
try {
    AgentActivityEntityListing result = apiInstance.getQualityAgentsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityAgentsActivity");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                | Description                                                                                                                                  | Notes                      |
| ------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------- |
| **pageSize**        | **Integer**                         | The total page size requested                                                                                                                | [optional] [default to 25] |
| **pageNumber**      | **Integer**                         | The page number requested                                                                                                                    | [optional] [default to 1]  |
| **sortBy**          | **String**                          | variable name requested to sort by                                                                                                           | [optional]                 |
| **expand**          | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                                                                                       | [optional]                 |
| **nextPage**        | **String**                          | next page token                                                                                                                              | [optional]                 |
| **previousPage**    | **String**                          | Previous page token                                                                                                                          | [optional]                 |
| **startTime**       | **Date**                            | Start time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional]                 |
| **endTime**         | **Date**                            | End time of agent activity based on assigned date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z   | [optional]                 |
| **agentUserId**     | [**List&lt;String&gt;**](String.md) | user id of agent requested                                                                                                                   | [optional]                 |
| **evaluatorUserId** | **String**                          | user id of the evaluator                                                                                                                     | [optional]                 |
| **name**            | **String**                          | name                                                                                                                                         | [optional]                 |
| **group**           | **String**                          | group id                                                                                                                                     | [optional]                 |

{: class="table-striped"}

### Return type

[**AgentActivityEntityListing**](AgentActivityEntityListing.md)

<a name="getQualityCalibration"></a>

# **getQualityCalibration**

> [Calibration](Calibration.md) getQualityCalibration(calibrationId, calibratorId, conversationId)

Get a calibration by id. Requires either calibrator id or conversation id

Wraps GET /api/v2/quality/calibrations/{calibrationId}

Requires ANY permissions:

- quality:calibration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
String calibratorId = "calibratorId_example"; // String | calibratorId
String conversationId = "conversationId_example"; // String | conversationId
try {
    Calibration result = apiInstance.getQualityCalibration(calibrationId, calibratorId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityCalibration");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes      |
| ------------------ | ---------- | -------------- | ---------- |
| **calibrationId**  | **String** | Calibration ID |
| **calibratorId**   | **String** | calibratorId   | [optional] |
| **conversationId** | **String** | conversationId | [optional] |

{: class="table-striped"}

### Return type

[**Calibration**](Calibration.md)

<a name="getQualityCalibrations"></a>

# **getQualityCalibrations**

> [CalibrationEntityListing](CalibrationEntityListing.md) getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime)

Get the list of calibrations

Wraps GET /api/v2/quality/calibrations

Requires ANY permissions:

- quality:calibration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibratorId = "calibratorId_example"; // String | user id of calibrator
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversation id
Date startTime = new Date(); // Date | Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
try {
    CalibrationEntityListing result = apiInstance.getQualityCalibrations(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityCalibrations");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description                                                                                                                 | Notes                      |
| ------------------ | ----------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | -------------------------- |
| **calibratorId**   | **String**                          | user id of calibrator                                                                                                       |
| **pageSize**       | **Integer**                         | The total page size requested                                                                                               | [optional] [default to 25] |
| **pageNumber**     | **Integer**                         | The page number requested                                                                                                   | [optional] [default to 1]  |
| **sortBy**         | **String**                          | variable name requested to sort by                                                                                          | [optional]                 |
| **expand**         | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                                                                      | [optional]                 |
| **nextPage**       | **String**                          | next page token                                                                                                             | [optional]                 |
| **previousPage**   | **String**                          | Previous page token                                                                                                         | [optional]                 |
| **conversationId** | **String**                          | conversation id                                                                                                             | [optional]                 |
| **startTime**      | **Date**                            | Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional]                 |
| **endTime**        | **Date**                            | end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z       | [optional]                 |

{: class="table-striped"}

### Return type

[**CalibrationEntityListing**](CalibrationEntityListing.md)

<a name="getQualityConversationEvaluation"></a>

# **getQualityConversationEvaluation**

> [Evaluation](Evaluation.md) getQualityConversationEvaluation(conversationId, evaluationId, expand)

Get an evaluation

Wraps GET /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}

Requires ANY permissions:

- quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
String expand = "expand_example"; // String | agent, evaluator, evaluationForm
try {
    Evaluation result = apiInstance.getQualityConversationEvaluation(conversationId, evaluationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description                      | Notes      |
| ------------------ | ---------- | -------------------------------- | ---------- |
| **conversationId** | **String** | conversationId                   |
| **evaluationId**   | **String** | evaluationId                     |
| **expand**         | **String** | agent, evaluator, evaluationForm | [optional] |

{: class="table-striped"}

### Return type

[**Evaluation**](Evaluation.md)

<a name="getQualityConversationSurveys"></a>

# **getQualityConversationSurveys**

> [List&lt;Survey&gt;](Survey.md) getQualityConversationSurveys(conversationId)

Get the surveys for a conversation

Wraps GET /api/v2/quality/conversations/{conversationId}/surveys

Requires ANY permissions:

- quality:survey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    List<Survey> result = apiInstance.getQualityConversationSurveys(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationSurveys");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**List&lt;Survey&gt;**](Survey.md)

<a name="getQualityConversationsAuditsQueryTransactionId"></a>

# **getQualityConversationsAuditsQueryTransactionId**

> [QualityAuditQueryExecutionStatusResponse](QualityAuditQueryExecutionStatusResponse.md) getQualityConversationsAuditsQueryTransactionId(transactionId)

Get status of audit query execution

Wraps GET /api/v2/quality/conversations/audits/query/{transactionId}

Requires ALL permissions:

- audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String transactionId = "transactionId_example"; // String | Transaction ID
try {
    QualityAuditQueryExecutionStatusResponse result = apiInstance.getQualityConversationsAuditsQueryTransactionId(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationsAuditsQueryTransactionId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **transactionId** | **String** | Transaction ID |

{: class="table-striped"}

### Return type

[**QualityAuditQueryExecutionStatusResponse**](QualityAuditQueryExecutionStatusResponse.md)

<a name="getQualityConversationsAuditsQueryTransactionIdResults"></a>

# **getQualityConversationsAuditsQueryTransactionIdResults**

> [QualityAuditQueryExecutionResultsResponse](QualityAuditQueryExecutionResultsResponse.md) getQualityConversationsAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand)

Get results of audit query

Wraps GET /api/v2/quality/conversations/audits/query/{transactionId}/results

Requires ALL permissions:

- audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String transactionId = "transactionId_example"; // String | Transaction ID
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 25; // Integer | Page size
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    QualityAuditQueryExecutionResultsResponse result = apiInstance.getQualityConversationsAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityConversationsAuditsQueryTransactionIdResults");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                                                           | Notes                            |
| ----------------- | ----------------------------------- | --------------------------------------------------------------------- | -------------------------------- |
| **transactionId** | **String**                          | Transaction ID                                                        |
| **cursor**        | **String**                          | Indicates where to resume query results (not required for first page) | [optional]                       |
| **pageSize**      | **Integer**                         | Page size                                                             | [optional] [default to 25]       |
| **expand**        | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand                                       | [optional]<br />**Values**: user |

{: class="table-striped"}

### Return type

[**QualityAuditQueryExecutionResultsResponse**](QualityAuditQueryExecutionResultsResponse.md)

<a name="getQualityEvaluationsQuery"></a>

# **getQualityEvaluationsQuery**

> [EvaluationEntityListing](EvaluationEntityListing.md) getQualityEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder)

Queries Evaluations and returns a paged list

Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.

Wraps GET /api/v2/quality/evaluations/query

Requires ANY permissions:

- quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String conversationId = "conversationId_example"; // String | conversationId specified
String agentUserId = "agentUserId_example"; // String | user id of the agent
String evaluatorUserId = "evaluatorUserId_example"; // String | evaluator user id
String queueId = "queueId_example"; // String | queue id
String startTime = "startTime_example"; // String | start time of the evaluation query
String endTime = "endTime_example"; // String | end time of the evaluation query
List<String> evaluationState = Arrays.asList("evaluationState_example"); // List<String> |
Boolean isReleased = true; // Boolean | the evaluation has been released
Boolean agentHasRead = true; // Boolean | agent has the evaluation
Boolean expandAnswerTotalScores = true; // Boolean | get the total scores for evaluations
Integer maximum = 56; // Integer | maximum
String sortOrder = "sortOrder_example"; // String | sort order options for agentUserId or evaluatorUserId query. Valid options are 'a', 'asc', 'ascending', 'd', 'desc', 'descending'
try {
    EvaluationEntityListing result = apiInstance.getQualityEvaluationsQuery(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityEvaluationsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name                        | Type                                | Description                                                                                                                                                                       | Notes                      |
| --------------------------- | ----------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------- |
| **pageSize**                | **Integer**                         | The total page size requested                                                                                                                                                     | [optional] [default to 25] |
| **pageNumber**              | **Integer**                         | The page number requested                                                                                                                                                         | [optional] [default to 1]  |
| **sortBy**                  | **String**                          | variable name requested to sort by                                                                                                                                                | [optional]                 |
| **expand**                  | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                                                                                                                            | [optional]                 |
| **nextPage**                | **String**                          | next page token                                                                                                                                                                   | [optional]                 |
| **previousPage**            | **String**                          | Previous page token                                                                                                                                                               | [optional]                 |
| **conversationId**          | **String**                          | conversationId specified                                                                                                                                                          | [optional]                 |
| **agentUserId**             | **String**                          | user id of the agent                                                                                                                                                              | [optional]                 |
| **evaluatorUserId**         | **String**                          | evaluator user id                                                                                                                                                                 | [optional]                 |
| **queueId**                 | **String**                          | queue id                                                                                                                                                                          | [optional]                 |
| **startTime**               | **String**                          | start time of the evaluation query                                                                                                                                                | [optional]                 |
| **endTime**                 | **String**                          | end time of the evaluation query                                                                                                                                                  | [optional]                 |
| **evaluationState**         | [**List&lt;String&gt;**](String.md) |                                                                                                                                                                                   | [optional]                 |
| **isReleased**              | **Boolean**                         | the evaluation has been released                                                                                                                                                  | [optional]                 |
| **agentHasRead**            | **Boolean**                         | agent has the evaluation                                                                                                                                                          | [optional]                 |
| **expandAnswerTotalScores** | **Boolean**                         | get the total scores for evaluations                                                                                                                                              | [optional]                 |
| **maximum**                 | **Integer**                         | maximum                                                                                                                                                                           | [optional]                 |
| **sortOrder**               | **String**                          | sort order options for agentUserId or evaluatorUserId query. Valid options are &#39;a&#39;, &#39;asc&#39;, &#39;ascending&#39;, &#39;d&#39;, &#39;desc&#39;, &#39;descending&#39; | [optional]                 |

{: class="table-striped"}

### Return type

[**EvaluationEntityListing**](EvaluationEntityListing.md)

<a name="getQualityEvaluatorsActivity"></a>

# **getQualityEvaluatorsActivity**

> [EvaluatorActivityEntityListing](EvaluatorActivityEntityListing.md) getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group)

Get an evaluator activity

Wraps GET /api/v2/quality/evaluators/activity

Requires ANY permissions:

- quality:evaluation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Date startTime = new Date(); // Date | The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
Date endTime = new Date(); // Date | The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
String name = "name_example"; // String | Evaluator name
List<String> permission = Arrays.asList("permission_example"); // List<String> | permission strings
String group = "group_example"; // String | group id
try {
    EvaluatorActivityEntityListing result = apiInstance.getQualityEvaluatorsActivity(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityEvaluatorsActivity");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                                                                                       | Notes                      |
| ---------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------------------- | -------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested                                                                                     | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested                                                                                         | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by                                                                                | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                                                            | [optional]                 |
| **nextPage**     | **String**                          | next page token                                                                                                   | [optional]                 |
| **previousPage** | **String**                          | Previous page token                                                                                               | [optional]                 |
| **startTime**    | **Date**                            | The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional]                 |
| **endTime**      | **Date**                            | The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z   | [optional]                 |
| **name**         | **String**                          | Evaluator name                                                                                                    | [optional]                 |
| **permission**   | [**List&lt;String&gt;**](String.md) | permission strings                                                                                                | [optional]                 |
| **group**        | **String**                          | group id                                                                                                          | [optional]                 |

{: class="table-striped"}

### Return type

[**EvaluatorActivityEntityListing**](EvaluatorActivityEntityListing.md)

<a name="getQualityForm"></a>

# **getQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.md) getQualityForm(formId)

Get an evaluation form

Wraps GET /api/v2/quality/forms/{formId}

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getQualityForm(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityForm");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="getQualityFormVersions"></a>

# **getQualityFormVersions**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityFormVersions(formId, pageSize, pageNumber)

Gets all the revisions for a specific evaluation.

Wraps GET /api/v2/quality/forms/{formId}/versions

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EvaluationFormEntityListing result = apiInstance.getQualityFormVersions(formId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormVersions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **formId**     | **String**  | Form ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityForms"></a>

# **getQualityForms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms

Wraps GET /api/v2/quality/forms

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormEntityListing result = apiInstance.getQualityForms(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityForms");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                               | Notes                      |
| ---------------- | ----------- | ----------------------------------------- | -------------------------- |
| **pageSize**     | **Integer** | The total page size requested             | [optional] [default to 25] |
| **pageNumber**   | **Integer** | The page number requested                 | [optional] [default to 1]  |
| **sortBy**       | **String**  | variable name requested to sort by        | [optional]                 |
| **nextPage**     | **String**  | next page token                           | [optional]                 |
| **previousPage** | **String**  | Previous page token                       | [optional]                 |
| **expand**       | **String**  | Expand                                    | [optional]                 |
| **name**         | **String**  | Name                                      | [optional]                 |
| **sortOrder**    | **String**  | Order to sort results, either asc or desc | [optional]                 |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityFormsEvaluation"></a>

# **getQualityFormsEvaluation**

> [EvaluationForm](EvaluationForm.md) getQualityFormsEvaluation(formId)

Get an evaluation form

Wraps GET /api/v2/quality/forms/evaluations/{formId}

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getQualityFormsEvaluation(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="getQualityFormsEvaluationVersions"></a>

# **getQualityFormsEvaluationVersions**

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityFormsEvaluationVersions(formId, pageSize, pageNumber, sortOrder)

Gets all the revisions for a specific evaluation.

Wraps GET /api/v2/quality/forms/evaluations/{formId}/versions

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "asc"; // String | Sort order
try {
    EvaluationFormEntityListing result = apiInstance.getQualityFormsEvaluationVersions(formId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluationVersions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                       |
| -------------- | ----------- | ----------- | --------------------------- |
| **formId**     | **String**  | Form ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25]  |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]   |
| **sortOrder**  | **String**  | Sort order  | [optional] [default to asc] |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityFormsEvaluations"></a>

# **getQualityFormsEvaluations**

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of evaluation forms

Wraps GET /api/v2/quality/forms/evaluations

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    EvaluationFormEntityListing result = apiInstance.getQualityFormsEvaluations(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluations");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                               | Notes                      |
| ---------------- | ----------- | ----------------------------------------- | -------------------------- |
| **pageSize**     | **Integer** | The total page size requested             | [optional] [default to 25] |
| **pageNumber**   | **Integer** | The page number requested                 | [optional] [default to 1]  |
| **sortBy**       | **String**  | variable name requested to sort by        | [optional]                 |
| **nextPage**     | **String**  | next page token                           | [optional]                 |
| **previousPage** | **String**  | Previous page token                       | [optional]                 |
| **expand**       | **String**  | Expand                                    | [optional]                 |
| **name**         | **String**  | Name                                      | [optional]                 |
| **sortOrder**    | **String**  | Order to sort results, either asc or desc | [optional]                 |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityFormsEvaluationsBulkContexts"></a>

# **getQualityFormsEvaluationsBulkContexts**

> [List&lt;EvaluationForm&gt;](EvaluationForm.md) getQualityFormsEvaluationsBulkContexts(contextId)

Retrieve a list of the latest published evaluation form versions by context ids

Wraps GET /api/v2/quality/forms/evaluations/bulk/contexts

Requires ALL permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> contextId = Arrays.asList("contextId_example"); // List<String> | A comma-delimited list of valid evaluation form context ids
try {
    List<EvaluationForm> result = apiInstance.getQualityFormsEvaluationsBulkContexts(contextId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsEvaluationsBulkContexts");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description                                                 | Notes |
| ------------- | ----------------------------------- | ----------------------------------------------------------- | ----- |
| **contextId** | [**List&lt;String&gt;**](String.md) | A comma-delimited list of valid evaluation form context ids |

{: class="table-striped"}

### Return type

[**List&lt;EvaluationForm&gt;**](EvaluationForm.md)

<a name="getQualityFormsSurvey"></a>

# **getQualityFormsSurvey**

> [SurveyForm](SurveyForm.md) getQualityFormsSurvey(formId)

Get a survey form

Wraps GET /api/v2/quality/forms/surveys/{formId}

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    SurveyForm result = apiInstance.getQualityFormsSurvey(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

<a name="getQualityFormsSurveyVersions"></a>

# **getQualityFormsSurveyVersions**

> [SurveyFormEntityListing](SurveyFormEntityListing.md) getQualityFormsSurveyVersions(formId, pageSize, pageNumber)

Gets all the revisions for a specific survey.

Wraps GET /api/v2/quality/forms/surveys/{formId}/versions

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveyVersions(formId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveyVersions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **formId**     | **String**  | Form ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.md)

<a name="getQualityFormsSurveys"></a>

# **getQualityFormsSurveys**

> [SurveyFormEntityListing](SurveyFormEntityListing.md) getQualityFormsSurveys(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder)

Get the list of survey forms

Wraps GET /api/v2/quality/forms/surveys

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String expand = "expand_example"; // String | Expand
String name = "name_example"; // String | Name
String sortOrder = "sortOrder_example"; // String | Order to sort results, either asc or desc
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveys(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveys");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                               | Notes                      |
| ---------------- | ----------- | ----------------------------------------- | -------------------------- |
| **pageSize**     | **Integer** | The total page size requested             | [optional] [default to 25] |
| **pageNumber**   | **Integer** | The page number requested                 | [optional] [default to 1]  |
| **sortBy**       | **String**  | variable name requested to sort by        | [optional]                 |
| **nextPage**     | **String**  | next page token                           | [optional]                 |
| **previousPage** | **String**  | Previous page token                       | [optional]                 |
| **expand**       | **String**  | Expand                                    | [optional]                 |
| **name**         | **String**  | Name                                      | [optional]                 |
| **sortOrder**    | **String**  | Order to sort results, either asc or desc | [optional]                 |

{: class="table-striped"}

### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.md)

<a name="getQualityFormsSurveysBulk"></a>

# **getQualityFormsSurveysBulk**

> [SurveyFormEntityListing](SurveyFormEntityListing.md) getQualityFormsSurveysBulk(id)

Retrieve a list of survey forms by their ids

Wraps GET /api/v2/quality/forms/surveys/bulk

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> id = Arrays.asList("id_example"); // List<String> | A comma-delimited list of valid survey form ids
try {
    SurveyFormEntityListing result = apiInstance.getQualityFormsSurveysBulk(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveysBulk");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description                                     | Notes |
| ------ | ----------------------------------- | ----------------------------------------------- | ----- |
| **id** | [**List&lt;String&gt;**](String.md) | A comma-delimited list of valid survey form ids |

{: class="table-striped"}

### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.md)

<a name="getQualityFormsSurveysBulkContexts"></a>

# **getQualityFormsSurveysBulkContexts**

> [List&lt;SurveyForm&gt;](SurveyForm.md) getQualityFormsSurveysBulkContexts(contextId, published)

Retrieve a list of the latest form versions by context ids

Wraps GET /api/v2/quality/forms/surveys/bulk/contexts

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
List<String> contextId = Arrays.asList("contextId_example"); // List<String> | A comma-delimited list of valid survey form context ids
Boolean published = true; // Boolean | If true, the latest published version will be included. If false, only the unpublished version will be included.
try {
    List<SurveyForm> result = apiInstance.getQualityFormsSurveysBulkContexts(contextId, published);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityFormsSurveysBulkContexts");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description                                                                                                      | Notes                        |
| ------------- | ----------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------- |
| **contextId** | [**List&lt;String&gt;**](String.md) | A comma-delimited list of valid survey form context ids                                                          |
| **published** | **Boolean**                         | If true, the latest published version will be included. If false, only the unpublished version will be included. | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**List&lt;SurveyForm&gt;**](SurveyForm.md)

<a name="getQualityPublishedform"></a>

# **getQualityPublishedform**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.md) getQualityPublishedform(formId)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms/{formId}

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getQualityPublishedform(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedform");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="getQualityPublishedforms"></a>

# **getQualityPublishedforms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestPerContext = false; // Boolean | onlyLatestPerContext
try {
    EvaluationFormEntityListing result = apiInstance.getQualityPublishedforms(pageSize, pageNumber, name, onlyLatestPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedforms");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description          | Notes                         |
| ------------------------ | ----------- | -------------------- | ----------------------------- |
| **pageSize**             | **Integer** | Page size            | [optional] [default to 25]    |
| **pageNumber**           | **Integer** | Page number          | [optional] [default to 1]     |
| **name**                 | **String**  | Name                 | [optional]                    |
| **onlyLatestPerContext** | **Boolean** | onlyLatestPerContext | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityPublishedformsEvaluation"></a>

# **getQualityPublishedformsEvaluation**

> [EvaluationForm](EvaluationForm.md) getQualityPublishedformsEvaluation(formId)

Get the most recent published version of an evaluation form.

Wraps GET /api/v2/quality/publishedforms/evaluations/{formId}

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    EvaluationForm result = apiInstance.getQualityPublishedformsEvaluation(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="getQualityPublishedformsEvaluations"></a>

# **getQualityPublishedformsEvaluations**

> [EvaluationFormEntityListing](EvaluationFormEntityListing.md) getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext)

Get the published evaluation forms.

Wraps GET /api/v2/quality/publishedforms/evaluations

Requires ANY permissions:

- quality:evaluationForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestPerContext = false; // Boolean | onlyLatestPerContext
try {
    EvaluationFormEntityListing result = apiInstance.getQualityPublishedformsEvaluations(pageSize, pageNumber, name, onlyLatestPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsEvaluations");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type        | Description          | Notes                         |
| ------------------------ | ----------- | -------------------- | ----------------------------- |
| **pageSize**             | **Integer** | Page size            | [optional] [default to 25]    |
| **pageNumber**           | **Integer** | Page number          | [optional] [default to 1]     |
| **name**                 | **String**  | Name                 | [optional]                    |
| **onlyLatestPerContext** | **Boolean** | onlyLatestPerContext | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**EvaluationFormEntityListing**](EvaluationFormEntityListing.md)

<a name="getQualityPublishedformsSurvey"></a>

# **getQualityPublishedformsSurvey**

> [SurveyForm](SurveyForm.md) getQualityPublishedformsSurvey(formId)

Get the most recent published version of a survey form.

Wraps GET /api/v2/quality/publishedforms/surveys/{formId}

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
try {
    SurveyForm result = apiInstance.getQualityPublishedformsSurvey(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsSurvey");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **formId** | **String** | Form ID     |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

<a name="getQualityPublishedformsSurveys"></a>

# **getQualityPublishedformsSurveys**

> [SurveyFormEntityListing](SurveyFormEntityListing.md) getQualityPublishedformsSurveys(pageSize, pageNumber, name, onlyLatestEnabledPerContext)

Get the published survey forms.

Wraps GET /api/v2/quality/publishedforms/surveys

Requires ALL permissions:

- quality:surveyForm:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
Boolean onlyLatestEnabledPerContext = false; // Boolean | onlyLatestEnabledPerContext
try {
    SurveyFormEntityListing result = apiInstance.getQualityPublishedformsSurveys(pageSize, pageNumber, name, onlyLatestEnabledPerContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualityPublishedformsSurveys");
    e.printStackTrace();
}
```

### Parameters

| Name                            | Type        | Description                 | Notes                         |
| ------------------------------- | ----------- | --------------------------- | ----------------------------- |
| **pageSize**                    | **Integer** | Page size                   | [optional] [default to 25]    |
| **pageNumber**                  | **Integer** | Page number                 | [optional] [default to 1]     |
| **name**                        | **String**  | Name                        | [optional]                    |
| **onlyLatestEnabledPerContext** | **Boolean** | onlyLatestEnabledPerContext | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**SurveyFormEntityListing**](SurveyFormEntityListing.md)

<a name="getQualitySurvey"></a>

# **getQualitySurvey**

> [Survey](Survey.md) getQualitySurvey(surveyId)

Get a survey for a conversation

Wraps GET /api/v2/quality/surveys/{surveyId}

Requires ANY permissions:

- quality:survey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String surveyId = "surveyId_example"; // String | surveyId
try {
    Survey result = apiInstance.getQualitySurvey(surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualitySurvey");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **surveyId** | **String** | surveyId    |

{: class="table-striped"}

### Return type

[**Survey**](Survey.md)

<a name="getQualitySurveysScorable"></a>

# **getQualitySurveysScorable**

> [ScorableSurvey](ScorableSurvey.md) getQualitySurveysScorable(customerSurveyUrl)

Get a survey as an end-customer, for the purposes of scoring it.

Wraps GET /api/v2/quality/surveys/scorable

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.QualityApi;


QualityApi apiInstance = new QualityApi();
String customerSurveyUrl = "customerSurveyUrl_example"; // String | customerSurveyUrl
try {
    ScorableSurvey result = apiInstance.getQualitySurveysScorable(customerSurveyUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#getQualitySurveysScorable");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type       | Description       | Notes |
| --------------------- | ---------- | ----------------- | ----- |
| **customerSurveyUrl** | **String** | customerSurveyUrl |

{: class="table-striped"}

### Return type

[**ScorableSurvey**](ScorableSurvey.md)

<a name="patchQualityFormsSurvey"></a>

# **patchQualityFormsSurvey**

> [SurveyForm](SurveyForm.md) patchQualityFormsSurvey(formId, body)

Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.

Wraps PATCH /api/v2/quality/forms/surveys/{formId}

Requires ALL permissions:

- quality:surveyForm:disable

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.patchQualityFormsSurvey(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#patchQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                            | Description | Notes |
| ---------- | ------------------------------- | ----------- | ----- |
| **formId** | **String**                      | Form ID     |
| **body**   | [**SurveyForm**](SurveyForm.md) | Survey form |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

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
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationAggregationQuery body = new EvaluationAggregationQuery(); // EvaluationAggregationQuery | query
try {
    EvaluationAggregateQueryResponse result = apiInstance.postAnalyticsEvaluationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsEvaluationsAggregatesQuery");
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
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyAggregationQuery body = new SurveyAggregationQuery(); // SurveyAggregationQuery | query
try {
    SurveyAggregateQueryResponse result = apiInstance.postAnalyticsSurveysAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postAnalyticsSurveysAggregatesQuery");
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

<a name="postQualityCalibrations"></a>

# **postQualityCalibrations**

> [Calibration](Calibration.md) postQualityCalibrations(body, expand)

Create a calibration

Wraps POST /api/v2/quality/calibrations

Requires ANY permissions:

- quality:calibration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
CalibrationCreate body = new CalibrationCreate(); // CalibrationCreate | calibration
String expand = "expand_example"; // String | calibratorId
try {
    Calibration result = apiInstance.postQualityCalibrations(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityCalibrations");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                          | Description  | Notes      |
| ---------- | --------------------------------------------- | ------------ | ---------- |
| **body**   | [**CalibrationCreate**](CalibrationCreate.md) | calibration  |
| **expand** | **String**                                    | calibratorId | [optional] |

{: class="table-striped"}

### Return type

[**Calibration**](Calibration.md)

<a name="postQualityConversationEvaluations"></a>

# **postQualityConversationEvaluations**

> [Evaluation](Evaluation.md) postQualityConversationEvaluations(conversationId, body, expand)

Create an evaluation

Wraps POST /api/v2/quality/conversations/{conversationId}/evaluations

Requires ANY permissions:

- quality:evaluation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
Evaluation body = new Evaluation(); // Evaluation | evaluation
String expand = "expand_example"; // String | evaluatorId
try {
    Evaluation result = apiInstance.postQualityConversationEvaluations(conversationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityConversationEvaluations");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                            | Description    | Notes      |
| ------------------ | ------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                      | conversationId |
| **body**           | [**Evaluation**](Evaluation.md) | evaluation     |
| **expand**         | **String**                      | evaluatorId    | [optional] |

{: class="table-striped"}

### Return type

[**Evaluation**](Evaluation.md)

<a name="postQualityConversationsAuditsQuery"></a>

# **postQualityConversationsAuditsQuery**

> [QualityAuditQueryExecutionStatusResponse](QualityAuditQueryExecutionStatusResponse.md) postQualityConversationsAuditsQuery(body)

Create audit query execution

Wraps POST /api/v2/quality/conversations/audits/query

Requires ALL permissions:

- audits:interactionDetails:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
QMAuditQueryRequest body = new QMAuditQueryRequest(); // QMAuditQueryRequest | query
try {
    QualityAuditQueryExecutionStatusResponse result = apiInstance.postQualityConversationsAuditsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityConversationsAuditsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description | Notes |
| -------- | ------------------------------------------------- | ----------- | ----- |
| **body** | [**QMAuditQueryRequest**](QMAuditQueryRequest.md) | query       |

{: class="table-striped"}

### Return type

[**QualityAuditQueryExecutionStatusResponse**](QualityAuditQueryExecutionStatusResponse.md)

<a name="postQualityEvaluationsAggregatesQueryMe"></a>

# **postQualityEvaluationsAggregatesQueryMe**

> [EvaluationAggregateQueryResponse](EvaluationAggregateQueryResponse.md) postQualityEvaluationsAggregatesQueryMe(body)

Query for evaluation aggregates for the current user

Wraps POST /api/v2/quality/evaluations/aggregates/query/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationAggregationQueryMe body = new EvaluationAggregationQueryMe(); // EvaluationAggregationQueryMe | query
try {
    EvaluationAggregateQueryResponse result = apiInstance.postQualityEvaluationsAggregatesQueryMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityEvaluationsAggregatesQueryMe");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description | Notes |
| -------- | ------------------------------------------------------------------- | ----------- | ----- |
| **body** | [**EvaluationAggregationQueryMe**](EvaluationAggregationQueryMe.md) | query       |

{: class="table-striped"}

### Return type

[**EvaluationAggregateQueryResponse**](EvaluationAggregateQueryResponse.md)

<a name="postQualityEvaluationsScoring"></a>

# **postQualityEvaluationsScoring**

> [EvaluationScoringSet](EvaluationScoringSet.md) postQualityEvaluationsScoring(body)

Score evaluation

Wraps POST /api/v2/quality/evaluations/scoring

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationFormAndScoringSet body = new EvaluationFormAndScoringSet(); // EvaluationFormAndScoringSet | evaluationAndScoringSet
try {
    EvaluationScoringSet result = apiInstance.postQualityEvaluationsScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityEvaluationsScoring");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                              | Description             | Notes |
| -------- | ----------------------------------------------------------------- | ----------------------- | ----- |
| **body** | [**EvaluationFormAndScoringSet**](EvaluationFormAndScoringSet.md) | evaluationAndScoringSet |

{: class="table-striped"}

### Return type

[**EvaluationScoringSet**](EvaluationScoringSet.md)

<a name="postQualityForms"></a>

# **postQualityForms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.md) postQualityForms(body)

Create an evaluation form.

Wraps POST /api/v2/quality/forms

Requires ANY permissions:

- quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.postQualityForms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityForms");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description     | Notes |
| -------- | --------------------------------------- | --------------- | ----- |
| **body** | [**EvaluationForm**](EvaluationForm.md) | Evaluation form |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="postQualityFormsEvaluations"></a>

# **postQualityFormsEvaluations**

> [EvaluationForm](EvaluationForm.md) postQualityFormsEvaluations(body)

Create an evaluation form.

Wraps POST /api/v2/quality/forms/evaluations

Requires ANY permissions:

- quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.postQualityFormsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityFormsEvaluations");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description     | Notes |
| -------- | --------------------------------------- | --------------- | ----- |
| **body** | [**EvaluationForm**](EvaluationForm.md) | Evaluation form |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="postQualityFormsSurveys"></a>

# **postQualityFormsSurveys**

> [SurveyForm](SurveyForm.md) postQualityFormsSurveys(body)

Create a survey form.

Wraps POST /api/v2/quality/forms/surveys

Requires ALL permissions:

- quality:surveyForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.postQualityFormsSurveys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityFormsSurveys");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes |
| -------- | ------------------------------- | ----------- | ----- |
| **body** | [**SurveyForm**](SurveyForm.md) | Survey form |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

<a name="postQualityPublishedforms"></a>

# **postQualityPublishedforms**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.md) postQualityPublishedforms(body)

Publish an evaluation form.

Wraps POST /api/v2/quality/publishedforms

Requires ANY permissions:

- quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Publish request containing id of form to publish
try {
    EvaluationForm result = apiInstance.postQualityPublishedforms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedforms");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description                                      | Notes |
| -------- | --------------------------------- | ------------------------------------------------ | ----- |
| **body** | [**PublishForm**](PublishForm.md) | Publish request containing id of form to publish |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="postQualityPublishedformsEvaluations"></a>

# **postQualityPublishedformsEvaluations**

> [EvaluationForm](EvaluationForm.md) postQualityPublishedformsEvaluations(body)

Publish an evaluation form.

Wraps POST /api/v2/quality/publishedforms/evaluations

Requires ANY permissions:

- quality:evaluationForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Publish request containing id of form to publish
try {
    EvaluationForm result = apiInstance.postQualityPublishedformsEvaluations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedformsEvaluations");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description                                      | Notes |
| -------- | --------------------------------- | ------------------------------------------------ | ----- |
| **body** | [**PublishForm**](PublishForm.md) | Publish request containing id of form to publish |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="postQualityPublishedformsSurveys"></a>

# **postQualityPublishedformsSurveys**

> [SurveyForm](SurveyForm.md) postQualityPublishedformsSurveys(body)

Publish a survey form.

Wraps POST /api/v2/quality/publishedforms/surveys

Requires ALL permissions:

- quality:surveyForm:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
PublishForm body = new PublishForm(); // PublishForm | Survey form
try {
    SurveyForm result = apiInstance.postQualityPublishedformsSurveys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualityPublishedformsSurveys");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description | Notes |
| -------- | --------------------------------- | ----------- | ----- |
| **body** | [**PublishForm**](PublishForm.md) | Survey form |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

<a name="postQualitySurveysScoring"></a>

# **postQualitySurveysScoring**

> [SurveyScoringSet](SurveyScoringSet.md) postQualitySurveysScoring(body)

Score survey

Wraps POST /api/v2/quality/surveys/scoring

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
SurveyFormAndScoringSet body = new SurveyFormAndScoringSet(); // SurveyFormAndScoringSet | surveyAndScoringSet
try {
    SurveyScoringSet result = apiInstance.postQualitySurveysScoring(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#postQualitySurveysScoring");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description         | Notes |
| -------- | --------------------------------------------------------- | ------------------- | ----- |
| **body** | [**SurveyFormAndScoringSet**](SurveyFormAndScoringSet.md) | surveyAndScoringSet |

{: class="table-striped"}

### Return type

[**SurveyScoringSet**](SurveyScoringSet.md)

<a name="putQualityCalibration"></a>

# **putQualityCalibration**

> [Calibration](Calibration.md) putQualityCalibration(calibrationId, body)

Update a calibration to the specified calibration via PUT. Editable fields include: evaluators, expertEvaluator, and scoringIndex

Wraps PUT /api/v2/quality/calibrations/{calibrationId}

Requires ANY permissions:

- quality:calibration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String calibrationId = "calibrationId_example"; // String | Calibration ID
Calibration body = new Calibration(); // Calibration | Calibration
try {
    Calibration result = apiInstance.putQualityCalibration(calibrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityCalibration");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                              | Description    | Notes |
| ----------------- | --------------------------------- | -------------- | ----- |
| **calibrationId** | **String**                        | Calibration ID |
| **body**          | [**Calibration**](Calibration.md) | Calibration    |

{: class="table-striped"}

### Return type

[**Calibration**](Calibration.md)

<a name="putQualityConversationEvaluation"></a>

# **putQualityConversationEvaluation**

> [Evaluation](Evaluation.md) putQualityConversationEvaluation(conversationId, evaluationId, body, expand)

Update an evaluation

The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.

Wraps PUT /api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}

Requires ANY permissions:

- quality:evaluation:edit
- quality:evaluation:editScore
- quality:evaluation:editAgentSignoff

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String conversationId = "conversationId_example"; // String | conversationId
String evaluationId = "evaluationId_example"; // String | evaluationId
Evaluation body = new Evaluation(); // Evaluation | evaluation
String expand = "expand_example"; // String | evaluatorId, evaluationForm
try {
    Evaluation result = apiInstance.putQualityConversationEvaluation(conversationId, evaluationId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityConversationEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                            | Description                 | Notes      |
| ------------------ | ------------------------------- | --------------------------- | ---------- |
| **conversationId** | **String**                      | conversationId              |
| **evaluationId**   | **String**                      | evaluationId                |
| **body**           | [**Evaluation**](Evaluation.md) | evaluation                  |
| **expand**         | **String**                      | evaluatorId, evaluationForm | [optional] |

{: class="table-striped"}

### Return type

[**Evaluation**](Evaluation.md)

<a name="putQualityForm"></a>

# **putQualityForm**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EvaluationForm](EvaluationForm.md) putQualityForm(formId, body)

Update an evaluation form.

Wraps PUT /api/v2/quality/forms/{formId}

Requires ANY permissions:

- quality:evaluationForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.putQualityForm(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityForm");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                    | Description     | Notes |
| ---------- | --------------------------------------- | --------------- | ----- |
| **formId** | **String**                              | Form ID         |
| **body**   | [**EvaluationForm**](EvaluationForm.md) | Evaluation form |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="putQualityFormsEvaluation"></a>

# **putQualityFormsEvaluation**

> [EvaluationForm](EvaluationForm.md) putQualityFormsEvaluation(formId, body)

Update an evaluation form.

Wraps PUT /api/v2/quality/forms/evaluations/{formId}

Requires ANY permissions:

- quality:evaluationForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
EvaluationForm body = new EvaluationForm(); // EvaluationForm | Evaluation form
try {
    EvaluationForm result = apiInstance.putQualityFormsEvaluation(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityFormsEvaluation");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                    | Description     | Notes |
| ---------- | --------------------------------------- | --------------- | ----- |
| **formId** | **String**                              | Form ID         |
| **body**   | [**EvaluationForm**](EvaluationForm.md) | Evaluation form |

{: class="table-striped"}

### Return type

[**EvaluationForm**](EvaluationForm.md)

<a name="putQualityFormsSurvey"></a>

# **putQualityFormsSurvey**

> [SurveyForm](SurveyForm.md) putQualityFormsSurvey(formId, body)

Update a survey form.

Wraps PUT /api/v2/quality/forms/surveys/{formId}

Requires ALL permissions:

- quality:surveyForm:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.QualityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

QualityApi apiInstance = new QualityApi();
String formId = "formId_example"; // String | Form ID
SurveyForm body = new SurveyForm(); // SurveyForm | Survey form
try {
    SurveyForm result = apiInstance.putQualityFormsSurvey(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualityFormsSurvey");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                            | Description | Notes |
| ---------- | ------------------------------- | ----------- | ----- |
| **formId** | **String**                      | Form ID     |
| **body**   | [**SurveyForm**](SurveyForm.md) | Survey form |

{: class="table-striped"}

### Return type

[**SurveyForm**](SurveyForm.md)

<a name="putQualitySurveysScorable"></a>

# **putQualitySurveysScorable**

> [ScorableSurvey](ScorableSurvey.md) putQualitySurveysScorable(body, customerSurveyUrl)

Update a survey as an end-customer, for the purposes of scoring it.

Wraps PUT /api/v2/quality/surveys/scorable

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.QualityApi;


QualityApi apiInstance = new QualityApi();
ScorableSurvey body = new ScorableSurvey(); // ScorableSurvey | survey
String customerSurveyUrl = "customerSurveyUrl_example"; // String | customerSurveyUrl
try {
    ScorableSurvey result = apiInstance.putQualitySurveysScorable(body, customerSurveyUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QualityApi#putQualitySurveysScorable");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                    | Description       | Notes |
| --------------------- | --------------------------------------- | ----------------- | ----- |
| **body**              | [**ScorableSurvey**](ScorableSurvey.md) | survey            |
| **customerSurveyUrl** | **String**                              | customerSurveyUrl |

{: class="table-striped"}

### Return type

[**ScorableSurvey**](ScorableSurvey.md)
