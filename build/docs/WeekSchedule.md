---
title: WeekSchedule
---

## WeekSchedule

## Properties

| Name                      | Type                                                                                     | Description                                          | Notes      |
| ------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------- | ---------- |
| **id**                    | <!----><!---->**String**<!---->                                                          | The globally unique identifier for the object.       | [optional] |
| **selfUri**               | <!----><!---->**String**<!---->                                                          | The URI for this object                              | [optional] |
| **weekDate**              | <!----><!---->**String**<!---->                                                          | First day of this week schedule in yyyy-MM-dd format | [optional] |
| **description**           | <!----><!---->**String**<!---->                                                          | Description of the week schedule                     | [optional] |
| **published**             | <!----><!---->**Boolean**<!---->                                                         | Whether the week schedule is published               | [optional] |
| **generationResults**     | <!----><!---->[**WeekScheduleGenerationResult**](WeekScheduleGenerationResult.md)<!----> | Summary of the results from the schedule run         | [optional] |
| **shortTermForecast**     | <!----><!---->[**ShortTermForecastReference**](ShortTermForecastReference.md)<!---->     | Short term forecast associated with this schedule    | [optional] |
| **metadata**              | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->     | Version metadata for this work plan                  | [optional] |
| **userSchedules**         | <!----><!---->[**Map&lt;String, UserSchedule&gt;**](UserSchedule.md)<!---->              | User schedules in the week                           | [optional] |
| **headcountForecast**     | <!----><!---->[**HeadcountForecast**](HeadcountForecast.md)<!---->                       | Headcount information for the week schedule          | [optional] |
| **agentSchedulesVersion** | <!----><!---->**Integer**<!---->                                                         | Version of agent schedules in the week schedule      | [optional] |

{: class="table table-striped"}
