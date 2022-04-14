---
title: DialerRulesetConfigChangeRuleSet
---

## DialerRulesetConfigChangeRuleSet

## Properties

| Name             | Type                                                                                                       | Description                                                                   | Notes      |
| ---------------- | ---------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ---------- |
| **contactList**  | <!----><!---->[**DialerRulesetConfigChangeUriReference**](DialerRulesetConfigChangeUriReference.md)<!----> |                                                                               | [optional] |
| **queue**        | <!----><!---->[**DialerRulesetConfigChangeUriReference**](DialerRulesetConfigChangeUriReference.md)<!----> | A UriReference for a resource                                                 | [optional] |
| **rules**        | <!----><!---->[**List&lt;DialerRulesetConfigChangeRule&gt;**](DialerRulesetConfigChangeRule.md)<!---->     |                                                                               | [optional] |
| **id**           | <!----><!---->**String**<!---->                                                                            | The globally unique identifier for the object.                                | [optional] |
| **name**         | <!----><!---->**String**<!---->                                                                            | The UI-visible name of the object                                             | [optional] |
| **dateCreated**  | <!----><!---->[**Date**](Date.md)<!---->                                                                   | Creation time of the entity                                                   | [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.md)<!---->                                                                   | Last modified time of the entity                                              | [optional] |
| **version**      | <!----><!---->**Integer**<!---->                                                                           | Required for updates, must match the version number of the most recent update | [optional] |

{: class="table table-striped"}
