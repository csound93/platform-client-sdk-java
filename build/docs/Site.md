---
title: Site
---

## Site

## Properties

| Name                            | Type                                                                       | Description                                                                                                                                | Notes      |
| ------------------------------- | -------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **id**                          | <!----><!---->**String**<!---->                                            | The globally unique identifier for the object.                                                                                             | [optional] |
| **name**                        | <!----><!---->**String**<!---->                                            | The name of the entity.                                                                                                                    |            |
| **division**                    | <!----><!---->[**Division**](Division.md)<!---->                           | The division to which this entity belongs.                                                                                                 | [optional] |
| **description**                 | <!----><!---->**String**<!---->                                            | The resource&#39;s description.                                                                                                            | [optional] |
| **version**                     | <!----><!---->**Integer**<!---->                                           | The current version of the resource.                                                                                                       | [optional] |
| **dateCreated**                 | <!----><!---->[**Date**](Date.md)<!---->                                   | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **dateModified**                | <!----><!---->[**Date**](Date.md)<!---->                                   | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**                  | <!----><!---->**String**<!---->                                            | The ID of the user that last modified the resource.                                                                                        | [optional] |
| **createdBy**                   | <!----><!---->**String**<!---->                                            | The ID of the user that created the resource.                                                                                              | [optional] |
| **state**                       | [**StateEnum**](#StateEnum)<!---->                                         | Indicates if the resource is active, inactive, or deleted.                                                                                 | [optional] |
| **modifiedByApp**               | <!----><!---->**String**<!---->                                            | The application that last modified the resource.                                                                                           | [optional] |
| **createdByApp**                | <!----><!---->**String**<!---->                                            | The application that created the resource.                                                                                                 | [optional] |
| **primarySites**                | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **secondarySites**              | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.md)<!----> |                                                                                                                                            | [optional] |
| **primaryEdges**                | <!----><!---->[**List&lt;Edge&gt;**](Edge.md)<!---->                       |                                                                                                                                            | [optional] |
| **secondaryEdges**              | <!----><!---->[**List&lt;Edge&gt;**](Edge.md)<!---->                       |                                                                                                                                            | [optional] |
| **addresses**                   | <!----><!---->[**List&lt;Contact&gt;**](Contact.md)<!---->                 |                                                                                                                                            | [optional] |
| **edges**                       | <!----><!---->[**List&lt;Edge&gt;**](Edge.md)<!---->                       |                                                                                                                                            | [optional] |
| **edgeAutoUpdateConfig**        | <!----><!---->[**EdgeAutoUpdateConfig**](EdgeAutoUpdateConfig.md)<!---->   | Recurrance rule, time zone, and start/end settings for automatic edge updates for this site                                                | [optional] |
| **mediaRegionsUseLatencyBased** | <!----><!---->**Boolean**<!---->                                           |                                                                                                                                            | [optional] |
| **location**                    | <!----><!---->[**LocationDefinition**](LocationDefinition.md)<!---->       | Location                                                                                                                                   |            |
| **managed**                     | <!----><!---->**Boolean**<!---->                                           |                                                                                                                                            | [optional] |
| **ntpSettings**                 | <!----><!---->[**NTPSettings**](NTPSettings.md)<!---->                     | Network Time Protocol settings for the site                                                                                                | [optional] |
| **mediaModel**                  | [**MediaModelEnum**](#MediaModelEnum)<!---->                               | Media model for the site                                                                                                                   | [optional] |
| **coreSite**                    | <!----><!---->**Boolean**<!---->                                           | Is this site a core site                                                                                                                   | [optional] |
| **siteConnections**             | <!----><!---->[**List&lt;SiteConnection&gt;**](SiteConnection.md)<!---->   | The site connections                                                                                                                       | [optional] |
| **selfUri**                     | <!----><!---->**String**<!---->                                            | The URI for this object                                                                                                                    | [optional] |

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

<a name="MediaModelEnum"></a>

## Enum: MediaModelEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PREMISES           | &quot;Premises&quot;           |
| CLOUD              | &quot;Cloud&quot;              |

{: class="table table-striped"}
