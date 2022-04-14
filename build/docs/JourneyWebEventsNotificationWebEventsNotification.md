---
title: JourneyWebEventsNotificationWebEventsNotification
---

## JourneyWebEventsNotificationWebEventsNotification

## Properties

| Name                     | Type                                                                                                                                 | Description | Notes      |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                   | <!----><!---->**String**<!---->                                                                                                      |             | [optional] |
| **correlationId**        | <!----><!---->**String**<!---->                                                                                                      |             | [optional] |
| **externalContact**      | <!----><!---->[**JourneyWebEventsNotificationExternalContact**](JourneyWebEventsNotificationExternalContact.md)<!---->               |             | [optional] |
| **createdDate**          | <!----><!---->[**Date**](Date.md)<!---->                                                                                             |             | [optional] |
| **customerId**           | <!----><!---->**String**<!---->                                                                                                      |             | [optional] |
| **customerIdType**       | <!----><!---->**String**<!---->                                                                                                      |             | [optional] |
| **session**              | <!----><!---->[**JourneyWebEventsNotificationSession**](JourneyWebEventsNotificationSession.md)<!---->                               |             | [optional] |
| **eventType**            | [**EventTypeEnum**](#EventTypeEnum)<!---->                                                                                           |             | [optional] |
| **webEvent**             | <!----><!---->[**JourneyWebEventsNotificationWebMessage**](JourneyWebEventsNotificationWebMessage.md)<!---->                         |             | [optional] |
| **webActionEvent**       | <!----><!---->[**JourneyWebEventsNotificationWebActionMessage**](JourneyWebEventsNotificationWebActionMessage.md)<!---->             |             | [optional] |
| **outcomeAchievedEvent** | <!----><!---->[**JourneyWebEventsNotificationOutcomeAchievedMessage**](JourneyWebEventsNotificationOutcomeAchievedMessage.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name                 | Value                            |
| -------------------- | -------------------------------- |
| OUTDATEDSDKVERSION   | &quot;OutdatedSdkVersion&quot;   |
| WEBEVENT             | &quot;WebEvent&quot;             |
| WEBACTIONEVENT       | &quot;WebActionEvent&quot;       |
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; |

{: class="table table-striped"}
