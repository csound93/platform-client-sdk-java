---
title: WemCoachingAppointmentTopicCoachingAppointmentNotification
---

## WemCoachingAppointmentTopicCoachingAppointmentNotification

## Properties

| Name                | Type                                                                                                                                                             | Description | Notes      |
| ------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- | ---------- |
| **id**              | <!----><!---->**String**<!---->                                                                                                                                  |             | [optional] |
| **name**            | <!----><!---->**String**<!---->                                                                                                                                  |             | [optional] |
| **dateStart**       | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         |             | [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!---->                                                                                                                                 |             | [optional] |
| **status**          | [**StatusEnum**](#StatusEnum)<!---->                                                                                                                             |             | [optional] |
| **facilitator**     | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.md)<!---->                                                 |             | [optional] |
| **attendees**       | <!----><!---->[**List&lt;WemCoachingAppointmentTopicUserReference&gt;**](WemCoachingAppointmentTopicUserReference.md)<!---->                                     |             | [optional] |
| **createdBy**       | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.md)<!---->                                                 |             | [optional] |
| **dateCreated**     | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         |             | [optional] |
| **modifiedBy**      | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.md)<!---->                                                 |             | [optional] |
| **dateModified**    | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         |             | [optional] |
| **conversations**   | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentConversation&gt;**](WemCoachingAppointmentTopicCoachingAppointmentConversation.md)<!----> |             | [optional] |
| **documents**       | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentDocument&gt;**](WemCoachingAppointmentTopicCoachingAppointmentDocument.md)<!---->         |             | [optional] |
| **changeType**      | [**ChangeTypeEnum**](#ChangeTypeEnum)<!---->                                                                                                                     |             | [optional] |
| **dateCompleted**   | <!----><!---->[**Date**](Date.md)<!---->                                                                                                                         |             | [optional] |
| **externalLinks**   | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentExternalLink&gt;**](WemCoachingAppointmentTopicCoachingAppointmentExternalLink.md)<!----> |             | [optional] |

{: class="table table-striped"}

<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SCHEDULED          | &quot;Scheduled&quot;          |
| INPROGRESS         | &quot;InProgress&quot;         |
| COMPLETED          | &quot;Completed&quot;          |
| INVALIDSCHEDULE    | &quot;InvalidSchedule&quot;    |

{: class="table table-striped"}

<a name="ChangeTypeEnum"></a>

## Enum: ChangeTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATE             | &quot;Create&quot;             |
| UPDATE             | &quot;Update&quot;             |
| DELETE             | &quot;Delete&quot;             |
| INVALIDATE         | &quot;Invalidate&quot;         |

{: class="table table-striped"}
