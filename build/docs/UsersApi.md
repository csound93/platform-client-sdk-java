---
title: UsersApi
---

## UsersApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                               | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| [**deleteAnalyticsUsersDetailsJob**](UsersApi.md#deleteAnalyticsUsersDetailsJob)                                     | Delete/cancel an async request                                                                                 |
| [**deleteAuthorizationSubjectDivisionRole**](UsersApi.md#deleteAuthorizationSubjectDivisionRole)                     | Delete a grant of a role in a division                                                                         |
| [**deleteRoutingUserUtilization**](UsersApi.md#deleteRoutingUserUtilization)                                         | Delete the user&#39;s max utilization settings and revert to the organization-wide default.                    |
| [**deleteUser**](UsersApi.md#deleteUser)                                                                             | Delete user                                                                                                    |
| [**deleteUserRoutinglanguage**](UsersApi.md#deleteUserRoutinglanguage)                                               | Remove routing language from user                                                                              |
| [**deleteUserRoutingskill**](UsersApi.md#deleteUserRoutingskill)                                                     | Remove routing skill from user                                                                                 |
| [**deleteUserStationAssociatedstation**](UsersApi.md#deleteUserStationAssociatedstation)                             | Clear associated station                                                                                       |
| [**deleteUserStationDefaultstation**](UsersApi.md#deleteUserStationDefaultstation)                                   | Clear default station                                                                                          |
| [**getAnalyticsUsersDetailsJob**](UsersApi.md#getAnalyticsUsersDetailsJob)                                           | Get status for async query for user details                                                                    |
| [**getAnalyticsUsersDetailsJobResults**](UsersApi.md#getAnalyticsUsersDetailsJobResults)                             | Fetch a page of results for an async query                                                                     |
| [**getAnalyticsUsersDetailsJobsAvailability**](UsersApi.md#getAnalyticsUsersDetailsJobsAvailability)                 | Lookup the datalake availability date and time                                                                 |
| [**getAuthorizationDivisionspermittedMe**](UsersApi.md#getAuthorizationDivisionspermittedMe)                         | Returns which divisions the current user has the given permission in.                                          |
| [**getAuthorizationDivisionspermittedPagedMe**](UsersApi.md#getAuthorizationDivisionspermittedPagedMe)               | Returns which divisions the current user has the given permission in.                                          |
| [**getAuthorizationDivisionspermittedPagedSubjectId**](UsersApi.md#getAuthorizationDivisionspermittedPagedSubjectId) | Returns which divisions the specified user has the given permission in.                                        |
| [**getAuthorizationSubject**](UsersApi.md#getAuthorizationSubject)                                                   | Returns a listing of roles and permissions for a user.                                                         |
| [**getAuthorizationSubjectsMe**](UsersApi.md#getAuthorizationSubjectsMe)                                             | Returns a listing of roles and permissions for the currently authenticated user.                               |
| [**getFieldconfig**](UsersApi.md#getFieldconfig)                                                                     | Fetch field config for an entity type                                                                          |
| [**getProfilesUsers**](UsersApi.md#getProfilesUsers)                                                                 | Get a user profile listing                                                                                     |
| [**getRoutingUserUtilization**](UsersApi.md#getRoutingUserUtilization)                                               | Get the user&#39;s max utilization settings. If not configured, the organization-wide default is returned.     |
| [**getUser**](UsersApi.md#getUser)                                                                                   | Get user.                                                                                                      |
| [**getUserAdjacents**](UsersApi.md#getUserAdjacents)                                                                 | Get adjacents                                                                                                  |
| [**getUserCallforwarding**](UsersApi.md#getUserCallforwarding)                                                       | Get a user&#39;s CallForwarding                                                                                |
| [**getUserDirectreports**](UsersApi.md#getUserDirectreports)                                                         | Get direct reports                                                                                             |
| [**getUserFavorites**](UsersApi.md#getUserFavorites)                                                                 | Deprecated; will be revived with new contract                                                                  |
| [**getUserGeolocation**](UsersApi.md#getUserGeolocation)                                                             | Get a user&#39;s Geolocation                                                                                   |
| [**getUserOutofoffice**](UsersApi.md#getUserOutofoffice)                                                             | Get a OutOfOffice                                                                                              |
| [**getUserProfile**](UsersApi.md#getUserProfile)                                                                     | Get user profile                                                                                               |
| [**getUserProfileskills**](UsersApi.md#getUserProfileskills)                                                         | List profile skills for a user                                                                                 |
| [**getUserQueues**](UsersApi.md#getUserQueues)                                                                       | Get queues for user                                                                                            |
| [**getUserRoles**](UsersApi.md#getUserRoles)                                                                         | Returns a listing of roles and permissions for a user.                                                         |
| [**getUserRoutinglanguages**](UsersApi.md#getUserRoutinglanguages)                                                   | List routing language for user                                                                                 |
| [**getUserRoutingskills**](UsersApi.md#getUserRoutingskills)                                                         | List routing skills for user                                                                                   |
| [**getUserRoutingstatus**](UsersApi.md#getUserRoutingstatus)                                                         | Fetch the routing status of a user                                                                             |
| [**getUserState**](UsersApi.md#getUserState)                                                                         | Get user state information.                                                                                    |
| [**getUserStation**](UsersApi.md#getUserStation)                                                                     | Get station information for user                                                                               |
| [**getUserSuperiors**](UsersApi.md#getUserSuperiors)                                                                 | Get superiors                                                                                                  |
| [**getUserTrustors**](UsersApi.md#getUserTrustors)                                                                   | List the organizations that have authorized/trusted the user.                                                  |
| [**getUsers**](UsersApi.md#getUsers)                                                                                 | Get the list of available users.                                                                               |
| [**getUsersDevelopmentActivities**](UsersApi.md#getUsersDevelopmentActivities)                                       | Get list of Development Activities                                                                             |
| [**getUsersDevelopmentActivitiesMe**](UsersApi.md#getUsersDevelopmentActivitiesMe)                                   | Get list of Development Activities for current user                                                            |
| [**getUsersDevelopmentActivity**](UsersApi.md#getUsersDevelopmentActivity)                                           | Get a Development Activity                                                                                     |
| [**getUsersMe**](UsersApi.md#getUsersMe)                                                                             | Get current user details.                                                                                      |
| [**getUsersSearch**](UsersApi.md#getUsersSearch)                                                                     | Search users using the q64 value returned from a previous search                                               |
| [**patchUser**](UsersApi.md#patchUser)                                                                               | Update user                                                                                                    |
| [**patchUserCallforwarding**](UsersApi.md#patchUserCallforwarding)                                                   | Patch a user&#39;s CallForwarding                                                                              |
| [**patchUserGeolocation**](UsersApi.md#patchUserGeolocation)                                                         | Patch a user&#39;s Geolocation                                                                                 |
| [**patchUserQueue**](UsersApi.md#patchUserQueue)                                                                     | Join or unjoin a queue for a user                                                                              |
| [**patchUserQueues**](UsersApi.md#patchUserQueues)                                                                   | Join or unjoin a set of queues for a user                                                                      |
| [**patchUserRoutinglanguage**](UsersApi.md#patchUserRoutinglanguage)                                                 | Update routing language proficiency or state.                                                                  |
| [**patchUserRoutinglanguagesBulk**](UsersApi.md#patchUserRoutinglanguagesBulk)                                       | Add bulk routing language to user. Max limit 50 languages                                                      |
| [**patchUserRoutingskillsBulk**](UsersApi.md#patchUserRoutingskillsBulk)                                             | Bulk add routing skills to user                                                                                |
| [**patchUsersBulk**](UsersApi.md#patchUsersBulk)                                                                     | Update bulk acd autoanswer on users                                                                            |
| [**postAnalyticsUsersAggregatesQuery**](UsersApi.md#postAnalyticsUsersAggregatesQuery)                               | Query for user aggregates                                                                                      |
| [**postAnalyticsUsersDetailsJobs**](UsersApi.md#postAnalyticsUsersDetailsJobs)                                       | Query for user details asynchronously                                                                          |
| [**postAnalyticsUsersDetailsQuery**](UsersApi.md#postAnalyticsUsersDetailsQuery)                                     | Query for user details                                                                                         |
| [**postAnalyticsUsersObservationsQuery**](UsersApi.md#postAnalyticsUsersObservationsQuery)                           | Query for user observations                                                                                    |
| [**postAuthorizationSubjectBulkadd**](UsersApi.md#postAuthorizationSubjectBulkadd)                                   | Bulk-grant roles and divisions to a subject.                                                                   |
| [**postAuthorizationSubjectBulkremove**](UsersApi.md#postAuthorizationSubjectBulkremove)                             | Bulk-remove grants from a subject.                                                                             |
| [**postAuthorizationSubjectBulkreplace**](UsersApi.md#postAuthorizationSubjectBulkreplace)                           | Replace subject&#39;s roles and divisions with the exact list supplied in the request.                         |
| [**postAuthorizationSubjectDivisionRole**](UsersApi.md#postAuthorizationSubjectDivisionRole)                         | Make a grant of a role in a division                                                                           |
| [**postUserInvite**](UsersApi.md#postUserInvite)                                                                     | Send an activation email to the user                                                                           |
| [**postUserPassword**](UsersApi.md#postUserPassword)                                                                 | Change a users password                                                                                        |
| [**postUserRoutinglanguages**](UsersApi.md#postUserRoutinglanguages)                                                 | Add routing language to user                                                                                   |
| [**postUserRoutingskills**](UsersApi.md#postUserRoutingskills)                                                       | Add routing skill to user                                                                                      |
| [**postUsers**](UsersApi.md#postUsers)                                                                               | Create user                                                                                                    |
| [**postUsersDevelopmentActivitiesAggregatesQuery**](UsersApi.md#postUsersDevelopmentActivitiesAggregatesQuery)       | Retrieve aggregated development activity data                                                                  |
| [**postUsersMePassword**](UsersApi.md#postUsersMePassword)                                                           | Change your password                                                                                           |
| [**postUsersSearch**](UsersApi.md#postUsersSearch)                                                                   | Search users                                                                                                   |
| [**putRoutingUserUtilization**](UsersApi.md#putRoutingUserUtilization)                                               | Update the user&#39;s max utilization settings. Include only those media types requiring custom configuration. |
| [**putUserCallforwarding**](UsersApi.md#putUserCallforwarding)                                                       | Update a user&#39;s CallForwarding                                                                             |
| [**putUserOutofoffice**](UsersApi.md#putUserOutofoffice)                                                             | Update an OutOfOffice                                                                                          |
| [**putUserProfileskills**](UsersApi.md#putUserProfileskills)                                                         | Update profile skills for a user                                                                               |
| [**putUserRoles**](UsersApi.md#putUserRoles)                                                                         | Sets the user&#39;s roles                                                                                      |
| [**putUserRoutingskill**](UsersApi.md#putUserRoutingskill)                                                           | Update routing skill proficiency or state.                                                                     |
| [**putUserRoutingskillsBulk**](UsersApi.md#putUserRoutingskillsBulk)                                                 | Replace all routing skills assigned to a user                                                                  |
| [**putUserRoutingstatus**](UsersApi.md#putUserRoutingstatus)                                                         | Update the routing status of a user                                                                            |
| [**putUserState**](UsersApi.md#putUserState)                                                                         | Update user state information.                                                                                 |
| [**putUserStationAssociatedstationStationId**](UsersApi.md#putUserStationAssociatedstationStationId)                 | Set associated station                                                                                         |
| [**putUserStationDefaultstationStationId**](UsersApi.md#putUserStationDefaultstationStationId)                       | Set default station                                                                                            |

{: class="table-striped"}

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsUsersDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteAnalyticsUsersDetailsJob");
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

<a name="deleteAuthorizationSubjectDivisionRole"></a>

# **deleteAuthorizationSubjectDivisionRole**

> Void deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId)

Delete a grant of a role in a division

Wraps DELETE /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}

Requires ANY permissions:

- authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division of the grant
String roleId = "roleId_example"; // String | the id of the role of the grant
try {
    apiInstance.deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                         | Notes |
| -------------- | ---------- | ----------------------------------- | ----- |
| **subjectId**  | **String** | Subject ID (user or group)          |
| **divisionId** | **String** | the id of the division of the grant |
| **roleId**     | **String** | the id of the role of the grant     |

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteRoutingUserUtilization(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteRoutingUserUtilization");
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

<a name="deleteUser"></a>

# **deleteUser**

> [Empty](Empty.md) deleteUser(userId)

Delete user

Wraps DELETE /api/v2/users/{userId}

Requires ANY permissions:

- directory:user:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    Empty result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
try {
    apiInstance.deleteUserRoutinglanguage(userId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoutinglanguage");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
try {
    apiInstance.deleteUserRoutingskill(userId, skillId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserRoutingskill");
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

<a name="deleteUserStationAssociatedstation"></a>

# **deleteUserStationAssociatedstation**

> Void deleteUserStationAssociatedstation(userId)

Clear associated station

Wraps DELETE /api/v2/users/{userId}/station/associatedstation

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationAssociatedstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationAssociatedstation");
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

<a name="deleteUserStationDefaultstation"></a>

# **deleteUserStationDefaultstation**

> Void deleteUserStationDefaultstation(userId)

Clear default station

Wraps DELETE /api/v2/users/{userId}/station/defaultstation

Requires ANY permissions:

- telephony:plugin:all
- telephony:phone:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteUserStationDefaultstation(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserStationDefaultstation");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsUsersDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJob");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsUserDetailsAsyncQueryResponse result = apiInstance.getAnalyticsUsersDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJobResults");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsUsersDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAnalyticsUsersDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse.md)

<a name="getAuthorizationDivisionspermittedMe"></a>

# **getAuthorizationDivisionspermittedMe**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [List&lt;AuthzDivision&gt;](AuthzDivision.md) getAuthorizationDivisionspermittedMe(permission, name)

Returns which divisions the current user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedMe(permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedMe");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                                                                    | Notes      |
| -------------- | ---------- | ------------------------------------------------------------------------------ | ---------- |
| **permission** | **String** | The permission string, including the object to access, e.g. routing:queue:view |
| **name**       | **String** | Search term to filter by division name                                         | [optional] |

{: class="table-striped"}

### Return type

[**List&lt;AuthzDivision&gt;**](AuthzDivision.md)

<a name="getAuthorizationDivisionspermittedPagedMe"></a>

# **getAuthorizationDivisionspermittedPagedMe**

> [DivsPermittedEntityListing](DivsPermittedEntityListing.md) getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize)

Returns which divisions the current user has the given permission in.

Wraps GET /api/v2/authorization/divisionspermitted/paged/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedPagedMe");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                                                    | Notes                      |
| -------------- | ----------- | ------------------------------------------------------------------------------ | -------------------------- |
| **permission** | **String**  | The permission string, including the object to access, e.g. routing:queue:view |
| **pageNumber** | **Integer** | Page number                                                                    | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size                                                                      | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing.md)

<a name="getAuthorizationDivisionspermittedPagedSubjectId"></a>

# **getAuthorizationDivisionspermittedPagedSubjectId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [DivsPermittedEntityListing](DivsPermittedEntityListing.md) getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize)

Returns which divisions the specified user has the given permission in.

This route is deprecated, use authorization/divisionspermitted/paged/me instead.

Wraps GET /api/v2/authorization/divisionspermitted/paged/{subjectId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationDivisionspermittedPagedSubjectId");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                                                    | Notes                      |
| -------------- | ----------- | ------------------------------------------------------------------------------ | -------------------------- |
| **subjectId**  | **String**  | Subject ID (user or group)                                                     |
| **permission** | **String**  | The permission string, including the object to access, e.g. routing:queue:view |
| **pageNumber** | **Integer** | Page number                                                                    | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size                                                                      | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**DivsPermittedEntityListing**](DivsPermittedEntityListing.md)

<a name="getAuthorizationSubject"></a>

# **getAuthorizationSubject**

> [AuthzSubject](AuthzSubject.md) getAuthorizationSubject(subjectId)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/authorization/subjects/{subjectId}

Requires ANY permissions:

- authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
try {
    AuthzSubject result = apiInstance.getAuthorizationSubject(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationSubject");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                | Notes |
| ------------- | ---------- | -------------------------- | ----- |
| **subjectId** | **String** | Subject ID (user or group) |

{: class="table-striped"}

### Return type

[**AuthzSubject**](AuthzSubject.md)

<a name="getAuthorizationSubjectsMe"></a>

# **getAuthorizationSubjectsMe**

> [AuthzSubject](AuthzSubject.md) getAuthorizationSubjectsMe()

Returns a listing of roles and permissions for the currently authenticated user.

Wraps GET /api/v2/authorization/subjects/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
try {
    AuthzSubject result = apiInstance.getAuthorizationSubjectsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getAuthorizationSubjectsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AuthzSubject**](AuthzSubject.md)

<a name="getFieldconfig"></a>

# **getFieldconfig**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [FieldConfig](FieldConfig.md) getFieldconfig(type)

Fetch field config for an entity type

Wraps GET /api/v2/fieldconfig

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getFieldconfig");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type       | Description | Notes                                                 |
| -------- | ---------- | ----------- | ----------------------------------------------------- |
| **type** | **String** | Field type  | <br />**Values**: person, group, org, externalContact |

{: class="table-striped"}

### Return type

[**FieldConfig**](FieldConfig.md)

<a name="getProfilesUsers"></a>

# **getProfilesUsers**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UserProfileEntityListing](UserProfileEntityListing.md) getProfilesUsers(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource)

Get a user profile listing

This api is deprecated. User /api/v2/users

Wraps GET /api/v2/profiles/users

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList("id_example"); // List<String> | id
List<String> jid = Arrays.asList("jid_example"); // List<String> | jid
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\".
try {
    UserProfileEntityListing result = apiInstance.getProfilesUsers(pageSize, pageNumber, id, jid, sortOrder, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getProfilesUsers");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description                                                                                                                                              | Notes                                                                                                                                           |
| ----------------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| **pageSize**                  | **Integer**                         | Page size                                                                                                                                                | [optional] [default to 25]                                                                                                                      |
| **pageNumber**                | **Integer**                         | Page number                                                                                                                                              | [optional] [default to 1]                                                                                                                       |
| **id**                        | [**List&lt;String&gt;**](String.md) | id                                                                                                                                                       | [optional]                                                                                                                                      |
| **jid**                       | [**List&lt;String&gt;**](String.md) | jid                                                                                                                                                      | [optional]                                                                                                                                      |
| **sortOrder**                 | **String**                          | Ascending or descending sort order                                                                                                                       | [optional] [default to ASC]<br />**Values**: ascending, descending                                                                              |
| **expand**                    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand                                                                                                                          | [optional]<br />**Values**: routingStatus, presence, integrationPresence, conversationSummary, outOfOffice, geolocation, station, authorization |
| **integrationPresenceSource** | **String**                          | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral                                                                              |

{: class="table-striped"}

### Return type

[**UserProfileEntityListing**](UserProfileEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    AgentMaxUtilization result = apiInstance.getRoutingUserUtilization(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoutingUserUtilization");
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

<a name="getUser"></a>

# **getUser**

> [User](User.md) getUser(userId, expand, integrationPresenceSource, state)

Get user.

Wraps GET /api/v2/users/{userId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for a user instead of their default.
String state = "active"; // String | Search for a user with this state
try {
    User result = apiInstance.getUser(userId, expand, integrationPresenceSource, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description                                                       | Notes                                                                                                                                                                                                                                                                                                         |
| ----------------------------- | ----------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId**                    | **String**                          | User ID                                                           |
| **expand**                    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand                                   | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |
| **integrationPresenceSource** | **String**                          | Gets an integration presence for a user instead of their default. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral                                                                                                                                                                                                                                            |
| **state**                     | **String**                          | Search for a user with this state                                 | [optional] [default to active]<br />**Values**: active, deleted                                                                                                                                                                                                                                               |

{: class="table-striped"}

### Return type

[**User**](User.md)

<a name="getUserAdjacents"></a>

# **getUserAdjacents**

> [Adjacents](Adjacents.md) getUserAdjacents(userId, expand)

Get adjacents

Wraps GET /api/v2/users/{userId}/adjacents

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    Adjacents result = apiInstance.getUserAdjacents(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserAdjacents");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                         |
| ---------- | ----------------------------------- | ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId** | **String**                          | User ID                         |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |

{: class="table-striped"}

### Return type

[**Adjacents**](Adjacents.md)

<a name="getUserCallforwarding"></a>

# **getUserCallforwarding**

> [CallForwarding](CallForwarding.md) getUserCallforwarding(userId)

Get a user&#39;s CallForwarding

Wraps GET /api/v2/users/{userId}/callforwarding

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    CallForwarding result = apiInstance.getUserCallforwarding(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserCallforwarding");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**CallForwarding**](CallForwarding.md)

<a name="getUserDirectreports"></a>

# **getUserDirectreports**

> [List&lt;User&gt;](User.md) getUserDirectreports(userId, expand)

Get direct reports

Wraps GET /api/v2/users/{userId}/directreports

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserDirectreports(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDirectreports");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                         |
| ---------- | ----------------------------------- | ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId** | **String**                          | User ID                         |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |

{: class="table-striped"}

### Return type

[**List&lt;User&gt;**](User.md)

<a name="getUserFavorites"></a>

# **getUserFavorites**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UserEntityListing](UserEntityListing.md) getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand)

Deprecated; will be revived with new contract

Wraps GET /api/v2/users/{userId}/favorites

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UserEntityListing result = apiInstance.getUserFavorites(userId, pageSize, pageNumber, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserFavorites");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                         |
| -------------- | ----------------------------------- | ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId**     | **String**                          | User ID                         |
| **pageSize**   | **Integer**                         | Page size                       | [optional] [default to 25]                                                                                                                                                                                                                                                                                    |
| **pageNumber** | **Integer**                         | Page number                     | [optional] [default to 1]                                                                                                                                                                                                                                                                                     |
| **sortOrder**  | **String**                          | Sort order                      | [optional] [default to ASC]                                                                                                                                                                                                                                                                                   |
| **expand**     | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |

{: class="table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.md)

<a name="getUserGeolocation"></a>

# **getUserGeolocation**

> [Geolocation](Geolocation.md) getUserGeolocation(userId, clientId)

Get a user&#39;s Geolocation

Wraps GET /api/v2/users/{userId}/geolocations/{clientId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
try {
    Geolocation result = apiInstance.getUserGeolocation(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserGeolocation");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **userId**   | **String** | user Id     |
| **clientId** | **String** | client Id   |

{: class="table-striped"}

### Return type

[**Geolocation**](Geolocation.md)

<a name="getUserOutofoffice"></a>

# **getUserOutofoffice**

> [OutOfOffice](OutOfOffice.md) getUserOutofoffice(userId)

Get a OutOfOffice

Wraps GET /api/v2/users/{userId}/outofoffice

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    OutOfOffice result = apiInstance.getUserOutofoffice(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserOutofoffice");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**OutOfOffice**](OutOfOffice.md)

<a name="getUserProfile"></a>

# **getUserProfile**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [UserProfile](UserProfile.md) getUserProfile(userId, expand, integrationPresenceSource)

Get user profile

This api has been deprecated. Use api/v2/users instead

Wraps GET /api/v2/users/{userId}/profile

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | userId
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for a user instead of their default.
try {
    UserProfile result = apiInstance.getUserProfile(userId, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfile");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description                                                       | Notes                                                                                                                                                                                       |
| ----------------------------- | ----------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId**                    | **String**                          | userId                                                            |
| **expand**                    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand                                   | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team |
| **integrationPresenceSource** | **String**                          | Gets an integration presence for a user instead of their default. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral                                                                                                                          |

{: class="table-striped"}

### Return type

[**UserProfile**](UserProfile.md)

<a name="getUserProfileskills"></a>

# **getUserProfileskills**

> List&lt;String&gt; getUserProfileskills(userId)

List profile skills for a user

Wraps GET /api/v2/users/{userId}/profileskills

Requires ANY permissions:

- directory:userProfile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    List<String> result = apiInstance.getUserProfileskills(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserProfileskills");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

**List&lt;String&gt;**

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
Boolean joined = true; // Boolean | Is joined to the queue
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.getUserQueues(userId, pageSize, pageNumber, joined, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserQueues");
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

<a name="getUserRoles"></a>

# **getUserRoles**

> [UserAuthorization](UserAuthorization.md) getUserRoles(userId)

Returns a listing of roles and permissions for a user.

Wraps GET /api/v2/users/{userId}/roles

Requires ANY permissions:

- authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoles");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**UserAuthorization**](UserAuthorization.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserLanguageEntityListing result = apiInstance.getUserRoutinglanguages(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutinglanguages");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ASC"; // String | Ascending or descending sort order
try {
    UserSkillEntityListing result = apiInstance.getUserRoutingskills(userId, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutingskills");
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

<a name="getUserRoutingstatus"></a>

# **getUserRoutingstatus**

> [RoutingStatus](RoutingStatus.md) getUserRoutingstatus(userId)

Fetch the routing status of a user

Wraps GET /api/v2/users/{userId}/routingstatus

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    RoutingStatus result = apiInstance.getUserRoutingstatus(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserRoutingstatus");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**RoutingStatus**](RoutingStatus.md)

<a name="getUserState"></a>

# **getUserState**

> [UserState](UserState.md) getUserState(userId)

Get user state information.

Wraps GET /api/v2/users/{userId}/state

Requires ANY permissions:

- directory:userStateChange:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserState result = apiInstance.getUserState(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserState");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**UserState**](UserState.md)

<a name="getUserStation"></a>

# **getUserStation**

> [UserStations](UserStations.md) getUserStation(userId)

Get station information for user

Wraps GET /api/v2/users/{userId}/station

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
try {
    UserStations result = apiInstance.getUserStation(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserStation");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** | User ID     |

{: class="table-striped"}

### Return type

[**UserStations**](UserStations.md)

<a name="getUserSuperiors"></a>

# **getUserSuperiors**

> [List&lt;User&gt;](User.md) getUserSuperiors(userId, expand)

Get superiors

Wraps GET /api/v2/users/{userId}/superiors

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    List<User> result = apiInstance.getUserSuperiors(userId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSuperiors");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                                                                                                                                                                                                                                                                                         |
| ---------- | ----------------------------------- | ------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **userId** | **String**                          | User ID                         |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |

{: class="table-striped"}

### Return type

[**List&lt;User&gt;**](User.md)

<a name="getUserTrustors"></a>

# **getUserTrustors**

> [TrustorEntityListing](TrustorEntityListing.md) getUserTrustors(userId, pageSize, pageNumber)

List the organizations that have authorized/trusted the user.

Wraps GET /api/v2/users/{userId}/trustors

Requires ALL permissions:

- authorization:orgTrustor:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TrustorEntityListing result = apiInstance.getUserTrustors(userId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserTrustors");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **userId**     | **String**  | User ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**TrustorEntityListing**](TrustorEntityListing.md)

<a name="getUsers"></a>

# **getUsers**

> [UserEntityListing](UserEntityListing.md) getUsers(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state)

Get the list of available users.

Wraps GET /api/v2/users

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> id = Arrays.asList("id_example"); // List<String> | A list of user IDs to fetch by bulk
List<String> jabberId = Arrays.asList("jabberId_example"); // List<String> | A list of jabberIds to fetch by bulk (cannot be used with the \"id\" parameter)
String sortOrder = "ASC"; // String | Ascending or descending sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100.
String state = "active"; // String | Only list users of this state
try {
    UserEntityListing result = apiInstance.getUsers(pageSize, pageNumber, id, jabberId, sortOrder, expand, integrationPresenceSource, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description                                                                                                                                                                                                                                 | Notes                                                                                                                                                                                                                                                                                                         |
| ----------------------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **pageSize**                  | **Integer**                         | Page size                                                                                                                                                                                                                                   | [optional] [default to 25]                                                                                                                                                                                                                                                                                    |
| **pageNumber**                | **Integer**                         | Page number                                                                                                                                                                                                                                 | [optional] [default to 1]                                                                                                                                                                                                                                                                                     |
| **id**                        | [**List&lt;String&gt;**](String.md) | A list of user IDs to fetch by bulk                                                                                                                                                                                                         | [optional]                                                                                                                                                                                                                                                                                                    |
| **jabberId**                  | [**List&lt;String&gt;**](String.md) | A list of jabberIds to fetch by bulk (cannot be used with the \&quot;id\&quot; parameter)                                                                                                                                                   | [optional]                                                                                                                                                                                                                                                                                                    |
| **sortOrder**                 | **String**                          | Ascending or descending sort order                                                                                                                                                                                                          | [optional] [default to ASC]<br />**Values**: ascending, descending                                                                                                                                                                                                                                            |
| **expand**                    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand                                                                                                                                                                                                             | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography |
| **integrationPresenceSource** | **String**                          | Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. When using this parameter the maximum number of users that can be returned is 100. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral                                                                                                                                                                                                                                            |
| **state**                     | **String**                          | Only list users of this state                                                                                                                                                                                                               | [optional] [default to active]<br />**Values**: active, inactive, deleted, any                                                                                                                                                                                                                                |

{: class="table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.md)

<a name="getUsersDevelopmentActivities"></a>

# **getUsersDevelopmentActivities**

> [DevelopmentActivityListing](DevelopmentActivityListing.md) getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities

Either moduleId or userId is required. Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities

Requires ANY permissions:

- learning:assignment:view
- coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<String> userId = Arrays.asList("userId_example"); // List<String> | Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId.
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the activity types.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList("relationship_example"); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivities(userId, moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivities");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                | Description                                                                                                                                                                                                                                                                                     | Notes                                                                            |
| ---------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| **userId**             | [**List&lt;String&gt;**](String.md) | Specifies the list of user IDs to be queried, up to 100 user IDs. It searches for any relationship for the userId.                                                                                                                                                                              | [optional]                                                                       |
| **moduleId**           | **String**                          | Specifies the ID of the learning module.                                                                                                                                                                                                                                                        | [optional]                                                                       |
| **interval**           | **String**                          | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss                                  | [optional]                                                                       |
| **completionInterval** | **String**                          | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss                                           | [optional]                                                                       |
| **overdue**            | **String**                          | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned                                                                                                                                                                                | [optional] [default to Any]<br />**Values**: True, False, Any                    |
| **pageSize**           | **Integer**                         | Page size                                                                                                                                                                                                                                                                                       | [optional] [default to 25]                                                       |
| **pageNumber**         | **Integer**                         | Page number                                                                                                                                                                                                                                                                                     | [optional] [default to 1]                                                        |
| **sortOrder**          | **String**                          | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)                                                                                                                                                                               | [optional] [default to Desc]<br />**Values**: Asc, Desc                          |
| **types**              | [**List&lt;String&gt;**](String.md) | Specifies the activity types.                                                                                                                                                                                                                                                                   | [optional]<br />**Values**: Informational, Coaching, AssessedContent, Assessment |
| **statuses**           | [**List&lt;String&gt;**](String.md) | Specifies the activity statuses to filter by                                                                                                                                                                                                                                                    | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule      |
| **relationship**       | [**List&lt;String&gt;**](String.md) | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. | [optional]<br />**Values**: Creator, Facilitator, Attendee                       |

{: class="table-striped"}

### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing.md)

<a name="getUsersDevelopmentActivitiesMe"></a>

# **getUsersDevelopmentActivitiesMe**

> [DevelopmentActivityListing](DevelopmentActivityListing.md) getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship)

Get list of Development Activities for current user

Results are filtered based on the applicable permissions.

Wraps GET /api/v2/users/development/activities/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String moduleId = "moduleId_example"; // String | Specifies the ID of the learning module.
String interval = "interval_example"; // String | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String completionInterval = "completionInterval_example"; // String | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "Any"; // String | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "Desc"; // String | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)
List<String> types = Arrays.asList("types_example"); // List<String> | Specifies the activity types.
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Specifies the activity statuses to filter by
List<String> relationship = Arrays.asList("relationship_example"); // List<String> | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied.
try {
    DevelopmentActivityListing result = apiInstance.getUsersDevelopmentActivitiesMe(moduleId, interval, completionInterval, overdue, pageSize, pageNumber, sortOrder, types, statuses, relationship);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivitiesMe");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                | Description                                                                                                                                                                                                                                                                                     | Notes                                                                            |
| ---------------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| **moduleId**           | **String**                          | Specifies the ID of the learning module.                                                                                                                                                                                                                                                        | [optional]                                                                       |
| **interval**           | **String**                          | Specifies the dateDue range to be queried. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss                                  | [optional]                                                                       |
| **completionInterval** | **String**                          | Specifies the range of completion dates to be used for filtering. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss                                           | [optional]                                                                       |
| **overdue**            | **String**                          | Specifies if non-overdue, overdue, or all activities are returned. If not specified, all activities are returned                                                                                                                                                                                | [optional] [default to Any]<br />**Values**: True, False, Any                    |
| **pageSize**           | **Integer**                         | Page size                                                                                                                                                                                                                                                                                       | [optional] [default to 25]                                                       |
| **pageNumber**         | **Integer**                         | Page number                                                                                                                                                                                                                                                                                     | [optional] [default to 1]                                                        |
| **sortOrder**          | **String**                          | Specifies result set sort order sorted by the date due; if not specified, default sort order is descending (Desc)                                                                                                                                                                               | [optional] [default to Desc]<br />**Values**: Asc, Desc                          |
| **types**              | [**List&lt;String&gt;**](String.md) | Specifies the activity types.                                                                                                                                                                                                                                                                   | [optional]<br />**Values**: Informational, Coaching, AssessedContent, Assessment |
| **statuses**           | [**List&lt;String&gt;**](String.md) | Specifies the activity statuses to filter by                                                                                                                                                                                                                                                    | [optional]<br />**Values**: Planned, InProgress, Completed, InvalidSchedule      |
| **relationship**       | [**List&lt;String&gt;**](String.md) | Specifies how the current user relation should be interpreted, and filters the activities returned to only the activities that have the specified relationship. If a value besides Attendee is specified, it will only return Coaching Appointments. If not specified, no filtering is applied. | [optional]<br />**Values**: Creator, Facilitator, Attendee                       |

{: class="table-striped"}

### Return type

[**DevelopmentActivityListing**](DevelopmentActivityListing.md)

<a name="getUsersDevelopmentActivity"></a>

# **getUsersDevelopmentActivity**

> [DevelopmentActivity](DevelopmentActivity.md) getUsersDevelopmentActivity(activityId, type)

Get a Development Activity

Permission not required if you are the attendee, creator or facilitator of the coaching appointment or you are the assigned user of the learning assignment.

Wraps GET /api/v2/users/development/activities/{activityId}

Requires ANY permissions:

- learning:assignment:view
- coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String activityId = "activityId_example"; // String | Specifies the activity ID, maps to either assignment or appointment ID
String type = "type_example"; // String | Specifies the activity type.
try {
    DevelopmentActivity result = apiInstance.getUsersDevelopmentActivity(activityId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersDevelopmentActivity");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                                                            | Notes                                                                  |
| -------------- | ---------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| **activityId** | **String** | Specifies the activity ID, maps to either assignment or appointment ID |
| **type**       | **String** | Specifies the activity type.                                           | <br />**Values**: Informational, Coaching, AssessedContent, Assessment |

{: class="table-striped"}

### Return type

[**DevelopmentActivity**](DevelopmentActivity.md)

<a name="getUsersMe"></a>

# **getUsersMe**

> [UserMe](UserMe.md) getUsersMe(expand, integrationPresenceSource)

Get current user details.

This request is not valid when using the Client Credentials OAuth grant.

Wraps GET /api/v2/users/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
String integrationPresenceSource = "integrationPresenceSource_example"; // String | Get your presence for a given integration. This parameter will only be used when presence is provided as an \"expand\".
try {
    UserMe result = apiInstance.getUsersMe(expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersMe");
    e.printStackTrace();
}
```

### Parameters

| Name                          | Type                                | Description                                                                                                                       | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| ----------------------------- | ----------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **expand**                    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                                                                                  | [optional]<br />**Values**: routingStatus, presence, conversationSummary, outOfOffice, geolocation, station, authorization, lasttokenissued, dateLastLogin, authorization.unusedRoles, team, profileSkills, certifications, locations, groups, skills, languages, languagePreference, employerInfo, biography, date, geolocationsettings, organization, presencedefinitions, locationdefinitions, orgauthorization, orgproducts, favorites, superiors, directreports, adjacents, routingskills, routinglanguages, fieldconfigs, token, trustors, logCapture |
| **integrationPresenceSource** | **String**                          | Get your presence for a given integration. This parameter will only be used when presence is provided as an \&quot;expand\&quot;. | [optional]<br />**Values**: MicrosoftTeams, ZoomPhone, RingCentral                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

{: class="table-striped"}

### Return type

[**UserMe**](UserMe.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
String integrationPresenceSource = "integrationPresenceSource_example"; // String | integrationPresenceSource
try {
    UsersSearchResponse result = apiInstance.getUsersSearch(q64, expand, integrationPresenceSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersSearch");
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

<a name="patchUser"></a>

# **patchUser**

> [User](User.md) patchUser(userId, body)

Update user

Wraps PATCH /api/v2/users/{userId}

Requires ANY permissions:

- directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UpdateUser body = new UpdateUser(); // UpdateUser | User
try {
    User result = apiInstance.patchUser(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUser");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                            | Description | Notes |
| ---------- | ------------------------------- | ----------- | ----- |
| **userId** | **String**                      | User ID     |
| **body**   | [**UpdateUser**](UpdateUser.md) | User        |

{: class="table-striped"}

### Return type

[**User**](User.md)

<a name="patchUserCallforwarding"></a>

# **patchUserCallforwarding**

> [CallForwarding](CallForwarding.md) patchUserCallforwarding(userId, body)

Patch a user&#39;s CallForwarding

Wraps PATCH /api/v2/users/{userId}/callforwarding

Requires ANY permissions:

- conversation:callForwarding:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.patchUserCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserCallforwarding");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                    | Description     | Notes |
| ---------- | --------------------------------------- | --------------- | ----- |
| **userId** | **String**                              | User ID         |
| **body**   | [**CallForwarding**](CallForwarding.md) | Call forwarding |

{: class="table-striped"}

### Return type

[**CallForwarding**](CallForwarding.md)

<a name="patchUserGeolocation"></a>

# **patchUserGeolocation**

> [Geolocation](Geolocation.md) patchUserGeolocation(userId, clientId, body)

Patch a user&#39;s Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source. Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values. This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;. Option 3: Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values. Option 1 can be combined with Option 2 or Option 3. For example, update the client as primary and provide latitude and longitude values.

Wraps PATCH /api/v2/users/{userId}/geolocations/{clientId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
Geolocation body = new Geolocation(); // Geolocation | Geolocation
try {
    Geolocation result = apiInstance.patchUserGeolocation(userId, clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserGeolocation");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                              | Description | Notes |
| ------------ | --------------------------------- | ----------- | ----- |
| **userId**   | **String**                        | user Id     |
| **clientId** | **String**                        | client Id   |
| **body**     | [**Geolocation**](Geolocation.md) | Geolocation |

{: class="table-striped"}

### Return type

[**Geolocation**](Geolocation.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String queueId = "queueId_example"; // String | Queue ID
String userId = "userId_example"; // String | User ID
UserQueue body = new UserQueue(); // UserQueue | Queue Member
try {
    UserQueue result = apiInstance.patchUserQueue(queueId, userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserQueue");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserQueue> body = Arrays.asList(new UserQueue()); // List<UserQueue> | User Queues
List<String> divisionId = Arrays.asList("divisionId_example"); // List<String> | Division ID(s)
try {
    UserQueueEntityListing result = apiInstance.patchUserQueues(userId, body, divisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserQueues");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String languageId = "languageId_example"; // String | languageId
UserRoutingLanguage body = new UserRoutingLanguage(); // UserRoutingLanguage | Language
try {
    UserRoutingLanguage result = apiInstance.patchUserRoutinglanguage(userId, languageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutinglanguage");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingLanguagePost> body = Arrays.asList(new UserRoutingLanguagePost()); // List<UserRoutingLanguagePost> | Language
try {
    UserLanguageEntityListing result = apiInstance.patchUserRoutinglanguagesBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutinglanguagesBulk");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.patchUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUserRoutingskillsBulk");
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

<a name="patchUsersBulk"></a>

# **patchUsersBulk**

> [UserEntityListing](UserEntityListing.md) patchUsersBulk(body)

Update bulk acd autoanswer on users

Wraps PATCH /api/v2/users/bulk

Requires ANY permissions:

- directory:user:add
- directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
List<PatchUser> body = Arrays.asList(new PatchUser()); // List<PatchUser> | Users
try {
    UserEntityListing result = apiInstance.patchUsersBulk(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#patchUsersBulk");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description | Notes |
| -------- | ----------------------------------------- | ----------- | ----- |
| **body** | [**List&lt;PatchUser&gt;**](PatchUser.md) | Users       |

{: class="table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserAggregationQuery body = new UserAggregationQuery(); // UserAggregationQuery | query
try {
    UserAggregateQueryResponse result = apiInstance.postAnalyticsUsersAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersAggregatesQuery");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
AsyncUserDetailsQuery body = new AsyncUserDetailsQuery(); // AsyncUserDetailsQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsUsersDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersDetailsJobs");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserDetailsQuery body = new UserDetailsQuery(); // UserDetailsQuery | query
try {
    AnalyticsUserDetailsQueryResponse result = apiInstance.postAnalyticsUsersDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersDetailsQuery");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserObservationQuery body = new UserObservationQuery(); // UserObservationQuery | query
try {
    UserObservationQueryResponse result = apiInstance.postAnalyticsUsersObservationsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAnalyticsUsersObservationsQuery");
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

<a name="postAuthorizationSubjectBulkadd"></a>

# **postAuthorizationSubjectBulkadd**

> Void postAuthorizationSubjectBulkadd(subjectId, body, subjectType)

Bulk-grant roles and divisions to a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkadd

Requires ANY permissions:

- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkadd(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkadd");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                            | Description                                                            | Notes                           |
| --------------- | ----------------------------------------------- | ---------------------------------------------------------------------- | ------------------------------- |
| **subjectId**   | **String**                                      | Subject ID (user or group)                                             |
| **body**        | [**RoleDivisionGrants**](RoleDivisionGrants.md) | Pairs of role and division IDs                                         |
| **subjectType** | **String**                                      | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postAuthorizationSubjectBulkremove"></a>

# **postAuthorizationSubjectBulkremove**

> Void postAuthorizationSubjectBulkremove(subjectId, body)

Bulk-remove grants from a subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkremove

Requires ANY permissions:

- authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
try {
    apiInstance.postAuthorizationSubjectBulkremove(subjectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkremove");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                            | Description                    | Notes |
| ------------- | ----------------------------------------------- | ------------------------------ | ----- |
| **subjectId** | **String**                                      | Subject ID (user or group)     |
| **body**      | [**RoleDivisionGrants**](RoleDivisionGrants.md) | Pairs of role and division IDs |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postAuthorizationSubjectBulkreplace"></a>

# **postAuthorizationSubjectBulkreplace**

> Void postAuthorizationSubjectBulkreplace(subjectId, body, subjectType)

Replace subject&#39;s roles and divisions with the exact list supplied in the request.

This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.

Wraps POST /api/v2/authorization/subjects/{subjectId}/bulkreplace

Requires ALL permissions:

- authorization:grant:add
- authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkreplace(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectBulkreplace");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                            | Description                                                            | Notes                           |
| --------------- | ----------------------------------------------- | ---------------------------------------------------------------------- | ------------------------------- |
| **subjectId**   | **String**                                      | Subject ID (user or group)                                             |
| **body**        | [**RoleDivisionGrants**](RoleDivisionGrants.md) | Pairs of role and division IDs                                         |
| **subjectType** | **String**                                      | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postAuthorizationSubjectDivisionRole"></a>

# **postAuthorizationSubjectDivisionRole**

> Void postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType)

Make a grant of a role in a division

Wraps POST /api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}

Requires ANY permissions:

- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division to which to make the grant
String roleId = "roleId_example"; // String | the id of the role to grant
String subjectType = "PC_USER"; // String | what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints)
try {
    apiInstance.postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postAuthorizationSubjectDivisionRole");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description                                                                                                                                                    | Notes                           |
| --------------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------- |
| **subjectId**   | **String** | Subject ID (user or group)                                                                                                                                     |
| **divisionId**  | **String** | the id of the division to which to make the grant                                                                                                              |
| **roleId**      | **String** | the id of the role to grant                                                                                                                                    |
| **subjectType** | **String** | what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints) | [optional] [default to PC_USER] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postUserInvite"></a>

# **postUserInvite**

> Void postUserInvite(userId, force)

Send an activation email to the user

Wraps POST /api/v2/users/{userId}/invite

Requires ANY permissions:

- directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Boolean force = false; // Boolean | Resend the invitation even if one is already outstanding
try {
    apiInstance.postUserInvite(userId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserInvite");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type        | Description                                              | Notes                         |
| ---------- | ----------- | -------------------------------------------------------- | ----------------------------- |
| **userId** | **String**  | User ID                                                  |
| **force**  | **Boolean** | Resend the invitation even if one is already outstanding | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postUserPassword"></a>

# **postUserPassword**

> Void postUserPassword(userId, body)

Change a users password

Wraps POST /api/v2/users/{userId}/password

Requires ANY permissions:

- directory:user:setPassword

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
ChangePasswordRequest body = new ChangePasswordRequest(); // ChangePasswordRequest | Password
try {
    apiInstance.postUserPassword(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserPassword");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                  | Description | Notes |
| ---------- | ----------------------------------------------------- | ----------- | ----- |
| **userId** | **String**                                            | User ID     |
| **body**   | [**ChangePasswordRequest**](ChangePasswordRequest.md) | Password    |

{: class="table-striped"}

### Return type

null (empty response body)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserRoutingLanguagePost body = new UserRoutingLanguagePost(); // UserRoutingLanguagePost | Language
try {
    UserRoutingLanguage result = apiInstance.postUserRoutinglanguages(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserRoutinglanguages");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserRoutingSkillPost body = new UserRoutingSkillPost(); // UserRoutingSkillPost | Skill
try {
    UserRoutingSkill result = apiInstance.postUserRoutingskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUserRoutingskills");
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

<a name="postUsers"></a>

# **postUsers**

> [User](User.md) postUsers(body)

Create user

Wraps POST /api/v2/users

Requires ANY permissions:

- directory:user:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
CreateUser body = new CreateUser(); // CreateUser | User
try {
    User result = apiInstance.postUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsers");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes |
| -------- | ------------------------------- | ----------- | ----- |
| **body** | [**CreateUser**](CreateUser.md) | User        |

{: class="table-striped"}

### Return type

[**User**](User.md)

<a name="postUsersDevelopmentActivitiesAggregatesQuery"></a>

# **postUsersDevelopmentActivitiesAggregatesQuery**

> [DevelopmentActivityAggregateResponse](DevelopmentActivityAggregateResponse.md) postUsersDevelopmentActivitiesAggregatesQuery(body)

Retrieve aggregated development activity data

Results are filtered based on the applicable permissions.

Wraps POST /api/v2/users/development/activities/aggregates/query

Requires ANY permissions:

- learning:assignment:view
- coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
DevelopmentActivityAggregateParam body = new DevelopmentActivityAggregateParam(); // DevelopmentActivityAggregateParam | Aggregate Request
try {
    DevelopmentActivityAggregateResponse result = apiInstance.postUsersDevelopmentActivitiesAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersDevelopmentActivitiesAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                          | Description       | Notes |
| -------- | ----------------------------------------------------------------------------- | ----------------- | ----- |
| **body** | [**DevelopmentActivityAggregateParam**](DevelopmentActivityAggregateParam.md) | Aggregate Request |

{: class="table-striped"}

### Return type

[**DevelopmentActivityAggregateResponse**](DevelopmentActivityAggregateResponse.md)

<a name="postUsersMePassword"></a>

# **postUsersMePassword**

> Void postUsersMePassword(body)

Change your password

Wraps POST /api/v2/users/me/password

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
ChangeMyPasswordRequest body = new ChangeMyPasswordRequest(); // ChangeMyPasswordRequest | Password
try {
    apiInstance.postUsersMePassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersMePassword");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description | Notes |
| -------- | --------------------------------------------------------- | ----------- | ----- |
| **body** | [**ChangeMyPasswordRequest**](ChangeMyPasswordRequest.md) | Password    |

{: class="table-striped"}

### Return type

null (empty response body)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
UserSearchRequest body = new UserSearchRequest(); // UserSearchRequest | Search request options
try {
    UsersSearchResponse result = apiInstance.postUsersSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#postUsersSearch");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
Utilization body = new Utilization(); // Utilization | utilization
try {
    AgentMaxUtilization result = apiInstance.putRoutingUserUtilization(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putRoutingUserUtilization");
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

<a name="putUserCallforwarding"></a>

# **putUserCallforwarding**

> [CallForwarding](CallForwarding.md) putUserCallforwarding(userId, body)

Update a user&#39;s CallForwarding

Wraps PUT /api/v2/users/{userId}/callforwarding

Requires ANY permissions:

- conversation:callForwarding:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
CallForwarding body = new CallForwarding(); // CallForwarding | Call forwarding
try {
    CallForwarding result = apiInstance.putUserCallforwarding(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserCallforwarding");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                    | Description     | Notes |
| ---------- | --------------------------------------- | --------------- | ----- |
| **userId** | **String**                              | User ID         |
| **body**   | [**CallForwarding**](CallForwarding.md) | Call forwarding |

{: class="table-striped"}

### Return type

[**CallForwarding**](CallForwarding.md)

<a name="putUserOutofoffice"></a>

# **putUserOutofoffice**

> [OutOfOffice](OutOfOffice.md) putUserOutofoffice(userId, body)

Update an OutOfOffice

Wraps PUT /api/v2/users/{userId}/outofoffice

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
OutOfOffice body = new OutOfOffice(); // OutOfOffice | The updated OutOffOffice
try {
    OutOfOffice result = apiInstance.putUserOutofoffice(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserOutofoffice");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                              | Description              | Notes |
| ---------- | --------------------------------- | ------------------------ | ----- |
| **userId** | **String**                        | User ID                  |
| **body**   | [**OutOfOffice**](OutOfOffice.md) | The updated OutOffOffice |

{: class="table-striped"}

### Return type

[**OutOfOffice**](OutOfOffice.md)

<a name="putUserProfileskills"></a>

# **putUserProfileskills**

> List&lt;String&gt; putUserProfileskills(userId, body)

Update profile skills for a user

Wraps PUT /api/v2/users/{userId}/profileskills

Requires ANY permissions:

- directory:userProfile:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | Skills
try {
    List<String> result = apiInstance.putUserProfileskills(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserProfileskills");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                   | Description | Notes |
| ---------- | ---------------------- | ----------- | ----- |
| **userId** | **String**             | User ID     |
| **body**   | **List&lt;String&gt;** | Skills      |

{: class="table-striped"}

### Return type

**List&lt;String&gt;**

<a name="putUserRoles"></a>

# **putUserRoles**

> [UserAuthorization](UserAuthorization.md) putUserRoles(userId, body)

Sets the user&#39;s roles

Wraps PUT /api/v2/users/{userId}/roles

Requires ANY permissions:

- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoles");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                   | Description   | Notes |
| ---------- | ---------------------- | ------------- | ----- |
| **userId** | **String**             | User ID       |
| **body**   | **List&lt;String&gt;** | List of roles |

{: class="table-striped"}

### Return type

[**UserAuthorization**](UserAuthorization.md)

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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String skillId = "skillId_example"; // String | skillId
UserRoutingSkill body = new UserRoutingSkill(); // UserRoutingSkill | Skill
try {
    UserRoutingSkill result = apiInstance.putUserRoutingskill(userId, skillId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingskill");
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
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
List<UserRoutingSkillPost> body = Arrays.asList(new UserRoutingSkillPost()); // List<UserRoutingSkillPost> | Skill
try {
    UserSkillEntityListing result = apiInstance.putUserRoutingskillsBulk(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingskillsBulk");
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

<a name="putUserRoutingstatus"></a>

# **putUserRoutingstatus**

> [RoutingStatus](RoutingStatus.md) putUserRoutingstatus(userId, body)

Update the routing status of a user

Wraps PUT /api/v2/users/{userId}/routingstatus

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
RoutingStatus body = new RoutingStatus(); // RoutingStatus | Routing Status
try {
    RoutingStatus result = apiInstance.putUserRoutingstatus(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserRoutingstatus");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                  | Description    | Notes |
| ---------- | ------------------------------------- | -------------- | ----- |
| **userId** | **String**                            | User ID        |
| **body**   | [**RoutingStatus**](RoutingStatus.md) | Routing Status |

{: class="table-striped"}

### Return type

[**RoutingStatus**](RoutingStatus.md)

<a name="putUserState"></a>

# **putUserState**

> [UserState](UserState.md) putUserState(userId, body)

Update user state information.

Wraps PUT /api/v2/users/{userId}/state

Requires ANY permissions:

- directory:user:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
UserState body = new UserState(); // UserState | User
try {
    UserState result = apiInstance.putUserState(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserState");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                          | Description | Notes |
| ---------- | ----------------------------- | ----------- | ----- |
| **userId** | **String**                    | User ID     |
| **body**   | [**UserState**](UserState.md) | User        |

{: class="table-striped"}

### Return type

[**UserState**](UserState.md)

<a name="putUserStationAssociatedstationStationId"></a>

# **putUserStationAssociatedstationStationId**

> Void putUserStationAssociatedstationStationId(userId, stationId)

Set associated station

Wraps PUT /api/v2/users/{userId}/station/associatedstation/{stationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationAssociatedstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationAssociatedstationStationId");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **userId**    | **String** | User ID     |
| **stationId** | **String** | stationId   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="putUserStationDefaultstationStationId"></a>

# **putUserStationDefaultstationStationId**

> Void putUserStationDefaultstationStationId(userId, stationId)

Set default station

Wraps PUT /api/v2/users/{userId}/station/defaultstation/{stationId}

Requires ANY permissions:

- telephony:plugin:all
- telephony:phone:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User ID
String stationId = "stationId_example"; // String | stationId
try {
    apiInstance.putUserStationDefaultstationStationId(userId, stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#putUserStationDefaultstationStationId");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **userId**    | **String** | User ID     |
| **stationId** | **String** | stationId   |

{: class="table-striped"}

### Return type

null (empty response body)
