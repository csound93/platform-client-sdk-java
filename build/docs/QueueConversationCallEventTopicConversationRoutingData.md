---
title: QueueConversationCallEventTopicConversationRoutingData
---

## QueueConversationCallEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                               | Description                                                                                                                                   | Notes      |
| ---------------- | ---------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                   | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;QueueConversationCallEventTopicUriReference&gt;**](QueueConversationCallEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationCallEventTopicScoredAgent&gt;**](QueueConversationCallEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
