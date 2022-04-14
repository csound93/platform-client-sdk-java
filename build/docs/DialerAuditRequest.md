---
title: DialerAuditRequest
---

## DialerAuditRequest

## Properties

| Name            | Type                                                               | Description                                        | Notes      |
| --------------- | ------------------------------------------------------------------ | -------------------------------------------------- | ---------- |
| **queryPhrase** | <!----><!---->**String**<!---->                                    | The word or words to search for.                   | [optional] |
| **queryFields** | <!----><!---->**List&lt;String&gt;**<!---->                        | The fields in which to search for the queryPhrase. | [optional] |
| **facets**      | <!----><!---->[**List&lt;AuditFacet&gt;**](AuditFacet.md)<!---->   | The fields to facet on.                            | [optional] |
| **filters**     | <!----><!---->[**List&lt;AuditFilter&gt;**](AuditFilter.md)<!----> | The fields to filter on.                           | [optional] |

{: class="table table-striped"}
