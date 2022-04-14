---
title: V2ConversationMessageTypingEventForUserTopicConversationMessageContent
---

## V2ConversationMessageTypingEventForUserTopicConversationMessageContent

## Properties

| Name               | Type                                                                                                                                                                                                   | Description | Notes      |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **contentType**    | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                                                                                                                                                         |             | [optional] |
| **location**       | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentLocation**](V2ConversationMessageTypingEventForUserTopicConversationContentLocation.md)<!---->                         |             | [optional] |
| **story**          | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentStory**](V2ConversationMessageTypingEventForUserTopicConversationContentStory.md)<!---->                               |             | [optional] |
| **attachment**     | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentAttachment**](V2ConversationMessageTypingEventForUserTopicConversationContentAttachment.md)<!---->                     |             | [optional] |
| **quickReply**     | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply**](V2ConversationMessageTypingEventForUserTopicConversationContentQuickReply.md)<!---->                     |             | [optional] |
| **template**       | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate**](V2ConversationMessageTypingEventForUserTopicConversationContentNotificationTemplate.md)<!----> |             | [optional] |
| **buttonResponse** | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse**](V2ConversationMessageTypingEventForUserTopicConversationContentButtonResponse.md)<!---->             |             | [optional] |
| **generic**        | <!----><!---->[**V2ConversationMessageTypingEventForUserTopicConversationContentGeneric**](V2ConversationMessageTypingEventForUserTopicConversationContentGeneric.md)<!---->                           |             | [optional] |

{: class="table table-striped"}

<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT         | &quot;Attachment&quot;         |
| LOCATION           | &quot;Location&quot;           |
| STORY              | &quot;Story&quot;              |
| QUICKREPLY         | &quot;QuickReply&quot;         |
| NOTIFICATION       | &quot;Notification&quot;       |
| BUTTONRESPONSE     | &quot;ButtonResponse&quot;     |
| GENERICTEMPLATE    | &quot;GenericTemplate&quot;    |

{: class="table table-striped"}
