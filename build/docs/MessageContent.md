---
title: MessageContent
---

## MessageContent

## Properties

| Name               | Type                                                                                   | Description                                                                                       | Notes      |
| ------------------ | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ---------- |
| **contentType**    | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                                         | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |            |
| **location**       | <!----><!---->[**ContentLocation**](ContentLocation.md)<!---->                         | Location content.                                                                                 | [optional] |
| **attachment**     | <!----><!---->[**ContentAttachment**](ContentAttachment.md)<!---->                     | Attachment content.                                                                               | [optional] |
| **quickReply**     | <!----><!---->[**ContentQuickReply**](ContentQuickReply.md)<!---->                     | Quick reply content.                                                                              | [optional] |
| **buttonResponse** | <!----><!---->[**ContentButtonResponse**](ContentButtonResponse.md)<!---->             | Button response content.                                                                          | [optional] |
| **generic**        | <!----><!---->[**ContentGeneric**](ContentGeneric.md)<!---->                           | Generic content.                                                                                  | [optional] |
| **list**           | <!----><!---->[**ContentList**](ContentList.md)<!---->                                 | List content.                                                                                     | [optional] |
| **template**       | <!----><!---->[**ContentNotificationTemplate**](ContentNotificationTemplate.md)<!----> | Template notification content.                                                                    | [optional] |
| **reactions**      | <!----><!---->[**List&lt;ContentReaction&gt;**](ContentReaction.md)<!---->             | A set of reactions to a message.                                                                  | [optional] |
| **mention**        | <!----><!---->[**MessagingRecipient**](MessagingRecipient.md)<!---->                   | Mention content.                                                                                  | [optional] |
| **postback**       | <!----><!---->[**ContentPostback**](ContentPostback.md)<!---->                         | Structured message postback (Deprecated).                                                         | [optional] |

{: class="table table-striped"}

<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT         | &quot;Attachment&quot;         |
| LOCATION           | &quot;Location&quot;           |
| QUICKREPLY         | &quot;QuickReply&quot;         |
| NOTIFICATION       | &quot;Notification&quot;       |
| GENERICTEMPLATE    | &quot;GenericTemplate&quot;    |
| LISTTEMPLATE       | &quot;ListTemplate&quot;       |
| POSTBACK           | &quot;Postback&quot;           |
| REACTIONS          | &quot;Reactions&quot;          |
| MENTION            | &quot;Mention&quot;            |
| BUTTONRESPONSE     | &quot;ButtonResponse&quot;     |

{: class="table table-striped"}
