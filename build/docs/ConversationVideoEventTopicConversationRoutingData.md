---
title: ConversationVideoEventTopicConversationRoutingData
---

## ConversationVideoEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                       | Description                                                                                                                                   | Notes      |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**ConversationVideoEventTopicUriReference**](ConversationVideoEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**ConversationVideoEventTopicUriReference**](ConversationVideoEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                           | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;ConversationVideoEventTopicUriReference&gt;**](ConversationVideoEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationVideoEventTopicScoredAgent&gt;**](ConversationVideoEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
