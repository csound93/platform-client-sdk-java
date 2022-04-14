---
title: DialerCampaignProgressEventCampaignProgress
---

## DialerCampaignProgressEventCampaignProgress

## Properties

| Name                         | Type                                                                                                           | Description                                           | Notes      |
| ---------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------- | ---------- |
| **campaign**                 | <!----><!---->[**DialerCampaignProgressEventUriReference**](DialerCampaignProgressEventUriReference.md)<!----> |                                                       | [optional] |
| **numberOfContactsCalled**   | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                                                           | The number of contacts that have been called so far   | [optional] |
| **numberOfContactsMessaged** | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                                                           | The number of contacts that have been messaged so far | [optional] |
| **totalNumberOfContacts**    | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                                                           | The total number of contacts in the contact list      | [optional] |
| **percentage**               | <!----><!---->**Integer**<!---->                                                                               | numberOfContactsContacted/totalNumberOfContacts\*100  | [optional] |

{: class="table table-striped"}
