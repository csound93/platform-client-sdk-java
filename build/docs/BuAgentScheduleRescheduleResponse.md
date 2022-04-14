---
title: BuAgentScheduleRescheduleResponse
---

## BuAgentScheduleRescheduleResponse

## Properties

| Name                      | Type                                                                                     | Description                                                                                                                                             | Notes      |
| ------------------------- | ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **user**                  | <!----><!---->[**UserReference**](UserReference.md)<!---->                               | The user to whom this agent schedule applies                                                                                                            | [optional] |
| **shifts**                | <!----><!---->[**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift.md)<!---->     | The shift definitions for this agent schedule                                                                                                           | [optional] |
| **fullDayTimeOffMarkers** | <!----><!---->[**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker.md)<!----> | Full day time off markers which apply to this agent schedule                                                                                            | [optional] |
| **workPlan**              | <!----><!---->[**WorkPlanReference**](WorkPlanReference.md)<!---->                       | The work plan for this user                                                                                                                             | [optional] |
| **workPlansPerWeek**      | <!----><!---->[**List&lt;WorkPlanReference&gt;**](WorkPlanReference.md)<!---->           | The work plans per week for this user from the work plan rotation. Null values in the list denotes that user is not part of any work plan for that week | [optional] |

{: class="table table-striped"}
