---
title: ConversationScreenShareEventTopicScreenShareMediaParticipant
---

## ConversationScreenShareEventTopicScreenShareMediaParticipant

## Properties

| Name                        | Type                                                                                                                                             | Description | Notes      |
| --------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **address**                 | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **startTime**               | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **connectedTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **endTime**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **startHoldTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **purpose**                 | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                                                                                               |             | [optional] |
| **direction**               | [**DirectionEnum**](#DirectionEnum)<!---->                                                                                                       |             | [optional] |
| **disconnectType**          | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!---->                                                                                             |             | [optional] |
| **held**                    | <!----><!---->**Boolean**<!---->                                                                                                                 |             | [optional] |
| **wrapupRequired**          | <!----><!---->**Boolean**<!---->                                                                                                                 |             | [optional] |
| **wrapupPrompt**            | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **user**                    | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **queue**                   | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **team**                    | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **attributes**              | <!----><!---->**Map&lt;String, String&gt;**<!---->                                                                                               |             | [optional] |
| **errorInfo**               | <!----><!---->[**ConversationScreenShareEventTopicErrorBody**](ConversationScreenShareEventTopicErrorBody.md)<!---->                             |             | [optional] |
| **script**                  | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapupTimeoutMs**         | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **wrapupSkipped**           | <!----><!---->**Boolean**<!---->                                                                                                                 |             | [optional] |
| **alertingTimeoutMs**       | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **provider**                | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **externalContact**         | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **externalOrganization**    | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapup**                  | <!----><!---->[**ConversationScreenShareEventTopicWrapup**](ConversationScreenShareEventTopicWrapup.md)<!---->                                   |             | [optional] |
| **conversationRoutingData** | <!----><!---->[**ConversationScreenShareEventTopicConversationRoutingData**](ConversationScreenShareEventTopicConversationRoutingData.md)<!----> |             | [optional] |
| **peer**                    | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **screenRecordingState**    | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **flaggedReason**           | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!---->                                                                                               |             | [optional] |
| **journeyContext**          | <!----><!---->[**ConversationScreenShareEventTopicJourneyContext**](ConversationScreenShareEventTopicJourneyContext.md)<!---->                   |             | [optional] |
| **startAcwTime**            | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **endAcwTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         |             | [optional] |
| **context**                 | <!----><!---->**String**<!---->                                                                                                                  |             | [optional] |
| **peerCount**               | <!----><!---->**Integer**<!---->                                                                                                                 |             | [optional] |
| **sharing**                 | <!----><!---->**Boolean**<!---->                                                                                                                 |             | [optional] |

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
