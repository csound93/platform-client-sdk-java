---
title: SurveyAggregationQuery
---

## SurveyAggregationQuery

## Properties

| Name                             | Type                                                                                   | Description                                                                                                                                                                                                                                                                                                           | Notes      |
| -------------------------------- | -------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **interval**                     | <!----><!---->**String**<!---->                                                        | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss                                                                                                                |            |
| **granularity**                  | <!----><!---->**String**<!---->                                                        | Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H                                                                                        | [optional] |
| **timeZone**                     | <!----><!---->**String**<!---->                                                        | Time zone context used to calculate response intervals (this allows resolving DST changes). The interval offset is used even when timeZone is specified. Default is UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London | [optional] |
| **groupBy**                      | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!---->                              | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.                                                                               | [optional] |
| **filter**                       | <!----><!---->[**SurveyAggregateQueryFilter**](SurveyAggregateQueryFilter.md)<!---->   | Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters                                                                                                                                                                       | [optional] |
| **metrics**                      | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!---->                              | Behaves like a SQL SELECT clause. Only named metrics will be retrieved.                                                                                                                                                                                                                                               |            |
| **flattenMultivaluedDimensions** | <!----><!---->**Boolean**<!---->                                                       | Flattens any multivalued dimensions used in response groups (e.g. [&#39;a&#39;,&#39;b&#39;,&#39;c&#39;]-&gt;&#39;a,b,c&#39;)                                                                                                                                                                                          | [optional] |
| **views**                        | <!----><!---->[**List&lt;SurveyAggregationView&gt;**](SurveyAggregationView.md)<!----> | Custom derived metric views                                                                                                                                                                                                                                                                                           | [optional] |
| **alternateTimeDimension**       | [**AlternateTimeDimensionEnum**](#AlternateTimeDimensionEnum)<!---->                   | Dimension to use as the alternative timestamp for data in the aggregate. Choosing \&quot;eventTime\&quot; uses the actual time of the data event.                                                                                                                                                                     | [optional] |

{: class="table table-striped"}

<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name                    | Value                               |
| ----------------------- | ----------------------------------- |
| CONVERSATIONID          | &quot;conversationId&quot;          |
| DIVISIONID              | &quot;divisionId&quot;              |
| EXTERNALCONTACTID       | &quot;externalContactId&quot;       |
| MEDIATYPE               | &quot;mediaType&quot;               |
| QUEUEID                 | &quot;queueId&quot;                 |
| REQUESTEDLANGUAGEID     | &quot;requestedLanguageId&quot;     |
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; |
| SURVEYANSWERID          | &quot;surveyAnswerId&quot;          |
| SURVEYCREATEDDATE       | &quot;surveyCreatedDate&quot;       |
| SURVEYERRORREASON       | &quot;surveyErrorReason&quot;       |
| SURVEYFORMCONTEXTID     | &quot;surveyFormContextId&quot;     |
| SURVEYFORMID            | &quot;surveyFormId&quot;            |
| SURVEYFORMNAME          | &quot;surveyFormName&quot;          |
| SURVEYID                | &quot;surveyId&quot;                |
| SURVEYPREVIOUSSTATUS    | &quot;surveyPreviousStatus&quot;    |
| SURVEYPROMOTERSCORE     | &quot;surveyPromoterScore&quot;     |
| SURVEYQUESTIONGROUPID   | &quot;surveyQuestionGroupId&quot;   |
| SURVEYQUESTIONID        | &quot;surveyQuestionId&quot;        |
| SURVEYSTATUS            | &quot;surveyStatus&quot;            |
| TEAMID                  | &quot;teamId&quot;                  |
| USERID                  | &quot;userId&quot;                  |
| WRAPUPCODE              | &quot;wrapUpCode&quot;              |

{: class="table table-striped"}

<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name                          | Value                                     |
| ----------------------------- | ----------------------------------------- |
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

<a name="AlternateTimeDimensionEnum"></a>

## Enum: AlternateTimeDimensionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EVENTTIME          | &quot;eventTime&quot;          |
| SURVEYCREATEDDATE  | &quot;surveyCreatedDate&quot;  |

{: class="table table-striped"}
