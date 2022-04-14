---
title: JourneyWebActionEventsNotificationWebActionEventsNotification
---

## JourneyWebActionEventsNotificationWebActionEventsNotification

## Properties

| Name                           | Type                                                                                                                                                         | Description | Notes      |
| ------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- | ---------- |
| **id**                         | <!----><!---->**String**<!---->                                                                                                                              |             | [optional] |
| **correlationId**              | <!----><!---->**String**<!---->                                                                                                                              |             | [optional] |
| **externalContact**            | <!----><!---->[**JourneyWebActionEventsNotificationExternalContact**](JourneyWebActionEventsNotificationExternalContact.md)<!---->                           |             | [optional] |
| **createdDate**                | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                     |             | [optional] |
| **customerId**                 | <!----><!---->**String**<!---->                                                                                                                              |             | [optional] |
| **customerIdType**             | <!----><!---->**String**<!---->                                                                                                                              |             | [optional] |
| **session**                    | <!----><!---->[**JourneyWebActionEventsNotificationSession**](JourneyWebActionEventsNotificationSession.md)<!---->                                           |             | [optional] |
| **eventType**                  | [**EventTypeEnum**](#EventTypeEnum)<!---->                                                                                                                   |             | [optional] |
| **webActionEvent**             | <!----><!---->[**JourneyWebActionEventsNotificationWebActionMessage**](JourneyWebActionEventsNotificationWebActionMessage.md)<!---->                         |             | [optional] |
| **blockedWebActionOfferEvent** | <!----><!---->[**JourneyWebActionEventsNotificationBlockedWebActionOfferMessage**](JourneyWebActionEventsNotificationBlockedWebActionOfferMessage.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name                       | Value                                  |
| -------------------------- | -------------------------------------- |
| OUTDATEDSDKVERSION         | &quot;OutdatedSdkVersion&quot;         |
| WEBACTIONEVENT             | &quot;WebActionEvent&quot;             |
| BLOCKEDWEBACTIONOFFEREVENT | &quot;BlockedWebActionOfferEvent&quot; |

{: class="table table-striped"}
