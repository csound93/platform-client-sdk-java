---
title: DialerCampaignRuleConfigChangeCampaignRule
---

## DialerCampaignRuleConfigChangeCampaignRule

## Properties

| Name                       | Type                                                                                                                                               | Description                                                                                         | Notes      |
| -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | ---------- |
| **campaignRuleEntities**   | <!----><!---->[**DialerCampaignRuleConfigChangeCampaignRuleEntities**](DialerCampaignRuleConfigChangeCampaignRuleEntities.md)<!---->               |                                                                                                     | [optional] |
| **campaignRuleConditions** | <!----><!---->[**List&lt;DialerCampaignRuleConfigChangeCampaignRuleCondition&gt;**](DialerCampaignRuleConfigChangeCampaignRuleCondition.md)<!----> | The list of conditions that will trigger this Campaign Rule                                         | [optional] |
| **campaignRuleActions**    | <!----><!---->[**List&lt;DialerCampaignRuleConfigChangeCampaignRuleAction&gt;**](DialerCampaignRuleConfigChangeCampaignRuleAction.md)<!---->       | The list of actions that will be taken when this Campaign Rule&#39;s conditions are met             | [optional] |
| **matchAnyConditions**     | <!----><!---->**Boolean**<!---->                                                                                                                   | Whether this Campaign Rule should match any conditions (inclusive OR) or match all conditions (ALL) | [optional] |
| **enabled**                | <!----><!---->**Boolean**<!---->                                                                                                                   | Whether this campaign rule is enabled                                                               | [optional] |
| **id**                     | <!----><!---->**String**<!---->                                                                                                                    | The globally unique identifier for the object.                                                      | [optional] |
| **name**                   | <!----><!---->**String**<!---->                                                                                                                    | The UI-visible name of the object                                                                   | [optional] |
| **dateCreated**            | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           | Creation time of the entity                                                                         | [optional] |
| **dateModified**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           | Last modified time of the entity                                                                    | [optional] |
| **version**                | <!----><!---->**Integer**<!---->                                                                                                                   | Required for updates, must match the version number of the most recent update                       | [optional] |

{: class="table table-striped"}
