---
title: TranscriptAggregationView
---

## TranscriptAggregationView

## Properties

| Name         | Type                                                             | Description                                                                               | Notes      |
| ------------ | ---------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ---------- |
| **target**   | [**TargetEnum**](#TargetEnum)<!---->                             | Target metric name                                                                        |            |
| **name**     | <!----><!---->**String**<!---->                                  | A unique name for this view. Must be distinct from other views and built-in metric names. |            |
| **function** | [**FunctionEnum**](#FunctionEnum)<!---->                         | Type of view you wish to create                                                           |            |
| **range**    | <!----><!---->[**AggregationRange**](AggregationRange.md)<!----> | Range of numbers for slicing up data                                                      | [optional] |

{: class="table table-striped"}

<a name="TargetEnum"></a>

## Enum: TargetEnum

| Name                 | Value                            |
| -------------------- | -------------------------------- |
| OUTDATEDSDKVERSION   | &quot;OutdatedSdkVersion&quot;   |
| NTOPICCOMMUNICATIONS | &quot;nTopicCommunications&quot; |
| OCUSTOMERSENTIMENT   | &quot;oCustomerSentiment&quot;   |
| OSENTIMENTSCORE      | &quot;oSentimentScore&quot;      |

{: class="table table-striped"}

<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RANGEBOUND         | &quot;rangeBound&quot;         |

{: class="table table-striped"}
