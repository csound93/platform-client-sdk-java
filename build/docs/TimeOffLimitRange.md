---
title: TimeOffLimitRange
---

## TimeOffLimitRange

## Properties

| Name                        | Type                                               | Description                                                                                                                                                                                                 | Notes |
| --------------------------- | -------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **startDate**               | <!----><!---->[**LocalDate**](LocalDate.md)<!----> | Start date of the range. The end date is determined by &#39;granularity&#39; and the size of &#39;limitMinutesPerInterval&#39;. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd        |       |
| **granularity**             | [**GranularityEnum**](#GranularityEnum)<!---->     | Granularity choice for the time off limit                                                                                                                                                                   |       |
| **limitMinutesPerInterval** | <!----><!---->**List&lt;Integer&gt;**<!---->       | The list of time off limit values in minutes per granularity interval. If &#39;null&#39; is specified, then interval specific value is cleared. Such interval will have &#39;defaultLimitMinutes&#39; value |       |

{: class="table table-striped"}

<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DAILY              | &quot;Daily&quot;              |

{: class="table table-striped"}
