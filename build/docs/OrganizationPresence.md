---
title: OrganizationPresence
---

## OrganizationPresence

## Properties

| Name               | Type                                               | Description                                                                             | Notes      |
| ------------------ | -------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**             | <!----><!---->**String**<!---->                    | The globally unique identifier for the object.                                          | [optional] |
| **name**           | <!----><!---->**String**<!---->                    |                                                                                         | [optional] |
| **languageLabels** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The label used for the system presence in each specified language                       |            |
| **systemPresence** | <!----><!---->**String**<!---->                    |                                                                                         | [optional] |
| **deactivated**    | <!----><!---->**Boolean**<!---->                   |                                                                                         | [optional] |
| **primary**        | <!----><!---->**Boolean**<!---->                   |                                                                                         | [optional] |
| **createdBy**      | <!----><!---->[**User**](User.md)<!---->           |                                                                                         | [optional] |
| **createdDate**    | <!----><!---->[**Date**](Date.md)<!---->           | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**     | <!----><!---->[**User**](User.md)<!---->           |                                                                                         | [optional] |
| **modifiedDate**   | <!----><!---->[**Date**](Date.md)<!---->           | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **selfUri**        | <!----><!---->**String**<!---->                    | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}
