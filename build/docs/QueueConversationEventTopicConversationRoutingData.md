---
title: QueueConversationEventTopicConversationRoutingData
---

## QueueConversationEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                       | Description                                                                                                                                   | Notes      |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**QueueConversationEventTopicUriReference**](QueueConversationEventTopicUriReference.md)<!---->             |                                                                                                                                               | [optional] |
| **language**     | <!----><!---->[**QueueConversationEventTopicUriReference**](QueueConversationEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                           | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;QueueConversationEventTopicUriReference&gt;**](QueueConversationEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationEventTopicScoredAgent&gt;**](QueueConversationEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
