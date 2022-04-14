---
title: ConversationMessageContent
---

## ConversationMessageContent

## Properties

| Name               | Type                                                                                                           | Description                                                                                       | Notes      |
| ------------------ | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ---------- |
| **contentType**    | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                                                                 | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |            |
| **location**       | <!----><!---->[**ConversationContentLocation**](ConversationContentLocation.md)<!---->                         | Location content.                                                                                 | [optional] |
| **story**          | <!----><!---->[**ConversationContentStory**](ConversationContentStory.md)<!---->                               | Ephemeral story content.                                                                          | [optional] |
| **attachment**     | <!----><!---->[**ConversationContentAttachment**](ConversationContentAttachment.md)<!---->                     | Attachment content.                                                                               | [optional] |
| **quickReply**     | <!----><!---->[**ConversationContentQuickReply**](ConversationContentQuickReply.md)<!---->                     | Quick reply content.                                                                              | [optional] |
| **template**       | <!----><!---->[**ConversationContentNotificationTemplate**](ConversationContentNotificationTemplate.md)<!----> | Template notification content.                                                                    | [optional] |
| **buttonResponse** | <!----><!---->[**ConversationContentButtonResponse**](ConversationContentButtonResponse.md)<!---->             | Button response content.                                                                          | [optional] |
| **generic**        | <!----><!---->[**ConversationContentGeneric**](ConversationContentGeneric.md)<!---->                           | Generic Template Object                                                                           | [optional] |

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
