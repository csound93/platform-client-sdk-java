---
title: TextBotFlowLaunchRequest
---

## TextBotFlowLaunchRequest

## Properties

| Name                  | Type                                                                         | Description                                                                             | Notes      |
| --------------------- | ---------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **flow**              | <!----><!---->[**TextBotFlow**](TextBotFlow.md)<!---->                       | Specifies which Bot Flow to launch.                                                     |            |
| **externalSessionId** | <!----><!---->**String**<!---->                                              | The ID of the external session that is associated with the bot flow.                    |            |
| **conversationId**    | <!----><!---->**String**<!---->                                              | A conversation ID to associate with the bot flow, if available.                         | [optional] |
| **inputData**         | <!----><!---->[**TextBotInputOutputData**](TextBotInputOutputData.md)<!----> | Input values to the flow. Valid values are defined by the flow&#39;s input JSON schema. | [optional] |
| **channel**           | <!----><!---->[**TextBotChannel**](TextBotChannel.md)<!---->                 | Channel information relevant to the bot flow.                                           |            |

{: class="table table-striped"}
