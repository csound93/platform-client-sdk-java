---
title: MessageMediaPolicyConditions
---

## MessageMediaPolicyConditions

## Properties

| Name                      | Type                                                               | Description | Notes      |
| ------------------------- | ------------------------------------------------------------------ | ----------- | ---------- |
| **forUsers**              | <!----><!---->[**List&lt;User&gt;**](User.md)<!---->               |             | [optional] |
| **dateRanges**            | <!----><!---->**List&lt;String&gt;**<!---->                        |             | [optional] |
| **forQueues**             | <!----><!---->[**List&lt;Queue&gt;**](Queue.md)<!---->             |             | [optional] |
| **wrapupCodes**           | <!----><!---->[**List&lt;WrapupCode&gt;**](WrapupCode.md)<!---->   |             | [optional] |
| **languages**             | <!----><!---->[**List&lt;Language&gt;**](Language.md)<!---->       |             | [optional] |
| **timeAllowed**           | <!----><!---->[**TimeAllowed**](TimeAllowed.md)<!---->             |             | [optional] |
| **customerParticipation** | [**CustomerParticipationEnum**](#CustomerParticipationEnum)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="CustomerParticipationEnum"></a>

## Enum: CustomerParticipationEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| YES                | &quot;YES&quot;                |
| NO                 | &quot;NO&quot;                 |

{: class="table table-striped"}
