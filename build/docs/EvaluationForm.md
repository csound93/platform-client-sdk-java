---
title: EvaluationForm
---

## EvaluationForm

## Properties

| Name                  | Type                                                                                               | Description                                                                             | Notes      |
| --------------------- | -------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**                | <!----><!---->**String**<!---->                                                                    | The globally unique identifier for the object.                                          | [optional] |
| **name**              | <!----><!---->**String**<!---->                                                                    | The evaluation form name                                                                |            |
| **modifiedDate**      | <!----><!---->[**Date**](Date.md)<!---->                                                           | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **published**         | <!----><!---->**Boolean**<!---->                                                                   |                                                                                         | [optional] |
| **contextId**         | <!----><!---->**String**<!---->                                                                    |                                                                                         | [optional] |
| **questionGroups**    | <!----><!---->[**List&lt;EvaluationQuestionGroup&gt;**](EvaluationQuestionGroup.md)<!---->         | A list of question groups                                                               |            |
| **publishedVersions** | <!----><!---->[**DomainEntityListingEvaluationForm**](DomainEntityListingEvaluationForm.md)<!----> |                                                                                         | [optional] |
| **selfUri**           | <!----><!---->**String**<!---->                                                                    | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}
