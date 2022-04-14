---
title: LearningAssignmentTopicLearningAssignmentNotification
---

## LearningAssignmentTopicLearningAssignmentNotification

## Properties

| Name                             | Type                                                                                                                         | Description | Notes      |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                           | <!----><!---->**String**<!---->                                                                                              |             | [optional] |
| **user**                         | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.md)<!---->                     |             | [optional] |
| **module**                       | <!----><!---->[**LearningAssignmentTopicLearningModuleReference**](LearningAssignmentTopicLearningModuleReference.md)<!----> |             | [optional] |
| **version**                      | <!----><!---->**Integer**<!---->                                                                                             |             | [optional] |
| **state**                        | [**StateEnum**](#StateEnum)<!---->                                                                                           |             | [optional] |
| **dateRecommendedForCompletion** | <!----><!---->[**Date**](Date.md)<!---->                                                                                     |             | [optional] |
| **createdBy**                    | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.md)<!---->                     |             | [optional] |
| **dateCreated**                  | <!----><!---->[**Date**](Date.md)<!---->                                                                                     |             | [optional] |
| **modifiedBy**                   | <!----><!---->[**LearningAssignmentTopicUserReference**](LearningAssignmentTopicUserReference.md)<!---->                     |             | [optional] |
| **dateModified**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                     |             | [optional] |
| **isOverdue**                    | <!----><!---->**Boolean**<!---->                                                                                             |             | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASSIGNED           | &quot;Assigned&quot;           |
| INPROGRESS         | &quot;InProgress&quot;         |
| COMPLETED          | &quot;Completed&quot;          |
| DELETED            | &quot;Deleted&quot;            |
| NOTCOMPLETED       | &quot;NotCompleted&quot;       |

{: class="table table-striped"}
