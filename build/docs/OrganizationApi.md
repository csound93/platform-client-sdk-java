---
title: OrganizationApi
---

## OrganizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                    | Description                                                                     |
| --------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| [**getFieldconfig**](OrganizationApi.md#getFieldconfig)                                                   | Fetch field config for an entity type                                           |
| [**getOrganizationsEmbeddedintegration**](OrganizationApi.md#getOrganizationsEmbeddedintegration)         | Get the list of domains that will be allowed to embed PureCloud applications    |
| [**getOrganizationsIpaddressauthentication**](OrganizationApi.md#getOrganizationsIpaddressauthentication) | Get organization IP address whitelist settings                                  |
| [**getOrganizationsLimitsChangerequest**](OrganizationApi.md#getOrganizationsLimitsChangerequest)         | Get a limit change request                                                      |
| [**getOrganizationsLimitsChangerequests**](OrganizationApi.md#getOrganizationsLimitsChangerequests)       | Get the available limit change requests                                         |
| [**getOrganizationsLimitsDocs**](OrganizationApi.md#getOrganizationsLimitsDocs)                           | Get a link to the limit documentation                                           |
| [**getOrganizationsLimitsNamespace**](OrganizationApi.md#getOrganizationsLimitsNamespace)                 | Get the effective limits in a namespace for an organization                     |
| [**getOrganizationsLimitsNamespaceDefaults**](OrganizationApi.md#getOrganizationsLimitsNamespaceDefaults) | Get the default limits in a namespace for an organization                       |
| [**getOrganizationsLimitsNamespaces**](OrganizationApi.md#getOrganizationsLimitsNamespaces)               | Get the available limit namespaces                                              |
| [**getOrganizationsMe**](OrganizationApi.md#getOrganizationsMe)                                           | Get organization.                                                               |
| [**getOrganizationsWhitelist**](OrganizationApi.md#getOrganizationsWhitelist)                             | Use PUT /api/v2/organizations/embeddedintegration instead                       |
| [**patchOrganizationsFeature**](OrganizationApi.md#patchOrganizationsFeature)                             | Update organization                                                             |
| [**putOrganizationsEmbeddedintegration**](OrganizationApi.md#putOrganizationsEmbeddedintegration)         | Update the list of domains that will be allowed to embed PureCloud applications |
| [**putOrganizationsIpaddressauthentication**](OrganizationApi.md#putOrganizationsIpaddressauthentication) | Update organization IP address whitelist settings                               |
| [**putOrganizationsMe**](OrganizationApi.md#putOrganizationsMe)                                           | Update organization.                                                            |
| [**putOrganizationsWhitelist**](OrganizationApi.md#putOrganizationsWhitelist)                             | Use PUT /api/v2/organizations/embeddedintegration instead                       |

{: class="table-striped"}

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
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String type = "type_example"; // String | Field type
try {
    FieldConfig result = apiInstance.getFieldconfig(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getFieldconfig");
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

<a name="getOrganizationsEmbeddedintegration"></a>

# **getOrganizationsEmbeddedintegration**

> [EmbeddedIntegration](EmbeddedIntegration.md) getOrganizationsEmbeddedintegration()

Get the list of domains that will be allowed to embed PureCloud applications

Wraps GET /api/v2/organizations/embeddedintegration

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    EmbeddedIntegration result = apiInstance.getOrganizationsEmbeddedintegration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsEmbeddedintegration");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EmbeddedIntegration**](EmbeddedIntegration.md)

<a name="getOrganizationsIpaddressauthentication"></a>

# **getOrganizationsIpaddressauthentication**

> [IpAddressAuthentication](IpAddressAuthentication.md) getOrganizationsIpaddressauthentication()

Get organization IP address whitelist settings

Wraps GET /api/v2/organizations/ipaddressauthentication

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    IpAddressAuthentication result = apiInstance.getOrganizationsIpaddressauthentication();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsIpaddressauthentication");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**IpAddressAuthentication**](IpAddressAuthentication.md)

<a name="getOrganizationsLimitsChangerequest"></a>

# **getOrganizationsLimitsChangerequest**

> [LimitChangeRequestDetails](LimitChangeRequestDetails.md) getOrganizationsLimitsChangerequest(requestId)

Get a limit change request

Wraps GET /api/v2/organizations/limits/changerequests/{requestId}

Requires ANY permissions:

- limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String requestId = "requestId_example"; // String | Unique id for the limit change request
try {
    LimitChangeRequestDetails result = apiInstance.getOrganizationsLimitsChangerequest(requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsChangerequest");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                            | Notes |
| ------------- | ---------- | -------------------------------------- | ----- |
| **requestId** | **String** | Unique id for the limit change request |

{: class="table-striped"}

### Return type

[**LimitChangeRequestDetails**](LimitChangeRequestDetails.md)

<a name="getOrganizationsLimitsChangerequests"></a>

# **getOrganizationsLimitsChangerequests**

> [LimitChangeRequestsEntityListing](LimitChangeRequestsEntityListing.md) getOrganizationsLimitsChangerequests(after, before, status, pageSize, expand)

Get the available limit change requests

Timestamp interval defaults to the last 365 days if both query parameters are omitted. If only one parameter is omitted, the interval will default to a 180 day range in the specified direction.

Wraps GET /api/v2/organizations/limits/changerequests

Requires ANY permissions:

- limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Long after = 789L; // Long | Timestamp indicating the date to begin after when searching for requests.
Long before = 789L; // Long | Timestamp indicating the date to end before when searching for requests.
String status = "status_example"; // String | Status of the request to be filtered by
Integer pageSize = 25; // Integer | Page Size
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    LimitChangeRequestsEntityListing result = apiInstance.getOrganizationsLimitsChangerequests(after, before, status, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsChangerequests");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                | Description                                                               | Notes                                                                                                                                            |
| ------------ | ----------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| **after**    | **Long**                            | Timestamp indicating the date to begin after when searching for requests. | [optional]                                                                                                                                       |
| **before**   | **Long**                            | Timestamp indicating the date to end before when searching for requests.  | [optional]                                                                                                                                       |
| **status**   | **String**                          | Status of the request to be filtered by                                   | [optional]<br />**Values**: Open, Approved, ImplementingChange, ChangeImplemented, Rejected, Rollback, ImplementingRollback, RollbackImplemented |
| **pageSize** | **Integer**                         | Page Size                                                                 | [optional] [default to 25]                                                                                                                       |
| **expand**   | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                          | [optional]<br />**Values**: statusHistory                                                                                                        |

{: class="table-striped"}

### Return type

[**LimitChangeRequestsEntityListing**](LimitChangeRequestsEntityListing.md)

<a name="getOrganizationsLimitsDocs"></a>

# **getOrganizationsLimitsDocs**

> [UrlResponse](UrlResponse.md) getOrganizationsLimitsDocs()

Get a link to the limit documentation

Wraps GET /api/v2/organizations/limits/docs

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    UrlResponse result = apiInstance.getOrganizationsLimitsDocs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsDocs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**UrlResponse**](UrlResponse.md)

<a name="getOrganizationsLimitsNamespace"></a>

# **getOrganizationsLimitsNamespace**

> [LimitsEntityListing](LimitsEntityListing.md) getOrganizationsLimitsNamespace(namespaceName)

Get the effective limits in a namespace for an organization

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}

Requires ANY permissions:

- limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String namespaceName = "namespaceName_example"; // String | The namespace to fetch limits for
try {
    LimitsEntityListing result = apiInstance.getOrganizationsLimitsNamespace(namespaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespace");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                       | Notes |
| ----------------- | ---------- | --------------------------------- | ----- |
| **namespaceName** | **String** | The namespace to fetch limits for |

{: class="table-striped"}

### Return type

[**LimitsEntityListing**](LimitsEntityListing.md)

<a name="getOrganizationsLimitsNamespaceDefaults"></a>

# **getOrganizationsLimitsNamespaceDefaults**

> [LimitsEntityListing](LimitsEntityListing.md) getOrganizationsLimitsNamespaceDefaults(namespaceName)

Get the default limits in a namespace for an organization

Wraps GET /api/v2/organizations/limits/namespaces/{namespaceName}/defaults

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String namespaceName = "namespaceName_example"; // String | The namespace to fetch defaults limits for
try {
    LimitsEntityListing result = apiInstance.getOrganizationsLimitsNamespaceDefaults(namespaceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaceDefaults");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                                | Notes |
| ----------------- | ---------- | ------------------------------------------ | ----- |
| **namespaceName** | **String** | The namespace to fetch defaults limits for |

{: class="table-striped"}

### Return type

[**LimitsEntityListing**](LimitsEntityListing.md)

<a name="getOrganizationsLimitsNamespaces"></a>

# **getOrganizationsLimitsNamespaces**

> [PagedNamespaceListing](PagedNamespaceListing.md) getOrganizationsLimitsNamespaces(pageSize, pageNumber)

Get the available limit namespaces

Wraps GET /api/v2/organizations/limits/namespaces

Requires ANY permissions:

- limits:organization:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Integer pageSize = 100; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PagedNamespaceListing result = apiInstance.getOrganizationsLimitsNamespaces(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsLimitsNamespaces");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                       |
| -------------- | ----------- | ----------- | --------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 100] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]   |

{: class="table-striped"}

### Return type

[**PagedNamespaceListing**](PagedNamespaceListing.md)

<a name="getOrganizationsMe"></a>

# **getOrganizationsMe**

> [Organization](Organization.md) getOrganizationsMe()

Get organization.

Wraps GET /api/v2/organizations/me

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    Organization result = apiInstance.getOrganizationsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Organization**](Organization.md)

<a name="getOrganizationsWhitelist"></a>

# **getOrganizationsWhitelist**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrgWhitelistSettings](OrgWhitelistSettings.md) getOrganizationsWhitelist()

Use PUT /api/v2/organizations/embeddedintegration instead

Wraps GET /api/v2/organizations/whitelist

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
try {
    OrgWhitelistSettings result = apiInstance.getOrganizationsWhitelist();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#getOrganizationsWhitelist");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**OrgWhitelistSettings**](OrgWhitelistSettings.md)

<a name="patchOrganizationsFeature"></a>

# **patchOrganizationsFeature**

> [OrganizationFeatures](OrganizationFeatures.md) patchOrganizationsFeature(featureName, enabled)

Update organization

Wraps PATCH /api/v2/organizations/features/{featureName}

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
String featureName = "featureName_example"; // String | Organization feature
FeatureState enabled = new FeatureState(); // FeatureState | New state of feature
try {
    OrganizationFeatures result = apiInstance.patchOrganizationsFeature(featureName, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#patchOrganizationsFeature");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description          | Notes                                                                                                                                                                            |
| --------------- | ----------------------------------- | -------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **featureName** | **String**                          | Organization feature | <br />**Values**: realtimeCIC, purecloud, hipaa, ucEnabled, pci, purecloudVoice, xmppFederation, chat, informalPhotos, directory, contactCenter, unifiedCommunications, custserv |
| **enabled**     | [**FeatureState**](FeatureState.md) | New state of feature |

{: class="table-striped"}

### Return type

[**OrganizationFeatures**](OrganizationFeatures.md)

<a name="putOrganizationsEmbeddedintegration"></a>

# **putOrganizationsEmbeddedintegration**

> [EmbeddedIntegration](EmbeddedIntegration.md) putOrganizationsEmbeddedintegration(body)

Update the list of domains that will be allowed to embed PureCloud applications

Wraps PUT /api/v2/organizations/embeddedintegration

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
EmbeddedIntegration body = new EmbeddedIntegration(); // EmbeddedIntegration | Whitelist settings
try {
    EmbeddedIntegration result = apiInstance.putOrganizationsEmbeddedintegration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsEmbeddedintegration");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description        | Notes |
| -------- | ------------------------------------------------- | ------------------ | ----- |
| **body** | [**EmbeddedIntegration**](EmbeddedIntegration.md) | Whitelist settings |

{: class="table-striped"}

### Return type

[**EmbeddedIntegration**](EmbeddedIntegration.md)

<a name="putOrganizationsIpaddressauthentication"></a>

# **putOrganizationsIpaddressauthentication**

> [IpAddressAuthentication](IpAddressAuthentication.md) putOrganizationsIpaddressauthentication(body)

Update organization IP address whitelist settings

Wraps PUT /api/v2/organizations/ipaddressauthentication

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
IpAddressAuthentication body = new IpAddressAuthentication(); // IpAddressAuthentication | IP address Whitelist settings
try {
    IpAddressAuthentication result = apiInstance.putOrganizationsIpaddressauthentication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsIpaddressauthentication");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description                   | Notes |
| -------- | --------------------------------------------------------- | ----------------------------- | ----- |
| **body** | [**IpAddressAuthentication**](IpAddressAuthentication.md) | IP address Whitelist settings |

{: class="table-striped"}

### Return type

[**IpAddressAuthentication**](IpAddressAuthentication.md)

<a name="putOrganizationsMe"></a>

# **putOrganizationsMe**

> [Organization](Organization.md) putOrganizationsMe(body)

Update organization.

Wraps PUT /api/v2/organizations/me

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
Organization body = new Organization(); // Organization | Organization
try {
    Organization result = apiInstance.putOrganizationsMe(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsMe");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description  | Notes      |
| -------- | ----------------------------------- | ------------ | ---------- |
| **body** | [**Organization**](Organization.md) | Organization | [optional] |

{: class="table-striped"}

### Return type

[**Organization**](Organization.md)

<a name="putOrganizationsWhitelist"></a>

# **putOrganizationsWhitelist**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OrgWhitelistSettings](OrgWhitelistSettings.md) putOrganizationsWhitelist(body)

Use PUT /api/v2/organizations/embeddedintegration instead

Wraps PUT /api/v2/organizations/whitelist

Requires ANY permissions:

- directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OrganizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OrganizationApi apiInstance = new OrganizationApi();
OrgWhitelistSettings body = new OrgWhitelistSettings(); // OrgWhitelistSettings | Whitelist settings
try {
    OrgWhitelistSettings result = apiInstance.putOrganizationsWhitelist(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#putOrganizationsWhitelist");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description        | Notes |
| -------- | --------------------------------------------------- | ------------------ | ----- |
| **body** | [**OrgWhitelistSettings**](OrgWhitelistSettings.md) | Whitelist settings |

{: class="table-striped"}

### Return type

[**OrgWhitelistSettings**](OrgWhitelistSettings.md)
