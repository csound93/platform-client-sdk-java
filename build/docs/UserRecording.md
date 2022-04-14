---
title: UserRecording
---

## UserRecording

## Properties

| Name                     | Type                                                                           | Description                                                                             | Notes      |
| ------------------------ | ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------- | ---------- |
| **id**                   | <!----><!---->**String**<!---->                                                | The globally unique identifier for the object.                                          | [optional] |
| **name**                 | <!----><!---->**String**<!---->                                                |                                                                                         | [optional] |
| **dateCreated**          | <!----><!---->[**Date**](Date.md)<!---->                                       | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **dateModified**         | <!----><!---->[**Date**](Date.md)<!---->                                       | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **contentUri**           | <!----><!---->**String**<!---->                                                |                                                                                         | [optional] |
| **workspace**            | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 |                                                                                         | [optional] |
| **createdBy**            | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                 |                                                                                         | [optional] |
| **conversation**         | <!----><!---->[**Conversation**](Conversation.md)<!---->                       |                                                                                         | [optional] |
| **contentLength**        | <!----><!---->**Long**<!---->                                                  |                                                                                         | [optional] |
| **durationMilliseconds** | <!----><!---->**Long**<!---->                                                  |                                                                                         | [optional] |
| **thumbnails**           | <!----><!---->[**List&lt;DocumentThumbnail&gt;**](DocumentThumbnail.md)<!----> |                                                                                         | [optional] |
| **read**                 | <!----><!---->**Boolean**<!---->                                               |                                                                                         | [optional] |
| **selfUri**              | <!----><!---->**String**<!---->                                                | The URI for this object                                                                 | [optional] |

{: class="table table-striped"}
