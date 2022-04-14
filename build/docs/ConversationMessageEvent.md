---
title: ConversationMessageEvent
---

## ConversationMessageEvent

## Properties

| Name          | Type                                                                               | Description                | Notes      |
| ------------- | ---------------------------------------------------------------------------------- | -------------------------- | ---------- |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!---->                                         | Type of this event element |            |
| **coBrowse**  | <!----><!---->[**ConversationEventCoBrowse**](ConversationEventCoBrowse.md)<!----> | CoBrowse event.            | [optional] |
| **typing**    | <!----><!---->[**ConversationEventTyping**](ConversationEventTyping.md)<!---->     | Typing event.              | [optional] |
| **presence**  | <!----><!---->[**ConversationEventPresence**](ConversationEventPresence.md)<!----> | Presence event.            | [optional] |

{: class="table table-striped"}

<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| COBROWSE           | &quot;CoBrowse&quot;           |
| TYPING             | &quot;Typing&quot;             |
| PRESENCE           | &quot;Presence&quot;           |
| UNKNOWN            | &quot;Unknown&quot;            |

{: class="table table-striped"}
