---
title: BuIntradayDataGroup
---

## BuIntradayDataGroup

## Properties

| Name                                     | Type                                                                                                           | Description                                                  | Notes      |
| ---------------------------------------- | -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------ | ---------- |
| **mediaType**                            | [**MediaTypeEnum**](#MediaTypeEnum)<!---->                                                                     | The media type associated with this intraday group           | [optional] |
| **forecastDataSummary**                  | <!----><!---->[**BuIntradayForecastData**](BuIntradayForecastData.md)<!---->                                   | Forecast data summary for this date range                    | [optional] |
| **forecastDataPerInterval**              | <!----><!---->[**List&lt;BuIntradayForecastData&gt;**](BuIntradayForecastData.md)<!---->                       | Forecast data per interval for this date range               | [optional] |
| **scheduleDataSummary**                  | <!----><!---->[**BuIntradayScheduleData**](BuIntradayScheduleData.md)<!---->                                   | Schedule data summary for this date range                    | [optional] |
| **scheduleDataPerInterval**              | <!----><!---->[**List&lt;BuIntradayScheduleData&gt;**](BuIntradayScheduleData.md)<!---->                       | Schedule data per interval for this date range               | [optional] |
| **performancePredictionDataSummary**     | <!----><!---->[**IntradayPerformancePredictionData**](IntradayPerformancePredictionData.md)<!---->             | Performance prediction data summary for this date range      | [optional] |
| **performancePredictionDataPerInterval** | <!----><!---->[**List&lt;IntradayPerformancePredictionData&gt;**](IntradayPerformancePredictionData.md)<!----> | Performance prediction data per interval for this date range | [optional] |

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
