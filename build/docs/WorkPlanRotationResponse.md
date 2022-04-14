---
title: WorkPlanRotationResponse
---

## WorkPlanRotationResponse

## Properties

| Name           | Type                                                                                                   | Description                                                                                                           | Notes      |
| -------------- | ------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**         | <!----><!---->**String**<!---->                                                                        | The globally unique identifier for the object.                                                                        | [optional] |
| **name**       | <!----><!---->**String**<!---->                                                                        |                                                                                                                       | [optional] |
| **enabled**    | <!----><!---->**Boolean**<!---->                                                                       | Whether the work plan rotation is enabled for scheduling                                                              | [optional] |
| **dateRange**  | <!----><!---->[**DateRangeWithOptionalEnd**](DateRangeWithOptionalEnd.md)<!---->                       | The date range to which this work plan rotation applies                                                               | [optional] |
| **pattern**    | <!----><!---->[**WorkPlanPatternResponse**](WorkPlanPatternResponse.md)<!---->                         | Pattern with ordered list of work plans that rotate on a weekly basis                                                 | [optional] |
| **agentCount** | <!----><!---->**Integer**<!---->                                                                       | Number of agents in this work plan rotation                                                                           | [optional] |
| **agents**     | <!----><!---->[**List&lt;WorkPlanRotationAgentResponse&gt;**](WorkPlanRotationAgentResponse.md)<!----> | Agents in this work plan rotation. Populate with expand=agents for GET WorkPlanRotationsList (defaults to empty list) | [optional] |
| **metadata**   | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->                   | Version metadata for this work plan rotation                                                                          | [optional] |
| **selfUri**    | <!----><!---->**String**<!---->                                                                        | The URI for this object                                                                                               | [optional] |

{: class="table table-striped"}
