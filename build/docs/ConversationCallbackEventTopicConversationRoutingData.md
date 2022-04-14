---
title: ConversationCallbackEventTopicConversationRoutingData
---

## ConversationCallbackEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                             | Description                                                                                                                                   | Notes      |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**ConversationCallbackEventTopicUriReference**](ConversationCallbackEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                 | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;ConversationCallbackEventTopicUriReference&gt;**](ConversationCallbackEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationCallbackEventTopicScoredAgent&gt;**](ConversationCallbackEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
