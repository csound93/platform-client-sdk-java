---
title: DialerResponsesetConfigChangeResponseSet
---

## DialerResponsesetConfigChangeResponseSet

## Properties

| Name                     | Type                                                                                                                          | Description                                                                                                                                                                | Notes      |
| ------------------------ | ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **responses**            | <!----><!---->[**Map&lt;String, DialerResponsesetConfigChangeReaction&gt;**](DialerResponsesetConfigChangeReaction.md)<!----> | Map of disposition identifiers to reactions. For example: {\&quot;disposition.classification.callable.person\&quot;: {\&quot;reactionType\&quot;: \&quot;transfer\&quot;}} | [optional] |
| **beepDetectionEnabled** | <!----><!---->**Boolean**<!---->                                                                                              | When beep detection is enabled, answering machine detection will wait for the beep before transferring the call                                                            | [optional] |
| **id**                   | <!----><!---->**String**<!---->                                                                                               | The globally unique identifier for the object.                                                                                                                             | [optional] |
| **name**                 | <!----><!---->**String**<!---->                                                                                               | The UI-visible name of the object                                                                                                                                          | [optional] |
| **dateCreated**          | <!----><!---->[**Date**](Date.md)<!---->                                                                                      | Creation time of the entity                                                                                                                                                | [optional] |
| **dateModified**         | <!----><!---->[**Date**](Date.md)<!---->                                                                                      | Last modified time of the entity                                                                                                                                           | [optional] |
| **version**              | <!----><!---->**Integer**<!---->                                                                                              | Required for updates, must match the version number of the most recent update                                                                                              | [optional] |

{: class="table table-striped"}
