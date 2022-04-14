---
title: BuRescheduleAgentScheduleResult
---

## BuRescheduleAgentScheduleResult

## Properties

| Name               | Type                                                                               | Description                                                                                                        | Notes      |
| ------------------ | ---------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ | ---------- |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.md)<!---->     | The management unit to which this part of the result applies                                                       | [optional] |
| **downloadResult** | <!----><!---->[**MuRescheduleResultWrapper**](MuRescheduleResultWrapper.md)<!----> | The agent schedules. Result will always come via the downloadUrl; however the schema is included for documentation | [optional] |
| **downloadUrl**    | <!----><!---->**String**<!---->                                                    | The download URL from which to fetch the result                                                                    | [optional] |

{: class="table table-striped"}
