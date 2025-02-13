---
title: ChatMediaParticipant
---

## ChatMediaParticipant

## Properties

| Name                        | Type                                                                           | Description                                                                                                                                                                                         | Notes      |
| --------------------------- | ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                      | <!----><!---->**String**<!---->                                                | The unique participant ID.                                                                                                                                                                          | [optional] |
| **name**                    | <!----><!---->**String**<!---->                                                | The display friendly name of the participant.                                                                                                                                                       | [optional] |
| **address**                 | <!----><!---->**String**<!---->                                                | The participant address.                                                                                                                                                                            | [optional] |
| **startTime**               | <!----><!---->[**Date**](Date.md)<!---->                                       | The time when this participant first joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                                               | [optional] |
| **connectedTime**           | <!----><!---->[**Date**](Date.md)<!---->                                       | The time when this participant went connected for this media (eg: video connected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                    | [optional] |
| **endTime**                 | <!----><!---->[**Date**](Date.md)<!---->                                       | The time when this participant went disconnected for this media (eg: video disconnected time). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z              | [optional] |
| **startHoldTime**           | <!----><!---->[**Date**](Date.md)<!---->                                       | The time when this participant&#39;s hold started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                                                          | [optional] |
| **purpose**                 | <!----><!---->**String**<!---->                                                | The participant&#39;s purpose. Values can be: &#39;agent&#39;, &#39;user&#39;, &#39;customer&#39;, &#39;external&#39;, &#39;acd&#39;, &#39;ivr                                                      | [optional] |
| **state**                   | [**StateEnum**](#StateEnum)<!---->                                             | The participant&#39;s state. Values can be: &#39;alerting&#39;, &#39;connected&#39;, &#39;disconnected&#39;, &#39;dialing&#39;, &#39;contacting                                                     | [optional] |
| **direction**               | [**DirectionEnum**](#DirectionEnum)<!---->                                     | The participant&#39;s direction. Values can be: &#39;inbound&#39; or &#39;outbound&#39;                                                                                                             | [optional] |
| **disconnectType**          | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!---->                           | The reason the participant was disconnected from the conversation.                                                                                                                                  | [optional] |
| **held**                    | <!----><!---->**Boolean**<!---->                                               | Value is true when the participant is on hold.                                                                                                                                                      | [optional] |
| **wrapupRequired**          | <!----><!---->**Boolean**<!---->                                               | Value is true when the participant requires wrap-up.                                                                                                                                                | [optional] |
| **wrapupPrompt**            | <!----><!---->**String**<!---->                                                | The wrap-up prompt indicating the type of wrap-up to be performed.                                                                                                                                  | [optional] |
| **user**                    | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The PureCloud user for this participant.                                                                                                                                                            | [optional] |
| **queue**                   | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The PureCloud queue for this participant.                                                                                                                                                           | [optional] |
| **team**                    | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The PureCloud team for this participant.                                                                                                                                                            | [optional] |
| **attributes**              | <!----><!---->**Map&lt;String, String&gt;**<!---->                             | A list of ad-hoc attributes for the participant.                                                                                                                                                    | [optional] |
| **errorInfo**               | <!----><!---->[**ErrorInfo**](ErrorInfo.md)<!---->                             | If the conversation ends in error, contains additional error details.                                                                                                                               | [optional] |
| **script**                  | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The Engage script that should be used by this participant.                                                                                                                                          | [optional] |
| **wrapupTimeoutMs**         | <!----><!---->**Integer**<!---->                                               | The amount of time the participant has to complete wrap-up.                                                                                                                                         | [optional] |
| **wrapupSkipped**           | <!----><!---->**Boolean**<!---->                                               | Value is true when the participant has skipped wrap-up.                                                                                                                                             | [optional] |
| **alertingTimeoutMs**       | <!----><!---->**Integer**<!---->                                               | Specifies how long the agent has to answer an interaction before being marked as not responding.                                                                                                    | [optional] |
| **provider**                | <!----><!---->**String**<!---->                                                | The source provider for the communication.                                                                                                                                                          | [optional] |
| **externalContact**         | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | If this participant represents an external contact, then this will be the reference for the external contact.                                                                                       | [optional] |
| **externalOrganization**    | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | If this participant represents an external org, then this will be the reference for the external org.                                                                                               | [optional] |
| **wrapup**                  | <!----><!---->[**Wrapup**](Wrapup.md)<!---->                                   | Wrapup for this participant, if it has been applied.                                                                                                                                                | [optional] |
| **peer**                    | <!----><!---->**String**<!---->                                                | The peer communication corresponding to a matching leg for this communication.                                                                                                                      | [optional] |
| **flaggedReason**           | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!---->                             | The reason specifying why participant flagged the conversation.                                                                                                                                     | [optional] |
| **journeyContext**          | <!----><!---->[**JourneyContext**](JourneyContext.md)<!---->                   | Journey System data/context that is applicable to this communication. When used for historical purposes, the context should be immutable. When null, there is no applicable Journey System context. | [optional] |
| **conversationRoutingData** | <!----><!---->[**ConversationRoutingData**](ConversationRoutingData.md)<!----> | Information on how a communication should be routed to an agent.                                                                                                                                    | [optional] |
| **startAcwTime**            | <!----><!---->[**Date**](Date.md)<!---->                                       | The timestamp when this participant started after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                                                | [optional] |
| **endAcwTime**              | <!----><!---->[**Date**](Date.md)<!---->                                       | The timestamp when this participant ended after-call work. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                                                  | [optional] |
| **roomId**                  | <!----><!---->**String**<!---->                                                | The ID of the chat room.                                                                                                                                                                            | [optional] |
| **avatarImageUrl**          | <!----><!---->**String**<!---->                                                | If available, the URI to the avatar image of this communication.                                                                                                                                    | [optional] |

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

{: class="table table-striped"}

<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GENERAL            | &quot;general&quot;            |

{: class="table table-striped"}
