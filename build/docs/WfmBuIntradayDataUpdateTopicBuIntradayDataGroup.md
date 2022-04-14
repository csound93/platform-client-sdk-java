---
title: WfmBuIntradayDataUpdateTopicBuIntradayDataGroup
---

## WfmBuIntradayDataUpdateTopicBuIntradayDataGroup

## Properties

| Name                                     | Type                                                                                                                                                                   | Description | Notes      |
| ---------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **mediaType**                            | [**MediaTypeEnum**](#MediaTypeEnum)<!---->                                                                                                                             |             | [optional] |
| **forecastDataSummary**                  | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuIntradayForecastData**](WfmBuIntradayDataUpdateTopicBuIntradayForecastData.md)<!---->                                   |             | [optional] |
| **forecastDataPerInterval**              | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayForecastData&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayForecastData.md)<!---->                       |             | [optional] |
| **scheduleDataSummary**                  | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuIntradayScheduleData**](WfmBuIntradayDataUpdateTopicBuIntradayScheduleData.md)<!---->                                   |             | [optional] |
| **scheduleDataPerInterval**              | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayScheduleData&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayScheduleData.md)<!---->                       |             | [optional] |
| **performancePredictionDataSummary**     | <!----><!---->[**WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData**](WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.md)<!---->             |             | [optional] |
| **performancePredictionDataPerInterval** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData&gt;**](WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData.md)<!----> |             | [optional] |

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
