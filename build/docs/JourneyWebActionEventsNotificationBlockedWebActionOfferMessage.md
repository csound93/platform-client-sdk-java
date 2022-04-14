---
title: JourneyWebActionEventsNotificationBlockedWebActionOfferMessage
---

## JourneyWebActionEventsNotificationBlockedWebActionOfferMessage

## Properties

| Name                               | Type                                                                                                                                                               | Description | Notes      |
| ---------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **action**                         | <!----><!---->[**JourneyWebActionEventsNotificationEventAction**](JourneyWebActionEventsNotificationEventAction.md)<!---->                                         |             | [optional] |
| **actionMap**                      | <!----><!---->[**JourneyWebActionEventsNotificationActionMap**](JourneyWebActionEventsNotificationActionMap.md)<!---->                                             |             | [optional] |
| **actionTarget**                   | <!----><!---->[**JourneyWebActionEventsNotificationActionTarget**](JourneyWebActionEventsNotificationActionTarget.md)<!---->                                       |             | [optional] |
| **blockingReason**                 | [**BlockingReasonEnum**](#BlockingReasonEnum)<!---->                                                                                                               |             | [optional] |
| **blockingActionMap**              | <!----><!---->[**JourneyWebActionEventsNotificationActionMap**](JourneyWebActionEventsNotificationActionMap.md)<!---->                                             |             | [optional] |
| **blockingAction**                 | <!----><!---->[**JourneyWebActionEventsNotificationEventAction**](JourneyWebActionEventsNotificationEventAction.md)<!---->                                         |             | [optional] |
| **blockingFrequencyCapBehaviour**  | [**BlockingFrequencyCapBehaviourEnum**](#BlockingFrequencyCapBehaviourEnum)<!---->                                                                                 |             | [optional] |
| **blockingPageUrlConditions**      | <!----><!---->[**List&lt;JourneyWebActionEventsNotificationActionMapPageUrlCondition&gt;**](JourneyWebActionEventsNotificationActionMapPageUrlCondition.md)<!----> |             | [optional] |
| **blockingScheduleGroup**          | <!----><!---->[**JourneyWebActionEventsNotificationScheduleGroup**](JourneyWebActionEventsNotificationScheduleGroup.md)<!---->                                     |             | [optional] |
| **blockingEmergencyScheduleGroup** | <!----><!---->[**JourneyWebActionEventsNotificationEmergencyGroup**](JourneyWebActionEventsNotificationEmergencyGroup.md)<!---->                                   |             | [optional] |

{: class="table table-striped"}

<a name="BlockingReasonEnum"></a>

## Enum: BlockingReasonEnum

| Name                         | Value                                    |
| ---------------------------- | ---------------------------------------- |
| OUTDATEDSDKVERSION           | &quot;OutdatedSdkVersion&quot;           |
| UNKNOWN                      | &quot;Unknown&quot;                      |
| PAGEURLCONDITIONSNOTMATCHING | &quot;PageUrlConditionsNotMatching&quot; |
| SERVICELEVELTHROTTLING       | &quot;ServiceLevelThrottling&quot;       |
| ALREADYEXISTINGOFFER         | &quot;AlreadyExistingOffer&quot;         |
| TRIGGERDATEINFUTURE          | &quot;TriggerDateInFuture&quot;          |
| MULTIPLESIMULTANEOUSOFFERS   | &quot;MultipleSimultaneousOffers&quot;   |
| NOAVAILABLEAGENTS            | &quot;NoAvailableAgents&quot;            |
| FREQUENCYCAPPING             | &quot;FrequencyCapping&quot;             |
| OFFEREDOUTSIDESCHEDULE       | &quot;OfferedOutsideSchedule&quot;       |

{: class="table table-striped"}

<a name="BlockingFrequencyCapBehaviourEnum"></a>

## Enum: BlockingFrequencyCapBehaviourEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN            | &quot;Unknown&quot;            |
| CAPONCEFINALIZED   | &quot;CapOnceFinalized&quot;   |
| CAPONCEREJECTED    | &quot;CapOnceRejected&quot;    |
| CAPFORPERIOD       | &quot;CapForPeriod&quot;       |

{: class="table table-striped"}
