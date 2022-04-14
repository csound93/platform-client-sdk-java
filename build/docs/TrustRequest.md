---
title: TrustRequest
---

## TrustRequest

## Properties

| Name            | Type                                                             | Description                                                                                                                                                      | Notes      |
| --------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**          | <!----><!---->**String**<!---->                                  | The globally unique identifier for the object.                                                                                                                   | [optional] |
| **createdBy**   | <!----><!---->[**OrgUser**](OrgUser.md)<!---->                   | User who created this request.                                                                                                                                   | [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.md)<!---->                         | Date request was created. There is a 48 hour expiration on all requests. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **trustee**     | <!----><!---->[**Organization**](Organization.md)<!---->         | Trustee organization who generated this request.                                                                                                                 |            |
| **users**       | <!----><!---->[**List&lt;OrgUser&gt;**](OrgUser.md)<!---->       | The list of trustee users that are requesting access.                                                                                                            | [optional] |
| **groups**      | <!----><!---->[**List&lt;TrustGroup&gt;**](TrustGroup.md)<!----> | The list of trustee groups that are requesting access.                                                                                                           | [optional] |
| **selfUri**     | <!----><!---->**String**<!---->                                  | The URI for this object                                                                                                                                          | [optional] |

{: class="table table-striped"}
