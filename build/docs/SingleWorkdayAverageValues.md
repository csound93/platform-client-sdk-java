---
title: SingleWorkdayAverageValues
---

## SingleWorkdayAverageValues

## Properties

| Name                   | Type                                                                                       | Description                                                                                                        | Notes      |
| ---------------------- | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ---------- |
| **dateWorkday**        | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                                         | The targeted workday for average value query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **division**           | <!----><!---->[**Division**](Division.md)<!---->                                           | The targeted division for the metrics                                                                              | [optional] |
| **user**               | <!----><!---->[**UserReference**](UserReference.md)<!---->                                 | The targeted user for the metrics                                                                                  | [optional] |
| **timezone**           | <!----><!---->**String**<!---->                                                            | The time zone used for aggregating metric values                                                                   | [optional] |
| **results**            | <!----><!---->[**List&lt;WorkdayValuesMetricItem&gt;**](WorkdayValuesMetricItem.md)<!----> | The metric value averages                                                                                          | [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->                   | The targeted performance profile for the average points                                                            | [optional] |

{: class="table table-striped"}
