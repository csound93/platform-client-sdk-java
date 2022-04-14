---
title: ScimServiceProviderConfig
---

## ScimServiceProviderConfig

## Properties

| Name                      | Type                                                                                                                                   | Description                                                                       | Notes      |
| ------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | ---------- |
| **schemas**               | <!----><!---->**List&lt;String&gt;**<!---->                                                                                            | The list of supported schemas.                                                    | [optional] |
| **documentationUri**      | <!----><!---->**String**<!---->                                                                                                        | The HTTP-addressable URL that points to the service provider&#39;s documentation. | [optional] |
| **patch**                 | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.md)<!---->                           | The \&quot;patch\&quot; configuration options.                                    | [optional] |
| **filter**                | <!----><!---->[**ScimServiceProviderConfigFilterFeature**](ScimServiceProviderConfigFilterFeature.md)<!---->                           | The \&quot;filter\&quot; configuration options.                                   | [optional] |
| **etag**                  | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.md)<!---->                           | The \&quot;etag\&quot; configuration options.                                     | [optional] |
| **sort**                  | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.md)<!---->                           | The \&quot;sort\&quot; configuration options.                                     | [optional] |
| **bulk**                  | <!----><!---->[**ScimServiceProviderConfigBulkFeature**](ScimServiceProviderConfigBulkFeature.md)<!---->                               | The \&quot;bulk\&quot; configuration options.                                     | [optional] |
| **changePassword**        | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.md)<!---->                           | The \&quot;changePassword\&quot; configuration options.                           | [optional] |
| **authenticationSchemes** | <!----><!---->[**List&lt;ScimServiceProviderConfigAuthenticationScheme&gt;**](ScimServiceProviderConfigAuthenticationScheme.md)<!----> | The list of supported authentication schemes.                                     | [optional] |
| **meta**                  | <!----><!---->[**ScimMetadata**](ScimMetadata.md)<!---->                                                                               | The metadata of the SCIM resource.                                                | [optional] |

{: class="table table-striped"}
