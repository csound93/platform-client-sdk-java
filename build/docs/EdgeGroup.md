---
title: EdgeGroup
---

## EdgeGroup

## Properties

| Name                        | Type                                                                   | Description                                                                                                                                | Notes      |
| --------------------------- | ---------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                        | The globally unique identifier for the object.                                                                                             | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                        | The name of the entity.                                                                                                                    |            |
| **division**                | <!----><!---->[**Division**](Division.md)<!---->                       | The division to which this entity belongs.                                                                                                 | [optional] |
| **description**             | <!----><!---->**String**<!---->                                        | The resource&#39;s description.                                                                                                            | [optional] |
| **version**                 | <!----><!---->**Integer**<!---->                                       | The current version of the resource.                                                                                                       | [optional] |
| **dateCreated**             | <!----><!---->[**Date**](Date.md)<!---->                               | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **dateModified**            | <!----><!---->[**Date**](Date.md)<!---->                               | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**              | <!----><!---->**String**<!---->                                        | The ID of the user that last modified the resource.                                                                                        | [optional] |
| **createdBy**               | <!----><!---->**String**<!---->                                        | The ID of the user that created the resource.                                                                                              | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                     | Indicates if the resource is active, inactive, or deleted.                                                                                 | [optional] |
| **modifiedByApp**           | <!----><!---->**String**<!---->                                        | The application that last modified the resource.                                                                                           | [optional] |
| **createdByApp**            | <!----><!---->**String**<!---->                                        | The application that created the resource.                                                                                                 | [optional] |
| **managed**                 | <!----><!---->**Boolean**<!---->                                       | Is this edge group being managed remotely.                                                                                                 | [optional] |
| **hybrid**                  | <!----><!---->**Boolean**<!---->                                       | Is this edge group hybrid.                                                                                                                 | [optional] |
| **edgeTrunkBaseAssignment** | <!----><!---->[**TrunkBaseAssignment**](TrunkBaseAssignment.md)<!----> | A trunk base settings assignment of trunkType \&quot;EDGE\&quot; to use for edge-to-edge communication.                                    |            |
| **phoneTrunkBases**         | <!----><!---->[**List&lt;TrunkBase&gt;**](TrunkBase.md)<!---->         | Trunk base settings of trunkType \&quot;PHONE\&quot; to inherit to edge logical interface for phone communication.                         |            |
| **selfUri**                 | <!----><!---->**String**<!---->                                        | The URI for this object                                                                                                                    | [optional] |

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
