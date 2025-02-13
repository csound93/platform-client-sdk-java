---
title: FlowRuntimeExecution
---

## FlowRuntimeExecution

## Properties

| Name                 | Type                                                           | Description                                                                                                                         | Notes      |
| -------------------- | -------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**               | <!----><!---->**String**<!---->                                | The flow execution ID                                                                                                               | [optional] |
| **name**             | <!----><!---->**String**<!---->                                | The flow execution name.                                                                                                            | [optional] |
| **flowVersion**      | <!----><!---->[**FlowVersion**](FlowVersion.md)<!---->         | The Version of the flow definition of the flow execution.                                                                           |            |
| **dateLaunched**     | <!----><!---->[**Date**](Date.md)<!---->                       | The time the flow was launched. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z             |            |
| **status**           | [**StatusEnum**](#StatusEnum)<!---->                           | The flow&#39;s running status, which indicates whether the flow is running normally or completed, etc.                              |            |
| **dateCompleted**    | <!----><!---->[**Date**](Date.md)<!---->                       | The time the flow completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **completionReason** | <!----><!---->**String**<!---->                                | The completion reason set at the flow completion time, if applicable.                                                               | [optional] |
| **flowErrorInfo**    | <!----><!---->[**ErrorBody**](ErrorBody.md)<!---->             | Additional information if the flow is in error                                                                                      | [optional] |
| **outputData**       | <!----><!---->**Map&lt;String, Object&gt;**<!---->             | List of the flow&#39;s output variables, if any. Output variables are only supplied for Completed flows.                            | [optional] |
| **conversation**     | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!----> | The conversation to which this Flow execution is related                                                                            | [optional] |
| **selfUri**          | <!----><!---->**String**<!---->                                | The URI for this object                                                                                                             | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN            | &quot;UNKNOWN&quot;            |
| RUNNING            | &quot;RUNNING&quot;            |
| ERROR              | &quot;ERROR&quot;              |
| TERMINATED         | &quot;TERMINATED&quot;         |
| COMPLETED          | &quot;COMPLETED&quot;          |
| FAILED             | &quot;FAILED&quot;             |

{: class="table table-striped"}
