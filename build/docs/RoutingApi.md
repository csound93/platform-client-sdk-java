---
title: RoutingApi
---

## RoutingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                         | Description                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteRoutingAssessment**](RoutingApi.md#deleteRoutingAssessment)                                           | Delete single benefit assessment.                                                                                                  |
| [**deleteRoutingEmailDomain**](RoutingApi.md#deleteRoutingEmailDomain)                                         | Delete a domain                                                                                                                    |
| [**deleteRoutingEmailDomainRoute**](RoutingApi.md#deleteRoutingEmailDomainRoute)                               | Delete a route                                                                                                                     |
| [**deleteRoutingPredictor**](RoutingApi.md#deleteRoutingPredictor)                                             | Delete single predictor.                                                                                                           |
| [**deleteRoutingQueue**](RoutingApi.md#deleteRoutingQueue)                                                     | Delete a queue                                                                                                                     |
| [**deleteRoutingQueueMember**](RoutingApi.md#deleteRoutingQueueMember)                                         | Delete a queue member.                                                                                                             |
| [**deleteRoutingQueueUser**](RoutingApi.md#deleteRoutingQueueUser)                                             | DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}. Delete queue member.                                          |
| [**deleteRoutingQueueWrapupcode**](RoutingApi.md#deleteRoutingQueueWrapupcode)                                 | Delete a wrap-up code from a queue                                                                                                 |
| [**deleteRoutingSettings**](RoutingApi.md#deleteRoutingSettings)                                               | Delete an organization&#39;s routing settings                                                                                      |
| [**deleteRoutingSkill**](RoutingApi.md#deleteRoutingSkill)                                                     | Delete Routing Skill                                                                                                               |
| [**deleteRoutingSmsAddress**](RoutingApi.md#deleteRoutingSmsAddress)                                           | Delete an Address by Id for SMS                                                                                                    |
| [**deleteRoutingSmsPhonenumber**](RoutingApi.md#deleteRoutingSmsPhonenumber)                                   | Delete a phone number provisioned for SMS.                                                                                         |
| [**deleteRoutingUserUtilization**](RoutingApi.md#deleteRoutingUserUtilization)                                 | Delete the user&#39;s max utilization settings and revert to the organization-wide default.                                        |
| [**deleteRoutingUtilization**](RoutingApi.md#deleteRoutingUtilization)                                         | Delete the organization-wide max utilization settings and revert to the system default.                                            |
| [**deleteRoutingWrapupcode**](RoutingApi.md#deleteRoutingWrapupcode)                                           | Delete wrap-up code                                                                                                                |
| [**deleteUserRoutinglanguage**](RoutingApi.md#deleteUserRoutinglanguage)                                       | Remove routing language from user                                                                                                  |
| [**deleteUserRoutingskill**](RoutingApi.md#deleteUserRoutingskill)                                             | Remove routing skill from user                                                                                                     |
| [**getRoutingAssessment**](RoutingApi.md#getRoutingAssessment)                                                 | Retrieve a single benefit assessment.                                                                                              |
| [**getRoutingAssessments**](RoutingApi.md#getRoutingAssessments)                                               | Retrieve all benefit assessments.                                                                                                  |
| [**getRoutingAssessmentsJob**](RoutingApi.md#getRoutingAssessmentsJob)                                         | Retrieve a single benefit assessments job.                                                                                         |
| [**getRoutingAssessmentsJobs**](RoutingApi.md#getRoutingAssessmentsJobs)                                       | Retrieve all benefit assessment jobs.                                                                                              |
| [**getRoutingEmailDomain**](RoutingApi.md#getRoutingEmailDomain)                                               | Get domain                                                                                                                         |
| [**getRoutingEmailDomainRoute**](RoutingApi.md#getRoutingEmailDomainRoute)                                     | Get a route                                                                                                                        |
| [**getRoutingEmailDomainRoutes**](RoutingApi.md#getRoutingEmailDomainRoutes)                                   | Get routes                                                                                                                         |
| [**getRoutingEmailDomains**](RoutingApi.md#getRoutingEmailDomains)                                             | Get domains                                                                                                                        |
| [**getRoutingEmailSetup**](RoutingApi.md#getRoutingEmailSetup)                                                 | Get email setup                                                                                                                    |
| [**getRoutingLanguages**](RoutingApi.md#getRoutingLanguages)                                                   | Get the list of supported languages.                                                                                               |
| [**getRoutingMessageRecipient**](RoutingApi.md#getRoutingMessageRecipient)                                     | Get a recipient                                                                                                                    |
| [**getRoutingMessageRecipients**](RoutingApi.md#getRoutingMessageRecipients)                                   | Get recipients                                                                                                                     |
| [**getRoutingPredictor**](RoutingApi.md#getRoutingPredictor)                                                   | Retrieve a single predictor.                                                                                                       |
| [**getRoutingPredictors**](RoutingApi.md#getRoutingPredictors)                                                 | Retrieve all predictors.                                                                                                           |
| [**getRoutingPredictorsKeyperformanceindicators**](RoutingApi.md#getRoutingPredictorsKeyperformanceindicators) | Get a list of Key Performance Indicators available for the predictors.                                                             |
| [**getRoutingQueue**](RoutingApi.md#getRoutingQueue)                                                           | Get details about this queue.                                                                                                      |
| [**getRoutingQueueComparisonperiod**](RoutingApi.md#getRoutingQueueComparisonperiod)                           | Get a Comparison Period.                                                                                                           |
| [**getRoutingQueueComparisonperiods**](RoutingApi.md#getRoutingQueueComparisonperiods)                         | Get list of comparison periods                                                                                                     |
| [**getRoutingQueueEstimatedwaittime**](RoutingApi.md#getRoutingQueueEstimatedwaittime)                         | Get Estimated Wait Time                                                                                                            |
| [**getRoutingQueueMediatypeEstimatedwaittime**](RoutingApi.md#getRoutingQueueMediatypeEstimatedwaittime)       | Get Estimated Wait Time                                                                                                            |
| [**getRoutingQueueMembers**](RoutingApi.md#getRoutingQueueMembers)                                             | Get the members of this queue.                                                                                                     |
| [**getRoutingQueueUsers**](RoutingApi.md#getRoutingQueueUsers)                                                 | DEPRECATED: use GET /routing/queues/{queueId}/members. Get the members of this queue.                                              |
| [**getRoutingQueueWrapupcodes**](RoutingApi.md#getRoutingQueueWrapupcodes)                                     | Get the wrap-up codes for a queue                                                                                                  |
| [**getRoutingQueues**](RoutingApi.md#getRoutingQueues)                                                         | Get list of queues.                                                                                                                |
| [**getRoutingQueuesDivisionviews**](RoutingApi.md#getRoutingQueuesDivisionviews)                               | Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).                               |
| [**getRoutingQueuesDivisionviewsAll**](RoutingApi.md#getRoutingQueuesDivisionviewsAll)                         | Get a paged listing of simplified queue objects, sorted by name. Can be used to get a digest of all queues in an organization.     |
| [**getRoutingQueuesMe**](RoutingApi.md#getRoutingQueuesMe)                                                     | Get a paged listing of queues the user is a member of.                                                                             |
| [**getRoutingSettings**](RoutingApi.md#getRoutingSettings)                                                     | Get an organization&#39;s routing settings                                                                                         |
| [**getRoutingSettingsContactcenter**](RoutingApi.md#getRoutingSettingsContactcenter)                           | Get Contact Center Settings                                                                                                        |
| [**getRoutingSettingsTranscription**](RoutingApi.md#getRoutingSettingsTranscription)                           | Get Transcription Settings                                                                                                         |
| [**getRoutingSkill**](RoutingApi.md#getRoutingSkill)                                                           | Get Routing Skill                                                                                                                  |
| [**getRoutingSkills**](RoutingApi.md#getRoutingSkills)                                                         | Get the list of routing skills.                                                                                                    |
| [**getRoutingSmsAddress**](RoutingApi.md#getRoutingSmsAddress)                                                 | Get an Address by Id for SMS                                                                                                       |
| [**getRoutingSmsAddresses**](RoutingApi.md#getRoutingSmsAddresses)                                             | Get a list of Addresses for SMS                                                                                                    |
| [**getRoutingSmsAvailablephonenumbers**](RoutingApi.md#getRoutingSmsAvailablephonenumbers)                     | Get a list of available phone numbers for SMS provisioning.                                                                        |
| [**getRoutingSmsPhonenumber**](RoutingApi.md#getRoutingSmsPhonenumber)                                         | Get a phone number provisioned for SMS.                                                                                            |
| [**getRoutingSmsPhonenumbers**](RoutingApi.md#getRoutingSmsPhonenumbers)                                       | Get a list of provisioned phone numbers.                                                                                           |
| [**getRoutingUserUtilization**](RoutingApi.md#getRoutingUserUtilization)                                       | Get the user&#39;s max utilization settings. If not configured, the organization-wide default is returned.                         |
| [**getRoutingUtilization**](RoutingApi.md#getRoutingUtilization)                                               | Get the organization-wide max utilization settings.                                                                                |
| [**getRoutingWrapupcode**](RoutingApi.md#getRoutingWrapupcode)                                                 | Get details about this wrap-up code.                                                                                               |
| [**getRoutingWrapupcodes**](RoutingApi.md#getRoutingWrapupcodes)                                               | Get list of wrapup codes.                                                                                                          |
| [**getUserQueues**](RoutingApi.md#getUserQueues)                                                               | Get queues for user                                                                                                                |
| [**getUserRoutinglanguages**](RoutingApi.md#getUserRoutinglanguages)                                           | List routing language for user                                                                                                     |
| [**getUserRoutingskills**](RoutingApi.md#getUserRoutingskills)                                                 | List routing skills for user                                                                                                       |
| [**patchRoutingConversation**](RoutingApi.md#patchRoutingConversation)                                         | Update attributes of an in-queue conversation                                                                                      |
| [**patchRoutingEmailDomain**](RoutingApi.md#patchRoutingEmailDomain)                                           | Update domain settings                                                                                                             |
| [**patchRoutingEmailDomainValidate**](RoutingApi.md#patchRoutingEmailDomainValidate)                           | Validate domain settings                                                                                                           |
| [**patchRoutingPredictor**](RoutingApi.md#patchRoutingPredictor)                                               | Update single predictor.                                                                                                           |
| [**patchRoutingQueueMember**](RoutingApi.md#patchRoutingQueueMember)                                           | Update the ring number OR joined status for a queue member.                                                                        |
| [**patchRoutingQueueMembers**](RoutingApi.md#patchRoutingQueueMembers)                                         | Join or unjoin a set of users for a queue                                                                                          |
| [**patchRoutingQueueUser**](RoutingApi.md#patchRoutingQueueUser)                                               | DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}. Update the ring number OR joined status for a User in a Queue. |
| [**patchRoutingQueueUsers**](RoutingApi.md#patchRoutingQueueUsers)                                             | DEPRECATED: use PATCH /routing/queues/{queueId}/members. Join or unjoin a set of users for a queue.                                |
| [**patchRoutingSettingsContactcenter**](RoutingApi.md#patchRoutingSettingsContactcenter)                       | Update Contact Center Settings                                                                                                     |
| [**patchUserQueue**](RoutingApi.md#patchUserQueue)                                                             | Join or unjoin a queue for a user                                                                                                  |
| [**patchUserQueues**](RoutingApi.md#patchUserQueues)                                                           | Join or unjoin a set of queues for a user                                                                                          |
| [**patchUserRoutinglanguage**](RoutingApi.md#patchUserRoutinglanguage)                                         | Update routing language proficiency or state.                                                                                      |
| [**patchUserRoutinglanguagesBulk**](RoutingApi.md#patchUserRoutinglanguagesBulk)                               | Add bulk routing language to user. Max limit 50 languages                                                                          |
| [**patchUserRoutingskillsBulk**](RoutingApi.md#patchUserRoutingskillsBulk)                                     | Bulk add routing skills to user                                                                                                    |
| [**postAnalyticsQueuesObservationsQuery**](RoutingApi.md#postAnalyticsQueuesObservationsQuery)                 | Query for queue observations                                                                                                       |
| [**postRoutingAssessments**](RoutingApi.md#postRoutingAssessments)                                             | Create a benefit assessment.                                                                                                       |
| [**postRoutingAssessmentsJobs**](RoutingApi.md#postRoutingAssessmentsJobs)                                     | Create a benefit assessment job.                                                                                                   |
| [**postRoutingEmailDomainRoutes**](RoutingApi.md#postRoutingEmailDomainRoutes)                                 | Create a route                                                                                                                     |
| [**postRoutingEmailDomainTestconnection**](RoutingApi.md#postRoutingEmailDomainTestconnection)                 | Tests the custom SMTP server integration connection set on this domain                                                             |
| [**postRoutingEmailDomains**](RoutingApi.md#postRoutingEmailDomains)                                           | Create a domain                                                                                                                    |
| [**postRoutingLanguages**](RoutingApi.md#postRoutingLanguages)                                                 | Create Language                                                                                                                    |
| [**postRoutingPredictors**](RoutingApi.md#postRoutingPredictors)                                               | Create a predictor.                                                                                                                |
| [**postRoutingQueueMembers**](RoutingApi.md#postRoutingQueueMembers)                                           | Bulk add or delete up to 100 queue members                                                                                         |
| [**postRoutingQueueUsers**](RoutingApi.md#postRoutingQueueUsers)                                               | DEPRECATED: use POST /routing/queues/{queueId}/members. Bulk add or delete up to 100 queue members.                                |
| [**postRoutingQueueWrapupcodes**](RoutingApi.md#postRoutingQueueWrapupcodes)                                   | Add up to 100 wrap-up codes to a queue                                                                                             |
| [**postRoutingQueues**](RoutingApi.md#postRoutingQueues)                                                       | Create a queue                                                                                                                     |
| [**postRoutingSkills**](RoutingApi.md#postRoutingSkills)                                                       | Create Skill                                                                                                                       |
| [**postRoutingSmsAddresses**](RoutingApi.md#postRoutingSmsAddresses)                                           | Provision an Address for SMS                                                                                                       |
| [**postRoutingSmsPhonenumbers**](RoutingApi.md#postRoutingSmsPhonenumbers)                                     | Provision a phone number for SMS                                                                                                   |
| [**postRoutingWrapupcodes**](RoutingApi.md#postRoutingWrapupcodes)                                             | Create a wrap-up code                                                                                                              |
| [**postUserRoutinglanguages**](RoutingApi.md#postUserRoutinglanguages)                                         | Add routing language to user                                                                                                       |
| [**postUserRoutingskills**](RoutingApi.md#postUserRoutingskills)                                               | Add routing skill to user                                                                                                          |
| [**putRoutingEmailDomainRoute**](RoutingApi.md#putRoutingEmailDomainRoute)                                     | Update a route                                                                                                                     |
| [**putRoutingMessageRecipient**](RoutingApi.md#putRoutingMessageRecipient)                                     | Update a recipient                                                                                                                 |
| [**putRoutingQueue**](RoutingApi.md#putRoutingQueue)                                                           | Update a queue                                                                                                                     |
| [**putRoutingSettings**](RoutingApi.md#putRoutingSettings)                                                     | Update an organization&#39;s routing settings                                                                                      |
| [**putRoutingSettingsTranscription**](RoutingApi.md#putRoutingSettingsTranscription)                           | Update Transcription Settings                                                                                                      |
| [**putRoutingSmsPhonenumber**](RoutingApi.md#putRoutingSmsPhonenumber)                                         | Update a phone number provisioned for SMS.                                                                                         |
| [**putRoutingUserUtilization**](RoutingApi.md#putRoutingUserUtilization)                                       | Update the user&#39;s max utilization settings. Include only those media types requiring custom configuration.                     |
| [**putRoutingUtilization**](RoutingApi.md#putRoutingUtilization)                                               | Update the organization-wide max utilization settings. Include only those media types requiring custom configuration.              |
| [**putRoutingWrapupcode**](RoutingApi.md#putRoutingWrapupcode)                                                 | Update wrap-up code                                                                                                                |
| [**putUserRoutingskill**](RoutingApi.md#putUserRoutingskill)                                                   | Update routing skill proficiency or state.                                                                                         |
| [**putUserRoutingskillsBulk**](RoutingApi.md#putUserRoutingskillsBulk)                                         | Replace all routing skills assigned to a user                                                                                      |

{: class="table-striped"}

<a name="deleteRoutingAssessment"></a>

# **deleteRoutingAssessment**

> Void deleteRoutingAssessment(assessmentId)

Delete single benefit assessment.

Wraps DELETE /api/v2/routing/assessments/{assessmentId}

Requires ANY permissions:

- routing:assessment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String assessmentId = "assessmentId_example"; // String | Benefit Assessment ID
try {
    apiInstance.deleteRoutingAssessment(assessmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingAssessment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description           | Notes |
| ---------------- | ---------- | --------------------- | ----- |
| **assessmentId** | **String** | Benefit Assessment ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingEmailDomain"></a>

# **deleteRoutingEmailDomain**

> Void deleteRoutingEmailDomain(domainId)

Delete a domain

Wraps DELETE /api/v2/routing/email/domains/{domainId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    apiInstance.deleteRoutingEmailDomain(domainId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **domainId** | **String** | domain ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingEmailDomainRoute"></a>

# **deleteRoutingEmailDomainRoute**

> Void deleteRoutingEmailDomainRoute(domainName, routeId)

Delete a route

Wraps DELETE /api/v2/routing/email/domains/{domainName}/routes/{routeId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    apiInstance.deleteRoutingEmailDomainRoute(domainName, routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description  | Notes |
| -------------- | ---------- | ------------ | ----- |
| **domainName** | **String** | email domain |
| **routeId**    | **String** | route ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingPredictor"></a>

# **deleteRoutingPredictor**

> Void deleteRoutingPredictor(predictorId)

Delete single predictor.

Wraps DELETE /api/v2/routing/predictors/{predictorId}

Requires ALL permissions:

- routing:predictor:delete
- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
try {
    apiInstance.deleteRoutingPredictor(predictorId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **predictorId** | **String** | Predictor ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingQueue"></a>

# **deleteRoutingQueue**

> Void deleteRoutingQueue(queueId, forceDelete)

Delete a queue

Wraps DELETE /api/v2/routing/queues/{queueId}

Requires ALL permissions:

- routing:queue:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Boolean forceDelete = true; // Boolean | forceDelete
try {
    apiInstance.deleteRoutingQueue(queueId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueue");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description | Notes      |
| --------------- | ----------- | ----------- | ---------- |
| **queueId**     | **String**  | Queue ID    |
| **forceDelete** | **Boolean** | forceDelete | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingQueueMember"></a>

# **deleteRoutingQueueMember**

> Void deleteRoutingQueueMember(queueId, memberId)

Delete a queue member.

Wraps DELETE /api/v2/routing/queues/{queueId}/members/{memberId}

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteRoutingQueueMember(queueId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueMember");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **queueId**  | **String** | Queue ID    |
| **memberId** | **String** | Member ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingQueueUser"></a>

# **deleteRoutingQueueUser**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteRoutingQueueUser(queueId, memberId)

DEPRECATED: use DELETE /routing/queues/{queueId}/members/{memberId}. Delete queue member.

Wraps DELETE /api/v2/routing/queues/{queueId}/users/{memberId}

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
try {
    apiInstance.deleteRoutingQueueUser(queueId, memberId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **queueId**  | **String** | Queue ID    |
| **memberId** | **String** | Member ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingQueueWrapupcode"></a>

# **deleteRoutingQueueWrapupcode**

> Void deleteRoutingQueueWrapupcode(queueId, codeId)

Delete a wrap-up code from a queue

Wraps DELETE /api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}

Requires ALL permissions:

- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String codeId = "codeId_example"; // String | Code ID
try {
    apiInstance.deleteRoutingQueueWrapupcode(queueId, codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingQueueWrapupcode");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **queueId** | **String** | Queue ID    |
| **codeId**  | **String** | Code ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingSettings"></a>

# **deleteRoutingSettings**

> Void deleteRoutingSettings()

Delete an organization&#39;s routing settings

Wraps DELETE /api/v2/routing/settings

Requires ANY permissions:

- routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    apiInstance.deleteRoutingSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="deleteRoutingSkill"></a>

# **deleteRoutingSkill**

> Void deleteRoutingSkill(skillId)

Delete Routing Skill

Wraps DELETE /api/v2/routing/skills/{skillId}

Requires ALL permissions:

- routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    apiInstance.deleteRoutingSkill(skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSkill");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **skillId** | **String** | Skill ID    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingSmsAddress"></a>

# **deleteRoutingSmsAddress**

> Void deleteRoutingSmsAddress(addressId)

Delete an Address by Id for SMS

Wraps DELETE /api/v2/routing/sms/addresses/{addressId}

Requires ALL permissions:

- sms:phoneNumber:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    apiInstance.deleteRoutingSmsAddress(addressId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsAddress");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **addressId** | **String** | Address ID  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingSmsPhonenumber"></a>

# **deleteRoutingSmsPhonenumber**

> Void deleteRoutingSmsPhonenumber(addressId, async)

Delete a phone number provisioned for SMS.

Wraps DELETE /api/v2/routing/sms/phonenumbers/{addressId}

Requires ALL permissions:

- sms:phoneNumber:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
Boolean async = false; // Boolean | Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number.
try {
    apiInstance.deleteRoutingSmsPhonenumber(addressId, async);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type        | Description                                                                                                                                               | Notes                         |
| ------------- | ----------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| **addressId** | **String**  | Address ID                                                                                                                                                |
| **async**     | **Boolean** | Delete a phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the deletion of a provisioned phone number. | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRoutingUserUtilization"></a>

# **deleteRoutingUserUtilization**

> Void deleteRoutingUserUtilization(userId)

Delete the user&#39;s max utilization settings and revert to the organization-wide default.

Wraps DELETE /api/v2/routing/users/{userId}/utilization

Requires ANY permissions:

- routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteRoutingUserUtilization(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUserUtilization");
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

<a name="deleteRoutingUtilization"></a>

# **deleteRoutingUtilization**

> Void deleteRoutingUtilization()

Delete the organization-wide max utilization settings and revert to the system default.

Wraps DELETE /api/v2/routing/utilization

Requires ALL permissions:

- routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    apiInstance.deleteRoutingUtilization();
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="deleteRoutingWrapupcode"></a>

# **deleteRoutingWrapupcode**

> Void deleteRoutingWrapupcode(codeId)

Delete wrap-up code

Wraps DELETE /api/v2/routing/wrapupcodes/{codeId}

Requires ALL permissions:

- routing:wrapupCode:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    apiInstance.deleteRoutingWrapupcode(codeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description    | Notes |
| ---------- | ---------- | -------------- | ----- |
| **codeId** | **String** | Wrapup Code ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteUserRoutinglanguage"></a>

# **deleteUserRoutinglanguage**

> Void deleteUserRoutinglanguage(userId, languageId)

Remove routing language from user

Wraps DELETE /api/v2/users/{userId}/routinglanguages/{languageId}

Requires ANY permissions:

- routing:skill:assign
- routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
try {
    apiInstance.deleteUserRoutinglanguage(userId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **userId**     | **String** | User ID     |
| **languageId** | **String** | languageId  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteUserRoutingskill"></a>

# **deleteUserRoutingskill**

> Void deleteUserRoutingskill(userId, skillId)

Remove routing skill from user

Wraps DELETE /api/v2/users/{userId}/routingskills/{skillId}

Requires ALL permissions:

- routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#deleteUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **userId**  | **String** | User ID     |
| **skillId** | **String** | skillId     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getRoutingAssessment"></a>

# **getRoutingAssessment**

> [BenefitAssessment](BenefitAssessment.md) getRoutingAssessment(assessmentId)

Retrieve a single benefit assessment.

Wraps GET /api/v2/routing/assessments/{assessmentId}

Requires ANY permissions:

- routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String assessmentId = "assessmentId_example"; // String | Benefit Assessment ID
try {
    BenefitAssessment result = apiInstance.getRoutingAssessment(assessmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description           | Notes |
| ---------------- | ---------- | --------------------- | ----- |
| **assessmentId** | **String** | Benefit Assessment ID |

{: class="table-striped"}

### Return type

[**BenefitAssessment**](BenefitAssessment.md)

<a name="getRoutingAssessments"></a>

# **getRoutingAssessments**

> [AssessmentListing](AssessmentListing.md) getRoutingAssessments(before, after, limit, pageSize, queueId)

Retrieve all benefit assessments.

Wraps GET /api/v2/routing/assessments

Requires ANY permissions:

- routing:queue:view
- routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList("queueId_example"); // List<String> | Queue ID(s) to filter assessments by.
try {
    AssessmentListing result = apiInstance.getRoutingAssessments(before, after, limit, pageSize, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessments");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                | Description                                                                                                        | Notes      |
| ------------ | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------ | ---------- |
| **before**   | **String**                          | The cursor that points to the start of the set of entities that has been returned.                                 | [optional] |
| **after**    | **String**                          | The cursor that points to the end of the set of entities that has been returned.                                   | [optional] |
| **limit**    | **String**                          | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional] |
| **pageSize** | **String**                          | Number of entities to return. Maximum of 200.                                                                      | [optional] |
| **queueId**  | [**List&lt;String&gt;**](String.md) | Queue ID(s) to filter assessments by.                                                                              | [optional] |

{: class="table-striped"}

### Return type

[**AssessmentListing**](AssessmentListing.md)

<a name="getRoutingAssessmentsJob"></a>

# **getRoutingAssessmentsJob**

> [BenefitAssessmentJob](BenefitAssessmentJob.md) getRoutingAssessmentsJob(jobId)

Retrieve a single benefit assessments job.

Wraps GET /api/v2/routing/assessments/jobs/{jobId}

Requires ANY permissions:

- routing:assessment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String jobId = "jobId_example"; // String | Benefit Assessment Job ID
try {
    BenefitAssessmentJob result = apiInstance.getRoutingAssessmentsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessmentsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description               | Notes |
| --------- | ---------- | ------------------------- | ----- |
| **jobId** | **String** | Benefit Assessment Job ID |

{: class="table-striped"}

### Return type

[**BenefitAssessmentJob**](BenefitAssessmentJob.md)

<a name="getRoutingAssessmentsJobs"></a>

# **getRoutingAssessmentsJobs**

> [AssessmentJobListing](AssessmentJobListing.md) getRoutingAssessmentsJobs(divisionId)

Retrieve all benefit assessment jobs.

Wraps GET /api/v2/routing/assessments/jobs

Requires ANY permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s) to filter assessment jobs by.
try {
    AssessmentJobListing result = apiInstance.getRoutingAssessmentsJobs(divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingAssessmentsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                  | Notes      |
| -------------- | ----------------------------------- | -------------------------------------------- | ---------- |
| **divisionId** | [**List&lt;String&gt;**](String.md) | Division ID(s) to filter assessment jobs by. | [optional] |

{: class="table-striped"}

### Return type

[**AssessmentJobListing**](AssessmentJobListing.md)

<a name="getRoutingEmailDomain"></a>

# **getRoutingEmailDomain**

> [InboundDomain](InboundDomain.md) getRoutingEmailDomain(domainId)

Get domain

Wraps GET /api/v2/routing/email/domains/{domainId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
try {
    InboundDomain result = apiInstance.getRoutingEmailDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **domainId** | **String** | domain ID   |

{: class="table-striped"}

### Return type

[**InboundDomain**](InboundDomain.md)

<a name="getRoutingEmailDomainRoute"></a>

# **getRoutingEmailDomainRoute**

> [InboundRoute](InboundRoute.md) getRoutingEmailDomainRoute(domainName, routeId)

Get a route

Wraps GET /api/v2/routing/email/domains/{domainName}/routes/{routeId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
try {
    InboundRoute result = apiInstance.getRoutingEmailDomainRoute(domainName, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description  | Notes |
| -------------- | ---------- | ------------ | ----- |
| **domainName** | **String** | email domain |
| **routeId**    | **String** | route ID     |

{: class="table-striped"}

### Return type

[**InboundRoute**](InboundRoute.md)

<a name="getRoutingEmailDomainRoutes"></a>

# **getRoutingEmailDomainRoutes**

> [InboundRouteEntityListing](InboundRouteEntityListing.md) getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern)

Get routes

Wraps GET /api/v2/routing/email/domains/{domainName}/routes

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String pattern = "pattern_example"; // String | Filter routes by the route's pattern property
try {
    InboundRouteEntityListing result = apiInstance.getRoutingEmailDomainRoutes(domainName, pageSize, pageNumber, pattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                       | Notes                      |
| -------------- | ----------- | ------------------------------------------------- | -------------------------- |
| **domainName** | **String**  | email domain                                      |
| **pageSize**   | **Integer** | Page size                                         | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number                                       | [optional] [default to 1]  |
| **pattern**    | **String**  | Filter routes by the route&#39;s pattern property | [optional]                 |

{: class="table-striped"}

### Return type

[**InboundRouteEntityListing**](InboundRouteEntityListing.md)

<a name="getRoutingEmailDomains"></a>

# **getRoutingEmailDomains**

> [InboundDomainEntityListing](InboundDomainEntityListing.md) getRoutingEmailDomains()

Get domains

Wraps GET /api/v2/routing/email/domains

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    InboundDomainEntityListing result = apiInstance.getRoutingEmailDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**InboundDomainEntityListing**](InboundDomainEntityListing.md)

<a name="getRoutingEmailSetup"></a>

# **getRoutingEmailSetup**

> [EmailSetup](EmailSetup.md) getRoutingEmailSetup()

Get email setup

Wraps GET /api/v2/routing/email/setup

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    EmailSetup result = apiInstance.getRoutingEmailSetup();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingEmailSetup");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EmailSetup**](EmailSetup.md)

<a name="getRoutingLanguages"></a>

# **getRoutingLanguages**

> [LanguageEntityListing](LanguageEntityListing.md) getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id)

Get the list of supported languages.

Wraps GET /api/v2/routing/languages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    LanguageEntityListing result = apiInstance.getRoutingLanguages(pageSize, pageNumber, sortOrder, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                        | Notes                                                              |
| -------------- | ----------------------------------- | ---------------------------------- | ------------------------------------------------------------------ |
| **pageSize**   | **Integer**                         | Page size                          | [optional] [default to 25]                                         |
| **pageNumber** | **Integer**                         | Page number                        | [optional] [default to 1]                                          |
| **sortOrder**  | **String**                          | Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending |
| **name**       | **String**                          | Name                               | [optional]                                                         |
| **id**         | [**List&lt;String&gt;**](String.md) | id                                 | [optional]                                                         |

{: class="table-striped"}

### Return type

[**LanguageEntityListing**](LanguageEntityListing.md)

<a name="getRoutingMessageRecipient"></a>

# **getRoutingMessageRecipient**

> [Recipient](Recipient.md) getRoutingMessageRecipient(recipientId)

Get a recipient

Wraps GET /api/v2/routing/message/recipients/{recipientId}

Requires ALL permissions:

- routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
try {
    Recipient result = apiInstance.getRoutingMessageRecipient(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **recipientId** | **String** | Recipient ID |

{: class="table-striped"}

### Return type

[**Recipient**](Recipient.md)

<a name="getRoutingMessageRecipients"></a>

# **getRoutingMessageRecipients**

> [RecipientListing](RecipientListing.md) getRoutingMessageRecipients(messengerType, pageSize, pageNumber)

Get recipients

Wraps GET /api/v2/routing/message/recipients

Requires ALL permissions:

- routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    RecipientListing result = apiInstance.getRoutingMessageRecipients(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingMessageRecipients");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description    | Notes                                                                               |
| ----------------- | ----------- | -------------- | ----------------------------------------------------------------------------------- |
| **messengerType** | **String**  | Messenger Type | [optional]<br />**Values**: sms, facebook, twitter, line, whatsapp, open, instagram |
| **pageSize**      | **Integer** | Page size      | [optional] [default to 25]                                                          |
| **pageNumber**    | **Integer** | Page number    | [optional] [default to 1]                                                           |

{: class="table-striped"}

### Return type

[**RecipientListing**](RecipientListing.md)

<a name="getRoutingPredictor"></a>

# **getRoutingPredictor**

> [Predictor](Predictor.md) getRoutingPredictor(predictorId)

Retrieve a single predictor.

Wraps GET /api/v2/routing/predictors/{predictorId}

Requires ANY permissions:

- routing:predictor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
try {
    Predictor result = apiInstance.getRoutingPredictor(predictorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **predictorId** | **String** | Predictor ID |

{: class="table-striped"}

### Return type

[**Predictor**](Predictor.md)

<a name="getRoutingPredictors"></a>

# **getRoutingPredictors**

> [PredictorListing](PredictorListing.md) getRoutingPredictors(before, after, limit, pageSize, queueId)

Retrieve all predictors.

Wraps GET /api/v2/routing/predictors

Requires ANY permissions:

- routing:predictor:view
- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
List<String> queueId = Arrays.asList("queueId_example"); // List<String> | Comma-separated list of queue Ids to filter by.
try {
    PredictorListing result = apiInstance.getRoutingPredictors(before, after, limit, pageSize, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictors");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                | Description                                                                                                        | Notes      |
| ------------ | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------ | ---------- |
| **before**   | **String**                          | The cursor that points to the start of the set of entities that has been returned.                                 | [optional] |
| **after**    | **String**                          | The cursor that points to the end of the set of entities that has been returned.                                   | [optional] |
| **limit**    | **String**                          | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional] |
| **pageSize** | **String**                          | Number of entities to return. Maximum of 200.                                                                      | [optional] |
| **queueId**  | [**List&lt;String&gt;**](String.md) | Comma-separated list of queue Ids to filter by.                                                                    | [optional] |

{: class="table-striped"}

### Return type

[**PredictorListing**](PredictorListing.md)

<a name="getRoutingPredictorsKeyperformanceindicators"></a>

# **getRoutingPredictorsKeyperformanceindicators**

> [List&lt;KeyPerformanceIndicator&gt;](KeyPerformanceIndicator.md) getRoutingPredictorsKeyperformanceindicators()

Get a list of Key Performance Indicators available for the predictors.

Wraps GET /api/v2/routing/predictors/keyperformanceindicators

Requires ANY permissions:

- routing:keyPerformanceIndicator:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    List<KeyPerformanceIndicator> result = apiInstance.getRoutingPredictorsKeyperformanceindicators();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingPredictorsKeyperformanceindicators");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**List&lt;KeyPerformanceIndicator&gt;**](KeyPerformanceIndicator.md)

<a name="getRoutingQueue"></a>

# **getRoutingQueue**

> [Queue](Queue.md) getRoutingQueue(queueId)

Get details about this queue.

Wraps GET /api/v2/routing/queues/{queueId}

Requires ALL permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
try {
    Queue result = apiInstance.getRoutingQueue(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueue");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **queueId** | **String** | Queue ID    |

{: class="table-striped"}

### Return type

[**Queue**](Queue.md)

<a name="getRoutingQueueComparisonperiod"></a>

# **getRoutingQueueComparisonperiod**

> [ComparisonPeriod](ComparisonPeriod.md) getRoutingQueueComparisonperiod(queueId, comparisonPeriodId)

Get a Comparison Period.

Wraps GET /api/v2/routing/queues/{queueId}/comparisonperiods/{comparisonPeriodId}

Requires ALL permissions:

- routing:comparisonPeriod:view
- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue id
String comparisonPeriodId = "comparisonPeriodId_example"; // String | ComparisonPeriod id
try {
    ComparisonPeriod result = apiInstance.getRoutingQueueComparisonperiod(queueId, comparisonPeriodId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueComparisonperiod");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description         | Notes |
| ---------------------- | ---------- | ------------------- | ----- |
| **queueId**            | **String** | Queue id            |
| **comparisonPeriodId** | **String** | ComparisonPeriod id |

{: class="table-striped"}

### Return type

[**ComparisonPeriod**](ComparisonPeriod.md)

<a name="getRoutingQueueComparisonperiods"></a>

# **getRoutingQueueComparisonperiods**

> [ComparisonPeriodListing](ComparisonPeriodListing.md) getRoutingQueueComparisonperiods(queueId)

Get list of comparison periods

Wraps GET /api/v2/routing/queues/{queueId}/comparisonperiods

Requires ALL permissions:

- routing:comparisonPeriod:view
- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue id
try {
    ComparisonPeriodListing result = apiInstance.getRoutingQueueComparisonperiods(queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueComparisonperiods");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **queueId** | **String** | Queue id    |

{: class="table-striped"}

### Return type

[**ComparisonPeriodListing**](ComparisonPeriodListing.md)

<a name="getRoutingQueueEstimatedwaittime"></a>

# **getRoutingQueueEstimatedwaittime**

> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.md) getRoutingQueueEstimatedwaittime(queueId, conversationId)

Get Estimated Wait Time

Wraps GET /api/v2/routing/queues/{queueId}/estimatedwaittime

Requires ALL permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String conversationId = "conversationId_example"; // String | conversationId
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueEstimatedwaittime(queueId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes      |
| ------------------ | ---------- | -------------- | ---------- |
| **queueId**        | **String** | queueId        |
| **conversationId** | **String** | conversationId | [optional] |

{: class="table-striped"}

### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.md)

<a name="getRoutingQueueMediatypeEstimatedwaittime"></a>

# **getRoutingQueueMediatypeEstimatedwaittime**

> [EstimatedWaitTimePredictions](EstimatedWaitTimePredictions.md) getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType)

Get Estimated Wait Time

Wraps GET /api/v2/routing/queues/{queueId}/mediatypes/{mediaType}/estimatedwaittime

Requires ALL permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | queueId
String mediaType = "mediaType_example"; // String | mediaType
try {
    EstimatedWaitTimePredictions result = apiInstance.getRoutingQueueMediatypeEstimatedwaittime(queueId, mediaType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueMediatypeEstimatedwaittime");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **queueId**   | **String** | queueId     |
| **mediaType** | **String** | mediaType   |

{: class="table-striped"}

### Return type

[**EstimatedWaitTimePredictions**](EstimatedWaitTimePredictions.md)

<a name="getRoutingQueueMembers"></a>

# **getRoutingQueueMembers**

> [QueueMemberEntityListing](QueueMemberEntityListing.md) getRoutingQueueMembers(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined)

Get the members of this queue.

Wraps GET /api/v2/routing/queues/{queueId}/members

Requires ANY permissions:

- routing:queue:view
- routing:queue:edit
- routing:queue:readonly
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageNumber = 1; // Integer |
Integer pageSize = 25; // Integer | Max value is 100
String sortOrder = "asc"; // String | Note: results are sorted by name.
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList("profileSkills_example"); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList("skills_example"); // List<String> | Filter by skill
List<String> languages = Arrays.asList("languages_example"); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList("routingStatus_example"); // List<String> | Filter by routing status
List<String> presence = Arrays.asList("presence_example"); // List<String> | Filter by presence
String memberBy = "memberBy_example"; // String | Filter by member type
Boolean joined = true; // Boolean | Filter by joined status
try {
    QueueMemberEntityListing result = apiInstance.getRoutingQueueMembers(queueId, pageNumber, pageSize, sortOrder, expand, name, profileSkills, skills, languages, routingStatus, presence, memberBy, joined);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                       | Notes                                                                                                                                                                                                                                                                                                         |
| ----------------- | ----------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **queueId**       | **String**                          | Queue ID                          |
| **pageNumber**    | **Integer**                         |                                   | [optional] [default to 1]                                                                                                                                                                                                                                                                                     |
| **pageSize**      | **Integer**                         | Max value is 100                  | [optional] [default to 25]                                                                                                                                                                                                                                                                                    |
| **sortOrder**     | **String**                          | Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc                                                                                                                                                                                                                                                        |
| **expand**        | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.  | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |
| **name**          | **String**                          | Filter by queue member name       | [optional]                                                                                                                                                                                                                                                                                                    |
| **profileSkills** | [**List&lt;String&gt;**](String.md) | Filter by profile skill           | [optional]                                                                                                                                                                                                                                                                                                    |
| **skills**        | [**List&lt;String&gt;**](String.md) | Filter by skill                   | [optional]                                                                                                                                                                                                                                                                                                    |
| **languages**     | [**List&lt;String&gt;**](String.md) | Filter by language                | [optional]                                                                                                                                                                                                                                                                                                    |
| **routingStatus** | [**List&lt;String&gt;**](String.md) | Filter by routing status          | [optional]                                                                                                                                                                                                                                                                                                    |
| **presence**      | [**List&lt;String&gt;**](String.md) | Filter by presence                | [optional]                                                                                                                                                                                                                                                                                                    |
| **memberBy**      | **String**                          | Filter by member type             | [optional]<br />**Values**: user, group                                                                                                                                                                                                                                                                       |
| **joined**        | **Boolean**                         | Filter by joined status           | [optional]                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.md)

<a name="getRoutingQueueUsers"></a>

# **getRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1.md) getRoutingQueueUsers(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence)

DEPRECATED: use GET /routing/queues/{queueId}/members. Get the members of this queue.

Wraps GET /api/v2/routing/queues/{queueId}/users

Requires ANY permissions:

- routing:queue:view
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageNumber = 1; // Integer |
Integer pageSize = 25; // Integer | Max value is 100
String sortOrder = "asc"; // String | Note: results are sorted by name.
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
Boolean joined = true; // Boolean | Filter by joined status
String name = "name_example"; // String | Filter by queue member name
List<String> profileSkills = Arrays.asList("profileSkills_example"); // List<String> | Filter by profile skill
List<String> skills = Arrays.asList("skills_example"); // List<String> | Filter by skill
List<String> languages = Arrays.asList("languages_example"); // List<String> | Filter by language
List<String> routingStatus = Arrays.asList("routingStatus_example"); // List<String> | Filter by routing status
List<String> presence = Arrays.asList("presence_example"); // List<String> | Filter by presence
try {
    QueueMemberEntityListingV1 result = apiInstance.getRoutingQueueUsers(queueId, pageNumber, pageSize, sortOrder, expand, joined, name, profileSkills, skills, languages, routingStatus, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                       | Notes                                                                                                                                                                                                                                                                                                         |
| ----------------- | ----------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **queueId**       | **String**                          | Queue ID                          |
| **pageNumber**    | **Integer**                         |                                   | [optional] [default to 1]                                                                                                                                                                                                                                                                                     |
| **pageSize**      | **Integer**                         | Max value is 100                  | [optional] [default to 25]                                                                                                                                                                                                                                                                                    |
| **sortOrder**     | **String**                          | Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc                                                                                                                                                                                                                                                        |
| **expand**        | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.  | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |
| **joined**        | **Boolean**                         | Filter by joined status           | [optional]                                                                                                                                                                                                                                                                                                    |
| **name**          | **String**                          | Filter by queue member name       | [optional]                                                                                                                                                                                                                                                                                                    |
| **profileSkills** | [**List&lt;String&gt;**](String.md) | Filter by profile skill           | [optional]                                                                                                                                                                                                                                                                                                    |
| **skills**        | [**List&lt;String&gt;**](String.md) | Filter by skill                   | [optional]                                                                                                                                                                                                                                                                                                    |
| **languages**     | [**List&lt;String&gt;**](String.md) | Filter by language                | [optional]                                                                                                                                                                                                                                                                                                    |
| **routingStatus** | [**List&lt;String&gt;**](String.md) | Filter by routing status          | [optional]                                                                                                                                                                                                                                                                                                    |
| **presence**      | [**List&lt;String&gt;**](String.md) | Filter by presence                | [optional]                                                                                                                                                                                                                                                                                                    |

{: class="table-striped"}

### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1.md)

<a name="getRoutingQueueWrapupcodes"></a>

# **getRoutingQueueWrapupcodes**

> [WrapupCodeEntityListing](WrapupCodeEntityListing.md) getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber)

Get the wrap-up codes for a queue

Wraps GET /api/v2/routing/queues/{queueId}/wrapupcodes

Requires ALL permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingQueueWrapupcodes(queueId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueueWrapupcodes");
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

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.md)

<a name="getRoutingQueues"></a>

# **getRoutingQueues**

> [QueueEntityListing](QueueEntityListing.md) getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId)

Get list of queues.

Wraps GET /api/v2/routing/queues

Requires ANY permissions:

- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortOrder = "asc"; // String | Note: results are sorted by name.
String name = "name_example"; // String | Filter by queue name
List<String> id = Arrays.asList("id_example"); // List<String> | Filter by queue ID(s)
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Filter by queue division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueues(pageNumber, pageSize, sortOrder, name, id, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueues");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                       | Notes                                                  |
| -------------- | ----------------------------------- | --------------------------------- | ------------------------------------------------------ |
| **pageNumber** | **Integer**                         | Page number                       | [optional] [default to 1]                              |
| **pageSize**   | **Integer**                         | Page size                         | [optional] [default to 25]                             |
| **sortOrder**  | **String**                          | Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc |
| **name**       | **String**                          | Filter by queue name              | [optional]                                             |
| **id**         | [**List&lt;String&gt;**](String.md) | Filter by queue ID(s)             | [optional]                                             |
| **divisionId** | [**List&lt;String&gt;**](String.md) | Filter by queue division ID(s)    | [optional]                                             |

{: class="table-striped"}

### Return type

[**QueueEntityListing**](QueueEntityListing.md)

<a name="getRoutingQueuesDivisionviews"></a>

# **getRoutingQueuesDivisionviews**

> [QueueEntityListing](QueueEntityListing.md) getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId)

Get a paged listing of simplified queue objects, filterable by name, queue ID(s), or division ID(s).

Wraps GET /api/v2/routing/queues/divisionviews

Requires ALL permissions:

- routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 100]
Integer pageNumber = 1; // Integer | Page number [max value is 5]
String sortBy = "name"; // String | Sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Name
List<String> id = Arrays.asList("id_example"); // List<String> | Queue ID(s)
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviews(pageSize, pageNumber, sortBy, sortOrder, name, id, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviews");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                  | Notes                                                              |
| -------------- | ----------------------------------- | ---------------------------- | ------------------------------------------------------------------ |
| **pageSize**   | **Integer**                         | Page size [max value is 100] | [optional] [default to 25]                                         |
| **pageNumber** | **Integer**                         | Page number [max value is 5] | [optional] [default to 1]                                          |
| **sortBy**     | **String**                          | Sort by                      | [optional] [default to name]<br />**Values**: name, id, divisionId |
| **sortOrder**  | **String**                          | Sort order                   | [optional] [default to asc]<br />**Values**: asc, desc             |
| **name**       | **String**                          | Name                         | [optional]                                                         |
| **id**         | [**List&lt;String&gt;**](String.md) | Queue ID(s)                  | [optional]                                                         |
| **divisionId** | [**List&lt;String&gt;**](String.md) | Division ID(s)               | [optional]                                                         |

{: class="table-striped"}

### Return type

[**QueueEntityListing**](QueueEntityListing.md)

<a name="getRoutingQueuesDivisionviewsAll"></a>

# **getRoutingQueuesDivisionviewsAll**

> [QueueEntityListing](QueueEntityListing.md) getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortOrder)

Get a paged listing of simplified queue objects, sorted by name. Can be used to get a digest of all queues in an organization.

Wraps GET /api/v2/routing/queues/divisionviews/all

Requires ALL permissions:

- routing:queue:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size [max value is 500]
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "asc"; // String | Sort order
try {
    QueueEntityListing result = apiInstance.getRoutingQueuesDivisionviewsAll(pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesDivisionviewsAll");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                  | Notes                                                  |
| -------------- | ----------- | ---------------------------- | ------------------------------------------------------ |
| **pageSize**   | **Integer** | Page size [max value is 500] | [optional] [default to 25]                             |
| **pageNumber** | **Integer** | Page number                  | [optional] [default to 1]                              |
| **sortOrder**  | **String**  | Sort order                   | [optional] [default to asc]<br />**Values**: asc, desc |

{: class="table-striped"}

### Return type

[**QueueEntityListing**](QueueEntityListing.md)

<a name="getRoutingQueuesMe"></a>

# **getRoutingQueuesMe**

> [UserQueueEntityListing](UserQueueEntityListing.md) getRoutingQueuesMe(pageNumber, pageSize, joined, sortOrder)

Get a paged listing of queues the user is a member of.

Wraps GET /api/v2/routing/queues/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
Boolean joined = true; // Boolean | Filter by joined status.
String sortOrder = "asc"; // String | Note: results are sorted by name.
try {
    UserQueueEntityListing result = apiInstance.getRoutingQueuesMe(pageNumber, pageSize, joined, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingQueuesMe");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                       | Notes                                                  |
| -------------- | ----------- | --------------------------------- | ------------------------------------------------------ |
| **pageNumber** | **Integer** | Page number                       | [optional] [default to 1]                              |
| **pageSize**   | **Integer** | Page size                         | [optional] [default to 25]                             |
| **joined**     | **Boolean** | Filter by joined status.          | [optional]                                             |
| **sortOrder**  | **String**  | Note: results are sorted by name. | [optional] [default to asc]<br />**Values**: asc, desc |

{: class="table-striped"}

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.md)

<a name="getRoutingSettings"></a>

# **getRoutingSettings**

> [RoutingSettings](RoutingSettings.md) getRoutingSettings()

Get an organization&#39;s routing settings

Wraps GET /api/v2/routing/settings

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    RoutingSettings result = apiInstance.getRoutingSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**RoutingSettings**](RoutingSettings.md)

<a name="getRoutingSettingsContactcenter"></a>

# **getRoutingSettingsContactcenter**

> [ContactCenterSettings](ContactCenterSettings.md) getRoutingSettingsContactcenter()

Get Contact Center Settings

Wraps GET /api/v2/routing/settings/contactcenter

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    ContactCenterSettings result = apiInstance.getRoutingSettingsContactcenter();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettingsContactcenter");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ContactCenterSettings**](ContactCenterSettings.md)

<a name="getRoutingSettingsTranscription"></a>

# **getRoutingSettingsTranscription**

> [TranscriptionSettings](TranscriptionSettings.md) getRoutingSettingsTranscription()

Get Transcription Settings

Wraps GET /api/v2/routing/settings/transcription

Requires ANY permissions:

- routing:transcriptionSettings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    TranscriptionSettings result = apiInstance.getRoutingSettingsTranscription();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSettingsTranscription");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**TranscriptionSettings**](TranscriptionSettings.md)

<a name="getRoutingSkill"></a>

# **getRoutingSkill**

> [RoutingSkill](RoutingSkill.md) getRoutingSkill(skillId)

Get Routing Skill

Wraps GET /api/v2/routing/skills/{skillId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String skillId = "skillId_example"; // String | Skill ID
try {
    RoutingSkill result = apiInstance.getRoutingSkill(skillId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkill");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **skillId** | **String** | Skill ID    |

{: class="table-striped"}

### Return type

[**RoutingSkill**](RoutingSkill.md)

<a name="getRoutingSkills"></a>

# **getRoutingSkills**

> [SkillEntityListing](SkillEntityListing.md) getRoutingSkills(pageSize, pageNumber, name, id)

Get the list of routing skills.

Wraps GET /api/v2/routing/skills

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Filter for results that start with this value
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    SkillEntityListing result = apiInstance.getRoutingSkills(pageSize, pageNumber, name, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSkills");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                   | Notes                      |
| -------------- | ----------------------------------- | --------------------------------------------- | -------------------------- |
| **pageSize**   | **Integer**                         | Page size                                     | [optional] [default to 25] |
| **pageNumber** | **Integer**                         | Page number                                   | [optional] [default to 1]  |
| **name**       | **String**                          | Filter for results that start with this value | [optional]                 |
| **id**         | [**List&lt;String&gt;**](String.md) | id                                            | [optional]                 |

{: class="table-striped"}

### Return type

[**SkillEntityListing**](SkillEntityListing.md)

<a name="getRoutingSmsAddress"></a>

# **getRoutingSmsAddress**

> [SmsAddress](SmsAddress.md) getRoutingSmsAddress(addressId)

Get an Address by Id for SMS

Wraps GET /api/v2/routing/sms/addresses/{addressId}

Requires ALL permissions:

- sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    SmsAddress result = apiInstance.getRoutingSmsAddress(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAddress");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **addressId** | **String** | Address ID  |

{: class="table-striped"}

### Return type

[**SmsAddress**](SmsAddress.md)

<a name="getRoutingSmsAddresses"></a>

# **getRoutingSmsAddresses**

> [SmsAddressEntityListing](SmsAddressEntityListing.md) getRoutingSmsAddresses(pageSize, pageNumber)

Get a list of Addresses for SMS

Wraps GET /api/v2/routing/sms/addresses

Requires ALL permissions:

- sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SmsAddressEntityListing result = apiInstance.getRoutingSmsAddresses(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAddresses");
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

[**SmsAddressEntityListing**](SmsAddressEntityListing.md)

<a name="getRoutingSmsAvailablephonenumbers"></a>

# **getRoutingSmsAvailablephonenumbers**

> [SMSAvailablePhoneNumberEntityListing](SMSAvailablePhoneNumberEntityListing.md) getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement)

Get a list of available phone numbers for SMS provisioning.

This request will return up to 30 random phone numbers matching the criteria specified. To get additional phone numbers repeat the request.

Wraps GET /api/v2/routing/sms/availablephonenumbers

Requires ALL permissions:

- sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String countryCode = "countryCode_example"; // String | The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned
String phoneNumberType = "phoneNumberType_example"; // String | Type of available phone numbers searched
String region = "region_example"; // String | Region/province/state that can be used to restrict the numbers returned
String city = "city_example"; // String | City that can be used to restrict the numbers returned
String areaCode = "areaCode_example"; // String | Area code that can be used to restrict the numbers returned
String pattern = "pattern_example"; // String | A pattern to match phone numbers. Valid characters are '*' and [0-9a-zA-Z]. The '*' character will match any single digit.
String addressRequirement = "addressRequirement_example"; // String | This indicates whether the phone number requires to have an Address registered.
try {
    SMSAvailablePhoneNumberEntityListing result = apiInstance.getRoutingSmsAvailablephonenumbers(countryCode, phoneNumberType, region, city, areaCode, pattern, addressRequirement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsAvailablephonenumbers");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description                                                                                                                                | Notes                                                 |
| ---------------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------- |
| **countryCode**        | **String** | The ISO 3166-1 alpha-2 country code of the county for which available phone numbers should be returned                                     |
| **phoneNumberType**    | **String** | Type of available phone numbers searched                                                                                                   | <br />**Values**: local, mobile, tollfree             |
| **region**             | **String** | Region/province/state that can be used to restrict the numbers returned                                                                    | [optional]                                            |
| **city**               | **String** | City that can be used to restrict the numbers returned                                                                                     | [optional]                                            |
| **areaCode**           | **String** | Area code that can be used to restrict the numbers returned                                                                                | [optional]                                            |
| **pattern**            | **String** | A pattern to match phone numbers. Valid characters are &#39;_&#39; and [0-9a-zA-Z]. The &#39;_&#39; character will match any single digit. | [optional]                                            |
| **addressRequirement** | **String** | This indicates whether the phone number requires to have an Address registered.                                                            | [optional]<br />**Values**: none, any, local, foreign |

{: class="table-striped"}

### Return type

[**SMSAvailablePhoneNumberEntityListing**](SMSAvailablePhoneNumberEntityListing.md)

<a name="getRoutingSmsPhonenumber"></a>

# **getRoutingSmsPhonenumber**

> [SmsPhoneNumber](SmsPhoneNumber.md) getRoutingSmsPhonenumber(addressId)

Get a phone number provisioned for SMS.

Wraps GET /api/v2/routing/sms/phonenumbers/{addressId}

Requires ALL permissions:

- sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
try {
    SmsPhoneNumber result = apiInstance.getRoutingSmsPhonenumber(addressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **addressId** | **String** | Address ID  |

{: class="table-striped"}

### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.md)

<a name="getRoutingSmsPhonenumbers"></a>

# **getRoutingSmsPhonenumbers**

> [SmsPhoneNumberEntityListing](SmsPhoneNumberEntityListing.md) getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language)

Get a list of provisioned phone numbers.

Wraps GET /api/v2/routing/sms/phonenumbers

Requires ALL permissions:

- sms:phoneNumber:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String phoneNumber = "phoneNumber_example"; // String | Filter on phone number address. Allowable characters are the digits '0-9' and the wild card character '\\*'. If just digits are present, a contains search is done on the address pattern. For example, '317' could be matched anywhere in the address. An '\\*' will match multiple digits. For example, to match a specific area code within the US a pattern like '1317*' could be used.
List<String> phoneNumberType = Arrays.asList("phoneNumberType_example"); // List<String> | Filter on phone number type
List<String> phoneNumberStatus = Arrays.asList("phoneNumberStatus_example"); // List<String> | Filter on phone number status
List<String> countryCode = Arrays.asList("countryCode_example"); // List<String> | Filter on country code
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | Optional field to sort results
String sortOrder = "sortOrder_example"; // String | Sort order
String language = "en-US"; // String | A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize country field and sort operations
try {
    SmsPhoneNumberEntityListing result = apiInstance.getRoutingSmsPhonenumbers(phoneNumber, phoneNumberType, phoneNumberStatus, countryCode, pageSize, pageNumber, sortBy, sortOrder, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                | Description                                                                                                                                                                                                                                                                                                                                                                                                                          | Notes                                                                                                                                                    |
| --------------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **phoneNumber**       | **String**                          | Filter on phone number address. Allowable characters are the digits &#39;0-9&#39; and the wild card character &#39;\\_&#39;. If just digits are present, a contains search is done on the address pattern. For example, &#39;317&#39; could be matched anywhere in the address. An &#39;\\_&#39; will match multiple digits. For example, to match a specific area code within the US a pattern like &#39;1317\*&#39; could be used. | [optional]                                                                                                                                               |
| **phoneNumberType**   | [**List&lt;String&gt;**](String.md) | Filter on phone number type                                                                                                                                                                                                                                                                                                                                                                                                          | [optional]<br />**Values**: local, mobile, tollfree, shortcode                                                                                           |
| **phoneNumberStatus** | [**List&lt;String&gt;**](String.md) | Filter on phone number status                                                                                                                                                                                                                                                                                                                                                                                                        | [optional]<br />**Values**: active, invalid, initiated, porting, pending, pending-cancellation                                                           |
| **countryCode**       | [**List&lt;String&gt;**](String.md) | Filter on country code                                                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                                                                                                               |
| **pageSize**          | **Integer**                         | Page size                                                                                                                                                                                                                                                                                                                                                                                                                            | [optional] [default to 25]                                                                                                                               |
| **pageNumber**        | **Integer**                         | Page number                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [default to 1]                                                                                                                                |
| **sortBy**            | **String**                          | Optional field to sort results                                                                                                                                                                                                                                                                                                                                                                                                       | [optional]<br />**Values**: phoneNumber, countryCode, country, phoneNumberStatus, phoneNumberType, purchaseDate, supportsMms, supportsSms, supportsVoice |
| **sortOrder**         | **String**                          | Sort order                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]<br />**Values**: ascending, descending                                                                                                        |
| **language**          | **String**                          | A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize country field and sort operations                                                                                                                                                                                                                                                                                            | [optional] [default to en-US]                                                                                                                            |

{: class="table-striped"}

### Return type

[**SmsPhoneNumberEntityListing**](SmsPhoneNumberEntityListing.md)

<a name="getRoutingUserUtilization"></a>

# **getRoutingUserUtilization**

> [AgentMaxUtilization](AgentMaxUtilization.md) getRoutingUserUtilization(userId)

Get the user&#39;s max utilization settings. If not configured, the organization-wide default is returned.

Wraps GET /api/v2/routing/users/{userId}/utilization

Requires ANY permissions:

- routing:utilization:manage
- routing:utilization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
try {
    AgentMaxUtilization result = apiInstance.getRoutingUserUtilization(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**AgentMaxUtilization**](AgentMaxUtilization.md)

<a name="getRoutingUtilization"></a>

# **getRoutingUtilization**

> [Utilization](Utilization.md) getRoutingUtilization()

Get the organization-wide max utilization settings.

Wraps GET /api/v2/routing/utilization

Requires ANY permissions:

- routing:utilization:manage
- routing:utilization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
try {
    Utilization result = apiInstance.getRoutingUtilization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Utilization**](Utilization.md)

<a name="getRoutingWrapupcode"></a>

# **getRoutingWrapupcode**

> [WrapupCode](WrapupCode.md) getRoutingWrapupcode(codeId)

Get details about this wrap-up code.

Wraps GET /api/v2/routing/wrapupcodes/{codeId}

Requires ALL permissions:

- routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
try {
    WrapupCode result = apiInstance.getRoutingWrapupcode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description    | Notes |
| ---------- | ---------- | -------------- | ----- |
| **codeId** | **String** | Wrapup Code ID |

{: class="table-striped"}

### Return type

[**WrapupCode**](WrapupCode.md)

<a name="getRoutingWrapupcodes"></a>

# **getRoutingWrapupcodes**

> [WrapupCodeEntityListing](WrapupCodeEntityListing.md) getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name)

Get list of wrapup codes.

Wraps GET /api/v2/routing/wrapupcodes

Requires ALL permissions:

- routing:wrapupCode:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "ascending"; // String | Sort order
String name = "name_example"; // String | Wrapup code's name ('Sort by' param is ignored unless this field is provided)
try {
    WrapupCodeEntityListing result = apiInstance.getRoutingWrapupcodes(pageSize, pageNumber, sortBy, sortOrder, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                                                               | Notes                                                                    |
| -------------- | ----------- | ----------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| **pageSize**   | **Integer** | Page size                                                                                 | [optional] [default to 25]                                               |
| **pageNumber** | **Integer** | Page number                                                                               | [optional] [default to 1]                                                |
| **sortBy**     | **String**  | Sort by                                                                                   | [optional] [default to name]<br />**Values**: name, id                   |
| **sortOrder**  | **String**  | Sort order                                                                                | [optional] [default to ascending]<br />**Values**: ascending, descending |
| **name**       | **String**  | Wrapup code&#39;s name (&#39;Sort by&#39; param is ignored unless this field is provided) | [optional]                                                               |

{: class="table-striped"}

### Return type

[**WrapupCodeEntityListing**](WrapupCodeEntityListing.md)

<a name="getUserQueues"></a>

# **getUserQueues**

> [UserQueueEntityListing](UserQueueEntityListing.md) getUserQueues(userId, pageSize, pageNumber, joined, divisionId)

Get queues for user

Wraps GET /api/v2/users/{userId}/queues

Requires ANY permissions:

- routing:queue:view
- routing:queue:join
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.getUserQueues(userId, pageSize, pageNumber, joined, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserQueues");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description            | Notes                        |
| -------------- | ----------------------------------- | ---------------------- | ---------------------------- |
| **userId**     | **String**                          | User ID                |
| **pageSize**   | **Integer**                         | Page size              | [optional] [default to 25]   |
| **pageNumber** | **Integer**                         | Page number            | [optional] [default to 1]    |
| **joined**     | **Boolean**                         | Is joined to the queue | [optional] [default to true] |
| **divisionId** | [**List&lt;String&gt;**](String.md) | Division ID(s)         | [optional]                   |

{: class="table-striped"}

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.md)

<a name="getUserRoutinglanguages"></a>

# **getUserRoutinglanguages**

> [UserLanguageEntityListing](UserLanguageEntityListing.md) getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder)

List routing language for user

Wraps GET /api/v2/users/{userId}/routinglanguages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserLanguageEntityListing result = apiInstance.getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                        | Notes                                                              |
| -------------- | ----------- | ---------------------------------- | ------------------------------------------------------------------ |
| **userId**     | **String**  | User ID                            |
| **pageSize**   | **Integer** | Page size                          | [optional] [default to 25]                                         |
| **pageNumber** | **Integer** | Page number                        | [optional] [default to 1]                                          |
| **sortOrder**  | **String**  | Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending |

{: class="table-striped"}

### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing.md)

<a name="getUserRoutingskills"></a>

# **getUserRoutingskills**

> [UserSkillEntityListing](UserSkillEntityListing.md) getUserRoutingskills(userId, pageSize, pageNumber, sortOrder)

List routing skills for user

Wraps GET /api/v2/users/{userId}/routingskills

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#getUserRoutingskills");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                        | Notes                                                              |
| -------------- | ----------- | ---------------------------------- | ------------------------------------------------------------------ |
| **userId**     | **String**  | User ID                            |
| **pageSize**   | **Integer** | Page size                          | [optional] [default to 25]                                         |
| **pageNumber** | **Integer** | Page number                        | [optional] [default to 1]                                          |
| **sortOrder**  | **String**  | Ascending or descending sort order | [optional] [default to ASC]<br />**Values**: ascending, descending |

{: class="table-striped"}

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.md)

<a name="patchRoutingConversation"></a>

# **patchRoutingConversation**

> [RoutingConversationAttributesResponse](RoutingConversationAttributesResponse.md) patchRoutingConversation(conversationId, body)

Update attributes of an in-queue conversation

Returns an object indicating the updated values of all settable attributes. Supported attributes: skillIds, languageId, and priority.

Wraps PATCH /api/v2/routing/conversations/{conversationId}

Requires ANY permissions:

- routing:conversation:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
RoutingConversationAttributesRequest body = new RoutingConversationAttributesRequest(); // RoutingConversationAttributesRequest | Conversation Attributes
try {
    RoutingConversationAttributesResponse result = apiInstance.patchRoutingConversation(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingConversation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                                                | Description             | Notes |
| ------------------ | ----------------------------------------------------------------------------------- | ----------------------- | ----- |
| **conversationId** | **String**                                                                          | Conversation ID         |
| **body**           | [**RoutingConversationAttributesRequest**](RoutingConversationAttributesRequest.md) | Conversation Attributes |

{: class="table-striped"}

### Return type

[**RoutingConversationAttributesResponse**](RoutingConversationAttributesResponse.md)

<a name="patchRoutingEmailDomain"></a>

# **patchRoutingEmailDomain**

> [InboundDomain](InboundDomain.md) patchRoutingEmailDomain(domainId, body)

Update domain settings

Wraps PATCH /api/v2/routing/email/domains/{domainId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
InboundDomainPatchRequest body = new InboundDomainPatchRequest(); // InboundDomainPatchRequest | Domain settings
try {
    InboundDomain result = apiInstance.patchRoutingEmailDomain(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingEmailDomain");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                                          | Description     | Notes |
| ------------ | ------------------------------------------------------------- | --------------- | ----- |
| **domainId** | **String**                                                    | domain ID       |
| **body**     | [**InboundDomainPatchRequest**](InboundDomainPatchRequest.md) | Domain settings |

{: class="table-striped"}

### Return type

[**InboundDomain**](InboundDomain.md)

<a name="patchRoutingEmailDomainValidate"></a>

# **patchRoutingEmailDomainValidate**

> [InboundDomain](InboundDomain.md) patchRoutingEmailDomainValidate(domainId, body)

Validate domain settings

Wraps PATCH /api/v2/routing/email/domains/{domainId}/validate

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
InboundDomainPatchRequest body = new InboundDomainPatchRequest(); // InboundDomainPatchRequest | Domain settings
try {
    InboundDomain result = apiInstance.patchRoutingEmailDomainValidate(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingEmailDomainValidate");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                                          | Description     | Notes |
| ------------ | ------------------------------------------------------------- | --------------- | ----- |
| **domainId** | **String**                                                    | domain ID       |
| **body**     | [**InboundDomainPatchRequest**](InboundDomainPatchRequest.md) | Domain settings |

{: class="table-striped"}

### Return type

[**InboundDomain**](InboundDomain.md)

<a name="patchRoutingPredictor"></a>

# **patchRoutingPredictor**

> [Predictor](Predictor.md) patchRoutingPredictor(predictorId, body)

Update single predictor.

Wraps PATCH /api/v2/routing/predictors/{predictorId}

Requires ALL permissions:

- routing:predictor:edit
- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String predictorId = "predictorId_example"; // String | Predictor ID
PatchPredictorRequest body = new PatchPredictorRequest(); // PatchPredictorRequest |
try {
    Predictor result = apiInstance.patchRoutingPredictor(predictorId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingPredictor");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                                  | Description  | Notes      |
| --------------- | ----------------------------------------------------- | ------------ | ---------- |
| **predictorId** | **String**                                            | Predictor ID |
| **body**        | [**PatchPredictorRequest**](PatchPredictorRequest.md) |              | [optional] |

{: class="table-striped"}

### Return type

[**Predictor**](Predictor.md)

<a name="patchRoutingQueueMember"></a>

# **patchRoutingQueueMember**

> Void patchRoutingQueueMember(queueId, memberId, body)

Update the ring number OR joined status for a queue member.

Wraps PATCH /api/v2/routing/queues/{queueId}/members/{memberId}

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    apiInstance.patchRoutingQueueMember(queueId, memberId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueMember");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                              | Description  | Notes |
| ------------ | --------------------------------- | ------------ | ----- |
| **queueId**  | **String**                        | Queue ID     |
| **memberId** | **String**                        | Member ID    |
| **body**     | [**QueueMember**](QueueMember.md) | Queue Member |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchRoutingQueueMembers"></a>

# **patchRoutingQueueMembers**

> [QueueMemberEntityListing](QueueMemberEntityListing.md) patchRoutingQueueMembers(queueId, body)

Join or unjoin a set of users for a queue

Wraps PATCH /api/v2/routing/queues/{queueId}/members

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListing result = apiInstance.patchRoutingQueueMembers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                          | Description   | Notes |
| ----------- | --------------------------------------------- | ------------- | ----- |
| **queueId** | **String**                                    | Queue ID      |
| **body**    | [**List&lt;QueueMember&gt;**](QueueMember.md) | Queue Members |

{: class="table-striped"}

### Return type

[**QueueMemberEntityListing**](QueueMemberEntityListing.md)

<a name="patchRoutingQueueUser"></a>

# **patchRoutingQueueUser**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void patchRoutingQueueUser(queueId, memberId, body)

DEPRECATED: use PATCH /routing/queues/{queueId}/members/{memberId}. Update the ring number OR joined status for a User in a Queue.

Wraps PATCH /api/v2/routing/queues/{queueId}/users/{memberId}

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String memberId = "memberId_example"; // String | Member ID
QueueMember body = new QueueMember(); // QueueMember | Queue Member
try {
    apiInstance.patchRoutingQueueUser(queueId, memberId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUser");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                              | Description  | Notes |
| ------------ | --------------------------------- | ------------ | ----- |
| **queueId**  | **String**                        | Queue ID     |
| **memberId** | **String**                        | Member ID    |
| **body**     | [**QueueMember**](QueueMember.md) | Queue Member |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchRoutingQueueUsers"></a>

# **patchRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [QueueMemberEntityListingV1](QueueMemberEntityListingV1.md) patchRoutingQueueUsers(queueId, body)

DEPRECATED: use PATCH /routing/queues/{queueId}/members. Join or unjoin a set of users for a queue.

Wraps PATCH /api/v2/routing/queues/{queueId}/users

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<QueueMember> body = Arrays.asList(new QueueMember()); // List<QueueMember> | Queue Members
try {
    QueueMemberEntityListingV1 result = apiInstance.patchRoutingQueueUsers(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                          | Description   | Notes |
| ----------- | --------------------------------------------- | ------------- | ----- |
| **queueId** | **String**                                    | Queue ID      |
| **body**    | [**List&lt;QueueMember&gt;**](QueueMember.md) | Queue Members |

{: class="table-striped"}

### Return type

[**QueueMemberEntityListingV1**](QueueMemberEntityListingV1.md)

<a name="patchRoutingSettingsContactcenter"></a>

# **patchRoutingSettingsContactcenter**

> Void patchRoutingSettingsContactcenter(body)

Update Contact Center Settings

Wraps PATCH /api/v2/routing/settings/contactcenter

Requires ANY permissions:

- routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
ContactCenterSettings body = new ContactCenterSettings(); // ContactCenterSettings | Contact Center Settings
try {
    apiInstance.patchRoutingSettingsContactcenter(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchRoutingSettingsContactcenter");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description             | Notes |
| -------- | ----------------------------------------------------- | ----------------------- | ----- |
| **body** | [**ContactCenterSettings**](ContactCenterSettings.md) | Contact Center Settings |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchUserQueue"></a>

# **patchUserQueue**

> [UserQueue](UserQueue.md) patchUserQueue(queueId, userId, body)

Join or unjoin a queue for a user

Wraps PATCH /api/v2/users/{userId}/queues/{queueId}

Requires ANY permissions:

- routing:queue:join
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
String userId = "userId_example"; // String | User ID
UserQueue body = new UserQueue(); // UserQueue | Queue Member
try {
    UserQueue result = apiInstance.patchUserQueue(queueId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserQueue");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                          | Description  | Notes |
| ----------- | ----------------------------- | ------------ | ----- |
| **queueId** | **String**                    | Queue ID     |
| **userId**  | **String**                    | User ID      |
| **body**    | [**UserQueue**](UserQueue.md) | Queue Member |

{: class="table-striped"}

### Return type

[**UserQueue**](UserQueue.md)

<a name="patchUserQueues"></a>

# **patchUserQueues**

> [UserQueueEntityListing](UserQueueEntityListing.md) patchUserQueues(userId, body, divisionId)

Join or unjoin a set of queues for a user

Wraps PATCH /api/v2/users/{userId}/queues

Requires ANY permissions:

- routing:queue:join
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.patchUserQueues(userId, body, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserQueues");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                      | Description    | Notes      |
| -------------- | ----------------------------------------- | -------------- | ---------- |
| **userId**     | **String**                                | User ID        |
| **body**       | [**List&lt;UserQueue&gt;**](UserQueue.md) | User Queues    |
| **divisionId** | [**List&lt;String&gt;**](String.md)       | Division ID(s) | [optional] |

{: class="table-striped"}

### Return type

[**UserQueueEntityListing**](UserQueueEntityListing.md)

<a name="patchUserRoutinglanguage"></a>

# **patchUserRoutinglanguage**

> [UserRoutingLanguage](UserRoutingLanguage.md) patchUserRoutinglanguage(userId, languageId, body)

Update routing language proficiency or state.

Wraps PATCH /api/v2/users/{userId}/routinglanguages/{languageId}

Requires ANY permissions:

- routing:skill:assign
- routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
UserRoutingLanguage body = new UserRoutingLanguage(); // UserRoutingLanguage | Language
try {
    UserRoutingLanguage result = apiInstance.patchUserRoutinglanguage(userId, languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguage");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                              | Description | Notes |
| -------------- | ------------------------------------------------- | ----------- | ----- |
| **userId**     | **String**                                        | User ID     |
| **languageId** | **String**                                        | languageId  |
| **body**       | [**UserRoutingLanguage**](UserRoutingLanguage.md) | Language    |

{: class="table-striped"}

### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.md)

<a name="patchUserRoutinglanguagesBulk"></a>

# **patchUserRoutinglanguagesBulk**

> [UserLanguageEntityListing](UserLanguageEntityListing.md) patchUserRoutinglanguagesBulk(userId, body)

Add bulk routing language to user. Max limit 50 languages

Wraps PATCH /api/v2/users/{userId}/routinglanguages/bulk

Requires ANY permissions:

- routing:skill:assign
- routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingLanguagePost> body = Arrays.asList(new UserRoutingLanguagePost()); // List<UserRoutingLanguagePost> | Language
try {
    UserLanguageEntityListing result = apiInstance.patchUserRoutinglanguagesBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutinglanguagesBulk");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                  | Description | Notes |
| ---------- | --------------------------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                                            | User ID     |
| **body**   | [**List&lt;UserRoutingLanguagePost&gt;**](UserRoutingLanguagePost.md) | Language    |

{: class="table-striped"}

### Return type

[**UserLanguageEntityListing**](UserLanguageEntityListing.md)

<a name="patchUserRoutingskillsBulk"></a>

# **patchUserRoutingskillsBulk**

> [UserSkillEntityListing](UserSkillEntityListing.md) patchUserRoutingskillsBulk(userId, body)

Bulk add routing skills to user

Wraps PATCH /api/v2/users/{userId}/routingskills/bulk

Requires ANY permissions:

- routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.patchUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#patchUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                            | Description | Notes |
| ---------- | --------------------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                                      | User ID     |
| **body**   | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.md) | Skill       |

{: class="table-striped"}

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
QueueObservationQuery body = new QueueObservationQuery(); // QueueObservationQuery | query
try {
    QueueObservationQueryResponse result = apiInstance.postAnalyticsQueuesObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postAnalyticsQueuesObservationsQuery");
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

<a name="postRoutingAssessments"></a>

# **postRoutingAssessments**

> [BenefitAssessment](BenefitAssessment.md) postRoutingAssessments(body)

Create a benefit assessment.

Wraps POST /api/v2/routing/assessments

Requires ALL permissions:

- routing:assessment:add
- routing:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateBenefitAssessmentRequest body = new CreateBenefitAssessmentRequest(); // CreateBenefitAssessmentRequest |
try {
    BenefitAssessment result = apiInstance.postRoutingAssessments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingAssessments");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                    | Description | Notes      |
| -------- | ----------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateBenefitAssessmentRequest**](CreateBenefitAssessmentRequest.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**BenefitAssessment**](BenefitAssessment.md)

<a name="postRoutingAssessmentsJobs"></a>

# **postRoutingAssessmentsJobs**

> [BenefitAssessmentJob](BenefitAssessmentJob.md) postRoutingAssessmentsJobs(body)

Create a benefit assessment job.

Wraps POST /api/v2/routing/assessments/jobs

Requires ANY permissions:

- routing:assessment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateBenefitAssessmentJobRequest body = new CreateBenefitAssessmentJobRequest(); // CreateBenefitAssessmentJobRequest |
try {
    BenefitAssessmentJob result = apiInstance.postRoutingAssessmentsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingAssessmentsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                          | Description | Notes      |
| -------- | ----------------------------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreateBenefitAssessmentJobRequest**](CreateBenefitAssessmentJobRequest.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**BenefitAssessmentJob**](BenefitAssessmentJob.md)

<a name="postRoutingEmailDomainRoutes"></a>

# **postRoutingEmailDomainRoutes**

> [InboundRoute](InboundRoute.md) postRoutingEmailDomainRoutes(domainName, body)

Create a route

Wraps POST /api/v2/routing/email/domains/{domainName}/routes

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.postRoutingEmailDomainRoutes(domainName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomainRoutes");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description  | Notes |
| -------------- | ----------------------------------- | ------------ | ----- |
| **domainName** | **String**                          | email domain |
| **body**       | [**InboundRoute**](InboundRoute.md) | Route        |

{: class="table-striped"}

### Return type

[**InboundRoute**](InboundRoute.md)

<a name="postRoutingEmailDomainTestconnection"></a>

# **postRoutingEmailDomainTestconnection**

> [TestMessage](TestMessage.md) postRoutingEmailDomainTestconnection(domainId, body)

Tests the custom SMTP server integration connection set on this domain

The request body is optional. If omitted, this endpoint will just test the connection of the Custom SMTP Server. If the body is specified, there will be an attempt to send an email message to the server.

Wraps POST /api/v2/routing/email/domains/{domainId}/testconnection

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainId = "domainId_example"; // String | domain ID
TestMessage body = new TestMessage(); // TestMessage | TestMessage
try {
    TestMessage result = apiInstance.postRoutingEmailDomainTestconnection(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomainTestconnection");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                              | Description | Notes      |
| ------------ | --------------------------------- | ----------- | ---------- |
| **domainId** | **String**                        | domain ID   |
| **body**     | [**TestMessage**](TestMessage.md) | TestMessage | [optional] |

{: class="table-striped"}

### Return type

[**TestMessage**](TestMessage.md)

<a name="postRoutingEmailDomains"></a>

# **postRoutingEmailDomains**

> [InboundDomain](InboundDomain.md) postRoutingEmailDomains(body)

Create a domain

Wraps POST /api/v2/routing/email/domains

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
InboundDomain body = new InboundDomain(); // InboundDomain | Domain
try {
    InboundDomain result = apiInstance.postRoutingEmailDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingEmailDomains");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description | Notes |
| -------- | ------------------------------------- | ----------- | ----- |
| **body** | [**InboundDomain**](InboundDomain.md) | Domain      |

{: class="table-striped"}

### Return type

[**InboundDomain**](InboundDomain.md)

<a name="postRoutingLanguages"></a>

# **postRoutingLanguages**

> [Language](Language.md) postRoutingLanguages(body)

Create Language

Wraps POST /api/v2/routing/languages

Requires ANY permissions:

- routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Language body = new Language(); // Language | Language
try {
    Language result = apiInstance.postRoutingLanguages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingLanguages");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                        | Description | Notes |
| -------- | --------------------------- | ----------- | ----- |
| **body** | [**Language**](Language.md) | Language    |

{: class="table-striped"}

### Return type

[**Language**](Language.md)

<a name="postRoutingPredictors"></a>

# **postRoutingPredictors**

> [Predictor](Predictor.md) postRoutingPredictors(body)

Create a predictor.

Wraps POST /api/v2/routing/predictors

Requires ALL permissions:

- routing:predictor:add
- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreatePredictorRequest body = new CreatePredictorRequest(); // CreatePredictorRequest |
try {
    Predictor result = apiInstance.postRoutingPredictors(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingPredictors");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description | Notes      |
| -------- | ------------------------------------------------------- | ----------- | ---------- |
| **body** | [**CreatePredictorRequest**](CreatePredictorRequest.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**Predictor**](Predictor.md)

<a name="postRoutingQueueMembers"></a>

# **postRoutingQueueMembers**

> Void postRoutingQueueMembers(queueId, body, delete)

Bulk add or delete up to 100 queue members

Wraps POST /api/v2/routing/queues/{queueId}/members

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WritableEntity> body = Arrays.asList(new WritableEntity()); // List<WritableEntity> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    apiInstance.postRoutingQueueMembers(queueId, body, delete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueMembers");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                | Description                  | Notes                         |
| ----------- | --------------------------------------------------- | ---------------------------- | ----------------------------- |
| **queueId** | **String**                                          | Queue ID                     |
| **body**    | [**List&lt;WritableEntity&gt;**](WritableEntity.md) | Queue Members                |
| **delete**  | **Boolean**                                         | True to delete queue members | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postRoutingQueueUsers"></a>

# **postRoutingQueueUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void postRoutingQueueUsers(queueId, body, delete)

DEPRECATED: use POST /routing/queues/{queueId}/members. Bulk add or delete up to 100 queue members.

Wraps POST /api/v2/routing/queues/{queueId}/users

Requires ANY permissions:

- routing:queue:edit
- routing:queueMember:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WritableEntity> body = Arrays.asList(new WritableEntity()); // List<WritableEntity> | Queue Members
Boolean delete = false; // Boolean | True to delete queue members
try {
    apiInstance.postRoutingQueueUsers(queueId, body, delete);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueUsers");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                | Description                  | Notes                         |
| ----------- | --------------------------------------------------- | ---------------------------- | ----------------------------- |
| **queueId** | **String**                                          | Queue ID                     |
| **body**    | [**List&lt;WritableEntity&gt;**](WritableEntity.md) | Queue Members                |
| **delete**  | **Boolean**                                         | True to delete queue members | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postRoutingQueueWrapupcodes"></a>

# **postRoutingQueueWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) postRoutingQueueWrapupcodes(queueId, body)

Add up to 100 wrap-up codes to a queue

Wraps POST /api/v2/routing/queues/{queueId}/wrapupcodes

Requires ALL permissions:

- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
List<WrapUpCodeReference> body = Arrays.asList(new WrapUpCodeReference()); // List<WrapUpCodeReference> | List of wrapup codes
try {
    List<WrapupCode> result = apiInstance.postRoutingQueueWrapupcodes(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueueWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                          | Description          | Notes |
| ----------- | ------------------------------------------------------------- | -------------------- | ----- |
| **queueId** | **String**                                                    | Queue ID             |
| **body**    | [**List&lt;WrapUpCodeReference&gt;**](WrapUpCodeReference.md) | List of wrapup codes |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="postRoutingQueues"></a>

# **postRoutingQueues**

> [Queue](Queue.md) postRoutingQueues(body)

Create a queue

Wraps POST /api/v2/routing/queues

Requires ANY permissions:

- routing:queue:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
CreateQueueRequest body = new CreateQueueRequest(); // CreateQueueRequest | Queue
try {
    Queue result = apiInstance.postRoutingQueues(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingQueues");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                            | Description | Notes |
| -------- | ----------------------------------------------- | ----------- | ----- |
| **body** | [**CreateQueueRequest**](CreateQueueRequest.md) | Queue       |

{: class="table-striped"}

### Return type

[**Queue**](Queue.md)

<a name="postRoutingSkills"></a>

# **postRoutingSkills**

> [RoutingSkill](RoutingSkill.md) postRoutingSkills(body)

Create Skill

Wraps POST /api/v2/routing/skills

Requires ANY permissions:

- routing:skill:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
RoutingSkill body = new RoutingSkill(); // RoutingSkill | Skill
try {
    RoutingSkill result = apiInstance.postRoutingSkills(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSkills");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description | Notes |
| -------- | ----------------------------------- | ----------- | ----- |
| **body** | [**RoutingSkill**](RoutingSkill.md) | Skill       |

{: class="table-striped"}

### Return type

[**RoutingSkill**](RoutingSkill.md)

<a name="postRoutingSmsAddresses"></a>

# **postRoutingSmsAddresses**

> [SmsAddress](SmsAddress.md) postRoutingSmsAddresses(body)

Provision an Address for SMS

Wraps POST /api/v2/routing/sms/addresses

Requires ALL permissions:

- sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsAddressProvision body = new SmsAddressProvision(); // SmsAddressProvision | SmsAddress
try {
    SmsAddress result = apiInstance.postRoutingSmsAddresses(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsAddresses");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description | Notes |
| -------- | ------------------------------------------------- | ----------- | ----- |
| **body** | [**SmsAddressProvision**](SmsAddressProvision.md) | SmsAddress  |

{: class="table-striped"}

### Return type

[**SmsAddress**](SmsAddress.md)

<a name="postRoutingSmsPhonenumbers"></a>

# **postRoutingSmsPhonenumbers**

> [SmsPhoneNumber](SmsPhoneNumber.md) postRoutingSmsPhonenumbers(body, async)

Provision a phone number for SMS

Wraps POST /api/v2/routing/sms/phonenumbers

Requires ALL permissions:

- sms:phoneNumber:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
SmsPhoneNumberProvision body = new SmsPhoneNumberProvision(); // SmsPhoneNumberProvision | SmsPhoneNumber
Boolean async = false; // Boolean | Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber's provisioningStatus for completion of this request.
try {
    SmsPhoneNumber result = apiInstance.postRoutingSmsPhonenumbers(body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingSmsPhonenumbers");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                                      | Description                                                                                                                                                                                                                                 | Notes                         |
| --------- | --------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| **body**  | [**SmsPhoneNumberProvision**](SmsPhoneNumberProvision.md) | SmsPhoneNumber                                                                                                                                                                                                                              |
| **async** | **Boolean**                                               | Provision a new phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the provisioning of a new phone number. Check the phoneNumber&#39;s provisioningStatus for completion of this request. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.md)

<a name="postRoutingWrapupcodes"></a>

# **postRoutingWrapupcodes**

> [WrapupCode](WrapupCode.md) postRoutingWrapupcodes(body)

Create a wrap-up code

Wraps POST /api/v2/routing/wrapupcodes

Requires ALL permissions:

- routing:wrapupCode:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.postRoutingWrapupcodes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postRoutingWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes |
| -------- | ------------------------------- | ----------- | ----- |
| **body** | [**WrapupCode**](WrapupCode.md) | WrapupCode  |

{: class="table-striped"}

### Return type

[**WrapupCode**](WrapupCode.md)

<a name="postUserRoutinglanguages"></a>

# **postUserRoutinglanguages**

> [UserRoutingLanguage](UserRoutingLanguage.md) postUserRoutinglanguages(userId, body)

Add routing language to user

Wraps POST /api/v2/users/{userId}/routinglanguages

Requires ANY permissions:

- routing:skill:assign
- routing:language:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingLanguagePost body = new UserRoutingLanguagePost(); // UserRoutingLanguagePost | Language
try {
    UserRoutingLanguage result = apiInstance.postUserRoutinglanguages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutinglanguages");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                      | Description | Notes |
| ---------- | --------------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                                | User ID     |
| **body**   | [**UserRoutingLanguagePost**](UserRoutingLanguagePost.md) | Language    |

{: class="table-striped"}

### Return type

[**UserRoutingLanguage**](UserRoutingLanguage.md)

<a name="postUserRoutingskills"></a>

# **postUserRoutingskills**

> [UserRoutingSkill](UserRoutingSkill.md) postUserRoutingskills(userId, body)

Add routing skill to user

Wraps POST /api/v2/users/{userId}/routingskills

Requires ALL permissions:

- routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkillPost body = new UserRoutingSkillPost(); // UserRoutingSkillPost | Skill
try {
    UserRoutingSkill result = apiInstance.postUserRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#postUserRoutingskills");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                | Description | Notes |
| ---------- | --------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                          | User ID     |
| **body**   | [**UserRoutingSkillPost**](UserRoutingSkillPost.md) | Skill       |

{: class="table-striped"}

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

<a name="putRoutingEmailDomainRoute"></a>

# **putRoutingEmailDomainRoute**

> [InboundRoute](InboundRoute.md) putRoutingEmailDomainRoute(domainName, routeId, body)

Update a route

Wraps PUT /api/v2/routing/email/domains/{domainName}/routes/{routeId}

Requires ALL permissions:

- routing:email:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String domainName = "domainName_example"; // String | email domain
String routeId = "routeId_example"; // String | route ID
InboundRoute body = new InboundRoute(); // InboundRoute | Route
try {
    InboundRoute result = apiInstance.putRoutingEmailDomainRoute(domainName, routeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingEmailDomainRoute");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description  | Notes |
| -------------- | ----------------------------------- | ------------ | ----- |
| **domainName** | **String**                          | email domain |
| **routeId**    | **String**                          | route ID     |
| **body**       | [**InboundRoute**](InboundRoute.md) | Route        |

{: class="table-striped"}

### Return type

[**InboundRoute**](InboundRoute.md)

<a name="putRoutingMessageRecipient"></a>

# **putRoutingMessageRecipient**

> [Recipient](Recipient.md) putRoutingMessageRecipient(recipientId, body)

Update a recipient

Wraps PUT /api/v2/routing/message/recipients/{recipientId}

Requires ALL permissions:

- routing:message:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String recipientId = "recipientId_example"; // String | Recipient ID
Recipient body = new Recipient(); // Recipient | Recipient
try {
    Recipient result = apiInstance.putRoutingMessageRecipient(recipientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingMessageRecipient");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                          | Description  | Notes |
| --------------- | ----------------------------- | ------------ | ----- |
| **recipientId** | **String**                    | Recipient ID |
| **body**        | [**Recipient**](Recipient.md) | Recipient    |

{: class="table-striped"}

### Return type

[**Recipient**](Recipient.md)

<a name="putRoutingQueue"></a>

# **putRoutingQueue**

> [Queue](Queue.md) putRoutingQueue(queueId, body)

Update a queue

Wraps PUT /api/v2/routing/queues/{queueId}

Requires ANY permissions:

- routing:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String queueId = "queueId_example"; // String | Queue ID
QueueRequest body = new QueueRequest(); // QueueRequest | Queue
try {
    Queue result = apiInstance.putRoutingQueue(queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingQueue");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description | Notes |
| ----------- | ----------------------------------- | ----------- | ----- |
| **queueId** | **String**                          | Queue ID    |
| **body**    | [**QueueRequest**](QueueRequest.md) | Queue       |

{: class="table-striped"}

### Return type

[**Queue**](Queue.md)

<a name="putRoutingSettings"></a>

# **putRoutingSettings**

> [RoutingSettings](RoutingSettings.md) putRoutingSettings(body)

Update an organization&#39;s routing settings

Wraps PUT /api/v2/routing/settings

Requires ANY permissions:

- routing:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
RoutingSettings body = new RoutingSettings(); // RoutingSettings | Organization Settings
try {
    RoutingSettings result = apiInstance.putRoutingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description           | Notes |
| -------- | ----------------------------------------- | --------------------- | ----- |
| **body** | [**RoutingSettings**](RoutingSettings.md) | Organization Settings |

{: class="table-striped"}

### Return type

[**RoutingSettings**](RoutingSettings.md)

<a name="putRoutingSettingsTranscription"></a>

# **putRoutingSettingsTranscription**

> [TranscriptionSettings](TranscriptionSettings.md) putRoutingSettingsTranscription(body)

Update Transcription Settings

Wraps PUT /api/v2/routing/settings/transcription

Requires ANY permissions:

- routing:transcriptionSettings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
TranscriptionSettings body = new TranscriptionSettings(); // TranscriptionSettings | Organization Settings
try {
    TranscriptionSettings result = apiInstance.putRoutingSettingsTranscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSettingsTranscription");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description           | Notes |
| -------- | ----------------------------------------------------- | --------------------- | ----- |
| **body** | [**TranscriptionSettings**](TranscriptionSettings.md) | Organization Settings |

{: class="table-striped"}

### Return type

[**TranscriptionSettings**](TranscriptionSettings.md)

<a name="putRoutingSmsPhonenumber"></a>

# **putRoutingSmsPhonenumber**

> [SmsPhoneNumber](SmsPhoneNumber.md) putRoutingSmsPhonenumber(addressId, body, async)

Update a phone number provisioned for SMS.

Wraps PUT /api/v2/routing/sms/phonenumbers/{addressId}

Requires ALL permissions:

- sms:phoneNumber:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String addressId = "addressId_example"; // String | Address ID
SmsPhoneNumber body = new SmsPhoneNumber(); // SmsPhoneNumber | SmsPhoneNumber
Boolean async = false; // Boolean | Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber's provisioningStatus for the progress of this request.
try {
    SmsPhoneNumber result = apiInstance.putRoutingSmsPhonenumber(addressId, body, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingSmsPhonenumber");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                    | Description                                                                                                                                                                                                                                        | Notes                         |
| ------------- | --------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| **addressId** | **String**                              | Address ID                                                                                                                                                                                                                                         |
| **body**      | [**SmsPhoneNumber**](SmsPhoneNumber.md) | SmsPhoneNumber                                                                                                                                                                                                                                     |
| **async**     | **Boolean**                             | Update an existing phone number for SMS in an asynchronous manner. If the async parameter value is true, this initiates the update of a provisioned phone number. Check the phoneNumber&#39;s provisioningStatus for the progress of this request. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**SmsPhoneNumber**](SmsPhoneNumber.md)

<a name="putRoutingUserUtilization"></a>

# **putRoutingUserUtilization**

> [AgentMaxUtilization](AgentMaxUtilization.md) putRoutingUserUtilization(userId, body)

Update the user&#39;s max utilization settings. Include only those media types requiring custom configuration.

Wraps PUT /api/v2/routing/users/{userId}/utilization

Requires ANY permissions:

- routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
Utilization body = new Utilization(); // Utilization | utilization
try {
    AgentMaxUtilization result = apiInstance.putRoutingUserUtilization(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUserUtilization");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                              | Description | Notes |
| ---------- | --------------------------------- | ----------- | ----- |
| **userId** | **String**                        | User ID     |
| **body**   | [**Utilization**](Utilization.md) | utilization |

{: class="table-striped"}

### Return type

[**AgentMaxUtilization**](AgentMaxUtilization.md)

<a name="putRoutingUtilization"></a>

# **putRoutingUtilization**

> [Utilization](Utilization.md) putRoutingUtilization(body)

Update the organization-wide max utilization settings. Include only those media types requiring custom configuration.

Wraps PUT /api/v2/routing/utilization

Requires ALL permissions:

- routing:utilization:manage

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
Utilization body = new Utilization(); // Utilization | utilization
try {
    Utilization result = apiInstance.putRoutingUtilization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingUtilization");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description | Notes |
| -------- | --------------------------------- | ----------- | ----- |
| **body** | [**Utilization**](Utilization.md) | utilization |

{: class="table-striped"}

### Return type

[**Utilization**](Utilization.md)

<a name="putRoutingWrapupcode"></a>

# **putRoutingWrapupcode**

> [WrapupCode](WrapupCode.md) putRoutingWrapupcode(codeId, body)

Update wrap-up code

Wraps PUT /api/v2/routing/wrapupcodes/{codeId}

Requires ALL permissions:

- routing:wrapupCode:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String codeId = "codeId_example"; // String | Wrapup Code ID
WrapupCode body = new WrapupCode(); // WrapupCode | WrapupCode
try {
    WrapupCode result = apiInstance.putRoutingWrapupcode(codeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putRoutingWrapupcode");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                            | Description    | Notes |
| ---------- | ------------------------------- | -------------- | ----- |
| **codeId** | **String**                      | Wrapup Code ID |
| **body**   | [**WrapupCode**](WrapupCode.md) | WrapupCode     |

{: class="table-striped"}

### Return type

[**WrapupCode**](WrapupCode.md)

<a name="putUserRoutingskill"></a>

# **putUserRoutingskill**

> [UserRoutingSkill](UserRoutingSkill.md) putUserRoutingskill(userId, skillId, body)

Update routing skill proficiency or state.

Wraps PUT /api/v2/users/{userId}/routingskills/{skillId}

Requires ALL permissions:

- routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserRoutingskill(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskill");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                        | Description | Notes |
| ----------- | ------------------------------------------- | ----------- | ----- |
| **userId**  | **String**                                  | User ID     |
| **skillId** | **String**                                  | skillId     |
| **body**    | [**UserRoutingSkill**](UserRoutingSkill.md) | Skill       |

{: class="table-striped"}

### Return type

[**UserRoutingSkill**](UserRoutingSkill.md)

<a name="putUserRoutingskillsBulk"></a>

# **putUserRoutingskillsBulk**

> [UserSkillEntityListing](UserSkillEntityListing.md) putUserRoutingskillsBulk(userId, body)

Replace all routing skills assigned to a user

Wraps PUT /api/v2/users/{userId}/routingskills/bulk

Requires ANY permissions:

- routing:skill:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RoutingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RoutingApi apiInstance = new RoutingApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.putUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutingApi#putUserRoutingskillsBulk");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                            | Description | Notes |
| ---------- | --------------------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                                      | User ID     |
| **body**   | [**List&lt;UserRoutingSkillPost&gt;**](UserRoutingSkillPost.md) | Skill       |

{: class="table-striped"}

### Return type

[**UserSkillEntityListing**](UserSkillEntityListing.md)
