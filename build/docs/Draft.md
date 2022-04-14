---
title: Draft
---

## Draft

## Properties

| Name             | Type                                                                 | Description                                                                                                              | Notes      |
| ---------------- | -------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **id**           | <!----><!---->**String**<!---->                                      | The globally unique identifier for the object.                                                                           | [optional] |
| **name**         | <!----><!---->**String**<!---->                                      | Draft name                                                                                                               |            |
| **miner**        | <!----><!---->[**Miner**](Miner.md)<!---->                           | Miner to which the draft belongs.                                                                                        | [optional] |
| **intents**      | <!----><!---->[**List&lt;DraftIntents&gt;**](DraftIntents.md)<!----> | Draft intent object.                                                                                                     | [optional] |
| **dateCreated**  | <!----><!---->[**Date**](Date.md)<!---->                             | Date when the draft was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.md)<!---->                             | Date when the draft was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **selfUri**      | <!----><!---->**String**<!---->                                      | The URI for this object                                                                                                  | [optional] |

{: class="table table-striped"}
