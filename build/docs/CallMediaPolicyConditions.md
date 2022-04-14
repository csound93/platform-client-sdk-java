---
title: CallMediaPolicyConditions
---

## CallMediaPolicyConditions

## Properties

| Name            | Type                                                               | Description | Notes      |
| --------------- | ------------------------------------------------------------------ | ----------- | ---------- |
| **forUsers**    | <!----><!---->[**List&lt;User&gt;**](User.md)<!---->               |             | [optional] |
| **dateRanges**  | <!----><!---->**List&lt;String&gt;**<!---->                        |             | [optional] |
| **forQueues**   | <!----><!---->[**List&lt;Queue&gt;**](Queue.md)<!---->             |             | [optional] |
| **wrapupCodes** | <!----><!---->[**List&lt;WrapupCode&gt;**](WrapupCode.md)<!---->   |             | [optional] |
| **languages**   | <!----><!---->[**List&lt;Language&gt;**](Language.md)<!---->       |             | [optional] |
| **timeAllowed** | <!----><!---->[**TimeAllowed**](TimeAllowed.md)<!---->             |             | [optional] |
| **directions**  | <!---->[**List&lt;DirectionsEnum&gt;**](#DirectionsEnum)<!---->    |             | [optional] |
| **duration**    | <!----><!---->[**DurationCondition**](DurationCondition.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="DirectionsEnum"></a>

## Enum: DirectionsEnum

| Name     | Value                |
| -------- | -------------------- |
| INBOUND  | &quot;INBOUND&quot;  |
| OUTBOUND | &quot;OUTBOUND&quot; |

{: class="table table-striped"}
