---
title: BotConnectorBotVersion
---

## BotConnectorBotVersion

## Properties

| Name                   | Type                                                           | Description                                                                                                                                                                                                  | Notes |
| ---------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----- |
| **version**            | <!----><!---->**String**<!---->                                | The name of the version. This can be up to 100 characters long and must be comprised of displayable characters without leading or trailing whitespace                                                        |       |
| **supportedLanguages** | <!----><!---->**List&lt;String&gt;**<!---->                    | The supported languages for this bot. EG &#39;en-us&#39; or &#39;es&#39;, etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code) |       |
| **intents**            | <!----><!---->[**List&lt;BotIntent&gt;**](BotIntent.md)<!----> | A list of potential intents this bot will return, limit of 50                                                                                                                                                |       |

{: class="table table-striped"}
