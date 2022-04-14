---
title: EmailConfig
---

## EmailConfig

## Properties

| Name                | Type                                                                   | Description                                                               | Notes      |
| ------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------- | ---------- |
| **emailColumns**    | <!----><!---->**List&lt;String&gt;**<!---->                            | The contact list columns specifying the email address(es) of the contact. |            |
| **contentTemplate** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->         | The content template used to formulate the email to send to the contact.  | [optional] |
| **fromAddress**     | <!----><!---->[**FromEmailAddress**](FromEmailAddress.md)<!---->       | The email address that will be used as the sender of the email.           |            |
| **replyToAddress**  | <!----><!---->[**ReplyToEmailAddress**](ReplyToEmailAddress.md)<!----> | The email address from which any reply will be sent.                      | [optional] |

{: class="table table-striped"}
