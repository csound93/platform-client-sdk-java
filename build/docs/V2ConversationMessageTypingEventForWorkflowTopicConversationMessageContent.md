---
title: V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent
---

## V2ConversationMessageTypingEventForWorkflowTopicConversationMessageContent

## Properties

| Name               | Type                                                                                                                                                                                                           | Description | Notes      |
| ------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **contentType**    | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                                                                                                                                                                 |             | [optional] |
| **location**       | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentLocation.md)<!---->                         |             | [optional] |
| **story**          | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentStory.md)<!---->                               |             | [optional] |
| **attachment**     | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentAttachment.md)<!---->                     |             | [optional] |
| **quickReply**     | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentQuickReply.md)<!---->                     |             | [optional] |
| **template**       | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentNotificationTemplate.md)<!----> |             | [optional] |
| **buttonResponse** | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentButtonResponse.md)<!---->             |             | [optional] |
| **generic**        | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric**](V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.md)<!---->                           |             | [optional] |

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
