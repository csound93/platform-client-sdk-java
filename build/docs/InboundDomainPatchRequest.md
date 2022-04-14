---
title: InboundDomainPatchRequest
---

## InboundDomainPatchRequest

## Properties

| Name                 | Type                                                           | Description                                                                                                                                     | Notes      |
| -------------------- | -------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **mailFromSettings** | <!----><!---->[**MailFromResult**](MailFromResult.md)<!---->   | The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false. | [optional] |
| **customSMTPServer** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> | The custom SMTP server integration to use when sending outbound emails from this domain.                                                        | [optional] |

{: class="table table-striped"}
