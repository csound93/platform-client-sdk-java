---
title: SurveyAggregationView
---

## SurveyAggregationView

## Properties

| Name         | Type                                                             | Description                                                                               | Notes      |
| ------------ | ---------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ---------- |
| **target**   | [**TargetEnum**](#TargetEnum)<!---->                             | Target metric name                                                                        |            |
| **name**     | <!----><!---->**String**<!---->                                  | A unique name for this view. Must be distinct from other views and built-in metric names. |            |
| **function** | [**FunctionEnum**](#FunctionEnum)<!---->                         | Type of view you wish to create                                                           |            |
| **range**    | <!----><!---->[**AggregationRange**](AggregationRange.md)<!----> | Range of numbers for slicing up data                                                      | [optional] |

{: class="table table-striped"}

<a name="TargetEnum"></a>

## Enum: TargetEnum

| Name                          | Value                                     |
| ----------------------------- | ----------------------------------------- |
| OUTDATEDSDKVERSION            | &quot;OutdatedSdkVersion&quot;            |
| NSURVEYERRORS                 | &quot;nSurveyErrors&quot;                 |
| NSURVEYNPSDETRACTORS          | &quot;nSurveyNpsDetractors&quot;          |
| NSURVEYNPSPROMOTERS           | &quot;nSurveyNpsPromoters&quot;           |
| NSURVEYNPSRESPONSES           | &quot;nSurveyNpsResponses&quot;           |
| NSURVEYQUESTIONGROUPRESPONSES | &quot;nSurveyQuestionGroupResponses&quot; |
| NSURVEYQUESTIONRESPONSES      | &quot;nSurveyQuestionResponses&quot;      |
| NSURVEYRESPONSES              | &quot;nSurveyResponses&quot;              |
| NSURVEYSABANDONED             | &quot;nSurveysAbandoned&quot;             |
| NSURVEYSDELETED               | &quot;nSurveysDeleted&quot;               |
| NSURVEYSEXPIRED               | &quot;nSurveysExpired&quot;               |
| NSURVEYSSENT                  | &quot;nSurveysSent&quot;                  |
| NSURVEYSSTARTED               | &quot;nSurveysStarted&quot;               |
| OSURVEYQUESTIONGROUPSCORE     | &quot;oSurveyQuestionGroupScore&quot;     |
| OSURVEYQUESTIONSCORE          | &quot;oSurveyQuestionScore&quot;          |
| OSURVEYTOTALSCORE             | &quot;oSurveyTotalScore&quot;             |

{: class="table table-striped"}

<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RANGEBOUND         | &quot;rangeBound&quot;         |

{: class="table table-striped"}
