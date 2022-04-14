---
title: SpeechTextAnalyticsApi
---

## SpeechTextAnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                                                             | Description                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| [**deleteSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.md#deleteSpeechandtextanalyticsProgram)                                                           | Delete a Speech &amp; Text Analytics program by id                                         |
| [**deleteSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.md#deleteSpeechandtextanalyticsSentimentfeedback)                                       | Delete All Speech &amp; Text Analytics SentimentFeedback                                   |
| [**deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId**](SpeechTextAnalyticsApi.md#deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId) | Delete a Speech &amp; Text Analytics SentimentFeedback by Id                               |
| [**deleteSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.md#deleteSpeechandtextanalyticsTopic)                                                               | Delete a Speech &amp; Text Analytics topic by id                                           |
| [**getSpeechandtextanalyticsConversation**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsConversation)                                                       | Get Speech and Text Analytics for a specific conversation                                  |
| [**getSpeechandtextanalyticsConversationCommunicationTranscripturl**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsConversationCommunicationTranscripturl)   | Get the pre-signed S3 URL for the transcript of a specific communication of a conversation |
| [**getSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgram)                                                                 | Get a Speech &amp; Text Analytics program by id                                            |
| [**getSpeechandtextanalyticsProgramMappings**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgramMappings)                                                 | Get Speech &amp; Text Analytics program mappings to queues and flows by id                 |
| [**getSpeechandtextanalyticsPrograms**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsPrograms)                                                               | Get the list of Speech &amp; Text Analytics programs                                       |
| [**getSpeechandtextanalyticsProgramsGeneralJob**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgramsGeneralJob)                                           | Get a Speech &amp; Text Analytics general program job by id                                |
| [**getSpeechandtextanalyticsProgramsMappings**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgramsMappings)                                               | Get the list of Speech &amp; Text Analytics programs mappings to queues and flows          |
| [**getSpeechandtextanalyticsProgramsPublishjob**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgramsPublishjob)                                           | Get a Speech &amp; Text Analytics publish programs job by id                               |
| [**getSpeechandtextanalyticsProgramsUnpublished**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsProgramsUnpublished)                                         | Get the list of Speech &amp; Text Analytics unpublished programs                           |
| [**getSpeechandtextanalyticsSentimentDialects**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsSentimentDialects)                                             | Get the list of Speech &amp; Text Analytics sentiment supported dialects                   |
| [**getSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsSentimentfeedback)                                             | Get the list of Speech &amp; Text Analytics SentimentFeedback                              |
| [**getSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsSettings)                                                               | Get Speech And Text Analytics Settings                                                     |
| [**getSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsTopic)                                                                     | Get a Speech &amp; Text Analytics topic by id                                              |
| [**getSpeechandtextanalyticsTopics**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsTopics)                                                                   | Get the list of Speech &amp; Text Analytics topics                                         |
| [**getSpeechandtextanalyticsTopicsDialects**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsTopicsDialects)                                                   | Get list of supported Speech &amp; Text Analytics topics dialects                          |
| [**getSpeechandtextanalyticsTopicsGeneral**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsTopicsGeneral)                                                     | Get the Speech &amp; Text Analytics general topics for a given dialect                     |
| [**getSpeechandtextanalyticsTopicsPublishjob**](SpeechTextAnalyticsApi.md#getSpeechandtextanalyticsTopicsPublishjob)                                               | Get a Speech &amp; Text Analytics publish topics job by id                                 |
| [**patchSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.md#patchSpeechandtextanalyticsSettings)                                                           | Patch Speech And Text Analytics Settings                                                   |
| [**postSpeechandtextanalyticsPrograms**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsPrograms)                                                             | Create new Speech &amp; Text Analytics program                                             |
| [**postSpeechandtextanalyticsProgramsGeneralJobs**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsProgramsGeneralJobs)                                       | Create new Speech &amp; Text Analytics general program job                                 |
| [**postSpeechandtextanalyticsProgramsPublishjobs**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsProgramsPublishjobs)                                       | Create new Speech &amp; Text Analytics publish programs job                                |
| [**postSpeechandtextanalyticsSentimentfeedback**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsSentimentfeedback)                                           | Create a Speech &amp; Text Analytics SentimentFeedback                                     |
| [**postSpeechandtextanalyticsTopics**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsTopics)                                                                 | Create new Speech &amp; Text Analytics topic                                               |
| [**postSpeechandtextanalyticsTopicsPublishjobs**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsTopicsPublishjobs)                                           | Create new Speech &amp; Text Analytics publish topics job                                  |
| [**postSpeechandtextanalyticsTranscriptsSearch**](SpeechTextAnalyticsApi.md#postSpeechandtextanalyticsTranscriptsSearch)                                           | Search resources.                                                                          |
| [**putSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.md#putSpeechandtextanalyticsProgram)                                                                 | Update existing Speech &amp; Text Analytics program                                        |
| [**putSpeechandtextanalyticsProgramMappings**](SpeechTextAnalyticsApi.md#putSpeechandtextanalyticsProgramMappings)                                                 | Set Speech &amp; Text Analytics program mappings to queues and flows                       |
| [**putSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.md#putSpeechandtextanalyticsSettings)                                                               | Update Speech And Text Analytics Settings                                                  |
| [**putSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.md#putSpeechandtextanalyticsTopic)                                                                     | Update existing Speech &amp; Text Analytics topic                                          |

{: class="table-striped"}

<a name="deleteSpeechandtextanalyticsProgram"></a>

# **deleteSpeechandtextanalyticsProgram**

> Void deleteSpeechandtextanalyticsProgram(programId, forceDelete)

Delete a Speech &amp; Text Analytics program by id

Wraps DELETE /api/v2/speechandtextanalytics/programs/{programId}

Requires ALL permissions:

- speechAndTextAnalytics:program:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
Boolean forceDelete = false; // Boolean | Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program.
try {
    apiInstance.deleteSpeechandtextanalyticsProgram(programId, forceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description                                                                                                               | Notes                         |
| --------------- | ----------- | ------------------------------------------------------------------------------------------------------------------------- | ----------------------------- |
| **programId**   | **String**  | The id of the program                                                                                                     |
| **forceDelete** | **Boolean** | Indicates whether the program is forced to be deleted or not. Required when the program to delete is the default program. | [optional] [default to false] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsSentimentfeedback"></a>

# **deleteSpeechandtextanalyticsSentimentfeedback**

> Void deleteSpeechandtextanalyticsSentimentfeedback()

Delete All Speech &amp; Text Analytics SentimentFeedback

Wraps DELETE /api/v2/speechandtextanalytics/sentimentfeedback

Requires ALL permissions:

- speechAndTextAnalytics:feedback:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    apiInstance.deleteSpeechandtextanalyticsSentimentfeedback();
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId"></a>

# **deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId**

> Void deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(sentimentFeedbackId)

Delete a Speech &amp; Text Analytics SentimentFeedback by Id

Wraps DELETE /api/v2/speechandtextanalytics/sentimentfeedback/{sentimentFeedbackId}

Requires ALL permissions:

- speechAndTextAnalytics:feedback:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String sentimentFeedbackId = "sentimentFeedbackId_example"; // String | The Id of the SentimentFeedback
try {
    apiInstance.deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId(sentimentFeedbackId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackId");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type       | Description                     | Notes |
| ----------------------- | ---------- | ------------------------------- | ----- |
| **sentimentFeedbackId** | **String** | The Id of the SentimentFeedback |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteSpeechandtextanalyticsTopic"></a>

# **deleteSpeechandtextanalyticsTopic**

> Void deleteSpeechandtextanalyticsTopic(topicId)

Delete a Speech &amp; Text Analytics topic by id

Wraps DELETE /api/v2/speechandtextanalytics/topics/{topicId}

Requires ALL permissions:

- speechAndTextAnalytics:topic:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
try {
    apiInstance.deleteSpeechandtextanalyticsTopic(topicId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#deleteSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description         | Notes |
| ----------- | ---------- | ------------------- | ----- |
| **topicId** | **String** | The id of the topic |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getSpeechandtextanalyticsConversation"></a>

# **getSpeechandtextanalyticsConversation**

> [ConversationMetrics](ConversationMetrics.md) getSpeechandtextanalyticsConversation(conversationId)

Get Speech and Text Analytics for a specific conversation

Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}

Requires ANY permissions:

- recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation Id
try {
    ConversationMetrics result = apiInstance.getSpeechandtextanalyticsConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation Id |

{: class="table-striped"}

### Return type

[**ConversationMetrics**](ConversationMetrics.md)

<a name="getSpeechandtextanalyticsConversationCommunicationTranscripturl"></a>

# **getSpeechandtextanalyticsConversationCommunicationTranscripturl**

> [TranscriptUrl](TranscriptUrl.md) getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId)

Get the pre-signed S3 URL for the transcript of a specific communication of a conversation

Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}/communications/{communicationId}/transcripturl

Requires ANY permissions:

- recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String communicationId = "communicationId_example"; // String | Communication ID
try {
    TranscriptUrl result = apiInstance.getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversationCommunicationTranscripturl");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description      | Notes |
| ------------------- | ---------- | ---------------- | ----- |
| **conversationId**  | **String** | Conversation ID  |
| **communicationId** | **String** | Communication ID |

{: class="table-striped"}

### Return type

[**TranscriptUrl**](TranscriptUrl.md)

<a name="getSpeechandtextanalyticsProgram"></a>

# **getSpeechandtextanalyticsProgram**

> [Program](Program.md) getSpeechandtextanalyticsProgram(programId)

Get a Speech &amp; Text Analytics program by id

Wraps GET /api/v2/speechandtextanalytics/programs/{programId}

Requires ALL permissions:

- speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
try {
    Program result = apiInstance.getSpeechandtextanalyticsProgram(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description           | Notes |
| ------------- | ---------- | --------------------- | ----- |
| **programId** | **String** | The id of the program |

{: class="table-striped"}

### Return type

[**Program**](Program.md)

<a name="getSpeechandtextanalyticsProgramMappings"></a>

# **getSpeechandtextanalyticsProgramMappings**

> [ProgramMappings](ProgramMappings.md) getSpeechandtextanalyticsProgramMappings(programId)

Get Speech &amp; Text Analytics program mappings to queues and flows by id

Wraps GET /api/v2/speechandtextanalytics/programs/{programId}/mappings

Requires ALL permissions:

- speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
try {
    ProgramMappings result = apiInstance.getSpeechandtextanalyticsProgramMappings(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramMappings");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description           | Notes |
| ------------- | ---------- | --------------------- | ----- |
| **programId** | **String** | The id of the program |

{: class="table-striped"}

### Return type

[**ProgramMappings**](ProgramMappings.md)

<a name="getSpeechandtextanalyticsPrograms"></a>

# **getSpeechandtextanalyticsPrograms**

> [ProgramsEntityListing](ProgramsEntityListing.md) getSpeechandtextanalyticsPrograms(nextPage, pageSize)

Get the list of Speech &amp; Text Analytics programs

Wraps GET /api/v2/speechandtextanalytics/programs

Requires ALL permissions:

- speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
try {
    ProgramsEntityListing result = apiInstance.getSpeechandtextanalyticsPrograms(nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsPrograms");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                       | Notes                      |
| ------------ | ----------- | --------------------------------- | -------------------------- |
| **nextPage** | **String**  | The key for listing the next page | [optional]                 |
| **pageSize** | **Integer** | The page size for the listing     | [optional] [default to 20] |

{: class="table-striped"}

### Return type

[**ProgramsEntityListing**](ProgramsEntityListing.md)

<a name="getSpeechandtextanalyticsProgramsGeneralJob"></a>

# **getSpeechandtextanalyticsProgramsGeneralJob**

> [GeneralProgramJob](GeneralProgramJob.md) getSpeechandtextanalyticsProgramsGeneralJob(jobId)

Get a Speech &amp; Text Analytics general program job by id

Wraps GET /api/v2/speechandtextanalytics/programs/general/jobs/{jobId}

Requires ALL permissions:

- speechAndTextAnalytics:program:add
- speechAndTextAnalytics:program:edit
- speechAndTextAnalytics:topic:add
- speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish programs job
try {
    GeneralProgramJob result = apiInstance.getSpeechandtextanalyticsProgramsGeneralJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsGeneralJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description                        | Notes |
| --------- | ---------- | ---------------------------------- | ----- |
| **jobId** | **String** | The id of the publish programs job |

{: class="table-striped"}

### Return type

[**GeneralProgramJob**](GeneralProgramJob.md)

<a name="getSpeechandtextanalyticsProgramsMappings"></a>

# **getSpeechandtextanalyticsProgramsMappings**

> [ProgramsMappingsEntityListing](ProgramsMappingsEntityListing.md) getSpeechandtextanalyticsProgramsMappings(nextPage, pageSize)

Get the list of Speech &amp; Text Analytics programs mappings to queues and flows

Wraps GET /api/v2/speechandtextanalytics/programs/mappings

Requires ALL permissions:

- speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
try {
    ProgramsMappingsEntityListing result = apiInstance.getSpeechandtextanalyticsProgramsMappings(nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsMappings");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                       | Notes                      |
| ------------ | ----------- | --------------------------------- | -------------------------- |
| **nextPage** | **String**  | The key for listing the next page | [optional]                 |
| **pageSize** | **Integer** | The page size for the listing     | [optional] [default to 20] |

{: class="table-striped"}

### Return type

[**ProgramsMappingsEntityListing**](ProgramsMappingsEntityListing.md)

<a name="getSpeechandtextanalyticsProgramsPublishjob"></a>

# **getSpeechandtextanalyticsProgramsPublishjob**

> [ProgramJob](ProgramJob.md) getSpeechandtextanalyticsProgramsPublishjob(jobId)

Get a Speech &amp; Text Analytics publish programs job by id

Wraps GET /api/v2/speechandtextanalytics/programs/publishjobs/{jobId}

Requires ALL permissions:

- speechAndTextAnalytics:program:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish programs job
try {
    ProgramJob result = apiInstance.getSpeechandtextanalyticsProgramsPublishjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsPublishjob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description                        | Notes |
| --------- | ---------- | ---------------------------------- | ----- |
| **jobId** | **String** | The id of the publish programs job |

{: class="table-striped"}

### Return type

[**ProgramJob**](ProgramJob.md)

<a name="getSpeechandtextanalyticsProgramsUnpublished"></a>

# **getSpeechandtextanalyticsProgramsUnpublished**

> [UnpublishedProgramsEntityListing](UnpublishedProgramsEntityListing.md) getSpeechandtextanalyticsProgramsUnpublished(nextPage, pageSize)

Get the list of Speech &amp; Text Analytics unpublished programs

Wraps GET /api/v2/speechandtextanalytics/programs/unpublished

Requires ALL permissions:

- speechAndTextAnalytics:program:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
try {
    UnpublishedProgramsEntityListing result = apiInstance.getSpeechandtextanalyticsProgramsUnpublished(nextPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgramsUnpublished");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                       | Notes                      |
| ------------ | ----------- | --------------------------------- | -------------------------- |
| **nextPage** | **String**  | The key for listing the next page | [optional]                 |
| **pageSize** | **Integer** | The page size for the listing     | [optional] [default to 20] |

{: class="table-striped"}

### Return type

[**UnpublishedProgramsEntityListing**](UnpublishedProgramsEntityListing.md)

<a name="getSpeechandtextanalyticsSentimentDialects"></a>

# **getSpeechandtextanalyticsSentimentDialects**

> [EntityListing](EntityListing.md) getSpeechandtextanalyticsSentimentDialects()

Get the list of Speech &amp; Text Analytics sentiment supported dialects

Wraps GET /api/v2/speechandtextanalytics/sentiment/dialects

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    EntityListing result = apiInstance.getSpeechandtextanalyticsSentimentDialects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSentimentDialects");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EntityListing**](EntityListing.md)

<a name="getSpeechandtextanalyticsSentimentfeedback"></a>

# **getSpeechandtextanalyticsSentimentfeedback**

> [SentimentFeedbackEntityListing](SentimentFeedbackEntityListing.md) getSpeechandtextanalyticsSentimentfeedback(dialect)

Get the list of Speech &amp; Text Analytics SentimentFeedback

Wraps GET /api/v2/speechandtextanalytics/sentimentfeedback

Requires ALL permissions:

- speechAndTextAnalytics:feedback:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = "en-US"; // String | The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
try {
    SentimentFeedbackEntityListing result = apiInstance.getSpeechandtextanalyticsSentimentfeedback(dialect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description                                                                                                                                                                 | Notes      |
| ----------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **dialect** | **String** | The key for filter the listing by dialect, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional] |

{: class="table-striped"}

### Return type

[**SentimentFeedbackEntityListing**](SentimentFeedbackEntityListing.md)

<a name="getSpeechandtextanalyticsSettings"></a>

# **getSpeechandtextanalyticsSettings**

> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.md) getSpeechandtextanalyticsSettings()

Get Speech And Text Analytics Settings

Wraps GET /api/v2/speechandtextanalytics/settings

Requires ALL permissions:

- speechAndTextAnalytics:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.getSpeechandtextanalyticsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.md)

<a name="getSpeechandtextanalyticsTopic"></a>

# **getSpeechandtextanalyticsTopic**

> [Topic](Topic.md) getSpeechandtextanalyticsTopic(topicId)

Get a Speech &amp; Text Analytics topic by id

Wraps GET /api/v2/speechandtextanalytics/topics/{topicId}

Requires ALL permissions:

- speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
try {
    Topic result = apiInstance.getSpeechandtextanalyticsTopic(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description         | Notes |
| ----------- | ---------- | ------------------- | ----- |
| **topicId** | **String** | The id of the topic |

{: class="table-striped"}

### Return type

[**Topic**](Topic.md)

<a name="getSpeechandtextanalyticsTopics"></a>

# **getSpeechandtextanalyticsTopics**

> [TopicsEntityListing](TopicsEntityListing.md) getSpeechandtextanalyticsTopics(nextPage, pageSize, state, name, ids, sortBy, sortOrder)

Get the list of Speech &amp; Text Analytics topics

Wraps GET /api/v2/speechandtextanalytics/topics

Requires ALL permissions:

- speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String nextPage = "nextPage_example"; // String | The key for listing the next page
Integer pageSize = 20; // Integer | The page size for the listing
String state = "state_example"; // String | Topic state. Defaults to latest
String name = "name_example"; // String | Case insensitive partial name to filter by
List<String> ids = Arrays.asList("ids_example"); // List<String> | Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed.
String sortBy = "sortBy_example"; // String | Sort results by. Defaults to name
String sortOrder = "sortOrder_example"; // String | Sort order. Defaults to asc
try {
    TopicsEntityListing result = apiInstance.getSpeechandtextanalyticsTopics(nextPage, pageSize, state, name, ids, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopics");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                | Description                                                                                           | Notes                                         |
| ------------- | ----------------------------------- | ----------------------------------------------------------------------------------------------------- | --------------------------------------------- |
| **nextPage**  | **String**                          | The key for listing the next page                                                                     | [optional]                                    |
| **pageSize**  | **Integer**                         | The page size for the listing                                                                         | [optional] [default to 20]                    |
| **state**     | **String**                          | Topic state. Defaults to latest                                                                       | [optional]<br />**Values**: latest, published |
| **name**      | **String**                          | Case insensitive partial name to filter by                                                            | [optional]                                    |
| **ids**       | [**List&lt;String&gt;**](String.md) | Comma separated Topic IDs to filter by. Cannot be used with other filters. Maximum of 50 IDs allowed. | [optional]                                    |
| **sortBy**    | **String**                          | Sort results by. Defaults to name                                                                     | [optional]<br />**Values**: name              |
| **sortOrder** | **String**                          | Sort order. Defaults to asc                                                                           | [optional]<br />**Values**: asc, desc         |

{: class="table-striped"}

### Return type

[**TopicsEntityListing**](TopicsEntityListing.md)

<a name="getSpeechandtextanalyticsTopicsDialects"></a>

# **getSpeechandtextanalyticsTopicsDialects**

> [EntityListing](EntityListing.md) getSpeechandtextanalyticsTopicsDialects()

Get list of supported Speech &amp; Text Analytics topics dialects

Wraps GET /api/v2/speechandtextanalytics/topics/dialects

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
try {
    EntityListing result = apiInstance.getSpeechandtextanalyticsTopicsDialects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsDialects");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EntityListing**](EntityListing.md)

<a name="getSpeechandtextanalyticsTopicsGeneral"></a>

# **getSpeechandtextanalyticsTopicsGeneral**

> [GeneralTopicsEntityListing](GeneralTopicsEntityListing.md) getSpeechandtextanalyticsTopicsGeneral(dialect)

Get the Speech &amp; Text Analytics general topics for a given dialect

Wraps GET /api/v2/speechandtextanalytics/topics/general

Requires ALL permissions:

- speechAndTextAnalytics:topic:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String dialect = "dialect_example"; // String | The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
try {
    GeneralTopicsEntityListing result = apiInstance.getSpeechandtextanalyticsTopicsGeneral(dialect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsGeneral");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description                                                                                                                                                         | Notes                                                                                                                        |
| ----------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| **dialect** | **String** | The dialect of the general topics, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard | [optional]<br />**Values**: en-US, es-US, en-AU, en-GB, en-ZA, es-ES, en-IN, fr-FR, fr-CA, it-IT, de-DE, pt-BR, pl-PL, pt-PT |

{: class="table-striped"}

### Return type

[**GeneralTopicsEntityListing**](GeneralTopicsEntityListing.md)

<a name="getSpeechandtextanalyticsTopicsPublishjob"></a>

# **getSpeechandtextanalyticsTopicsPublishjob**

> [TopicJob](TopicJob.md) getSpeechandtextanalyticsTopicsPublishjob(jobId)

Get a Speech &amp; Text Analytics publish topics job by id

Wraps GET /api/v2/speechandtextanalytics/topics/publishjobs/{jobId}

Requires ALL permissions:

- speechAndTextAnalytics:topic:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String jobId = "jobId_example"; // String | The id of the publish topics job
try {
    TopicJob result = apiInstance.getSpeechandtextanalyticsTopicsPublishjob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopicsPublishjob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description                      | Notes |
| --------- | ---------- | -------------------------------- | ----- |
| **jobId** | **String** | The id of the publish topics job |

{: class="table-striped"}

### Return type

[**TopicJob**](TopicJob.md)

<a name="patchSpeechandtextanalyticsSettings"></a>

# **patchSpeechandtextanalyticsSettings**

> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.md) patchSpeechandtextanalyticsSettings(body)

Patch Speech And Text Analytics Settings

Wraps PATCH /api/v2/speechandtextanalytics/settings

Requires ALL permissions:

- speechAndTextAnalytics:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SpeechTextAnalyticsSettingsRequest body = new SpeechTextAnalyticsSettingsRequest(); // SpeechTextAnalyticsSettingsRequest | Speech And Text Analytics Settings
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.patchSpeechandtextanalyticsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#patchSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                            | Description                        | Notes |
| -------- | ------------------------------------------------------------------------------- | ---------------------------------- | ----- |
| **body** | [**SpeechTextAnalyticsSettingsRequest**](SpeechTextAnalyticsSettingsRequest.md) | Speech And Text Analytics Settings |

{: class="table-striped"}

### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.md)

<a name="postSpeechandtextanalyticsPrograms"></a>

# **postSpeechandtextanalyticsPrograms**

> [Program](Program.md) postSpeechandtextanalyticsPrograms(body)

Create new Speech &amp; Text Analytics program

Wraps POST /api/v2/speechandtextanalytics/programs

Requires ALL permissions:

- speechAndTextAnalytics:program:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
ProgramRequest body = new ProgramRequest(); // ProgramRequest | The program to create
try {
    Program result = apiInstance.postSpeechandtextanalyticsPrograms(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsPrograms");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description           | Notes |
| -------- | --------------------------------------- | --------------------- | ----- |
| **body** | [**ProgramRequest**](ProgramRequest.md) | The program to create |

{: class="table-striped"}

### Return type

[**Program**](Program.md)

<a name="postSpeechandtextanalyticsProgramsGeneralJobs"></a>

# **postSpeechandtextanalyticsProgramsGeneralJobs**

> [GeneralProgramJob](GeneralProgramJob.md) postSpeechandtextanalyticsProgramsGeneralJobs(body)

Create new Speech &amp; Text Analytics general program job

Wraps POST /api/v2/speechandtextanalytics/programs/general/jobs

Requires ALL permissions:

- speechAndTextAnalytics:program:add
- speechAndTextAnalytics:program:edit
- speechAndTextAnalytics:topic:add
- speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
GeneralProgramJobRequest body = new GeneralProgramJobRequest(); // GeneralProgramJobRequest | The general programs job to create
try {
    GeneralProgramJob result = apiInstance.postSpeechandtextanalyticsProgramsGeneralJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsProgramsGeneralJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description                        | Notes |
| -------- | ----------------------------------------------------------- | ---------------------------------- | ----- |
| **body** | [**GeneralProgramJobRequest**](GeneralProgramJobRequest.md) | The general programs job to create |

{: class="table-striped"}

### Return type

[**GeneralProgramJob**](GeneralProgramJob.md)

<a name="postSpeechandtextanalyticsProgramsPublishjobs"></a>

# **postSpeechandtextanalyticsProgramsPublishjobs**

> [ProgramJob](ProgramJob.md) postSpeechandtextanalyticsProgramsPublishjobs(body)

Create new Speech &amp; Text Analytics publish programs job

Wraps POST /api/v2/speechandtextanalytics/programs/publishjobs

Requires ALL permissions:

- speechAndTextAnalytics:program:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
ProgramJobRequest body = new ProgramJobRequest(); // ProgramJobRequest | The publish programs job to create
try {
    ProgramJob result = apiInstance.postSpeechandtextanalyticsProgramsPublishjobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsProgramsPublishjobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description                        | Notes |
| -------- | --------------------------------------------- | ---------------------------------- | ----- |
| **body** | [**ProgramJobRequest**](ProgramJobRequest.md) | The publish programs job to create |

{: class="table-striped"}

### Return type

[**ProgramJob**](ProgramJob.md)

<a name="postSpeechandtextanalyticsSentimentfeedback"></a>

# **postSpeechandtextanalyticsSentimentfeedback**

> [SentimentFeedback](SentimentFeedback.md) postSpeechandtextanalyticsSentimentfeedback(body)

Create a Speech &amp; Text Analytics SentimentFeedback

Wraps POST /api/v2/speechandtextanalytics/sentimentfeedback

Requires ALL permissions:

- speechAndTextAnalytics:feedback:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SentimentFeedback body = new SentimentFeedback(); // SentimentFeedback | The SentimentFeedback to create
try {
    SentimentFeedback result = apiInstance.postSpeechandtextanalyticsSentimentfeedback(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsSentimentfeedback");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description                     | Notes |
| -------- | --------------------------------------------- | ------------------------------- | ----- |
| **body** | [**SentimentFeedback**](SentimentFeedback.md) | The SentimentFeedback to create |

{: class="table-striped"}

### Return type

[**SentimentFeedback**](SentimentFeedback.md)

<a name="postSpeechandtextanalyticsTopics"></a>

# **postSpeechandtextanalyticsTopics**

> [Topic](Topic.md) postSpeechandtextanalyticsTopics(body)

Create new Speech &amp; Text Analytics topic

Wraps POST /api/v2/speechandtextanalytics/topics

Requires ALL permissions:

- speechAndTextAnalytics:topic:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TopicRequest body = new TopicRequest(); // TopicRequest | The topic to create
try {
    Topic result = apiInstance.postSpeechandtextanalyticsTopics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTopics");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description         | Notes |
| -------- | ----------------------------------- | ------------------- | ----- |
| **body** | [**TopicRequest**](TopicRequest.md) | The topic to create |

{: class="table-striped"}

### Return type

[**Topic**](Topic.md)

<a name="postSpeechandtextanalyticsTopicsPublishjobs"></a>

# **postSpeechandtextanalyticsTopicsPublishjobs**

> [TopicJob](TopicJob.md) postSpeechandtextanalyticsTopicsPublishjobs(body)

Create new Speech &amp; Text Analytics publish topics job

Wraps POST /api/v2/speechandtextanalytics/topics/publishjobs

Requires ALL permissions:

- speechAndTextAnalytics:topic:publish

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TopicJobRequest body = new TopicJobRequest(); // TopicJobRequest | The publish topics job to create
try {
    TopicJob result = apiInstance.postSpeechandtextanalyticsTopicsPublishjobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTopicsPublishjobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                      | Description                      | Notes |
| -------- | ----------------------------------------- | -------------------------------- | ----- |
| **body** | [**TopicJobRequest**](TopicJobRequest.md) | The publish topics job to create |

{: class="table-striped"}

### Return type

[**TopicJob**](TopicJob.md)

<a name="postSpeechandtextanalyticsTranscriptsSearch"></a>

# **postSpeechandtextanalyticsTranscriptsSearch**

> [JsonSearchResponse](JsonSearchResponse.md) postSpeechandtextanalyticsTranscriptsSearch(body)

Search resources.

Wraps POST /api/v2/speechandtextanalytics/transcripts/search

Requires ANY permissions:

- analytics:conversationDetail:view
- recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
TranscriptSearchRequest body = new TranscriptSearchRequest(); // TranscriptSearchRequest | Search request options
try {
    JsonSearchResponse result = apiInstance.postSpeechandtextanalyticsTranscriptsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTranscriptsSearch");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                      | Description            | Notes |
| -------- | --------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**TranscriptSearchRequest**](TranscriptSearchRequest.md) | Search request options |

{: class="table-striped"}

### Return type

[**JsonSearchResponse**](JsonSearchResponse.md)

<a name="putSpeechandtextanalyticsProgram"></a>

# **putSpeechandtextanalyticsProgram**

> [Program](Program.md) putSpeechandtextanalyticsProgram(programId, body)

Update existing Speech &amp; Text Analytics program

Wraps PUT /api/v2/speechandtextanalytics/programs/{programId}

Requires ALL permissions:

- speechAndTextAnalytics:program:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
ProgramRequest body = new ProgramRequest(); // ProgramRequest | The program to update
try {
    Program result = apiInstance.putSpeechandtextanalyticsProgram(programId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                    | Description           | Notes |
| ------------- | --------------------------------------- | --------------------- | ----- |
| **programId** | **String**                              | The id of the program |
| **body**      | [**ProgramRequest**](ProgramRequest.md) | The program to update |

{: class="table-striped"}

### Return type

[**Program**](Program.md)

<a name="putSpeechandtextanalyticsProgramMappings"></a>

# **putSpeechandtextanalyticsProgramMappings**

> [ProgramMappings](ProgramMappings.md) putSpeechandtextanalyticsProgramMappings(programId, body)

Set Speech &amp; Text Analytics program mappings to queues and flows

Wraps PUT /api/v2/speechandtextanalytics/programs/{programId}/mappings

Requires ALL permissions:

- speechAndTextAnalytics:program:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String programId = "programId_example"; // String | The id of the program
ProgramMappingsRequest body = new ProgramMappingsRequest(); // ProgramMappingsRequest | The program to set mappings for
try {
    ProgramMappings result = apiInstance.putSpeechandtextanalyticsProgramMappings(programId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsProgramMappings");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                                                    | Description                     | Notes |
| ------------- | ------------------------------------------------------- | ------------------------------- | ----- |
| **programId** | **String**                                              | The id of the program           |
| **body**      | [**ProgramMappingsRequest**](ProgramMappingsRequest.md) | The program to set mappings for |

{: class="table-striped"}

### Return type

[**ProgramMappings**](ProgramMappings.md)

<a name="putSpeechandtextanalyticsSettings"></a>

# **putSpeechandtextanalyticsSettings**

> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.md) putSpeechandtextanalyticsSettings(body)

Update Speech And Text Analytics Settings

Wraps PUT /api/v2/speechandtextanalytics/settings

Requires ALL permissions:

- speechAndTextAnalytics:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
SpeechTextAnalyticsSettingsRequest body = new SpeechTextAnalyticsSettingsRequest(); // SpeechTextAnalyticsSettingsRequest | Speech And Text Analytics Settings
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.putSpeechandtextanalyticsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                            | Description                        | Notes |
| -------- | ------------------------------------------------------------------------------- | ---------------------------------- | ----- |
| **body** | [**SpeechTextAnalyticsSettingsRequest**](SpeechTextAnalyticsSettingsRequest.md) | Speech And Text Analytics Settings |

{: class="table-striped"}

### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.md)

<a name="putSpeechandtextanalyticsTopic"></a>

# **putSpeechandtextanalyticsTopic**

> [Topic](Topic.md) putSpeechandtextanalyticsTopic(topicId, body)

Update existing Speech &amp; Text Analytics topic

Wraps PUT /api/v2/speechandtextanalytics/topics/{topicId}

Requires ALL permissions:

- speechAndTextAnalytics:topic:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String topicId = "topicId_example"; // String | The id of the topic
TopicRequest body = new TopicRequest(); // TopicRequest | The topic to update
try {
    Topic result = apiInstance.putSpeechandtextanalyticsTopic(topicId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#putSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description         | Notes |
| ----------- | ----------------------------------- | ------------------- | ----- |
| **topicId** | **String**                          | The id of the topic |
| **body**    | [**TopicRequest**](TopicRequest.md) | The topic to update |

{: class="table-striped"}

### Return type

[**Topic**](Topic.md)
