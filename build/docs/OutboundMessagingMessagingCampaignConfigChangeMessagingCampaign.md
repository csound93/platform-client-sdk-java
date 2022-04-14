---
title: OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign
---

## OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign

## Properties

| Name                   | Type                                                                                                                                                             | Description                                                                             | Notes      |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **campaignStatus**     | [**CampaignStatusEnum**](#CampaignStatusEnum)<!---->                                                                                                             |                                                                                         | [optional] |
| **callableTimeSet**    | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.md)<!---->             |                                                                                         | [optional] |
| **contactList**        | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.md)<!---->             | A UriReference for a resource                                                           | [optional] |
| **dncLists**           | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference.md)<!----> | The dnc lists to check before sending a message for this messaging campaign.            | [optional] |
| **contactListFilters** | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeUriReference&gt;**](OutboundMessagingMessagingCampaignConfigChangeUriReference.md)<!----> | The contact list filters to check before sending a message for this messaging campaign. | [optional] |
| **alwaysRunning**      | <!----><!---->**Boolean**<!---->                                                                                                                                 | Whether this messaging campaign is always running.                                      | [optional] |
| **contactSorts**       | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeContactSort&gt;**](OutboundMessagingMessagingCampaignConfigChangeContactSort.md)<!---->   | The order in which to sort contacts for dialing, based on up to four columns.           | [optional] |
| **messagesPerMinute**  | <!----><!---->**Integer**<!---->                                                                                                                                 | How many messages this messaging campaign will send per minute.                         | [optional] |
| **smsConfig**          | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeSmsConfig**](OutboundMessagingMessagingCampaignConfigChangeSmsConfig.md)<!---->                   |                                                                                         | [optional] |
| **emailConfig**        | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeEmailConfig**](OutboundMessagingMessagingCampaignConfigChangeEmailConfig.md)<!---->               |                                                                                         | [optional] |
| **errors**             | <!----><!---->[**List&lt;OutboundMessagingMessagingCampaignConfigChangeErrorDetail&gt;**](OutboundMessagingMessagingCampaignConfigChangeErrorDetail.md)<!---->   | A list of current error conditions associated with this messaging campaign              | [optional] |
| **id**                 | <!----><!---->**String**<!---->                                                                                                                                  | The globally unique identifier for the object.                                          | [optional] |
| **division**           | <!----><!---->[**OutboundMessagingMessagingCampaignConfigChangeUriReference**](OutboundMessagingMessagingCampaignConfigChangeUriReference.md)<!---->             | A UriReference for a resource                                                           | [optional] |
| **name**               | <!----><!---->**String**<!---->                                                                                                                                  | The UI-visible name of the object                                                       | [optional] |
| **dateCreated**        | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         | Creation time of the entity                                                             | [optional] |
| **dateModified**       | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         | Last modified time of the entity                                                        | [optional] |
| **version**            | <!----><!---->**Integer**<!---->                                                                                                                                 | Required for updates, must match the version number of the most recent update           | [optional] |

{: class="table table-striped"}

<a name="CampaignStatusEnum"></a>

## Enum: CampaignStatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ON                 | &quot;on&quot;                 |
| OFF                | &quot;off&quot;                |
| COMPLETE           | &quot;complete&quot;           |
| STOPPING           | &quot;stopping&quot;           |
| INVALID            | &quot;invalid&quot;            |

{: class="table table-striped"}
