---
title: WebDeploymentsApi
---

## WebDeploymentsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                              | Description                                              |
| ----------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------- |
| [**deleteWebdeploymentsConfiguration**](WebDeploymentsApi.md#deleteWebdeploymentsConfiguration)                                     | Delete all versions of a configuration                   |
| [**deleteWebdeploymentsDeployment**](WebDeploymentsApi.md#deleteWebdeploymentsDeployment)                                           | Delete a deployment                                      |
| [**getWebdeploymentsConfigurationVersion**](WebDeploymentsApi.md#getWebdeploymentsConfigurationVersion)                             | Get a configuration version                              |
| [**getWebdeploymentsConfigurationVersions**](WebDeploymentsApi.md#getWebdeploymentsConfigurationVersions)                           | Get the versions of a configuration                      |
| [**getWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi.md#getWebdeploymentsConfigurationVersionsDraft)                 | Get the configuration draft                              |
| [**getWebdeploymentsConfigurations**](WebDeploymentsApi.md#getWebdeploymentsConfigurations)                                         | View configuration drafts                                |
| [**getWebdeploymentsDeployment**](WebDeploymentsApi.md#getWebdeploymentsDeployment)                                                 | Get a deployment                                         |
| [**getWebdeploymentsDeployments**](WebDeploymentsApi.md#getWebdeploymentsDeployments)                                               | Get deployments                                          |
| [**postWebdeploymentsConfigurationVersionsDraftPublish**](WebDeploymentsApi.md#postWebdeploymentsConfigurationVersionsDraftPublish) | Publish the configuration draft and create a new version |
| [**postWebdeploymentsConfigurations**](WebDeploymentsApi.md#postWebdeploymentsConfigurations)                                       | Create a configuration draft                             |
| [**postWebdeploymentsDeployments**](WebDeploymentsApi.md#postWebdeploymentsDeployments)                                             | Create a deployment                                      |
| [**putWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi.md#putWebdeploymentsConfigurationVersionsDraft)                 | Update the configuration draft                           |
| [**putWebdeploymentsDeployment**](WebDeploymentsApi.md#putWebdeploymentsDeployment)                                                 | Update a deployment                                      |

{: class="table-striped"}

<a name="deleteWebdeploymentsConfiguration"></a>

# **deleteWebdeploymentsConfiguration**

> Void deleteWebdeploymentsConfiguration(configurationId)

Delete all versions of a configuration

Wraps DELETE /api/v2/webdeployments/configurations/{configurationId}

Requires ALL permissions:

- webDeployments:configuration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    apiInstance.deleteWebdeploymentsConfiguration(configurationId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsConfiguration");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                  | Notes |
| ------------------- | ---------- | ---------------------------- | ----- |
| **configurationId** | **String** | The configuration version ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteWebdeploymentsDeployment"></a>

# **deleteWebdeploymentsDeployment**

> Void deleteWebdeploymentsDeployment(deploymentId)

Delete a deployment

Wraps DELETE /api/v2/webdeployments/deployments/{deploymentId}

Requires ALL permissions:

- webDeployments:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
try {
    apiInstance.deleteWebdeploymentsDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description       | Notes |
| ---------------- | ---------- | ----------------- | ----- |
| **deploymentId** | **String** | The deployment ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getWebdeploymentsConfigurationVersion"></a>

# **getWebdeploymentsConfigurationVersion**

> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.md) getWebdeploymentsConfigurationVersion(configurationId, versionId)

Get a configuration version

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions/{versionId}

Requires ALL permissions:

- webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
String versionId = "versionId_example"; // String | The version of the configuration to get
try {
    WebDeploymentConfigurationVersion result = apiInstance.getWebdeploymentsConfigurationVersion(configurationId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersion");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                             | Notes |
| ------------------- | ---------- | --------------------------------------- | ----- |
| **configurationId** | **String** | The configuration version ID            |
| **versionId**       | **String** | The version of the configuration to get |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md)

<a name="getWebdeploymentsConfigurationVersions"></a>

# **getWebdeploymentsConfigurationVersions**

> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing.md) getWebdeploymentsConfigurationVersions(configurationId)

Get the versions of a configuration

This returns the 50 most recent versions for this configuration

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions

Requires ALL permissions:

- webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersionEntityListing result = apiInstance.getWebdeploymentsConfigurationVersions(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersions");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                  | Notes |
| ------------------- | ---------- | ---------------------------- | ----- |
| **configurationId** | **String** | The configuration version ID |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing.md)

<a name="getWebdeploymentsConfigurationVersionsDraft"></a>

# **getWebdeploymentsConfigurationVersionsDraft**

> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.md) getWebdeploymentsConfigurationVersionsDraft(configurationId)

Get the configuration draft

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions/draft

Requires ALL permissions:

- webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersion result = apiInstance.getWebdeploymentsConfigurationVersionsDraft(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersionsDraft");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                  | Notes |
| ------------------- | ---------- | ---------------------------- | ----- |
| **configurationId** | **String** | The configuration version ID |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md)

<a name="getWebdeploymentsConfigurations"></a>

# **getWebdeploymentsConfigurations**

> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing.md) getWebdeploymentsConfigurations(showOnlyPublished)

View configuration drafts

Wraps GET /api/v2/webdeployments/configurations

Requires ALL permissions:

- webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
Boolean showOnlyPublished = false; // Boolean | Get only configuration drafts with published versions
try {
    WebDeploymentConfigurationVersionEntityListing result = apiInstance.getWebdeploymentsConfigurations(showOnlyPublished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurations");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type        | Description                                           | Notes                         |
| --------------------- | ----------- | ----------------------------------------------------- | ----------------------------- |
| **showOnlyPublished** | **Boolean** | Get only configuration drafts with published versions | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing.md)

<a name="getWebdeploymentsDeployment"></a>

# **getWebdeploymentsDeployment**

> [WebDeployment](WebDeployment.md) getWebdeploymentsDeployment(deploymentId)

Get a deployment

Wraps GET /api/v2/webdeployments/deployments/{deploymentId}

Requires ALL permissions:

- webDeployments:deployment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
try {
    WebDeployment result = apiInstance.getWebdeploymentsDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description       | Notes |
| ---------------- | ---------- | ----------------- | ----- |
| **deploymentId** | **String** | The deployment ID |

{: class="table-striped"}

### Return type

[**WebDeployment**](WebDeployment.md)

<a name="getWebdeploymentsDeployments"></a>

# **getWebdeploymentsDeployments**

> [WebDeploymentEntityListing](WebDeploymentEntityListing.md) getWebdeploymentsDeployments()

Get deployments

Wraps GET /api/v2/webdeployments/deployments

Requires ALL permissions:

- webDeployments:deployment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
try {
    WebDeploymentEntityListing result = apiInstance.getWebdeploymentsDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeployments");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**WebDeploymentEntityListing**](WebDeploymentEntityListing.md)

<a name="postWebdeploymentsConfigurationVersionsDraftPublish"></a>

# **postWebdeploymentsConfigurationVersionsDraftPublish**

> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.md) postWebdeploymentsConfigurationVersionsDraftPublish(configurationId)

Publish the configuration draft and create a new version

Wraps POST /api/v2/webdeployments/configurations/{configurationId}/versions/draft/publish

Requires ALL permissions:

- webDeployments:configuration:edit
- webDeployments:configuration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersion result = apiInstance.postWebdeploymentsConfigurationVersionsDraftPublish(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsConfigurationVersionsDraftPublish");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                  | Notes |
| ------------------- | ---------- | ---------------------------- | ----- |
| **configurationId** | **String** | The configuration version ID |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md)

<a name="postWebdeploymentsConfigurations"></a>

# **postWebdeploymentsConfigurations**

> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.md) postWebdeploymentsConfigurations(configurationVersion)

Create a configuration draft

Wraps POST /api/v2/webdeployments/configurations

Requires ALL permissions:

- webDeployments:configuration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeploymentConfigurationVersion configurationVersion = new WebDeploymentConfigurationVersion(); // WebDeploymentConfigurationVersion |
try {
    WebDeploymentConfigurationVersion result = apiInstance.postWebdeploymentsConfigurations(configurationVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsConfigurations");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                                                          | Description | Notes |
| ------------------------ | ----------------------------------------------------------------------------- | ----------- | ----- |
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md) |             |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md)

<a name="postWebdeploymentsDeployments"></a>

# **postWebdeploymentsDeployments**

> [WebDeployment](WebDeployment.md) postWebdeploymentsDeployments(deployment)

Create a deployment

Wraps POST /api/v2/webdeployments/deployments

Requires ALL permissions:

- webDeployments:deployment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeployment deployment = new WebDeployment(); // WebDeployment |
try {
    WebDeployment result = apiInstance.postWebdeploymentsDeployments(deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsDeployments");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                  | Description | Notes |
| -------------- | ------------------------------------- | ----------- | ----- |
| **deployment** | [**WebDeployment**](WebDeployment.md) |             |

{: class="table-striped"}

### Return type

[**WebDeployment**](WebDeployment.md)

<a name="putWebdeploymentsConfigurationVersionsDraft"></a>

# **putWebdeploymentsConfigurationVersionsDraft**

> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.md) putWebdeploymentsConfigurationVersionsDraft(configurationId, configurationVersion)

Update the configuration draft

Wraps PUT /api/v2/webdeployments/configurations/{configurationId}/versions/draft

Requires ALL permissions:

- webDeployments:configuration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
WebDeploymentConfigurationVersion configurationVersion = new WebDeploymentConfigurationVersion(); // WebDeploymentConfigurationVersion |
try {
    WebDeploymentConfigurationVersion result = apiInstance.putWebdeploymentsConfigurationVersionsDraft(configurationId, configurationVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#putWebdeploymentsConfigurationVersionsDraft");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type                                                                          | Description                  | Notes |
| ------------------------ | ----------------------------------------------------------------------------- | ---------------------------- | ----- |
| **configurationId**      | **String**                                                                    | The configuration version ID |
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md) |                              |

{: class="table-striped"}

### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.md)

<a name="putWebdeploymentsDeployment"></a>

# **putWebdeploymentsDeployment**

> [WebDeployment](WebDeployment.md) putWebdeploymentsDeployment(deploymentId, deployment)

Update a deployment

Wraps PUT /api/v2/webdeployments/deployments/{deploymentId}

Requires ALL permissions:

- webDeployments:deployment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
WebDeployment deployment = new WebDeployment(); // WebDeployment |
try {
    WebDeployment result = apiInstance.putWebdeploymentsDeployment(deploymentId, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#putWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                  | Description       | Notes |
| ---------------- | ------------------------------------- | ----------------- | ----- |
| **deploymentId** | **String**                            | The deployment ID |
| **deployment**   | [**WebDeployment**](WebDeployment.md) |                   |

{: class="table-striped"}

### Return type

[**WebDeployment**](WebDeployment.md)
