---
title: ConversationRoutingData
---

## ConversationRoutingData

## Properties

| Name             | Type                                                                                 | Description                                                                                                                                   | Notes      |
| ---------------- | ------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **queue**        | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->             | The queue to use for routing decisions                                                                                                        | [optional] |
| **language**     | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->             | The language to use for routing decisions                                                                                                     | [optional] |
| **priority**     | <!----><!---->**Integer**<!---->                                                     | The priority of the conversation to use for routing decisions                                                                                 | [optional] |
| **skills**       | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.md)<!----> | The skills to use for routing decisions                                                                                                       | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ScoredAgent&gt;**](ScoredAgent.md)<!---->                   | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents | [optional] |

{: class="table table-striped"}
