---
title: ConversationEventTopicMessageDetails
---

## ConversationEventTopicMessageDetails

## Properties

| Name                    | Type                                                                                                                 | Description                                                                                                                                      | Notes      |
| ----------------------- | -------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **messageId**           | <!----><!---->**String**<!---->                                                                                      | UUID identifying the message media.                                                                                                              | [optional] |
| **messageTime**         | <!----><!---->[**Date**](Date.md)<!---->                                                                             | The time when the message was sent or received.                                                                                                  | [optional] |
| **messageStatus**       | [**MessageStatusEnum**](#MessageStatusEnum)<!---->                                                                   | Indicates the delivery status of the message.                                                                                                    | [optional] |
| **messageSegmentCount** | <!----><!---->**Integer**<!---->                                                                                     | The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits. | [optional] |
| **media**               | <!----><!---->[**List&lt;ConversationEventTopicMessageMedia&gt;**](ConversationEventTopicMessageMedia.md)<!---->     | The media (images, files, etc) associated with this message, if any                                                                              | [optional] |
| **stickers**            | <!----><!---->[**List&lt;ConversationEventTopicMessageSticker&gt;**](ConversationEventTopicMessageSticker.md)<!----> | A list of stickers included in the message                                                                                                       | [optional] |

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
