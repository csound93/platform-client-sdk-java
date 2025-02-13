---
title: KnowledgeApi
---

## KnowledgeApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                         | Description                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------- |
| [**deleteKnowledgeKnowledgebase**](KnowledgeApi.md#deleteKnowledgeKnowledgebase)                                               | Delete knowledge base                                                                 |
| [**deleteKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.md#deleteKnowledgeKnowledgebaseLanguageCategory)               | Delete category                                                                       |
| [**deleteKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.md#deleteKnowledgeKnowledgebaseLanguageDocument)               | Delete document                                                                       |
| [**deleteKnowledgeKnowledgebaseLanguageDocumentsImport**](KnowledgeApi.md#deleteKnowledgeKnowledgebaseLanguageDocumentsImport) | Delete import operation                                                               |
| [**getKnowledgeKnowledgebase**](KnowledgeApi.md#getKnowledgeKnowledgebase)                                                     | Get knowledge base                                                                    |
| [**getKnowledgeKnowledgebaseLanguageCategories**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageCategories)                 | Get categories                                                                        |
| [**getKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageCategory)                     | Get category                                                                          |
| [**getKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageDocument)                     | Get document                                                                          |
| [**getKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageDocuments)                   | Get documents                                                                         |
| [**getKnowledgeKnowledgebaseLanguageDocumentsImport**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageDocumentsImport)       | Get import operation report                                                           |
| [**getKnowledgeKnowledgebaseLanguageTraining**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageTraining)                     | Get training detail                                                                   |
| [**getKnowledgeKnowledgebaseLanguageTrainings**](KnowledgeApi.md#getKnowledgeKnowledgebaseLanguageTrainings)                   | Get all trainings information for a knowledgebase                                     |
| [**getKnowledgeKnowledgebases**](KnowledgeApi.md#getKnowledgeKnowledgebases)                                                   | Get knowledge bases                                                                   |
| [**patchKnowledgeKnowledgebase**](KnowledgeApi.md#patchKnowledgeKnowledgebase)                                                 | Update knowledge base                                                                 |
| [**patchKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.md#patchKnowledgeKnowledgebaseLanguageCategory)                 | Update category                                                                       |
| [**patchKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.md#patchKnowledgeKnowledgebaseLanguageDocument)                 | Update document                                                                       |
| [**patchKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.md#patchKnowledgeKnowledgebaseLanguageDocuments)               | Update documents collection                                                           |
| [**patchKnowledgeKnowledgebaseLanguageDocumentsImport**](KnowledgeApi.md#patchKnowledgeKnowledgebaseLanguageDocumentsImport)   | Start import operation                                                                |
| [**postKnowledgeDocumentuploads**](KnowledgeApi.md#postKnowledgeDocumentuploads)                                               | Creates a presigned URL for uploading a knowledge import file with a set of documents |
| [**postKnowledgeKnowledgebaseLanguageCategories**](KnowledgeApi.md#postKnowledgeKnowledgebaseLanguageCategories)               | Create new category                                                                   |
| [**postKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.md#postKnowledgeKnowledgebaseLanguageDocuments)                 | Create document                                                                       |
| [**postKnowledgeKnowledgebaseLanguageDocumentsImports**](KnowledgeApi.md#postKnowledgeKnowledgebaseLanguageDocumentsImports)   | Create import operation                                                               |
| [**postKnowledgeKnowledgebaseLanguageTrainingPromote**](KnowledgeApi.md#postKnowledgeKnowledgebaseLanguageTrainingPromote)     | Promote trained documents from draft state to active.                                 |
| [**postKnowledgeKnowledgebaseLanguageTrainings**](KnowledgeApi.md#postKnowledgeKnowledgebaseLanguageTrainings)                 | Trigger training                                                                      |
| [**postKnowledgeKnowledgebaseSearch**](KnowledgeApi.md#postKnowledgeKnowledgebaseSearch)                                       | Search Documents                                                                      |
| [**postKnowledgeKnowledgebases**](KnowledgeApi.md#postKnowledgeKnowledgebases)                                                 | Create new knowledge base                                                             |

{: class="table-striped"}

<a name="deleteKnowledgeKnowledgebase"></a>

# **deleteKnowledgeKnowledgebase**

> [KnowledgeBase](KnowledgeBase.md) deleteKnowledgeKnowledgebase(knowledgeBaseId)

Delete knowledge base

Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}

Requires ALL permissions:

- knowledge:knowledgebase:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
try {
    KnowledgeBase result = apiInstance.deleteKnowledgeKnowledgebase(knowledgeBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **knowledgeBaseId** | **String** | Knowledge base ID |

{: class="table-striped"}

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

<a name="deleteKnowledgeKnowledgebaseLanguageCategory"></a>

# **deleteKnowledgeKnowledgebaseLanguageCategory**

> [KnowledgeCategory](KnowledgeCategory.md) deleteKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode)

Delete category

Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}

Requires ALL permissions:

- knowledge:category:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeCategory result = apiInstance.deleteKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **categoryId**      | **String** | Category ID                        |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |

{: class="table-striped"}

### Return type

[**KnowledgeCategory**](KnowledgeCategory.md)

<a name="deleteKnowledgeKnowledgebaseLanguageDocument"></a>

# **deleteKnowledgeKnowledgebaseLanguageDocument**

> [KnowledgeDocument](KnowledgeDocument.md) deleteKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode)

Delete document

Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}

Requires ALL permissions:

- knowledge:document:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeDocument result = apiInstance.deleteKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **documentId**      | **String** | Document ID                        |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |

{: class="table-striped"}

### Return type

[**KnowledgeDocument**](KnowledgeDocument.md)

<a name="deleteKnowledgeKnowledgebaseLanguageDocumentsImport"></a>

# **deleteKnowledgeKnowledgebaseLanguageDocumentsImport**

> Void deleteKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId)

Delete import operation

Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/imports/{importId}

Requires ALL permissions:

- knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String importId = "importId_example"; // String | Import ID
try {
    apiInstance.deleteKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebaseLanguageDocumentsImport");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **importId**        | **String** | Import ID                          |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getKnowledgeKnowledgebase"></a>

# **getKnowledgeKnowledgebase**

> [KnowledgeBase](KnowledgeBase.md) getKnowledgeKnowledgebase(knowledgeBaseId)

Get knowledge base

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}

Requires ALL permissions:

- knowledge:knowledgebase:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
try {
    KnowledgeBase result = apiInstance.getKnowledgeKnowledgebase(knowledgeBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **knowledgeBaseId** | **String** | Knowledge base ID |

{: class="table-striped"}

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

<a name="getKnowledgeKnowledgebaseLanguageCategories"></a>

# **getKnowledgeKnowledgebaseLanguageCategories**

> [CategoryListing](CategoryListing.md) getKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, before, after, limit, pageSize, name)

Get categories

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories

Requires ALL permissions:

- knowledge:category:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String name = "name_example"; // String | Filter to return the categories that starts with the given category name.
try {
    CategoryListing result = apiInstance.getKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, before, after, limit, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageCategories");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                                                                                                        | Notes                                                                                  |
| ------------------- | ---------- | ------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                                                                                                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE                                                                                 | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **before**          | **String** | The cursor that points to the start of the set of entities that has been returned.                                 | [optional]                                                                             |
| **after**           | **String** | The cursor that points to the end of the set of entities that has been returned.                                   | [optional]                                                                             |
| **limit**           | **String** | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional]                                                                             |
| **pageSize**        | **String** | Number of entities to return. Maximum of 200.                                                                      | [optional]                                                                             |
| **name**            | **String** | Filter to return the categories that starts with the given category name.                                          | [optional]                                                                             |

{: class="table-striped"}

### Return type

[**CategoryListing**](CategoryListing.md)

<a name="getKnowledgeKnowledgebaseLanguageCategory"></a>

# **getKnowledgeKnowledgebaseLanguageCategory**

> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.md) getKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode)

Get category

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}

Requires ALL permissions:

- knowledge:category:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeExtendedCategory result = apiInstance.getKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **categoryId**      | **String** | Category ID                        |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |

{: class="table-striped"}

### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.md)

<a name="getKnowledgeKnowledgebaseLanguageDocument"></a>

# **getKnowledgeKnowledgebaseLanguageDocument**

> [KnowledgeDocument](KnowledgeDocument.md) getKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode)

Get document

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}

Requires ALL permissions:

- knowledge:document:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeDocument result = apiInstance.getKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **documentId**      | **String** | Document ID                        |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |

{: class="table-striped"}

### Return type

[**KnowledgeDocument**](KnowledgeDocument.md)

<a name="getKnowledgeKnowledgebaseLanguageDocuments"></a>

# **getKnowledgeKnowledgebaseLanguageDocuments**

> [DocumentListing](DocumentListing.md) getKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds)

Get documents

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents

Requires ALL permissions:

- knowledge:document:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String categories = "categories_example"; // String | Filter by categories ids, comma separated values expected.
String title = "title_example"; // String | Filter by document title.
String sortBy = "sortBy_example"; // String | Sort by.
String sortOrder = "sortOrder_example"; // String | Sort Order.
List<String> documentIds = Arrays.asList("documentIds_example"); // List<String> | Comma-separated list of document identifiers to fetch by.
try {
    DocumentListing result = apiInstance.getKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                | Description                                                                                                        | Notes                                                                                  |
| ------------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                          | Knowledge base ID                                                                                                  |
| **languageCode**    | **String**                          | Language code, format: iso2-LOCALE                                                                                 | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **before**          | **String**                          | The cursor that points to the start of the set of entities that has been returned.                                 | [optional]                                                                             |
| **after**           | **String**                          | The cursor that points to the end of the set of entities that has been returned.                                   | [optional]                                                                             |
| **limit**           | **String**                          | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional]                                                                             |
| **pageSize**        | **String**                          | Number of entities to return. Maximum of 200.                                                                      | [optional]                                                                             |
| **categories**      | **String**                          | Filter by categories ids, comma separated values expected.                                                         | [optional]                                                                             |
| **title**           | **String**                          | Filter by document title.                                                                                          | [optional]                                                                             |
| **sortBy**          | **String**                          | Sort by.                                                                                                           | [optional]<br />**Values**: Title, Date                                                |
| **sortOrder**       | **String**                          | Sort Order.                                                                                                        | [optional]<br />**Values**: ASC, ascending, DESC, descending                           |
| **documentIds**     | [**List&lt;String&gt;**](String.md) | Comma-separated list of document identifiers to fetch by.                                                          | [optional]                                                                             |

{: class="table-striped"}

### Return type

[**DocumentListing**](DocumentListing.md)

<a name="getKnowledgeKnowledgebaseLanguageDocumentsImport"></a>

# **getKnowledgeKnowledgebaseLanguageDocumentsImport**

> [KnowledgeImport](KnowledgeImport.md) getKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId)

Get import operation report

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/imports/{importId}

Requires ALL permissions:

- knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String importId = "importId_example"; // String | Import ID
try {
    KnowledgeImport result = apiInstance.getKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageDocumentsImport");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **importId**        | **String** | Import ID                          |

{: class="table-striped"}

### Return type

[**KnowledgeImport**](KnowledgeImport.md)

<a name="getKnowledgeKnowledgebaseLanguageTraining"></a>

# **getKnowledgeKnowledgebaseLanguageTraining**

> [KnowledgeTraining](KnowledgeTraining.md) getKnowledgeKnowledgebaseLanguageTraining(knowledgeBaseId, languageCode, trainingId)

Get training detail

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings/{trainingId}

Requires ALL permissions:

- knowledge:training:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String trainingId = "trainingId_example"; // String | Training ID
try {
    KnowledgeTraining result = apiInstance.getKnowledgeKnowledgebaseLanguageTraining(knowledgeBaseId, languageCode, trainingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageTraining");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **trainingId**      | **String** | Training ID                        |

{: class="table-striped"}

### Return type

[**KnowledgeTraining**](KnowledgeTraining.md)

<a name="getKnowledgeKnowledgebaseLanguageTrainings"></a>

# **getKnowledgeKnowledgebaseLanguageTrainings**

> [TrainingListing](TrainingListing.md) getKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState)

Get all trainings information for a knowledgebase

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings

Requires ALL permissions:

- knowledge:training:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String knowledgeDocumentsState = "knowledgeDocumentsState_example"; // String | Return the training with the specified state of the trained documents.
try {
    TrainingListing result = apiInstance.getKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageTrainings");
    e.printStackTrace();
}
```

### Parameters

| Name                        | Type       | Description                                                                                                        | Notes                                                                                  |
| --------------------------- | ---------- | ------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId**         | **String** | Knowledge base ID                                                                                                  |
| **languageCode**            | **String** | Language code, format: iso2-LOCALE                                                                                 | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **before**                  | **String** | The cursor that points to the start of the set of entities that has been returned.                                 | [optional]                                                                             |
| **after**                   | **String** | The cursor that points to the end of the set of entities that has been returned.                                   | [optional]                                                                             |
| **limit**                   | **String** | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional]                                                                             |
| **pageSize**                | **String** | Number of entities to return. Maximum of 200.                                                                      | [optional]                                                                             |
| **knowledgeDocumentsState** | **String** | Return the training with the specified state of the trained documents.                                             | [optional]<br />**Values**: Draft, Active, Discarded, Archived                         |

{: class="table-striped"}

### Return type

[**TrainingListing**](TrainingListing.md)

<a name="getKnowledgeKnowledgebases"></a>

# **getKnowledgeKnowledgebases**

> [KnowledgeBaseListing](KnowledgeBaseListing.md) getKnowledgeKnowledgebases(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder)

Get knowledge bases

Wraps GET /api/v2/knowledge/knowledgebases

Requires ALL permissions:

- knowledge:knowledgebase:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String name = "name_example"; // String | Filter by Name.
String coreLanguage = "coreLanguage_example"; // String | Filter by core language.
Boolean published = true; // Boolean | Filter by published status.
String sortBy = "sortBy_example"; // String | Sort by.
String sortOrder = "sortOrder_example"; // String | Sort Order.
try {
    KnowledgeBaseListing result = apiInstance.getKnowledgeKnowledgebases(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebases");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                                                                                                        | Notes                                                                                            |
| ---------------- | ----------- | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| **before**       | **String**  | The cursor that points to the start of the set of entities that has been returned.                                 | [optional]                                                                                       |
| **after**        | **String**  | The cursor that points to the end of the set of entities that has been returned.                                   | [optional]                                                                                       |
| **limit**        | **String**  | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. | [optional]                                                                                       |
| **pageSize**     | **String**  | Number of entities to return. Maximum of 200.                                                                      | [optional]                                                                                       |
| **name**         | **String**  | Filter by Name.                                                                                                    | [optional]                                                                                       |
| **coreLanguage** | **String**  | Filter by core language.                                                                                           | [optional]<br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **published**    | **Boolean** | Filter by published status.                                                                                        | [optional]                                                                                       |
| **sortBy**       | **String**  | Sort by.                                                                                                           | [optional]<br />**Values**: Name, Date                                                           |
| **sortOrder**    | **String**  | Sort Order.                                                                                                        | [optional]<br />**Values**: ASC, ascending, DESC, descending                                     |

{: class="table-striped"}

### Return type

[**KnowledgeBaseListing**](KnowledgeBaseListing.md)

<a name="patchKnowledgeKnowledgebase"></a>

# **patchKnowledgeKnowledgebase**

> [KnowledgeBase](KnowledgeBase.md) patchKnowledgeKnowledgebase(knowledgeBaseId, body)

Update knowledge base

Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}

Requires ALL permissions:

- knowledge:knowledgebase:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeBase body = new KnowledgeBase(); // KnowledgeBase |
try {
    KnowledgeBase result = apiInstance.patchKnowledgeKnowledgebase(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                  | Description       | Notes |
| ------------------- | ------------------------------------- | ----------------- | ----- |
| **knowledgeBaseId** | **String**                            | Knowledge base ID |
| **body**            | [**KnowledgeBase**](KnowledgeBase.md) |                   |

{: class="table-striped"}

### Return type

[**KnowledgeBase**](KnowledgeBase.md)

<a name="patchKnowledgeKnowledgebaseLanguageCategory"></a>

# **patchKnowledgeKnowledgebaseLanguageCategory**

> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.md) patchKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode, body)

Update category

Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}

Requires ALL permissions:

- knowledge:category:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeCategoryRequest body = new KnowledgeCategoryRequest(); // KnowledgeCategoryRequest |
try {
    KnowledgeExtendedCategory result = apiInstance.patchKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                        | Description                        | Notes                                                                                  |
| ------------------- | ----------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **categoryId**      | **String**                                                  | Category ID                        |
| **knowledgeBaseId** | **String**                                                  | Knowledge base ID                  |
| **languageCode**    | **String**                                                  | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**KnowledgeCategoryRequest**](KnowledgeCategoryRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.md)

<a name="patchKnowledgeKnowledgebaseLanguageDocument"></a>

# **patchKnowledgeKnowledgebaseLanguageDocument**

> [KnowledgeDocument](KnowledgeDocument.md) patchKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode, body)

Update document

Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}

Requires ALL permissions:

- knowledge:document:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeDocumentRequest body = new KnowledgeDocumentRequest(); // KnowledgeDocumentRequest |
try {
    KnowledgeDocument result = apiInstance.patchKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                        | Description                        | Notes                                                                                  |
| ------------------- | ----------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **documentId**      | **String**                                                  | Document ID                        |
| **knowledgeBaseId** | **String**                                                  | Knowledge base ID                  |
| **languageCode**    | **String**                                                  | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**KnowledgeDocumentRequest**](KnowledgeDocumentRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeDocument**](KnowledgeDocument.md)

<a name="patchKnowledgeKnowledgebaseLanguageDocuments"></a>

# **patchKnowledgeKnowledgebaseLanguageDocuments**

> [DocumentListing](DocumentListing.md) patchKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body)

Update documents collection

Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents

Requires ALL permissions:

- knowledge:document:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
List<KnowledgeDocumentBulkRequest> body = Arrays.asList(new KnowledgeDocumentBulkRequest()); // List<KnowledgeDocumentBulkRequest> |
try {
    DocumentListing result = apiInstance.patchKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                                            | Description                        | Notes                                                                                  |
| ------------------- | ------------------------------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                                                                      | Knowledge base ID                  |
| **languageCode**    | **String**                                                                      | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**List&lt;KnowledgeDocumentBulkRequest&gt;**](KnowledgeDocumentBulkRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**DocumentListing**](DocumentListing.md)

<a name="patchKnowledgeKnowledgebaseLanguageDocumentsImport"></a>

# **patchKnowledgeKnowledgebaseLanguageDocumentsImport**

> [KnowledgeImport](KnowledgeImport.md) patchKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId, body)

Start import operation

Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/imports/{importId}

Requires ALL permissions:

- knowledge:document:edit
- knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String importId = "importId_example"; // String | Import ID
ImportStatusRequest body = new ImportStatusRequest(); // ImportStatusRequest |
try {
    KnowledgeImport result = apiInstance.patchKnowledgeKnowledgebaseLanguageDocumentsImport(knowledgeBaseId, languageCode, importId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageDocumentsImport");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                              | Description                        | Notes                                                                                  |
| ------------------- | ------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                                        | Knowledge base ID                  |
| **languageCode**    | **String**                                        | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **importId**        | **String**                                        | Import ID                          |
| **body**            | [**ImportStatusRequest**](ImportStatusRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeImport**](KnowledgeImport.md)

<a name="postKnowledgeDocumentuploads"></a>

# **postKnowledgeDocumentuploads**

> [UploadUrlResponse](UploadUrlResponse.md) postKnowledgeDocumentuploads(body)

Creates a presigned URL for uploading a knowledge import file with a set of documents

Wraps POST /api/v2/knowledge/documentuploads

Requires ALL permissions:

- knowledge:document:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
UploadUrlRequest body = new UploadUrlRequest(); // UploadUrlRequest | query
try {
    UploadUrlResponse result = apiInstance.postKnowledgeDocumentuploads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeDocumentuploads");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                        | Description | Notes |
| -------- | ------------------------------------------- | ----------- | ----- |
| **body** | [**UploadUrlRequest**](UploadUrlRequest.md) | query       |

{: class="table-striped"}

### Return type

[**UploadUrlResponse**](UploadUrlResponse.md)

<a name="postKnowledgeKnowledgebaseLanguageCategories"></a>

# **postKnowledgeKnowledgebaseLanguageCategories**

> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.md) postKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, body)

Create new category

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories

Requires ALL permissions:

- knowledge:category:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeCategoryRequest body = new KnowledgeCategoryRequest(); // KnowledgeCategoryRequest |
try {
    KnowledgeExtendedCategory result = apiInstance.postKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageCategories");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                        | Description                        | Notes                                                                                  |
| ------------------- | ----------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                                                  | Knowledge base ID                  |
| **languageCode**    | **String**                                                  | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**KnowledgeCategoryRequest**](KnowledgeCategoryRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.md)

<a name="postKnowledgeKnowledgebaseLanguageDocuments"></a>

# **postKnowledgeKnowledgebaseLanguageDocuments**

> [KnowledgeDocument](KnowledgeDocument.md) postKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body)

Create document

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents

Requires ALL permissions:

- knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeDocumentRequest body = new KnowledgeDocumentRequest(); // KnowledgeDocumentRequest |
try {
    KnowledgeDocument result = apiInstance.postKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                        | Description                        | Notes                                                                                  |
| ------------------- | ----------------------------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                                                  | Knowledge base ID                  |
| **languageCode**    | **String**                                                  | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**KnowledgeDocumentRequest**](KnowledgeDocumentRequest.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeDocument**](KnowledgeDocument.md)

<a name="postKnowledgeKnowledgebaseLanguageDocumentsImports"></a>

# **postKnowledgeKnowledgebaseLanguageDocumentsImports**

> [KnowledgeImport](KnowledgeImport.md) postKnowledgeKnowledgebaseLanguageDocumentsImports(knowledgeBaseId, languageCode, body)

Create import operation

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/imports

Requires ALL permissions:

- knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeImport body = new KnowledgeImport(); // KnowledgeImport |
try {
    KnowledgeImport result = apiInstance.postKnowledgeKnowledgebaseLanguageDocumentsImports(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageDocumentsImports");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                      | Description                        | Notes                                                                                  |
| ------------------- | ----------------------------------------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String**                                | Knowledge base ID                  |
| **languageCode**    | **String**                                | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **body**            | [**KnowledgeImport**](KnowledgeImport.md) |                                    |

{: class="table-striped"}

### Return type

[**KnowledgeImport**](KnowledgeImport.md)

<a name="postKnowledgeKnowledgebaseLanguageTrainingPromote"></a>

# **postKnowledgeKnowledgebaseLanguageTrainingPromote**

> [KnowledgeTraining](KnowledgeTraining.md) postKnowledgeKnowledgebaseLanguageTrainingPromote(knowledgeBaseId, languageCode, trainingId)

Promote trained documents from draft state to active.

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings/{trainingId}/promote

Requires ALL permissions:

- knowledge:training:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String trainingId = "trainingId_example"; // String | Training ID
try {
    KnowledgeTraining result = apiInstance.postKnowledgeKnowledgebaseLanguageTrainingPromote(knowledgeBaseId, languageCode, trainingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageTrainingPromote");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |
| **trainingId**      | **String** | Training ID                        |

{: class="table-striped"}

### Return type

[**KnowledgeTraining**](KnowledgeTraining.md)

<a name="postKnowledgeKnowledgebaseLanguageTrainings"></a>

# **postKnowledgeKnowledgebaseLanguageTrainings**

> [KnowledgeTraining](KnowledgeTraining.md) postKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode)

Trigger training

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings

Requires ALL permissions:

- knowledge:training:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeTraining result = apiInstance.postKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageTrainings");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                        | Notes                                                                                  |
| ------------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------- |
| **knowledgeBaseId** | **String** | Knowledge base ID                  |
| **languageCode**    | **String** | Language code, format: iso2-LOCALE | <br />**Values**: en-US, en-UK, en-AU, de-DE, es-US, es-ES, fr-FR, pt-BR, nl-NL, it-IT |

{: class="table-striped"}

### Return type

[**KnowledgeTraining**](KnowledgeTraining.md)

<a name="postKnowledgeKnowledgebaseSearch"></a>

# **postKnowledgeKnowledgebaseSearch**

> [KnowledgeSearchResponse](KnowledgeSearchResponse.md) postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body)

Search Documents

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/search

Requires ALL permissions:

- knowledge:knowledgebase:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeSearchRequest body = new KnowledgeSearchRequest(); // KnowledgeSearchRequest |
try {
    KnowledgeSearchResponse result = apiInstance.postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseSearch");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                    | Description       | Notes      |
| ------------------- | ------------------------------------------------------- | ----------------- | ---------- |
| **knowledgeBaseId** | **String**                                              | Knowledge base ID |
| **body**            | [**KnowledgeSearchRequest**](KnowledgeSearchRequest.md) |                   | [optional] |

{: class="table-striped"}

### Return type

[**KnowledgeSearchResponse**](KnowledgeSearchResponse.md)

<a name="postKnowledgeKnowledgebases"></a>

# **postKnowledgeKnowledgebases**

> [KnowledgeBase](KnowledgeBase.md) postKnowledgeKnowledgebases(body)

Create new knowledge base

Wraps POST /api/v2/knowledge/knowledgebases

Requires ALL permissions:

- knowledge:knowledgebase:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
KnowledgeBase body = new KnowledgeBase(); // KnowledgeBase |
try {
    KnowledgeBase result = apiInstance.postKnowledgeKnowledgebases(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebases");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description | Notes |
| -------- | ------------------------------------- | ----------- | ----- |
| **body** | [**KnowledgeBase**](KnowledgeBase.md) |             |

{: class="table-striped"}

### Return type

[**KnowledgeBase**](KnowledgeBase.md)
