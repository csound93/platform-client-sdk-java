---
title: TrustUser
---

## TrustUser

## Properties

| Name                    | Type                                                                               | Description                                                                                                                                                           | Notes      |
| ----------------------- | ---------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**                  | <!----><!---->**String**<!---->                                                    | The globally unique identifier for the object.                                                                                                                        | [optional] |
| **name**                | <!----><!---->**String**<!---->                                                    |                                                                                                                                                                       | [optional] |
| **division**            | <!----><!---->[**Division**](Division.md)<!---->                                   | The division to which this entity belongs.                                                                                                                            | [optional] |
| **chat**                | <!----><!---->[**Chat**](Chat.md)<!---->                                           |                                                                                                                                                                       | [optional] |
| **department**          | <!----><!---->**String**<!---->                                                    |                                                                                                                                                                       | [optional] |
| **email**               | <!----><!---->**String**<!---->                                                    |                                                                                                                                                                       | [optional] |
| **primaryContactInfo**  | <!----><!---->[**List&lt;Contact&gt;**](Contact.md)<!---->                         | Auto populated from addresses.                                                                                                                                        | [optional] |
| **addresses**           | <!----><!---->[**List&lt;Contact&gt;**](Contact.md)<!---->                         | Email addresses and phone numbers for this user                                                                                                                       | [optional] |
| **state**               | [**StateEnum**](#StateEnum)<!---->                                                 | The current state for this user.                                                                                                                                      | [optional] |
| **title**               | <!----><!---->**String**<!---->                                                    |                                                                                                                                                                       | [optional] |
| **username**            | <!----><!---->**String**<!---->                                                    |                                                                                                                                                                       | [optional] |
| **manager**             | <!----><!---->[**User**](User.md)<!---->                                           |                                                                                                                                                                       | [optional] |
| **images**              | <!----><!---->[**List&lt;UserImage&gt;**](UserImage.md)<!---->                     |                                                                                                                                                                       | [optional] |
| **version**             | <!----><!---->**Integer**<!---->                                                   | Required when updating a user, this value should be the current version of the user. The current version can be obtained with a GET on the user before doing a PATCH. |            |
| **certifications**      | <!----><!---->**List&lt;String&gt;**<!---->                                        |                                                                                                                                                                       | [optional] |
| **biography**           | <!----><!---->[**Biography**](Biography.md)<!---->                                 |                                                                                                                                                                       | [optional] |
| **employerInfo**        | <!----><!---->[**EmployerInfo**](EmployerInfo.md)<!---->                           |                                                                                                                                                                       | [optional] |
| **routingStatus**       | <!----><!---->[**RoutingStatus**](RoutingStatus.md)<!---->                         | ACD routing status                                                                                                                                                    | [optional] |
| **presence**            | <!----><!---->[**UserPresence**](UserPresence.md)<!---->                           | Active presence                                                                                                                                                       | [optional] |
| **integrationPresence** | <!----><!---->[**UserPresence**](UserPresence.md)<!---->                           | Integration presence                                                                                                                                                  | [optional] |
| **conversationSummary** | <!----><!---->[**UserConversationSummary**](UserConversationSummary.md)<!---->     | Summary of conversion statistics for conversation types.                                                                                                              | [optional] |
| **outOfOffice**         | <!----><!---->[**OutOfOffice**](OutOfOffice.md)<!---->                             | Determine if out of office is enabled                                                                                                                                 | [optional] |
| **geolocation**         | <!----><!---->[**Geolocation**](Geolocation.md)<!---->                             | Current geolocation position                                                                                                                                          | [optional] |
| **station**             | <!----><!---->[**UserStations**](UserStations.md)<!---->                           | Effective, default, and last station information                                                                                                                      | [optional] |
| **authorization**       | <!----><!---->[**UserAuthorization**](UserAuthorization.md)<!---->                 | Roles and permissions assigned to the user                                                                                                                            | [optional] |
| **profileSkills**       | <!----><!---->**List&lt;String&gt;**<!---->                                        | Profile skills possessed by the user                                                                                                                                  | [optional] |
| **locations**           | <!----><!---->[**List&lt;Location&gt;**](Location.md)<!---->                       | The user placement at each site location.                                                                                                                             | [optional] |
| **groups**              | <!----><!---->[**List&lt;Group&gt;**](Group.md)<!---->                             | The groups the user is a member of                                                                                                                                    | [optional] |
| **team**                | <!----><!---->[**Team**](Team.md)<!---->                                           | The team the user is a member of                                                                                                                                      | [optional] |
| **skills**              | <!----><!---->[**List&lt;UserRoutingSkill&gt;**](UserRoutingSkill.md)<!---->       | Routing (ACD) skills possessed by the user                                                                                                                            | [optional] |
| **languages**           | <!----><!---->[**List&lt;UserRoutingLanguage&gt;**](UserRoutingLanguage.md)<!----> | Routing (ACD) languages possessed by the user                                                                                                                         | [optional] |
| **acdAutoAnswer**       | <!----><!---->**Boolean**<!---->                                                   | acd auto answer                                                                                                                                                       | [optional] |
| **languagePreference**  | <!----><!---->**String**<!---->                                                    | preferred language by the user                                                                                                                                        | [optional] |
| **lastTokenIssued**     | <!----><!---->[**OAuthLastTokenIssued**](OAuthLastTokenIssued.md)<!---->           |                                                                                                                                                                       | [optional] |
| **dateLastLogin**       | <!----><!---->[**Date**](Date.md)<!---->                                           | The last time the user logged in using username and password. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z                 | [optional] |
| **trustUserDetails**    | <!----><!---->[**TrustUserDetails**](TrustUserDetails.md)<!---->                   |                                                                                                                                                                       | [optional] |

{: class="table table-striped"}

<a name="StateEnum"></a>

## Enum: StateEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE             | &quot;active&quot;             |
| INACTIVE           | &quot;inactive&quot;           |
| DELETED            | &quot;deleted&quot;            |

{: class="table table-striped"}
