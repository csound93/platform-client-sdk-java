---
title: WfmBuScheduleRunTopicBuScheduleRun
---

## WfmBuScheduleRunTopicBuScheduleRun

## Properties

| Name                        | Type                                                                                                                                             | Description | Notes      |
| --------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **percentComplete**         | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                                                                                             |             | [optional] |
| **intradayRescheduling**    | <!----><!---->**Boolean**<!---->                                                                                                                 |             | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                                                                                               |             | [optional] |
| **weekCount**               | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **schedule**                | <!----><!---->[**WfmBuScheduleRunTopicBuScheduleReference**](WfmBuScheduleRunTopicBuScheduleReference.md)<!---->                                 |             | [optional] |
| **schedulingCanceledBy**    | <!----><!---->[**WfmBuScheduleRunTopicUserReference**](WfmBuScheduleRunTopicUserReference.md)<!---->                                             |             | [optional] |
| **schedulingCompletedTime** | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **messageCount**            | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **messageSeverityCounts**   | <!----><!---->[**List&lt;WfmBuScheduleRunTopicSchedulerMessageSeverityCount&gt;**](WfmBuScheduleRunTopicSchedulerMessageSeverityCount.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE               | &quot;None&quot;               |
| QUEUED             | &quot;Queued&quot;             |
| SCHEDULING         | &quot;Scheduling&quot;         |
| CANCELED           | &quot;Canceled&quot;           |
| FAILED             | &quot;Failed&quot;             |
| COMPLETE           | &quot;Complete&quot;           |

{: class="table table-striped"}
