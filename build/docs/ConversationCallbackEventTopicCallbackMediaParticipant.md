---
title: ConversationCallbackEventTopicCallbackMediaParticipant
---

## ConversationCallbackEventTopicCallbackMediaParticipant

## Properties

| Name                          | Type                                                                                                                                       | Description | Notes      |
| ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                        | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **name**                      | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **address**                   | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **startTime**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **connectedTime**             | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **endTime**                   | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **startHoldTime**             | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **purpose**                   | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **state**                     | [**StateEnum**](#StateEnum)<!---->                                                                                                         |             | [optional] |
| **direction**                 | [**DirectionEnum**](#DirectionEnum)<!---->                                                                                                 |             | [optional] |
| **disconnectType**            | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!---->                                                                                       |             | [optional] |
| **held**                      | <!----><!---->**Boolean**<!---->                                                                                                           |             | [optional] |
| **wrapupRequired**            | <!----><!---->**Boolean**<!---->                                                                                                           |             | [optional] |
| **wrapupPrompt**              | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **user**                      | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **queue**                     | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **team**                      | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **attributes**                | <!----><!---->**Map&lt;String, String&gt;**<!---->                                                                                         |             | [optional] |
| **errorInfo**                 | <!----><!---->[**ConversationCallbackEventTopicErrorBody**](ConversationCallbackEventTopicErrorBody.md)<!---->                             |             | [optional] |
| **script**                    | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapupTimeoutMs**           | <!----><!---->**Integer**<!---->                                                                                                           |             | [optional] |
| **wrapupSkipped**             | <!----><!---->**Boolean**<!---->                                                                                                           |             | [optional] |
| **alertingTimeoutMs**         | <!----><!---->**Integer**<!---->                                                                                                           |             | [optional] |
| **provider**                  | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **externalContact**           | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **externalOrganization**      | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapup**                    | <!----><!---->[**ConversationCallbackEventTopicWrapup**](ConversationCallbackEventTopicWrapup.md)<!---->                                   |             | [optional] |
| **conversationRoutingData**   | <!----><!---->[**ConversationCallbackEventTopicConversationRoutingData**](ConversationCallbackEventTopicConversationRoutingData.md)<!----> |             | [optional] |
| **peer**                      | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **screenRecordingState**      | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **flaggedReason**             | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!---->                                                                                         |             | [optional] |
| **journeyContext**            | <!----><!---->[**ConversationCallbackEventTopicJourneyContext**](ConversationCallbackEventTopicJourneyContext.md)<!---->                   |             | [optional] |
| **startAcwTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **endAcwTime**                | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **outboundPreview**           | <!----><!---->[**ConversationCallbackEventTopicDialerPreview**](ConversationCallbackEventTopicDialerPreview.md)<!---->                     |             | [optional] |
| **voicemail**                 | <!----><!---->[**ConversationCallbackEventTopicVoicemail**](ConversationCallbackEventTopicVoicemail.md)<!---->                             |             | [optional] |
| **callbackNumbers**           | <!----><!---->**List&lt;String&gt;**<!---->                                                                                                |             | [optional] |
| **callbackUserName**          | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |
| **skipEnabled**               | <!----><!---->**Boolean**<!---->                                                                                                           |             | [optional] |
| **externalCampaign**          | <!----><!---->**Boolean**<!---->                                                                                                           |             | [optional] |
| **timeoutSeconds**            | <!----><!---->**Integer**<!---->                                                                                                           |             | [optional] |
| **callbackScheduledTime**     | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   |             | [optional] |
| **automatedCallbackConfigId** | <!----><!---->**String**<!---->                                                                                                            |             | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING           | &quot;alerting&quot;           |
| DIALING            | &quot;dialing&quot;            |
| CONTACTING         | &quot;contacting&quot;         |
| OFFERING           | &quot;offering&quot;           |
| CONNECTED          | &quot;connected&quot;          |
| DISCONNECTED       | &quot;disconnected&quot;       |
| TERMINATED         | &quot;terminated&quot;         |
| CONVERTING         | &quot;converting&quot;         |
| UPLOADING          | &quot;uploading&quot;          |
| TRANSMITTING       | &quot;transmitting&quot;       |
| SCHEDULED          | &quot;scheduled&quot;          |
| NONE               | &quot;none&quot;               |

{: class="table table-striped"}

<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND            | &quot;inbound&quot;            |
| OUTBOUND           | &quot;outbound&quot;           |

{: class="table table-striped"}

<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name                  | Value                             |
| --------------------- | --------------------------------- |
| OUTDATEDSDKVERSION    | &quot;OutdatedSdkVersion&quot;    |
| ENDPOINT              | &quot;endpoint&quot;              |
| CLIENT                | &quot;client&quot;                |
| SYSTEM                | &quot;system&quot;                |
| TRANSFER              | &quot;transfer&quot;              |
| TIMEOUT               | &quot;timeout&quot;               |
| TRANSFER_CONFERENCE   | &quot;transfer.conference&quot;   |
| TRANSFER_CONSULT      | &quot;transfer.consult&quot;      |
| TRANSFER_FORWARD      | &quot;transfer.forward&quot;      |
| TRANSFER_NOANSWER     | &quot;transfer.noanswer&quot;     |
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; |
| TRANSPORT_FAILURE     | &quot;transport.failure&quot;     |
| ERROR                 | &quot;error&quot;                 |
| PEER                  | &quot;peer&quot;                  |
| OTHER                 | &quot;other&quot;                 |
| SPAM                  | &quot;spam&quot;                  |
| UNCALLABLE            | &quot;uncallable&quot;            |

{: class="table table-striped"}

<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GENERAL            | &quot;general&quot;            |

{: class="table table-striped"}
