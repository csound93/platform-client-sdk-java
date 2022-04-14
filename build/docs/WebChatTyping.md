---
title: WebChatTyping
---

## WebChatTyping

## Properties

| Name             | Type                                                                   | Description                                                                                    | Notes |
| ---------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ----- |
| **id**           | <!----><!---->**String**<!---->                                        | The event identifier of this typing indicator event (useful to guard against event re-delivery |       |
| **conversation** | <!----><!---->[**WebChatConversation**](WebChatConversation.md)<!----> | The identifier of the conversation                                                             |       |
| **sender**       | <!----><!---->[**WebChatMemberInfo**](WebChatMemberInfo.md)<!---->     | The member who sent the message                                                                |       |
| **timestamp**    | <!----><!---->[**Date**](Date.md)<!---->                               | The timestamp of the message, in ISO-8601 format                                               |       |

{: class="table table-striped"}
