---
title: EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate
---

## EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate

## Properties

| Name                  | Type                                     | Description | Notes      |
| --------------------- | ---------------------------------------- | ----------- | ---------- |
| **id**                | <!----><!---->**String**<!---->          |             | [optional] |
| **status**            | [**StatusEnum**](#StatusEnum)<!---->     |             | [optional] |
| **downloadStartTime** | <!----><!---->[**Date**](Date.md)<!----> |             | [optional] |
| **executeStartTime**  | <!----><!---->[**Date**](Date.md)<!----> |             | [optional] |
| **executeStopTime**   | <!----><!---->[**Date**](Date.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE               | &quot;NONE&quot;               |
| INIT               | &quot;INIT&quot;               |
| IN_PROGRESS        | &quot;IN_PROGRESS&quot;        |
| EXPIRED            | &quot;EXPIRED&quot;            |
| EXCEPTION          | &quot;EXCEPTION&quot;          |
| ABORTED            | &quot;ABORTED&quot;            |
| FAILED             | &quot;FAILED&quot;             |
| SUCCEEDED          | &quot;SUCCEEDED&quot;          |
| DELETE             | &quot;DELETE&quot;             |

{: class="table table-striped"}
