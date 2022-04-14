---
title: PolicyActions
---

## PolicyActions

## Properties

| Name                               | Type                                                                                               | Description                                                                                                                                   | Notes      |
| ---------------------------------- | -------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **retainRecording**                | <!----><!---->**Boolean**<!---->                                                                   | true to retain the recording associated with the conversation. Default = true                                                                 | [optional] |
| **deleteRecording**                | <!----><!---->**Boolean**<!---->                                                                   | true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false               | [optional] |
| **alwaysDelete**                   | <!----><!---->**Boolean**<!---->                                                                   | true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false | [optional] |
| **assignEvaluations**              | <!----><!---->[**List&lt;EvaluationAssignment&gt;**](EvaluationAssignment.md)<!---->               |                                                                                                                                               | [optional] |
| **assignMeteredEvaluations**       | <!----><!---->[**List&lt;MeteredEvaluationAssignment&gt;**](MeteredEvaluationAssignment.md)<!----> |                                                                                                                                               | [optional] |
| **assignMeteredAssignmentByAgent** | <!----><!---->[**List&lt;MeteredAssignmentByAgent&gt;**](MeteredAssignmentByAgent.md)<!---->       |                                                                                                                                               | [optional] |
| **assignCalibrations**             | <!----><!---->[**List&lt;CalibrationAssignment&gt;**](CalibrationAssignment.md)<!---->             |                                                                                                                                               | [optional] |
| **assignSurveys**                  | <!----><!---->[**List&lt;SurveyAssignment&gt;**](SurveyAssignment.md)<!---->                       |                                                                                                                                               | [optional] |
| **retentionDuration**              | <!----><!---->[**RetentionDuration**](RetentionDuration.md)<!---->                                 |                                                                                                                                               | [optional] |
| **initiateScreenRecording**        | <!----><!---->[**InitiateScreenRecording**](InitiateScreenRecording.md)<!---->                     |                                                                                                                                               | [optional] |
| **mediaTranscriptions**            | <!----><!---->[**List&lt;MediaTranscription&gt;**](MediaTranscription.md)<!---->                   |                                                                                                                                               | [optional] |
| **integrationExport**              | <!----><!---->[**IntegrationExport**](IntegrationExport.md)<!---->                                 | Policy action for exporting recordings using an integration to 3rd party s3.                                                                  | [optional] |

{: class="table table-striped"}
