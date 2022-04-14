---
title: Line
---

## Line

## Properties

| Name                 | Type                                                           | Description                                                                                                                                | Notes      |
| -------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **id**               | <!----><!---->**String**<!---->                                | The globally unique identifier for the object.                                                                                             | [optional] |
| **name**             | <!----><!---->**String**<!---->                                | The name of the entity.                                                                                                                    |            |
| **division**         | <!----><!---->[**Division**](Division.md)<!---->               | The division to which this entity belongs.                                                                                                 | [optional] |
| **description**      | <!----><!---->**String**<!---->                                | The resource&#39;s description.                                                                                                            | [optional] |
| **version**          | <!----><!---->**Integer**<!---->                               | The current version of the resource.                                                                                                       | [optional] |
| **dateCreated**      | <!----><!---->[**Date**](Date.md)<!---->                       | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **dateModified**     | <!----><!---->[**Date**](Date.md)<!---->                       | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**       | <!----><!---->**String**<!---->                                | The ID of the user that last modified the resource.                                                                                        | [optional] |
| **createdBy**        | <!----><!---->**String**<!---->                                | The ID of the user that created the resource.                                                                                              | [optional] |
| **state**            | [**StateEnum**](#StateEnum)<!---->                             | Indicates if the resource is active, inactive, or deleted.                                                                                 | [optional] |
| **modifiedByApp**    | <!----><!---->**String**<!---->                                | The application that last modified the resource.                                                                                           | [optional] |
| **createdByApp**     | <!----><!---->**String**<!---->                                | The application that created the resource.                                                                                                 | [optional] |
| **properties**       | <!----><!---->**Map&lt;String, Object&gt;**<!---->             |                                                                                                                                            | [optional] |
| **edgeGroup**        | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **template**         | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **site**             | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **lineBaseSettings** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **primaryEdge**      | <!----><!---->[**Edge**](Edge.md)<!---->                       | The primary edge associated to the line. (Deprecated)                                                                                      | [optional] |
| **secondaryEdge**    | <!----><!---->[**Edge**](Edge.md)<!---->                       | The secondary edge associated to the line. (Deprecated)                                                                                    | [optional] |
| **loggedInUser**     | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **defaultForUser**   | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **selfUri**          | <!----><!---->**String**<!---->                                | The URI for this object                                                                                                                    | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE             | &quot;active&quot;             |
| INACTIVE           | &quot;inactive&quot;           |
| DELETED            | &quot;deleted&quot;            |

{: class="table table-striped"}
