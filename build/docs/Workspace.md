---
title: Workspace
---

## Workspace

## Properties

| Name                       | Type                                                             | Description                                                                             | Notes      |
| -------------------------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**                     | <!----><!---->**String**<!---->                                  | The globally unique identifier for the object.                                          | [optional] |
| **name**                   | <!----><!---->**String**<!---->                                  | The current name of the workspace.                                                      |            |
| **type**                   | [**TypeEnum**](#TypeEnum)<!---->                                 |                                                                                         | [optional] |
| **isCurrentUserWorkspace** | <!----><!---->**Boolean**<!---->                                 |                                                                                         | [optional] |
| **user**                   | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->   |                                                                                         | [optional] |
| **bucket**                 | <!----><!---->**String**<!---->                                  |                                                                                         | [optional] |
| **dateCreated**            | <!----><!---->[**Date**](Date.md)<!---->                         | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **dateModified**           | <!----><!---->[**Date**](Date.md)<!---->                         | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **summary**                | <!----><!---->[**WorkspaceSummary**](WorkspaceSummary.md)<!----> |                                                                                         | [optional] |
| **acl**                    | <!----><!---->**List&lt;String&gt;**<!---->                      |                                                                                         | [optional] |
| **description**            | <!----><!---->**String**<!---->                                  |                                                                                         | [optional] |
| **selfUri**                | <!----><!---->**String**<!---->                                  | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER               | &quot;USER&quot;               |
| GROUP              | &quot;GROUP&quot;              |

{: class="table table-striped"}
