---
title: AuditApi
---

## AuditApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                       | Description                                                                                                                           |
| -------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| [**getAuditsQueryRealtimeServicemapping**](AuditApi.md#getAuditsQueryRealtimeServicemapping) | Get service mapping information used in realtime audits.                                                                              |
| [**getAuditsQueryServicemapping**](AuditApi.md#getAuditsQueryServicemapping)                 | Get service mapping information used in audits.                                                                                       |
| [**getAuditsQueryTransactionId**](AuditApi.md#getAuditsQueryTransactionId)                   | Get status of audit query execution                                                                                                   |
| [**getAuditsQueryTransactionIdResults**](AuditApi.md#getAuditsQueryTransactionIdResults)     | Get results of audit query                                                                                                            |
| [**postAuditsQuery**](AuditApi.md#postAuditsQuery)                                           | Create audit query execution                                                                                                          |
| [**postAuditsQueryRealtime**](AuditApi.md#postAuditsQueryRealtime)                           | This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits. |

{: class="table-striped"}

<a name="getAuditsQueryRealtimeServicemapping"></a>

# **getAuditsQueryRealtimeServicemapping**

> [AuditQueryServiceMapping](AuditQueryServiceMapping.md) getAuditsQueryRealtimeServicemapping()

Get service mapping information used in realtime audits.

Wraps GET /api/v2/audits/query/realtime/servicemapping

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
try {
    AuditQueryServiceMapping result = apiInstance.getAuditsQueryRealtimeServicemapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryRealtimeServicemapping");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AuditQueryServiceMapping**](AuditQueryServiceMapping.md)

<a name="getAuditsQueryServicemapping"></a>

# **getAuditsQueryServicemapping**

> [AuditQueryServiceMapping](AuditQueryServiceMapping.md) getAuditsQueryServicemapping()

Get service mapping information used in audits.

Wraps GET /api/v2/audits/query/servicemapping

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
try {
    AuditQueryServiceMapping result = apiInstance.getAuditsQueryServicemapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryServicemapping");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AuditQueryServiceMapping**](AuditQueryServiceMapping.md)

<a name="getAuditsQueryTransactionId"></a>

# **getAuditsQueryTransactionId**

> [AuditQueryExecutionStatusResponse](AuditQueryExecutionStatusResponse.md) getAuditsQueryTransactionId(transactionId)

Get status of audit query execution

Wraps GET /api/v2/audits/query/{transactionId}

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
String transactionId = "transactionId_example"; // String | Transaction ID
try {
    AuditQueryExecutionStatusResponse result = apiInstance.getAuditsQueryTransactionId(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryTransactionId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **transactionId** | **String** | Transaction ID |

{: class="table-striped"}

### Return type

[**AuditQueryExecutionStatusResponse**](AuditQueryExecutionStatusResponse.md)

<a name="getAuditsQueryTransactionIdResults"></a>

# **getAuditsQueryTransactionIdResults**

> [AuditQueryExecutionResultsResponse](AuditQueryExecutionResultsResponse.md) getAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand)

Get results of audit query

Wraps GET /api/v2/audits/query/{transactionId}/results

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
String transactionId = "transactionId_example"; // String | Transaction ID
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 25; // Integer | Page size
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    AuditQueryExecutionResultsResponse result = apiInstance.getAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryTransactionIdResults");
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

[**AuditQueryExecutionResultsResponse**](AuditQueryExecutionResultsResponse.md)

<a name="postAuditsQuery"></a>

# **postAuditsQuery**

> [AuditQueryExecutionStatusResponse](AuditQueryExecutionStatusResponse.md) postAuditsQuery(body)

Create audit query execution

Wraps POST /api/v2/audits/query

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
AuditQueryRequest body = new AuditQueryRequest(); // AuditQueryRequest | query
try {
    AuditQueryExecutionStatusResponse result = apiInstance.postAuditsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#postAuditsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description | Notes |
| -------- | --------------------------------------------- | ----------- | ----- |
| **body** | [**AuditQueryRequest**](AuditQueryRequest.md) | query       |

{: class="table-striped"}

### Return type

[**AuditQueryExecutionStatusResponse**](AuditQueryExecutionStatusResponse.md)

<a name="postAuditsQueryRealtime"></a>

# **postAuditsQueryRealtime**

> [AuditRealtimeQueryResultsResponse](AuditRealtimeQueryResultsResponse.md) postAuditsQueryRealtime(body, expand)

This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.

Wraps POST /api/v2/audits/query/realtime

Requires ALL permissions:

- audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
AuditRealtimeQueryRequest body = new AuditRealtimeQueryRequest(); // AuditRealtimeQueryRequest | query
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand
try {
    AuditRealtimeQueryResultsResponse result = apiInstance.postAuditsQueryRealtime(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#postAuditsQueryRealtime");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                          | Description                     | Notes                            |
| ---------- | ------------------------------------------------------------- | ------------------------------- | -------------------------------- |
| **body**   | [**AuditRealtimeQueryRequest**](AuditRealtimeQueryRequest.md) | query                           |
| **expand** | [**List&lt;String&gt;**](String.md)                           | Which fields, if any, to expand | [optional]<br />**Values**: user |

{: class="table-striped"}

### Return type

[**AuditRealtimeQueryResultsResponse**](AuditRealtimeQueryResultsResponse.md)
