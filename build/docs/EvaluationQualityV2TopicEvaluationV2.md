---
title: EvaluationQualityV2TopicEvaluationV2
---

## EvaluationQualityV2TopicEvaluationV2

## Properties

| Name                 | Type                                                                                                                     | Description | Notes      |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**               | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **conversationId**   | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **agent**            | <!----><!---->[**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser.md)<!---->                                 |             | [optional] |
| **evaluator**        | <!----><!---->[**EvaluationQualityV2TopicUser**](EvaluationQualityV2TopicUser.md)<!---->                                 |             | [optional] |
| **eventTime**        | <!----><!---->[**Date**](Date.md)<!---->                                                                                 |             | [optional] |
| **evaluationFormId** | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **formName**         | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **scoringSet**       | <!----><!---->[**EvaluationQualityV2TopicEvaluationScoringSet**](EvaluationQualityV2TopicEvaluationScoringSet.md)<!----> |             | [optional] |
| **contextId**        | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **status**           | [**StatusEnum**](#StatusEnum)<!---->                                                                                     |             | [optional] |
| **agentHasRead**     | <!----><!---->**Boolean**<!---->                                                                                         |             | [optional] |
| **releaseDate**      | <!----><!---->[**Date**](Date.md)<!---->                                                                                 |             | [optional] |
| **assignedDate**     | <!----><!---->[**Date**](Date.md)<!---->                                                                                 |             | [optional] |
| **changedDate**      | <!----><!---->[**Date**](Date.md)<!---->                                                                                 |             | [optional] |
| **eventType**        | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **resourceId**       | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **resourceType**     | <!----><!---->**String**<!---->                                                                                          |             | [optional] |
| **divisionIds**      | <!----><!---->**List&lt;String&gt;**<!---->                                                                              |             | [optional] |
| **rescore**          | <!----><!---->**Boolean**<!---->                                                                                         |             | [optional] |
| **conversationDate** | <!----><!---->[**Date**](Date.md)<!---->                                                                                 |             | [optional] |
| **mediaType**        | <!----><!---->**List&lt;String&gt;**<!---->                                                                              |             | [optional] |
| **calibration**      | <!----><!---->[**EvaluationQualityV2TopicCalibration**](EvaluationQualityV2TopicCalibration.md)<!---->                   |             | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING            | &quot;Pending&quot;            |
| INPROGRESS         | &quot;InProgress&quot;         |
| FINISHED           | &quot;Finished&quot;           |

{: class="table table-striped"}
