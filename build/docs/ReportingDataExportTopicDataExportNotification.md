---
title: ReportingDataExportTopicDataExportNotification
---

## ReportingDataExportTopicDataExportNotification

## Properties

| Name                        | Type                                                                   | Description | Notes      |
| --------------------------- | ---------------------------------------------------------------------- | ----------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                        |             | [optional] |
| **runId**                   | <!----><!---->**String**<!---->                                        |             | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                        |             | [optional] |
| **status**                  | [**StatusEnum**](#StatusEnum)<!---->                                   |             | [optional] |
| **exportFormat**            | [**ExportFormatEnum**](#ExportFormatEnum)<!---->                       |             | [optional] |
| **downloadUrl**             | <!----><!---->**String**<!---->                                        |             | [optional] |
| **viewType**                | [**ViewTypeEnum**](#ViewTypeEnum)<!---->                               |             | [optional] |
| **exportErrorMessagesType** | [**ExportErrorMessagesTypeEnum**](#ExportErrorMessagesTypeEnum)<!----> |             | [optional] |
| **read**                    | <!----><!---->**Boolean**<!---->                                       |             | [optional] |
| **createdDateTime**         | <!----><!---->[**Date**](Date.md)<!---->                               |             | [optional] |
| **modifiedDateTime**        | <!----><!---->[**Date**](Date.md)<!---->                               |             | [optional] |
| **percentageComplete**      | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                   |             | [optional] |
| **emailStatuses**           | <!---->[**Map&lt;String, String&gt;**](#InnerEnum)<!---->              |             | [optional] |
| **emailErrorDescription**   | <!----><!---->**String**<!---->                                        |             | [optional] |
| **scheduleExpression**      | <!----><!---->**String**<!---->                                        |             | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name                           | Value                                      |
| ------------------------------ | ------------------------------------------ |
| OUTDATEDSDKVERSION             | &quot;OutdatedSdkVersion&quot;             |
| SUBMITTED                      | &quot;SUBMITTED&quot;                      |
| RUNNING                        | &quot;RUNNING&quot;                        |
| CANCELLING                     | &quot;CANCELLING&quot;                     |
| CANCELLED                      | &quot;CANCELLED&quot;                      |
| COMPLETED                      | &quot;COMPLETED&quot;                      |
| COMPLETED_WITH_PARTIAL_RESULTS | &quot;COMPLETED_WITH_PARTIAL_RESULTS&quot; |
| FAILED                         | &quot;FAILED&quot;                         |

{: class="table table-striped"}

<a name="ExportFormatEnum"></a>

## Enum: ExportFormatEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV                | &quot;CSV&quot;                |
| PDF                | &quot;PDF&quot;                |

{: class="table table-striped"}

<a name="ViewTypeEnum"></a>

## Enum: ViewTypeEnum

| Name                                                | Value                                                           |
| --------------------------------------------------- | --------------------------------------------------------------- |
| OUTDATEDSDKVERSION                                  | &quot;OutdatedSdkVersion&quot;                                  |
| QUEUE_PERFORMANCE_SUMMARY_VIEW                      | &quot;QUEUE_PERFORMANCE_SUMMARY_VIEW&quot;                      |
| QUEUE_PERFORMANCE_DETAIL_VIEW                       | &quot;QUEUE_PERFORMANCE_DETAIL_VIEW&quot;                       |
| INTERACTION_SEARCH_VIEW                             | &quot;INTERACTION_SEARCH_VIEW&quot;                             |
| AGENT_PERFORMANCE_SUMMARY_VIEW                      | &quot;AGENT_PERFORMANCE_SUMMARY_VIEW&quot;                      |
| AGENT_PERFORMANCE_DETAIL_VIEW                       | &quot;AGENT_PERFORMANCE_DETAIL_VIEW&quot;                       |
| AGENT_STATUS_SUMMARY_VIEW                           | &quot;AGENT_STATUS_SUMMARY_VIEW&quot;                           |
| AGENT_STATUS_DETAIL_VIEW                            | &quot;AGENT_STATUS_DETAIL_VIEW&quot;                            |
| AGENT_EVALUATION_SUMMARY_VIEW                       | &quot;AGENT_EVALUATION_SUMMARY_VIEW&quot;                       |
| AGENT_EVALUATION_DETAIL_VIEW                        | &quot;AGENT_EVALUATION_DETAIL_VIEW&quot;                        |
| AGENT_QUEUE_DETAIL_VIEW                             | &quot;AGENT_QUEUE_DETAIL_VIEW&quot;                             |
| AGENT_INTERACTION_DETAIL_VIEW                       | &quot;AGENT_INTERACTION_DETAIL_VIEW&quot;                       |
| ABANDON_INSIGHTS_VIEW                               | &quot;ABANDON_INSIGHTS_VIEW&quot;                               |
| SKILLS_PERFORMANCE_VIEW                             | &quot;SKILLS_PERFORMANCE_VIEW&quot;                             |
| SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW                | &quot;SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW&quot;                |
| SURVEY_FORM_PERFORMANCE_DETAIL_VIEW                 | &quot;SURVEY_FORM_PERFORMANCE_DETAIL_VIEW&quot;                 |
| DNIS_PERFORMANCE_SUMMARY_VIEW                       | &quot;DNIS_PERFORMANCE_SUMMARY_VIEW&quot;                       |
| DNIS_PERFORMANCE_DETAIL_VIEW                        | &quot;DNIS_PERFORMANCE_DETAIL_VIEW&quot;                        |
| WRAP_UP_PERFORMANCE_SUMMARY_VIEW                    | &quot;WRAP_UP_PERFORMANCE_SUMMARY_VIEW&quot;                    |
| AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW               | &quot;AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW&quot;               |
| QUEUE_ACTIVITY_SUMMARY_VIEW                         | &quot;QUEUE_ACTIVITY_SUMMARY_VIEW&quot;                         |
| QUEUE_ACTIVITY_DETAIL_VIEW                          | &quot;QUEUE_ACTIVITY_DETAIL_VIEW&quot;                          |
| AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW                   | &quot;AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW&quot;                   |
| QUEUE_AGENT_DETAIL_VIEW                             | &quot;QUEUE_AGENT_DETAIL_VIEW&quot;                             |
| QUEUE_INTERACTION_DETAIL_VIEW                       | &quot;QUEUE_INTERACTION_DETAIL_VIEW&quot;                       |
| AGENT_SCHEDULE_DETAIL_VIEW                          | &quot;AGENT_SCHEDULE_DETAIL_VIEW&quot;                          |
| IVR_PERFORMANCE_SUMMARY_VIEW                        | &quot;IVR_PERFORMANCE_SUMMARY_VIEW&quot;                        |
| IVR_PERFORMANCE_DETAIL_VIEW                         | &quot;IVR_PERFORMANCE_DETAIL_VIEW&quot;                         |
| ANSWER_INSIGHTS_VIEW                                | &quot;ANSWER_INSIGHTS_VIEW&quot;                                |
| HANDLE_INSIGHTS_VIEW                                | &quot;HANDLE_INSIGHTS_VIEW&quot;                                |
| TALK_INSIGHTS_VIEW                                  | &quot;TALK_INSIGHTS_VIEW&quot;                                  |
| HOLD_INSIGHTS_VIEW                                  | &quot;HOLD_INSIGHTS_VIEW&quot;                                  |
| ACW_INSIGHTS_VIEW                                   | &quot;ACW_INSIGHTS_VIEW&quot;                                   |
| WAIT_INSIGHTS_VIEW                                  | &quot;WAIT_INSIGHTS_VIEW&quot;                                  |
| AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW      | &quot;AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot;      |
| FLOW_OUTCOME_SUMMARY_VIEW                           | &quot;FLOW_OUTCOME_SUMMARY_VIEW&quot;                           |
| FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW                | &quot;FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW&quot;                |
| FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW       | &quot;FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot;       |
| FLOW_DESTINATION_SUMMARY_VIEW                       | &quot;FLOW_DESTINATION_SUMMARY_VIEW&quot;                       |
| FLOW_DESTINATION_DETAIL_VIEW                        | &quot;FLOW_DESTINATION_DETAIL_VIEW&quot;                        |
| SCHEDULED_CALLBACKS_VIEW                            | &quot;SCHEDULED_CALLBACKS_VIEW&quot;                            |
| CONTENT_SEARCH_VIEW                                 | &quot;CONTENT_SEARCH_VIEW&quot;                                 |
| JOURNEY_ACTION_MAP_SUMMARY_VIEW                     | &quot;JOURNEY_ACTION_MAP_SUMMARY_VIEW&quot;                     |
| JOURNEY_OUTCOME_SUMMARY_VIEW                        | &quot;JOURNEY_OUTCOME_SUMMARY_VIEW&quot;                        |
| JOURNEY_SEGMENT_SUMMARY_VIEW                        | &quot;JOURNEY_SEGMENT_SUMMARY_VIEW&quot;                        |
| AGENT_DEVELOPMENT_DETAIL_VIEW                       | &quot;AGENT_DEVELOPMENT_DETAIL_VIEW&quot;                       |
| AGENT_DEVELOPMENT_DETAIL_ME_VIEW                    | &quot;AGENT_DEVELOPMENT_DETAIL_ME_VIEW&quot;                    |
| AGENT_DEVELOPMENT_SUMMARY_VIEW                      | &quot;AGENT_DEVELOPMENT_SUMMARY_VIEW&quot;                      |
| AGENT_SCORECARD_VIEW                                | &quot;AGENT_SCORECARD_VIEW&quot;                                |
| AGENT_SCORECARD_ME_VIEW                             | &quot;AGENT_SCORECARD_ME_VIEW&quot;                             |
| AGENT_GAMIFICATION_LEADERSHIP_VIEW                  | &quot;AGENT_GAMIFICATION_LEADERSHIP_VIEW&quot;                  |
| AGENT_SCHEDULE_ME_VIEW                              | &quot;AGENT_SCHEDULE_ME_VIEW&quot;                              |
| BOT_PERFORMANCE_SUMMARY_VIEW                        | &quot;BOT_PERFORMANCE_SUMMARY_VIEW&quot;                        |
| BOT_PERFORMANCE_DETAIL_VIEW                         | &quot;BOT_PERFORMANCE_DETAIL_VIEW&quot;                         |
| TOPIC_TREND_SUMMARY_VIEW                            | &quot;TOPIC_TREND_SUMMARY_VIEW&quot;                            |
| TOPIC_TREND_DETAIL_VIEW                             | &quot;TOPIC_TREND_DETAIL_VIEW&quot;                             |
| ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW          | &quot;ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW&quot;          |
| ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW | &quot;ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW&quot; |
| FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW              | &quot;FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW&quot;              |
| FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW     | &quot;FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot;     |
| AGENT_TOPIC_SUMMARY_VIEW                            | &quot;AGENT_TOPIC_SUMMARY_VIEW&quot;                            |
| AGENT_TOPIC_DETAIL_VIEW                             | &quot;AGENT_TOPIC_DETAIL_VIEW&quot;                             |
| QUEUE_TOPIC_SUMMARY_VIEW                            | &quot;QUEUE_TOPIC_SUMMARY_VIEW&quot;                            |
| QUEUE_TOPIC_DETAIL_VIEW                             | &quot;QUEUE_TOPIC_DETAIL_VIEW&quot;                             |
| FLOW_TOPIC_SUMMARY_VIEW                             | &quot;FLOW_TOPIC_SUMMARY_VIEW&quot;                             |
| FLOW_TOPIC_DETAIL_VIEW                              | &quot;FLOW_TOPIC_DETAIL_VIEW&quot;                              |
| AGENT_INTERACTIONS_ME_VIEW                          | &quot;AGENT_INTERACTIONS_ME_VIEW&quot;                          |

{: class="table table-striped"}

<a name="ExportErrorMessagesTypeEnum"></a>

## Enum: ExportErrorMessagesTypeEnum

| Name                                                 | Value                                                            |
| ---------------------------------------------------- | ---------------------------------------------------------------- |
| OUTDATEDSDKVERSION                                   | &quot;OutdatedSdkVersion&quot;                                   |
| FAILED_CONVERTING_EXPORT_JOB                         | &quot;FAILED_CONVERTING_EXPORT_JOB&quot;                         |
| FAILED_NO_DATA_EXPORT_JOB_FOUND                      | &quot;FAILED_NO_DATA_EXPORT_JOB_FOUND&quot;                      |
| FAILED_GETTING_DATA_FROM_SERVICE                     | &quot;FAILED_GETTING_DATA_FROM_SERVICE&quot;                     |
| FAILED_GENERATING_TEMP_FILE                          | &quot;FAILED_GENERATING_TEMP_FILE&quot;                          |
| FAILED_SAVING_FILE_TO_S3                             | &quot;FAILED_SAVING_FILE_TO_S3&quot;                             |
| FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD               | &quot;FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD&quot;               |
| FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE | &quot;FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE&quot; |
| EXPORT_TYPE_NOT_IMPLEMENTED                          | &quot;EXPORT_TYPE_NOT_IMPLEMENTED&quot;                          |
| REACHED_MAXIMUM_ATTEMPT_OF_RETRY                     | &quot;REACHED_MAXIMUM_ATTEMPT_OF_RETRY&quot;                     |
| FAILED_LONG_RUNNING_EXPORT                           | &quot;FAILED_LONG_RUNNING_EXPORT&quot;                           |
| TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION               | &quot;TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION&quot;               |
| NOT_AUTHORIZED_TO_VIEW_EXPORT                        | &quot;NOT_AUTHORIZED_TO_VIEW_EXPORT&quot;                        |

{: class="table table-striped"}

<a name="InnerEnum"></a>

## Enum: InnerEnum

| Name    | Value               |
| ------- | ------------------- |
| SENT    | &quot;Sent&quot;    |
| PENDING | &quot;Pending&quot; |
| FAILED  | &quot;Failed&quot;  |

{: class="table table-striped"}
