---
title: PolicyConditions
---

## PolicyConditions

## Properties

| Name            | Type                                                               | Description | Notes      |
| --------------- | ------------------------------------------------------------------ | ----------- | ---------- |
| **forUsers**    | <!----><!---->[**List&lt;User&gt;**](User.md)<!---->               |             | [optional] |
| **directions**  | <!---->[**List&lt;DirectionsEnum&gt;**](#DirectionsEnum)<!---->    |             | [optional] |
| **dateRanges**  | <!----><!---->**List&lt;String&gt;**<!---->                        |             | [optional] |
| **mediaTypes**  | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!---->    |             | [optional] |
| **forQueues**   | <!----><!---->[**List&lt;Queue&gt;**](Queue.md)<!---->             |             | [optional] |
| **duration**    | <!----><!---->[**DurationCondition**](DurationCondition.md)<!----> |             | [optional] |
| **wrapupCodes** | <!----><!---->[**List&lt;WrapupCode&gt;**](WrapupCode.md)<!---->   |             | [optional] |
| **timeAllowed** | <!----><!---->[**TimeAllowed**](TimeAllowed.md)<!---->             |             | [optional] |

{: class="table table-striped"}

<a name="DirectionsEnum"></a>

## Enum: DirectionsEnum

| Name     | Value                |
| -------- | -------------------- |
| INBOUND  | &quot;INBOUND&quot;  |
| OUTBOUND | &quot;OUTBOUND&quot; |

{: class="table table-striped"}

<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value            |
| ---- | ---------------- |
| CALL | &quot;CALL&quot; |
| CHAT | &quot;CHAT&quot; |

{: class="table table-striped"}
