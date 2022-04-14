---
title: WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate
---

## WfmUserScheduleAdherenceUpdatedMuTopicUserScheduleAdherenceUpdate

## Properties

| Name                                | Type                                                                                                                                                   | Description | Notes      |
| ----------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **user**                            | <!----><!---->[**WfmUserScheduleAdherenceUpdatedMuTopicUserReference**](WfmUserScheduleAdherenceUpdatedMuTopicUserReference.md)<!---->                 |             | [optional] |
| **managementUnitId**                | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **team**                            | <!----><!---->[**WfmUserScheduleAdherenceUpdatedMuTopicUriReference**](WfmUserScheduleAdherenceUpdatedMuTopicUriReference.md)<!---->                   |             | [optional] |
| **scheduledActivityCategory**       | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **scheduledActivityCode**           | <!----><!---->[**WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference**](WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference.md)<!----> |             | [optional] |
| **systemPresence**                  | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **organizationSecondaryPresenceId** | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **routingStatus**                   | [**RoutingStatusEnum**](#RoutingStatusEnum)<!---->                                                                                                     |             | [optional] |
| **actualActivityCategory**          | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **isOutOfOffice**                   | <!----><!---->**Boolean**<!---->                                                                                                                       |             | [optional] |
| **adherenceState**                  | [**AdherenceStateEnum**](#AdherenceStateEnum)<!---->                                                                                                   |             | [optional] |
| **impact**                          | <!----><!---->**String**<!---->                                                                                                                        |             | [optional] |
| **adherenceChangeTime**             | <!----><!---->[**Date**](Date.md)<!---->                                                                                                               |             | [optional] |
| **presenceUpdateTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                               |             | [optional] |
| **activeQueues**                    | <!----><!---->[**List&lt;WfmUserScheduleAdherenceUpdatedMuTopicQueueReference&gt;**](WfmUserScheduleAdherenceUpdatedMuTopicQueueReference.md)<!---->   |             | [optional] |
| **activeQueuesModifiedTime**        | <!----><!---->[**Date**](Date.md)<!---->                                                                                                               |             | [optional] |
| **removedFromManagementUnit**       | <!----><!---->**Boolean**<!---->                                                                                                                       |             | [optional] |

{: class="table table-striped"}

<a name="RoutingStatusEnum"></a>

## Enum: RoutingStatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| _EMPTY_            | &quot;**EMPTY**&quot;          |
| OFF_QUEUE          | &quot;OFF_QUEUE&quot;          |
| IDLE               | &quot;IDLE&quot;               |
| INTERACTING        | &quot;INTERACTING&quot;        |
| NOT_RESPONDING     | &quot;NOT_RESPONDING&quot;     |
| COMMUNICATING      | &quot;COMMUNICATING&quot;      |
| OFFLINE            | &quot;OFFLINE&quot;            |

{: class="table table-striped"}

<a name="AdherenceStateEnum"></a>

## Enum: AdherenceStateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INADHERENCE        | &quot;InAdherence&quot;        |
| OUTOFADHERENCE     | &quot;OutOfAdherence&quot;     |
| UNSCHEDULED        | &quot;Unscheduled&quot;        |
| UNKNOWN            | &quot;Unknown&quot;            |
| IGNORED            | &quot;Ignored&quot;            |

{: class="table table-striped"}
