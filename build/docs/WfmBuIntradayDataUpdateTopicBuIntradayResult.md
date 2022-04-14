---
title: WfmBuIntradayDataUpdateTopicBuIntradayResult
---

## WfmBuIntradayDataUpdateTopicBuIntradayResult

## Properties

| Name                      | Type                                                                                                                                             | Description | Notes      |
| ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **startDate**             | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **endDate**               | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **intervalLengthMinutes** | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **intradayDataGroupings** | <!----><!---->[**List&lt;WfmBuIntradayDataUpdateTopicBuIntradayDataGroup&gt;**](WfmBuIntradayDataUpdateTopicBuIntradayDataGroup.md)<!---->       |             | [optional] |
| **categories**            | <!---->[**List&lt;CategoriesEnum&gt;**](#CategoriesEnum)<!---->                                                                                  |             | [optional] |
| **noDataReason**          | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **schedule**              | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuScheduleReference**](WfmBuIntradayDataUpdateTopicBuScheduleReference.md)<!---->                   |             | [optional] |
| **shortTermForecast**     | <!----><!---->[**WfmBuIntradayDataUpdateTopicBuShortTermForecastReference**](WfmBuIntradayDataUpdateTopicBuShortTermForecastReference.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="CategoriesEnum"></a>

## Enum: CategoriesEnum

| Name                      | Value                                 |
| ------------------------- | ------------------------------------- |
| FORECASTDATA              | &quot;ForecastData&quot;              |
| SCHEDULEDATA              | &quot;ScheduleData&quot;              |
| PERFORMANCEPREDICTIONDATA | &quot;PerformancePredictionData&quot; |

{: class="table table-striped"}
