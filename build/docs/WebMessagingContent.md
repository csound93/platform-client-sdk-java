---
title: WebMessagingContent
---

## WebMessagingContent

## Properties

| Name               | Type                                                                                 | Description                                                                                       | Notes      |
| ------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------- | ---------- |
| **contentType**    | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                                       | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. | [optional] |
| **attachment**     | <!----><!---->[**WebMessagingAttachment**](WebMessagingAttachment.md)<!---->         | Attachment content.                                                                               | [optional] |
| **quickReply**     | <!----><!---->[**WebMessagingQuickReply**](WebMessagingQuickReply.md)<!---->         | Quick reply content.                                                                              | [optional] |
| **buttonResponse** | <!----><!---->[**WebMessagingButtonResponse**](WebMessagingButtonResponse.md)<!----> | Button response content.                                                                          | [optional] |
| **generic**        | <!----><!---->[**WebMessagingGeneric**](WebMessagingGeneric.md)<!---->               | Generic content.                                                                                  | [optional] |

{: class="table table-striped"}

<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT         | &quot;Attachment&quot;         |
| QUICKREPLY         | &quot;QuickReply&quot;         |
| BUTTONRESPONSE     | &quot;ButtonResponse&quot;     |
| GENERICTEMPLATE    | &quot;GenericTemplate&quot;    |

{: class="table table-striped"}
