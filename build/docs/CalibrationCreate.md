---
title: CalibrationCreate
---

## CalibrationCreate

## Properties

| Name                | Type                                                             | Description                                                                             | Notes      |
| ------------------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**              | <!----><!---->**String**<!---->                                  | The globally unique identifier for the object.                                          | [optional] |
| **name**            | <!----><!---->**String**<!---->                                  |                                                                                         | [optional] |
| **calibrator**      | <!----><!---->[**User**](User.md)<!---->                         |                                                                                         | [optional] |
| **agent**           | <!----><!---->[**User**](User.md)<!---->                         |                                                                                         | [optional] |
| **conversation**    | <!----><!---->[**Conversation**](Conversation.md)<!---->         | The conversation to use for the calibration.                                            |            |
| **evaluationForm**  | <!----><!---->[**EvaluationForm**](EvaluationForm.md)<!---->     |                                                                                         | [optional] |
| **contextId**       | <!----><!---->**String**<!---->                                  |                                                                                         | [optional] |
| **averageScore**    | <!----><!---->**Integer**<!---->                                 |                                                                                         | [optional] |
| **highScore**       | <!----><!---->**Integer**<!---->                                 |                                                                                         | [optional] |
| **lowScore**        | <!----><!---->**Integer**<!---->                                 |                                                                                         | [optional] |
| **createdDate**     | <!----><!---->[**Date**](Date.md)<!---->                         | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **evaluations**     | <!----><!---->[**List&lt;Evaluation&gt;**](Evaluation.md)<!----> |                                                                                         | [optional] |
| **evaluators**      | <!----><!---->[**List&lt;User&gt;**](User.md)<!---->             |                                                                                         | [optional] |
| **scoringIndex**    | <!----><!---->[**Evaluation**](Evaluation.md)<!---->             |                                                                                         | [optional] |
| **expertEvaluator** | <!----><!---->[**User**](User.md)<!---->                         |                                                                                         | [optional] |
| **selfUri**         | <!----><!---->**String**<!---->                                  | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}
