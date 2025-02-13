---
title: BuGenerateScheduleRequest
---

## BuGenerateScheduleRequest

## Properties

| Name                  | Type                                                                                     | Description                                                                                                                              | Notes      |
| --------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **description**       | <!----><!---->**String**<!---->                                                          | The description for the schedule                                                                                                         |            |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.md)<!----> | The forecast to use when generating the schedule. Note that the forecast must fully encompass the schedule&#39;s start week + week count | [optional] |
| **weekCount**         | <!----><!---->**Integer**<!---->                                                         | The number of weeks in the schedule. One extra day is added at the end                                                                   |            |
| **options**           | <!----><!---->[**SchedulingOptionsRequest**](SchedulingOptionsRequest.md)<!---->         | Additional scheduling options                                                                                                            | [optional] |

{: class="table table-striped"}
