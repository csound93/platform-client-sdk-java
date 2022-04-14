---
title: QueueRequest
---

## QueueRequest

## Properties

| Name                           | Type                                                                           | Description                                                                                                                             | Notes      |
| ------------------------------ | ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                         | <!----><!---->**String**<!---->                                                | The globally unique identifier for the object.                                                                                          | [optional] |
| **name**                       | <!----><!---->**String**<!---->                                                | The queue name                                                                                                                          |            |
| **division**                   | <!----><!---->[**WritableDivision**](WritableDivision.md)<!---->               | The division to which this entity belongs.                                                                                              | [optional] |
| **description**                | <!----><!---->**String**<!---->                                                | The queue description.                                                                                                                  | [optional] |
| **dateCreated**                | <!----><!---->[**Date**](Date.md)<!---->                                       | The date the queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **dateModified**               | <!----><!---->[**Date**](Date.md)<!---->                                       | The date of the last modification to the queue. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**                 | <!----><!---->**String**<!---->                                                | The ID of the user that last modified the queue.                                                                                        | [optional] |
| **createdBy**                  | <!----><!---->**String**<!---->                                                | The ID of the user that created the queue.                                                                                              | [optional] |
| **memberCount**                | <!----><!---->**Integer**<!---->                                               | The total number of members in the queue.                                                                                               | [optional] |
| **userMemberCount**            | <!----><!---->**Integer**<!---->                                               | The number of user members (i.e., non-group members) in the queue.                                                                      | [optional] |
| **joinedMemberCount**          | <!----><!---->**Integer**<!---->                                               | The number of joined members in the queue.                                                                                              | [optional] |
| **mediaSettings**              | <!----><!---->[**Map&lt;String, MediaSetting&gt;**](MediaSetting.md)<!---->    | The media settings for the queue. Valid key values: CALL, CALLBACK, CHAT, EMAIL, MESSAGE, SOCIAL_EXPRESSION, VIDEO_COMM                 | [optional] |
| **routingRules**               | <!----><!---->[**List&lt;RoutingRule&gt;**](RoutingRule.md)<!---->             | The routing rules for the queue, used for routing to known or preferred agents.                                                         | [optional] |
| **bullseye**                   | <!----><!---->[**Bullseye**](Bullseye.md)<!---->                               | The bulls-eye settings for the queue.                                                                                                   | [optional] |
| **acwSettings**                | <!----><!---->[**AcwSettings**](AcwSettings.md)<!---->                         | The ACW settings for the queue.                                                                                                         | [optional] |
| **skillEvaluationMethod**      | [**SkillEvaluationMethodEnum**](#SkillEvaluationMethodEnum)<!---->             | The skill evaluation method to use when routing conversations.                                                                          | [optional] |
| **queueFlow**                  | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The in-queue flow to use for call conversations waiting in queue.                                                                       | [optional] |
| **emailInQueueFlow**           | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The in-queue flow to use for email conversations waiting in queue.                                                                      | [optional] |
| **messageInQueueFlow**         | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The in-queue flow to use for message conversations waiting in queue.                                                                    | [optional] |
| **whisperPrompt**              | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The prompt used for whisper on the queue, if configured.                                                                                | [optional] |
| **onHoldPrompt**               | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 | The audio to be played when calls on this queue are on hold. If not configured, the default on-hold music will play.                    | [optional] |
| **autoAnswerOnly**             | <!----><!---->**Boolean**<!---->                                               | Specifies whether the configured whisper should play for all ACD calls, or only for those which are auto-answered.                      | [optional] |
| **enableTranscription**        | <!----><!---->**Boolean**<!---->                                               | Indicates whether voice transcription is enabled for this queue.                                                                        | [optional] |
| **enableManualAssignment**     | <!----><!---->**Boolean**<!---->                                               | Indicates whether manual assignment is enabled for this queue.                                                                          | [optional] |
| **callingPartyName**           | <!----><!---->**String**<!---->                                                | The name to use for caller identification for outbound calls from this queue.                                                           | [optional] |
| **callingPartyNumber**         | <!----><!---->**String**<!---->                                                | The phone number to use for caller identification for outbound calls from this queue.                                                   | [optional] |
| **defaultScripts**             | <!----><!---->[**Map&lt;String, Script&gt;**](Script.md)<!---->                | The default script Ids for the communication types.                                                                                     | [optional] |
| **outboundMessagingAddresses** | <!----><!---->[**QueueMessagingAddresses**](QueueMessagingAddresses.md)<!----> | The messaging addresses for the queue.                                                                                                  | [optional] |
| **outboundEmailAddress**       | <!----><!---->[**QueueEmailAddress**](QueueEmailAddress.md)<!---->             |                                                                                                                                         | [optional] |
| **selfUri**                    | <!----><!---->**String**<!---->                                                | The URI for this object                                                                                                                 | [optional] |

{: class="table table-striped"}

<a name="SkillEvaluationMethodEnum"></a>

## Enum: SkillEvaluationMethodEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE               | &quot;NONE&quot;               |
| BEST               | &quot;BEST&quot;               |
| ALL                | &quot;ALL&quot;                |

{: class="table table-striped"}
