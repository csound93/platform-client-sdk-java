---
title: BuScheduleMetadata
---

## BuScheduleMetadata

## Properties

| Name                  | Type                                                                                                       | Description                                                                                                 | Notes      |
| --------------------- | ---------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                | <!----><!---->**String**<!---->                                                                            | The globally unique identifier for the object.                                                              | [optional] |
| **weekDate**          | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                                                         | The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **weekCount**         | <!----><!---->**Integer**<!---->                                                                           | The number of weeks spanned by this schedule                                                                | [optional] |
| **description**       | <!----><!---->**String**<!---->                                                                            | The description of this schedule                                                                            | [optional] |
| **published**         | <!----><!---->**Boolean**<!---->                                                                           | Whether this schedule is published                                                                          | [optional] |
| **shortTermForecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.md)<!---->                   | The forecast used for this schedule, if applicable                                                          | [optional] |
| **generationResults** | <!----><!---->[**ScheduleGenerationResultSummary**](ScheduleGenerationResultSummary.md)<!---->             | Generation result summary for this schedule, if applicable                                                  | [optional] |
| **metadata**          | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->                       | Version metadata for this schedule                                                                          | [optional] |
| **managementUnits**   | <!----><!---->[**List&lt;BuManagementUnitScheduleSummary&gt;**](BuManagementUnitScheduleSummary.md)<!----> | High level per-management unit schedule metadata                                                            | [optional] |
| **selfUri**           | <!----><!---->**String**<!---->                                                                            | The URI for this object                                                                                     | [optional] |

{: class="table table-striped"}
