---
title: WfmIntradayDataUpdateTopicIntradayDataGroup
---

## WfmIntradayDataUpdateTopicIntradayDataGroup

## Properties

| Name                                          | Type                                                                                                                                                                         | Description | Notes      |
| --------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **mediaType**                                 | [**MediaTypeEnum**](#MediaTypeEnum)<!---->                                                                                                                                   |             | [optional] |
| **forecastDataPerInterval**                   | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayForecastData&gt;**](WfmIntradayDataUpdateTopicIntradayForecastData.md)<!---->                                     |             | [optional] |
| **scheduleDataPerInterval**                   | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayScheduleData&gt;**](WfmIntradayDataUpdateTopicIntradayScheduleData.md)<!---->                                     |             | [optional] |
| **historicalAgentDataPerInterval**            | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalAgentData.md)<!---->                       |             | [optional] |
| **historicalQueueDataPerInterval**            | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayHistoricalQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayHistoricalQueueData.md)<!---->                       |             | [optional] |
| **performancePredictionAgentDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData.md)<!----> |             | [optional] |
| **performancePredictionQueueDataPerInterval** | <!----><!---->[**List&lt;WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData&gt;**](WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE              | &quot;Voice&quot;              |
| CHAT               | &quot;Chat&quot;               |
| EMAIL              | &quot;Email&quot;              |
| CALLBACK           | &quot;Callback&quot;           |
| MESSAGE            | &quot;Message&quot;            |

{: class="table table-striped"}
