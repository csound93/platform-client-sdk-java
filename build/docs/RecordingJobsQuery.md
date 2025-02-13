---
title: RecordingJobsQuery
---

## RecordingJobsQuery

## Properties

| Name                        | Type                                                                         | Description                                                                                                                                                                                                                                                                           | Notes      |
| --------------------------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **action**                  | [**ActionEnum**](#ActionEnum)<!---->                                         | Operation to perform bulk task                                                                                                                                                                                                                                                        |            |
| **actionDate**              | <!----><!---->[**Date**](Date.md)<!---->                                     | The date when the action will be performed. If the operation will cause the delete date of a recording to be older than the export date, the export date will be adjusted to the delete date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |            |
| **integrationId**           | <!----><!---->**String**<!---->                                              | IntegrationId to Access AWS S3 bucket for bulk recording exports. This field is required and used only for EXPORT action.                                                                                                                                                             | [optional] |
| **includeScreenRecordings** | <!----><!---->**Boolean**<!---->                                             | Include Screen recordings for export action, default value = true                                                                                                                                                                                                                     | [optional] |
| **conversationQuery**       | <!----><!---->[**AsyncConversationQuery**](AsyncConversationQuery.md)<!----> | Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.                                                                                                                                   |            |

{: class="table table-striped"}

<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DELETE             | &quot;DELETE&quot;             |
| EXPORT             | &quot;EXPORT&quot;             |

{: class="table table-striped"}
