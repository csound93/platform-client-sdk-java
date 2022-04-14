---
title: PolicyCreate
---

## PolicyCreate

## Properties

| Name              | Type                                                             | Description                                                                             | Notes      |
| ----------------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**            | <!----><!---->**String**<!---->                                  | The globally unique identifier for the object.                                          | [optional] |
| **name**          | <!----><!---->**String**<!---->                                  | The policy name.                                                                        |            |
| **modifiedDate**  | <!----><!---->[**Date**](Date.md)<!---->                         | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **createdDate**   | <!----><!---->[**Date**](Date.md)<!---->                         | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **order**         | <!----><!---->**Integer**<!---->                                 |                                                                                         | [optional] |
| **description**   | <!----><!---->**String**<!---->                                  |                                                                                         | [optional] |
| **enabled**       | <!----><!---->**Boolean**<!---->                                 |                                                                                         | [optional] |
| **mediaPolicies** | <!----><!---->[**MediaPolicies**](MediaPolicies.md)<!---->       | Conditions and actions per media type                                                   | [optional] |
| **conditions**    | <!----><!---->[**PolicyConditions**](PolicyConditions.md)<!----> | Conditions                                                                              | [optional] |
| **actions**       | <!----><!---->[**PolicyActions**](PolicyActions.md)<!---->       | Actions                                                                                 | [optional] |
| **policyErrors**  | <!----><!---->[**PolicyErrors**](PolicyErrors.md)<!---->         |                                                                                         | [optional] |
| **selfUri**       | <!----><!---->**String**<!---->                                  | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}
