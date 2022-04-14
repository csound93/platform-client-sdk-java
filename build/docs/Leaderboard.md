---
title: Leaderboard
---

## Leaderboard

## Properties

| Name                   | Type                                                                       | Description                                                                                                | Notes      |
| ---------------------- | -------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------- |
| **division**           | <!----><!---->[**Division**](Division.md)<!---->                           | The targeted division for this leaderboard                                                                 | [optional] |
| **metric**             | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->   | The metric id if the leaderboard is about a specific metric                                                | [optional] |
| **dateStartWorkday**   | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                         | Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd | [optional] |
| **dateEndWorkday**     | <!----><!---->[**LocalDate**](LocalDate.md)<!---->                         | End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd   | [optional] |
| **leaders**            | <!----><!---->[**List&lt;LeaderboardItem&gt;**](LeaderboardItem.md)<!----> | The list of leaders generated.                                                                             | [optional] |
| **userRank**           | <!----><!---->[**LeaderboardItem**](LeaderboardItem.md)<!---->             | The requesting user&#39;s rank                                                                             | [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.md)<!---->   | The targeted performance profile for the average points                                                    | [optional] |

{: class="table table-striped"}
