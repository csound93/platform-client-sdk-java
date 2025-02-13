---
title: TranscriptAggregateQueryFilter
---

## TranscriptAggregateQueryFilter

## Properties

| Name           | Type                                                                                                           | Description                                                             | Notes      |
| -------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | ---------- |
| **type**       | [**TypeEnum**](#TypeEnum)<!---->                                                                               | Boolean operation to apply to the provided predicates and clauses       |            |
| **clauses**    | <!----><!---->[**List&lt;TranscriptAggregateQueryClause&gt;**](TranscriptAggregateQueryClause.md)<!---->       | Boolean &#39;and/or&#39; logic with up to two-levels of nesting         | [optional] |
| **predicates** | <!----><!---->[**List&lt;TranscriptAggregateQueryPredicate&gt;**](TranscriptAggregateQueryPredicate.md)<!----> | Like a three-word sentence: (attribute-name) (operator) (target-value). | [optional] |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND                | &quot;and&quot;                |
| OR                 | &quot;or&quot;                 |

{: class="table table-striped"}
