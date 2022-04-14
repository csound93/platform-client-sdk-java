---
title: QMAuditQueryRequest
---

## QMAuditQueryRequest

## Properties

| Name         | Type                                                                                       | Description                                                                                                                                 | Notes      |
| ------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **interval** | <!----><!---->**String**<!---->                                                            | Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |            |
| **filters**  | <!----><!---->[**List&lt;QualityAuditQueryFilter&gt;**](QualityAuditQueryFilter.md)<!----> | List of filters for the query.                                                                                                              |            |
| **sort**     | <!----><!---->[**List&lt;AuditQuerySort&gt;**](AuditQuerySort.md)<!---->                   | Sort parameter for the query.                                                                                                               | [optional] |

{: class="table table-striped"}
