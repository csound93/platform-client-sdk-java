---
title: UpdateWorkPlanRotationRequest
---

## UpdateWorkPlanRotationRequest

## Properties

| Name          | Type                                                                                                             | Description                                                      | Notes      |
| ------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ---------- |
| **name**      | <!----><!---->**String**<!---->                                                                                  | Name of this work plan rotation                                  | [optional] |
| **enabled**   | <!----><!---->**Boolean**<!---->                                                                                 | Whether the work plan rotation is enabled for scheduling         | [optional] |
| **dateRange** | <!----><!---->[**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd.md)<!---->                                 | The date range to which this work plan rotation applies          | [optional] |
| **agents**    | <!----><!---->[**List&lt;UpdateWorkPlanRotationAgentRequest&gt;**](UpdateWorkPlanRotationAgentRequest.md)<!----> | Agents in this work plan rotation                                | [optional] |
| **pattern**   | <!----><!---->[**WorkPlanPatternRequest**](WorkPlanPatternRequest.md)<!---->                                     | Pattern with list of work plan IDs that rotate on a weekly basis | [optional] |
| **metadata**  | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->                             | Version metadata for this work plan rotation                     |            |

{: class="table table-striped"}
