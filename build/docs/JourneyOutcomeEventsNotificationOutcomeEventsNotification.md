---
title: JourneyOutcomeEventsNotificationOutcomeEventsNotification
---

## JourneyOutcomeEventsNotificationOutcomeEventsNotification

## Properties

| Name                               | Type                                                                                                                                               | Description | Notes      |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**                             | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **correlationId**                  | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **externalContact**                | <!----><!---->[**JourneyOutcomeEventsNotificationExternalContact**](JourneyOutcomeEventsNotificationExternalContact.md)<!---->                     |             | [optional] |
| **createdDate**                    | <!----><!---->[**Date**](Date.md)<!---->                                                                                                           |             | [optional] |
| **customerId**                     | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **customerIdType**                 | <!----><!---->**String**<!---->                                                                                                                    |             | [optional] |
| **session**                        | <!----><!---->[**JourneyOutcomeEventsNotificationSession**](JourneyOutcomeEventsNotificationSession.md)<!---->                                     |             | [optional] |
| **eventType**                      | [**EventTypeEnum**](#EventTypeEnum)<!---->                                                                                                         |             | [optional] |
| **outcomeAchievedEvent**           | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAchievedMessage**](JourneyOutcomeEventsNotificationOutcomeAchievedMessage.md)<!---->       |             | [optional] |
| **outcomeAttributionEventMessage** | <!----><!---->[**JourneyOutcomeEventsNotificationOutcomeAttributionMessage**](JourneyOutcomeEventsNotificationOutcomeAttributionMessage.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name                    | Value                               |
| ----------------------- | ----------------------------------- |
| OUTDATEDSDKVERSION      | &quot;OutdatedSdkVersion&quot;      |
| OUTCOMEACHIEVEDEVENT    | &quot;OutcomeAchievedEvent&quot;    |
| OUTCOMEATTRIBUTIONEVENT | &quot;OutcomeAttributionEvent&quot; |

{: class="table table-striped"}
