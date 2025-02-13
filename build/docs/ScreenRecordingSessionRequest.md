---
title: ScreenRecordingSessionRequest
---

## ScreenRecordingSessionRequest

## Properties

| Name            | Type                                     | Description                                                                                                                                                                                                  | Notes      |
| --------------- | ---------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **state**       | [**StateEnum**](#StateEnum)<!---->       | The screen recording session&#39;s state. Values can be: &#39;stopped&#39;                                                                                                                                   | [optional] |
| **archiveDate** | <!----><!---->[**Date**](Date.md)<!----> | The screen recording session&#39;s archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                         | [optional] |
| **deleteDate**  | <!----><!---->[**Date**](Date.md)<!----> | The screen recording session&#39;s delete date. Must be greater than archiveDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STOPPED            | &quot;STOPPED&quot;            |

{: class="table table-striped"}
