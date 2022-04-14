---
title: ConversationMessageEventTopicMessageDetails
---

## ConversationMessageEventTopicMessageDetails

## Properties

| Name                    | Type                                                                                                                               | Description | Notes      |
| ----------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **message**             | <!----><!---->[**ConversationMessageEventTopicUriReference**](ConversationMessageEventTopicUriReference.md)<!---->                 |             | [optional] |
| **messageTime**         | <!----><!---->[**Date**](Date.md)<!---->                                                                                           |             | [optional] |
| **messageSegmentCount** | <!----><!---->**Integer**<!---->                                                                                                   |             | [optional] |
| **messageStatus**       | [**MessageStatusEnum**](#MessageStatusEnum)<!---->                                                                                 |             | [optional] |
| **media**               | <!----><!---->[**List&lt;ConversationMessageEventTopicMessageMedia&gt;**](ConversationMessageEventTopicMessageMedia.md)<!---->     |             | [optional] |
| **stickers**            | <!----><!---->[**List&lt;ConversationMessageEventTopicMessageSticker&gt;**](ConversationMessageEventTopicMessageSticker.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="MessageStatusEnum"></a>

## Enum: MessageStatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUED             | &quot;queued&quot;             |
| SENT               | &quot;sent&quot;               |
| FAILED             | &quot;failed&quot;             |
| RECEIVED           | &quot;received&quot;           |
| DELIVERY_SUCCESS   | &quot;delivery-success&quot;   |
| DELIVERY_FAILED    | &quot;delivery-failed&quot;    |
| READ               | &quot;read&quot;               |

{: class="table table-striped"}
