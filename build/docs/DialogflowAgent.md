---
title: DialogflowAgent
---

## DialogflowAgent

## Properties

| Name             | Type                                                                         | Description                                     | Notes      |
| ---------------- | ---------------------------------------------------------------------------- | ----------------------------------------------- | ---------- |
| **id**           | <!----><!---->**String**<!---->                                              | The globally unique identifier for the object.  | [optional] |
| **name**         | <!----><!---->**String**<!---->                                              |                                                 | [optional] |
| **project**      | <!----><!---->[**DialogflowProject**](DialogflowProject.md)<!---->           | The project this Dialogflow agent belongs to    | [optional] |
| **languages**    | <!----><!---->**List&lt;String&gt;**<!---->                                  | The supported languages of the Dialogflow agent | [optional] |
| **intents**      | <!----><!---->[**List&lt;DialogflowIntent&gt;**](DialogflowIntent.md)<!----> | An array of Intents associated with this agent  | [optional] |
| **environments** | <!----><!---->**List&lt;String&gt;**<!---->                                  | Available environments for this agent           | [optional] |
| **selfUri**      | <!----><!---->**String**<!---->                                              | The URI for this object                         | [optional] |

{: class="table table-striped"}
