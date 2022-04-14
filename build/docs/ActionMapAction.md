---
title: ActionMapAction
---

## ActionMapAction

## Properties

| Name                        | Type                                                                           | Description                                                | Notes      |
| --------------------------- | ------------------------------------------------------------------------------ | ---------------------------------------------------------- | ---------- |
| **actionTemplate**          | <!----><!---->[**ActionMapActionTemplate**](ActionMapActionTemplate.md)<!----> | Action template associated with the action map.            | [optional] |
| **mediaType**               | [**MediaTypeEnum**](#MediaTypeEnum)<!---->                                     | Media type of action.                                      | [optional] |
| **architectFlowFields**     | <!----><!---->[**ArchitectFlowFields**](ArchitectFlowFields.md)<!---->         | Architect Flow Id and input contract.                      | [optional] |
| **webMessagingOfferFields** | <!----><!---->[**WebMessagingOfferFields**](WebMessagingOfferFields.md)<!----> | Admin-configurable fields of a web messaging offer action. | [optional] |
| **openActionFields**        | <!----><!---->[**OpenActionFields**](OpenActionFields.md)<!---->               | Admin-configurable fields of an open action.               | [optional] |

{: class="table table-striped"}

<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WEBCHAT            | &quot;webchat&quot;            |
| WEBMESSAGINGOFFER  | &quot;webMessagingOffer&quot;  |
| CONTENTOFFER       | &quot;contentOffer&quot;       |
| INTEGRATIONACTION  | &quot;integrationAction&quot;  |
| ARCHITECTFLOW      | &quot;architectFlow&quot;      |
| OPENACTION         | &quot;openAction&quot;         |

{: class="table table-striped"}
