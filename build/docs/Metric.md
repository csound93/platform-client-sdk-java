---
title: Metric
---

## Metric

## Properties

| Name                           | Type                                                                     | Description                                                                                                                                 | Notes      |
| ------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                         | <!----><!---->**String**<!---->                                          | The globally unique identifier for the object.                                                                                              | [optional] |
| **name**                       | <!----><!---->**String**<!---->                                          | The name of this metric                                                                                                                     |            |
| **metricDefinitionId**         | <!----><!---->**String**<!---->                                          | The id of associated metric definition                                                                                                      | [optional] |
| **externalMetricDefinitionId** | <!----><!---->**String**<!---->                                          | The id of associated external metric definition                                                                                             | [optional] |
| **objective**                  | <!----><!---->[**Objective**](Objective.md)<!---->                       | Associated objective for this metric                                                                                                        | [optional] |
| **performanceProfileId**       | <!----><!---->**String**<!---->                                          | Performance profile id of this metric                                                                                                       | [optional] |
| **linkedMetric**               | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!----> | The linked metric entity reference                                                                                                          | [optional] |
| **dateCreated**                | <!----><!---->[**Date**](Date.md)<!---->                                 | The created date of this metric. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                    | [optional] |
| **dateUnlinked**               | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                       | The unlinked workday for this metric if this metric was ever unlinked. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **sourcePerformanceProfile**   | <!----><!---->[**PerformanceProfile**](PerformanceProfile.md)<!---->     | The source performance profile when this metric is linked                                                                                   | [optional] |
| **selfUri**                    | <!----><!---->**String**<!---->                                          | The URI for this object                                                                                                                     | [optional] |

{: class="table table-striped"}
