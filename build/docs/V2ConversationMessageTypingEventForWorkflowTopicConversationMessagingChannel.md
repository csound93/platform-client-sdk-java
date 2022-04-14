---
title: V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel
---

## V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannel

## Properties

| Name          | Type                                                                                                                                                                                                     | Description | Notes      |
| ------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**        | <!----><!---->**String**<!---->                                                                                                                                                                          |             | [optional] |
| **platform**  | [**PlatformEnum**](#PlatformEnum)<!---->                                                                                                                                                                 |             | [optional] |
| **messageId** | <!----><!---->**String**<!---->                                                                                                                                                                          |             | [optional] |
| **to**        | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingToRecipient**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingToRecipient.md)<!---->         |             | [optional] |
| **from**      | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingFromRecipient**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingFromRecipient.md)<!---->     |             | [optional] |
| **time**      | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                                                                 |             | [optional] |
| **metadata**  | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannelMetadata**](V2ConversationMessageTypingEventForWorkflowTopicConversationMessagingChannelMetadata.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="PlatformEnum"></a>

## Enum: PlatformEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TWITTER            | &quot;Twitter&quot;            |
| FACEBOOK           | &quot;Facebook&quot;           |
| INSTAGRAM          | &quot;Instagram&quot;          |
| LINE               | &quot;Line&quot;               |
| WHATSAPP           | &quot;Whatsapp&quot;           |
| WEBMESSAGING       | &quot;WebMessaging&quot;       |
| OPEN               | &quot;Open&quot;               |
| SMS                | &quot;Sms&quot;                |

{: class="table table-striped"}
