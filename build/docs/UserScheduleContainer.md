---
title: UserScheduleContainer
---

## UserScheduleContainer

## Properties

| Name                       | Type                                                                                   | Description                                                                                | Notes      |
| -------------------------- | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ | ---------- |
| **managementUnitTimeZone** | <!----><!---->**String**<!---->                                                        | The reference time zone used for the management unit                                       | [optional] |
| **publishedSchedules**     | <!----><!---->[**List&lt;WeekScheduleReference&gt;**](WeekScheduleReference.md)<!----> | References to all published week schedules overlapping the start/end date query parameters | [optional] |
| **userSchedules**          | <!----><!---->[**Map&lt;String, UserSchedule&gt;**](UserSchedule.md)<!---->            | Map of user id to user schedule                                                            | [optional] |

{: class="table table-striped"}
