---
title: QueueConversationScreenShareEventTopicConversationRoutingData
---

## QueueConversationScreenShareEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                                             | Description                                                                                                                                   | Notes      |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**QueueConversationScreenShareEventTopicUriReference**](QueueConversationScreenShareEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**QueueConversationScreenShareEventTopicUriReference**](QueueConversationScreenShareEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                                 | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;QueueConversationScreenShareEventTopicUriReference&gt;**](QueueConversationScreenShareEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationScreenShareEventTopicScoredAgent&gt;**](QueueConversationScreenShareEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
