---
title: V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent
---

## V2ConversationMessageTypingEventForWorkflowTopicConversationMessageEvent

## Properties

| Name          | Type                                                                                                                                                                               | Description | Notes      |
| ------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!---->                                                                                                                                         |             | [optional] |
| **coBrowse**  | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationEventCoBrowse**](V2ConversationMessageTypingEventForWorkflowTopicConversationEventCoBrowse.md)<!----> |             | [optional] |
| **typing**    | <!----><!---->[**V2ConversationMessageTypingEventForWorkflowTopicConversationEventTyping**](V2ConversationMessageTypingEventForWorkflowTopicConversationEventTyping.md)<!---->     |             | [optional] |

{: class="table table-striped"}

<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| COBROWSE           | &quot;CoBrowse&quot;           |
| TYPING             | &quot;Typing&quot;             |

{: class="table table-striped"}
