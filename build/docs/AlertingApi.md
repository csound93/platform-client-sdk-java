---
title: AlertingApi
---

## AlertingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                | Description                                         |
| ----------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| [**deleteAlertingInteractionstatsAlert**](AlertingApi.md#deleteAlertingInteractionstatsAlert)         | Delete an interaction stats alert                   |
| [**deleteAlertingInteractionstatsRule**](AlertingApi.md#deleteAlertingInteractionstatsRule)           | Delete an interaction stats rule.                   |
| [**getAlertingAlertsActive**](AlertingApi.md#getAlertingAlertsActive)                                 | Gets active alert count for a user.                 |
| [**getAlertingInteractionstatsAlert**](AlertingApi.md#getAlertingInteractionstatsAlert)               | Get an interaction stats alert                      |
| [**getAlertingInteractionstatsAlerts**](AlertingApi.md#getAlertingInteractionstatsAlerts)             | Get interaction stats alert list.                   |
| [**getAlertingInteractionstatsAlertsUnread**](AlertingApi.md#getAlertingInteractionstatsAlertsUnread) | Gets user unread count of interaction stats alerts. |
| [**getAlertingInteractionstatsRule**](AlertingApi.md#getAlertingInteractionstatsRule)                 | Get an interaction stats rule.                      |
| [**getAlertingInteractionstatsRules**](AlertingApi.md#getAlertingInteractionstatsRules)               | Get an interaction stats rule list.                 |
| [**postAlertingInteractionstatsRules**](AlertingApi.md#postAlertingInteractionstatsRules)             | Create an interaction stats rule.                   |
| [**putAlertingInteractionstatsAlert**](AlertingApi.md#putAlertingInteractionstatsAlert)               | Update an interaction stats alert read status       |
| [**putAlertingInteractionstatsRule**](AlertingApi.md#putAlertingInteractionstatsRule)                 | Update an interaction stats rule                    |

{: class="table-striped"}

<a name="deleteAlertingInteractionstatsAlert"></a>

# **deleteAlertingInteractionstatsAlert**

> Void deleteAlertingInteractionstatsAlert(alertId)

Delete an interaction stats alert

Wraps DELETE /api/v2/alerting/interactionstats/alerts/{alertId}

Requires ALL permissions:

- alerting:alert:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
try {
    apiInstance.deleteAlertingInteractionstatsAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsAlert");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **alertId** | **String** | Alert ID    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteAlertingInteractionstatsRule"></a>

# **deleteAlertingInteractionstatsRule**

> Void deleteAlertingInteractionstatsRule(ruleId)

Delete an interaction stats rule.

Wraps DELETE /api/v2/alerting/interactionstats/rules/{ruleId}

Requires ALL permissions:

- alerting:rule:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
try {
    apiInstance.deleteAlertingInteractionstatsRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#deleteAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **ruleId** | **String** | Rule ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getAlertingAlertsActive"></a>

# **getAlertingAlertsActive**

> [ActiveAlertCount](ActiveAlertCount.md) getAlertingAlertsActive()

Gets active alert count for a user.

Wraps GET /api/v2/alerting/alerts/active

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
try {
    ActiveAlertCount result = apiInstance.getAlertingAlertsActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingAlertsActive");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ActiveAlertCount**](ActiveAlertCount.md)

<a name="getAlertingInteractionstatsAlert"></a>

# **getAlertingInteractionstatsAlert**

> [InteractionStatsAlert](InteractionStatsAlert.md) getAlertingInteractionstatsAlert(alertId, expand)

Get an interaction stats alert

Wraps GET /api/v2/alerting/interactionstats/alerts/{alertId}

Requires ALL permissions:

- alerting:alert:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlert result = apiInstance.getAlertingInteractionstatsAlert(alertId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlert");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                     | Notes                                         |
| ----------- | ----------------------------------- | ------------------------------- | --------------------------------------------- |
| **alertId** | **String**                          | Alert ID                        |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsAlert**](InteractionStatsAlert.md)

<a name="getAlertingInteractionstatsAlerts"></a>

# **getAlertingInteractionstatsAlerts**

> [InteractionStatsAlertContainer](InteractionStatsAlertContainer.md) getAlertingInteractionstatsAlerts(expand)

Get interaction stats alert list.

Wraps GET /api/v2/alerting/interactionstats/alerts

Requires ALL permissions:

- alerting:alert:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsAlertContainer result = apiInstance.getAlertingInteractionstatsAlerts(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlerts");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                         |
| ---------- | ----------------------------------- | ------------------------------- | --------------------------------------------- |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsAlertContainer**](InteractionStatsAlertContainer.md)

<a name="getAlertingInteractionstatsAlertsUnread"></a>

# **getAlertingInteractionstatsAlertsUnread**

> [UnreadMetric](UnreadMetric.md) getAlertingInteractionstatsAlertsUnread()

Gets user unread count of interaction stats alerts.

Wraps GET /api/v2/alerting/interactionstats/alerts/unread

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
try {
    UnreadMetric result = apiInstance.getAlertingInteractionstatsAlertsUnread();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsAlertsUnread");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**UnreadMetric**](UnreadMetric.md)

<a name="getAlertingInteractionstatsRule"></a>

# **getAlertingInteractionstatsRule**

> [InteractionStatsRule](InteractionStatsRule.md) getAlertingInteractionstatsRule(ruleId, expand)

Get an interaction stats rule.

Wraps GET /api/v2/alerting/interactionstats/rules/{ruleId}

Requires ALL permissions:

- alerting:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.getAlertingInteractionstatsRule(ruleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                         |
| ---------- | ----------------------------------- | ------------------------------- | --------------------------------------------- |
| **ruleId** | **String**                          | Rule ID                         |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)

<a name="getAlertingInteractionstatsRules"></a>

# **getAlertingInteractionstatsRules**

> [InteractionStatsRuleContainer](InteractionStatsRuleContainer.md) getAlertingInteractionstatsRules(expand)

Get an interaction stats rule list.

Wraps GET /api/v2/alerting/interactionstats/rules

Requires ALL permissions:

- alerting:rule:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRuleContainer result = apiInstance.getAlertingInteractionstatsRules(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#getAlertingInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                         |
| ---------- | ----------------------------------- | ------------------------------- | --------------------------------------------- |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsRuleContainer**](InteractionStatsRuleContainer.md)

<a name="postAlertingInteractionstatsRules"></a>

# **postAlertingInteractionstatsRules**

> [InteractionStatsRule](InteractionStatsRule.md) postAlertingInteractionstatsRules(body, expand)

Create an interaction stats rule.

Wraps POST /api/v2/alerting/interactionstats/rules

Requires ALL permissions:

- alerting:rule:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.postAlertingInteractionstatsRules(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#postAlertingInteractionstatsRules");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                | Description                     | Notes                                         |
| ---------- | --------------------------------------------------- | ------------------------------- | --------------------------------------------- |
| **body**   | [**InteractionStatsRule**](InteractionStatsRule.md) | AlertingRule                    |
| **expand** | [**List&lt;String&gt;**](String.md)                 | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)

<a name="putAlertingInteractionstatsAlert"></a>

# **putAlertingInteractionstatsAlert**

> [UnreadStatus](UnreadStatus.md) putAlertingInteractionstatsAlert(alertId, body, expand)

Update an interaction stats alert read status

Wraps PUT /api/v2/alerting/interactionstats/alerts/{alertId}

Requires ALL permissions:

- alerting:alert:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String alertId = "alertId_example"; // String | Alert ID
UnreadStatus body = new UnreadStatus(); // UnreadStatus | InteractionStatsAlert
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    UnreadStatus result = apiInstance.putAlertingInteractionstatsAlert(alertId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsAlert");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                     | Notes                                         |
| ----------- | ----------------------------------- | ------------------------------- | --------------------------------------------- |
| **alertId** | **String**                          | Alert ID                        |
| **body**    | [**UnreadStatus**](UnreadStatus.md) | InteractionStatsAlert           |
| **expand**  | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**UnreadStatus**](UnreadStatus.md)

<a name="putAlertingInteractionstatsRule"></a>

# **putAlertingInteractionstatsRule**

> [InteractionStatsRule](InteractionStatsRule.md) putAlertingInteractionstatsRule(ruleId, body, expand)

Update an interaction stats rule

Wraps PUT /api/v2/alerting/interactionstats/rules/{ruleId}

Requires ALL permissions:

- alerting:rule:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AlertingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AlertingApi apiInstance = new AlertingApi();
String ruleId = "ruleId_example"; // String | Rule ID
InteractionStatsRule body = new InteractionStatsRule(); // InteractionStatsRule | AlertingRule
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    InteractionStatsRule result = apiInstance.putAlertingInteractionstatsRule(ruleId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertingApi#putAlertingInteractionstatsRule");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                | Description                     | Notes                                         |
| ---------- | --------------------------------------------------- | ------------------------------- | --------------------------------------------- |
| **ruleId** | **String**                                          | Rule ID                         |
| **body**   | [**InteractionStatsRule**](InteractionStatsRule.md) | AlertingRule                    |
| **expand** | [**List&lt;String&gt;**](String.md)                 | Which fields, if any, to expand | [optional]<br />**Values**: notificationUsers |

{: class="table-striped"}

### Return type

[**InteractionStatsRule**](InteractionStatsRule.md)
