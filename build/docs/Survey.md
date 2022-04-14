---
title: Survey
---

## Survey

## Properties

| Name                   | Type                                                                 | Description                                                                             | Notes      |
| ---------------------- | -------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | ---------- |
| **id**                 | <!----><!---->**String**<!---->                                      | The globally unique identifier for the object.                                          | [optional] |
| **name**               | <!----><!---->**String**<!---->                                      |                                                                                         | [optional] |
| **conversation**       | <!----><!---->[**Conversation**](Conversation.md)<!---->             |                                                                                         | [optional] |
| **surveyForm**         | <!----><!---->[**SurveyForm**](SurveyForm.md)<!---->                 | Survey form used for this survey.                                                       | [optional] |
| **agent**              | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->       |                                                                                         | [optional] |
| **status**             | [**StatusEnum**](#StatusEnum)<!---->                                 |                                                                                         | [optional] |
| **queue**              | <!----><!---->[**QueueReference**](QueueReference.md)<!---->         |                                                                                         | [optional] |
| **answers**            | <!----><!---->[**SurveyScoringSet**](SurveyScoringSet.md)<!---->     |                                                                                         | [optional] |
| **completedDate**      | <!----><!---->[**Date**](Date.md)<!---->                             | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **surveyErrorDetails** | <!----><!---->[**SurveyErrorDetails**](SurveyErrorDetails.md)<!----> | Additional information about what happened when the survey is in Error status.          | [optional] |
| **selfUri**            | <!----><!---->**String**<!---->                                      | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PENDING            | &quot;Pending&quot;            |
| SENT               | &quot;Sent&quot;               |
| INPROGRESS         | &quot;InProgress&quot;         |
| FINISHED           | &quot;Finished&quot;           |
| OPTOUT             | &quot;OptOut&quot;             |
| ERROR              | &quot;Error&quot;              |
| EXPIRED            | &quot;Expired&quot;            |

{: class="table table-striped"}
