---
title: KnowledgeDocumentBulkRequest
---

## KnowledgeDocumentBulkRequest

## Properties

| Name            | Type                                                                                   | Description                                                      | Notes      |
| --------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ---------- |
| **type**        | [**TypeEnum**](#TypeEnum)<!---->                                                       | Document type according to assigned template                     |            |
| **externalUrl** | <!----><!---->**String**<!---->                                                        | External Url to the document                                     | [optional] |
| **faq**         | <!----><!---->[**DocumentFaq**](DocumentFaq.md)<!---->                                 | Faq document details                                             | [optional] |
| **categories**  | <!----><!---->[**List&lt;DocumentCategoryInput&gt;**](DocumentCategoryInput.md)<!----> | Document categories                                              | [optional] |
| **article**     | <!----><!---->[**DocumentArticle**](DocumentArticle.md)<!---->                         | Article details                                                  | [optional] |
| **id**          | <!----><!---->**String**<!---->                                                        | Identifier of document for update. Omit for create new Document. | [optional] |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FAQ                | &quot;Faq&quot;                |
| ARTICLE            | &quot;Article&quot;            |

{: class="table table-striped"}
