---
title: RoutingConversationAttributesResponse
---

## RoutingConversationAttributesResponse

## Properties

| Name             | Type                                                                 | Description                                                                  | Notes      |
| ---------------- | -------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------- |
| **priority**     | <!----><!---->**Integer**<!---->                                     | Current priority value on in-queue conversation. Range:[-25000000, 25000000] | [optional] |
| **skills**       | <!----><!---->[**List&lt;RoutingSkill&gt;**](RoutingSkill.md)<!----> | Current routing skills on in-queue conversation                              | [optional] |
| **language**     | <!----><!---->[**Language**](Language.md)<!---->                     | Current language on in-queue conversation                                    | [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ScoredAgent&gt;**](ScoredAgent.md)<!---->   | Current scored agents on in-queue conversation                               | [optional] |

{: class="table table-striped"}
