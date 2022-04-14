---
title: DialerContactlistfilterConfigChangeContactListFilter
---

## DialerContactlistfilterConfigChangeContactListFilter

## Properties

| Name                   | Type                                                                                                                                       | Description                                                                   | Notes      |
| ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------------- | ---------- |
| **contactList**        | <!----><!---->[**DialerContactlistfilterConfigChangeUriReference**](DialerContactlistfilterConfigChangeUriReference.md)<!---->             |                                                                               | [optional] |
| **contactListColumns** | <!----><!---->**List&lt;String&gt;**<!---->                                                                                                | The list of contact list columns                                              | [optional] |
| **clauses**            | <!----><!---->[**List&lt;DialerContactlistfilterConfigChangeFilterClause&gt;**](DialerContactlistfilterConfigChangeFilterClause.md)<!----> |                                                                               | [optional] |
| **filterType**         | [**FilterTypeEnum**](#FilterTypeEnum)<!---->                                                                                               | Contact list filter type                                                      | [optional] |
| **id**                 | <!----><!---->**String**<!---->                                                                                                            | The globally unique identifier for the object.                                | [optional] |
| **name**               | <!----><!---->**String**<!---->                                                                                                            | The UI-visible name of the object                                             | [optional] |
| **dateCreated**        | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   | Creation time of the entity                                                   | [optional] |
| **dateModified**       | <!----><!---->[**Date**](Date.md)<!---->                                                                                                   | Last modified time of the entity                                              | [optional] |
| **version**            | <!----><!---->**Integer**<!---->                                                                                                           | Required for updates, must match the version number of the most recent update | [optional] |

{: class="table table-striped"}

<a name="FilterTypeEnum"></a>

## Enum: FilterTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND                | &quot;AND&quot;                |
| OR                 | &quot;OR&quot;                 |

{: class="table table-striped"}
