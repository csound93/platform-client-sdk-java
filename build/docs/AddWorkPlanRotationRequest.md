---
title: AddWorkPlanRotationRequest
---

## AddWorkPlanRotationRequest

## Properties

| Name          | Type                                                                                                       | Description                                                      | Notes      |
| ------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ---------- |
| **name**      | <!----><!---->**String**<!---->                                                                            | Name of this work plan rotation                                  |            |
| **dateRange** | <!----><!---->[**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd.md)<!---->                           | The date range to which this work plan rotation applies          |            |
| **agents**    | <!----><!---->[**List&lt;AddWorkPlanRotationAgentRequest&gt;**](AddWorkPlanRotationAgentRequest.md)<!----> | Agents in this work plan rotation                                | [optional] |
| **pattern**   | <!----><!---->[**WorkPlanPatternRequest**](WorkPlanPatternRequest.md)<!---->                               | Pattern with list of work plan IDs that rotate on a weekly basis |            |

{: class="table table-striped"}
