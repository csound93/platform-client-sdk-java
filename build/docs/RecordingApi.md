---
title: RecordingApi
---

## RecordingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                       | Description                                                                                                                                                                     |
| ---------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteConversationRecordingAnnotation**](RecordingApi.md#deleteConversationRecordingAnnotation)                           | Delete annotation                                                                                                                                                               |
| [**deleteOrphanrecording**](RecordingApi.md#deleteOrphanrecording)                                                           | Deletes a single orphan recording                                                                                                                                               |
| [**deleteRecordingCrossplatformMediaretentionpolicies**](RecordingApi.md#deleteRecordingCrossplatformMediaretentionpolicies) | Delete media retention policies                                                                                                                                                 |
| [**deleteRecordingCrossplatformMediaretentionpolicy**](RecordingApi.md#deleteRecordingCrossplatformMediaretentionpolicy)     | Delete a media retention policy                                                                                                                                                 |
| [**deleteRecordingJob**](RecordingApi.md#deleteRecordingJob)                                                                 | Delete the recording bulk job                                                                                                                                                   |
| [**deleteRecordingMediaretentionpolicies**](RecordingApi.md#deleteRecordingMediaretentionpolicies)                           | Delete media retention policies                                                                                                                                                 |
| [**deleteRecordingMediaretentionpolicy**](RecordingApi.md#deleteRecordingMediaretentionpolicy)                               | Delete a media retention policy                                                                                                                                                 |
| [**getConversationRecording**](RecordingApi.md#getConversationRecording)                                                     | Gets a specific recording.                                                                                                                                                      |
| [**getConversationRecordingAnnotation**](RecordingApi.md#getConversationRecordingAnnotation)                                 | Get annotation                                                                                                                                                                  |
| [**getConversationRecordingAnnotations**](RecordingApi.md#getConversationRecordingAnnotations)                               | Get annotations for recording                                                                                                                                                   |
| [**getConversationRecordingmetadata**](RecordingApi.md#getConversationRecordingmetadata)                                     | Get recording metadata for a conversation. Does not return playable media. Annotations won&#39;t be included in the response if recording:recording:view permission is missing. |
| [**getConversationRecordingmetadataRecordingId**](RecordingApi.md#getConversationRecordingmetadataRecordingId)               | Get metadata for a specific recording. Does not return playable media.                                                                                                          |
| [**getConversationRecordings**](RecordingApi.md#getConversationRecordings)                                                   | Get all of a Conversation&#39;s Recordings.                                                                                                                                     |
| [**getOrphanrecording**](RecordingApi.md#getOrphanrecording)                                                                 | Gets a single orphan recording                                                                                                                                                  |
| [**getOrphanrecordingMedia**](RecordingApi.md#getOrphanrecordingMedia)                                                       | Gets the media of a single orphan recording                                                                                                                                     |
| [**getOrphanrecordings**](RecordingApi.md#getOrphanrecordings)                                                               | Gets all orphan recordings                                                                                                                                                      |
| [**getRecordingBatchrequest**](RecordingApi.md#getRecordingBatchrequest)                                                     | Get the status and results for a batch request job, only the user that submitted the job may retrieve results                                                                   |
| [**getRecordingCrossplatformMediaretentionpolicies**](RecordingApi.md#getRecordingCrossplatformMediaretentionpolicies)       | Gets media retention policy list with query options to filter on name and enabled.                                                                                              |
| [**getRecordingCrossplatformMediaretentionpolicy**](RecordingApi.md#getRecordingCrossplatformMediaretentionpolicy)           | Get a media retention policy                                                                                                                                                    |
| [**getRecordingJob**](RecordingApi.md#getRecordingJob)                                                                       | Get the status of the job associated with the job id.                                                                                                                           |
| [**getRecordingJobFailedrecordings**](RecordingApi.md#getRecordingJobFailedrecordings)                                       | Get IDs of recordings that the bulk job failed for                                                                                                                              |
| [**getRecordingJobs**](RecordingApi.md#getRecordingJobs)                                                                     | Get the status of all jobs within the user&#39;s organization                                                                                                                   |
| [**getRecordingLocalkeysSetting**](RecordingApi.md#getRecordingLocalkeysSetting)                                             | Get the local encryption settings                                                                                                                                               |
| [**getRecordingLocalkeysSettings**](RecordingApi.md#getRecordingLocalkeysSettings)                                           | gets a list local key settings data                                                                                                                                             |
| [**getRecordingMediaretentionpolicies**](RecordingApi.md#getRecordingMediaretentionpolicies)                                 | Gets media retention policy list with query options to filter on name and enabled.                                                                                              |
| [**getRecordingMediaretentionpolicy**](RecordingApi.md#getRecordingMediaretentionpolicy)                                     | Get a media retention policy                                                                                                                                                    |
| [**getRecordingRecordingkeys**](RecordingApi.md#getRecordingRecordingkeys)                                                   | Get encryption key list                                                                                                                                                         |
| [**getRecordingRecordingkeysRotationschedule**](RecordingApi.md#getRecordingRecordingkeysRotationschedule)                   | Get key rotation schedule                                                                                                                                                       |
| [**getRecordingSettings**](RecordingApi.md#getRecordingSettings)                                                             | Get the Recording Settings for the Organization                                                                                                                                 |
| [**getRecordingsScreensessions**](RecordingApi.md#getRecordingsScreensessions)                                               | Retrieves a paged listing of screen recording sessions                                                                                                                          |
| [**patchRecordingCrossplatformMediaretentionpolicy**](RecordingApi.md#patchRecordingCrossplatformMediaretentionpolicy)       | Patch a media retention policy                                                                                                                                                  |
| [**patchRecordingMediaretentionpolicy**](RecordingApi.md#patchRecordingMediaretentionpolicy)                                 | Patch a media retention policy                                                                                                                                                  |
| [**patchRecordingsScreensession**](RecordingApi.md#patchRecordingsScreensession)                                             | Update a screen recording session                                                                                                                                               |
| [**postConversationRecordingAnnotations**](RecordingApi.md#postConversationRecordingAnnotations)                             | Create annotation                                                                                                                                                               |
| [**postRecordingBatchrequests**](RecordingApi.md#postRecordingBatchrequests)                                                 | Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.                          |
| [**postRecordingCrossplatformMediaretentionpolicies**](RecordingApi.md#postRecordingCrossplatformMediaretentionpolicies)     | Create media retention policy                                                                                                                                                   |
| [**postRecordingJobs**](RecordingApi.md#postRecordingJobs)                                                                   | Create a recording bulk job                                                                                                                                                     |
| [**postRecordingLocalkeys**](RecordingApi.md#postRecordingLocalkeys)                                                         | create a local recording key                                                                                                                                                    |
| [**postRecordingLocalkeysSettings**](RecordingApi.md#postRecordingLocalkeysSettings)                                         | create settings for local key creation                                                                                                                                          |
| [**postRecordingMediaretentionpolicies**](RecordingApi.md#postRecordingMediaretentionpolicies)                               | Create media retention policy                                                                                                                                                   |
| [**postRecordingRecordingkeys**](RecordingApi.md#postRecordingRecordingkeys)                                                 | Create encryption key                                                                                                                                                           |
| [**postRecordingsDeletionprotection**](RecordingApi.md#postRecordingsDeletionprotection)                                     | Get a list of conversations with protected recordings                                                                                                                           |
| [**postRecordingsScreensessionsAcknowledge**](RecordingApi.md#postRecordingsScreensessionsAcknowledge)                       | Acknowledge a screen recording.                                                                                                                                                 |
| [**postRecordingsScreensessionsMetadata**](RecordingApi.md#postRecordingsScreensessionsMetadata)                             | Provide meta-data a screen recording.                                                                                                                                           |
| [**putConversationRecording**](RecordingApi.md#putConversationRecording)                                                     | Updates the retention records on a recording.                                                                                                                                   |
| [**putConversationRecordingAnnotation**](RecordingApi.md#putConversationRecordingAnnotation)                                 | Update annotation                                                                                                                                                               |
| [**putOrphanrecording**](RecordingApi.md#putOrphanrecording)                                                                 | Updates an orphan recording to a regular recording with retention values                                                                                                        |
| [**putRecordingCrossplatformMediaretentionpolicy**](RecordingApi.md#putRecordingCrossplatformMediaretentionpolicy)           | Update a media retention policy                                                                                                                                                 |
| [**putRecordingJob**](RecordingApi.md#putRecordingJob)                                                                       | Execute the recording bulk job.                                                                                                                                                 |
| [**putRecordingLocalkeysSetting**](RecordingApi.md#putRecordingLocalkeysSetting)                                             | Update the local encryption settings                                                                                                                                            |
| [**putRecordingMediaretentionpolicy**](RecordingApi.md#putRecordingMediaretentionpolicy)                                     | Update a media retention policy                                                                                                                                                 |
| [**putRecordingRecordingkeysRotationschedule**](RecordingApi.md#putRecordingRecordingkeysRotationschedule)                   | Update key rotation schedule                                                                                                                                                    |
| [**putRecordingSettings**](RecordingApi.md#putRecordingSettings)                                                             | Update the Recording Settings for the Organization                                                                                                                              |
| [**putRecordingsDeletionprotection**](RecordingApi.md#putRecordingsDeletionprotection)                                       | Apply or revoke recording protection for conversations                                                                                                                          |

{: class="table-striped"}

<a name="deleteConversationRecordingAnnotation"></a>

# **deleteConversationRecordingAnnotation**

> Void deleteConversationRecordingAnnotation(conversationId, recordingId, annotationId)

Delete annotation

Wraps DELETE /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}

Requires ANY permissions:

- recording:annotation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    apiInstance.deleteConversationRecordingAnnotation(conversationId, recordingId, annotationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation ID |
| **recordingId**    | **String** | Recording ID    |
| **annotationId**   | **String** | Annotation ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteOrphanrecording"></a>

# **deleteOrphanrecording**

> [OrphanRecording](OrphanRecording.md) deleteOrphanrecording(orphanId)

Deletes a single orphan recording

Wraps DELETE /api/v2/orphanrecordings/{orphanId}

Requires ANY permissions:

- recording:orphan:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.deleteOrphanrecording(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteOrphanrecording");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **orphanId** | **String** | Orphan ID   |

{: class="table-striped"}

### Return type

[**OrphanRecording**](OrphanRecording.md)

<a name="deleteRecordingCrossplatformMediaretentionpolicies"></a>

# **deleteRecordingCrossplatformMediaretentionpolicies**

> Void deleteRecordingCrossplatformMediaretentionpolicies(ids)

Delete media retention policies

Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.

Wraps DELETE /api/v2/recording/crossplatform/mediaretentionpolicies

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String ids = "ids_example"; // String |
try {
    apiInstance.deleteRecordingCrossplatformMediaretentionpolicies(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name    | Type       | Description | Notes |
| ------- | ---------- | ----------- | ----- |
| **ids** | **String** |             |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRecordingCrossplatformMediaretentionpolicy"></a>

# **deleteRecordingCrossplatformMediaretentionpolicy**

> Void deleteRecordingCrossplatformMediaretentionpolicy(policyId)

Delete a media retention policy

Wraps DELETE /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    apiInstance.deleteRecordingCrossplatformMediaretentionpolicy(policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **policyId** | **String** | Policy ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRecordingJob"></a>

# **deleteRecordingJob**

> Void deleteRecordingJob(jobId)

Delete the recording bulk job

Wraps DELETE /api/v2/recording/jobs/{jobId}

Requires ALL permissions:

- recording:job:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteRecordingJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingJob");
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

<a name="deleteRecordingMediaretentionpolicies"></a>

# **deleteRecordingMediaretentionpolicies**

> Void deleteRecordingMediaretentionpolicies(ids)

Delete media retention policies

Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.

Wraps DELETE /api/v2/recording/mediaretentionpolicies

Requires ANY permissions:

- recording:retentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String ids = "ids_example"; // String |
try {
    apiInstance.deleteRecordingMediaretentionpolicies(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name    | Type       | Description | Notes |
| ------- | ---------- | ----------- | ----- |
| **ids** | **String** |             |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteRecordingMediaretentionpolicy"></a>

# **deleteRecordingMediaretentionpolicy**

> Void deleteRecordingMediaretentionpolicy(policyId)

Delete a media retention policy

Wraps DELETE /api/v2/recording/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:retentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    apiInstance.deleteRecordingMediaretentionpolicy(policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **policyId** | **String** | Policy ID   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getConversationRecording"></a>

# **getConversationRecording**

> [Recording](Recording.md) getConversationRecording(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats)

Gets a specific recording.

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}

Requires ANY permissions:

- recording:recording:view
- recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String formatId = "WEBM"; // String | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE
String emailFormatId = "EML"; // String | The desired media format when downloading an email recording. Valid values:EML,NONE
String chatFormatId = "ZIP"; // String | The desired media format when downloading a chat recording. Valid values:ZIP,NONE
String messageFormatId = "ZIP"; // String | The desired media format when downloading a message recording. Valid values:ZIP,NONE
Boolean download = false; // Boolean | requesting a download format of the recording. Valid values:true,false
String fileName = "fileName_example"; // String | the name of the downloaded fileName
String locale = "locale_example"; // String | The locale for the requested file when downloading, as an ISO 639-1 code
List<String> mediaFormats = Arrays.asList("mediaFormats_example"); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3
try {
    Recording result = apiInstance.getConversationRecording(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecording");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                | Description                                                                                              | Notes                                                                                              |
| ------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| **conversationId**  | **String**                          | Conversation ID                                                                                          |
| **recordingId**     | **String**                          | Recording ID                                                                                             |
| **formatId**        | **String**                          | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE                    | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE |
| **emailFormatId**   | **String**                          | The desired media format when downloading an email recording. Valid values:EML,NONE                      | [optional] [default to EML]<br />**Values**: EML, NONE                                             |
| **chatFormatId**    | **String**                          | The desired media format when downloading a chat recording. Valid values:ZIP,NONE                        | [optional] [default to ZIP]<br />**Values**: ZIP, NONE                                             |
| **messageFormatId** | **String**                          | The desired media format when downloading a message recording. Valid values:ZIP,NONE                     | [optional] [default to ZIP]<br />**Values**: ZIP, NONE                                             |
| **download**        | **Boolean**                         | requesting a download format of the recording. Valid values:true,false                                   | [optional] [default to false]                                                                      |
| **fileName**        | **String**                          | the name of the downloaded fileName                                                                      | [optional]                                                                                         |
| **locale**          | **String**                          | The locale for the requested file when downloading, as an ISO 639-1 code                                 | [optional]                                                                                         |
| **mediaFormats**    | [**List&lt;String&gt;**](String.md) | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 | [optional]                                                                                         |

{: class="table-striped"}

### Return type

[**Recording**](Recording.md)

<a name="getConversationRecordingAnnotation"></a>

# **getConversationRecordingAnnotation**

> [Annotation](Annotation.md) getConversationRecordingAnnotation(conversationId, recordingId, annotationId)

Get annotation

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}

Requires ANY permissions:

- recording:annotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    Annotation result = apiInstance.getConversationRecordingAnnotation(conversationId, recordingId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation ID |
| **recordingId**    | **String** | Recording ID    |
| **annotationId**   | **String** | Annotation ID   |

{: class="table-striped"}

### Return type

[**Annotation**](Annotation.md)

<a name="getConversationRecordingAnnotations"></a>

# **getConversationRecordingAnnotations**

> [List&lt;Annotation&gt;](Annotation.md) getConversationRecordingAnnotations(conversationId, recordingId)

Get annotations for recording

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations

Requires ANY permissions:

- recording:annotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
try {
    List<Annotation> result = apiInstance.getConversationRecordingAnnotations(conversationId, recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingAnnotations");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation ID |
| **recordingId**    | **String** | Recording ID    |

{: class="table-striped"}

### Return type

[**List&lt;Annotation&gt;**](Annotation.md)

<a name="getConversationRecordingmetadata"></a>

# **getConversationRecordingmetadata**

> [List&lt;RecordingMetadata&gt;](RecordingMetadata.md) getConversationRecordingmetadata(conversationId)

Get recording metadata for a conversation. Does not return playable media. Annotations won&#39;t be included in the response if recording:recording:view permission is missing.

Wraps GET /api/v2/conversations/{conversationId}/recordingmetadata

Requires ANY permissions:

- recording:recording:view
- recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    List<RecordingMetadata> result = apiInstance.getConversationRecordingmetadata(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingmetadata");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation ID |

{: class="table-striped"}

### Return type

[**List&lt;RecordingMetadata&gt;**](RecordingMetadata.md)

<a name="getConversationRecordingmetadataRecordingId"></a>

# **getConversationRecordingmetadataRecordingId**

> [RecordingMetadata](RecordingMetadata.md) getConversationRecordingmetadataRecordingId(conversationId, recordingId)

Get metadata for a specific recording. Does not return playable media.

Wraps GET /api/v2/conversations/{conversationId}/recordingmetadata/{recordingId}

Requires ANY permissions:

- recording:recording:view
- recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
try {
    RecordingMetadata result = apiInstance.getConversationRecordingmetadataRecordingId(conversationId, recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingmetadataRecordingId");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | Conversation ID |
| **recordingId**    | **String** | Recording ID    |

{: class="table-striped"}

### Return type

[**RecordingMetadata**](RecordingMetadata.md)

<a name="getConversationRecordings"></a>

# **getConversationRecordings**

> [List&lt;Recording&gt;](Recording.md) getConversationRecordings(conversationId, maxWaitMs, formatId, mediaFormats)

Get all of a Conversation&#39;s Recordings.

Wraps GET /api/v2/conversations/{conversationId}/recordings

Requires ANY permissions:

- recording:recording:view
- recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
Integer maxWaitMs = 5000; // Integer | The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value.
String formatId = "WEBM"; // String | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE.
List<String> mediaFormats = Arrays.asList("mediaFormats_example"); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3.
try {
    List<Recording> result = apiInstance.getConversationRecordings(conversationId, maxWaitMs, formatId, mediaFormats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordings");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description                                                                                               | Notes                                                                                              |
| ------------------ | ----------------------------------- | --------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| **conversationId** | **String**                          | Conversation ID                                                                                           |
| **maxWaitMs**      | **Integer**                         | The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value.       | [optional] [default to 5000]                                                                       |
| **formatId**       | **String**                          | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE.                    | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE |
| **mediaFormats**   | [**List&lt;String&gt;**](String.md) | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3. | [optional]                                                                                         |

{: class="table-striped"}

### Return type

[**List&lt;Recording&gt;**](Recording.md)

<a name="getOrphanrecording"></a>

# **getOrphanrecording**

> [OrphanRecording](OrphanRecording.md) getOrphanrecording(orphanId)

Gets a single orphan recording

Wraps GET /api/v2/orphanrecordings/{orphanId}

Requires ANY permissions:

- recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.getOrphanrecording(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecording");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **orphanId** | **String** | Orphan ID   |

{: class="table-striped"}

### Return type

[**OrphanRecording**](OrphanRecording.md)

<a name="getOrphanrecordingMedia"></a>

# **getOrphanrecordingMedia**

> [Recording](Recording.md) getOrphanrecordingMedia(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats)

Gets the media of a single orphan recording

A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.

Wraps GET /api/v2/orphanrecordings/{orphanId}/media

Requires ANY permissions:

- recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
String formatId = "WEBM"; // String | The desired media format.
String emailFormatId = "EML"; // String | The desired media format when downloading an email recording.
String chatFormatId = "ZIP"; // String | The desired media format when downloading a chat recording.
String messageFormatId = "ZIP"; // String | The desired media format when downloading a message recording.
Boolean download = false; // Boolean | requesting a download format of the recording
String fileName = "fileName_example"; // String | the name of the downloaded fileName
String locale = "locale_example"; // String | The locale for the requested file when downloading, as an ISO 639-1 code
List<String> mediaFormats = Arrays.asList("mediaFormats_example"); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3
try {
    Recording result = apiInstance.getOrphanrecordingMedia(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecordingMedia");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                | Description                                                                                              | Notes                                                                                              |
| ------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| **orphanId**        | **String**                          | Orphan ID                                                                                                |
| **formatId**        | **String**                          | The desired media format.                                                                                | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE |
| **emailFormatId**   | **String**                          | The desired media format when downloading an email recording.                                            | [optional] [default to EML]<br />**Values**: EML, NONE                                             |
| **chatFormatId**    | **String**                          | The desired media format when downloading a chat recording.                                              | [optional] [default to ZIP]<br />**Values**: ZIP, NONE                                             |
| **messageFormatId** | **String**                          | The desired media format when downloading a message recording.                                           | [optional] [default to ZIP]<br />**Values**: ZIP, NONE                                             |
| **download**        | **Boolean**                         | requesting a download format of the recording                                                            | [optional] [default to false]                                                                      |
| **fileName**        | **String**                          | the name of the downloaded fileName                                                                      | [optional]                                                                                         |
| **locale**          | **String**                          | The locale for the requested file when downloading, as an ISO 639-1 code                                 | [optional]                                                                                         |
| **mediaFormats**    | [**List&lt;String&gt;**](String.md) | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 | [optional]                                                                                         |

{: class="table-striped"}

### Return type

[**Recording**](Recording.md)

<a name="getOrphanrecordings"></a>

# **getOrphanrecordings**

> [OrphanRecordingListing](OrphanRecordingListing.md) getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media)

Gets all orphan recordings

Wraps GET /api/v2/orphanrecordings

Requires ANY permissions:

- recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Boolean hasConversation = false; // Boolean | Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization.
String media = "media_example"; // String | Filter resulting orphans based on their media type
try {
    OrphanRecordingListing result = apiInstance.getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecordings");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                | Description                                                                                                    | Notes                                    |
| ------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------------- | ---------------------------------------- |
| **pageSize**        | **Integer**                         | The total page size requested                                                                                  | [optional] [default to 25]               |
| **pageNumber**      | **Integer**                         | The page number requested                                                                                      | [optional] [default to 1]                |
| **sortBy**          | **String**                          | variable name requested to sort by                                                                             | [optional]                               |
| **expand**          | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                                                         | [optional]                               |
| **nextPage**        | **String**                          | next page token                                                                                                | [optional]                               |
| **previousPage**    | **String**                          | Previous page token                                                                                            | [optional]                               |
| **hasConversation** | **Boolean**                         | Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization. | [optional] [default to false]            |
| **media**           | **String**                          | Filter resulting orphans based on their media type                                                             | [optional]<br />**Values**: Call, Screen |

{: class="table-striped"}

### Return type

[**OrphanRecordingListing**](OrphanRecordingListing.md)

<a name="getRecordingBatchrequest"></a>

# **getRecordingBatchrequest**

> [BatchDownloadJobStatusResult](BatchDownloadJobStatusResult.md) getRecordingBatchrequest(jobId)

Get the status and results for a batch request job, only the user that submitted the job may retrieve results

Wraps GET /api/v2/recording/batchrequests/{jobId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    BatchDownloadJobStatusResult result = apiInstance.getRecordingBatchrequest(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingBatchrequest");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

[**BatchDownloadJobStatusResult**](BatchDownloadJobStatusResult.md)

<a name="getRecordingCrossplatformMediaretentionpolicies"></a>

# **getRecordingCrossplatformMediaretentionpolicies**

> [PolicyEntityListing](PolicyEntityListing.md) getRecordingCrossplatformMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors)

Gets media retention policy list with query options to filter on name and enabled.

for a less verbose response, add summary=true to this endpoint

Wraps GET /api/v2/recording/crossplatform/mediaretentionpolicies

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the policy name - used for filtering results in searches.
Boolean enabled = true; // Boolean | checks to see if policy is enabled - use enabled = true or enabled = false
Boolean summary = false; // Boolean | provides a less verbose response of policy lists.
Boolean hasErrors = true; // Boolean | provides a way to fetch all policies with errors or policies that do not have errors
try {
    PolicyEntityListing result = apiInstance.getRecordingCrossplatformMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                                                          | Notes                         |
| ---------------- | ----------------------------------- | ------------------------------------------------------------------------------------ | ----------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested                                                        | [optional] [default to 25]    |
| **pageNumber**   | **Integer**                         | The page number requested                                                            | [optional] [default to 1]     |
| **sortBy**       | **String**                          | variable name requested to sort by                                                   | [optional]                    |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                               | [optional]                    |
| **nextPage**     | **String**                          | next page token                                                                      | [optional]                    |
| **previousPage** | **String**                          | Previous page token                                                                  | [optional]                    |
| **name**         | **String**                          | the policy name - used for filtering results in searches.                            | [optional]                    |
| **enabled**      | **Boolean**                         | checks to see if policy is enabled - use enabled = true or enabled = false           | [optional]                    |
| **summary**      | **Boolean**                         | provides a less verbose response of policy lists.                                    | [optional] [default to false] |
| **hasErrors**    | **Boolean**                         | provides a way to fetch all policies with errors or policies that do not have errors | [optional]                    |

{: class="table-striped"}

### Return type

[**PolicyEntityListing**](PolicyEntityListing.md)

<a name="getRecordingCrossplatformMediaretentionpolicy"></a>

# **getRecordingCrossplatformMediaretentionpolicy**

> [CrossPlatformPolicy](CrossPlatformPolicy.md) getRecordingCrossplatformMediaretentionpolicy(policyId)

Get a media retention policy

Wraps GET /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    CrossPlatformPolicy result = apiInstance.getRecordingCrossplatformMediaretentionpolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **policyId** | **String** | Policy ID   |

{: class="table-striped"}

### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy.md)

<a name="getRecordingJob"></a>

# **getRecordingJob**

> [RecordingJob](RecordingJob.md) getRecordingJob(jobId)

Get the status of the job associated with the job id.

Wraps GET /api/v2/recording/jobs/{jobId}

Requires ALL permissions:

- recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    RecordingJob result = apiInstance.getRecordingJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

[**RecordingJob**](RecordingJob.md)

<a name="getRecordingJobFailedrecordings"></a>

# **getRecordingJobFailedrecordings**

> [FailedRecordingEntityListing](FailedRecordingEntityListing.md) getRecordingJobFailedrecordings(jobId, pageSize, pageNumber, includeTotal, cursor)

Get IDs of recordings that the bulk job failed for

Wraps GET /api/v2/recording/jobs/{jobId}/failedrecordings

Requires ALL permissions:

- recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
Integer pageSize = 25; // Integer | Page size. Maximum is 100.
Integer pageNumber = 1; // Integer | Page number
Boolean includeTotal = true; // Boolean | If false, cursor will be used to locate the page instead of pageNumber.
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
try {
    FailedRecordingEntityListing result = apiInstance.getRecordingJobFailedrecordings(jobId, pageSize, pageNumber, includeTotal, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJobFailedrecordings");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type        | Description                                                             | Notes                      |
| ---------------- | ----------- | ----------------------------------------------------------------------- | -------------------------- |
| **jobId**        | **String**  | jobId                                                                   |
| **pageSize**     | **Integer** | Page size. Maximum is 100.                                              | [optional] [default to 25] |
| **pageNumber**   | **Integer** | Page number                                                             | [optional] [default to 1]  |
| **includeTotal** | **Boolean** | If false, cursor will be used to locate the page instead of pageNumber. | [optional]                 |
| **cursor**       | **String**  | Indicates where to resume query results (not required for first page)   | [optional]                 |

{: class="table-striped"}

### Return type

[**FailedRecordingEntityListing**](FailedRecordingEntityListing.md)

<a name="getRecordingJobs"></a>

# **getRecordingJobs**

> [RecordingJobEntityListing](RecordingJobEntityListing.md) getRecordingJobs(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor)

Get the status of all jobs within the user&#39;s organization

Wraps GET /api/v2/recording/jobs

Requires ALL permissions:

- recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "userId"; // String | Sort by
String state = "state_example"; // String | Filter by state
Boolean showOnlyMyJobs = true; // Boolean | Show only my jobs
String jobType = "jobType_example"; // String | Job Type (Can be left empty for both)
Boolean includeTotal = true; // Boolean | If false, cursor will be used to locate the page instead of pageNumber.
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
try {
    RecordingJobEntityListing result = apiInstance.getRecordingJobs(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJobs");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                                             | Notes                                                                                |
| ------------------ | ----------- | ----------------------------------------------------------------------- | ------------------------------------------------------------------------------------ |
| **pageSize**       | **Integer** | Page size                                                               | [optional] [default to 25]                                                           |
| **pageNumber**     | **Integer** | Page number                                                             | [optional] [default to 1]                                                            |
| **sortBy**         | **String**  | Sort by                                                                 | [optional] [default to userId]<br />**Values**: userId, dateCreated                  |
| **state**          | **String**  | Filter by state                                                         | [optional]<br />**Values**: FULFILLED, PENDING, READY, PROCESSING, CANCELLED, FAILED |
| **showOnlyMyJobs** | **Boolean** | Show only my jobs                                                       | [optional]                                                                           |
| **jobType**        | **String**  | Job Type (Can be left empty for both)                                   | [optional]<br />**Values**: DELETE, EXPORT                                           |
| **includeTotal**   | **Boolean** | If false, cursor will be used to locate the page instead of pageNumber. | [optional]                                                                           |
| **cursor**         | **String**  | Indicates where to resume query results (not required for first page)   | [optional]                                                                           |

{: class="table-striped"}

### Return type

[**RecordingJobEntityListing**](RecordingJobEntityListing.md)

<a name="getRecordingLocalkeysSetting"></a>

# **getRecordingLocalkeysSetting**

> [LocalEncryptionConfiguration](LocalEncryptionConfiguration.md) getRecordingLocalkeysSetting(settingsId)

Get the local encryption settings

Wraps GET /api/v2/recording/localkeys/settings/{settingsId}

Requires ANY permissions:

- recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String settingsId = "settingsId_example"; // String | Settings Id
try {
    LocalEncryptionConfiguration result = apiInstance.getRecordingLocalkeysSetting(settingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingLocalkeysSetting");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **settingsId** | **String** | Settings Id |

{: class="table-striped"}

### Return type

[**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.md)

<a name="getRecordingLocalkeysSettings"></a>

# **getRecordingLocalkeysSettings**

> [LocalEncryptionConfigurationListing](LocalEncryptionConfigurationListing.md) getRecordingLocalkeysSettings()

gets a list local key settings data

Wraps GET /api/v2/recording/localkeys/settings

Requires ANY permissions:

- recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    LocalEncryptionConfigurationListing result = apiInstance.getRecordingLocalkeysSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingLocalkeysSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**LocalEncryptionConfigurationListing**](LocalEncryptionConfigurationListing.md)

<a name="getRecordingMediaretentionpolicies"></a>

# **getRecordingMediaretentionpolicies**

> [PolicyEntityListing](PolicyEntityListing.md) getRecordingMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors)

Gets media retention policy list with query options to filter on name and enabled.

for a less verbose response, add summary=true to this endpoint

Wraps GET /api/v2/recording/mediaretentionpolicies

Requires ANY permissions:

- recording:retentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList("expand_example"); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the policy name - used for filtering results in searches.
Boolean enabled = true; // Boolean | checks to see if policy is enabled - use enabled = true or enabled = false
Boolean summary = false; // Boolean | provides a less verbose response of policy lists.
Boolean hasErrors = true; // Boolean | provides a way to fetch all policies with errors or policies that do not have errors
try {
    PolicyEntityListing result = apiInstance.getRecordingMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type                                | Description                                                                          | Notes                         |
| ---------------- | ----------------------------------- | ------------------------------------------------------------------------------------ | ----------------------------- |
| **pageSize**     | **Integer**                         | The total page size requested                                                        | [optional] [default to 25]    |
| **pageNumber**   | **Integer**                         | The page number requested                                                            | [optional] [default to 1]     |
| **sortBy**       | **String**                          | variable name requested to sort by                                                   | [optional]                    |
| **expand**       | [**List&lt;String&gt;**](String.md) | variable name requested by expand list                                               | [optional]                    |
| **nextPage**     | **String**                          | next page token                                                                      | [optional]                    |
| **previousPage** | **String**                          | Previous page token                                                                  | [optional]                    |
| **name**         | **String**                          | the policy name - used for filtering results in searches.                            | [optional]                    |
| **enabled**      | **Boolean**                         | checks to see if policy is enabled - use enabled = true or enabled = false           | [optional]                    |
| **summary**      | **Boolean**                         | provides a less verbose response of policy lists.                                    | [optional] [default to false] |
| **hasErrors**    | **Boolean**                         | provides a way to fetch all policies with errors or policies that do not have errors | [optional]                    |

{: class="table-striped"}

### Return type

[**PolicyEntityListing**](PolicyEntityListing.md)

<a name="getRecordingMediaretentionpolicy"></a>

# **getRecordingMediaretentionpolicy**

> [Policy](Policy.md) getRecordingMediaretentionpolicy(policyId)

Get a media retention policy

Wraps GET /api/v2/recording/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:retentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    Policy result = apiInstance.getRecordingMediaretentionpolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description | Notes |
| ------------ | ---------- | ----------- | ----- |
| **policyId** | **String** | Policy ID   |

{: class="table-striped"}

### Return type

[**Policy**](Policy.md)

<a name="getRecordingRecordingkeys"></a>

# **getRecordingRecordingkeys**

> [EncryptionKeyEntityListing](EncryptionKeyEntityListing.md) getRecordingRecordingkeys(pageSize, pageNumber)

Get encryption key list

Wraps GET /api/v2/recording/recordingkeys

Requires ANY permissions:

- recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EncryptionKeyEntityListing result = apiInstance.getRecordingRecordingkeys(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingRecordingkeys");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**EncryptionKeyEntityListing**](EncryptionKeyEntityListing.md)

<a name="getRecordingRecordingkeysRotationschedule"></a>

# **getRecordingRecordingkeysRotationschedule**

> [KeyRotationSchedule](KeyRotationSchedule.md) getRecordingRecordingkeysRotationschedule()

Get key rotation schedule

Wraps GET /api/v2/recording/recordingkeys/rotationschedule

Requires ANY permissions:

- recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    KeyRotationSchedule result = apiInstance.getRecordingRecordingkeysRotationschedule();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**KeyRotationSchedule**](KeyRotationSchedule.md)

<a name="getRecordingSettings"></a>

# **getRecordingSettings**

> [RecordingSettings](RecordingSettings.md) getRecordingSettings(createDefault)

Get the Recording Settings for the Organization

Wraps GET /api/v2/recording/settings

Requires ANY permissions:

- recording:screenRecording:view
- recording:settings:editScreenRecordings

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Boolean createDefault = false; // Boolean | If no settings are found, a new one is created with default values
try {
    RecordingSettings result = apiInstance.getRecordingSettings(createDefault);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingSettings");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description                                                        | Notes                         |
| ----------------- | ----------- | ------------------------------------------------------------------ | ----------------------------- |
| **createDefault** | **Boolean** | If no settings are found, a new one is created with default values | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**RecordingSettings**](RecordingSettings.md)

<a name="getRecordingsScreensessions"></a>

# **getRecordingsScreensessions**

> [ScreenRecordingSessionListing](ScreenRecordingSessionListing.md) getRecordingsScreensessions(pageSize, pageNumber)

Retrieves a paged listing of screen recording sessions

Wraps GET /api/v2/recordings/screensessions

Requires ANY permissions:

- recording:screenRecording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    ScreenRecordingSessionListing result = apiInstance.getRecordingsScreensessions(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingsScreensessions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**ScreenRecordingSessionListing**](ScreenRecordingSessionListing.md)

<a name="patchRecordingCrossplatformMediaretentionpolicy"></a>

# **patchRecordingCrossplatformMediaretentionpolicy**

> [CrossPlatformPolicy](CrossPlatformPolicy.md) patchRecordingCrossplatformMediaretentionpolicy(policyId, body)

Patch a media retention policy

Wraps PATCH /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
CrossPlatformPolicyUpdate body = new CrossPlatformPolicyUpdate(); // CrossPlatformPolicyUpdate | Policy
try {
    CrossPlatformPolicy result = apiInstance.patchRecordingCrossplatformMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                                          | Description | Notes |
| ------------ | ------------------------------------------------------------- | ----------- | ----- |
| **policyId** | **String**                                                    | Policy ID   |
| **body**     | [**CrossPlatformPolicyUpdate**](CrossPlatformPolicyUpdate.md) | Policy      |

{: class="table-striped"}

### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy.md)

<a name="patchRecordingMediaretentionpolicy"></a>

# **patchRecordingMediaretentionpolicy**

> [Policy](Policy.md) patchRecordingMediaretentionpolicy(policyId, body)

Patch a media retention policy

Wraps PATCH /api/v2/recording/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:retentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
PolicyUpdate body = new PolicyUpdate(); // PolicyUpdate | Policy
try {
    Policy result = apiInstance.patchRecordingMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                | Description | Notes |
| ------------ | ----------------------------------- | ----------- | ----- |
| **policyId** | **String**                          | Policy ID   |
| **body**     | [**PolicyUpdate**](PolicyUpdate.md) | Policy      |

{: class="table-striped"}

### Return type

[**Policy**](Policy.md)

<a name="patchRecordingsScreensession"></a>

# **patchRecordingsScreensession**

> Void patchRecordingsScreensession(recordingSessionId, body)

Update a screen recording session

Wraps PATCH /api/v2/recordings/screensessions/{recordingSessionId}

Requires ANY permissions:

- recording:screenRecording:stop

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String recordingSessionId = "recordingSessionId_example"; // String | Screen recording session ID
ScreenRecordingSessionRequest body = new ScreenRecordingSessionRequest(); // ScreenRecordingSessionRequest |
try {
    apiInstance.patchRecordingsScreensession(recordingSessionId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchRecordingsScreensession");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                                                  | Description                 | Notes      |
| ---------------------- | --------------------------------------------------------------------- | --------------------------- | ---------- |
| **recordingSessionId** | **String**                                                            | Screen recording session ID |
| **body**               | [**ScreenRecordingSessionRequest**](ScreenRecordingSessionRequest.md) |                             | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationRecordingAnnotations"></a>

# **postConversationRecordingAnnotations**

> [Annotation](Annotation.md) postConversationRecordingAnnotations(conversationId, recordingId, body)

Create annotation

Wraps POST /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations

Requires ANY permissions:

- recording:annotation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.postConversationRecordingAnnotations(conversationId, recordingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postConversationRecordingAnnotations");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                            | Description     | Notes |
| ------------------ | ------------------------------- | --------------- | ----- |
| **conversationId** | **String**                      | Conversation ID |
| **recordingId**    | **String**                      | Recording ID    |
| **body**           | [**Annotation**](Annotation.md) | annotation      |

{: class="table-striped"}

### Return type

[**Annotation**](Annotation.md)

<a name="postRecordingBatchrequests"></a>

# **postRecordingBatchrequests**

> [BatchDownloadJobSubmissionResult](BatchDownloadJobSubmissionResult.md) postRecordingBatchrequests(body)

Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.

Wraps POST /api/v2/recording/batchrequests

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
BatchDownloadJobSubmission body = new BatchDownloadJobSubmission(); // BatchDownloadJobSubmission | Job submission criteria
try {
    BatchDownloadJobSubmissionResult result = apiInstance.postRecordingBatchrequests(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingBatchrequests");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description             | Notes |
| -------- | --------------------------------------------------------------- | ----------------------- | ----- |
| **body** | [**BatchDownloadJobSubmission**](BatchDownloadJobSubmission.md) | Job submission criteria |

{: class="table-striped"}

### Return type

[**BatchDownloadJobSubmissionResult**](BatchDownloadJobSubmissionResult.md)

<a name="postRecordingCrossplatformMediaretentionpolicies"></a>

# **postRecordingCrossplatformMediaretentionpolicies**

> [CrossPlatformPolicy](CrossPlatformPolicy.md) postRecordingCrossplatformMediaretentionpolicies(body)

Create media retention policy

Policy does not work retroactively

Wraps POST /api/v2/recording/crossplatform/mediaretentionpolicies

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
CrossPlatformPolicyCreate body = new CrossPlatformPolicyCreate(); // CrossPlatformPolicyCreate | Policy
try {
    CrossPlatformPolicy result = apiInstance.postRecordingCrossplatformMediaretentionpolicies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description | Notes |
| -------- | ------------------------------------------------------------- | ----------- | ----- |
| **body** | [**CrossPlatformPolicyCreate**](CrossPlatformPolicyCreate.md) | Policy      |

{: class="table-striped"}

### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy.md)

<a name="postRecordingJobs"></a>

# **postRecordingJobs**

> [RecordingJob](RecordingJob.md) postRecordingJobs(body)

Create a recording bulk job

Wraps POST /api/v2/recording/jobs

Requires ALL permissions:

- recording:job:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingJobsQuery body = new RecordingJobsQuery(); // RecordingJobsQuery | query
try {
    RecordingJob result = apiInstance.postRecordingJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                            | Description | Notes |
| -------- | ----------------------------------------------- | ----------- | ----- |
| **body** | [**RecordingJobsQuery**](RecordingJobsQuery.md) | query       |

{: class="table-striped"}

### Return type

[**RecordingJob**](RecordingJob.md)

<a name="postRecordingLocalkeys"></a>

# **postRecordingLocalkeys**

> [EncryptionKey](EncryptionKey.md) postRecordingLocalkeys(body)

create a local recording key

Wraps POST /api/v2/recording/localkeys

Requires ANY permissions:

- recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
LocalEncryptionKeyRequest body = new LocalEncryptionKeyRequest(); // LocalEncryptionKeyRequest | Local Encryption body
try {
    EncryptionKey result = apiInstance.postRecordingLocalkeys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingLocalkeys");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description           | Notes |
| -------- | ------------------------------------------------------------- | --------------------- | ----- |
| **body** | [**LocalEncryptionKeyRequest**](LocalEncryptionKeyRequest.md) | Local Encryption body |

{: class="table-striped"}

### Return type

[**EncryptionKey**](EncryptionKey.md)

<a name="postRecordingLocalkeysSettings"></a>

# **postRecordingLocalkeysSettings**

> [LocalEncryptionConfiguration](LocalEncryptionConfiguration.md) postRecordingLocalkeysSettings(body)

create settings for local key creation

Wraps POST /api/v2/recording/localkeys/settings

Requires ANY permissions:

- recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
LocalEncryptionConfiguration body = new LocalEncryptionConfiguration(); // LocalEncryptionConfiguration | Local Encryption Configuration
try {
    LocalEncryptionConfiguration result = apiInstance.postRecordingLocalkeysSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingLocalkeysSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description                    | Notes |
| -------- | ------------------------------------------------------------------- | ------------------------------ | ----- |
| **body** | [**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.md) | Local Encryption Configuration |

{: class="table-striped"}

### Return type

[**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.md)

<a name="postRecordingMediaretentionpolicies"></a>

# **postRecordingMediaretentionpolicies**

> [Policy](Policy.md) postRecordingMediaretentionpolicies(body)

Create media retention policy

Policy does not work retroactively

Wraps POST /api/v2/recording/mediaretentionpolicies

Requires ANY permissions:

- recording:retentionPolicy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
PolicyCreate body = new PolicyCreate(); // PolicyCreate | Policy
try {
    Policy result = apiInstance.postRecordingMediaretentionpolicies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description | Notes |
| -------- | ----------------------------------- | ----------- | ----- |
| **body** | [**PolicyCreate**](PolicyCreate.md) | Policy      |

{: class="table-striped"}

### Return type

[**Policy**](Policy.md)

<a name="postRecordingRecordingkeys"></a>

# **postRecordingRecordingkeys**

> [EncryptionKey](EncryptionKey.md) postRecordingRecordingkeys()

Create encryption key

Wraps POST /api/v2/recording/recordingkeys

Requires ANY permissions:

- recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    EncryptionKey result = apiInstance.postRecordingRecordingkeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingRecordingkeys");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EncryptionKey**](EncryptionKey.md)

<a name="postRecordingsDeletionprotection"></a>

# **postRecordingsDeletionprotection**

> [List&lt;AddressableEntityRef&gt;](AddressableEntityRef.md) postRecordingsDeletionprotection(body)

Get a list of conversations with protected recordings

Wraps POST /api/v2/recordings/deletionprotection

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
ConversationDeletionProtectionQuery body = new ConversationDeletionProtectionQuery(); // ConversationDeletionProtectionQuery | conversationIds
try {
    List<AddressableEntityRef> result = apiInstance.postRecordingsDeletionprotection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsDeletionprotection");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                              | Description     | Notes |
| -------- | --------------------------------------------------------------------------------- | --------------- | ----- |
| **body** | [**ConversationDeletionProtectionQuery**](ConversationDeletionProtectionQuery.md) | conversationIds |

{: class="table-striped"}

### Return type

[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.md)

<a name="postRecordingsScreensessionsAcknowledge"></a>

# **postRecordingsScreensessionsAcknowledge**

> Void postRecordingsScreensessionsAcknowledge(body)

Acknowledge a screen recording.

Wraps POST /api/v2/recordings/screensessions/acknowledge

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
AcknowledgeScreenRecordingRequest body = new AcknowledgeScreenRecordingRequest(); // AcknowledgeScreenRecordingRequest | AcknowledgeScreenRecordingRequest
try {
    apiInstance.postRecordingsScreensessionsAcknowledge(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsScreensessionsAcknowledge");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                          | Description                       | Notes |
| -------- | ----------------------------------------------------------------------------- | --------------------------------- | ----- |
| **body** | [**AcknowledgeScreenRecordingRequest**](AcknowledgeScreenRecordingRequest.md) | AcknowledgeScreenRecordingRequest |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postRecordingsScreensessionsMetadata"></a>

# **postRecordingsScreensessionsMetadata**

> Void postRecordingsScreensessionsMetadata(body)

Provide meta-data a screen recording.

Wraps POST /api/v2/recordings/screensessions/metadata

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
ScreenRecordingMetaDataRequest body = new ScreenRecordingMetaDataRequest(); // ScreenRecordingMetaDataRequest | ScreenRecordingMetaDataRequest
try {
    apiInstance.postRecordingsScreensessionsMetadata(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsScreensessionsMetadata");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                    | Description                    | Notes |
| -------- | ----------------------------------------------------------------------- | ------------------------------ | ----- |
| **body** | [**ScreenRecordingMetaDataRequest**](ScreenRecordingMetaDataRequest.md) | ScreenRecordingMetaDataRequest |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="putConversationRecording"></a>

# **putConversationRecording**

> [Recording](Recording.md) putConversationRecording(conversationId, recordingId, body)

Updates the retention records on a recording.

Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.

Wraps PUT /api/v2/conversations/{conversationId}/recordings/{recordingId}

Requires ANY permissions:

- recording:recording:view
- recording:recording:editRetention
- recording:screenRecording:editRetention

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Recording body = new Recording(); // Recording | recording
try {
    Recording result = apiInstance.putConversationRecording(conversationId, recordingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationRecording");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                          | Description     | Notes |
| ------------------ | ----------------------------- | --------------- | ----- |
| **conversationId** | **String**                    | Conversation ID |
| **recordingId**    | **String**                    | Recording ID    |
| **body**           | [**Recording**](Recording.md) | recording       |

{: class="table-striped"}

### Return type

[**Recording**](Recording.md)

<a name="putConversationRecordingAnnotation"></a>

# **putConversationRecordingAnnotation**

> [Annotation](Annotation.md) putConversationRecordingAnnotation(conversationId, recordingId, annotationId, body)

Update annotation

Wraps PUT /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}

Requires ANY permissions:

- recording:annotation:edit
- recording:recording:view
- recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.putConversationRecordingAnnotation(conversationId, recordingId, annotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                            | Description     | Notes |
| ------------------ | ------------------------------- | --------------- | ----- |
| **conversationId** | **String**                      | Conversation ID |
| **recordingId**    | **String**                      | Recording ID    |
| **annotationId**   | **String**                      | Annotation ID   |
| **body**           | [**Annotation**](Annotation.md) | annotation      |

{: class="table-striped"}

### Return type

[**Annotation**](Annotation.md)

<a name="putOrphanrecording"></a>

# **putOrphanrecording**

> [Recording](Recording.md) putOrphanrecording(orphanId, body)

Updates an orphan recording to a regular recording with retention values

If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.

Wraps PUT /api/v2/orphanrecordings/{orphanId}

Requires ANY permissions:

- recording:orphan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
OrphanUpdateRequest body = new OrphanUpdateRequest(); // OrphanUpdateRequest |
try {
    Recording result = apiInstance.putOrphanrecording(orphanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putOrphanrecording");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                              | Description | Notes      |
| ------------ | ------------------------------------------------- | ----------- | ---------- |
| **orphanId** | **String**                                        | Orphan ID   |
| **body**     | [**OrphanUpdateRequest**](OrphanUpdateRequest.md) |             | [optional] |

{: class="table-striped"}

### Return type

[**Recording**](Recording.md)

<a name="putRecordingCrossplatformMediaretentionpolicy"></a>

# **putRecordingCrossplatformMediaretentionpolicy**

> [CrossPlatformPolicy](CrossPlatformPolicy.md) putRecordingCrossplatformMediaretentionpolicy(policyId, body)

Update a media retention policy

Policy does not work retroactively

Wraps PUT /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:crossPlatformRetentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
CrossPlatformPolicy body = new CrossPlatformPolicy(); // CrossPlatformPolicy | Policy
try {
    CrossPlatformPolicy result = apiInstance.putRecordingCrossplatformMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                                              | Description | Notes |
| ------------ | ------------------------------------------------- | ----------- | ----- |
| **policyId** | **String**                                        | Policy ID   |
| **body**     | [**CrossPlatformPolicy**](CrossPlatformPolicy.md) | Policy      |

{: class="table-striped"}

### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy.md)

<a name="putRecordingJob"></a>

# **putRecordingJob**

> [RecordingJob](RecordingJob.md) putRecordingJob(jobId, body)

Execute the recording bulk job.

A job must be executed by the same user whom originally created the job. In addition, the user must have permission to update the recording&#39;s retention.

Wraps PUT /api/v2/recording/jobs/{jobId}

Requires ALL permissions:

- recording:job:edit
- recording:recording:editRetention
- recording:screenRecording:editRetention

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
ExecuteRecordingJobsQuery body = new ExecuteRecordingJobsQuery(); // ExecuteRecordingJobsQuery | query
try {
    RecordingJob result = apiInstance.putRecordingJob(jobId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type                                                          | Description | Notes |
| --------- | ------------------------------------------------------------- | ----------- | ----- |
| **jobId** | **String**                                                    | jobId       |
| **body**  | [**ExecuteRecordingJobsQuery**](ExecuteRecordingJobsQuery.md) | query       |

{: class="table-striped"}

### Return type

[**RecordingJob**](RecordingJob.md)

<a name="putRecordingLocalkeysSetting"></a>

# **putRecordingLocalkeysSetting**

> [LocalEncryptionConfiguration](LocalEncryptionConfiguration.md) putRecordingLocalkeysSetting(settingsId, body)

Update the local encryption settings

Wraps PUT /api/v2/recording/localkeys/settings/{settingsId}

Requires ANY permissions:

- recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String settingsId = "settingsId_example"; // String | Settings Id
LocalEncryptionConfiguration body = new LocalEncryptionConfiguration(); // LocalEncryptionConfiguration | Local Encryption metadata
try {
    LocalEncryptionConfiguration result = apiInstance.putRecordingLocalkeysSetting(settingsId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingLocalkeysSetting");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                                                | Description               | Notes |
| -------------- | ------------------------------------------------------------------- | ------------------------- | ----- |
| **settingsId** | **String**                                                          | Settings Id               |
| **body**       | [**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.md) | Local Encryption metadata |

{: class="table-striped"}

### Return type

[**LocalEncryptionConfiguration**](LocalEncryptionConfiguration.md)

<a name="putRecordingMediaretentionpolicy"></a>

# **putRecordingMediaretentionpolicy**

> [Policy](Policy.md) putRecordingMediaretentionpolicy(policyId, body)

Update a media retention policy

Policy does not work retroactively

Wraps PUT /api/v2/recording/mediaretentionpolicies/{policyId}

Requires ANY permissions:

- recording:retentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
Policy body = new Policy(); // Policy | Policy
try {
    Policy result = apiInstance.putRecordingMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type                    | Description | Notes |
| ------------ | ----------------------- | ----------- | ----- |
| **policyId** | **String**              | Policy ID   |
| **body**     | [**Policy**](Policy.md) | Policy      |

{: class="table-striped"}

### Return type

[**Policy**](Policy.md)

<a name="putRecordingRecordingkeysRotationschedule"></a>

# **putRecordingRecordingkeysRotationschedule**

> [KeyRotationSchedule](KeyRotationSchedule.md) putRecordingRecordingkeysRotationschedule(body)

Update key rotation schedule

Wraps PUT /api/v2/recording/recordingkeys/rotationschedule

Requires ANY permissions:

- recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
KeyRotationSchedule body = new KeyRotationSchedule(); // KeyRotationSchedule | KeyRotationSchedule
try {
    KeyRotationSchedule result = apiInstance.putRecordingRecordingkeysRotationschedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                              | Description         | Notes |
| -------- | ------------------------------------------------- | ------------------- | ----- |
| **body** | [**KeyRotationSchedule**](KeyRotationSchedule.md) | KeyRotationSchedule |

{: class="table-striped"}

### Return type

[**KeyRotationSchedule**](KeyRotationSchedule.md)

<a name="putRecordingSettings"></a>

# **putRecordingSettings**

> [RecordingSettings](RecordingSettings.md) putRecordingSettings(body)

Update the Recording Settings for the Organization

Wraps PUT /api/v2/recording/settings

Requires ANY permissions:

- recording:settings:editScreenRecordings

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingSettings body = new RecordingSettings(); // RecordingSettings | Recording settings
try {
    RecordingSettings result = apiInstance.putRecordingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingSettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description        | Notes |
| -------- | --------------------------------------------- | ------------------ | ----- |
| **body** | [**RecordingSettings**](RecordingSettings.md) | Recording settings |

{: class="table-striped"}

### Return type

[**RecordingSettings**](RecordingSettings.md)

<a name="putRecordingsDeletionprotection"></a>

# **putRecordingsDeletionprotection**

> Void putRecordingsDeletionprotection(protect, body)

Apply or revoke recording protection for conversations

Wraps PUT /api/v2/recordings/deletionprotection

Requires ANY permissions:

- recording:deletionProtection:apply
- recording:deletionProtection:revoke

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Boolean protect = true; // Boolean | Check for apply, uncheck for revoke (each action requires the respective permission)
ConversationDeletionProtectionQuery body = new ConversationDeletionProtectionQuery(); // ConversationDeletionProtectionQuery |
try {
    apiInstance.putRecordingsDeletionprotection(protect, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingsDeletionprotection");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                                                              | Description                                                                          | Notes                        |
| ----------- | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ | ---------------------------- |
| **protect** | **Boolean**                                                                       | Check for apply, uncheck for revoke (each action requires the respective permission) | [optional] [default to true] |
| **body**    | [**ConversationDeletionProtectionQuery**](ConversationDeletionProtectionQuery.md) |                                                                                      | [optional]                   |

{: class="table-striped"}

### Return type

null (empty response body)
