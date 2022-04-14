---
title: QueueConversationMessageEventTopicConversationRoutingData
---

## QueueConversationMessageEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                                     | Description                                                                                                                                   | Notes      |
| ---------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                         | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;QueueConversationMessageEventTopicUriReference&gt;**](QueueConversationMessageEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationMessageEventTopicScoredAgent&gt;**](QueueConversationMessageEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
