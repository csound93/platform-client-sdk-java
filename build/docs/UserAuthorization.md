---
title: UserAuthorization
---

## UserAuthorization

## Properties

| Name                   | Type                                                                                         | Description                                                   | Notes      |
| ---------------------- | -------------------------------------------------------------------------------------------- | ------------------------------------------------------------- | ---------- |
| **roles**              | <!----><!---->[**List&lt;DomainRole&gt;**](DomainRole.md)<!---->                             |                                                               | [optional] |
| **unusedRoles**        | <!----><!---->[**List&lt;DomainRole&gt;**](DomainRole.md)<!---->                             | A collection of the roles the user is not using               | [optional] |
| **permissions**        | <!----><!---->**List&lt;String&gt;**<!---->                                                  | A collection of the permissions granted by all assigned roles | [optional] |
| **permissionPolicies** | <!----><!---->[**List&lt;ResourcePermissionPolicy&gt;**](ResourcePermissionPolicy.md)<!----> | The policies configured for assigned permissions.             | [optional] |

{: class="table table-striped"}
