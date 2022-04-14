---
title: ConversationEventTopicConversationRoutingData
---

## ConversationEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                             | Description                                                                                                                                   | Notes      |
| ---------------- | ---------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**ConversationEventTopicUriReference**](ConversationEventTopicUriReference.md)<!---->             |                                                                                                                                               | [optional] |
| **language**     | <!----><!---->[**ConversationEventTopicUriReference**](ConversationEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                 | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;ConversationEventTopicUriReference&gt;**](ConversationEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationEventTopicScoredAgent&gt;**](ConversationEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
