---
title: QualityAuditQueryExecutionResultsResponse
---

## QualityAuditQueryExecutionResultsResponse

## Properties

| Name         | Type                                                                                     | Description                                              | Notes      |
| ------------ | ---------------------------------------------------------------------------------------- | -------------------------------------------------------- | ---------- |
| **id**       | <!----><!---->**String**<!---->                                                          | Id of the audit query execution request.                 | [optional] |
| **pageSize** | <!----><!---->**Integer**<!---->                                                         | Number of results in a page.                             | [optional] |
| **cursor**   | <!----><!---->**String**<!---->                                                          | Optional cursor to indicate where to resume the results. | [optional] |
| **entities** | <!----><!---->[**List&lt;QualityAuditLogMessage&gt;**](QualityAuditLogMessage.md)<!----> | List of audit messages.                                  | [optional] |

{: class="table table-striped"}
