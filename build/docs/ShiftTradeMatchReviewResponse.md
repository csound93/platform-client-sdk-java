---
title: ShiftTradeMatchReviewResponse
---

## ShiftTradeMatchReviewResponse

## Properties

| Name                      | Type                                                                                               | Description                                                                                                                                                   | Notes      |
| ------------------------- | -------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **initiatingUser**        | <!----><!---->[**ShiftTradeMatchReviewUserResponse**](ShiftTradeMatchReviewUserResponse.md)<!----> | Details for the initiatingUser side of the shift trade                                                                                                        | [optional] |
| **receivingUser**         | <!----><!---->[**ShiftTradeMatchReviewUserResponse**](ShiftTradeMatchReviewUserResponse.md)<!----> | Details for the receivingUser side of the shift trade                                                                                                         | [optional] |
| **violations**            | <!----><!---->[**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation.md)<!---->       | Constraint violations introduced after being matched that would normally disallow a trade, but which can still be overridden by the shift trade administrator | [optional] |
| **adminReviewViolations** | <!----><!---->[**List&lt;ShiftTradeMatchViolation&gt;**](ShiftTradeMatchViolation.md)<!---->       | Constraint violations associated with this shift trade which require shift trade administrator review                                                         | [optional] |

{: class="table table-striped"}
