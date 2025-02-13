---
title: ConversationsApi
---

## ConversationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                                                   | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteAnalyticsConversationsDetailsJob**](ConversationsApi.md#deleteAnalyticsConversationsDetailsJob)                                                 | Delete/cancel an async request                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**deleteConversationParticipantCode**](ConversationsApi.md#deleteConversationParticipantCode)                                                           | Delete a code used to add a communication to this participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**deleteConversationParticipantFlaggedreason**](ConversationsApi.md#deleteConversationParticipantFlaggedreason)                                         | Remove flagged reason from conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**deleteConversationsCallParticipantConsult**](ConversationsApi.md#deleteConversationsCallParticipantConsult)                                           | Cancel the transfer                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**deleteConversationsEmailMessagesDraftAttachment**](ConversationsApi.md#deleteConversationsEmailMessagesDraftAttachment)                               | Delete attachment from draft                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**deleteConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi.md#deleteConversationsMessagingIntegrationsFacebookIntegrationId)   | Delete a Facebook messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**deleteConversationsMessagingIntegrationsLineIntegrationId**](ConversationsApi.md#deleteConversationsMessagingIntegrationsLineIntegrationId)           | Delete a LINE messenger integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**deleteConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi.md#deleteConversationsMessagingIntegrationsOpenIntegrationId)           | Delete an Open messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**deleteConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi.md#deleteConversationsMessagingIntegrationsTwitterIntegrationId)     | Delete a Twitter messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| [**deleteConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi.md#deleteConversationsMessagingIntegrationsWhatsappIntegrationId)   | Delete a WhatsApp messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**deleteConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi.md#deleteConversationsMessagingSupportedcontentSupportedContentId) | Delete a supported content profile                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getAnalyticsConversationDetails**](ConversationsApi.md#getAnalyticsConversationDetails)                                                               | Get a conversation by id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getAnalyticsConversationsDetails**](ConversationsApi.md#getAnalyticsConversationsDetails)                                                             | Gets multiple conversations by id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [**getAnalyticsConversationsDetailsJob**](ConversationsApi.md#getAnalyticsConversationsDetailsJob)                                                       | Get status for async query for conversation details                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getAnalyticsConversationsDetailsJobResults**](ConversationsApi.md#getAnalyticsConversationsDetailsJobResults)                                         | Fetch a page of results for an async query                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getAnalyticsConversationsDetailsJobsAvailability**](ConversationsApi.md#getAnalyticsConversationsDetailsJobsAvailability)                             | Lookup the datalake availability date and time                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**getConversation**](ConversationsApi.md#getConversation)                                                                                               | Get conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [**getConversationParticipantSecureivrsession**](ConversationsApi.md#getConversationParticipantSecureivrsession)                                         | Fetch info on a secure session                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**getConversationParticipantSecureivrsessions**](ConversationsApi.md#getConversationParticipantSecureivrsessions)                                       | Get a list of secure sessions for this participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getConversationParticipantWrapup**](ConversationsApi.md#getConversationParticipantWrapup)                                                             | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationParticipantWrapupcodes**](ConversationsApi.md#getConversationParticipantWrapupcodes)                                                   | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversations**](ConversationsApi.md#getConversations)                                                                                             | Get active conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**getConversationsCall**](ConversationsApi.md#getConversationsCall)                                                                                     | Get call conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**getConversationsCallParticipantWrapup**](ConversationsApi.md#getConversationsCallParticipantWrapup)                                                   | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsCallParticipantWrapupcodes**](ConversationsApi.md#getConversationsCallParticipantWrapupcodes)                                         | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsCallback**](ConversationsApi.md#getConversationsCallback)                                                                             | Get callback conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsCallbackParticipantWrapup**](ConversationsApi.md#getConversationsCallbackParticipantWrapup)                                           | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsCallbackParticipantWrapupcodes**](ConversationsApi.md#getConversationsCallbackParticipantWrapupcodes)                                 | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsCallbacks**](ConversationsApi.md#getConversationsCallbacks)                                                                           | Get active callback conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsCalls**](ConversationsApi.md#getConversationsCalls)                                                                                   | Get active call conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**getConversationsCallsHistory**](ConversationsApi.md#getConversationsCallsHistory)                                                                     | Get call history                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [**getConversationsCallsMaximumconferenceparties**](ConversationsApi.md#getConversationsCallsMaximumconferenceparties)                                   | Get the maximum number of participants that this user can have on a conference                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**getConversationsChat**](ConversationsApi.md#getConversationsChat)                                                                                     | Get chat conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**getConversationsChatMessage**](ConversationsApi.md#getConversationsChatMessage)                                                                       | Get a web chat conversation message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getConversationsChatMessages**](ConversationsApi.md#getConversationsChatMessages)                                                                     | Get the messages of a chat conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsChatParticipantWrapup**](ConversationsApi.md#getConversationsChatParticipantWrapup)                                                   | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsChatParticipantWrapupcodes**](ConversationsApi.md#getConversationsChatParticipantWrapupcodes)                                         | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsChats**](ConversationsApi.md#getConversationsChats)                                                                                   | Get active chat conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**getConversationsCobrowsesession**](ConversationsApi.md#getConversationsCobrowsesession)                                                               | Get cobrowse conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsCobrowsesessionParticipantWrapup**](ConversationsApi.md#getConversationsCobrowsesessionParticipantWrapup)                             | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsCobrowsesessionParticipantWrapupcodes**](ConversationsApi.md#getConversationsCobrowsesessionParticipantWrapupcodes)                   | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsCobrowsesessions**](ConversationsApi.md#getConversationsCobrowsesessions)                                                             | Get active cobrowse conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsEmail**](ConversationsApi.md#getConversationsEmail)                                                                                   | Get email conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| [**getConversationsEmailMessage**](ConversationsApi.md#getConversationsEmailMessage)                                                                     | Get conversation message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsEmailMessages**](ConversationsApi.md#getConversationsEmailMessages)                                                                   | Get conversation messages                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsEmailMessagesDraft**](ConversationsApi.md#getConversationsEmailMessagesDraft)                                                         | Get conversation draft reply                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**getConversationsEmailParticipantWrapup**](ConversationsApi.md#getConversationsEmailParticipantWrapup)                                                 | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsEmailParticipantWrapupcodes**](ConversationsApi.md#getConversationsEmailParticipantWrapupcodes)                                       | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsEmailSettings**](ConversationsApi.md#getConversationsEmailSettings)                                                                   | Get emails settings for a given conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**getConversationsEmails**](ConversationsApi.md#getConversationsEmails)                                                                                 | Get active email conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**getConversationsMessage**](ConversationsApi.md#getConversationsMessage)                                                                               | Get message conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsMessageCommunicationMessagesMediaMediaId**](ConversationsApi.md#getConversationsMessageCommunicationMessagesMediaMediaId)             | Get media                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsMessageDetails**](ConversationsApi.md#getConversationsMessageDetails)                                                                 | Get message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [**getConversationsMessageMessage**](ConversationsApi.md#getConversationsMessageMessage)                                                                 | Get conversation message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsMessageParticipantWrapup**](ConversationsApi.md#getConversationsMessageParticipantWrapup)                                             | Get the wrap-up for this conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsMessageParticipantWrapupcodes**](ConversationsApi.md#getConversationsMessageParticipantWrapupcodes)                                   | Get list of wrapup codes for this conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsMessages**](ConversationsApi.md#getConversationsMessages)                                                                             | Get active message conversations for the logged in user                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**getConversationsMessagingFacebookApp**](ConversationsApi.md#getConversationsMessagingFacebookApp)                                                     | Get Genesys Facebook App Id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [**getConversationsMessagingIntegrations**](ConversationsApi.md#getConversationsMessagingIntegrations)                                                   | Get a list of Integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**getConversationsMessagingIntegrationsFacebook**](ConversationsApi.md#getConversationsMessagingIntegrationsFacebook)                                   | Get a list of Facebook Integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi.md#getConversationsMessagingIntegrationsFacebookIntegrationId)         | Get a Facebook messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**getConversationsMessagingIntegrationsLine**](ConversationsApi.md#getConversationsMessagingIntegrationsLine)                                           | Get a list of LINE messenger Integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsMessagingIntegrationsLineIntegrationId**](ConversationsApi.md#getConversationsMessagingIntegrationsLineIntegrationId)                 | Get a LINE messenger integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [**getConversationsMessagingIntegrationsOpen**](ConversationsApi.md#getConversationsMessagingIntegrationsOpen)                                           | Get a list of Open messaging integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**getConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi.md#getConversationsMessagingIntegrationsOpenIntegrationId)                 | Get an Open messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [**getConversationsMessagingIntegrationsTwitter**](ConversationsApi.md#getConversationsMessagingIntegrationsTwitter)                                     | Get a list of Twitter Integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**getConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi.md#getConversationsMessagingIntegrationsTwitterIntegrationId)           | Get a Twitter messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getConversationsMessagingIntegrationsWhatsapp**](ConversationsApi.md#getConversationsMessagingIntegrationsWhatsapp)                                   | Get a list of WhatsApp Integrations                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**getConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi.md#getConversationsMessagingIntegrationsWhatsappIntegrationId)         | Get a WhatsApp messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**getConversationsMessagingSticker**](ConversationsApi.md#getConversationsMessagingSticker)                                                             | Get a list of Messaging Stickers                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| [**getConversationsMessagingSupportedcontent**](ConversationsApi.md#getConversationsMessagingSupportedcontent)                                           | Get a list of Supported Content profiles                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**getConversationsMessagingSupportedcontentDefault**](ConversationsApi.md#getConversationsMessagingSupportedcontentDefault)                             | Get the organization&#39;s default supported content profile that will be used as the default when creating an integration.                                                                                                                                                                                                                                                                                                                                                                                                       |
| [**getConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi.md#getConversationsMessagingSupportedcontentSupportedContentId)       | Get a supported content profile                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**getConversationsMessagingThreadingtimeline**](ConversationsApi.md#getConversationsMessagingThreadingtimeline)                                         | Get conversation threading window timeline for each messaging type                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**patchConversationParticipant**](ConversationsApi.md#patchConversationParticipant)                                                                     | Update a participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**patchConversationParticipantAttributes**](ConversationsApi.md#patchConversationParticipantAttributes)                                                 | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsCall**](ConversationsApi.md#patchConversationsCall)                                                                                 | Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                        |
| [**patchConversationsCallParticipant**](ConversationsApi.md#patchConversationsCallParticipant)                                                           | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsCallParticipantAttributes**](ConversationsApi.md#patchConversationsCallParticipantAttributes)                                       | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsCallParticipantCommunication**](ConversationsApi.md#patchConversationsCallParticipantCommunication)                                 | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsCallParticipantConsult**](ConversationsApi.md#patchConversationsCallParticipantConsult)                                             | Change who can speak                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsCallback**](ConversationsApi.md#patchConversationsCallback)                                                                         | Update a conversation by disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**patchConversationsCallbackParticipant**](ConversationsApi.md#patchConversationsCallbackParticipant)                                                   | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsCallbackParticipantAttributes**](ConversationsApi.md#patchConversationsCallbackParticipantAttributes)                               | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsCallbackParticipantCommunication**](ConversationsApi.md#patchConversationsCallbackParticipantCommunication)                         | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsCallbacks**](ConversationsApi.md#patchConversationsCallbacks)                                                                       | Update a scheduled callback                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [**patchConversationsChat**](ConversationsApi.md#patchConversationsChat)                                                                                 | Update a conversation by disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**patchConversationsChatParticipant**](ConversationsApi.md#patchConversationsChatParticipant)                                                           | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsChatParticipantAttributes**](ConversationsApi.md#patchConversationsChatParticipantAttributes)                                       | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsChatParticipantCommunication**](ConversationsApi.md#patchConversationsChatParticipantCommunication)                                 | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsCobrowsesession**](ConversationsApi.md#patchConversationsCobrowsesession)                                                           | Update a conversation by disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**patchConversationsCobrowsesessionParticipant**](ConversationsApi.md#patchConversationsCobrowsesessionParticipant)                                     | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsCobrowsesessionParticipantAttributes**](ConversationsApi.md#patchConversationsCobrowsesessionParticipantAttributes)                 | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsCobrowsesessionParticipantCommunication**](ConversationsApi.md#patchConversationsCobrowsesessionParticipantCommunication)           | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsEmail**](ConversationsApi.md#patchConversationsEmail)                                                                               | Update a conversation by disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**patchConversationsEmailParticipant**](ConversationsApi.md#patchConversationsEmailParticipant)                                                         | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsEmailParticipantAttributes**](ConversationsApi.md#patchConversationsEmailParticipantAttributes)                                     | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsEmailParticipantCommunication**](ConversationsApi.md#patchConversationsEmailParticipantCommunication)                               | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsMessage**](ConversationsApi.md#patchConversationsMessage)                                                                           | Update a conversation by disconnecting all of the participants                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**patchConversationsMessageParticipant**](ConversationsApi.md#patchConversationsMessageParticipant)                                                     | Update conversation participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**patchConversationsMessageParticipantAttributes**](ConversationsApi.md#patchConversationsMessageParticipantAttributes)                                 | Update the attributes on a conversation participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsMessageParticipantCommunication**](ConversationsApi.md#patchConversationsMessageParticipantCommunication)                           | Update conversation participant&#39;s communication by disconnecting it.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**patchConversationsMessagingIntegrationsFacebookIntegrationId**](ConversationsApi.md#patchConversationsMessagingIntegrationsFacebookIntegrationId)     | Update Facebook messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**patchConversationsMessagingIntegrationsOpenIntegrationId**](ConversationsApi.md#patchConversationsMessagingIntegrationsOpenIntegrationId)             | Update an Open messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsMessagingIntegrationsTwitterIntegrationId**](ConversationsApi.md#patchConversationsMessagingIntegrationsTwitterIntegrationId)       | Update Twitter messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsMessagingIntegrationsWhatsappIntegrationId**](ConversationsApi.md#patchConversationsMessagingIntegrationsWhatsappIntegrationId)     | Update or activate a WhatsApp messaging integration.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**patchConversationsMessagingSupportedcontentSupportedContentId**](ConversationsApi.md#patchConversationsMessagingSupportedcontentSupportedContentId)   | Update a supported content profile                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**postAnalyticsConversationDetailsProperties**](ConversationsApi.md#postAnalyticsConversationDetailsProperties)                                         | Index conversation properties                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**postAnalyticsConversationsAggregatesQuery**](ConversationsApi.md#postAnalyticsConversationsAggregatesQuery)                                           | Query for conversation aggregates                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [**postAnalyticsConversationsDetailsJobs**](ConversationsApi.md#postAnalyticsConversationsDetailsJobs)                                                   | Query for conversation details asynchronously                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**postAnalyticsConversationsDetailsQuery**](ConversationsApi.md#postAnalyticsConversationsDetailsQuery)                                                 | Query for conversation details                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**postConversationAssign**](ConversationsApi.md#postConversationAssign)                                                                                 | Attempts to manually assign a specified conversation to a specified user. Ignores bullseye ring, PAR score, skills, and languages.                                                                                                                                                                                                                                                                                                                                                                                                |
| [**postConversationDisconnect**](ConversationsApi.md#postConversationDisconnect)                                                                         | Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation. |
| [**postConversationParticipantCallbacks**](ConversationsApi.md#postConversationParticipantCallbacks)                                                     | Create a new callback for the specified participant on the conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| [**postConversationParticipantDigits**](ConversationsApi.md#postConversationParticipantDigits)                                                           | Sends DTMF to the participant                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**postConversationParticipantReplace**](ConversationsApi.md#postConversationParticipantReplace)                                                         | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationParticipantSecureivrsessions**](ConversationsApi.md#postConversationParticipantSecureivrsessions)                                     | Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**postConversationsCall**](ConversationsApi.md#postConversationsCall)                                                                                   | Place a new call as part of a callback conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**postConversationsCallParticipantCoach**](ConversationsApi.md#postConversationsCallParticipantCoach)                                                   | Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.                                                                                                                                                                                                                                                                                                                                                                                                         |
| [**postConversationsCallParticipantConsult**](ConversationsApi.md#postConversationsCallParticipantConsult)                                               | Initiate and update consult transfer                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**postConversationsCallParticipantMonitor**](ConversationsApi.md#postConversationsCallParticipantMonitor)                                               | Listen in on the conversation from the point of view of a given participant.                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsCallParticipantReplace**](ConversationsApi.md#postConversationsCallParticipantReplace)                                               | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsCallParticipants**](ConversationsApi.md#postConversationsCallParticipants)                                                           | Add participants to a conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**postConversationsCallbackParticipantReplace**](ConversationsApi.md#postConversationsCallbackParticipantReplace)                                       | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsCallbacks**](ConversationsApi.md#postConversationsCallbacks)                                                                         | Create a Callback                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [**postConversationsCallbacksBulkDisconnect**](ConversationsApi.md#postConversationsCallbacksBulkDisconnect)                                             | Disconnect multiple scheduled callbacks                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**postConversationsCallbacksBulkUpdate**](ConversationsApi.md#postConversationsCallbacksBulkUpdate)                                                     | Update multiple scheduled callbacks                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**postConversationsCalls**](ConversationsApi.md#postConversationsCalls)                                                                                 | Create a call conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**postConversationsChatCommunicationMessages**](ConversationsApi.md#postConversationsChatCommunicationMessages)                                         | Send a message on behalf of a communication in a chat conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**postConversationsChatCommunicationTyping**](ConversationsApi.md#postConversationsChatCommunicationTyping)                                             | Send a typing-indicator on behalf of a communication in a chat conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsChatParticipantReplace**](ConversationsApi.md#postConversationsChatParticipantReplace)                                               | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsChats**](ConversationsApi.md#postConversationsChats)                                                                                 | Create a web chat conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| [**postConversationsCobrowsesessionParticipantReplace**](ConversationsApi.md#postConversationsCobrowsesessionParticipantReplace)                         | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsEmailInboundmessages**](ConversationsApi.md#postConversationsEmailInboundmessages)                                                   | Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.                                                                                                                                                                                                  |
| [**postConversationsEmailMessages**](ConversationsApi.md#postConversationsEmailMessages)                                                                 | Send an email reply                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**postConversationsEmailMessagesDraftAttachmentsCopy**](ConversationsApi.md#postConversationsEmailMessagesDraftAttachmentsCopy)                         | Copy attachments from an email message to the current draft.                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsEmailParticipantReplace**](ConversationsApi.md#postConversationsEmailParticipantReplace)                                             | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsEmails**](ConversationsApi.md#postConversationsEmails)                                                                               | Create an email conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsFaxes**](ConversationsApi.md#postConversationsFaxes)                                                                                 | Create Fax Conversation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**postConversationsMessageCommunicationMessages**](ConversationsApi.md#postConversationsMessageCommunicationMessages)                                   | Send message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsMessageCommunicationMessagesMedia**](ConversationsApi.md#postConversationsMessageCommunicationMessagesMedia)                         | Create media                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsMessageMessagesBulk**](ConversationsApi.md#postConversationsMessageMessagesBulk)                                                     | Get messages in batch                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| [**postConversationsMessageParticipantReplace**](ConversationsApi.md#postConversationsMessageParticipantReplace)                                         | Replace this participant with the specified user and/or address                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**postConversationsMessages**](ConversationsApi.md#postConversationsMessages)                                                                           | Create an outbound messaging conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**postConversationsMessagesAgentless**](ConversationsApi.md#postConversationsMessagesAgentless)                                                         | Send an agentless outbound message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**postConversationsMessagesInboundOpen**](ConversationsApi.md#postConversationsMessagesInboundOpen)                                                     | Send an inbound Open Message                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsMessagingIntegrationsFacebook**](ConversationsApi.md#postConversationsMessagingIntegrationsFacebook)                                 | Create a Facebook Integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**postConversationsMessagingIntegrationsLine**](ConversationsApi.md#postConversationsMessagingIntegrationsLine)                                         | Create a LINE messenger Integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**postConversationsMessagingIntegrationsOpen**](ConversationsApi.md#postConversationsMessagingIntegrationsOpen)                                         | Create an Open messaging integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**postConversationsMessagingIntegrationsTwitter**](ConversationsApi.md#postConversationsMessagingIntegrationsTwitter)                                   | Create a Twitter Integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| [**postConversationsMessagingIntegrationsWhatsapp**](ConversationsApi.md#postConversationsMessagingIntegrationsWhatsapp)                                 | Create a WhatsApp Integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [**postConversationsMessagingSupportedcontent**](ConversationsApi.md#postConversationsMessagingSupportedcontent)                                         | Create a Supported Content profile                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**putConversationParticipantFlaggedreason**](ConversationsApi.md#putConversationParticipantFlaggedreason)                                               | Set flagged reason on conversation participant to indicate bad conversation quality.                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| [**putConversationTags**](ConversationsApi.md#putConversationTags)                                                                                       | Update the tags on a conversation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| [**putConversationsCallParticipantCommunicationUuidata**](ConversationsApi.md#putConversationsCallParticipantCommunicationUuidata)                       | Set uuiData to be sent on future commands.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| [**putConversationsEmailMessagesDraft**](ConversationsApi.md#putConversationsEmailMessagesDraft)                                                         | Update conversation draft reply                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| [**putConversationsMessagingIntegrationsLineIntegrationId**](ConversationsApi.md#putConversationsMessagingIntegrationsLineIntegrationId)                 | Update a LINE messenger integration                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [**putConversationsMessagingSupportedcontentDefault**](ConversationsApi.md#putConversationsMessagingSupportedcontentDefault)                             | Set the organization&#39;s default supported content profile that may be assigned to an integration when it is created.                                                                                                                                                                                                                                                                                                                                                                                                           |
| [**putConversationsMessagingThreadingtimeline**](ConversationsApi.md#putConversationsMessagingThreadingtimeline)                                         | Update conversation threading window timeline for each messaging type                                                                                                                                                                                                                                                                                                                                                                                                                                                             |

{: class="table-striped"}

<a name="deleteAnalyticsConversationsDetailsJob"></a>

# **deleteAnalyticsConversationsDetailsJob**

> Void deleteAnalyticsConversationsDetailsJob(jobId)

Delete/cancel an async request

Wraps DELETE /api/v2/analytics/conversations/details/jobs/{jobId}

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteAnalyticsConversationsDetailsJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationParticipantCode"></a>

# **deleteConversationParticipantCode**

> Void deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode)

Delete a code used to add a communication to this participant

Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/codes/{addCommunicationCode}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String addCommunicationCode = "addCommunicationCode_example"; // String | addCommunicationCode
try {
    apiInstance.deleteConversationParticipantCode(conversationId, participantId, addCommunicationCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationParticipantCode");
    e.printStackTrace();
}
```

### Parameters

| Name                     | Type       | Description          | Notes |
| ------------------------ | ---------- | -------------------- | ----- |
| **conversationId**       | **String** | conversation ID      |
| **participantId**        | **String** | participant ID       |
| **addCommunicationCode** | **String** | addCommunicationCode |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationParticipantFlaggedreason"></a>

# **deleteConversationParticipantFlaggedreason**

> Void deleteConversationParticipantFlaggedreason(conversationId, participantId)

Remove flagged reason from conversation participant.

Wraps DELETE /api/v2/conversations/{conversationId}/participants/{participantId}/flaggedreason

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    apiInstance.deleteConversationParticipantFlaggedreason(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationParticipantFlaggedreason");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |
| **participantId**  | **String** | participant ID  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsCallParticipantConsult"></a>

# **deleteConversationsCallParticipantConsult**

> Void deleteConversationsCallParticipantConsult(conversationId, participantId)

Cancel the transfer

Wraps DELETE /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.deleteConversationsCallParticipantConsult(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsEmailMessagesDraftAttachment"></a>

# **deleteConversationsEmailMessagesDraftAttachment**

> Void deleteConversationsEmailMessagesDraftAttachment(conversationId, attachmentId)

Delete attachment from draft

Wraps DELETE /api/v2/conversations/emails/{conversationId}/messages/draft/attachments/{attachmentId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String attachmentId = "attachmentId_example"; // String | attachmentId
try {
    apiInstance.deleteConversationsEmailMessagesDraftAttachment(conversationId, attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsEmailMessagesDraftAttachment");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **attachmentId**   | **String** | attachmentId   |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsFacebookIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsFacebookIntegrationId**

> Void deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId)

Delete a Facebook messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/facebook/{integrationId}

Requires ALL permissions:

- messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsFacebookIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsLineIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsLineIntegrationId**

> Void deleteConversationsMessagingIntegrationsLineIntegrationId(integrationId)

Delete a LINE messenger integration

Wraps DELETE /api/v2/conversations/messaging/integrations/line/{integrationId}

Requires ALL permissions:

- messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsLineIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsOpenIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsOpenIntegrationId**

> Void deleteConversationsMessagingIntegrationsOpenIntegrationId(integrationId)

Delete an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps DELETE /api/v2/conversations/messaging/integrations/open/{integrationId}

Requires ALL permissions:

- messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsOpenIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsTwitterIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsTwitterIntegrationId**

> Void deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId)

Delete a Twitter messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/twitter/{integrationId}

Requires ALL permissions:

- messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    apiInstance.deleteConversationsMessagingIntegrationsTwitterIntegrationId(integrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteConversationsMessagingIntegrationsWhatsappIntegrationId"></a>

# **deleteConversationsMessagingIntegrationsWhatsappIntegrationId**

> [WhatsAppIntegration](WhatsAppIntegration.md) deleteConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId)

Delete a WhatsApp messaging integration

Wraps DELETE /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}

Requires ALL permissions:

- messaging:integration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
try {
    WhatsAppIntegration result = apiInstance.deleteConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **integrationId** | **String** | Integration ID |

{: class="table-striped"}

### Return type

[**WhatsAppIntegration**](WhatsAppIntegration.md)

<a name="deleteConversationsMessagingSupportedcontentSupportedContentId"></a>

# **deleteConversationsMessagingSupportedcontentSupportedContentId**

> Void deleteConversationsMessagingSupportedcontentSupportedContentId(supportedContentId)

Delete a supported content profile

Wraps DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId}

Requires ALL permissions:

- messaging:supportedContent:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    apiInstance.deleteConversationsMessagingSupportedcontentSupportedContentId(supportedContentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#deleteConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description          | Notes |
| ---------------------- | ---------- | -------------------- | ----- |
| **supportedContentId** | **String** | Supported Content ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getAnalyticsConversationDetails"></a>

# **getAnalyticsConversationDetails**

> [AnalyticsConversationWithoutAttributes](AnalyticsConversationWithoutAttributes.md) getAnalyticsConversationDetails(conversationId)

Get a conversation by id

Wraps GET /api/v2/analytics/conversations/{conversationId}/details

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    AnalyticsConversationWithoutAttributes result = apiInstance.getAnalyticsConversationDetails(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationDetails");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**AnalyticsConversationWithoutAttributes**](AnalyticsConversationWithoutAttributes.md)

<a name="getAnalyticsConversationsDetails"></a>

# **getAnalyticsConversationsDetails**

> [AnalyticsConversationWithoutAttributesMultiGetResponse](AnalyticsConversationWithoutAttributesMultiGetResponse.md) getAnalyticsConversationsDetails(id)

Gets multiple conversations by id

Wraps GET /api/v2/analytics/conversations/details

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
List<String> id = Arrays.asList("id_example"); // List<String> | Comma-separated conversation ids
try {
    AnalyticsConversationWithoutAttributesMultiGetResponse result = apiInstance.getAnalyticsConversationsDetails(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetails");
    e.printStackTrace();
}
```

### Parameters

| Name   | Type                                | Description                      | Notes      |
| ------ | ----------------------------------- | -------------------------------- | ---------- |
| **id** | [**List&lt;String&gt;**](String.md) | Comma-separated conversation ids | [optional] |

{: class="table-striped"}

### Return type

[**AnalyticsConversationWithoutAttributesMultiGetResponse**](AnalyticsConversationWithoutAttributesMultiGetResponse.md)

<a name="getAnalyticsConversationsDetailsJob"></a>

# **getAnalyticsConversationsDetailsJob**

> [AsyncQueryStatus](AsyncQueryStatus.md) getAnalyticsConversationsDetailsJob(jobId)

Get status for async query for conversation details

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
try {
    AsyncQueryStatus result = apiInstance.getAnalyticsConversationsDetailsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJob");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **jobId** | **String** | jobId       |

{: class="table-striped"}

### Return type

[**AsyncQueryStatus**](AsyncQueryStatus.md)

<a name="getAnalyticsConversationsDetailsJobResults"></a>

# **getAnalyticsConversationsDetailsJobResults**

> [AnalyticsConversationAsyncQueryResponse](AnalyticsConversationAsyncQueryResponse.md) getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize)

Fetch a page of results for an async query

Wraps GET /api/v2/analytics/conversations/details/jobs/{jobId}/results

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String jobId = "jobId_example"; // String | jobId
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 56; // Integer | The desired maximum number of results
try {
    AnalyticsConversationAsyncQueryResponse result = apiInstance.getAnalyticsConversationsDetailsJobResults(jobId, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJobResults");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type        | Description                                                           | Notes      |
| ------------ | ----------- | --------------------------------------------------------------------- | ---------- |
| **jobId**    | **String**  | jobId                                                                 |
| **cursor**   | **String**  | Indicates where to resume query results (not required for first page) | [optional] |
| **pageSize** | **Integer** | The desired maximum number of results                                 | [optional] |

{: class="table-striped"}

### Return type

[**AnalyticsConversationAsyncQueryResponse**](AnalyticsConversationAsyncQueryResponse.md)

<a name="getAnalyticsConversationsDetailsJobsAvailability"></a>

# **getAnalyticsConversationsDetailsJobsAvailability**

> [DataAvailabilityResponse](DataAvailabilityResponse.md) getAnalyticsConversationsDetailsJobsAvailability()

Lookup the datalake availability date and time

Wraps GET /api/v2/analytics/conversations/details/jobs/availability

Requires ANY permissions:

- analytics:conversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    DataAvailabilityResponse result = apiInstance.getAnalyticsConversationsDetailsJobsAvailability();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getAnalyticsConversationsDetailsJobsAvailability");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**DataAvailabilityResponse**](DataAvailabilityResponse.md)

<a name="getConversation"></a>

# **getConversation**

> [Conversation](Conversation.md) getConversation(conversationId)

Get conversation

Wraps GET /api/v2/conversations/{conversationId}

Requires ANY permissions:

- conversation:communication:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    Conversation result = apiInstance.getConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversation");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="getConversationParticipantSecureivrsession"></a>

# **getConversationParticipantSecureivrsession**

> [SecureSession](SecureSession.md) getConversationParticipantSecureivrsession(conversationId, participantId, secureSessionId)

Fetch info on a secure session

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions/{secureSessionId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
String secureSessionId = "secureSessionId_example"; // String | secure IVR session ID
try {
    SecureSession result = apiInstance.getConversationParticipantSecureivrsession(conversationId, participantId, secureSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantSecureivrsession");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description           | Notes |
| ------------------- | ---------- | --------------------- | ----- |
| **conversationId**  | **String** | conversation ID       |
| **participantId**   | **String** | participant ID        |
| **secureSessionId** | **String** | secure IVR session ID |

{: class="table-striped"}

### Return type

[**SecureSession**](SecureSession.md)

<a name="getConversationParticipantSecureivrsessions"></a>

# **getConversationParticipantSecureivrsessions**

> [SecureSessionEntityListing](SecureSessionEntityListing.md) getConversationParticipantSecureivrsessions(conversationId, participantId)

Get a list of secure sessions for this participant.

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    SecureSessionEntityListing result = apiInstance.getConversationParticipantSecureivrsessions(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantSecureivrsessions");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |
| **participantId**  | **String** | participant ID  |

{: class="table-striped"}

### Return type

[**SecureSessionEntityListing**](SecureSessionEntityListing.md)

<a name="getConversationParticipantWrapup"></a>

# **getConversationParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversation ID                               |
| **participantId**  | **String**  | participant ID                                |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationParticipantWrapupcodes"></a>

# **getConversationParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    List<WrapupCode> result = apiInstance.getConversationParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |
| **participantId**  | **String** | participant ID  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversations"></a>

# **getConversations**

> [ConversationEntityListing](ConversationEntityListing.md) getConversations(communicationType)

Get active conversations for the logged in user

Wraps GET /api/v2/conversations

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String communicationType = "communicationType_example"; // String | Call or Chat communication filtering
try {
    ConversationEntityListing result = apiInstance.getConversations(communicationType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversations");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type       | Description                          | Notes      |
| --------------------- | ---------- | ------------------------------------ | ---------- |
| **communicationType** | **String** | Call or Chat communication filtering | [optional] |

{: class="table-striped"}

### Return type

[**ConversationEntityListing**](ConversationEntityListing.md)

<a name="getConversationsCall"></a>

# **getConversationsCall**

> [CallConversation](CallConversation.md) getConversationsCall(conversationId)

Get call conversation

Wraps GET /api/v2/conversations/calls/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CallConversation result = apiInstance.getConversationsCall(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCall");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**CallConversation**](CallConversation.md)

<a name="getConversationsCallParticipantWrapup"></a>

# **getConversationsCallParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsCallParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/calls/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsCallParticipantWrapupcodes"></a>

# **getConversationsCallParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsCallParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/calls/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsCallback"></a>

# **getConversationsCallback**

> [CallbackConversation](CallbackConversation.md) getConversationsCallback(conversationId)

Get callback conversation

Wraps GET /api/v2/conversations/callbacks/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CallbackConversation result = apiInstance.getConversationsCallback(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallback");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**CallbackConversation**](CallbackConversation.md)

<a name="getConversationsCallbackParticipantWrapup"></a>

# **getConversationsCallbackParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsCallbackParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCallbackParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsCallbackParticipantWrapupcodes"></a>

# **getConversationsCallbackParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsCallbackParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCallbackParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbackParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsCallbacks"></a>

# **getConversationsCallbacks**

> [CallbackConversationEntityListing](CallbackConversationEntityListing.md) getConversationsCallbacks()

Get active callback conversations for the logged in user

Wraps GET /api/v2/conversations/callbacks

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallbackConversationEntityListing result = apiInstance.getConversationsCallbacks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CallbackConversationEntityListing**](CallbackConversationEntityListing.md)

<a name="getConversationsCalls"></a>

# **getConversationsCalls**

> [CallConversationEntityListing](CallConversationEntityListing.md) getConversationsCalls()

Get active call conversations for the logged in user

Wraps GET /api/v2/conversations/calls

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CallConversationEntityListing result = apiInstance.getConversationsCalls();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCalls");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CallConversationEntityListing**](CallConversationEntityListing.md)

<a name="getConversationsCallsHistory"></a>

# **getConversationsCallsHistory**

> [CallHistoryConversationEntityListing](CallHistoryConversationEntityListing.md) getConversationsCallsHistory(pageSize, pageNumber, interval, expand)

Get call history

Wraps GET /api/v2/conversations/calls/history

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size, maximum 50
Integer pageNumber = 1; // Integer | Page number
String interval = "interval_example"; // String | Interval string; format is ISO-8601. Separate start and end times with forward slash '/'
List<String> expand = Arrays.asList("expand_example"); // List<String> | Which fields, if any, to expand.
try {
    CallHistoryConversationEntityListing result = apiInstance.getConversationsCallsHistory(pageSize, pageNumber, interval, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsHistory");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                                                                      | Notes                                                                                 |
| -------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------- |
| **pageSize**   | **Integer**                         | Page size, maximum 50                                                                            | [optional] [default to 25]                                                            |
| **pageNumber** | **Integer**                         | Page number                                                                                      | [optional] [default to 1]                                                             |
| **interval**   | **String**                          | Interval string; format is ISO-8601. Separate start and end times with forward slash &#39;/&#39; | [optional]                                                                            |
| **expand**     | [**List&lt;String&gt;**](String.md) | Which fields, if any, to expand.                                                                 | [optional]<br />**Values**: externalorganization, externalcontact, user, queue, group |

{: class="table-striped"}

### Return type

[**CallHistoryConversationEntityListing**](CallHistoryConversationEntityListing.md)

<a name="getConversationsCallsMaximumconferenceparties"></a>

# **getConversationsCallsMaximumconferenceparties**

> [MaxParticipants](MaxParticipants.md) getConversationsCallsMaximumconferenceparties()

Get the maximum number of participants that this user can have on a conference

Wraps GET /api/v2/conversations/calls/maximumconferenceparties

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    MaxParticipants result = apiInstance.getConversationsCallsMaximumconferenceparties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCallsMaximumconferenceparties");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**MaxParticipants**](MaxParticipants.md)

<a name="getConversationsChat"></a>

# **getConversationsChat**

> [ChatConversation](ChatConversation.md) getConversationsChat(conversationId)

Get chat conversation

Wraps GET /api/v2/conversations/chats/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    ChatConversation result = apiInstance.getConversationsChat(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChat");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**ChatConversation**](ChatConversation.md)

<a name="getConversationsChatMessage"></a>

# **getConversationsChatMessage**

> [WebChatMessage](WebChatMessage.md) getConversationsChatMessage(conversationId, messageId)

Get a web chat conversation message

The current user must be involved with the conversation to get its messages.

Wraps GET /api/v2/conversations/chats/{conversationId}/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    WebChatMessage result = apiInstance.getConversationsChatMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **messageId**      | **String** | messageId      |

{: class="table-striped"}

### Return type

[**WebChatMessage**](WebChatMessage.md)

<a name="getConversationsChatMessages"></a>

# **getConversationsChatMessages**

> [WebChatMessageEntityList](WebChatMessageEntityList.md) getConversationsChatMessages(conversationId, after, before, sortOrder, maxResults)

Get the messages of a chat conversation.

The current user must be involved with the conversation to get its messages.

Wraps GET /api/v2/conversations/chats/{conversationId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String after = "after_example"; // String | If specified, get the messages chronologically after the id of this message
String before = "before_example"; // String | If specified, get the messages chronologically before the id of this message
String sortOrder = "ascending"; // String | Sort order
Integer maxResults = 100; // Integer | Limit the returned number of messages, up to a maximum of 100
try {
    WebChatMessageEntityList result = apiInstance.getConversationsChatMessages(conversationId, after, before, sortOrder, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatMessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                                                  | Notes                                                                    |
| ------------------ | ----------- | ---------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| **conversationId** | **String**  | conversationId                                                               |
| **after**          | **String**  | If specified, get the messages chronologically after the id of this message  | [optional]                                                               |
| **before**         | **String**  | If specified, get the messages chronologically before the id of this message | [optional]                                                               |
| **sortOrder**      | **String**  | Sort order                                                                   | [optional] [default to ascending]<br />**Values**: ascending, descending |
| **maxResults**     | **Integer** | Limit the returned number of messages, up to a maximum of 100                | [optional] [default to 100]                                              |

{: class="table-striped"}

### Return type

[**WebChatMessageEntityList**](WebChatMessageEntityList.md)

<a name="getConversationsChatParticipantWrapup"></a>

# **getConversationsChatParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsChatParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/chats/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsChatParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsChatParticipantWrapupcodes"></a>

# **getConversationsChatParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsChatParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/chats/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsChatParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChatParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsChats"></a>

# **getConversationsChats**

> [ChatConversationEntityListing](ChatConversationEntityListing.md) getConversationsChats()

Get active chat conversations for the logged in user

Wraps GET /api/v2/conversations/chats

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    ChatConversationEntityListing result = apiInstance.getConversationsChats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsChats");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ChatConversationEntityListing**](ChatConversationEntityListing.md)

<a name="getConversationsCobrowsesession"></a>

# **getConversationsCobrowsesession**

> [CobrowseConversation](CobrowseConversation.md) getConversationsCobrowsesession(conversationId)

Get cobrowse conversation

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    CobrowseConversation result = apiInstance.getConversationsCobrowsesession(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesession");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**CobrowseConversation**](CobrowseConversation.md)

<a name="getConversationsCobrowsesessionParticipantWrapup"></a>

# **getConversationsCobrowsesessionParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsCobrowsesessionParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsCobrowsesessionParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsCobrowsesessionParticipantWrapupcodes"></a>

# **getConversationsCobrowsesessionParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsCobrowsesessionParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsCobrowsesessionParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessionParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsCobrowsesessions"></a>

# **getConversationsCobrowsesessions**

> [CobrowseConversationEntityListing](CobrowseConversationEntityListing.md) getConversationsCobrowsesessions()

Get active cobrowse conversations for the logged in user

Wraps GET /api/v2/conversations/cobrowsesessions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    CobrowseConversationEntityListing result = apiInstance.getConversationsCobrowsesessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsCobrowsesessions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CobrowseConversationEntityListing**](CobrowseConversationEntityListing.md)

<a name="getConversationsEmail"></a>

# **getConversationsEmail**

> [EmailConversation](EmailConversation.md) getConversationsEmail(conversationId)

Get email conversation

Wraps GET /api/v2/conversations/emails/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailConversation result = apiInstance.getConversationsEmail(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmail");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**EmailConversation**](EmailConversation.md)

<a name="getConversationsEmailMessage"></a>

# **getConversationsEmailMessage**

> [EmailMessage](EmailMessage.md) getConversationsEmailMessage(conversationId, messageId)

Get conversation message

Wraps GET /api/v2/conversations/emails/{conversationId}/messages/{messageId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **messageId**      | **String** | messageId      |

{: class="table-striped"}

### Return type

[**EmailMessage**](EmailMessage.md)

<a name="getConversationsEmailMessages"></a>

# **getConversationsEmailMessages**

> [EmailMessageListing](EmailMessageListing.md) getConversationsEmailMessages(conversationId)

Get conversation messages

Wraps GET /api/v2/conversations/emails/{conversationId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailMessageListing result = apiInstance.getConversationsEmailMessages(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**EmailMessageListing**](EmailMessageListing.md)

<a name="getConversationsEmailMessagesDraft"></a>

# **getConversationsEmailMessagesDraft**

> [EmailMessage](EmailMessage.md) getConversationsEmailMessagesDraft(conversationId)

Get conversation draft reply

Wraps GET /api/v2/conversations/emails/{conversationId}/messages/draft

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailMessage result = apiInstance.getConversationsEmailMessagesDraft(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailMessagesDraft");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**EmailMessage**](EmailMessage.md)

<a name="getConversationsEmailParticipantWrapup"></a>

# **getConversationsEmailParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsEmailParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/emails/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsEmailParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsEmailParticipantWrapupcodes"></a>

# **getConversationsEmailParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsEmailParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/emails/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsEmailParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsEmailSettings"></a>

# **getConversationsEmailSettings**

> [EmailsSettings](EmailsSettings.md) getConversationsEmailSettings(conversationId)

Get emails settings for a given conversation

Wraps GET /api/v2/conversations/emails/{conversationId}/settings

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    EmailsSettings result = apiInstance.getConversationsEmailSettings(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmailSettings");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**EmailsSettings**](EmailsSettings.md)

<a name="getConversationsEmails"></a>

# **getConversationsEmails**

> [EmailConversationEntityListing](EmailConversationEntityListing.md) getConversationsEmails()

Get active email conversations for the logged in user

Wraps GET /api/v2/conversations/emails

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    EmailConversationEntityListing result = apiInstance.getConversationsEmails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsEmails");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EmailConversationEntityListing**](EmailConversationEntityListing.md)

<a name="getConversationsMessage"></a>

# **getConversationsMessage**

> [MessageConversation](MessageConversation.md) getConversationsMessage(conversationId)

Get message conversation

Wraps GET /api/v2/conversations/messages/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
try {
    MessageConversation result = apiInstance.getConversationsMessage(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |

{: class="table-striped"}

### Return type

[**MessageConversation**](MessageConversation.md)

<a name="getConversationsMessageCommunicationMessagesMediaMediaId"></a>

# **getConversationsMessageCommunicationMessagesMediaMediaId**

> [MessageMediaData](MessageMediaData.md) getConversationsMessageCommunicationMessagesMediaMediaId(conversationId, communicationId, mediaId)

Get media

See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.

Wraps GET /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media/{mediaId}

Requires ANY permissions:

- conversation:message:view
- conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
String mediaId = "mediaId_example"; // String | mediaId
try {
    MessageMediaData result = apiInstance.getConversationsMessageCommunicationMessagesMediaMediaId(conversationId, communicationId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageCommunicationMessagesMediaMediaId");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description     | Notes |
| ------------------- | ---------- | --------------- | ----- |
| **conversationId**  | **String** | conversationId  |
| **communicationId** | **String** | communicationId |
| **mediaId**         | **String** | mediaId         |

{: class="table-striped"}

### Return type

[**MessageMediaData**](MessageMediaData.md)

<a name="getConversationsMessageDetails"></a>

# **getConversationsMessageDetails**

> [MessageData](MessageData.md) getConversationsMessageDetails(messageId)

Get message

Wraps GET /api/v2/conversations/messages/{messageId}/details

Requires ANY permissions:

- conversation:message:view
- conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messageId = "messageId_example"; // String | messageId
try {
    MessageData result = apiInstance.getConversationsMessageDetails(messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageDetails");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **messageId** | **String** | messageId   |

{: class="table-striped"}

### Return type

[**MessageData**](MessageData.md)

<a name="getConversationsMessageMessage"></a>

# **getConversationsMessageMessage**

> [MessageData](MessageData.md) getConversationsMessageMessage(conversationId, messageId)

Get conversation message

Wraps GET /api/v2/conversations/messages/{conversationId}/messages/{messageId}

Requires ANY permissions:

- conversation:message:view
- conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String messageId = "messageId_example"; // String | messageId
try {
    MessageData result = apiInstance.getConversationsMessageMessage(conversationId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **messageId**      | **String** | messageId      |

{: class="table-striped"}

### Return type

[**MessageData**](MessageData.md)

<a name="getConversationsMessageParticipantWrapup"></a>

# **getConversationsMessageParticipantWrapup**

> [AssignedWrapupCode](AssignedWrapupCode.md) getConversationsMessageParticipantWrapup(conversationId, participantId, provisional)

Get the wrap-up for this conversation participant.

Wraps GET /api/v2/conversations/messages/{conversationId}/participants/{participantId}/wrapup

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
Boolean provisional = false; // Boolean | Indicates if the wrap-up code is provisional.
try {
    AssignedWrapupCode result = apiInstance.getConversationsMessageParticipantWrapup(conversationId, participantId, provisional);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageParticipantWrapup");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description                                   | Notes                         |
| ------------------ | ----------- | --------------------------------------------- | ----------------------------- |
| **conversationId** | **String**  | conversationId                                |
| **participantId**  | **String**  | participantId                                 |
| **provisional**    | **Boolean** | Indicates if the wrap-up code is provisional. | [optional] [default to false] |

{: class="table-striped"}

### Return type

[**AssignedWrapupCode**](AssignedWrapupCode.md)

<a name="getConversationsMessageParticipantWrapupcodes"></a>

# **getConversationsMessageParticipantWrapupcodes**

> [List&lt;WrapupCode&gt;](WrapupCode.md) getConversationsMessageParticipantWrapupcodes(conversationId, participantId)

Get list of wrapup codes for this conversation participant

Wraps GET /api/v2/conversations/messages/{conversationId}/participants/{participantId}/wrapupcodes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String |  conversationId
String participantId = "participantId_example"; // String | participantId
try {
    List<WrapupCode> result = apiInstance.getConversationsMessageParticipantWrapupcodes(conversationId, participantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessageParticipantWrapupcodes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

[**List&lt;WrapupCode&gt;**](WrapupCode.md)

<a name="getConversationsMessages"></a>

# **getConversationsMessages**

> [MessageConversationEntityListing](MessageConversationEntityListing.md) getConversationsMessages()

Get active message conversations for the logged in user

Wraps GET /api/v2/conversations/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    MessageConversationEntityListing result = apiInstance.getConversationsMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**MessageConversationEntityListing**](MessageConversationEntityListing.md)

<a name="getConversationsMessagingFacebookApp"></a>

# **getConversationsMessagingFacebookApp**

> [FacebookAppCredentials](FacebookAppCredentials.md) getConversationsMessagingFacebookApp()

Get Genesys Facebook App Id

Wraps GET /api/v2/conversations/messaging/facebook/app

Requires ALL permissions:

- messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    FacebookAppCredentials result = apiInstance.getConversationsMessagingFacebookApp();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingFacebookApp");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**FacebookAppCredentials**](FacebookAppCredentials.md)

<a name="getConversationsMessagingIntegrations"></a>

# **getConversationsMessagingIntegrations**

> [MessagingIntegrationEntityListing](MessagingIntegrationEntityListing.md) getConversationsMessagingIntegrations(pageSize, pageNumber, expand, supportedContentId)

Get a list of Integrations

Wraps GET /api/v2/conversations/messaging/integrations

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    MessagingIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrations(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrations");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**MessagingIntegrationEntityListing**](MessagingIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsFacebook"></a>

# **getConversationsMessagingIntegrationsFacebook**

> [FacebookIntegrationEntityListing](FacebookIntegrationEntityListing.md) getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber, expand, supportedContentId)

Get a list of Facebook Integrations

Wraps GET /api/v2/conversations/messaging/integrations/facebook

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    FacebookIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsFacebook(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**FacebookIntegrationEntityListing**](FacebookIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsFacebookIntegrationId"></a>

# **getConversationsMessagingIntegrationsFacebookIntegrationId**

> [FacebookIntegration](FacebookIntegration.md) getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, expand)

Get a Facebook messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/facebook/{integrationId}

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    FacebookIntegration result = apiInstance.getConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes                                        |
| ----------------- | ---------- | ----------------------------------------- | -------------------------------------------- |
| **integrationId** | **String** | Integration ID                            |
| **expand**        | **String** | Expand instructions for the return value. | [optional]<br />**Values**: supportedContent |

{: class="table-striped"}

### Return type

[**FacebookIntegration**](FacebookIntegration.md)

<a name="getConversationsMessagingIntegrationsLine"></a>

# **getConversationsMessagingIntegrationsLine**

> [LineIntegrationEntityListing](LineIntegrationEntityListing.md) getConversationsMessagingIntegrationsLine(pageSize, pageNumber, expand, supportedContentId)

Get a list of LINE messenger Integrations

Wraps GET /api/v2/conversations/messaging/integrations/line

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    LineIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsLine(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsLine");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**LineIntegrationEntityListing**](LineIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsLineIntegrationId"></a>

# **getConversationsMessagingIntegrationsLineIntegrationId**

> [LineIntegration](LineIntegration.md) getConversationsMessagingIntegrationsLineIntegrationId(integrationId, expand)

Get a LINE messenger integration

Wraps GET /api/v2/conversations/messaging/integrations/line/{integrationId}

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    LineIntegration result = apiInstance.getConversationsMessagingIntegrationsLineIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes                                        |
| ----------------- | ---------- | ----------------------------------------- | -------------------------------------------- |
| **integrationId** | **String** | Integration ID                            |
| **expand**        | **String** | Expand instructions for the return value. | [optional]<br />**Values**: supportedContent |

{: class="table-striped"}

### Return type

[**LineIntegration**](LineIntegration.md)

<a name="getConversationsMessagingIntegrationsOpen"></a>

# **getConversationsMessagingIntegrationsOpen**

> [OpenIntegrationEntityListing](OpenIntegrationEntityListing.md) getConversationsMessagingIntegrationsOpen(pageSize, pageNumber, expand, supportedContentId)

Get a list of Open messaging integrations

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps GET /api/v2/conversations/messaging/integrations/open

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    OpenIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsOpen(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsOpen");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**OpenIntegrationEntityListing**](OpenIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsOpenIntegrationId"></a>

# **getConversationsMessagingIntegrationsOpenIntegrationId**

> [OpenIntegration](OpenIntegration.md) getConversationsMessagingIntegrationsOpenIntegrationId(integrationId, expand)

Get an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps GET /api/v2/conversations/messaging/integrations/open/{integrationId}

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    OpenIntegration result = apiInstance.getConversationsMessagingIntegrationsOpenIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes                                        |
| ----------------- | ---------- | ----------------------------------------- | -------------------------------------------- |
| **integrationId** | **String** | Integration ID                            |
| **expand**        | **String** | Expand instructions for the return value. | [optional]<br />**Values**: supportedContent |

{: class="table-striped"}

### Return type

[**OpenIntegration**](OpenIntegration.md)

<a name="getConversationsMessagingIntegrationsTwitter"></a>

# **getConversationsMessagingIntegrationsTwitter**

> [TwitterIntegrationEntityListing](TwitterIntegrationEntityListing.md) getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber, expand, supportedContentId)

Get a list of Twitter Integrations

Wraps GET /api/v2/conversations/messaging/integrations/twitter

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    TwitterIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsTwitter(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**TwitterIntegrationEntityListing**](TwitterIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsTwitterIntegrationId"></a>

# **getConversationsMessagingIntegrationsTwitterIntegrationId**

> [TwitterIntegration](TwitterIntegration.md) getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, expand)

Get a Twitter messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/twitter/{integrationId}

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    TwitterIntegration result = apiInstance.getConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes                                        |
| ----------------- | ---------- | ----------------------------------------- | -------------------------------------------- |
| **integrationId** | **String** | Integration ID                            |
| **expand**        | **String** | Expand instructions for the return value. | [optional]<br />**Values**: supportedContent |

{: class="table-striped"}

### Return type

[**TwitterIntegration**](TwitterIntegration.md)

<a name="getConversationsMessagingIntegrationsWhatsapp"></a>

# **getConversationsMessagingIntegrationsWhatsapp**

> [WhatsAppIntegrationEntityListing](WhatsAppIntegrationEntityListing.md) getConversationsMessagingIntegrationsWhatsapp(pageSize, pageNumber, expand, supportedContentId)

Get a list of WhatsApp Integrations

Wraps GET /api/v2/conversations/messaging/integrations/whatsapp

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String expand = "expand_example"; // String | Expand instructions for the return value.
String supportedContentId = "supportedContentId_example"; // String | Filter integrations returned based on the supported content ID
try {
    WhatsAppIntegrationEntityListing result = apiInstance.getConversationsMessagingIntegrationsWhatsapp(pageSize, pageNumber, expand, supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsWhatsapp");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type        | Description                                                    | Notes                                        |
| ---------------------- | ----------- | -------------------------------------------------------------- | -------------------------------------------- |
| **pageSize**           | **Integer** | Page size                                                      | [optional] [default to 25]                   |
| **pageNumber**         | **Integer** | Page number                                                    | [optional] [default to 1]                    |
| **expand**             | **String**  | Expand instructions for the return value.                      | [optional]<br />**Values**: supportedContent |
| **supportedContentId** | **String**  | Filter integrations returned based on the supported content ID | [optional]                                   |

{: class="table-striped"}

### Return type

[**WhatsAppIntegrationEntityListing**](WhatsAppIntegrationEntityListing.md)

<a name="getConversationsMessagingIntegrationsWhatsappIntegrationId"></a>

# **getConversationsMessagingIntegrationsWhatsappIntegrationId**

> [WhatsAppIntegration](WhatsAppIntegration.md) getConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, expand)

Get a WhatsApp messaging integration

Wraps GET /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}

Requires ALL permissions:

- messaging:integration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
String expand = "expand_example"; // String | Expand instructions for the return value.
try {
    WhatsAppIntegration result = apiInstance.getConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description                               | Notes                                        |
| ----------------- | ---------- | ----------------------------------------- | -------------------------------------------- |
| **integrationId** | **String** | Integration ID                            |
| **expand**        | **String** | Expand instructions for the return value. | [optional]<br />**Values**: supportedContent |

{: class="table-striped"}

### Return type

[**WhatsAppIntegration**](WhatsAppIntegration.md)

<a name="getConversationsMessagingSticker"></a>

# **getConversationsMessagingSticker**

> [MessagingStickerEntityListing](MessagingStickerEntityListing.md) getConversationsMessagingSticker(messengerType, pageSize, pageNumber)

Get a list of Messaging Stickers

Wraps GET /api/v2/conversations/messaging/stickers/{messengerType}

Requires ALL permissions:

- conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String messengerType = "messengerType_example"; // String | Messenger Type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    MessagingStickerEntityListing result = apiInstance.getConversationsMessagingSticker(messengerType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSticker");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type        | Description    | Notes                      |
| ----------------- | ----------- | -------------- | -------------------------- |
| **messengerType** | **String**  | Messenger Type |
| **pageSize**      | **Integer** | Page size      | [optional] [default to 25] |
| **pageNumber**    | **Integer** | Page number    | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**MessagingStickerEntityListing**](MessagingStickerEntityListing.md)

<a name="getConversationsMessagingSupportedcontent"></a>

# **getConversationsMessagingSupportedcontent**

> [SupportedContentListing](SupportedContentListing.md) getConversationsMessagingSupportedcontent(pageSize, pageNumber)

Get a list of Supported Content profiles

Wraps GET /api/v2/conversations/messaging/supportedcontent

Requires ALL permissions:

- messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SupportedContentListing result = apiInstance.getConversationsMessagingSupportedcontent(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontent");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**SupportedContentListing**](SupportedContentListing.md)

<a name="getConversationsMessagingSupportedcontentDefault"></a>

# **getConversationsMessagingSupportedcontentDefault**

> [SupportedContent](SupportedContent.md) getConversationsMessagingSupportedcontentDefault()

Get the organization&#39;s default supported content profile that will be used as the default when creating an integration.

When an integration is created a supported content ID may be assigned to it. If the supported content ID is not supplied, the default supported content profile will be assigned to it.

Wraps GET /api/v2/conversations/messaging/supportedcontent/default

Requires ALL permissions:

- messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    SupportedContent result = apiInstance.getConversationsMessagingSupportedcontentDefault();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontentDefault");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**SupportedContent**](SupportedContent.md)

<a name="getConversationsMessagingSupportedcontentSupportedContentId"></a>

# **getConversationsMessagingSupportedcontentSupportedContentId**

> [SupportedContent](SupportedContent.md) getConversationsMessagingSupportedcontentSupportedContentId(supportedContentId)

Get a supported content profile

Wraps GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId}

Requires ALL permissions:

- messaging:supportedContent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
try {
    SupportedContent result = apiInstance.getConversationsMessagingSupportedcontentSupportedContentId(supportedContentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description          | Notes |
| ---------------------- | ---------- | -------------------- | ----- |
| **supportedContentId** | **String** | Supported Content ID |

{: class="table-striped"}

### Return type

[**SupportedContent**](SupportedContent.md)

<a name="getConversationsMessagingThreadingtimeline"></a>

# **getConversationsMessagingThreadingtimeline**

> [ConversationThreadingWindow](ConversationThreadingWindow.md) getConversationsMessagingThreadingtimeline()

Get conversation threading window timeline for each messaging type

Conversation messaging threading timeline is a setting defined for each messenger type in your organization. This setting will dictate whether a new message is added to the most recent existing conversation, or creates a new Conversation. If the existing Conversation is still in a connected state the threading timeline setting will never play a role. After the conversation is disconnected, if an inbound message is received or an outbound message is sent after the setting for threading timeline expires, a new conversation is created.

Wraps GET /api/v2/conversations/messaging/threadingtimeline

Requires ALL permissions:

- conversation:threadingTimeline:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
try {
    ConversationThreadingWindow result = apiInstance.getConversationsMessagingThreadingtimeline();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#getConversationsMessagingThreadingtimeline");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ConversationThreadingWindow**](ConversationThreadingWindow.md)

<a name="patchConversationParticipant"></a>

# **patchConversationParticipant**

> Void patchConversationParticipant(conversationId, participantId, body)

Update a participant.

Update conversation participant.

Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description     | Notes |
| ------------------ | --------------------------------------------------------- | --------------- | ----- |
| **conversationId** | **String**                                                | conversation ID |
| **participantId**  | **String**                                                | participant ID  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Update request  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationParticipantAttributes"></a>

# **patchConversationParticipantAttributes**

> Void patchConversationParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description            | Notes |
| ------------------ | ----------------------------------------------------- | ---------------------- | ----- |
| **conversationId** | **String**                                            | conversation ID        |
| **participantId**  | **String**                                            | participant ID         |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) | Participant attributes |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCall"></a>

# **patchConversationsCall**

> [Conversation](Conversation.md) patchConversationsCall(conversationId, body)

Update a conversation by setting it&#39;s recording state, merging in other conversations to create a conference, or disconnecting all of the participants

Wraps PATCH /api/v2/conversations/calls/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCall(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCall");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsCallParticipant"></a>

# **patchConversationsCallParticipant**

> Void patchConversationsCallParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant request
try {
    apiInstance.patchConversationsCallParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description         | Notes |
| ------------------ | --------------------------------------------------------- | ------------------- | ----- |
| **conversationId** | **String**                                                | conversationId      |
| **participantId**  | **String**                                                | participantId       |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallParticipantAttributes"></a>

# **patchConversationsCallParticipantAttributes**

> Void patchConversationsCallParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsCallParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description            | Notes |
| ------------------ | ----------------------------------------------------- | ---------------------- | ----- |
| **conversationId** | **String**                                            | conversationId         |
| **participantId**  | **String**                                            | participantId          |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) | Participant attributes |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallParticipantCommunication"></a>

# **patchConversationsCallParticipantCommunication**

> [Empty](Empty.md) patchConversationsCallParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsCallParticipantConsult"></a>

# **patchConversationsCallParticipantConsult**

> [ConsultTransferResponse](ConsultTransferResponse.md) patchConversationsCallParticipantConsult(conversationId, participantId, body)

Change who can speak

Wraps PATCH /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransferUpdate body = new ConsultTransferUpdate(); // ConsultTransferUpdate | new speak to
try {
    ConsultTransferResponse result = apiInstance.patchConversationsCallParticipantConsult(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description    | Notes |
| ------------------ | ----------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                            | conversationId |
| **participantId**  | **String**                                            | participantId  |
| **body**           | [**ConsultTransferUpdate**](ConsultTransferUpdate.md) | new speak to   |

{: class="table-striped"}

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.md)

<a name="patchConversationsCallback"></a>

# **patchConversationsCallback**

> [Conversation](Conversation.md) patchConversationsCallback(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCallback(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallback");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsCallbackParticipant"></a>

# **patchConversationsCallbackParticipant**

> Void patchConversationsCallbackParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    apiInstance.patchConversationsCallbackParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description    | Notes |
| ------------------ | --------------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                                | conversationId |
| **participantId**  | **String**                                                | participantId  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallbackParticipantAttributes"></a>

# **patchConversationsCallbackParticipantAttributes**

> Void patchConversationsCallbackParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Attributes
try {
    apiInstance.patchConversationsCallbackParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description    | Notes |
| ------------------ | ----------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                            | conversationId |
| **participantId**  | **String**                                            | participantId  |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) | Attributes     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCallbackParticipantCommunication"></a>

# **patchConversationsCallbackParticipantCommunication**

> [Empty](Empty.md) patchConversationsCallbackParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCallbackParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbackParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsCallbacks"></a>

# **patchConversationsCallbacks**

> [PatchCallbackResponse](PatchCallbackResponse.md) patchConversationsCallbacks(body)

Update a scheduled callback

Wraps PATCH /api/v2/conversations/callbacks

Requires ANY permissions:

- conversation:callback:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
PatchCallbackRequest body = new PatchCallbackRequest(); // PatchCallbackRequest | PatchCallbackRequest
try {
    PatchCallbackResponse result = apiInstance.patchConversationsCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description          | Notes |
| -------- | --------------------------------------------------- | -------------------- | ----- |
| **body** | [**PatchCallbackRequest**](PatchCallbackRequest.md) | PatchCallbackRequest |

{: class="table-striped"}

### Return type

[**PatchCallbackResponse**](PatchCallbackResponse.md)

<a name="patchConversationsChat"></a>

# **patchConversationsChat**

> [Conversation](Conversation.md) patchConversationsChat(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/chats/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsChat(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChat");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsChatParticipant"></a>

# **patchConversationsChatParticipant**

> Void patchConversationsChatParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsChatParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description    | Notes |
| ------------------ | --------------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                                | conversationId |
| **participantId**  | **String**                                                | participantId  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Update request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsChatParticipantAttributes"></a>

# **patchConversationsChatParticipantAttributes**

> Void patchConversationsChatParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsChatParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description            | Notes |
| ------------------ | ----------------------------------------------------- | ---------------------- | ----- |
| **conversationId** | **String**                                            | conversationId         |
| **participantId**  | **String**                                            | participantId          |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) | Participant attributes |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsChatParticipantCommunication"></a>

# **patchConversationsChatParticipantCommunication**

> [Empty](Empty.md) patchConversationsChatParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/chats/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsChatParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsChatParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsCobrowsesession"></a>

# **patchConversationsCobrowsesession**

> [Conversation](Conversation.md) patchConversationsCobrowsesession(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsCobrowsesession(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesession");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsCobrowsesessionParticipant"></a>

# **patchConversationsCobrowsesessionParticipant**

> Void patchConversationsCobrowsesessionParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest |
try {
    apiInstance.patchConversationsCobrowsesessionParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description    | Notes      |
| ------------------ | --------------------------------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                                                | conversationId |
| **participantId**  | **String**                                                | participantId  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) |                | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCobrowsesessionParticipantAttributes"></a>

# **patchConversationsCobrowsesessionParticipantAttributes**

> Void patchConversationsCobrowsesessionParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes |
try {
    apiInstance.patchConversationsCobrowsesessionParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description    | Notes      |
| ------------------ | ----------------------------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                                            | conversationId |
| **participantId**  | **String**                                            | participantId  |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) |                | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsCobrowsesessionParticipantCommunication"></a>

# **patchConversationsCobrowsesessionParticipantCommunication**

> [Empty](Empty.md) patchConversationsCobrowsesessionParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsCobrowsesessionParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsCobrowsesessionParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsEmail"></a>

# **patchConversationsEmail**

> [Conversation](Conversation.md) patchConversationsEmail(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/emails/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsEmail(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmail");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsEmailParticipant"></a>

# **patchConversationsEmailParticipant**

> Void patchConversationsEmailParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Update request
try {
    apiInstance.patchConversationsEmailParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description    | Notes |
| ------------------ | --------------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                                | conversationId |
| **participantId**  | **String**                                                | participantId  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Update request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsEmailParticipantAttributes"></a>

# **patchConversationsEmailParticipantAttributes**

> Void patchConversationsEmailParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes | Participant attributes
try {
    apiInstance.patchConversationsEmailParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description            | Notes |
| ------------------ | ----------------------------------------------------- | ---------------------- | ----- |
| **conversationId** | **String**                                            | conversationId         |
| **participantId**  | **String**                                            | participantId          |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) | Participant attributes |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsEmailParticipantCommunication"></a>

# **patchConversationsEmailParticipantCommunication**

> [Empty](Empty.md) patchConversationsEmailParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/emails/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsEmailParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsEmailParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsMessage"></a>

# **patchConversationsMessage**

> [Conversation](Conversation.md) patchConversationsMessage(conversationId, body)

Update a conversation by disconnecting all of the participants

Wraps PATCH /api/v2/conversations/messages/{conversationId}

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.patchConversationsMessage(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessage");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="patchConversationsMessageParticipant"></a>

# **patchConversationsMessageParticipant**

> Void patchConversationsMessageParticipant(conversationId, participantId, body)

Update conversation participant

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String |  conversationId
String participantId = "participantId_example"; // String | participantId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest |
try {
    apiInstance.patchConversationsMessageParticipant(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipant");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                      | Description    | Notes      |
| ------------------ | --------------------------------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                                                | conversationId |
| **participantId**  | **String**                                                | participantId  |
| **body**           | [**MediaParticipantRequest**](MediaParticipantRequest.md) |                | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsMessageParticipantAttributes"></a>

# **patchConversationsMessageParticipantAttributes**

> Void patchConversationsMessageParticipantAttributes(conversationId, participantId, body)

Update the attributes on a conversation participant.

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}/attributes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String |  conversationId
String participantId = "participantId_example"; // String | participantId
ParticipantAttributes body = new ParticipantAttributes(); // ParticipantAttributes |
try {
    apiInstance.patchConversationsMessageParticipantAttributes(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipantAttributes");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description    | Notes      |
| ------------------ | ----------------------------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                                            | conversationId |
| **participantId**  | **String**                                            | participantId  |
| **body**           | [**ParticipantAttributes**](ParticipantAttributes.md) |                | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="patchConversationsMessageParticipantCommunication"></a>

# **patchConversationsMessageParticipantCommunication**

> [Empty](Empty.md) patchConversationsMessageParticipantCommunication(conversationId, participantId, communicationId, body)

Update conversation participant&#39;s communication by disconnecting it.

Wraps PATCH /api/v2/conversations/messages/{conversationId}/participants/{participantId}/communications/{communicationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String |  conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
MediaParticipantRequest body = new MediaParticipantRequest(); // MediaParticipantRequest | Participant
try {
    Empty result = apiInstance.patchConversationsMessageParticipantCommunication(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessageParticipantCommunication");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                      | Description     | Notes |
| ------------------- | --------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                | conversationId  |
| **participantId**   | **String**                                                | participantId   |
| **communicationId** | **String**                                                | communicationId |
| **body**            | [**MediaParticipantRequest**](MediaParticipantRequest.md) | Participant     |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="patchConversationsMessagingIntegrationsFacebookIntegrationId"></a>

# **patchConversationsMessagingIntegrationsFacebookIntegrationId**

> [FacebookIntegration](FacebookIntegration.md) patchConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, body)

Update Facebook messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/facebook/{integrationId}

Requires ALL permissions:

- messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
FacebookIntegrationUpdateRequest body = new FacebookIntegrationUpdateRequest(); // FacebookIntegrationUpdateRequest | FacebookIntegrationUpdateRequest
try {
    FacebookIntegration result = apiInstance.patchConversationsMessagingIntegrationsFacebookIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsFacebookIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                                        | Description                      | Notes |
| ----------------- | --------------------------------------------------------------------------- | -------------------------------- | ----- |
| **integrationId** | **String**                                                                  | Integration ID                   |
| **body**          | [**FacebookIntegrationUpdateRequest**](FacebookIntegrationUpdateRequest.md) | FacebookIntegrationUpdateRequest |

{: class="table-striped"}

### Return type

[**FacebookIntegration**](FacebookIntegration.md)

<a name="patchConversationsMessagingIntegrationsOpenIntegrationId"></a>

# **patchConversationsMessagingIntegrationsOpenIntegrationId**

> [OpenIntegration](OpenIntegration.md) patchConversationsMessagingIntegrationsOpenIntegrationId(integrationId, body)

Update an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps PATCH /api/v2/conversations/messaging/integrations/open/{integrationId}

Requires ALL permissions:

- messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
OpenIntegrationUpdateRequest body = new OpenIntegrationUpdateRequest(); // OpenIntegrationUpdateRequest | OpenIntegrationUpdateRequest
try {
    OpenIntegration result = apiInstance.patchConversationsMessagingIntegrationsOpenIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsOpenIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                                | Description                  | Notes |
| ----------------- | ------------------------------------------------------------------- | ---------------------------- | ----- |
| **integrationId** | **String**                                                          | Integration ID               |
| **body**          | [**OpenIntegrationUpdateRequest**](OpenIntegrationUpdateRequest.md) | OpenIntegrationUpdateRequest |

{: class="table-striped"}

### Return type

[**OpenIntegration**](OpenIntegration.md)

<a name="patchConversationsMessagingIntegrationsTwitterIntegrationId"></a>

# **patchConversationsMessagingIntegrationsTwitterIntegrationId**

> [TwitterIntegration](TwitterIntegration.md) patchConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, body)

Update Twitter messaging integration

Wraps PATCH /api/v2/conversations/messaging/integrations/twitter/{integrationId}

Requires ALL permissions:

- messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.patchConversationsMessagingIntegrationsTwitterIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsTwitterIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                          | Description               | Notes |
| ----------------- | ------------------------------------------------------------- | ------------------------- | ----- |
| **integrationId** | **String**                                                    | Integration ID            |
| **body**          | [**TwitterIntegrationRequest**](TwitterIntegrationRequest.md) | TwitterIntegrationRequest |

{: class="table-striped"}

### Return type

[**TwitterIntegration**](TwitterIntegration.md)

<a name="patchConversationsMessagingIntegrationsWhatsappIntegrationId"></a>

# **patchConversationsMessagingIntegrationsWhatsappIntegrationId**

> [WhatsAppIntegration](WhatsAppIntegration.md) patchConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, body)

Update or activate a WhatsApp messaging integration.

The following steps are required in order to fully activate a Whatsapp Integration: Initially, you will need to get an activation code by sending: an action set to Activate, and an authenticationMethod choosing from Sms or Voice. Finally, once you have been informed of an activation code on selected authenticationMethod, you will need to confirm the code by sending: an action set to Confirm, and the confirmationCode you have received from Whatsapp.

Wraps PATCH /api/v2/conversations/messaging/integrations/whatsapp/{integrationId}

Requires ALL permissions:

- messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
WhatsAppIntegrationUpdateRequest body = new WhatsAppIntegrationUpdateRequest(); // WhatsAppIntegrationUpdateRequest | WhatsAppIntegrationUpdateRequest
try {
    WhatsAppIntegration result = apiInstance.patchConversationsMessagingIntegrationsWhatsappIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingIntegrationsWhatsappIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                                        | Description                      | Notes |
| ----------------- | --------------------------------------------------------------------------- | -------------------------------- | ----- |
| **integrationId** | **String**                                                                  | Integration ID                   |
| **body**          | [**WhatsAppIntegrationUpdateRequest**](WhatsAppIntegrationUpdateRequest.md) | WhatsAppIntegrationUpdateRequest |

{: class="table-striped"}

### Return type

[**WhatsAppIntegration**](WhatsAppIntegration.md)

<a name="patchConversationsMessagingSupportedcontentSupportedContentId"></a>

# **patchConversationsMessagingSupportedcontentSupportedContentId**

> [SupportedContent](SupportedContent.md) patchConversationsMessagingSupportedcontentSupportedContentId(supportedContentId, body)

Update a supported content profile

Wraps PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId}

Requires ALL permissions:

- messaging:supportedContent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String supportedContentId = "supportedContentId_example"; // String | Supported Content ID
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.patchConversationsMessagingSupportedcontentSupportedContentId(supportedContentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#patchConversationsMessagingSupportedcontentSupportedContentId");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type                                        | Description          | Notes |
| ---------------------- | ------------------------------------------- | -------------------- | ----- |
| **supportedContentId** | **String**                                  | Supported Content ID |
| **body**               | [**SupportedContent**](SupportedContent.md) | SupportedContent     |

{: class="table-striped"}

### Return type

[**SupportedContent**](SupportedContent.md)

<a name="postAnalyticsConversationDetailsProperties"></a>

# **postAnalyticsConversationDetailsProperties**

> [PropertyIndexRequest](PropertyIndexRequest.md) postAnalyticsConversationDetailsProperties(conversationId, body)

Index conversation properties

Wraps POST /api/v2/analytics/conversations/{conversationId}/details/properties

Requires ANY permissions:

- analytics:conversationProperties:index

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
PropertyIndexRequest body = new PropertyIndexRequest(); // PropertyIndexRequest | request
try {
    PropertyIndexRequest result = apiInstance.postAnalyticsConversationDetailsProperties(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationDetailsProperties");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                | Description    | Notes |
| ------------------ | --------------------------------------------------- | -------------- | ----- |
| **conversationId** | **String**                                          | conversationId |
| **body**           | [**PropertyIndexRequest**](PropertyIndexRequest.md) | request        |

{: class="table-striped"}

### Return type

[**PropertyIndexRequest**](PropertyIndexRequest.md)

<a name="postAnalyticsConversationsAggregatesQuery"></a>

# **postAnalyticsConversationsAggregatesQuery**

> [ConversationAggregateQueryResponse](ConversationAggregateQueryResponse.md) postAnalyticsConversationsAggregatesQuery(body)

Query for conversation aggregates

Wraps POST /api/v2/analytics/conversations/aggregates/query

Requires ANY permissions:

- analytics:conversationAggregate:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationAggregationQuery body = new ConversationAggregationQuery(); // ConversationAggregationQuery | query
try {
    ConversationAggregateQueryResponse result = apiInstance.postAnalyticsConversationsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                | Description | Notes |
| -------- | ------------------------------------------------------------------- | ----------- | ----- |
| **body** | [**ConversationAggregationQuery**](ConversationAggregationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**ConversationAggregateQueryResponse**](ConversationAggregateQueryResponse.md)

<a name="postAnalyticsConversationsDetailsJobs"></a>

# **postAnalyticsConversationsDetailsJobs**

> [AsyncQueryResponse](AsyncQueryResponse.md) postAnalyticsConversationsDetailsJobs(body)

Query for conversation details asynchronously

Wraps POST /api/v2/analytics/conversations/details/jobs

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
AsyncConversationQuery body = new AsyncConversationQuery(); // AsyncConversationQuery | query
try {
    AsyncQueryResponse result = apiInstance.postAnalyticsConversationsDetailsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsDetailsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description | Notes |
| -------- | ------------------------------------------------------- | ----------- | ----- |
| **body** | [**AsyncConversationQuery**](AsyncConversationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AsyncQueryResponse**](AsyncQueryResponse.md)

<a name="postAnalyticsConversationsDetailsQuery"></a>

# **postAnalyticsConversationsDetailsQuery**

> [AnalyticsConversationQueryResponse](AnalyticsConversationQueryResponse.md) postAnalyticsConversationsDetailsQuery(body)

Query for conversation details

Wraps POST /api/v2/analytics/conversations/details/query

Requires ANY permissions:

- analytics:conversationDetail:view
- analytics:agentConversationDetail:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationQuery body = new ConversationQuery(); // ConversationQuery | query
try {
    AnalyticsConversationQueryResponse result = apiInstance.postAnalyticsConversationsDetailsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postAnalyticsConversationsDetailsQuery");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description | Notes |
| -------- | --------------------------------------------- | ----------- | ----- |
| **body** | [**ConversationQuery**](ConversationQuery.md) | query       |

{: class="table-striped"}

### Return type

[**AnalyticsConversationQueryResponse**](AnalyticsConversationQueryResponse.md)

<a name="postConversationAssign"></a>

# **postConversationAssign**

> String postConversationAssign(conversationId, body)

Attempts to manually assign a specified conversation to a specified user. Ignores bullseye ring, PAR score, skills, and languages.

Wraps POST /api/v2/conversations/{conversationId}/assign

Requires ANY permissions:

- conversation:call:pull
- conversation:call:assign
- conversation:callback:pull
- conversation:callback:assign
- conversation:webchat:pull
- conversation:webchat:assign
- conversation:email:pull
- conversation:email:assign
- conversation:message:pull
- conversation:message:assign

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationUser body = new ConversationUser(); // ConversationUser | Targeted user
try {
    String result = apiInstance.postConversationAssign(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationAssign");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                        | Description     | Notes |
| ------------------ | ------------------------------------------- | --------------- | ----- |
| **conversationId** | **String**                                  | conversation ID |
| **body**           | [**ConversationUser**](ConversationUser.md) | Targeted user   |

{: class="table-striped"}

### Return type

**String**

<a name="postConversationDisconnect"></a>

# **postConversationDisconnect**

> String postConversationDisconnect(conversationId)

Performs a full conversation teardown. Issues disconnect requests for any connected media. Applies a system wrap-up code to any participants that are pending wrap-up. This is not intended to be the normal way of ending interactions but is available in the event of problems with the application to allow a resynchronization of state across all components. It is recommended that users submit a support case if they are relying on this endpoint systematically as there is likely something that needs investigation.

Wraps POST /api/v2/conversations/{conversationId}/disconnect

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
try {
    String result = apiInstance.postConversationDisconnect(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationDisconnect");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |

{: class="table-striped"}

### Return type

**String**

<a name="postConversationParticipantCallbacks"></a>

# **postConversationParticipantCallbacks**

> Void postConversationParticipantCallbacks(conversationId, participantId, body)

Create a new callback for the specified participant on the conversation.

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/callbacks

Requires ALL permissions:

- conversation:callback:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateCallbackOnConversationCommand body = new CreateCallbackOnConversationCommand(); // CreateCallbackOnConversationCommand |
try {
    apiInstance.postConversationParticipantCallbacks(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantCallbacks");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                                              | Description     | Notes      |
| ------------------ | --------------------------------------------------------------------------------- | --------------- | ---------- |
| **conversationId** | **String**                                                                        | conversation ID |
| **participantId**  | **String**                                                                        | participant ID  |
| **body**           | [**CreateCallbackOnConversationCommand**](CreateCallbackOnConversationCommand.md) |                 | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationParticipantDigits"></a>

# **postConversationParticipantDigits**

> Void postConversationParticipantDigits(conversationId, participantId, body)

Sends DTMF to the participant

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/digits

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
Digits body = new Digits(); // Digits | Digits
try {
    apiInstance.postConversationParticipantDigits(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantDigits");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                    | Description     | Notes      |
| ------------------ | ----------------------- | --------------- | ---------- |
| **conversationId** | **String**              | conversation ID |
| **participantId**  | **String**              | participant ID  |
| **body**           | [**Digits**](Digits.md) | Digits          | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationParticipantReplace"></a>

# **postConversationParticipantReplace**

> Void postConversationParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversation ID  |
| **participantId**  | **String**                                | participant ID   |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationParticipantSecureivrsessions"></a>

# **postConversationParticipantSecureivrsessions**

> [SecureSession](SecureSession.md) postConversationParticipantSecureivrsessions(conversationId, participantId, body)

Create secure IVR session. Only a participant in the conversation can invoke a secure IVR.

Wraps POST /api/v2/conversations/{conversationId}/participants/{participantId}/secureivrsessions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
CreateSecureSession body = new CreateSecureSession(); // CreateSecureSession |
try {
    SecureSession result = apiInstance.postConversationParticipantSecureivrsessions(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationParticipantSecureivrsessions");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                              | Description     | Notes      |
| ------------------ | ------------------------------------------------- | --------------- | ---------- |
| **conversationId** | **String**                                        | conversation ID |
| **participantId**  | **String**                                        | participant ID  |
| **body**           | [**CreateSecureSession**](CreateSecureSession.md) |                 | [optional] |

{: class="table-striped"}

### Return type

[**SecureSession**](SecureSession.md)

<a name="postConversationsCall"></a>

# **postConversationsCall**

> [Conversation](Conversation.md) postConversationsCall(conversationId, body)

Place a new call as part of a callback conversation.

Wraps POST /api/v2/conversations/calls/{conversationId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
CallCommand body = new CallCommand(); // CallCommand | Conversation
try {
    Conversation result = apiInstance.postConversationsCall(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCall");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                              | Description    | Notes |
| ------------------ | --------------------------------- | -------------- | ----- |
| **conversationId** | **String**                        | conversationId |
| **body**           | [**CallCommand**](CallCommand.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="postConversationsCallParticipantCoach"></a>

# **postConversationsCallParticipantCoach**

> Void postConversationsCallParticipantCoach(conversationId, participantId)

Listen in on the conversation from the point of view of a given participant while speaking to just the given participant.

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/coach

Requires ANY permissions:

- conversation:call:coach

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantCoach(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantCoach");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallParticipantConsult"></a>

# **postConversationsCallParticipantConsult**

> [ConsultTransferResponse](ConsultTransferResponse.md) postConversationsCallParticipantConsult(conversationId, participantId, body)

Initiate and update consult transfer

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/consult

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
ConsultTransfer body = new ConsultTransfer(); // ConsultTransfer | Destination address & initial speak to
try {
    ConsultTransferResponse result = apiInstance.postConversationsCallParticipantConsult(conversationId, participantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantConsult");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description                                | Notes |
| ------------------ | ----------------------------------------- | ------------------------------------------ | ----- |
| **conversationId** | **String**                                | conversationId                             |
| **participantId**  | **String**                                | participantId                              |
| **body**           | [**ConsultTransfer**](ConsultTransfer.md) | Destination address &amp; initial speak to |

{: class="table-striped"}

### Return type

[**ConsultTransferResponse**](ConsultTransferResponse.md)

<a name="postConversationsCallParticipantMonitor"></a>

# **postConversationsCallParticipantMonitor**

> Void postConversationsCallParticipantMonitor(conversationId, participantId)

Listen in on the conversation from the point of view of a given participant.

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/monitor

Requires ANY permissions:

- conversation:call:monitor

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
try {
    apiInstance.postConversationsCallParticipantMonitor(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantMonitor");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes |
| ------------------ | ---------- | -------------- | ----- |
| **conversationId** | **String** | conversationId |
| **participantId**  | **String** | participantId  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallParticipantReplace"></a>

# **postConversationsCallParticipantReplace**

> Void postConversationsCallParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/calls/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversationId   |
| **participantId**  | **String**                                | participantId    |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallParticipants"></a>

# **postConversationsCallParticipants**

> [Conversation](Conversation.md) postConversationsCallParticipants(conversationId, body)

Add participants to a conversation

Wraps POST /api/v2/conversations/calls/{conversationId}/participants

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
Conversation body = new Conversation(); // Conversation | Conversation
try {
    Conversation result = apiInstance.postConversationsCallParticipants(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallParticipants");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**Conversation**](Conversation.md) | Conversation   |

{: class="table-striped"}

### Return type

[**Conversation**](Conversation.md)

<a name="postConversationsCallbackParticipantReplace"></a>

# **postConversationsCallbackParticipantReplace**

> Void postConversationsCallbackParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/callbacks/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsCallbackParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbackParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversationId   |
| **participantId**  | **String**                                | participantId    |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallbacks"></a>

# **postConversationsCallbacks**

> [CreateCallbackResponse](CreateCallbackResponse.md) postConversationsCallbacks(body)

Create a Callback

Wraps POST /api/v2/conversations/callbacks

Requires ALL permissions:

- conversation:callback:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateCallbackCommand body = new CreateCallbackCommand(); // CreateCallbackCommand | Callback
try {
    CreateCallbackResponse result = apiInstance.postConversationsCallbacks(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacks");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description | Notes |
| -------- | ----------------------------------------------------- | ----------- | ----- |
| **body** | [**CreateCallbackCommand**](CreateCallbackCommand.md) | Callback    |

{: class="table-striped"}

### Return type

[**CreateCallbackResponse**](CreateCallbackResponse.md)

<a name="postConversationsCallbacksBulkDisconnect"></a>

# **postConversationsCallbacksBulkDisconnect**

> Void postConversationsCallbacksBulkDisconnect(body)

Disconnect multiple scheduled callbacks

Wraps POST /api/v2/conversations/callbacks/bulk/disconnect

Requires ANY permissions:

- conversation:communication:disconnect

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
BulkCallbackDisconnectRequest body = new BulkCallbackDisconnectRequest(); // BulkCallbackDisconnectRequest | BulkCallbackDisconnectRequest
try {
    apiInstance.postConversationsCallbacksBulkDisconnect(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacksBulkDisconnect");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                  | Description                   | Notes |
| -------- | --------------------------------------------------------------------- | ----------------------------- | ----- |
| **body** | [**BulkCallbackDisconnectRequest**](BulkCallbackDisconnectRequest.md) | BulkCallbackDisconnectRequest |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsCallbacksBulkUpdate"></a>

# **postConversationsCallbacksBulkUpdate**

> [BulkCallbackPatchResponse](BulkCallbackPatchResponse.md) postConversationsCallbacksBulkUpdate(body)

Update multiple scheduled callbacks

Wraps POST /api/v2/conversations/callbacks/bulk/update

Requires ANY permissions:

- conversation:callback:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
BulkCallbackPatchRequest body = new BulkCallbackPatchRequest(); // BulkCallbackPatchRequest | BulkCallbackPatchRequest
try {
    BulkCallbackPatchResponse result = apiInstance.postConversationsCallbacksBulkUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCallbacksBulkUpdate");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                        | Description              | Notes |
| -------- | ----------------------------------------------------------- | ------------------------ | ----- |
| **body** | [**BulkCallbackPatchRequest**](BulkCallbackPatchRequest.md) | BulkCallbackPatchRequest |

{: class="table-striped"}

### Return type

[**BulkCallbackPatchResponse**](BulkCallbackPatchResponse.md)

<a name="postConversationsCalls"></a>

# **postConversationsCalls**

> [CreateCallResponse](CreateCallResponse.md) postConversationsCalls(body)

Create a call conversation

Wraps POST /api/v2/conversations/calls

Requires ANY permissions:

- conversation:conference:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateCallRequest body = new CreateCallRequest(); // CreateCallRequest | Call request
try {
    CreateCallResponse result = apiInstance.postConversationsCalls(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCalls");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                          | Description  | Notes |
| -------- | --------------------------------------------- | ------------ | ----- |
| **body** | [**CreateCallRequest**](CreateCallRequest.md) | Call request |

{: class="table-striped"}

### Return type

[**CreateCallResponse**](CreateCallResponse.md)

<a name="postConversationsChatCommunicationMessages"></a>

# **postConversationsChatCommunicationMessages**

> [WebChatMessage](WebChatMessage.md) postConversationsChatCommunicationMessages(conversationId, communicationId, body)

Send a message on behalf of a communication in a chat conversation.

Wraps POST /api/v2/conversations/chats/{conversationId}/communications/{communicationId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
CreateWebChatMessageRequest body = new CreateWebChatMessageRequest(); // CreateWebChatMessageRequest | Message
try {
    WebChatMessage result = apiInstance.postConversationsChatCommunicationMessages(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatCommunicationMessages");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                                              | Description     | Notes |
| ------------------- | ----------------------------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                                        | conversationId  |
| **communicationId** | **String**                                                        | communicationId |
| **body**            | [**CreateWebChatMessageRequest**](CreateWebChatMessageRequest.md) | Message         |

{: class="table-striped"}

### Return type

[**WebChatMessage**](WebChatMessage.md)

<a name="postConversationsChatCommunicationTyping"></a>

# **postConversationsChatCommunicationTyping**

> [WebChatTyping](WebChatTyping.md) postConversationsChatCommunicationTyping(conversationId, communicationId)

Send a typing-indicator on behalf of a communication in a chat conversation.

Wraps POST /api/v2/conversations/chats/{conversationId}/communications/{communicationId}/typing

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
try {
    WebChatTyping result = apiInstance.postConversationsChatCommunicationTyping(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatCommunicationTyping");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description     | Notes |
| ------------------- | ---------- | --------------- | ----- |
| **conversationId**  | **String** | conversationId  |
| **communicationId** | **String** | communicationId |

{: class="table-striped"}

### Return type

[**WebChatTyping**](WebChatTyping.md)

<a name="postConversationsChatParticipantReplace"></a>

# **postConversationsChatParticipantReplace**

> Void postConversationsChatParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/chats/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsChatParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChatParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversationId   |
| **participantId**  | **String**                                | participantId    |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsChats"></a>

# **postConversationsChats**

> [ChatConversation](ChatConversation.md) postConversationsChats(body)

Create a web chat conversation

Wraps POST /api/v2/conversations/chats

Requires ALL permissions:

- conversation:webchat:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateWebChatRequest body = new CreateWebChatRequest(); // CreateWebChatRequest | Create web chat request
try {
    ChatConversation result = apiInstance.postConversationsChats(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsChats");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                | Description             | Notes |
| -------- | --------------------------------------------------- | ----------------------- | ----- |
| **body** | [**CreateWebChatRequest**](CreateWebChatRequest.md) | Create web chat request |

{: class="table-striped"}

### Return type

[**ChatConversation**](ChatConversation.md)

<a name="postConversationsCobrowsesessionParticipantReplace"></a>

# **postConversationsCobrowsesessionParticipantReplace**

> Void postConversationsCobrowsesessionParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/cobrowsesessions/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest |
try {
    apiInstance.postConversationsCobrowsesessionParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsCobrowsesessionParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description    | Notes      |
| ------------------ | ----------------------------------------- | -------------- | ---------- |
| **conversationId** | **String**                                | conversationId |
| **participantId**  | **String**                                | participantId  |
| **body**           | [**TransferRequest**](TransferRequest.md) |                | [optional] |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsEmailInboundmessages"></a>

# **postConversationsEmailInboundmessages**

> [EmailConversation](EmailConversation.md) postConversationsEmailInboundmessages(conversationId, body)

Send an email to an external conversation. An external conversation is one where the provider is not PureCloud based. This endpoint allows the sender of the external email to reply or send a new message to the existing conversation. The new message will be treated as part of the existing conversation and chained to it.

Wraps POST /api/v2/conversations/emails/{conversationId}/inboundmessages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
InboundMessageRequest body = new InboundMessageRequest(); // InboundMessageRequest | Send external email reply
try {
    EmailConversation result = apiInstance.postConversationsEmailInboundmessages(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailInboundmessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                  | Description               | Notes |
| ------------------ | ----------------------------------------------------- | ------------------------- | ----- |
| **conversationId** | **String**                                            | conversationId            |
| **body**           | [**InboundMessageRequest**](InboundMessageRequest.md) | Send external email reply |

{: class="table-striped"}

### Return type

[**EmailConversation**](EmailConversation.md)

<a name="postConversationsEmailMessages"></a>

# **postConversationsEmailMessages**

> [EmailMessage](EmailMessage.md) postConversationsEmailMessages(conversationId, body)

Send an email reply

Wraps POST /api/v2/conversations/emails/{conversationId}/messages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
EmailMessage body = new EmailMessage(); // EmailMessage | Reply
try {
    EmailMessage result = apiInstance.postConversationsEmailMessages(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailMessages");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**EmailMessage**](EmailMessage.md) | Reply          |

{: class="table-striped"}

### Return type

[**EmailMessage**](EmailMessage.md)

<a name="postConversationsEmailMessagesDraftAttachmentsCopy"></a>

# **postConversationsEmailMessagesDraftAttachmentsCopy**

> [EmailMessage](EmailMessage.md) postConversationsEmailMessagesDraftAttachmentsCopy(conversationId, body)

Copy attachments from an email message to the current draft.

Wraps POST /api/v2/conversations/emails/{conversationId}/messages/draft/attachments/copy

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
CopyAttachmentsRequest body = new CopyAttachmentsRequest(); // CopyAttachmentsRequest | Copy Attachment Request
try {
    EmailMessage result = apiInstance.postConversationsEmailMessagesDraftAttachmentsCopy(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailMessagesDraftAttachmentsCopy");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                    | Description             | Notes |
| ------------------ | ------------------------------------------------------- | ----------------------- | ----- |
| **conversationId** | **String**                                              | conversationId          |
| **body**           | [**CopyAttachmentsRequest**](CopyAttachmentsRequest.md) | Copy Attachment Request |

{: class="table-striped"}

### Return type

[**EmailMessage**](EmailMessage.md)

<a name="postConversationsEmailParticipantReplace"></a>

# **postConversationsEmailParticipantReplace**

> Void postConversationsEmailParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/emails/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsEmailParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmailParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversationId   |
| **participantId**  | **String**                                | participantId    |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsEmails"></a>

# **postConversationsEmails**

> [EmailConversation](EmailConversation.md) postConversationsEmails(body)

Create an email conversation

If the direction of the request is INBOUND, this will create an external conversation with a third party provider. If the direction of the the request is OUTBOUND, this will create a conversation to send outbound emails on behalf of a queue.

Wraps POST /api/v2/conversations/emails

Requires ANY permissions:

- conversation:email:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateEmailRequest body = new CreateEmailRequest(); // CreateEmailRequest | Create email request
try {
    EmailConversation result = apiInstance.postConversationsEmails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsEmails");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                            | Description          | Notes |
| -------- | ----------------------------------------------- | -------------------- | ----- |
| **body** | [**CreateEmailRequest**](CreateEmailRequest.md) | Create email request |

{: class="table-striped"}

### Return type

[**EmailConversation**](EmailConversation.md)

<a name="postConversationsFaxes"></a>

# **postConversationsFaxes**

> [FaxSendResponse](FaxSendResponse.md) postConversationsFaxes(body)

Create Fax Conversation

Wraps POST /api/v2/conversations/faxes

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
FaxSendRequest body = new FaxSendRequest(); // FaxSendRequest | Fax
try {
    FaxSendResponse result = apiInstance.postConversationsFaxes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsFaxes");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                    | Description | Notes |
| -------- | --------------------------------------- | ----------- | ----- |
| **body** | [**FaxSendRequest**](FaxSendRequest.md) | Fax         |

{: class="table-striped"}

### Return type

[**FaxSendResponse**](FaxSendResponse.md)

<a name="postConversationsMessageCommunicationMessages"></a>

# **postConversationsMessageCommunicationMessages**

> [MessageData](MessageData.md) postConversationsMessageCommunicationMessages(conversationId, communicationId, body)

Send message

Send message on existing conversation/communication. Only one message body field can be accepted, per request. Example: 1 textBody, 1 mediaId, 1 stickerId, or 1 messageTemplate.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages

Requires ANY permissions:

- conversation:message:create
- conversation:webmessaging:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
AdditionalMessage body = new AdditionalMessage(); // AdditionalMessage | Message
try {
    MessageData result = apiInstance.postConversationsMessageCommunicationMessages(conversationId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationMessages");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                          | Description     | Notes |
| ------------------- | --------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                    | conversationId  |
| **communicationId** | **String**                                    | communicationId |
| **body**            | [**AdditionalMessage**](AdditionalMessage.md) | Message         |

{: class="table-striped"}

### Return type

[**MessageData**](MessageData.md)

<a name="postConversationsMessageCommunicationMessagesMedia"></a>

# **postConversationsMessageCommunicationMessagesMedia**

> [MessageMediaData](MessageMediaData.md) postConversationsMessageCommunicationMessagesMedia(conversationId, communicationId)

Create media

See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage.

Wraps POST /api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media

Requires ANY permissions:

- conversation:message:create
- conversation:webmessaging:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String communicationId = "communicationId_example"; // String | communicationId
try {
    MessageMediaData result = apiInstance.postConversationsMessageCommunicationMessagesMedia(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageCommunicationMessagesMedia");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description     | Notes |
| ------------------- | ---------- | --------------- | ----- |
| **conversationId**  | **String** | conversationId  |
| **communicationId** | **String** | communicationId |

{: class="table-striped"}

### Return type

[**MessageMediaData**](MessageMediaData.md)

<a name="postConversationsMessageMessagesBulk"></a>

# **postConversationsMessageMessagesBulk**

> [TextMessageListing](TextMessageListing.md) postConversationsMessageMessagesBulk(conversationId, body)

Get messages in batch

The path parameter [conversationId] should contain the conversationId of the conversation being filtered. The body should contain the messageId(s) of messages being requested. For example: [\&quot;a3069a33b-bbb1-4703-9d68-061d9e9db96e\&quot;, \&quot;55bc6be3-078c-4a49-a4e6-1e05776ed7e8\&quot;]

Wraps POST /api/v2/conversations/messages/{conversationId}/messages/bulk

Requires ANY permissions:

- conversation:message:view
- conversation:webmessaging:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String |
List<String> body = Arrays.asList(new List<String>()); // List<String> | messageIds
try {
    TextMessageListing result = apiInstance.postConversationsMessageMessagesBulk(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageMessagesBulk");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                   | Description | Notes      |
| ------------------ | ---------------------- | ----------- | ---------- |
| **conversationId** | **String**             |             |
| **body**           | **List&lt;String&gt;** | messageIds  | [optional] |

{: class="table-striped"}

### Return type

[**TextMessageListing**](TextMessageListing.md)

<a name="postConversationsMessageParticipantReplace"></a>

# **postConversationsMessageParticipantReplace**

> Void postConversationsMessageParticipantReplace(conversationId, participantId, body)

Replace this participant with the specified user and/or address

Wraps POST /api/v2/conversations/messages/{conversationId}/participants/{participantId}/replace

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
TransferRequest body = new TransferRequest(); // TransferRequest | Transfer request
try {
    apiInstance.postConversationsMessageParticipantReplace(conversationId, participantId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessageParticipantReplace");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                      | Description      | Notes |
| ------------------ | ----------------------------------------- | ---------------- | ----- |
| **conversationId** | **String**                                | conversationId   |
| **participantId**  | **String**                                | participantId    |
| **body**           | [**TransferRequest**](TransferRequest.md) | Transfer request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postConversationsMessages"></a>

# **postConversationsMessages**

> [MessageConversation](MessageConversation.md) postConversationsMessages(body)

Create an outbound messaging conversation.

If there is an existing conversation between the remote address and the address associated with the queue specified in createOutboundRequest then the result of this request depends on the state of that conversation and the useExistingConversation field of createOutboundRequest. If the existing conversation is in alerting or connected state, then the request will fail. If the existing conversation is disconnected but still within the conversation window then the request will fail unless useExistingConversation is set to true.

Wraps POST /api/v2/conversations/messages

Requires ALL permissions:

- conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
CreateOutboundMessagingConversationRequest body = new CreateOutboundMessagingConversationRequest(); // CreateOutboundMessagingConversationRequest | Create outbound messaging conversation
try {
    MessageConversation result = apiInstance.postConversationsMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessages");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                                            | Description                            | Notes |
| -------- | ----------------------------------------------------------------------------------------------- | -------------------------------------- | ----- |
| **body** | [**CreateOutboundMessagingConversationRequest**](CreateOutboundMessagingConversationRequest.md) | Create outbound messaging conversation |

{: class="table-striped"}

### Return type

[**MessageConversation**](MessageConversation.md)

<a name="postConversationsMessagesAgentless"></a>

# **postConversationsMessagesAgentless**

> [SendAgentlessOutboundMessageResponse](SendAgentlessOutboundMessageResponse.md) postConversationsMessagesAgentless(body)

Send an agentless outbound message

Send an agentless (api participant) outbound message using a client credential grant. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will generate a new Conversation, if there is an existing active Conversation between the fromAddress and toAddress already, then this POST will fail.

Wraps POST /api/v2/conversations/messages/agentless

Requires ALL permissions:

- conversation:message:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SendAgentlessOutboundMessageRequest body = new SendAgentlessOutboundMessageRequest(); // SendAgentlessOutboundMessageRequest | Create agentless outbound messaging request
try {
    SendAgentlessOutboundMessageResponse result = apiInstance.postConversationsMessagesAgentless(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagesAgentless");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                                              | Description                                 | Notes |
| -------- | --------------------------------------------------------------------------------- | ------------------------------------------- | ----- |
| **body** | [**SendAgentlessOutboundMessageRequest**](SendAgentlessOutboundMessageRequest.md) | Create agentless outbound messaging request |

{: class="table-striped"}

### Return type

[**SendAgentlessOutboundMessageResponse**](SendAgentlessOutboundMessageResponse.md)

<a name="postConversationsMessagesInboundOpen"></a>

# **postConversationsMessagesInboundOpen**

> [OpenNormalizedMessage](OpenNormalizedMessage.md) postConversationsMessagesInboundOpen(body)

Send an inbound Open Message

Send an inbound message to an Open Messaging integration. In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least messaging scope. This will either generate a new Conversation, or be a part of an existing conversation. See https://developer.genesys.cloud/api/digital/openmessaging/ for example usage.

Wraps POST /api/v2/conversations/messages/inbound/open

Requires ALL permissions:

- conversation:message:receive

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
OpenNormalizedMessage body = new OpenNormalizedMessage(); // OpenNormalizedMessage | NormalizedMessage
try {
    OpenNormalizedMessage result = apiInstance.postConversationsMessagesInboundOpen(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagesInboundOpen");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                  | Description       | Notes |
| -------- | ----------------------------------------------------- | ----------------- | ----- |
| **body** | [**OpenNormalizedMessage**](OpenNormalizedMessage.md) | NormalizedMessage |

{: class="table-striped"}

### Return type

[**OpenNormalizedMessage**](OpenNormalizedMessage.md)

<a name="postConversationsMessagingIntegrationsFacebook"></a>

# **postConversationsMessagingIntegrationsFacebook**

> [FacebookIntegration](FacebookIntegration.md) postConversationsMessagingIntegrationsFacebook(body)

Create a Facebook Integration

Wraps POST /api/v2/conversations/messaging/integrations/facebook

Requires ALL permissions:

- messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
FacebookIntegrationRequest body = new FacebookIntegrationRequest(); // FacebookIntegrationRequest | FacebookIntegrationRequest
try {
    FacebookIntegration result = apiInstance.postConversationsMessagingIntegrationsFacebook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsFacebook");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description                | Notes |
| -------- | --------------------------------------------------------------- | -------------------------- | ----- |
| **body** | [**FacebookIntegrationRequest**](FacebookIntegrationRequest.md) | FacebookIntegrationRequest |

{: class="table-striped"}

### Return type

[**FacebookIntegration**](FacebookIntegration.md)

<a name="postConversationsMessagingIntegrationsLine"></a>

# **postConversationsMessagingIntegrationsLine**

> [LineIntegration](LineIntegration.md) postConversationsMessagingIntegrationsLine(body)

Create a LINE messenger Integration

Wraps POST /api/v2/conversations/messaging/integrations/line

Requires ALL permissions:

- messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.postConversationsMessagingIntegrationsLine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsLine");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description            | Notes |
| -------- | ------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**LineIntegrationRequest**](LineIntegrationRequest.md) | LineIntegrationRequest |

{: class="table-striped"}

### Return type

[**LineIntegration**](LineIntegration.md)

<a name="postConversationsMessagingIntegrationsOpen"></a>

# **postConversationsMessagingIntegrationsOpen**

> [OpenIntegration](OpenIntegration.md) postConversationsMessagingIntegrationsOpen(body)

Create an Open messaging integration

See https://developer.genesys.cloud/api/digital/openmessaging/ for more information.

Wraps POST /api/v2/conversations/messaging/integrations/open

Requires ALL permissions:

- messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
OpenIntegrationRequest body = new OpenIntegrationRequest(); // OpenIntegrationRequest | OpenIntegrationRequest
try {
    OpenIntegration result = apiInstance.postConversationsMessagingIntegrationsOpen(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsOpen");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description            | Notes |
| -------- | ------------------------------------------------------- | ---------------------- | ----- |
| **body** | [**OpenIntegrationRequest**](OpenIntegrationRequest.md) | OpenIntegrationRequest |

{: class="table-striped"}

### Return type

[**OpenIntegration**](OpenIntegration.md)

<a name="postConversationsMessagingIntegrationsTwitter"></a>

# **postConversationsMessagingIntegrationsTwitter**

> [TwitterIntegration](TwitterIntegration.md) postConversationsMessagingIntegrationsTwitter(body)

Create a Twitter Integration

Wraps POST /api/v2/conversations/messaging/integrations/twitter

Requires ALL permissions:

- messaging:integration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
TwitterIntegrationRequest body = new TwitterIntegrationRequest(); // TwitterIntegrationRequest | TwitterIntegrationRequest
try {
    TwitterIntegration result = apiInstance.postConversationsMessagingIntegrationsTwitter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsTwitter");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description               | Notes |
| -------- | ------------------------------------------------------------- | ------------------------- | ----- |
| **body** | [**TwitterIntegrationRequest**](TwitterIntegrationRequest.md) | TwitterIntegrationRequest |

{: class="table-striped"}

### Return type

[**TwitterIntegration**](TwitterIntegration.md)

<a name="postConversationsMessagingIntegrationsWhatsapp"></a>

# **postConversationsMessagingIntegrationsWhatsapp**

> [WhatsAppIntegration](WhatsAppIntegration.md) postConversationsMessagingIntegrationsWhatsapp(body)

Create a WhatsApp Integration

You must be approved by WhatsApp to use this feature. Your approved e164-formatted phone number and valid WhatsApp certificate for your number are required. Your WhatsApp certificate must have valid base64 encoding. Please paste carefully and do not add any leading or trailing spaces. Do not alter any characters. An integration must be activated within 7 days of certificate generation. If you cannot complete the addition and activation of the number within 7 days, please obtain a new certificate before creating the integration. Integrations created with an invalid number or certificate may immediately incur additional integration fees. Please carefully enter your number and certificate as described.

Wraps POST /api/v2/conversations/messaging/integrations/whatsapp

Requires ALL permissions:

- messaging:whatsappIntegration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
WhatsAppIntegrationRequest body = new WhatsAppIntegrationRequest(); // WhatsAppIntegrationRequest | WhatsAppIntegrationRequest
try {
    WhatsAppIntegration result = apiInstance.postConversationsMessagingIntegrationsWhatsapp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingIntegrationsWhatsapp");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description                | Notes |
| -------- | --------------------------------------------------------------- | -------------------------- | ----- |
| **body** | [**WhatsAppIntegrationRequest**](WhatsAppIntegrationRequest.md) | WhatsAppIntegrationRequest |

{: class="table-striped"}

### Return type

[**WhatsAppIntegration**](WhatsAppIntegration.md)

<a name="postConversationsMessagingSupportedcontent"></a>

# **postConversationsMessagingSupportedcontent**

> [SupportedContent](SupportedContent.md) postConversationsMessagingSupportedcontent(body)

Create a Supported Content profile

Wraps POST /api/v2/conversations/messaging/supportedcontent

Requires ANY permissions:

- messaging:supportedContent:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SupportedContent body = new SupportedContent(); // SupportedContent | SupportedContent
try {
    SupportedContent result = apiInstance.postConversationsMessagingSupportedcontent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#postConversationsMessagingSupportedcontent");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                        | Description      | Notes |
| -------- | ------------------------------------------- | ---------------- | ----- |
| **body** | [**SupportedContent**](SupportedContent.md) | SupportedContent |

{: class="table-striped"}

### Return type

[**SupportedContent**](SupportedContent.md)

<a name="putConversationParticipantFlaggedreason"></a>

# **putConversationParticipantFlaggedreason**

> Void putConversationParticipantFlaggedreason(conversationId, participantId)

Set flagged reason on conversation participant to indicate bad conversation quality.

Wraps PUT /api/v2/conversations/{conversationId}/participants/{participantId}/flaggedreason

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
String participantId = "participantId_example"; // String | participant ID
try {
    apiInstance.putConversationParticipantFlaggedreason(conversationId, participantId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationParticipantFlaggedreason");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **conversationId** | **String** | conversation ID |
| **participantId**  | **String** | participant ID  |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="putConversationTags"></a>

# **putConversationTags**

> String putConversationTags(conversationId, body)

Update the tags on a conversation.

Wraps PUT /api/v2/conversations/{conversationId}/tags

Requires ANY permissions:

- conversation:externalTag:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversation ID
ConversationTagsUpdate body = new ConversationTagsUpdate(); // ConversationTagsUpdate | Conversation Tags
try {
    String result = apiInstance.putConversationTags(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationTags");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                                    | Description       | Notes |
| ------------------ | ------------------------------------------------------- | ----------------- | ----- |
| **conversationId** | **String**                                              | conversation ID   |
| **body**           | [**ConversationTagsUpdate**](ConversationTagsUpdate.md) | Conversation Tags |

{: class="table-striped"}

### Return type

**String**

<a name="putConversationsCallParticipantCommunicationUuidata"></a>

# **putConversationsCallParticipantCommunicationUuidata**

> [Empty](Empty.md) putConversationsCallParticipantCommunicationUuidata(conversationId, participantId, communicationId, body)

Set uuiData to be sent on future commands.

Wraps PUT /api/v2/conversations/calls/{conversationId}/participants/{participantId}/communications/{communicationId}/uuidata

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
String participantId = "participantId_example"; // String | participantId
String communicationId = "communicationId_example"; // String | communicationId
SetUuiDataRequest body = new SetUuiDataRequest(); // SetUuiDataRequest | UUIData Request
try {
    Empty result = apiInstance.putConversationsCallParticipantCommunicationUuidata(conversationId, participantId, communicationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsCallParticipantCommunicationUuidata");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                          | Description     | Notes |
| ------------------- | --------------------------------------------- | --------------- | ----- |
| **conversationId**  | **String**                                    | conversationId  |
| **participantId**   | **String**                                    | participantId   |
| **communicationId** | **String**                                    | communicationId |
| **body**            | [**SetUuiDataRequest**](SetUuiDataRequest.md) | UUIData Request |

{: class="table-striped"}

### Return type

[**Empty**](Empty.md)

<a name="putConversationsEmailMessagesDraft"></a>

# **putConversationsEmailMessagesDraft**

> [EmailMessage](EmailMessage.md) putConversationsEmailMessagesDraft(conversationId, body)

Update conversation draft reply

Wraps PUT /api/v2/conversations/emails/{conversationId}/messages/draft

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String conversationId = "conversationId_example"; // String | conversationId
EmailMessage body = new EmailMessage(); // EmailMessage | Draft
try {
    EmailMessage result = apiInstance.putConversationsEmailMessagesDraft(conversationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsEmailMessagesDraft");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type                                | Description    | Notes |
| ------------------ | ----------------------------------- | -------------- | ----- |
| **conversationId** | **String**                          | conversationId |
| **body**           | [**EmailMessage**](EmailMessage.md) | Draft          |

{: class="table-striped"}

### Return type

[**EmailMessage**](EmailMessage.md)

<a name="putConversationsMessagingIntegrationsLineIntegrationId"></a>

# **putConversationsMessagingIntegrationsLineIntegrationId**

> [LineIntegration](LineIntegration.md) putConversationsMessagingIntegrationsLineIntegrationId(integrationId, body)

Update a LINE messenger integration

Wraps PUT /api/v2/conversations/messaging/integrations/line/{integrationId}

Requires ALL permissions:

- messaging:integration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
String integrationId = "integrationId_example"; // String | Integration ID
LineIntegrationRequest body = new LineIntegrationRequest(); // LineIntegrationRequest | LineIntegrationRequest
try {
    LineIntegration result = apiInstance.putConversationsMessagingIntegrationsLineIntegrationId(integrationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingIntegrationsLineIntegrationId");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                    | Description            | Notes |
| ----------------- | ------------------------------------------------------- | ---------------------- | ----- |
| **integrationId** | **String**                                              | Integration ID         |
| **body**          | [**LineIntegrationRequest**](LineIntegrationRequest.md) | LineIntegrationRequest |

{: class="table-striped"}

### Return type

[**LineIntegration**](LineIntegration.md)

<a name="putConversationsMessagingSupportedcontentDefault"></a>

# **putConversationsMessagingSupportedcontentDefault**

> [SupportedContent](SupportedContent.md) putConversationsMessagingSupportedcontentDefault(body)

Set the organization&#39;s default supported content profile that may be assigned to an integration when it is created.

When an integration is created a supported content ID may be assigned to it. If the supported content ID is not supplied, the default supported content profile will be assigned to it.

Wraps PUT /api/v2/conversations/messaging/supportedcontent/default

Requires ALL permissions:

- messaging:supportedContent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
SupportedContentReference body = new SupportedContentReference(); // SupportedContentReference | SupportedContent
try {
    SupportedContent result = apiInstance.putConversationsMessagingSupportedcontentDefault(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingSupportedcontentDefault");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                          | Description      | Notes |
| -------- | ------------------------------------------------------------- | ---------------- | ----- |
| **body** | [**SupportedContentReference**](SupportedContentReference.md) | SupportedContent |

{: class="table-striped"}

### Return type

[**SupportedContent**](SupportedContent.md)

<a name="putConversationsMessagingThreadingtimeline"></a>

# **putConversationsMessagingThreadingtimeline**

> [ConversationThreadingWindow](ConversationThreadingWindow.md) putConversationsMessagingThreadingtimeline(body)

Update conversation threading window timeline for each messaging type

PUT Conversation messaging threading timeline is intended to set the conversation threading settings for ALL messengerTypes. If you omit a messengerType in the request body then the setting for that messengerType will use the platform default value. The PUT replaces the existing setting(s) that were previously set for each messengerType.

Wraps PUT /api/v2/conversations/messaging/threadingtimeline

Requires ALL permissions:

- conversation:threadingTimeline:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ConversationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ConversationsApi apiInstance = new ConversationsApi();
ConversationThreadingWindow body = new ConversationThreadingWindow(); // ConversationThreadingWindow | ConversationThreadingWindowRequest
try {
    ConversationThreadingWindow result = apiInstance.putConversationsMessagingThreadingtimeline(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationsApi#putConversationsMessagingThreadingtimeline");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                              | Description                        | Notes |
| -------- | ----------------------------------------------------------------- | ---------------------------------- | ----- |
| **body** | [**ConversationThreadingWindow**](ConversationThreadingWindow.md) | ConversationThreadingWindowRequest |

{: class="table-striped"}

### Return type

[**ConversationThreadingWindow**](ConversationThreadingWindow.md)
