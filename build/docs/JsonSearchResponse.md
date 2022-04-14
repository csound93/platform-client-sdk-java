---
title: JsonSearchResponse
---

## JsonSearchResponse

## Properties

| Name             | Type                                               | Description                                     | Notes      |
| ---------------- | -------------------------------------------------- | ----------------------------------------------- | ---------- |
| **total**        | <!----><!---->**Long**<!---->                      | The total number of results found               |            |
| **pageCount**    | <!----><!---->**Integer**<!---->                   | The total number of pages                       |            |
| **pageSize**     | <!----><!---->**Integer**<!---->                   | The current page size                           |            |
| **pageNumber**   | <!----><!---->**Integer**<!---->                   | The current page number                         |            |
| **types**        | <!----><!---->**List&lt;String&gt;**<!---->        | Resource types the search was performed against |            |
| **results**      | <!----><!---->[**ArrayNode**](ArrayNode.md)<!----> | Search results                                  |            |
| **aggregations** | <!----><!---->[**ArrayNode**](ArrayNode.md)<!----> |                                                 | [optional] |

{: class="table table-striped"}
