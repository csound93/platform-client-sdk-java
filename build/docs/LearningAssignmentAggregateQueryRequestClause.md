---
title: LearningAssignmentAggregateQueryRequestClause
---

## LearningAssignmentAggregateQueryRequestClause

## Properties

| Name           | Type                                                                                                                                         | Description                                    | Notes |
| -------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- | ----- |
| **type**       | [**TypeEnum**](#TypeEnum)<!---->                                                                                                             | The logic used to combine the predicates       |       |
| **predicates** | <!----><!---->[**List&lt;LearningAssignmentAggregateQueryRequestPredicate&gt;**](LearningAssignmentAggregateQueryRequestPredicate.md)<!----> | The list of predicates used to filter the data |       |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND                | &quot;And&quot;                |
| OR                 | &quot;Or&quot;                 |

{: class="table table-striped"}
