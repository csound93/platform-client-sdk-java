---
title: TokenInfo
---

## TokenInfo

## Properties

| Name                 | Type                                                                   | Description                                                             | Notes      |
| -------------------- | ---------------------------------------------------------------------- | ----------------------------------------------------------------------- | ---------- |
| **organization**     | <!----><!---->[**NamedEntity**](NamedEntity.md)<!---->                 | The current organization                                                | [optional] |
| **homeOrganization** | <!----><!---->[**NamedEntity**](NamedEntity.md)<!---->                 | The token&#39;s home organization                                       | [optional] |
| **authorizedScope**  | <!----><!---->**List&lt;String&gt;**<!---->                            | The list of scopes authorized for the OAuth client                      | [optional] |
| **clonedUser**       | <!----><!---->[**TokenInfoClonedUser**](TokenInfoClonedUser.md)<!----> | Only present when a user is a clone of trustee user in the trustor org. | [optional] |
| **oAuthClient**      | <!----><!---->[**OrgOAuthClient**](OrgOAuthClient.md)<!---->           |                                                                         | [optional] |

{: class="table table-striped"}
