---
title: IdentityProviderApi
---

## IdentityProviderApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                              | Description                                                       |
| --------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------- |
| [**deleteIdentityprovidersAdfs**](IdentityProviderApi.md#deleteIdentityprovidersAdfs)               | Delete ADFS Identity Provider                                     |
| [**deleteIdentityprovidersCic**](IdentityProviderApi.md#deleteIdentityprovidersCic)                 | Delete Customer Interaction Center (CIC) Identity Provider        |
| [**deleteIdentityprovidersGeneric**](IdentityProviderApi.md#deleteIdentityprovidersGeneric)         | Delete Generic SAML Identity Provider                             |
| [**deleteIdentityprovidersGsuite**](IdentityProviderApi.md#deleteIdentityprovidersGsuite)           | Delete G Suite Identity Provider                                  |
| [**deleteIdentityprovidersIdentitynow**](IdentityProviderApi.md#deleteIdentityprovidersIdentitynow) | Delete IdentityNow Provider                                       |
| [**deleteIdentityprovidersOkta**](IdentityProviderApi.md#deleteIdentityprovidersOkta)               | Delete Okta Identity Provider                                     |
| [**deleteIdentityprovidersOnelogin**](IdentityProviderApi.md#deleteIdentityprovidersOnelogin)       | Delete OneLogin Identity Provider                                 |
| [**deleteIdentityprovidersPing**](IdentityProviderApi.md#deleteIdentityprovidersPing)               | Delete Ping Identity Provider                                     |
| [**deleteIdentityprovidersPurecloud**](IdentityProviderApi.md#deleteIdentityprovidersPurecloud)     | Delete PureCloud Identity Provider                                |
| [**deleteIdentityprovidersPureengage**](IdentityProviderApi.md#deleteIdentityprovidersPureengage)   | Delete PureEngage Identity Provider                               |
| [**deleteIdentityprovidersSalesforce**](IdentityProviderApi.md#deleteIdentityprovidersSalesforce)   | Delete Salesforce Identity Provider                               |
| [**getIdentityproviders**](IdentityProviderApi.md#getIdentityproviders)                             | The list of identity providers                                    |
| [**getIdentityprovidersAdfs**](IdentityProviderApi.md#getIdentityprovidersAdfs)                     | Get ADFS Identity Provider                                        |
| [**getIdentityprovidersCic**](IdentityProviderApi.md#getIdentityprovidersCic)                       | Get Customer Interaction Center (CIC) Identity Provider           |
| [**getIdentityprovidersGeneric**](IdentityProviderApi.md#getIdentityprovidersGeneric)               | Get Generic SAML Identity Provider                                |
| [**getIdentityprovidersGsuite**](IdentityProviderApi.md#getIdentityprovidersGsuite)                 | Get G Suite Identity Provider                                     |
| [**getIdentityprovidersIdentitynow**](IdentityProviderApi.md#getIdentityprovidersIdentitynow)       | Get IdentityNow Provider                                          |
| [**getIdentityprovidersOkta**](IdentityProviderApi.md#getIdentityprovidersOkta)                     | Get Okta Identity Provider                                        |
| [**getIdentityprovidersOnelogin**](IdentityProviderApi.md#getIdentityprovidersOnelogin)             | Get OneLogin Identity Provider                                    |
| [**getIdentityprovidersPing**](IdentityProviderApi.md#getIdentityprovidersPing)                     | Get Ping Identity Provider                                        |
| [**getIdentityprovidersPurecloud**](IdentityProviderApi.md#getIdentityprovidersPurecloud)           | Get PureCloud Identity Provider                                   |
| [**getIdentityprovidersPureengage**](IdentityProviderApi.md#getIdentityprovidersPureengage)         | Get PureEngage Identity Provider                                  |
| [**getIdentityprovidersSalesforce**](IdentityProviderApi.md#getIdentityprovidersSalesforce)         | Get Salesforce Identity Provider                                  |
| [**putIdentityprovidersAdfs**](IdentityProviderApi.md#putIdentityprovidersAdfs)                     | Update/Create ADFS Identity Provider                              |
| [**putIdentityprovidersCic**](IdentityProviderApi.md#putIdentityprovidersCic)                       | Update/Create Customer Interaction Center (CIC) Identity Provider |
| [**putIdentityprovidersGeneric**](IdentityProviderApi.md#putIdentityprovidersGeneric)               | Update/Create Generic SAML Identity Provider                      |
| [**putIdentityprovidersGsuite**](IdentityProviderApi.md#putIdentityprovidersGsuite)                 | Update/Create G Suite Identity Provider                           |
| [**putIdentityprovidersIdentitynow**](IdentityProviderApi.md#putIdentityprovidersIdentitynow)       | Update/Create IdentityNow Provider                                |
| [**putIdentityprovidersOkta**](IdentityProviderApi.md#putIdentityprovidersOkta)                     | Update/Create Okta Identity Provider                              |
| [**putIdentityprovidersOnelogin**](IdentityProviderApi.md#putIdentityprovidersOnelogin)             | Update/Create OneLogin Identity Provider                          |
| [**putIdentityprovidersPing**](IdentityProviderApi.md#putIdentityprovidersPing)                     | Update/Create Ping Identity Provider                              |
| [**putIdentityprovidersPurecloud**](IdentityProviderApi.md#putIdentityprovidersPurecloud)           | Update/Create PureCloud Identity Provider                         |
| [**putIdentityprovidersPureengage**](IdentityProviderApi.md#putIdentityprovidersPureengage)         | Update/Create PureEngage Identity Provider                        |
| [**putIdentityprovidersSalesforce**](IdentityProviderApi.md#putIdentityprovidersSalesforce)         | Update/Create Salesforce Identity Provider                        |

{: class="table-striped"}

<a name="deleteIdentityprovidersAdfs"></a>

# **deleteIdentityprovidersAdfs**

> [Empty](Empty.md) deleteIdentityprovidersAdfs()

Delete ADFS Identity Provider

Wraps DELETE /api/v2/identityproviders/adfs

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersCic"></a>

# **deleteIdentityprovidersCic**

> [Empty](Empty.md) deleteIdentityprovidersCic()

Delete Customer Interaction Center (CIC) Identity Provider

Wraps DELETE /api/v2/identityproviders/cic

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersGeneric"></a>

# **deleteIdentityprovidersGeneric**

> [Empty](Empty.md) deleteIdentityprovidersGeneric()

Delete Generic SAML Identity Provider

Wraps DELETE /api/v2/identityproviders/generic

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersGeneric();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersGsuite"></a>

# **deleteIdentityprovidersGsuite**

> [Empty](Empty.md) deleteIdentityprovidersGsuite()

Delete G Suite Identity Provider

Wraps DELETE /api/v2/identityproviders/gsuite

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersIdentitynow"></a>

# **deleteIdentityprovidersIdentitynow**

> [Empty](Empty.md) deleteIdentityprovidersIdentitynow()

Delete IdentityNow Provider

Wraps DELETE /api/v2/identityproviders/identitynow

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersOkta"></a>

# **deleteIdentityprovidersOkta**

> [Empty](Empty.md) deleteIdentityprovidersOkta()

Delete Okta Identity Provider

Wraps DELETE /api/v2/identityproviders/okta

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersOnelogin"></a>

# **deleteIdentityprovidersOnelogin**

> [Empty](Empty.md) deleteIdentityprovidersOnelogin()

Delete OneLogin Identity Provider

Wraps DELETE /api/v2/identityproviders/onelogin

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersPing"></a>

# **deleteIdentityprovidersPing**

> [Empty](Empty.md) deleteIdentityprovidersPing()

Delete Ping Identity Provider

Wraps DELETE /api/v2/identityproviders/ping

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersPurecloud"></a>

# **deleteIdentityprovidersPurecloud**

> [Empty](Empty.md) deleteIdentityprovidersPurecloud()

Delete PureCloud Identity Provider

Wraps DELETE /api/v2/identityproviders/purecloud

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersPureengage"></a>

# **deleteIdentityprovidersPureengage**

> [Empty](Empty.md) deleteIdentityprovidersPureengage()

Delete PureEngage Identity Provider

Wraps DELETE /api/v2/identityproviders/pureengage

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersPureengage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="deleteIdentityprovidersSalesforce"></a>

# **deleteIdentityprovidersSalesforce**

> [Empty](Empty.md) deleteIdentityprovidersSalesforce()

Delete Salesforce Identity Provider

Wraps DELETE /api/v2/identityproviders/salesforce

Requires ANY permissions:

- sso:provider:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Empty result = apiInstance.deleteIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#deleteIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Empty**](Empty.md)

<a name="getIdentityproviders"></a>

# **getIdentityproviders**

> [OAuthProviderEntityListing](OAuthProviderEntityListing.md) getIdentityproviders()

The list of identity providers

Wraps GET /api/v2/identityproviders

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OAuthProviderEntityListing result = apiInstance.getIdentityproviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityproviders");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**OAuthProviderEntityListing**](OAuthProviderEntityListing.md)

<a name="getIdentityprovidersAdfs"></a>

# **getIdentityprovidersAdfs**

> [ADFS](ADFS.md) getIdentityprovidersAdfs()

Get ADFS Identity Provider

Wraps GET /api/v2/identityproviders/adfs

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    ADFS result = apiInstance.getIdentityprovidersAdfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ADFS**](ADFS.md)

<a name="getIdentityprovidersCic"></a>

# **getIdentityprovidersCic**

> [CustomerInteractionCenter](CustomerInteractionCenter.md) getIdentityprovidersCic()

Get Customer Interaction Center (CIC) Identity Provider

Wraps GET /api/v2/identityproviders/cic

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    CustomerInteractionCenter result = apiInstance.getIdentityprovidersCic();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CustomerInteractionCenter**](CustomerInteractionCenter.md)

<a name="getIdentityprovidersGeneric"></a>

# **getIdentityprovidersGeneric**

> [GenericSAML](GenericSAML.md) getIdentityprovidersGeneric()

Get Generic SAML Identity Provider

Wraps GET /api/v2/identityproviders/generic

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    GenericSAML result = apiInstance.getIdentityprovidersGeneric();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GenericSAML**](GenericSAML.md)

<a name="getIdentityprovidersGsuite"></a>

# **getIdentityprovidersGsuite**

> [GSuite](GSuite.md) getIdentityprovidersGsuite()

Get G Suite Identity Provider

Wraps GET /api/v2/identityproviders/gsuite

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    GSuite result = apiInstance.getIdentityprovidersGsuite();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**GSuite**](GSuite.md)

<a name="getIdentityprovidersIdentitynow"></a>

# **getIdentityprovidersIdentitynow**

> [IdentityNow](IdentityNow.md) getIdentityprovidersIdentitynow()

Get IdentityNow Provider

Wraps GET /api/v2/identityproviders/identitynow

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    IdentityNow result = apiInstance.getIdentityprovidersIdentitynow();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**IdentityNow**](IdentityNow.md)

<a name="getIdentityprovidersOkta"></a>

# **getIdentityprovidersOkta**

> [Okta](Okta.md) getIdentityprovidersOkta()

Get Okta Identity Provider

Wraps GET /api/v2/identityproviders/okta

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Okta result = apiInstance.getIdentityprovidersOkta();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Okta**](Okta.md)

<a name="getIdentityprovidersOnelogin"></a>

# **getIdentityprovidersOnelogin**

> [OneLogin](OneLogin.md) getIdentityprovidersOnelogin()

Get OneLogin Identity Provider

Wraps GET /api/v2/identityproviders/onelogin

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    OneLogin result = apiInstance.getIdentityprovidersOnelogin();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**OneLogin**](OneLogin.md)

<a name="getIdentityprovidersPing"></a>

# **getIdentityprovidersPing**

> [PingIdentity](PingIdentity.md) getIdentityprovidersPing()

Get Ping Identity Provider

Wraps GET /api/v2/identityproviders/ping

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PingIdentity result = apiInstance.getIdentityprovidersPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**PingIdentity**](PingIdentity.md)

<a name="getIdentityprovidersPurecloud"></a>

# **getIdentityprovidersPurecloud**

> [PureCloud](PureCloud.md) getIdentityprovidersPurecloud()

Get PureCloud Identity Provider

Wraps GET /api/v2/identityproviders/purecloud

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureCloud result = apiInstance.getIdentityprovidersPurecloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**PureCloud**](PureCloud.md)

<a name="getIdentityprovidersPureengage"></a>

# **getIdentityprovidersPureengage**

> [PureEngage](PureEngage.md) getIdentityprovidersPureengage()

Get PureEngage Identity Provider

Wraps GET /api/v2/identityproviders/pureengage

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    PureEngage result = apiInstance.getIdentityprovidersPureengage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**PureEngage**](PureEngage.md)

<a name="getIdentityprovidersSalesforce"></a>

# **getIdentityprovidersSalesforce**

> [Salesforce](Salesforce.md) getIdentityprovidersSalesforce()

Get Salesforce Identity Provider

Wraps GET /api/v2/identityproviders/salesforce

Requires ANY permissions:

- sso:provider:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
try {
    Salesforce result = apiInstance.getIdentityprovidersSalesforce();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#getIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**Salesforce**](Salesforce.md)

<a name="putIdentityprovidersAdfs"></a>

# **putIdentityprovidersAdfs**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersAdfs(body)

Update/Create ADFS Identity Provider

Wraps PUT /api/v2/identityproviders/adfs

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
ADFS body = new ADFS(); // ADFS | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersAdfs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersAdfs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                | Description | Notes |
| -------- | ------------------- | ----------- | ----- |
| **body** | [**ADFS**](ADFS.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersCic"></a>

# **putIdentityprovidersCic**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersCic(body)

Update/Create Customer Interaction Center (CIC) Identity Provider

Wraps PUT /api/v2/identityproviders/cic

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
CustomerInteractionCenter body = new CustomerInteractionCenter(); // CustomerInteractionCenter | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersCic(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersCic");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description | Notes |
| -------- | ------------------------------------------------------------- | ----------- | ----- |
| **body** | [**CustomerInteractionCenter**](CustomerInteractionCenter.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersGeneric"></a>

# **putIdentityprovidersGeneric**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersGeneric(body)

Update/Create Generic SAML Identity Provider

Wraps PUT /api/v2/identityproviders/generic

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
GenericSAML body = new GenericSAML(); // GenericSAML | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersGeneric(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersGeneric");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description | Notes |
| -------- | --------------------------------- | ----------- | ----- |
| **body** | [**GenericSAML**](GenericSAML.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersGsuite"></a>

# **putIdentityprovidersGsuite**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersGsuite(body)

Update/Create G Suite Identity Provider

Wraps PUT /api/v2/identityproviders/gsuite

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
GSuite body = new GSuite(); // GSuite | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersGsuite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersGsuite");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                    | Description | Notes |
| -------- | ----------------------- | ----------- | ----- |
| **body** | [**GSuite**](GSuite.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersIdentitynow"></a>

# **putIdentityprovidersIdentitynow**

> [IdentityNow](IdentityNow.md) putIdentityprovidersIdentitynow(body)

Update/Create IdentityNow Provider

Wraps PUT /api/v2/identityproviders/identitynow

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
IdentityNow body = new IdentityNow(); // IdentityNow | Provider
try {
    IdentityNow result = apiInstance.putIdentityprovidersIdentitynow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersIdentitynow");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                              | Description | Notes |
| -------- | --------------------------------- | ----------- | ----- |
| **body** | [**IdentityNow**](IdentityNow.md) | Provider    |

{: class="table-striped"}

### Return type

[**IdentityNow**](IdentityNow.md)

<a name="putIdentityprovidersOkta"></a>

# **putIdentityprovidersOkta**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersOkta(body)

Update/Create Okta Identity Provider

Wraps PUT /api/v2/identityproviders/okta

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
Okta body = new Okta(); // Okta | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersOkta(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOkta");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                | Description | Notes |
| -------- | ------------------- | ----------- | ----- |
| **body** | [**Okta**](Okta.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersOnelogin"></a>

# **putIdentityprovidersOnelogin**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersOnelogin(body)

Update/Create OneLogin Identity Provider

Wraps PUT /api/v2/identityproviders/onelogin

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
OneLogin body = new OneLogin(); // OneLogin | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersOnelogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersOnelogin");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                        | Description | Notes |
| -------- | --------------------------- | ----------- | ----- |
| **body** | [**OneLogin**](OneLogin.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersPing"></a>

# **putIdentityprovidersPing**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersPing(body)

Update/Create Ping Identity Provider

Wraps PUT /api/v2/identityproviders/ping

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PingIdentity body = new PingIdentity(); // PingIdentity | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersPing(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPing");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description | Notes |
| -------- | ----------------------------------- | ----------- | ----- |
| **body** | [**PingIdentity**](PingIdentity.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersPurecloud"></a>

# **putIdentityprovidersPurecloud**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersPurecloud(body)

Update/Create PureCloud Identity Provider

Wraps PUT /api/v2/identityproviders/purecloud

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureCloud body = new PureCloud(); // PureCloud | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersPurecloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPurecloud");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description | Notes |
| -------- | ----------------------------- | ----------- | ----- |
| **body** | [**PureCloud**](PureCloud.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersPureengage"></a>

# **putIdentityprovidersPureengage**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersPureengage(body)

Update/Create PureEngage Identity Provider

Wraps PUT /api/v2/identityproviders/pureengage

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
PureEngage body = new PureEngage(); // PureEngage | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersPureengage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersPureengage");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes |
| -------- | ------------------------------- | ----------- | ----- |
| **body** | [**PureEngage**](PureEngage.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)

<a name="putIdentityprovidersSalesforce"></a>

# **putIdentityprovidersSalesforce**

> [OAuthProvider](OAuthProvider.md) putIdentityprovidersSalesforce(body)

Update/Create Salesforce Identity Provider

Wraps PUT /api/v2/identityproviders/salesforce

Requires ANY permissions:

- sso:provider:add
- sso:provider:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IdentityProviderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IdentityProviderApi apiInstance = new IdentityProviderApi();
Salesforce body = new Salesforce(); // Salesforce | Provider
try {
    OAuthProvider result = apiInstance.putIdentityprovidersSalesforce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityProviderApi#putIdentityprovidersSalesforce");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                            | Description | Notes |
| -------- | ------------------------------- | ----------- | ----- |
| **body** | [**Salesforce**](Salesforce.md) | Provider    |

{: class="table-striped"}

### Return type

[**OAuthProvider**](OAuthProvider.md)
