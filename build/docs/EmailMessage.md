---
title: EmailMessage
---

## EmailMessage

## Properties

| Name                | Type                                                                 | Description                                                                                                                             | Notes      |
| ------------------- | -------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**              | <!----><!---->**String**<!---->                                      | The globally unique identifier for the object.                                                                                          | [optional] |
| **name**            | <!----><!---->**String**<!---->                                      |                                                                                                                                         | [optional] |
| **to**              | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.md)<!----> | The recipients of the email message.                                                                                                    |            |
| **cc**              | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.md)<!----> | The recipients that were copied on the email message.                                                                                   | [optional] |
| **bcc**             | <!----><!---->[**List&lt;EmailAddress&gt;**](EmailAddress.md)<!----> | The recipients that were blind copied on the email message.                                                                             | [optional] |
| **from**            | <!----><!---->[**EmailAddress**](EmailAddress.md)<!---->             | The sender of the email message.                                                                                                        |            |
| **replyTo**         | <!----><!---->[**EmailAddress**](EmailAddress.md)<!---->             | The receiver of the reply email message.                                                                                                | [optional] |
| **subject**         | <!----><!---->**String**<!---->                                      | The subject of the email message.                                                                                                       | [optional] |
| **attachments**     | <!----><!---->[**List&lt;Attachment&gt;**](Attachment.md)<!---->     | The attachments of the email message.                                                                                                   | [optional] |
| **textBody**        | <!----><!---->**String**<!---->                                      | The text body of the email message.                                                                                                     |            |
| **htmlBody**        | <!----><!---->**String**<!---->                                      | The html body of the email message.                                                                                                     | [optional] |
| **time**            | <!----><!---->[**Date**](Date.md)<!---->                             | The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **historyIncluded** | <!----><!---->**Boolean**<!---->                                     | Indicates whether the history of previous emails of the conversation is included within the email bodies of this message.               | [optional] |
| **selfUri**         | <!----><!---->**String**<!---->                                      | The URI for this object                                                                                                                 | [optional] |

{: class="table table-striped"}
