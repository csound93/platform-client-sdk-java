---
title: AnalyticsConversationAsyncQueryResponse
---

## AnalyticsConversationAsyncQueryResponse

## Properties

| Name                     | Type                                                                                   | Description                                                                                                                          | Notes      |
| ------------------------ | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **cursor**               | <!----><!---->**String**<!---->                                                        | Optional cursor to indicate where to resume the results                                                                              | [optional] |
| **dataAvailabilityDate** | <!----><!---->[**Date**](Date.md)<!---->                                               | Data available up to at least this datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **conversations**        | <!----><!---->[**List&lt;AnalyticsConversation&gt;**](AnalyticsConversation.md)<!----> |                                                                                                                                      | [optional] |

{: class="table table-striped"}
