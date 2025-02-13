---
title: KlaxonHeartBeatAlertsTopicHeartBeatAlert
---

## KlaxonHeartBeatAlertsTopicHeartBeatAlert

## Properties

| Name                          | Type                                                                                                                             | Description | Notes      |
| ----------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                        | <!----><!---->**String**<!---->                                                                                                  |             | [optional] |
| **name**                      | <!----><!---->**String**<!---->                                                                                                  |             | [optional] |
| **senderId**                  | <!----><!---->**String**<!---->                                                                                                  |             | [optional] |
| **heartBeatTimeoutInMinutes** | <!----><!---->[**BigDecimal**](BigDecimal.md)<!---->                                                                             |             | [optional] |
| **ruleId**                    | <!----><!---->**String**<!---->                                                                                                  |             | [optional] |
| **startDate**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                         |             | [optional] |
| **endDate**                   | <!----><!---->[**Date**](Date.md)<!---->                                                                                         |             | [optional] |
| **notificationUsers**         | <!----><!---->[**List&lt;KlaxonHeartBeatAlertsTopicNotificationUser&gt;**](KlaxonHeartBeatAlertsTopicNotificationUser.md)<!----> |             | [optional] |
| **alertTypes**                | <!---->[**List&lt;AlertTypesEnum&gt;**](#AlertTypesEnum)<!---->                                                                  |             | [optional] |
| **ruleType**                  | [**RuleTypeEnum**](#RuleTypeEnum)<!---->                                                                                         |             | [optional] |

{: class="table table-striped"}

<a name="AlertTypesEnum"></a>

## Enum: AlertTypesEnum

| Name   | Value              |
| ------ | ------------------ |
| SMS    | &quot;SMS&quot;    |
| DEVICE | &quot;DEVICE&quot; |
| EMAIL  | &quot;EMAIL&quot;  |

{: class="table table-striped"}

<a name="RuleTypeEnum"></a>

## Enum: RuleTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EDGE               | &quot;EDGE&quot;               |

{: class="table table-striped"}
