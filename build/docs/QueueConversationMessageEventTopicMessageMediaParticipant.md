---
title: QueueConversationMessageEventTopicMessageMediaParticipant
---

## QueueConversationMessageEventTopicMessageMediaParticipant

## Properties

| Name                        | Type                                                                                                                                               | Description | Notes      |
| --------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **address**                 | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **startTime**               | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **connectedTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **endTime**                 | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **startHoldTime**           | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **purpose**                 | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                                                                                                 |             | [optional] |
| **direction**               | [**DirectionEnum**](#DirectionEnum)<!---->                                                                                                         |             | [optional] |
| **disconnectType**          | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!---->                                                                                               |             | [optional] |
| **held**                    | <!----><!---->**Boolean**<!---->                                                                                                                   |             | [optional] |
| **wrapupRequired**          | <!----><!---->**Boolean**<!---->                                                                                                                   |             | [optional] |
| **wrapupPrompt**            | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **user**                    | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **queue**                   | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **team**                    | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **attributes**              | <!----><!---->**Map&lt;String, String&gt;**<!---->                                                                                                 |             | [optional] |
| **errorInfo**               | <!----><!---->[**QueueConversationMessageEventTopicErrorBody**](QueueConversationMessageEventTopicErrorBody.md)<!---->                             |             | [optional] |
| **script**                  | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapupTimeoutMs**         | <!----><!---->**Integer**<!---->                                                                                                                   |             | [optional] |
| **wrapupSkipped**           | <!----><!---->**Boolean**<!---->                                                                                                                   |             | [optional] |
| **alertingTimeoutMs**       | <!----><!---->**Integer**<!---->                                                                                                                   |             | [optional] |
| **provider**                | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **externalContact**         | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **externalOrganization**    | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->                       |             | [optional] |
| **wrapup**                  | <!----><!---->[**QueueConversationMessageEventTopicWrapup**](QueueConversationMessageEventTopicWrapup.md)<!---->                                   |             | [optional] |
| **conversationRoutingData** | <!----><!---->[**QueueConversationMessageEventTopicConversationRoutingData**](QueueConversationMessageEventTopicConversationRoutingData.md)<!----> |             | [optional] |
| **peer**                    | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **screenRecordingState**    | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **flaggedReason**           | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!---->                                                                                                 |             | [optional] |
| **journeyContext**          | <!----><!---->[**QueueConversationMessageEventTopicJourneyContext**](QueueConversationMessageEventTopicJourneyContext.md)<!---->                   |             | [optional] |
| **startAcwTime**            | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **endAcwTime**              | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **messages**                | <!----><!---->[**List&lt;QueueConversationMessageEventTopicMessageDetails&gt;**](QueueConversationMessageEventTopicMessageDetails.md)<!---->       |             | [optional] |
| **type**                    | [**TypeEnum**](#TypeEnum)<!---->                                                                                                                   |             | [optional] |
| **recipientCountry**        | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **recipientType**           | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |

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

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN            | &quot;unknown&quot;            |
| SMS                | &quot;sms&quot;                |
| TWITTER            | &quot;twitter&quot;            |
| FACEBOOK           | &quot;facebook&quot;           |
| LINE               | &quot;line&quot;               |
| VIBER              | &quot;viber&quot;              |
| WECHAT             | &quot;wechat&quot;             |
| WHATSAPP           | &quot;whatsapp&quot;           |
| TELEGRAM           | &quot;telegram&quot;           |
| KAKAO              | &quot;kakao&quot;              |
| WEBMESSAGING       | &quot;webmessaging&quot;       |
| OPEN               | &quot;open&quot;               |
| INSTAGRAM          | &quot;instagram&quot;          |

{: class="table table-striped"}
