---
title: BuImportAgentScheduleUploadSchema
---

## BuImportAgentScheduleUploadSchema

## Properties

| Name                      | Type                                                                                     | Description                                                                          | Notes      |
| ------------------------- | ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ | ---------- |
| **userId**                | <!----><!---->**String**<!---->                                                          | The ID of the user to whom this agent schedule applies                               |            |
| **workPlanId**            | <!----><!---->[**ValueWrapperString**](ValueWrapperString.md)<!---->                     | The ID of the work plan for this user. Mutually exclusive with workPlanIdsPerWeek    | [optional] |
| **workPlanIdsPerWeek**    | <!----><!---->[**ListWrapperString**](ListWrapperString.md)<!---->                       | The IDs of the work plans per week for this user. Mutually exclusive with workPlanId | [optional] |
| **shifts**                | <!----><!---->[**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift.md)<!---->     | The shift definitions for this agent schedule                                        | [optional] |
| **fullDayTimeOffMarkers** | <!----><!---->[**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker.md)<!----> | Any full day time off markers that apply to this agent schedule                      | [optional] |

{: class="table table-striped"}
