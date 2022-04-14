---
title: RecordingMessagingMessage
---

## RecordingMessagingMessage

## Properties

| Name                          | Type                                                                                         | Description                                                                                                                 | Notes      |
| ----------------------------- | -------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **from**                      | <!----><!---->**String**<!---->                                                              | The message sender session id.                                                                                              | [optional] |
| **fromUser**                  | <!----><!---->[**User**](User.md)<!---->                                                     | The user who sent this message.                                                                                             | [optional] |
| **fromExternalContact**       | <!----><!---->[**ExternalContact**](ExternalContact.md)<!---->                               | The PureCloud external contact sender details.                                                                              | [optional] |
| **to**                        | <!----><!---->**String**<!---->                                                              | The message recipient.                                                                                                      | [optional] |
| **timestamp**                 | <!----><!---->[**Date**](Date.md)<!---->                                                     | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **id**                        | <!----><!---->**String**<!---->                                                              | A globally unique identifier for this communication.                                                                        | [optional] |
| **messageText**               | <!----><!---->**String**<!---->                                                              | The content of this message.                                                                                                | [optional] |
| **messageMediaAttachments**   | <!----><!---->[**List&lt;MessageMediaAttachment&gt;**](MessageMediaAttachment.md)<!---->     | List of media objects attached with this message.                                                                           | [optional] |
| **messageStickerAttachments** | <!----><!---->[**List&lt;MessageStickerAttachment&gt;**](MessageStickerAttachment.md)<!----> | List of message stickers attached with this message.                                                                        | [optional] |
| **quickReplies**              | <!----><!---->[**List&lt;QuickReply&gt;**](QuickReply.md)<!---->                             | List of quick reply options offered with this message.                                                                      | [optional] |
| **buttonResponse**            | <!----><!---->[**ButtonResponse**](ButtonResponse.md)<!---->                                 | Button Response selected by user for this message.                                                                          | [optional] |
| **story**                     | <!----><!---->[**RecordingContentStory**](RecordingContentStory.md)<!---->                   | Ephemeral story content.                                                                                                    | [optional] |

{: class="table table-striped"}
