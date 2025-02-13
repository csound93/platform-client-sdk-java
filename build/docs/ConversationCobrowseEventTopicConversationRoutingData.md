---
title: ConversationCobrowseEventTopicConversationRoutingData
---

## ConversationCobrowseEventTopicConversationRoutingData

## Properties

| Name             | Type                                                                                                                             | Description                                                                                                                                   | Notes      |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**ConversationCobrowseEventTopicUriReference**](ConversationCobrowseEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **language**     | <!----><!---->[**ConversationCobrowseEventTopicUriReference**](ConversationCobrowseEventTopicUriReference.md)<!---->             | A UriReference for a resource                                                                                                                 | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                                                                 | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;ConversationCobrowseEventTopicUriReference&gt;**](ConversationCobrowseEventTopicUriReference.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationCobrowseEventTopicScoredAgent&gt;**](ConversationCobrowseEventTopicScoredAgent.md)<!---->   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
