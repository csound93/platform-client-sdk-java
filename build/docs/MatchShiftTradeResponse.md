---
title: MatchShiftTradeResponse
---

## MatchShiftTradeResponse

## Properties

| Name                      | Type                                                                                         | Description                                                                               | Notes      |
| ------------------------- | -------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ---------- |
| **trade**                 | <!----><!---->[**ShiftTradeResponse**](ShiftTradeResponse.md)<!---->                         | The associated shift trade                                                                | [optional] |
| **violations**            | <!----><!---->[**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation.md)<!----> | Constraint violations which disallow this shift trade                                     | [optional] |
| **adminReviewViolations** | <!----><!---->[**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation.md)<!----> | Constraint violations for this shift trade which require shift trade administrator review | [optional] |

{: class="table table-striped"}
