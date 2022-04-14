---
title: CreateShareResponse
---

## CreateShareResponse

## Properties

| Name                 | Type                                                           | Description                                    | Notes      |
| -------------------- | -------------------------------------------------------------- | ---------------------------------------------- | ---------- |
| **id**               | <!----><!---->**String**<!---->                                | The globally unique identifier for the object. | [optional] |
| **name**             | <!----><!---->**String**<!---->                                |                                                | [optional] |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#SharedEntityTypeEnum)<!---->       |                                                | [optional] |
| **sharedEntity**     | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **memberType**       | [**MemberTypeEnum**](#MemberTypeEnum)<!---->                   |                                                | [optional] |
| **member**           | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **sharedBy**         | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **workspace**        | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> |                                                | [optional] |
| **succeeded**        | <!----><!---->[**List&lt;Share&gt;**](Share.md)<!---->         |                                                | [optional] |
| **failed**           | <!----><!---->[**List&lt;Share&gt;**](Share.md)<!---->         |                                                | [optional] |
| **selfUri**          | <!----><!---->**String**<!---->                                | The URI for this object                        | [optional] |

{: class="table table-striped"}

<a name="SharedEntityTypeEnum"></a>

## Enum: SharedEntityTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DOCUMENT           | &quot;DOCUMENT&quot;           |

{: class="table table-striped"}

<a name="MemberTypeEnum"></a>

## Enum: MemberTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USER               | &quot;USER&quot;               |
| GROUP              | &quot;GROUP&quot;              |
| PUBLIC             | &quot;PUBLIC&quot;             |

{: class="table table-striped"}
