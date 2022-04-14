---
title: CampaignRuleAction
---

## CampaignRuleAction

## Properties

| Name                           | Type                                                                                 | Description                                                                  | Notes      |
| ------------------------------ | ------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------- | ---------- |
| **id**                         | <!----><!---->**String**<!---->                                                      |                                                                              | [optional] |
| **parameters**                 | <!----><!---->[**CampaignRuleParameters**](CampaignRuleParameters.md)<!---->         | The parameters for the CampaignRuleAction. Required for certain actionTypes. | [optional] |
| **actionType**                 | [**ActionTypeEnum**](#ActionTypeEnum)<!---->                                         | The action to take on the campaignRuleActionEntities.                        |            |
| **campaignRuleActionEntities** | <!----><!---->[**CampaignRuleActionEntities**](CampaignRuleActionEntities.md)<!----> | The list of entities that this action will apply to.                         |            |

{: class="table table-striped"}

<a name="ActionTypeEnum"></a>

## Enum: ActionTypeEnum

| Name                   | Value                              |
| ---------------------- | ---------------------------------- |
| OUTDATEDSDKVERSION     | &quot;OutdatedSdkVersion&quot;     |
| TURNONCAMPAIGN         | &quot;turnOnCampaign&quot;         |
| TURNOFFCAMPAIGN        | &quot;turnOffCampaign&quot;        |
| TURNONSEQUENCE         | &quot;turnOnSequence&quot;         |
| TURNOFFSEQUENCE        | &quot;turnOffSequence&quot;        |
| SETCAMPAIGNPRIORITY    | &quot;setCampaignPriority&quot;    |
| RECYCLECAMPAIGN        | &quot;recycleCampaign&quot;        |
| SETCAMPAIGNDIALINGMODE | &quot;setCampaignDialingMode&quot; |

{: class="table table-striped"}
