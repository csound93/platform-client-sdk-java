---
title: WorkspaceMember
---

## WorkspaceMember

## Properties

| Name                | Type                                                           | Description                                    | Notes      |
| ------------------- | -------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **id**              | <!----><!---->**String**<!---->                                | The globally unique identifier for the object. | [optional] |
| **name**            | <!----><!---->**String**<!---->                                |                                                | [optional] |
| **workspace**       | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **memberType**      | [**MemberTypeEnum**](#MemberTypeEnum)<!---->                   | The workspace member type.                     |            |
| **member**          | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **user**            | <!----><!---->[**User**](User.md)<!---->                       |                                                | [optional] |
| **group**           | <!----><!---->[**Group**](Group.md)<!---->                     |                                                | [optional] |
| **securityProfile** | <!----><!---->[**SecurityProfile**](SecurityProfile.md)<!----> |                                                | [optional] |
| **selfUri**         | <!----><!---->**String**<!---->                                | The URI for this object                        | [optional] |

{: class="table table-striped"}

<a name="MemberTypeEnum"></a>

## Enum: MemberTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER               | &quot;USER&quot;               |
| GROUP              | &quot;GROUP&quot;              |

{: class="table table-striped"}
