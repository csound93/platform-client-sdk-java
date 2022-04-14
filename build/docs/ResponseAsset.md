---
title: ResponseAsset
---

## ResponseAsset

## Properties

| Name                | Type                                                                       | Description                                                                                                                       | Notes      |
| ------------------- | -------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id**              | <!----><!---->**String**<!---->                                            | The globally unique identifier for the object.                                                                                    | [optional] |
| **name**            | <!----><!---->**String**<!---->                                            |                                                                                                                                   | [optional] |
| **division**        | <!----><!---->[**Division**](Division.md)<!---->                           | The division to which this entity belongs.                                                                                        | [optional] |
| **contentLength**   | <!----><!---->**Long**<!---->                                              | response asset size in bytes                                                                                                      | [optional] |
| **contentLocation** | <!----><!---->**String**<!---->                                            | response asset location.                                                                                                          | [optional] |
| **contentType**     | <!----><!---->**String**<!---->                                            | MIME type of response asset                                                                                                       | [optional] |
| **dateCreated**     | <!----><!---->[**Date**](Date.md)<!---->                                   | Created date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z       | [optional] |
| **createdBy**       | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->             | User who created the response asset                                                                                               | [optional] |
| **dateModified**    | <!----><!---->[**Date**](Date.md)<!---->                                   | Last modified date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **modifiedBy**      | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->             | User who last modified the response asset                                                                                         | [optional] |
| **responses**       | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.md)<!----> | Canned responses actively using this asset                                                                                        | [optional] |
| **selfUri**         | <!----><!---->**String**<!---->                                            | The URI for this object                                                                                                           | [optional] |

{: class="table table-striped"}
