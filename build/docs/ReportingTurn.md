---
title: ReportingTurn
---

## ReportingTurn

## Properties

| Name                | Type                                                                         | Description                                                                                                                                      | Notes      |
| ------------------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **userInput**       | <!----><!---->**String**<!---->                                              | The chosen user input associated with this reporting turn.                                                                                       | [optional] |
| **botPrompts**      | <!----><!---->**List&lt;String&gt;**<!---->                                  | The bot prompts associated with this reporting turn.                                                                                             | [optional] |
| **sessionId**       | <!----><!---->**String**<!---->                                              | The bot session ID that this reporting turn is grouped under.                                                                                    | [optional] |
| **askAction**       | <!----><!---->[**ReportingTurnAction**](ReportingTurnAction.md)<!---->       | The bot flow &#39;ask&#39; action associated with this reporting turn (e.g. AskForIntent).                                                       | [optional] |
| **intent**          | <!----><!---->[**ReportingTurnIntent**](ReportingTurnIntent.md)<!---->       | The intent and associated slots detected during this reporting turn.                                                                             | [optional] |
| **knowledge**       | <!----><!---->[**ReportingTurnKnowledge**](ReportingTurnKnowledge.md)<!----> | The knowledge data captured during this reporting turn.                                                                                          | [optional] |
| **dateCreated**     | <!----><!---->[**Date**](Date.md)<!---->                                     | Timestamp indicating when the original turn was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **askActionResult** | [**AskActionResultEnum**](#AskActionResultEnum)<!---->                       | Result of the bot flow &#39;ask&#39; action.                                                                                                     | [optional] |
| **conversation**    | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->     | The conversation details, across potentially multiple Bot Flow sessions.                                                                         | [optional] |

{: class="table table-striped"}

<a name="AskActionResultEnum"></a>

## Enum: AskActionResultEnum

| Name                      | Value                                 |
| ------------------------- | ------------------------------------- |
| OUTDATEDSDKVERSION        | &quot;OutdatedSdkVersion&quot;        |
| SUCCESSCOLLECTION         | &quot;SuccessCollection&quot;         |
| SUCCESSCONFIRMATIONYES    | &quot;SuccessConfirmationYes&quot;    |
| SUCCESSCONFIRMATIONNO     | &quot;SuccessConfirmationNo&quot;     |
| NOMATCHCOLLECTION         | &quot;NoMatchCollection&quot;         |
| NOMATCHCONFIRMATION       | &quot;NoMatchConfirmation&quot;       |
| AGENTREQUESTEDBYUSER      | &quot;AgentRequestedByUser&quot;      |
| CONFIRMATIONREQUIRED      | &quot;ConfirmationRequired&quot;      |
| ERROR                     | &quot;Error&quot;                     |
| EXPRESSIONERROR           | &quot;ExpressionError&quot;           |
| NOINPUTCOLLECTION         | &quot;NoInputCollection&quot;         |
| NOINPUTCONFIRMATION       | &quot;NoInputConfirmation&quot;       |
| DISAMBIGUATIONREQUIRED    | &quot;DisambiguationRequired&quot;    |
| SUCCESSDISAMBIGUATION     | &quot;SuccessDisambiguation&quot;     |
| SUCCESSDISAMBIGUATIONNONE | &quot;SuccessDisambiguationNone&quot; |
| NOMATCHDISAMBIGUATION     | &quot;NoMatchDisambiguation&quot;     |
| NOINPUTDISAMBIGUATION     | &quot;NoInputDisambiguation&quot;     |

{: class="table table-striped"}
