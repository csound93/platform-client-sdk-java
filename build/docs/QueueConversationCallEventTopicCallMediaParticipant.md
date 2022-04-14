---
title: QueueConversationCallEventTopicCallMediaParticipant
---

## QueueConversationCallEventTopicCallMediaParticipant

## Properties

| Name                        | Type                                                                                                                                         | Description | Notes      |
| --------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **address**                 | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **startTime**               | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **connectedTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **endTime**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **startHoldTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **purpose**                 | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                                                                                           |             | [optional] |
| **direction**               | [**DirectionEnum**](#DirectionEnum)<!---->                                                                                                   |             | [optional] |
| **disconnectType**          | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!---->                                                                                         |             | [optional] |
| **held**                    | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **wrapupRequired**          | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **wrapupPrompt**            | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **user**                    | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **queue**                   | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **team**                    | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **attributes**              | <!----><!---->**Map&lt;String, String&gt;**<!---->                                                                                           |             | [optional] |
| **errorInfo**               | <!----><!---->[**QueueConversationCallEventTopicErrorBody**](QueueConversationCallEventTopicErrorBody.md)<!---->                             |             | [optional] |
| **script**                  | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapupTimeoutMs**         | <!----><!---->**Integer**<!---->                                                                                                             |             | [optional] |
| **wrapupSkipped**           | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **alertingTimeoutMs**       | <!----><!---->**Integer**<!---->                                                                                                             |             | [optional] |
| **provider**                | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **externalContact**         | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **externalOrganization**    | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapup**                  | <!----><!---->[**QueueConversationCallEventTopicWrapup**](QueueConversationCallEventTopicWrapup.md)<!---->                                   |             | [optional] |
| **conversationRoutingData** | <!----><!---->[**QueueConversationCallEventTopicConversationRoutingData**](QueueConversationCallEventTopicConversationRoutingData.md)<!----> |             | [optional] |
| **peer**                    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **screenRecordingState**    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **flaggedReason**           | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!---->                                                                                           |             | [optional] |
| **journeyContext**          | <!----><!---->[**QueueConversationCallEventTopicJourneyContext**](QueueConversationCallEventTopicJourneyContext.md)<!---->                   |             | [optional] |
| **startAcwTime**            | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **endAcwTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **muted**                   | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **confined**                | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **recording**               | <!----><!---->**Boolean**<!---->                                                                                                             |             | [optional] |
| **recordingState**          | [**RecordingStateEnum**](#RecordingStateEnum)<!---->                                                                                         |             | [optional] |
| **group**                   | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->                       |             | [optional] |
| **ani**                     | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **dnis**                    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **documentId**              | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **monitoredParticipantId**  | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **coachedParticipantId**    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **bargedParticipantId**     | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **bargedTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                     |             | [optional] |
| **consultParticipantId**    | <!----><!---->**String**<!---->                                                                                                              |             | [optional] |
| **faxStatus**               | <!----><!---->[**QueueConversationCallEventTopicFaxStatus**](QueueConversationCallEventTopicFaxStatus.md)<!---->                             |             | [optional] |

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

<a name="RecordingStateEnum"></a>

## Enum: RecordingStateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE               | &quot;none&quot;               |
| ACTIVE             | &quot;active&quot;             |
| PAUSED             | &quot;paused&quot;             |

{: class="table table-striped"}
