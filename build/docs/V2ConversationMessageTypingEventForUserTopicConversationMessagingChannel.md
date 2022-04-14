---
title: V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel
---

## V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel

## Properties

| Name          | Type                                                                                                                                                                                             | Description | Notes      |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**        | <!----><!---->**String**<!---->                                                                                                                                                                  |             | [optional] |
| **platform**  | [**PlatformEnum**](#PlatformEnum)<!---->                                                                                                                                                         |             | [optional] |
| **messageId** | <!----><!---->**String**<!---->                                                                                                                                                                  |             | [optional] |
| **to**        | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient**](V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient.md)<!---->         |             | [optional] |
| **from**      | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient**](V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.md)<!---->     |             | [optional] |
| **time**      | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                                                         |             | [optional] |
| **metadata**  | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata**](V2ConversationMessageTypingEventForUserTopicConversationMessagingChannelMetadata.md)<!----> |             | [optional] |

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
