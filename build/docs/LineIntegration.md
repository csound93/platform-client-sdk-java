---
title: LineIntegration
---

## LineIntegration

## Properties

| Name                 | Type                                                                               | Description                                                                                                                 | Notes      |
| -------------------- | ---------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**               | <!----><!---->**String**<!---->                                                    | A unique Integration Id                                                                                                     |            |
| **name**             | <!----><!---->**String**<!---->                                                    | The name of the LINE Integration                                                                                            |            |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.md)<!----> | Defines the SupportedContent profile configured for an integration                                                          | [optional] |
| **channelId**        | <!----><!---->**String**<!---->                                                    | The Channel Id from LINE messenger                                                                                          |            |
| **webhookUri**       | <!----><!---->**String**<!---->                                                    | The Webhook URI to be updated in LINE platform                                                                              |            |
| **status**           | <!----><!---->**String**<!---->                                                    | The status of the LINE Integration                                                                                          | [optional] |
| **recipient**        | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                     | The recipient associated to the Line Integration. This recipient is used to associate a flow to an integration              | [optional] |
| **dateCreated**      | <!----><!---->[**Date**](Date.md)<!---->                                           | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z  | [optional] |
| **dateModified**     | <!----><!---->[**Date**](Date.md)<!---->                                           | Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **createdBy**        | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                     | User reference that created this Integration                                                                                | [optional] |
| **modifiedBy**       | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                     | User reference that last modified this Integration                                                                          | [optional] |
| **version**          | <!----><!---->**Integer**<!---->                                                   | Version number required for updates.                                                                                        |            |
| **createStatus**     | [**CreateStatusEnum**](#CreateStatusEnum)<!---->                                   | Status of asynchronous create operation                                                                                     | [optional] |
| **createError**      | <!----><!---->[**ErrorBody**](ErrorBody.md)<!---->                                 | Error information returned, if createStatus is set to Error                                                                 | [optional] |
| **selfUri**          | <!----><!---->**String**<!---->                                                    | The URI for this object                                                                                                     | [optional] |

{: class="table table-striped"}

<a name="CreateStatusEnum"></a>

## Enum: CreateStatusEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INITIATED          | &quot;Initiated&quot;          |
| COMPLETED          | &quot;Completed&quot;          |
| ERROR              | &quot;Error&quot;              |

{: class="table table-striped"}
