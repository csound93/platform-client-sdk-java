---
title: WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast
---

## WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast

## Properties

| Name                      | Type                                                                                                                                                                               | Description | Notes      |
| ------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                    | <!----><!---->**String**<!---->                                                                                                                                                    |             | [optional] |
| **weekDate**              | <!----><!---->**String**<!---->                                                                                                                                                    |             | [optional] |
| **creationMethod**        | [**CreationMethodEnum**](#CreationMethodEnum)<!---->                                                                                                                               |             | [optional] |
| **description**           | <!----><!---->**String**<!---->                                                                                                                                                    |             | [optional] |
| **legacy**                | <!----><!---->**Boolean**<!---->                                                                                                                                                   |             | [optional] |
| **referenceStartDate**    | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                                           |             | [optional] |
| **sourceDays**            | <!----><!---->[**List&lt;WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer&gt;**](WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer.md)<!----> |             | [optional] |
| **modifications**         | <!----><!---->[**List&lt;WfmBuShortTermForecastGenerateProgressTopicBuForecastModification&gt;**](WfmBuShortTermForecastGenerateProgressTopicBuForecastModification.md)<!---->     |             | [optional] |
| **timeZone**              | <!----><!---->**String**<!---->                                                                                                                                                    |             | [optional] |
| **planningGroupsVersion** | <!----><!---->**Integer**<!---->                                                                                                                                                   |             | [optional] |
| **weekCount**             | <!----><!---->**Integer**<!---->                                                                                                                                                   |             | [optional] |
| **metadata**              | <!----><!---->[**WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata**](WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata.md)<!---->         |             | [optional] |
| **canUseForScheduling**   | <!----><!---->**Boolean**<!---->                                                                                                                                                   |             | [optional] |

{: class="table table-striped"}

<a name="CreationMethodEnum"></a>

## Enum: CreationMethodEnum

| Name                              | Value                                         |
| --------------------------------- | --------------------------------------------- |
| OUTDATEDSDKVERSION                | &quot;OutdatedSdkVersion&quot;                |
| IMPORT                            | &quot;Import&quot;                            |
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; |
| HISTORICALWEIGHTEDAVERAGE         | &quot;HistoricalWeightedAverage&quot;         |
| ADVANCED                          | &quot;Advanced&quot;                          |

{: class="table table-striped"}
