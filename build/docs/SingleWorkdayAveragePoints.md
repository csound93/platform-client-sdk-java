---
title: SingleWorkdayAveragePoints
---

## SingleWorkdayAveragePoints

## Properties

| Name                   | Type                                                                     | Description                                                                                  | Notes      |
| ---------------------- | ------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------- | ---------- |
| **dateWorkday**        | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                       | Queried target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **division**           | <!----><!---->[**Division**](Division.md)<!---->                         | The targeted division for the average points                                                 | [optional] |
| **averagePoints**      | <!----><!---->**Double**<!---->                                          | The average points per agent earned within the division                                      | [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!----> | The targeted performance profile for the average points                                      | [optional] |

{: class="table table-striped"}
