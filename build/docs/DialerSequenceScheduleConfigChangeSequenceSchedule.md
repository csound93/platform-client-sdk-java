---
title: DialerSequenceScheduleConfigChangeSequenceSchedule
---

## DialerSequenceScheduleConfigChangeSequenceSchedule

## Properties

| Name             | Type                                                                                                                                             | Description                                                                     | Notes      |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------- | ---------- |
| **intervals**    | <!----><!---->[**List&lt;DialerSequenceScheduleConfigChangeScheduleInterval&gt;**](DialerSequenceScheduleConfigChangeScheduleInterval.md)<!----> | a list of start and end times                                                   | [optional] |
| **timeZone**     | <!----><!---->**String**<!---->                                                                                                                  | time zone identifier to be applied to the intervals; for example Africa/Abidjan | [optional] |
| **sequence**     | <!----><!---->[**DialerSequenceScheduleConfigChangeUriReference**](DialerSequenceScheduleConfigChangeUriReference.md)<!---->                     |                                                                                 | [optional] |
| **id**           | <!----><!---->**String**<!---->                                                                                                                  | The globally unique identifier for the object.                                  | [optional] |
| **name**         | <!----><!---->**String**<!---->                                                                                                                  | The UI-visible name of the object                                               | [optional] |
| **dateCreated**  | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         | Creation time of the entity                                                     | [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.md)<!---->                                                                                                         | Last modified time of the entity                                                | [optional] |
| **version**      | <!----><!---->**Integer**<!---->                                                                                                                 | Required for updates, must match the version number of the most recent update   | [optional] |

{: class="table table-striped"}
