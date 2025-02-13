---
title: V2ConversationMessageTypingEventForWorkflowTopicConversationNormalizedMessage
---

## V2ConversationMessageTypingEventForWorkflowTopicConversationNormalizedMessage

## Properties

| Name                  | Type                                                                                                                                                                                             | Description | Notes      |
| --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                | <!----><!---->**String**<!---->                                                                                                                                                                  |             | [optional] |
| **channel**           | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel.md)<!---->         |             | [optional] |
| **type**              | [**TypeEnum**](#TypeEnum)<!---->                                                                                                                                                                 |             | [optional] |
| **text**              | <!----><!---->**String**<!---->                                                                                                                                                                  |             | [optional] |
| **content**           | <!----><!---->[**List&lt;V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent&gt;**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent.md)<!----> |             | [optional] |
| **events**            | <!----><!---->[**List&lt;V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent&gt;**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent.md)<!---->     |             | [optional] |
| **status**            | [**StatusEnum**](#StatusEnum)<!---->                                                                                                                                                             |             | [optional] |
| **reasons**           | <!----><!---->[**List&lt;V2ConversationMessageTypingEventForWorkflowTopicConversationReason&gt;**](V2ConversationMessageTypingEventForWorkflowTopicConversationReason.md)<!---->                 |             | [optional] |
| **originatingEntity** | [**OriginatingEntityEnum**](#OriginatingEntityEnum)<!---->                                                                                                                                       |             | [optional] |
| **isFinalReceipt**    | <!----><!---->**Boolean**<!---->                                                                                                                                                                 |             | [optional] |
| **direction**         | [**DirectionEnum**](#DirectionEnum)<!---->                                                                                                                                                       |             | [optional] |
| **metadata**          | <!----><!---->**Map&lt;String, String&gt;**<!---->                                                                                                                                               |             | [optional] |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TEXT               | &quot;Text&quot;               |
| STRUCTURED         | &quot;Structured&quot;         |
| RECEIPT            | &quot;Receipt&quot;            |
| EVENT              | &quot;Event&quot;              |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SENT               | &quot;Sent&quot;               |
| DELIVERED          | &quot;Delivered&quot;          |
| READ               | &quot;Read&quot;               |
| FAILED             | &quot;Failed&quot;             |
| PUBLISHED          | &quot;Published&quot;          |
| REMOVED            | &quot;Removed&quot;            |

{: class="table table-striped"}

<a name="OriginatingEntityEnum"></a>

## Enum: OriginatingEntityEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| HUMAN              | &quot;Human&quot;              |
| BOT                | &quot;Bot&quot;                |

{: class="table table-striped"}

<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND            | &quot;Inbound&quot;            |
| OUTBOUND           | &quot;Outbound&quot;           |

{: class="table table-striped"}
