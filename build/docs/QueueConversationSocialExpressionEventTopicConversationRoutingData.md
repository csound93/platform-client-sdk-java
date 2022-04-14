---
title: QueueConversationSocialExpressionEventTopicConversationRoutingData
---

## QueueConversationSocialExpressionEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                                                       | Description                                                                                                                                   | Notes      |
| ---------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**QueueConversationSocialExpressionEventTopicUriReference**](QueueConversationSocialExpressionEventTopicUriReference.md)<!---->             |                                                                                                                                               | [optional] |
| **language**     | <!----><!---->[**QueueConversationSocialExpressionEventTopicUriReference**](QueueConversationSocialExpressionEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                                           | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicUriReference&gt;**](QueueConversationSocialExpressionEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicScoredAgent&gt;**](QueueConversationSocialExpressionEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
