---
title: PresenceDetailQueryClause
---

## PresenceDetailQueryClause

## Properties

| Name           | Type                                                                                                 | Description                                                             | Notes |
| -------------- | ---------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----- |
| **type**       | [**TypeEnum**](#TypeEnum)<!---->                                                                     | Boolean operation to apply to the provided predicates                   |       |
| **predicates** | <!----><!---->[**List&lt;PresenceDetailQueryPredicate&gt;**](PresenceDetailQueryPredicate.md)<!----> | Like a three-word sentence: (attribute-name) (operator) (target-value). |       |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND                | &quot;and&quot;                |
| OR                 | &quot;or&quot;                 |

{: class="table table-striped"}
