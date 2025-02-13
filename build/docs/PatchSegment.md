---
title: PatchSegment
---

## PatchSegment

## Properties

| Name                         | Type                                                                     | Description                                                                                                                                         | Notes      |
| ---------------------------- | ------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                       | <!----><!---->**String**<!---->                                          | The globally unique identifier for the object.                                                                                                      | [optional] |
| **isActive**                 | <!----><!---->**Boolean**<!---->                                         | Whether or not the segment is active.                                                                                                               | [optional] |
| **displayName**              | <!----><!---->**String**<!---->                                          | The display name of the segment.                                                                                                                    |            |
| **version**                  | <!----><!---->**Integer**<!---->                                         | The version of the segment.                                                                                                                         | [optional] |
| **description**              | <!----><!---->**String**<!---->                                          | A description of the segment.                                                                                                                       | [optional] |
| **color**                    | <!----><!---->**String**<!---->                                          | The hexadecimal color value of the segment.                                                                                                         | [optional] |
| **shouldDisplayToAgent**     | <!----><!---->**Boolean**<!---->                                         | Whether or not the segment should be displayed to agent/supervisor users.                                                                           | [optional] |
| **context**                  | <!----><!---->[**Context**](Context.md)<!---->                           | The context of the segment.                                                                                                                         | [optional] |
| **journey**                  | <!----><!---->[**Journey**](Journey.md)<!---->                           | The pattern of rules defining the segment.                                                                                                          | [optional] |
| **externalSegment**          | <!----><!---->[**PatchExternalSegment**](PatchExternalSegment.md)<!----> | Details of an entity corresponding to this segment in an external system.                                                                           | [optional] |
| **assignmentExpirationDays** | <!----><!---->**Integer**<!---->                                         | Time, in days, from when the segment is assigned until it is automatically unassigned.                                                              | [optional] |
| **selfUri**                  | <!----><!---->**String**<!---->                                          | The URI for this object                                                                                                                             | [optional] |
| **createdDate**              | <!----><!---->[**Date**](Date.md)<!---->                                 | Timestamp indicating when the segment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z          | [optional] |
| **modifiedDate**             | <!----><!---->[**Date**](Date.md)<!---->                                 | Timestamp indicating when the the segment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |

{: class="table table-striped"}
