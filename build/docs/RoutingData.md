---
title: RoutingData
---

## RoutingData

## Properties

| Name                  | Type                                                               | Description                                                        | Notes      |
| --------------------- | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ---------- |
| **queueId**           | <!----><!---->**String**<!---->                                    | The identifier of the routing queue                                |            |
| **languageId**        | <!----><!---->**String**<!---->                                    | The identifier of a language to be considered in routing           | [optional] |
| **priority**          | <!----><!---->**Integer**<!---->                                   | The priority for routing                                           | [optional] |
| **skillIds**          | <!----><!---->**List&lt;String&gt;**<!---->                        | A list of skill identifiers to be considered in routing            | [optional] |
| **preferredAgentIds** | <!----><!---->**List&lt;String&gt;**<!---->                        | A list of agents to be preferred in routing                        | [optional] |
| **scoredAgents**      | <!----><!---->[**List&lt;ScoredAgent&gt;**](ScoredAgent.md)<!----> | A list of scored agents for routing decisions                      | [optional] |
| **routingFlags**      | <!----><!---->**List&lt;String&gt;**<!---->                        | An array of flags indicating how the conversation should be routed | [optional] |

{: class="table table-striped"}
