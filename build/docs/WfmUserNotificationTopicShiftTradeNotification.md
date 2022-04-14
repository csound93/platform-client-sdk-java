---
title: WfmUserNotificationTopicShiftTradeNotification
---

## WfmUserNotificationTopicShiftTradeNotification

## Properties

| Name                    | Type                                                                                                       | Description | Notes      |
| ----------------------- | ---------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **weekDate**            | <!----><!---->**String**<!---->                                                                            |             | [optional] |
| **tradeId**             | <!----><!---->**String**<!---->                                                                            |             | [optional] |
| **oneSided**            | <!----><!---->**Boolean**<!---->                                                                           |             | [optional] |
| **newState**            | [**NewStateEnum**](#NewStateEnum)<!---->                                                                   |             | [optional] |
| **initiatingUser**      | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.md)<!----> |             | [optional] |
| **initiatingShiftDate** | <!----><!---->[**Date**](Date.md)<!---->                                                                   |             | [optional] |
| **receivingUser**       | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.md)<!----> |             | [optional] |
| **receivingShiftDate**  | <!----><!---->[**Date**](Date.md)<!---->                                                                   |             | [optional] |

{: class="table table-striped"}

<a name="NewStateEnum"></a>

## Enum: NewStateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNMATCHED          | &quot;Unmatched&quot;          |
| MATCHED            | &quot;Matched&quot;            |
| APPROVED           | &quot;Approved&quot;           |
| DENIED             | &quot;Denied&quot;             |
| EXPIRED            | &quot;Expired&quot;            |
| CANCELED           | &quot;Canceled&quot;           |

{: class="table table-striped"}
