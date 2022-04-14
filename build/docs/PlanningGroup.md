---
title: PlanningGroup
---

## PlanningGroup

## Properties

| Name                    | Type                                                                                     | Description                                                             | Notes      |
| ----------------------- | ---------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | ---------- |
| **id**                  | <!----><!---->**String**<!---->                                                          | The globally unique identifier for the object.                          | [optional] |
| **name**                | <!----><!---->**String**<!---->                                                          |                                                                         | [optional] |
| **serviceGoalTemplate** | <!----><!---->[**ServiceGoalTemplateReference**](ServiceGoalTemplateReference.md)<!----> | The ID of the service goal template associated with this planning group | [optional] |
| **routePaths**          | <!----><!---->[**List&lt;RoutePathResponse&gt;**](RoutePathResponse.md)<!---->           | Set of route paths associated with the planning group                   | [optional] |
| **metadata**            | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.md)<!---->     | Version metadata for the planning group                                 | [optional] |
| **selfUri**             | <!----><!---->**String**<!---->                                                          | The URI for this object                                                 | [optional] |

{: class="table table-striped"}
