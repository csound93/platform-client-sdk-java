---
title: AuthorizationApi
---

## AuthorizationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                       | Description                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| [**deleteAuthorizationDivision**](AuthorizationApi.md#deleteAuthorizationDivision)                                           | Delete a division.                                                                     |
| [**deleteAuthorizationRole**](AuthorizationApi.md#deleteAuthorizationRole)                                                   | Delete an organization role.                                                           |
| [**deleteAuthorizationSubjectDivisionRole**](AuthorizationApi.md#deleteAuthorizationSubjectDivisionRole)                     | Delete a grant of a role in a division                                                 |
| [**getAuthorizationDivision**](AuthorizationApi.md#getAuthorizationDivision)                                                 | Returns an authorization division.                                                     |
| [**getAuthorizationDivisionGrants**](AuthorizationApi.md#getAuthorizationDivisionGrants)                                     | Gets all grants for a given division.                                                  |
| [**getAuthorizationDivisions**](AuthorizationApi.md#getAuthorizationDivisions)                                               | Retrieve a list of all divisions defined for the organization                          |
| [**getAuthorizationDivisionsHome**](AuthorizationApi.md#getAuthorizationDivisionsHome)                                       | Retrieve the home division for the organization.                                       |
| [**getAuthorizationDivisionsLimit**](AuthorizationApi.md#getAuthorizationDivisionsLimit)                                     | Returns the maximum allowed number of divisions.                                       |
| [**getAuthorizationDivisionspermittedMe**](AuthorizationApi.md#getAuthorizationDivisionspermittedMe)                         | Returns which divisions the current user has the given permission in.                  |
| [**getAuthorizationDivisionspermittedPagedMe**](AuthorizationApi.md#getAuthorizationDivisionspermittedPagedMe)               | Returns which divisions the current user has the given permission in.                  |
| [**getAuthorizationDivisionspermittedPagedSubjectId**](AuthorizationApi.md#getAuthorizationDivisionspermittedPagedSubjectId) | Returns which divisions the specified user has the given permission in.                |
| [**getAuthorizationPermissions**](AuthorizationApi.md#getAuthorizationPermissions)                                           | Get all permissions.                                                                   |
| [**getAuthorizationProducts**](AuthorizationApi.md#getAuthorizationProducts)                                                 | Get the list of enabled products                                                       |
| [**getAuthorizationRole**](AuthorizationApi.md#getAuthorizationRole)                                                         | Get a single organization role.                                                        |
| [**getAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.md#getAuthorizationRoleComparedefaultRightRoleId)       | Get an org role to default role comparison                                             |
| [**getAuthorizationRoleSubjectgrants**](AuthorizationApi.md#getAuthorizationRoleSubjectgrants)                               | Get the subjects&#39; granted divisions in the specified role.                         |
| [**getAuthorizationRoleUsers**](AuthorizationApi.md#getAuthorizationRoleUsers)                                               | Get a list of the users in a specified role.                                           |
| [**getAuthorizationRoles**](AuthorizationApi.md#getAuthorizationRoles)                                                       | Retrieve a list of all roles defined for the organization                              |
| [**getAuthorizationSubject**](AuthorizationApi.md#getAuthorizationSubject)                                                   | Returns a listing of roles and permissions for a user.                                 |
| [**getAuthorizationSubjectsMe**](AuthorizationApi.md#getAuthorizationSubjectsMe)                                             | Returns a listing of roles and permissions for the currently authenticated user.       |
| [**getAuthorizationSubjectsRolecounts**](AuthorizationApi.md#getAuthorizationSubjectsRolecounts)                             | Get the count of roles granted to a list of subjects                                   |
| [**getUserRoles**](AuthorizationApi.md#getUserRoles)                                                                         | Returns a listing of roles and permissions for a user.                                 |
| [**patchAuthorizationRole**](AuthorizationApi.md#patchAuthorizationRole)                                                     | Patch Organization Role for needsUpdate Field                                          |
| [**postAuthorizationDivisionObject**](AuthorizationApi.md#postAuthorizationDivisionObject)                                   | Assign a list of objects to a division                                                 |
| [**postAuthorizationDivisionRestore**](AuthorizationApi.md#postAuthorizationDivisionRestore)                                 | Recreate a previously deleted division.                                                |
| [**postAuthorizationDivisions**](AuthorizationApi.md#postAuthorizationDivisions)                                             | Create a division.                                                                     |
| [**postAuthorizationRole**](AuthorizationApi.md#postAuthorizationRole)                                                       | Bulk-grant subjects and divisions with an organization role.                           |
| [**postAuthorizationRoleComparedefaultRightRoleId**](AuthorizationApi.md#postAuthorizationRoleComparedefaultRightRoleId)     | Get an unsaved org role to default role comparison                                     |
| [**postAuthorizationRoles**](AuthorizationApi.md#postAuthorizationRoles)                                                     | Create an organization role.                                                           |
| [**postAuthorizationRolesDefault**](AuthorizationApi.md#postAuthorizationRolesDefault)                                       | Restores all default roles                                                             |
| [**postAuthorizationSubjectBulkadd**](AuthorizationApi.md#postAuthorizationSubjectBulkadd)                                   | Bulk-grant roles and divisions to a subject.                                           |
| [**postAuthorizationSubjectBulkremove**](AuthorizationApi.md#postAuthorizationSubjectBulkremove)                             | Bulk-remove grants from a subject.                                                     |
| [**postAuthorizationSubjectBulkreplace**](AuthorizationApi.md#postAuthorizationSubjectBulkreplace)                           | Replace subject&#39;s roles and divisions with the exact list supplied in the request. |
| [**postAuthorizationSubjectDivisionRole**](AuthorizationApi.md#postAuthorizationSubjectDivisionRole)                         | Make a grant of a role in a division                                                   |
| [**putAuthorizationDivision**](AuthorizationApi.md#putAuthorizationDivision)                                                 | Update a division.                                                                     |
| [**putAuthorizationRole**](AuthorizationApi.md#putAuthorizationRole)                                                         | Update an organization role.                                                           |
| [**putAuthorizationRoleUsersAdd**](AuthorizationApi.md#putAuthorizationRoleUsersAdd)                                         | Sets the users for the role                                                            |
| [**putAuthorizationRoleUsersRemove**](AuthorizationApi.md#putAuthorizationRoleUsersRemove)                                   | Removes the users from the role                                                        |
| [**putAuthorizationRolesDefault**](AuthorizationApi.md#putAuthorizationRolesDefault)                                         | Restore specified default roles                                                        |
| [**putUserRoles**](AuthorizationApi.md#putUserRoles)                                                                         | Sets the user&#39;s roles                                                              |

{: class="table-striped"}

<a name="deleteAuthorizationDivision"></a>

# **deleteAuthorizationDivision**

> Void deleteAuthorizationDivision(divisionId, force)

Delete a division.

Wraps DELETE /api/v2/authorization/divisions/{divisionId}

Requires ANY permissions:

- authorization:division:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean force = false; // Boolean | Force delete this division as well as the grants and objects associated with it
try {
    apiInstance.deleteAuthorizationDivision(divisionId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                                                     | Notes                         |
| -------------- | ----------- | ------------------------------------------------------------------------------- | ----------------------------- |
| **divisionId** | **String**  | Division ID                                                                     |
| **force**      | **Boolean** | Force delete this division as well as the grants and objects associated with it | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteAuthorizationRole"></a>

# **deleteAuthorizationRole**

> Void deleteAuthorizationRole(roleId)

Delete an organization role.

Wraps DELETE /api/v2/authorization/roles/{roleId}

Requires ANY permissions:

- authorization:role:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
try {
    apiInstance.deleteAuthorizationRole(roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **roleId** | **String** | Role ID     |

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division of the grant
String roleId = "roleId_example"; // String | the id of the role of the grant
try {
    apiInstance.deleteAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#deleteAuthorizationSubjectDivisionRole");
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

<a name="getAuthorizationDivision"></a>

# **getAuthorizationDivision**

> [AuthzDivision](AuthzDivision.md) getAuthorizationDivision(divisionId, objectCount)

Returns an authorization division.

Wraps GET /api/v2/authorization/divisions/{divisionId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Boolean objectCount = false; // Boolean | Get count of objects in this division, grouped by type
try {
    AuthzDivision result = apiInstance.getAuthorizationDivision(divisionId, objectCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description                                            | Notes                         |
| --------------- | ----------- | ------------------------------------------------------ | ----------------------------- |
| **divisionId**  | **String**  | Division ID                                            |
| **objectCount** | **Boolean** | Get count of objects in this division, grouped by type | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AuthzDivision**](AuthzDivision.md)

<a name="getAuthorizationDivisionGrants"></a>

# **getAuthorizationDivisionGrants**

> [AuthzDivisionGrantEntityListing](AuthzDivisionGrantEntityListing.md) getAuthorizationDivisionGrants(divisionId, pageNumber, pageSize)

Gets all grants for a given division.

Returns all grants assigned to a given division. Maximum page size is 500.

Wraps GET /api/v2/authorization/divisions/{divisionId}/grants

Requires ANY permissions:

- authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    AuthzDivisionGrantEntityListing result = apiInstance.getAuthorizationDivisionGrants(divisionId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionGrants");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **divisionId** | **String**  | Division ID |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |

{: class="table-striped"}

### Return type

[**AuthzDivisionGrantEntityListing**](AuthzDivisionGrantEntityListing.md)

<a name="getAuthorizationDivisions"></a>

# **getAuthorizationDivisions**

> [AuthzDivisionEntityListing](AuthzDivisionEntityListing.md) getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name)

Retrieve a list of all divisions defined for the organization

Request specific divisions by id using a query param \&quot;id\&quot;, e.g. ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3

Wraps GET /api/v2/authorization/divisions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Boolean objectCount = false; // Boolean | Include the count of objects contained in the division
List<String> id = Arrays.asList("id_example"); // List<String> | Optionally request specific divisions by their IDs
String name = "name_example"; // String | Search term to filter by division name
try {
    AuthzDivisionEntityListing result = apiInstance.getAuthorizationDivisions(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, objectCount, id, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                            | Notes                         |
| ---------------- | ----------------------------------- | ------------------------------------------------------ | ----------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested                          | [optional] [default to 25]    |
| **pageNumber**   | **Integer**                         | The page number requested                              | [optional] [default to 1]     |
| **sortBy**       | **String**                          | variable name requested to sort by                     | [optional]                    |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                 | [optional]                    |
| **nextPage**     | **String**                          | next page token                                        | [optional]                    |
| **previousPage** | **String**                          | Previous page token                                    | [optional]                    |
| **objectCount**  | **Boolean**                         | Include the count of objects contained in the division | [optional] [default to false] |
| **id**           | [**List&lt;String&gt;**](String.md) | Optionally request specific divisions by their IDs     | [optional]                    |
| **name**         | **String**                          | Search term to filter by division name                 | [optional]                    |

{: class="table-striped"}

### Return type

[**AuthzDivisionEntityListing**](AuthzDivisionEntityListing.md)

<a name="getAuthorizationDivisionsHome"></a>

# **getAuthorizationDivisionsHome**

> [AuthzDivision](AuthzDivision.md) getAuthorizationDivisionsHome()

Retrieve the home division for the organization.

Will not include object counts.

Wraps GET /api/v2/authorization/divisions/home

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthzDivision result = apiInstance.getAuthorizationDivisionsHome();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsHome");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AuthzDivision**](AuthzDivision.md)

<a name="getAuthorizationDivisionsLimit"></a>

# **getAuthorizationDivisionsLimit**

> Integer getAuthorizationDivisionsLimit()

Returns the maximum allowed number of divisions.

Wraps GET /api/v2/authorization/divisions/limit

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

**Integer**

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
String name = "name_example"; // String | Search term to filter by division name
try {
    List<AuthzDivision> result = apiInstance.getAuthorizationDivisionspermittedMe(permission, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedMe");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedMe(permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedPagedMe");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String permission = "permission_example"; // String | The permission string, including the object to access, e.g. routing:queue:view
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    DivsPermittedEntityListing result = apiInstance.getAuthorizationDivisionspermittedPagedSubjectId(subjectId, permission, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationDivisionspermittedPagedSubjectId");
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

<a name="getAuthorizationPermissions"></a>

# **getAuthorizationPermissions**

> [PermissionCollectionEntityListing](PermissionCollectionEntityListing.md) getAuthorizationPermissions(pageSize, pageNumber, queryType, query)

Get all permissions.

Retrieve a list of all permission defined in the system.

Wraps GET /api/v2/authorization/permissions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String queryType = "queryType_example"; // String | Query filter type
String query = "query_example"; // String | Comma-separated list of permissions or domains to query
try {
    PermissionCollectionEntityListing result = apiInstance.getAuthorizationPermissions(pageSize, pageNumber, queryType, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationPermissions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description                                             | Notes                                          |
| -------------- | ----------- | ------------------------------------------------------- | ---------------------------------------------- |
| **pageSize**   | **Integer** | Page size                                               | [optional] [default to 25]                     |
| **pageNumber** | **Integer** | Page number                                             | [optional] [default to 1]                      |
| **queryType**  | **String**  | Query filter type                                       | [optional]<br />**Values**: domain, permission |
| **query**      | **String**  | Comma-separated list of permissions or domains to query | [optional]                                     |

{: class="table-striped"}

### Return type

[**PermissionCollectionEntityListing**](PermissionCollectionEntityListing.md)

<a name="getAuthorizationProducts"></a>

# **getAuthorizationProducts**

> [OrganizationProductEntityListing](OrganizationProductEntityListing.md) getAuthorizationProducts()

Get the list of enabled products

Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.

Wraps GET /api/v2/authorization/products

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    OrganizationProductEntityListing result = apiInstance.getAuthorizationProducts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationProducts");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**OrganizationProductEntityListing**](OrganizationProductEntityListing.md)

<a name="getAuthorizationRole"></a>

# **getAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.md) getAuthorizationRole(roleId, expand)

Get a single organization role.

Get the organization role specified by its ID.

Wraps GET /api/v2/authorization/roles/{roleId}

Requires ANY permissions:

- authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand. \"unusedPermissions\" returns the permissions not used for the role
try {
    DomainOrganizationRole result = apiInstance.getAuthorizationRole(roleId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                                                                                                    | Notes                                         |
| ---------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------------- | --------------------------------------------- |
| **roleId** | **String**                          | Role ID                                                                                                        |
| **expand** | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand. \&quot;unusedPermissions\&quot; returns the permissions not used for the role | [optional]<br />**Values**: unusedPermissions |

{: class="table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

<a name="getAuthorizationRoleComparedefaultRightRoleId"></a>

# **getAuthorizationRoleComparedefaultRightRoleId**

> [DomainOrgRoleDifference](DomainOrgRoleDifference.md) getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId)

Get an org role to default role comparison

Compares any organization role to a default role id and show differences

Wraps GET /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}

Requires ANY permissions:

- authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
try {
    DomainOrgRoleDifference result = apiInstance.getAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description   | Notes |
| --------------- | ---------- | ------------- | ----- |
| **leftRoleId**  | **String** | Left Role ID  |
| **rightRoleId** | **String** | Right Role id |

{: class="table-striped"}

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.md)

<a name="getAuthorizationRoleSubjectgrants"></a>

# **getAuthorizationRoleSubjectgrants**

> [SubjectDivisionGrantsEntityListing](SubjectDivisionGrantsEntityListing.md) getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage)

Get the subjects&#39; granted divisions in the specified role.

Includes the divisions for which the subject has a grant.

Wraps GET /api/v2/authorization/roles/{roleId}/subjectgrants

Requires ANY permissions:

- authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
try {
    SubjectDivisionGrantsEntityListing result = apiInstance.getAuthorizationRoleSubjectgrants(roleId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleSubjectgrants");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                            | Notes                      |
| ---------------- | ----------------------------------- | -------------------------------------- | -------------------------- |
| **roleId**       | **String**                          | Role ID                                |
| **pageSize**     | **Integer**                         | The total page size requested          | [optional] [default to 25] |
| **pageNumber**   | **Integer**                         | The page number requested              | [optional] [default to 1]  |
| **sortBy**       | **String**                          | variable name requested to sort by     | [optional]                 |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                 |
| **nextPage**     | **String**                          | next page token                        | [optional]                 |
| **previousPage** | **String**                          | Previous page token                    | [optional]                 |

{: class="table-striped"}

### Return type

[**SubjectDivisionGrantsEntityListing**](SubjectDivisionGrantsEntityListing.md)

<a name="getAuthorizationRoleUsers"></a>

# **getAuthorizationRoleUsers**

> [UserEntityListing](UserEntityListing.md) getAuthorizationRoleUsers(roleId, pageSize, pageNumber)

Get a list of the users in a specified role.

Get an array of the UUIDs of the users in the specified role.

Wraps GET /api/v2/authorization/roles/{roleId}/users

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    UserEntityListing result = apiInstance.getAuthorizationRoleUsers(roleId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoleUsers");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **roleId**     | **String**  | Role ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**UserEntityListing**](UserEntityListing.md)

<a name="getAuthorizationRoles"></a>

# **getAuthorizationRoles**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.md) getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id)

Retrieve a list of all roles defined for the organization

Wraps GET /api/v2/authorization/roles

Requires ANY permissions:

- authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String |
List<String> permission = Arrays.asList("permission_example"); // List<String> |
List<String> defaultRoleId = Arrays.asList("defaultRoleId_example"); // List<String> |
Boolean userCount = true; // Boolean |
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    OrganizationRoleEntityListing result = apiInstance.getAuthorizationRoles(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, permission, defaultRoleId, userCount, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                | Description                            | Notes                        |
| ----------------- | ----------------------------------- | -------------------------------------- | ---------------------------- |
| **pageSize**      | **Integer**                         | The total page size requested          | [optional] [default to 25]   |
| **pageNumber**    | **Integer**                         | The page number requested              | [optional] [default to 1]    |
| **sortBy**        | **String**                          | variable name requested to sort by     | [optional]                   |
| **expand**        | [**List&lt;String&gt;**](String.md) | variable name requested by expand list | [optional]                   |
| **nextPage**      | **String**                          | next page token                        | [optional]                   |
| **previousPage**  | **String**                          | Previous page token                    | [optional]                   |
| **name**          | **String**                          |                                        | [optional]                   |
| **permission**    | [**List&lt;String&gt;**](String.md) |                                        | [optional]                   |
| **defaultRoleId** | [**List&lt;String&gt;**](String.md) |                                        | [optional]                   |
| **userCount**     | **Boolean**                         |                                        | [optional] [default to true] |
| **id**            | [**List&lt;String&gt;**](String.md) | id                                     | [optional]                   |

{: class="table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
try {
    AuthzSubject result = apiInstance.getAuthorizationSubject(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubject");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    AuthzSubject result = apiInstance.getAuthorizationSubjectsMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AuthzSubject**](AuthzSubject.md)

<a name="getAuthorizationSubjectsRolecounts"></a>

# **getAuthorizationSubjectsRolecounts**

> [Map&lt;String, Object&gt;](Map.md) getAuthorizationSubjectsRolecounts(id)

Get the count of roles granted to a list of subjects

Wraps GET /api/v2/authorization/subjects/rolecounts

Requires ANY permissions:

- authorization:grant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<String> id = Arrays.asList("id_example"); // List<String> | id
try {
    Map<String, Object> result = apiInstance.getAuthorizationSubjectsRolecounts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getAuthorizationSubjectsRolecounts");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description | Notes      |
| ------ | ----------------------------------- | ----------- | ---------- |
| **id** | [**List&lt;String&gt;**](String.md) | id          | [optional] |

{: class="table-striped"}

### Return type

[**Map&lt;String, Object&gt;**](Map.md)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
try {
    UserAuthorization result = apiInstance.getUserRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#getUserRoles");
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

<a name="patchAuthorizationRole"></a>

# **patchAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.md) patchAuthorizationRole(roleId, body)

Patch Organization Role for needsUpdate Field

Patch Organization Role for needsUpdate Field

Wraps PATCH /api/v2/authorization/roles/{roleId}

Requires ANY permissions:

- authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrganizationRole result = apiInstance.patchAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#patchAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                    | Description       | Notes |
| ---------- | ------------------------------------------------------- | ----------------- | ----- |
| **roleId** | **String**                                              | Role ID           |
| **body**   | [**DomainOrganizationRole**](DomainOrganizationRole.md) | Organization role |

{: class="table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

<a name="postAuthorizationDivisionObject"></a>

# **postAuthorizationDivisionObject**

> Void postAuthorizationDivisionObject(divisionId, objectType, body)

Assign a list of objects to a division

Set the division of a specified list of objects. The objects must all be of the same type, one of: CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER. The body of the request is a list of object IDs, which are expected to be GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]

Wraps POST /api/v2/authorization/divisions/{divisionId}/objects/{objectType}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
String objectType = "objectType_example"; // String | The type of the objects. Must be one of the valid object types
List<String> body = Arrays.asList(new List<String>()); // List<String> | Object Id List
try {
    apiInstance.postAuthorizationDivisionObject(divisionId, objectType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisionObject");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                   | Description                                                    | Notes                                                                                                                                                                                                                                                                                                |
| -------------- | ---------------------- | -------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **divisionId** | **String**             | Division ID                                                    |
| **objectType** | **String**             | The type of the objects. Must be one of the valid object types | <br />**Values**: QUEUE, CAMPAIGN, CONTACTLIST, DNCLIST, EMAILCAMPAIGN, MESSAGINGCAMPAIGN, MANAGEMENTUNIT, BUSINESSUNIT, FLOW, FLOWMILESTONE, FLOWOUTCOME, USER, CALLROUTE, EMERGENCYGROUPS, ROUTINGSCHEDULES, ROUTINGSCHEDULEGROUPS, DATATABLES, TEAM, WORKBIN, WORKTYPE, EXTENSIONPOOL, SKILLGROUP |
| **body**       | **List&lt;String&gt;** | Object Id List                                                 |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postAuthorizationDivisionRestore"></a>

# **postAuthorizationDivisionRestore**

> [AuthzDivision](AuthzDivision.md) postAuthorizationDivisionRestore(divisionId, body)

Recreate a previously deleted division.

Wraps POST /api/v2/authorization/divisions/{divisionId}/restore

Requires ANY permissions:

- authorization:division:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Recreated division data
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisionRestore(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisionRestore");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                  | Description             | Notes |
| -------------- | ------------------------------------- | ----------------------- | ----- |
| **divisionId** | **String**                            | Division ID             |
| **body**       | [**AuthzDivision**](AuthzDivision.md) | Recreated division data |

{: class="table-striped"}

### Return type

[**AuthzDivision**](AuthzDivision.md)

<a name="postAuthorizationDivisions"></a>

# **postAuthorizationDivisions**

> [AuthzDivision](AuthzDivision.md) postAuthorizationDivisions(body)

Create a division.

Wraps POST /api/v2/authorization/divisions

Requires ALL permissions:

- authorization:division:add
- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Division
try {
    AuthzDivision result = apiInstance.postAuthorizationDivisions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationDivisions");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description | Notes |
| -------- | ------------------------------------- | ----------- | ----- |
| **body** | [**AuthzDivision**](AuthzDivision.md) | Division    |

{: class="table-striped"}

### Return type

[**AuthzDivision**](AuthzDivision.md)

<a name="postAuthorizationRole"></a>

# **postAuthorizationRole**

> Void postAuthorizationRole(roleId, body, subjectType)

Bulk-grant subjects and divisions with an organization role.

Wraps POST /api/v2/authorization/roles/{roleId}

Requires ANY permissions:

- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
SubjectDivisions body = new SubjectDivisions(); // SubjectDivisions | Subjects and Divisions
String subjectType = "PC_USER"; // String | what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationRole(roleId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                        | Description                                                              | Notes                           |
| --------------- | ------------------------------------------- | ------------------------------------------------------------------------ | ------------------------------- |
| **roleId**      | **String**                                  | Role ID                                                                  |
| **body**        | [**SubjectDivisions**](SubjectDivisions.md) | Subjects and Divisions                                                   |
| **subjectType** | **String**                                  | what the type of the subjects are (PC_GROUP, PC_USER or PC_OAUTH_CLIENT) | [optional] [default to PC_USER] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postAuthorizationRoleComparedefaultRightRoleId"></a>

# **postAuthorizationRoleComparedefaultRightRoleId**

> [DomainOrgRoleDifference](DomainOrgRoleDifference.md) postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body)

Get an unsaved org role to default role comparison

Allows users to compare their existing roles in an unsaved state to its default role

Wraps POST /api/v2/authorization/roles/{leftRoleId}/comparedefault/{rightRoleId}

Requires ANY permissions:

- authorization:role:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String leftRoleId = "leftRoleId_example"; // String | Left Role ID
String rightRoleId = "rightRoleId_example"; // String | Right Role id
DomainOrganizationRole body = new DomainOrganizationRole(); // DomainOrganizationRole | Organization role
try {
    DomainOrgRoleDifference result = apiInstance.postAuthorizationRoleComparedefaultRightRoleId(leftRoleId, rightRoleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoleComparedefaultRightRoleId");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                                    | Description       | Notes |
| --------------- | ------------------------------------------------------- | ----------------- | ----- |
| **leftRoleId**  | **String**                                              | Left Role ID      |
| **rightRoleId** | **String**                                              | Right Role id     |
| **body**        | [**DomainOrganizationRole**](DomainOrganizationRole.md) | Organization role |

{: class="table-striped"}

### Return type

[**DomainOrgRoleDifference**](DomainOrgRoleDifference.md)

<a name="postAuthorizationRoles"></a>

# **postAuthorizationRoles**

> [DomainOrganizationRole](DomainOrganizationRole.md) postAuthorizationRoles(body)

Create an organization role.

Wraps POST /api/v2/authorization/roles

Requires ANY permissions:

- authorization:role:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
DomainOrganizationRoleCreate body = new DomainOrganizationRoleCreate(); // DomainOrganizationRoleCreate | Organization role
try {
    DomainOrganizationRole result = apiInstance.postAuthorizationRoles(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRoles");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description       | Notes |
| -------- | ------------------------------------------------------------------- | ----------------- | ----- |
| **body** | [**DomainOrganizationRoleCreate**](DomainOrganizationRoleCreate.md) | Organization role |

{: class="table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

<a name="postAuthorizationRolesDefault"></a>

# **postAuthorizationRolesDefault**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.md) postAuthorizationRolesDefault(force)

Restores all default roles

This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.

Wraps POST /api/v2/authorization/roles/default

Requires ANY permissions:

- authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
Boolean force = false; // Boolean | Restore default roles
try {
    OrganizationRoleEntityListing result = apiInstance.postAuthorizationRolesDefault(force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type        | Description           | Notes                         |
| --------- | ----------- | --------------------- | ----------------------------- |
| **force** | **Boolean** | Restore default roles | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkadd(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkadd");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
try {
    apiInstance.postAuthorizationSubjectBulkremove(subjectId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkremove");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
RoleDivisionGrants body = new RoleDivisionGrants(); // RoleDivisionGrants | Pairs of role and division IDs
String subjectType = "PC_USER"; // String | what the type of the subject is (PC_GROUP, PC_USER or PC_OAUTH_CLIENT)
try {
    apiInstance.postAuthorizationSubjectBulkreplace(subjectId, body, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectBulkreplace");
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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String subjectId = "subjectId_example"; // String | Subject ID (user or group)
String divisionId = "divisionId_example"; // String | the id of the division to which to make the grant
String roleId = "roleId_example"; // String | the id of the role to grant
String subjectType = "PC_USER"; // String | what the type of the subject is: PC_GROUP, PC_USER or PC_OAUTH_CLIENT (note: for cross-org authorization, please use the Organization Authorization endpoints)
try {
    apiInstance.postAuthorizationSubjectDivisionRole(subjectId, divisionId, roleId, subjectType);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#postAuthorizationSubjectDivisionRole");
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

<a name="putAuthorizationDivision"></a>

# **putAuthorizationDivision**

> [AuthzDivision](AuthzDivision.md) putAuthorizationDivision(divisionId, body)

Update a division.

Wraps PUT /api/v2/authorization/divisions/{divisionId}

Requires ANY permissions:

- authorization:division:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String divisionId = "divisionId_example"; // String | Division ID
AuthzDivision body = new AuthzDivision(); // AuthzDivision | Updated division data
try {
    AuthzDivision result = apiInstance.putAuthorizationDivision(divisionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationDivision");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                  | Description           | Notes |
| -------------- | ------------------------------------- | --------------------- | ----- |
| **divisionId** | **String**                            | Division ID           |
| **body**       | [**AuthzDivision**](AuthzDivision.md) | Updated division data |

{: class="table-striped"}

### Return type

[**AuthzDivision**](AuthzDivision.md)

<a name="putAuthorizationRole"></a>

# **putAuthorizationRole**

> [DomainOrganizationRole](DomainOrganizationRole.md) putAuthorizationRole(roleId, body)

Update an organization role.

Update

Wraps PUT /api/v2/authorization/roles/{roleId}

Requires ANY permissions:

- authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
DomainOrganizationRoleUpdate body = new DomainOrganizationRoleUpdate(); // DomainOrganizationRoleUpdate | Organization role
try {
    DomainOrganizationRole result = apiInstance.putAuthorizationRole(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRole");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                | Description       | Notes |
| ---------- | ------------------------------------------------------------------- | ----------------- | ----- |
| **roleId** | **String**                                                          | Role ID           |
| **body**   | [**DomainOrganizationRoleUpdate**](DomainOrganizationRoleUpdate.md) | Organization role |

{: class="table-striped"}

### Return type

[**DomainOrganizationRole**](DomainOrganizationRole.md)

<a name="putAuthorizationRoleUsersAdd"></a>

# **putAuthorizationRoleUsersAdd**

> List&lt;String&gt; putAuthorizationRoleUsersAdd(roleId, body)

Sets the users for the role

Wraps PUT /api/v2/authorization/roles/{roleId}/users/add

Requires ANY permissions:

- authorization:grant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersAdd(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersAdd");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                   | Description      | Notes |
| ---------- | ---------------------- | ---------------- | ----- |
| **roleId** | **String**             | Role ID          |
| **body**   | **List&lt;String&gt;** | List of user IDs |

{: class="table-striped"}

### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRoleUsersRemove"></a>

# **putAuthorizationRoleUsersRemove**

> List&lt;String&gt; putAuthorizationRoleUsersRemove(roleId, body)

Removes the users from the role

Wraps PUT /api/v2/authorization/roles/{roleId}/users/remove

Requires ANY permissions:

- authorization:grant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String roleId = "roleId_example"; // String | Role ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of user IDs
try {
    List<String> result = apiInstance.putAuthorizationRoleUsersRemove(roleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRoleUsersRemove");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                   | Description      | Notes |
| ---------- | ---------------------- | ---------------- | ----- |
| **roleId** | **String**             | Role ID          |
| **body**   | **List&lt;String&gt;** | List of user IDs |

{: class="table-striped"}

### Return type

**List&lt;String&gt;**

<a name="putAuthorizationRolesDefault"></a>

# **putAuthorizationRolesDefault**

> [OrganizationRoleEntityListing](OrganizationRoleEntityListing.md) putAuthorizationRolesDefault(body)

Restore specified default roles

Wraps PUT /api/v2/authorization/roles/default

Requires ANY permissions:

- authorization:role:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
List<DomainOrganizationRole> body = Arrays.asList(new DomainOrganizationRole()); // List<DomainOrganizationRole> | Organization roles list
try {
    OrganizationRoleEntityListing result = apiInstance.putAuthorizationRolesDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putAuthorizationRolesDefault");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description             | Notes |
| -------- | ------------------------------------------------------------------- | ----------------------- | ----- |
| **body** | [**List&lt;DomainOrganizationRole&gt;**](DomainOrganizationRole.md) | Organization roles list |

{: class="table-striped"}

### Return type

[**OrganizationRoleEntityListing**](OrganizationRoleEntityListing.md)

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
import com.mypurecloud.sdk.v2.api.AuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuthorizationApi apiInstance = new AuthorizationApi();
String userId = "userId_example"; // String | User ID
List<String> body = Arrays.asList(new List<String>()); // List<String> | List of roles
try {
    UserAuthorization result = apiInstance.putUserRoles(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#putUserRoles");
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
