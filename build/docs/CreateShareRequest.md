---
title: CreateShareRequest
---

## CreateShareRequest

## Properties

| Name                 | Type                                                                                         | Description                                                                                         | Notes      |
| -------------------- | -------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | ---------- |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#SharedEntityTypeEnum)<!---->                                     | The share entity type                                                                               |            |
| **sharedEntity**     | <!----><!---->[**SharedEntity**](SharedEntity.md)<!---->                                     | The entity that will be shared                                                                      |            |
| **memberType**       | [**MemberTypeEnum**](#MemberTypeEnum)<!---->                                                 |                                                                                                     | [optional] |
| **member**           | <!----><!---->[**SharedEntity**](SharedEntity.md)<!---->                                     | The member that will have access to this share. Only required if a list of members is not provided. | [optional] |
| **members**          | <!----><!---->[**List&lt;CreateShareRequestMember&gt;**](CreateShareRequestMember.md)<!----> |                                                                                                     | [optional] |

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
