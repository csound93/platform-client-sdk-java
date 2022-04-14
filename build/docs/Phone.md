---
title: Phone
---

## Phone

## Properties

| Name                  | Type                                                               | Description                                                                                                                                | Notes      |
| --------------------- | ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **id**                | <!----><!---->**String**<!---->                                    | The globally unique identifier for the object.                                                                                             | [optional] |
| **name**              | <!----><!---->**String**<!---->                                    | The name of the entity.                                                                                                                    |            |
| **division**          | <!----><!---->[**Division**](Division.md)<!---->                   | The division to which this entity belongs.                                                                                                 | [optional] |
| **description**       | <!----><!---->**String**<!---->                                    | The resource&#39;s description.                                                                                                            | [optional] |
| **version**           | <!----><!---->**Integer**<!---->                                   | The current version of the resource.                                                                                                       | [optional] |
| **dateCreated**       | <!----><!---->[**Date**](Date.md)<!---->                           | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **dateModified**      | <!----><!---->[**Date**](Date.md)<!---->                           | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**        | <!----><!---->**String**<!---->                                    | The ID of the user that last modified the resource.                                                                                        | [optional] |
| **createdBy**         | <!----><!---->**String**<!---->                                    | The ID of the user that created the resource.                                                                                              | [optional] |
| **state**             | [**StateEnum**](#StateEnum)<!---->                                 | Indicates if the resource is active, inactive, or deleted.                                                                                 | [optional] |
| **modifiedByApp**     | <!----><!---->**String**<!---->                                    | The application that last modified the resource.                                                                                           | [optional] |
| **createdByApp**      | <!----><!---->**String**<!---->                                    | The application that created the resource.                                                                                                 | [optional] |
| **site**              | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->     | The site associated to the phone.                                                                                                          |            |
| **phoneBaseSettings** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->     | Phone Base Settings                                                                                                                        |            |
| **lineBaseSettings**  | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->     |                                                                                                                                            | [optional] |
| **phoneMetaBase**     | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->     |                                                                                                                                            | [optional] |
| **lines**             | <!----><!---->[**List&lt;Line&gt;**](Line.md)<!---->               | Lines                                                                                                                                      |            |
| **status**            | <!----><!---->[**PhoneStatus**](PhoneStatus.md)<!---->             | The status of the phone and lines from the primary Edge.                                                                                   | [optional] |
| **secondaryStatus**   | <!----><!---->[**PhoneStatus**](PhoneStatus.md)<!---->             | The status of the phone and lines from the secondary Edge.                                                                                 | [optional] |
| **userAgentInfo**     | <!----><!---->[**UserAgentInfo**](UserAgentInfo.md)<!---->         | User Agent Information for this phone. This includes model, firmware version, and manufacturer.                                            | [optional] |
| **properties**        | <!----><!---->**Map&lt;String, Object&gt;**<!---->                 |                                                                                                                                            | [optional] |
| **capabilities**      | <!----><!---->[**PhoneCapabilities**](PhoneCapabilities.md)<!----> |                                                                                                                                            | [optional] |
| **webRtcUser**        | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->     | This is the user associated with a WebRTC type phone. It is required for all WebRTC phones.                                                | [optional] |
| **primaryEdge**       | <!----><!---->[**Edge**](Edge.md)<!---->                           |                                                                                                                                            | [optional] |
| **secondaryEdge**     | <!----><!---->[**Edge**](Edge.md)<!---->                           |                                                                                                                                            | [optional] |
| **selfUri**           | <!----><!---->**String**<!---->                                    | The URI for this object                                                                                                                    | [optional] |

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
