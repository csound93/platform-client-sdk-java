---
title: ScimGroupListResponse
---

## ScimGroupListResponse

## Properties

| Name             | Type                                                               | Description                                                                                                                                      | Notes      |
| ---------------- | ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ---------- |
| **schemas**      | <!----><!---->**List&lt;String&gt;**<!---->                        | The list of supported schemas.                                                                                                                   | [optional] |
| **totalResults** | <!----><!---->**Long**<!---->                                      | The total number of results.                                                                                                                     | [optional] |
| **startIndex**   | <!----><!---->**Long**<!---->                                      | The 1-based index of the first result returned by this request. Add this to \&quot;itemsPerPage\&quot; when requesting the next page of results. | [optional] |
| **itemsPerPage** | <!----><!---->**Long**<!---->                                      | The number of resources returned per page.                                                                                                       | [optional] |
| **resources**    | <!----><!---->[**List&lt;ScimV2Group&gt;**](ScimV2Group.md)<!----> | The list of requested resources. If \&quot;count\&quot; is 0, then the list will be empty.                                                       | [optional] |

{: class="table table-striped"}
