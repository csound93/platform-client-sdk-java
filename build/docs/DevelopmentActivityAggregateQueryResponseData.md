---
title: DevelopmentActivityAggregateQueryResponseData
---

## DevelopmentActivityAggregateQueryResponseData

## Properties

| Name         | Type                                                                                                                                       | Description                                                                                                                                                                                                         | Notes      |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **interval** | <!----><!---->**String**<!---->                                                                                                            | Specifies the range of due dates to be used for filtering. A maximum of 1 year can be specified in the range. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] |
| **metrics**  | <!----><!---->[**List&lt;DevelopmentActivityAggregateQueryResponseMetric&gt;**](DevelopmentActivityAggregateQueryResponseMetric.md)<!----> | The list of aggregated metrics                                                                                                                                                                                      | [optional] |

{: class="table table-striped"}
