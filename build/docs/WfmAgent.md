---
title: WfmAgent
---

## WfmAgent

## Properties

| Name                        | Type                                                                                   | Description                                                                | Notes      |
| --------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                        | The globally unique identifier for the object.                             | [optional] |
| **user**                    | <!----><!---->[**UserReference**](UserReference.md)<!---->                             | The user associated with this data                                         | [optional] |
| **workPlan**                | <!----><!---->[**WorkPlanReference**](WorkPlanReference.md)<!---->                     | The work plan associated with this agent, if applicable                    | [optional] |
| **workPlanRotation**        | <!----><!---->[**WorkPlanRotationReference**](WorkPlanRotationReference.md)<!---->     | The work plan rotation associated with this agent, if applicable           | [optional] |
| **acceptDirectShiftTrades** | <!----><!---->**Boolean**<!---->                                                       | Whether the agent accepts direct shift trade requests                      | [optional] |
| **queues**                  | <!----><!---->[**List&lt;QueueReference&gt;**](QueueReference.md)<!---->               | List of queues to which this agent is capable of handling                  | [optional] |
| **languages**               | <!----><!---->[**List&lt;LanguageReference&gt;**](LanguageReference.md)<!---->         | The list of languages this agent is capable of handling                    | [optional] |
| **skills**                  | <!----><!---->[**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference.md)<!----> | The list of skills this agent is capable of handling                       | [optional] |
| **schedulable**             | <!----><!---->**Boolean**<!---->                                                       | Whether the agent has the permission to be included in schedule generation | [optional] |
| **metadata**                | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->   | Metadata for this agent                                                    | [optional] |
| **selfUri**                 | <!----><!---->**String**<!---->                                                        | The URI for this object                                                    | [optional] |

{: class="table table-striped"}
