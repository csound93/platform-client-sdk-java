---
title: GamificationApi
---

## GamificationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                | Description                                                                                                  |
| --------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------ |
| [**getGamificationLeaderboard**](GamificationApi.md#getGamificationLeaderboard)                                       | Leaderboard of the requesting user&#39;s division or performance profile                                     |
| [**getGamificationLeaderboardAll**](GamificationApi.md#getGamificationLeaderboardAll)                                 | Leaderboard by filter type                                                                                   |
| [**getGamificationLeaderboardAllBestpoints**](GamificationApi.md#getGamificationLeaderboardAllBestpoints)             | Best Points by division or performance profile                                                               |
| [**getGamificationLeaderboardBestpoints**](GamificationApi.md#getGamificationLeaderboardBestpoints)                   | Best Points of the requesting user&#39;s current performance profile or division                             |
| [**getGamificationMetric**](GamificationApi.md#getGamificationMetric)                                                 | Gamified metric by id                                                                                        |
| [**getGamificationMetricdefinition**](GamificationApi.md#getGamificationMetricdefinition)                             | Metric definition by id                                                                                      |
| [**getGamificationMetricdefinitions**](GamificationApi.md#getGamificationMetricdefinitions)                           | All metric definitions                                                                                       |
| [**getGamificationMetrics**](GamificationApi.md#getGamificationMetrics)                                               | All gamified metrics for a given profile                                                                     |
| [**getGamificationProfile**](GamificationApi.md#getGamificationProfile)                                               | Performance profile by id                                                                                    |
| [**getGamificationProfileMembers**](GamificationApi.md#getGamificationProfileMembers)                                 | Members of a given performance profile                                                                       |
| [**getGamificationProfileMetric**](GamificationApi.md#getGamificationProfileMetric)                                   | Performance profile gamified metric by id                                                                    |
| [**getGamificationProfileMetrics**](GamificationApi.md#getGamificationProfileMetrics)                                 | All gamified metrics for a given performance profile                                                         |
| [**getGamificationProfileMetricsObjectivedetails**](GamificationApi.md#getGamificationProfileMetricsObjectivedetails) | All metrics for a given performance profile with objective details such as order and maxPoints               |
| [**getGamificationProfiles**](GamificationApi.md#getGamificationProfiles)                                             | All performance profiles                                                                                     |
| [**getGamificationProfilesUser**](GamificationApi.md#getGamificationProfilesUser)                                     | Performance profile of a user                                                                                |
| [**getGamificationProfilesUsersMe**](GamificationApi.md#getGamificationProfilesUsersMe)                               | Performance profile of the requesting user                                                                   |
| [**getGamificationScorecards**](GamificationApi.md#getGamificationScorecards)                                         | Workday performance metrics of the requesting user                                                           |
| [**getGamificationScorecardsAttendance**](GamificationApi.md#getGamificationScorecardsAttendance)                     | Attendance status metrics of the requesting user                                                             |
| [**getGamificationScorecardsBestpoints**](GamificationApi.md#getGamificationScorecardsBestpoints)                     | Best points of the requesting user                                                                           |
| [**getGamificationScorecardsPointsAlltime**](GamificationApi.md#getGamificationScorecardsPointsAlltime)               | All-time points of the requesting user                                                                       |
| [**getGamificationScorecardsPointsAverage**](GamificationApi.md#getGamificationScorecardsPointsAverage)               | Average points of the requesting user&#39;s division or performance profile                                  |
| [**getGamificationScorecardsPointsTrends**](GamificationApi.md#getGamificationScorecardsPointsTrends)                 | Points trends of the requesting user                                                                         |
| [**getGamificationScorecardsUser**](GamificationApi.md#getGamificationScorecardsUser)                                 | Workday performance metrics for a user                                                                       |
| [**getGamificationScorecardsUserAttendance**](GamificationApi.md#getGamificationScorecardsUserAttendance)             | Attendance status metrics for a user                                                                         |
| [**getGamificationScorecardsUserBestpoints**](GamificationApi.md#getGamificationScorecardsUserBestpoints)             | Best points of a user                                                                                        |
| [**getGamificationScorecardsUserPointsAlltime**](GamificationApi.md#getGamificationScorecardsUserPointsAlltime)       | All-time points for a user                                                                                   |
| [**getGamificationScorecardsUserPointsTrends**](GamificationApi.md#getGamificationScorecardsUserPointsTrends)         | Points trend for a user                                                                                      |
| [**getGamificationScorecardsUserValuesTrends**](GamificationApi.md#getGamificationScorecardsUserValuesTrends)         | Values trends of a user                                                                                      |
| [**getGamificationScorecardsUsersPointsAverage**](GamificationApi.md#getGamificationScorecardsUsersPointsAverage)     | Workday average points by target group                                                                       |
| [**getGamificationScorecardsUsersValuesAverage**](GamificationApi.md#getGamificationScorecardsUsersValuesAverage)     | Workday average values by target group                                                                       |
| [**getGamificationScorecardsUsersValuesTrends**](GamificationApi.md#getGamificationScorecardsUsersValuesTrends)       | Values trend by target group                                                                                 |
| [**getGamificationScorecardsValuesAverage**](GamificationApi.md#getGamificationScorecardsValuesAverage)               | Average values of the requesting user&#39;s division or performance profile                                  |
| [**getGamificationScorecardsValuesTrends**](GamificationApi.md#getGamificationScorecardsValuesTrends)                 | Values trends of the requesting user or group                                                                |
| [**getGamificationStatus**](GamificationApi.md#getGamificationStatus)                                                 | Gamification activation status                                                                               |
| [**getGamificationTemplate**](GamificationApi.md#getGamificationTemplate)                                             | Objective template by id                                                                                     |
| [**getGamificationTemplates**](GamificationApi.md#getGamificationTemplates)                                           | All objective templates                                                                                      |
| [**postGamificationMetrics**](GamificationApi.md#postGamificationMetrics)                                             | Creates a gamified metric with a given metric definition and metric objective                                |
| [**postGamificationProfileActivate**](GamificationApi.md#postGamificationProfileActivate)                             | Activate a performance profile                                                                               |
| [**postGamificationProfileDeactivate**](GamificationApi.md#postGamificationProfileDeactivate)                         | Deactivate a performance profile                                                                             |
| [**postGamificationProfileMembers**](GamificationApi.md#postGamificationProfileMembers)                               | Assign members to a given performance profile                                                                |
| [**postGamificationProfileMembersValidate**](GamificationApi.md#postGamificationProfileMembersValidate)               | Validate member assignment                                                                                   |
| [**postGamificationProfileMetricLink**](GamificationApi.md#postGamificationProfileMetricLink)                         | Creates a linked metric                                                                                      |
| [**postGamificationProfileMetrics**](GamificationApi.md#postGamificationProfileMetrics)                               | Creates a gamified metric with a given metric definition and metric objective under in a performance profile |
| [**postGamificationProfiles**](GamificationApi.md#postGamificationProfiles)                                           | Create a new custom performance profile                                                                      |
| [**putGamificationMetric**](GamificationApi.md#putGamificationMetric)                                                 | Updates a metric                                                                                             |
| [**putGamificationProfile**](GamificationApi.md#putGamificationProfile)                                               | Updates a performance profile                                                                                |
| [**putGamificationProfileMetric**](GamificationApi.md#putGamificationProfileMetric)                                   | Updates a metric in performance profile                                                                      |
| [**putGamificationStatus**](GamificationApi.md#putGamificationStatus)                                                 | Update gamification activation status                                                                        |

{: class="table-striped"}

<a name="getGamificationLeaderboard"></a>

# **getGamificationLeaderboard**

> [Leaderboard](Leaderboard.md) getGamificationLeaderboard(startWorkday, endWorkday, metricId)

Leaderboard of the requesting user&#39;s division or performance profile

Wraps GET /api/v2/gamification/leaderboard

Requires ANY permissions:

- gamification:leaderboard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String metricId = "metricId_example"; // String | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.
try {
    Leaderboard result = apiInstance.getGamificationLeaderboard(startWorkday, endWorkday, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboard");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                         | Notes      |
| ---------------- | ------------- | ------------------------------------------------------------------------------------------------------------------- | ---------- |
| **startWorkday** | **LocalDate** | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **metricId**     | **String**    | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.               | [optional] |

{: class="table-striped"}

### Return type

[**Leaderboard**](Leaderboard.md)

<a name="getGamificationLeaderboardAll"></a>

# **getGamificationLeaderboardAll**

> [Leaderboard](Leaderboard.md) getGamificationLeaderboardAll(filterType, filterId, startWorkday, endWorkday, metricId)

Leaderboard by filter type

Wraps GET /api/v2/gamification/leaderboard/all

Requires ANY permissions:

- gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division or performance profile Id
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String metricId = "metricId_example"; // String | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.
try {
    Leaderboard result = apiInstance.getGamificationLeaderboardAll(filterType, filterId, startWorkday, endWorkday, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardAll");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                         | Notes                                          |
| ---------------- | ------------- | ------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **filterType**   | **String**    | Filter type for the query request.                                                                                  | <br />**Values**: PerformanceProfile, Division |
| **filterId**     | **String**    | ID for the filter type. For example, division or performance profile Id                                             |
| **startWorkday** | **LocalDate** | Start workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday to retrieve for the leaderboard. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **metricId**     | **String**    | Metric Id for which the leaderboard is to be generated. The total points is used if nothing is given.               | [optional]                                     |

{: class="table-striped"}

### Return type

[**Leaderboard**](Leaderboard.md)

<a name="getGamificationLeaderboardAllBestpoints"></a>

# **getGamificationLeaderboardAllBestpoints**

> [OverallBestPoints](OverallBestPoints.md) getGamificationLeaderboardAllBestpoints(filterType, filterId)

Best Points by division or performance profile

Wraps GET /api/v2/gamification/leaderboard/all/bestpoints

Requires ANY permissions:

- gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division or performance profile Id
try {
    OverallBestPoints result = apiInstance.getGamificationLeaderboardAllBestpoints(filterType, filterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardAllBestpoints");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description                                                             | Notes                                          |
| -------------- | ---------- | ----------------------------------------------------------------------- | ---------------------------------------------- |
| **filterType** | **String** | Filter type for the query request.                                      | <br />**Values**: PerformanceProfile, Division |
| **filterId**   | **String** | ID for the filter type. For example, division or performance profile Id |

{: class="table-striped"}

### Return type

[**OverallBestPoints**](OverallBestPoints.md)

<a name="getGamificationLeaderboardBestpoints"></a>

# **getGamificationLeaderboardBestpoints**

> [OverallBestPoints](OverallBestPoints.md) getGamificationLeaderboardBestpoints()

Best Points of the requesting user&#39;s current performance profile or division

Wraps GET /api/v2/gamification/leaderboard/bestpoints

Requires ANY permissions:

- gamification:leaderboard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    OverallBestPoints result = apiInstance.getGamificationLeaderboardBestpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationLeaderboardBestpoints");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**OverallBestPoints**](OverallBestPoints.md)

<a name="getGamificationMetric"></a>

# **getGamificationMetric**

> [Metric](Metric.md) getGamificationMetric(metricId, workday, performanceProfileId)

Gamified metric by id

Wraps GET /api/v2/gamification/metrics/{metricId}

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:view
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricId = "metricId_example"; // String | metric Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
try {
    Metric result = apiInstance.getGamificationMetric(metricId, workday, performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetric");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type          | Description                                                                                                                                                  | Notes      |
| ------------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **metricId**             | **String**    | metric Id                                                                                                                                                    |
| **workday**              | **LocalDate** | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **performanceProfileId** | **String**    | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.                                                   | [optional] |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="getGamificationMetricdefinition"></a>

# **getGamificationMetricdefinition**

> [MetricDefinition](MetricDefinition.md) getGamificationMetricdefinition(metricDefinitionId)

Metric definition by id

Wraps GET /api/v2/gamification/metricdefinitions/{metricDefinitionId}

Requires ANY permissions:

- gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricDefinitionId = "metricDefinitionId_example"; // String | metric definition id
try {
    MetricDefinition result = apiInstance.getGamificationMetricdefinition(metricDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetricdefinition");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description          | Notes |
| ---------------------- | ---------- | -------------------- | ----- |
| **metricDefinitionId** | **String** | metric definition id |

{: class="table-striped"}

### Return type

[**MetricDefinition**](MetricDefinition.md)

<a name="getGamificationMetricdefinitions"></a>

# **getGamificationMetricdefinitions**

> [GetMetricDefinitionsResponse](GetMetricDefinitionsResponse.md) getGamificationMetricdefinitions()

All metric definitions

Retrieves the metric definitions and their corresponding default objectives used to create a gamified metric

Wraps GET /api/v2/gamification/metricdefinitions

Requires ANY permissions:

- gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetMetricDefinitionsResponse result = apiInstance.getGamificationMetricdefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetricdefinitions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GetMetricDefinitionsResponse**](GetMetricDefinitionsResponse.md)

<a name="getGamificationMetrics"></a>

# **getGamificationMetrics**

> [GetMetricsResponse](GetMetricsResponse.md) getGamificationMetrics(performanceProfileId, workday)

All gamified metrics for a given profile

Wraps GET /api/v2/gamification/metrics

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:view
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricsResponse result = apiInstance.getGamificationMetrics(performanceProfileId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type          | Description                                                                                                                                                  | Notes      |
| ------------------------ | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **performanceProfileId** | **String**    | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.                                                   | [optional] |
| **workday**              | **LocalDate** | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |

{: class="table-striped"}

### Return type

[**GetMetricsResponse**](GetMetricsResponse.md)

<a name="getGamificationProfile"></a>

# **getGamificationProfile**

> [PerformanceProfile](PerformanceProfile.md) getGamificationProfile(performanceProfileId)

Performance profile by id

Wraps GET /api/v2/gamification/profiles/{performanceProfileId}

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:viewAll
- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.getGamificationProfile(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfile");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type       | Description            | Notes |
| ------------------------ | ---------- | ---------------------- | ----- |
| **performanceProfileId** | **String** | Performance Profile Id |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="getGamificationProfileMembers"></a>

# **getGamificationProfileMembers**

> [MemberListing](MemberListing.md) getGamificationProfileMembers(performanceProfileId)

Members of a given performance profile

Wraps GET /api/v2/gamification/profiles/{performanceProfileId}/members

Requires ANY permissions:

- gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    MemberListing result = apiInstance.getGamificationProfileMembers(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type       | Description            | Notes |
| ------------------------ | ---------- | ---------------------- | ----- |
| **performanceProfileId** | **String** | Performance Profile Id |

{: class="table-striped"}

### Return type

[**MemberListing**](MemberListing.md)

<a name="getGamificationProfileMetric"></a>

# **getGamificationProfileMetric**

> [Metric](Metric.md) getGamificationProfileMetric(profileId, metricId, workday)

Performance profile gamified metric by id

Wraps GET /api/v2/gamification/profiles/{profileId}/metrics/{metricId}

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:view
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
String metricId = "metricId_example"; // String | Metric Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    Metric result = apiInstance.getGamificationProfileMetric(profileId, metricId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetric");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type          | Description                                                                                                                                                  | Notes      |
| ------------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **profileId** | **String**    | Performance Profile Id                                                                                                                                       |
| **metricId**  | **String**    | Metric Id                                                                                                                                                    |
| **workday**   | **LocalDate** | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="getGamificationProfileMetrics"></a>

# **getGamificationProfileMetrics**

> [GetMetricResponse](GetMetricResponse.md) getGamificationProfileMetrics(profileId, expand, workday)

All gamified metrics for a given performance profile

Wraps GET /api/v2/gamification/profiles/{profileId}/metrics

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:view
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricResponse result = apiInstance.getGamificationProfileMetrics(profileId, expand, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description                                                                                                                                                  | Notes                                 |
| ------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------- |
| **profileId** | **String**                          | Performance Profile Id                                                                                                                                       |
| **expand**    | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                                                                                                             | [optional]<br />**Values**: objective |
| **workday**   | **LocalDate**                       | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional]                            |

{: class="table-striped"}

### Return type

[**GetMetricResponse**](GetMetricResponse.md)

<a name="getGamificationProfileMetricsObjectivedetails"></a>

# **getGamificationProfileMetricsObjectivedetails**

> [GetMetricsResponse](GetMetricsResponse.md) getGamificationProfileMetricsObjectivedetails(profileId, workday)

All metrics for a given performance profile with objective details such as order and maxPoints

Wraps GET /api/v2/gamification/profiles/{profileId}/metrics/objectivedetails

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:view
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
LocalDate workday = new LocalDate(); // LocalDate | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    GetMetricsResponse result = apiInstance.getGamificationProfileMetricsObjectivedetails(profileId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfileMetricsObjectivedetails");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type          | Description                                                                                                                                                  | Notes      |
| ------------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **profileId** | **String**    | Performance Profile Id                                                                                                                                       |
| **workday**   | **LocalDate** | The objective query workday. If not specified, then it retrieves the current objective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |

{: class="table-striped"}

### Return type

[**GetMetricsResponse**](GetMetricsResponse.md)

<a name="getGamificationProfiles"></a>

# **getGamificationProfiles**

> [GetProfilesResponse](GetProfilesResponse.md) getGamificationProfiles()

All performance profiles

Wraps GET /api/v2/gamification/profiles

Requires ANY permissions:

- gamification:profile:view
- gamification:leaderboard:viewAll
- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetProfilesResponse result = apiInstance.getGamificationProfiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfiles");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GetProfilesResponse**](GetProfilesResponse.md)

<a name="getGamificationProfilesUser"></a>

# **getGamificationProfilesUser**

> [PerformanceProfile](PerformanceProfile.md) getGamificationProfilesUser(userId, workday)

Performance profile of a user

Wraps GET /api/v2/gamification/profiles/users/{userId}

Requires ANY permissions:

- gamification:profile:view
- gamification:scorecard:viewAll
- gamification:leaderboard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    PerformanceProfile result = apiInstance.getGamificationProfilesUser(userId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfilesUser");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type          | Description                                                                                                                                                  | Notes      |
| ----------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **userId**  | **String**    |                                                                                                                                                              |
| **workday** | **LocalDate** | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="getGamificationProfilesUsersMe"></a>

# **getGamificationProfilesUsersMe**

> [PerformanceProfile](PerformanceProfile.md) getGamificationProfilesUsersMe(workday)

Performance profile of the requesting user

Wraps GET /api/v2/gamification/profiles/users/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    PerformanceProfile result = apiInstance.getGamificationProfilesUsersMe(workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationProfilesUsersMe");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type          | Description                                                                                                                                                  | Notes      |
| ----------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **workday** | **LocalDate** | Target querying workday. If not provided, then queries the current performance profile. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="getGamificationScorecards"></a>

# **getGamificationScorecards**

> [WorkdayMetricListing](WorkdayMetricListing.md) getGamificationScorecards(workday, expand)

Workday performance metrics of the requesting user

Wraps GET /api/v2/gamification/scorecards

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    WorkdayMetricListing result = apiInstance.getGamificationScorecards(workday, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecards");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                                                                                   | Notes                                 |
| ----------- | ----------------------------------- | --------------------------------------------------------------------------------------------- | ------------------------------------- |
| **workday** | **LocalDate**                       | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                                              | [optional]<br />**Values**: objective |

{: class="table-striped"}

### Return type

[**WorkdayMetricListing**](WorkdayMetricListing.md)

<a name="getGamificationScorecardsAttendance"></a>

# **getGamificationScorecardsAttendance**

> [AttendanceStatusListing](AttendanceStatusListing.md) getGamificationScorecardsAttendance(startWorkday, endWorkday)

Attendance status metrics of the requesting user

Wraps GET /api/v2/gamification/scorecards/attendance

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AttendanceStatusListing result = apiInstance.getGamificationScorecardsAttendance(startWorkday, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsAttendance");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | ----- |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |

{: class="table-striped"}

### Return type

[**AttendanceStatusListing**](AttendanceStatusListing.md)

<a name="getGamificationScorecardsBestpoints"></a>

# **getGamificationScorecardsBestpoints**

> [UserBestPoints](UserBestPoints.md) getGamificationScorecardsBestpoints()

Best points of the requesting user

Wraps GET /api/v2/gamification/scorecards/bestpoints

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    UserBestPoints result = apiInstance.getGamificationScorecardsBestpoints();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsBestpoints");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**UserBestPoints**](UserBestPoints.md)

<a name="getGamificationScorecardsPointsAlltime"></a>

# **getGamificationScorecardsPointsAlltime**

> [AllTimePoints](AllTimePoints.md) getGamificationScorecardsPointsAlltime(endWorkday)

All-time points of the requesting user

Wraps GET /api/v2/gamification/scorecards/points/alltime

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AllTimePoints result = apiInstance.getGamificationScorecardsPointsAlltime(endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsAlltime");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type          | Description                                                                                                  | Notes |
| -------------- | ------------- | ------------------------------------------------------------------------------------------------------------ | ----- |
| **endWorkday** | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |

{: class="table-striped"}

### Return type

[**AllTimePoints**](AllTimePoints.md)

<a name="getGamificationScorecardsPointsAverage"></a>

# **getGamificationScorecardsPointsAverage**

> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints.md) getGamificationScorecardsPointsAverage(workday)

Average points of the requesting user&#39;s division or performance profile

Wraps GET /api/v2/gamification/scorecards/points/average

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    SingleWorkdayAveragePoints result = apiInstance.getGamificationScorecardsPointsAverage(workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsAverage");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type          | Description                                                                              | Notes |
| ----------- | ------------- | ---------------------------------------------------------------------------------------- | ----- |
| **workday** | **LocalDate** | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |

{: class="table-striped"}

### Return type

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints.md)

<a name="getGamificationScorecardsPointsTrends"></a>

# **getGamificationScorecardsPointsTrends**

> [WorkdayPointsTrend](WorkdayPointsTrend.md) getGamificationScorecardsPointsTrends(startWorkday, endWorkday, dayOfWeek)

Points trends of the requesting user

Wraps GET /api/v2/gamification/scorecards/points/trends

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String dayOfWeek = "dayOfWeek_example"; // String | Optional filter to specify which day of weeks to be included in the response
try {
    WorkdayPointsTrend result = apiInstance.getGamificationScorecardsPointsTrends(startWorkday, endWorkday, dayOfWeek);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsPointsTrends");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes                                                                                      |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **dayOfWeek**    | **String**    | Optional filter to specify which day of weeks to be included in the response                                   | [optional]<br />**Values**: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday |

{: class="table-striped"}

### Return type

[**WorkdayPointsTrend**](WorkdayPointsTrend.md)

<a name="getGamificationScorecardsUser"></a>

# **getGamificationScorecardsUser**

> [WorkdayMetricListing](WorkdayMetricListing.md) getGamificationScorecardsUser(userId, workday, expand)

Workday performance metrics for a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate workday = new LocalDate(); // LocalDate | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    WorkdayMetricListing result = apiInstance.getGamificationScorecardsUser(userId, workday, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUser");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                                                                                   | Notes                                 |
| ----------- | ----------------------------------- | --------------------------------------------------------------------------------------------- | ------------------------------------- |
| **userId**  | **String**                          |                                                                                               |
| **workday** | **LocalDate**                       | Target querying workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                                              | [optional]<br />**Values**: objective |

{: class="table-striped"}

### Return type

[**WorkdayMetricListing**](WorkdayMetricListing.md)

<a name="getGamificationScorecardsUserAttendance"></a>

# **getGamificationScorecardsUserAttendance**

> [AttendanceStatusListing](AttendanceStatusListing.md) getGamificationScorecardsUserAttendance(userId, startWorkday, endWorkday)

Attendance status metrics for a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}/attendance

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AttendanceStatusListing result = apiInstance.getGamificationScorecardsUserAttendance(userId, startWorkday, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserAttendance");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | ----- |
| **userId**       | **String**    |                                                                                                                |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |

{: class="table-striped"}

### Return type

[**AttendanceStatusListing**](AttendanceStatusListing.md)

<a name="getGamificationScorecardsUserBestpoints"></a>

# **getGamificationScorecardsUserBestpoints**

> [UserBestPoints](UserBestPoints.md) getGamificationScorecardsUserBestpoints(userId)

Best points of a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}/bestpoints

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
try {
    UserBestPoints result = apiInstance.getGamificationScorecardsUserBestpoints(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserBestpoints");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **userId** | **String** |             |

{: class="table-striped"}

### Return type

[**UserBestPoints**](UserBestPoints.md)

<a name="getGamificationScorecardsUserPointsAlltime"></a>

# **getGamificationScorecardsUserPointsAlltime**

> [AllTimePoints](AllTimePoints.md) getGamificationScorecardsUserPointsAlltime(userId, endWorkday)

All-time points for a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}/points/alltime

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    AllTimePoints result = apiInstance.getGamificationScorecardsUserPointsAlltime(userId, endWorkday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserPointsAlltime");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type          | Description                                                                                                  | Notes |
| -------------- | ------------- | ------------------------------------------------------------------------------------------------------------ | ----- |
| **userId**     | **String**    |                                                                                                              |
| **endWorkday** | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |

{: class="table-striped"}

### Return type

[**AllTimePoints**](AllTimePoints.md)

<a name="getGamificationScorecardsUserPointsTrends"></a>

# **getGamificationScorecardsUserPointsTrends**

> [WorkdayPointsTrend](WorkdayPointsTrend.md) getGamificationScorecardsUserPointsTrends(userId, startWorkday, endWorkday, dayOfWeek)

Points trend for a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}/points/trends

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String dayOfWeek = "dayOfWeek_example"; // String | Optional filter to specify which day of weeks to be included in the response
try {
    WorkdayPointsTrend result = apiInstance.getGamificationScorecardsUserPointsTrends(userId, startWorkday, endWorkday, dayOfWeek);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserPointsTrends");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes                                                                                      |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| **userId**       | **String**    |                                                                                                                |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **dayOfWeek**    | **String**    | Optional filter to specify which day of weeks to be included in the response                                   | [optional]<br />**Values**: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday |

{: class="table-striped"}

### Return type

[**WorkdayPointsTrend**](WorkdayPointsTrend.md)

<a name="getGamificationScorecardsUserValuesTrends"></a>

# **getGamificationScorecardsUserValuesTrends**

> [WorkdayValuesTrend](WorkdayValuesTrend.md) getGamificationScorecardsUserValuesTrends(userId, startWorkday, endWorkday, timeZone)

Values trends of a user

Wraps GET /api/v2/gamification/scorecards/users/{userId}/values/trends

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String userId = "userId_example"; // String |
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsUserValuesTrends(userId, startWorkday, endWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUserValuesTrends");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes                       |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | --------------------------- |
| **userId**       | **String**    |                                                                                                                |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **timeZone**     | **String**    | Timezone for the workday. Defaults to UTC                                                                      | [optional] [default to UTC] |

{: class="table-striped"}

### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.md)

<a name="getGamificationScorecardsUsersPointsAverage"></a>

# **getGamificationScorecardsUsersPointsAverage**

> [SingleWorkdayAveragePoints](SingleWorkdayAveragePoints.md) getGamificationScorecardsUsersPointsAverage(filterType, filterId, workday)

Workday average points by target group

Wraps GET /api/v2/gamification/scorecards/users/points/average

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
try {
    SingleWorkdayAveragePoints result = apiInstance.getGamificationScorecardsUsersPointsAverage(filterType, filterId, workday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersPointsAverage");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type          | Description                                                                              | Notes                                          |
| -------------- | ------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **filterType** | **String**    | Filter type for the query request.                                                       | <br />**Values**: PerformanceProfile, Division |
| **filterId**   | **String**    | ID for the filter type.                                                                  |
| **workday**    | **LocalDate** | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |

{: class="table-striped"}

### Return type

[**SingleWorkdayAveragePoints**](SingleWorkdayAveragePoints.md)

<a name="getGamificationScorecardsUsersValuesAverage"></a>

# **getGamificationScorecardsUsersValuesAverage**

> [SingleWorkdayAverageValues](SingleWorkdayAverageValues.md) getGamificationScorecardsUsersValuesAverage(filterType, filterId, workday, timeZone)

Workday average values by target group

Wraps GET /api/v2/gamification/scorecards/users/values/average

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type. For example, division Id
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    SingleWorkdayAverageValues result = apiInstance.getGamificationScorecardsUsersValuesAverage(filterType, filterId, workday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersValuesAverage");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type          | Description                                                                              | Notes                                          |
| -------------- | ------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **filterType** | **String**    | Filter type for the query request.                                                       | <br />**Values**: PerformanceProfile, Division |
| **filterId**   | **String**    | ID for the filter type. For example, division Id                                         |
| **workday**    | **LocalDate** | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **timeZone**   | **String**    | Timezone for the workday. Defaults to UTC                                                | [optional] [default to UTC]                    |

{: class="table-striped"}

### Return type

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues.md)

<a name="getGamificationScorecardsUsersValuesTrends"></a>

# **getGamificationScorecardsUsersValuesTrends**

> [WorkdayValuesTrend](WorkdayValuesTrend.md) getGamificationScorecardsUsersValuesTrends(filterType, filterId, startWorkday, endWorkday, timeZone)

Values trend by target group

Wraps GET /api/v2/gamification/scorecards/users/values/trends

Requires ANY permissions:

- gamification:scorecard:viewAll

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String filterType = "filterType_example"; // String | Filter type for the query request.
String filterId = "filterId_example"; // String | ID for the filter type.
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsUsersValuesTrends(filterType, filterId, startWorkday, endWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsUsersValuesTrends");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type          | Description                                                                                                    | Notes                                          |
| ---------------- | ------------- | -------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| **filterType**   | **String**    | Filter type for the query request.                                                                             | <br />**Values**: PerformanceProfile, Division |
| **filterId**     | **String**    | ID for the filter type.                                                                                        |
| **startWorkday** | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **endWorkday**   | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   |
| **timeZone**     | **String**    | Timezone for the workday. Defaults to UTC                                                                      | [optional] [default to UTC]                    |

{: class="table-striped"}

### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.md)

<a name="getGamificationScorecardsValuesAverage"></a>

# **getGamificationScorecardsValuesAverage**

> [SingleWorkdayAverageValues](SingleWorkdayAverageValues.md) getGamificationScorecardsValuesAverage(workday, timeZone)

Average values of the requesting user&#39;s division or performance profile

Wraps GET /api/v2/gamification/scorecards/values/average

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate workday = new LocalDate(); // LocalDate | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    SingleWorkdayAverageValues result = apiInstance.getGamificationScorecardsValuesAverage(workday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsValuesAverage");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type          | Description                                                                              | Notes                       |
| ------------ | ------------- | ---------------------------------------------------------------------------------------- | --------------------------- |
| **workday**  | **LocalDate** | The target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |
| **timeZone** | **String**    | Timezone for the workday. Defaults to UTC                                                | [optional] [default to UTC] |

{: class="table-striped"}

### Return type

[**SingleWorkdayAverageValues**](SingleWorkdayAverageValues.md)

<a name="getGamificationScorecardsValuesTrends"></a>

# **getGamificationScorecardsValuesTrends**

> [WorkdayValuesTrend](WorkdayValuesTrend.md) getGamificationScorecardsValuesTrends(startWorkday, endWorkday, filterType, referenceWorkday, timeZone)

Values trends of the requesting user or group

Wraps GET /api/v2/gamification/scorecards/values/trends

Requires ANY permissions:

- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
LocalDate startWorkday = new LocalDate(); // LocalDate | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
LocalDate endWorkday = new LocalDate(); // LocalDate | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String filterType = "filterType_example"; // String | Filter type for the query request. If not set, then the request is for the requesting user.
LocalDate referenceWorkday = new LocalDate(); // LocalDate | Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user's current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
String timeZone = "UTC"; // String | Timezone for the workday. Defaults to UTC
try {
    WorkdayValuesTrend result = apiInstance.getGamificationScorecardsValuesTrends(startWorkday, endWorkday, filterType, referenceWorkday, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationScorecardsValuesTrends");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type          | Description                                                                                                                                                                                                                    | Notes                                                    |
| -------------------- | ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------- |
| **startWorkday**     | **LocalDate** | Start workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd                                                                                                                 |
| **endWorkday**       | **LocalDate** | End workday of querying workdays range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd                                                                                                                   |
| **filterType**       | **String**    | Filter type for the query request. If not set, then the request is for the requesting user.                                                                                                                                    | [optional]<br />**Values**: PerformanceProfile, Division |
| **referenceWorkday** | **LocalDate** | Reference workday for the trend. Used to determine the profile of the user as of this date. If not set, then the user&#39;s current profile will be used. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional]                                               |
| **timeZone**         | **String**    | Timezone for the workday. Defaults to UTC                                                                                                                                                                                      | [optional] [default to UTC]                              |

{: class="table-striped"}

### Return type

[**WorkdayValuesTrend**](WorkdayValuesTrend.md)

<a name="getGamificationStatus"></a>

# **getGamificationStatus**

> [GamificationStatus](GamificationStatus.md) getGamificationStatus()

Gamification activation status

Wraps GET /api/v2/gamification/status

Requires ANY permissions:

- gamification:profile:view
- gamification:profile:update
- gamification:scorecard:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GamificationStatus result = apiInstance.getGamificationStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationStatus");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GamificationStatus**](GamificationStatus.md)

<a name="getGamificationTemplate"></a>

# **getGamificationTemplate**

> [ObjectiveTemplate](ObjectiveTemplate.md) getGamificationTemplate(templateId)

Objective template by id

Wraps GET /api/v2/gamification/templates/{templateId}

Requires ANY permissions:

- gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String templateId = "templateId_example"; // String | template id
try {
    ObjectiveTemplate result = apiInstance.getGamificationTemplate(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **templateId** | **String** | template id |

{: class="table-striped"}

### Return type

[**ObjectiveTemplate**](ObjectiveTemplate.md)

<a name="getGamificationTemplates"></a>

# **getGamificationTemplates**

> [GetTemplatesResponse](GetTemplatesResponse.md) getGamificationTemplates()

All objective templates

Wraps GET /api/v2/gamification/templates

Requires ANY permissions:

- gamification:profile:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
try {
    GetTemplatesResponse result = apiInstance.getGamificationTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#getGamificationTemplates");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GetTemplatesResponse**](GetTemplatesResponse.md)

<a name="postGamificationMetrics"></a>

# **postGamificationMetrics**

> [Metric](Metric.md) postGamificationMetrics(body)

Creates a gamified metric with a given metric definition and metric objective

Wraps POST /api/v2/gamification/metrics

Requires ALL permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.postGamificationMetrics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description | Notes |
| -------- | ----------------------------------- | ----------- | ----- |
| **body** | [**CreateMetric**](CreateMetric.md) | Metric      |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="postGamificationProfileActivate"></a>

# **postGamificationProfileActivate**

> [PerformanceProfile](PerformanceProfile.md) postGamificationProfileActivate(performanceProfileId)

Activate a performance profile

Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/activate

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.postGamificationProfileActivate(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileActivate");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type       | Description            | Notes |
| ------------------------ | ---------- | ---------------------- | ----- |
| **performanceProfileId** | **String** | Performance Profile Id |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="postGamificationProfileDeactivate"></a>

# **postGamificationProfileDeactivate**

> [PerformanceProfile](PerformanceProfile.md) postGamificationProfileDeactivate(performanceProfileId)

Deactivate a performance profile

Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/deactivate

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
try {
    PerformanceProfile result = apiInstance.postGamificationProfileDeactivate(performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileDeactivate");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type       | Description            | Notes |
| ------------------------ | ---------- | ---------------------- | ----- |
| **performanceProfileId** | **String** | Performance Profile Id |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="postGamificationProfileMembers"></a>

# **postGamificationProfileMembers**

> [Assignment](Assignment.md) postGamificationProfileMembers(performanceProfileId, body)

Assign members to a given performance profile

Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/members

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
AssignUsers body = new AssignUsers(); // AssignUsers | assignUsers
try {
    Assignment result = apiInstance.postGamificationProfileMembers(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembers");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                              | Description            | Notes |
| ------------------------ | --------------------------------- | ---------------------- | ----- |
| **performanceProfileId** | **String**                        | Performance Profile Id |
| **body**                 | [**AssignUsers**](AssignUsers.md) | assignUsers            |

{: class="table-striped"}

### Return type

[**Assignment**](Assignment.md)

<a name="postGamificationProfileMembersValidate"></a>

# **postGamificationProfileMembersValidate**

> [AssignmentValidation](AssignmentValidation.md) postGamificationProfileMembersValidate(performanceProfileId, body)

Validate member assignment

Wraps POST /api/v2/gamification/profiles/{performanceProfileId}/members/validate

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
ValidateAssignUsers body = new ValidateAssignUsers(); // ValidateAssignUsers | memberAssignments
try {
    AssignmentValidation result = apiInstance.postGamificationProfileMembersValidate(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMembersValidate");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                              | Description            | Notes |
| ------------------------ | ------------------------------------------------- | ---------------------- | ----- |
| **performanceProfileId** | **String**                                        | Performance Profile Id |
| **body**                 | [**ValidateAssignUsers**](ValidateAssignUsers.md) | memberAssignments      |

{: class="table-striped"}

### Return type

[**AssignmentValidation**](AssignmentValidation.md)

<a name="postGamificationProfileMetricLink"></a>

# **postGamificationProfileMetricLink**

> [Metric](Metric.md) postGamificationProfileMetricLink(sourceProfileId, sourceMetricId, body)

Creates a linked metric

Wraps POST /api/v2/gamification/profiles/{sourceProfileId}/metrics/{sourceMetricId}/link

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String sourceProfileId = "sourceProfileId_example"; // String | Source Performance Profile Id
String sourceMetricId = "sourceMetricId_example"; // String | Source Metric Id
TargetPerformanceProfile body = new TargetPerformanceProfile(); // TargetPerformanceProfile | linkedMetric
try {
    Metric result = apiInstance.postGamificationProfileMetricLink(sourceProfileId, sourceMetricId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMetricLink");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                        | Description                   | Notes |
| ------------------- | ----------------------------------------------------------- | ----------------------------- | ----- |
| **sourceProfileId** | **String**                                                  | Source Performance Profile Id |
| **sourceMetricId**  | **String**                                                  | Source Metric Id              |
| **body**            | [**TargetPerformanceProfile**](TargetPerformanceProfile.md) | linkedMetric                  |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="postGamificationProfileMetrics"></a>

# **postGamificationProfileMetrics**

> [Metric](Metric.md) postGamificationProfileMetrics(profileId, body)

Creates a gamified metric with a given metric definition and metric objective under in a performance profile

Wraps POST /api/v2/gamification/profiles/{profileId}/metrics

Requires ALL permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.postGamificationProfileMetrics(profileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfileMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description            | Notes |
| ------------- | ----------------------------------- | ---------------------- | ----- |
| **profileId** | **String**                          | Performance Profile Id |
| **body**      | [**CreateMetric**](CreateMetric.md) | Metric                 |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="postGamificationProfiles"></a>

# **postGamificationProfiles**

> [PerformanceProfile](PerformanceProfile.md) postGamificationProfiles(body, copyMetrics)

Create a new custom performance profile

Wraps POST /api/v2/gamification/profiles

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
CreatePerformanceProfile body = new CreatePerformanceProfile(); // CreatePerformanceProfile | performanceProfile
Boolean copyMetrics = true; // Boolean | Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile.
try {
    PerformanceProfile result = apiInstance.postGamificationProfiles(body, copyMetrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#postGamificationProfiles");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                                        | Description                                                                                                                                                                                                                         | Notes                        |
| --------------- | ----------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------- |
| **body**        | [**CreatePerformanceProfile**](CreatePerformanceProfile.md) | performanceProfile                                                                                                                                                                                                                  |
| **copyMetrics** | **Boolean**                                                 | Flag to copy metrics. If set to false, there will be no metrics associated with the new profile. If set to true or is absent (the default behavior), all metrics from the default profile will be copied over into the new profile. | [optional] [default to true] |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="putGamificationMetric"></a>

# **putGamificationMetric**

> [Metric](Metric.md) putGamificationMetric(metricId, body, performanceProfileId)

Updates a metric

Wraps PUT /api/v2/gamification/metrics/{metricId}

Requires ALL permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String metricId = "metricId_example"; // String | metric Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
String performanceProfileId = "performanceProfileId_example"; // String | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given.
try {
    Metric result = apiInstance.putGamificationMetric(metricId, body, performanceProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationMetric");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                | Description                                                                                                | Notes      |
| ------------------------ | ----------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------- |
| **metricId**             | **String**                          | metric Id                                                                                                  |
| **body**                 | [**CreateMetric**](CreateMetric.md) | Metric                                                                                                     |
| **performanceProfileId** | **String**                          | The profile id of the metrics you are trying to retrieve. The DEFAULT profile is used if nothing is given. | [optional] |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="putGamificationProfile"></a>

# **putGamificationProfile**

> [PerformanceProfile](PerformanceProfile.md) putGamificationProfile(performanceProfileId, body)

Updates a performance profile

Wraps PUT /api/v2/gamification/profiles/{performanceProfileId}

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String performanceProfileId = "performanceProfileId_example"; // String | Performance Profile Id
PerformanceProfile body = new PerformanceProfile(); // PerformanceProfile | performanceProfile
try {
    PerformanceProfile result = apiInstance.putGamificationProfile(performanceProfileId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationProfile");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                            | Description            | Notes      |
| ------------------------ | ----------------------------------------------- | ---------------------- | ---------- |
| **performanceProfileId** | **String**                                      | Performance Profile Id |
| **body**                 | [**PerformanceProfile**](PerformanceProfile.md) | performanceProfile     | [optional] |

{: class="table-striped"}

### Return type

[**PerformanceProfile**](PerformanceProfile.md)

<a name="putGamificationProfileMetric"></a>

# **putGamificationProfileMetric**

> [Metric](Metric.md) putGamificationProfileMetric(profileId, metricId, body)

Updates a metric in performance profile

Wraps PUT /api/v2/gamification/profiles/{profileId}/metrics/{metricId}

Requires ALL permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
String profileId = "profileId_example"; // String | Performance Profile Id
String metricId = "metricId_example"; // String | Metric Id
CreateMetric body = new CreateMetric(); // CreateMetric | Metric
try {
    Metric result = apiInstance.putGamificationProfileMetric(profileId, metricId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationProfileMetric");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description            | Notes |
| ------------- | ----------------------------------- | ---------------------- | ----- |
| **profileId** | **String**                          | Performance Profile Id |
| **metricId**  | **String**                          | Metric Id              |
| **body**      | [**CreateMetric**](CreateMetric.md) | Metric                 |

{: class="table-striped"}

### Return type

[**Metric**](Metric.md)

<a name="putGamificationStatus"></a>

# **putGamificationStatus**

> [GamificationStatus](GamificationStatus.md) putGamificationStatus(status)

Update gamification activation status

Wraps PUT /api/v2/gamification/status

Requires ANY permissions:

- gamification:profile:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GamificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GamificationApi apiInstance = new GamificationApi();
GamificationStatus status = new GamificationStatus(); // GamificationStatus | Gamification status
try {
    GamificationStatus result = apiInstance.putGamificationStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationApi#putGamificationStatus");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                            | Description         | Notes |
| ---------- | ----------------------------------------------- | ------------------- | ----- |
| **status** | [**GamificationStatus**](GamificationStatus.md) | Gamification status |

{: class="table-striped"}

### Return type

[**GamificationStatus**](GamificationStatus.md)
