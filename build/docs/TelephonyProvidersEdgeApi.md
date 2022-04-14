---
title: TelephonyProvidersEdgeApi
---

## TelephonyProvidersEdgeApi

All URIs are relative to *https://api.mypurecloud.com*

| Method                                                                                                                                                                                                                | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteTelephonyProvidersEdge**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdge)                                                                                                                         | Delete a edge.                                                                                                                                            |
| [**deleteTelephonyProvidersEdgeLogicalinterface**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgeLogicalinterface)                                                                                         | Delete an edge logical interface                                                                                                                          |
| [**deleteTelephonyProvidersEdgeSoftwareupdate**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgeSoftwareupdate)                                                                                             | Cancels any in-progress update for this edge.                                                                                                             |
| [**deleteTelephonyProvidersEdgesCertificateauthority**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesCertificateauthority)                                                                               | Delete a certificate authority.                                                                                                                           |
| [**deleteTelephonyProvidersEdgesDidpool**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesDidpool)                                                                                                         | Delete a DID Pool by ID.                                                                                                                                  |
| [**deleteTelephonyProvidersEdgesEdgegroup**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesEdgegroup)                                                                                                     | Delete an edge group.                                                                                                                                     |
| [**deleteTelephonyProvidersEdgesExtensionpool**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesExtensionpool)                                                                                             | Delete an extension pool by ID                                                                                                                            |
| [**deleteTelephonyProvidersEdgesOutboundroute**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesOutboundroute)                                                                                             | Delete Outbound Route                                                                                                                                     |
| [**deleteTelephonyProvidersEdgesPhone**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesPhone)                                                                                                             | Delete a Phone by ID                                                                                                                                      |
| [**deleteTelephonyProvidersEdgesPhonebasesetting**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesPhonebasesetting)                                                                                       | Delete a Phone Base Settings by ID                                                                                                                        |
| [**deleteTelephonyProvidersEdgesSite**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesSite)                                                                                                               | Delete a Site by ID                                                                                                                                       |
| [**deleteTelephonyProvidersEdgesSiteOutboundroute**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesSiteOutboundroute)                                                                                     | Delete Outbound Route                                                                                                                                     |
| [**deleteTelephonyProvidersEdgesTrunkbasesetting**](TelephonyProvidersEdgeApi.md#deleteTelephonyProvidersEdgesTrunkbasesetting)                                                                                       | Delete a Trunk Base Settings object by ID                                                                                                                 |
| [**getConfigurationSchemasEdgesVnext**](TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnext)                                                                                                               | Lists available schema categories (Deprecated)                                                                                                            |
| [**getConfigurationSchemasEdgesVnextSchemaCategory**](TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategory)                                                                                   | List schemas of a specific category (Deprecated)                                                                                                          |
| [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaType**](TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaType)                                                               | List schemas of a specific category (Deprecated)                                                                                                          |
| [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId**](TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId)                                               | Get a json schema (Deprecated)                                                                                                                            |
| [**getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId**](TelephonyProvidersEdgeApi.md#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId) | Get metadata for a schema (Deprecated)                                                                                                                    |
| [**getTelephonyProvidersEdge**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdge)                                                                                                                               | Get edge.                                                                                                                                                 |
| [**getTelephonyProvidersEdgeDiagnosticNslookup**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeDiagnosticNslookup)                                                                                           | Get networking-related information from an Edge for a target IP or host.                                                                                  |
| [**getTelephonyProvidersEdgeDiagnosticPing**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeDiagnosticPing)                                                                                                   | Get networking-related information from an Edge for a target IP or host.                                                                                  |
| [**getTelephonyProvidersEdgeDiagnosticRoute**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeDiagnosticRoute)                                                                                                 | Get networking-related information from an Edge for a target IP or host.                                                                                  |
| [**getTelephonyProvidersEdgeDiagnosticTracepath**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeDiagnosticTracepath)                                                                                         | Get networking-related information from an Edge for a target IP or host.                                                                                  |
| [**getTelephonyProvidersEdgeLine**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLine)                                                                                                                       | Get line                                                                                                                                                  |
| [**getTelephonyProvidersEdgeLines**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLines)                                                                                                                     | Get the list of lines.                                                                                                                                    |
| [**getTelephonyProvidersEdgeLogicalinterface**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogicalinterface)                                                                                               | Get an edge logical interface                                                                                                                             |
| [**getTelephonyProvidersEdgeLogicalinterfaces**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogicalinterfaces)                                                                                             | Get edge logical interfaces.                                                                                                                              |
| [**getTelephonyProvidersEdgeLogsJob**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeLogsJob)                                                                                                                 | Get an Edge logs job.                                                                                                                                     |
| [**getTelephonyProvidersEdgeMetrics**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeMetrics)                                                                                                                 | Get the edge metrics.                                                                                                                                     |
| [**getTelephonyProvidersEdgePhysicalinterface**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgePhysicalinterface)                                                                                             | Get edge physical interface.                                                                                                                              |
| [**getTelephonyProvidersEdgePhysicalinterfaces**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgePhysicalinterfaces)                                                                                           | Retrieve a list of all configured physical interfaces from a specific edge.                                                                               |
| [**getTelephonyProvidersEdgeSetuppackage**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSetuppackage)                                                                                                       | Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.                              |
| [**getTelephonyProvidersEdgeSoftwareupdate**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSoftwareupdate)                                                                                                   | Gets software update status information about any edge.                                                                                                   |
| [**getTelephonyProvidersEdgeSoftwareversions**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeSoftwareversions)                                                                                               | Gets all the available software versions for this edge.                                                                                                   |
| [**getTelephonyProvidersEdgeTrunks**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgeTrunks)                                                                                                                   | Get the list of available trunks for the given Edge.                                                                                                      |
| [**getTelephonyProvidersEdges**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdges)                                                                                                                             | Get the list of edges.                                                                                                                                    |
| [**getTelephonyProvidersEdgesAvailablelanguages**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesAvailablelanguages)                                                                                         | Get the list of available languages.                                                                                                                      |
| [**getTelephonyProvidersEdgesCertificateauthorities**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesCertificateauthorities)                                                                                 | Get the list of certificate authorities.                                                                                                                  |
| [**getTelephonyProvidersEdgesCertificateauthority**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesCertificateauthority)                                                                                     | Get a certificate authority.                                                                                                                              |
| [**getTelephonyProvidersEdgesDid**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDid)                                                                                                                       | Get a DID by ID.                                                                                                                                          |
| [**getTelephonyProvidersEdgesDidpool**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDidpool)                                                                                                               | Get a DID Pool by ID.                                                                                                                                     |
| [**getTelephonyProvidersEdgesDidpools**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDidpools)                                                                                                             | Get a listing of DID Pools                                                                                                                                |
| [**getTelephonyProvidersEdgesDidpoolsDids**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDidpoolsDids)                                                                                                     | Get a listing of unassigned and/or assigned numbers in a set of DID Pools.                                                                                |
| [**getTelephonyProvidersEdgesDids**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesDids)                                                                                                                     | Get a listing of DIDs                                                                                                                                     |
| [**getTelephonyProvidersEdgesEdgegroup**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroup)                                                                                                           | Get edge group.                                                                                                                                           |
| [**getTelephonyProvidersEdgesEdgegroupEdgetrunkbase**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroupEdgetrunkbase)                                                                                 | Gets the edge trunk base associated with the edge group                                                                                                   |
| [**getTelephonyProvidersEdgesEdgegroups**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgegroups)                                                                                                         | Get the list of edge groups.                                                                                                                              |
| [**getTelephonyProvidersEdgesEdgeversionreport**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesEdgeversionreport)                                                                                           | Get the edge version report.                                                                                                                              |
| [**getTelephonyProvidersEdgesExpired**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExpired)                                                                                                               | List of edges more than 4 edge versions behind the latest software.                                                                                       |
| [**getTelephonyProvidersEdgesExtension**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtension)                                                                                                           | Get an extension by ID.                                                                                                                                   |
| [**getTelephonyProvidersEdgesExtensionpool**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensionpool)                                                                                                   | Get an extension pool by ID                                                                                                                               |
| [**getTelephonyProvidersEdgesExtensionpools**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensionpools)                                                                                                 | Get a listing of extension pools                                                                                                                          |
| [**getTelephonyProvidersEdgesExtensions**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesExtensions)                                                                                                         | Get a listing of extensions                                                                                                                               |
| [**getTelephonyProvidersEdgesLine**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLine)                                                                                                                     | Get a Line by ID                                                                                                                                          |
| [**getTelephonyProvidersEdgesLinebasesetting**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinebasesetting)                                                                                               | Get a line base settings object by ID                                                                                                                     |
| [**getTelephonyProvidersEdgesLinebasesettings**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinebasesettings)                                                                                             | Get a listing of line base settings objects                                                                                                               |
| [**getTelephonyProvidersEdgesLines**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLines)                                                                                                                   | Get a list of Lines                                                                                                                                       |
| [**getTelephonyProvidersEdgesLinesTemplate**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLinesTemplate)                                                                                                   | Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance                      |
| [**getTelephonyProvidersEdgesLogicalinterfaces**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesLogicalinterfaces)                                                                                           | Get edge logical interfaces.                                                                                                                              |
| [**getTelephonyProvidersEdgesMetrics**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesMetrics)                                                                                                               | Get the metrics for a list of edges.                                                                                                                      |
| [**getTelephonyProvidersEdgesOutboundroute**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesOutboundroute)                                                                                                   | Get outbound route                                                                                                                                        |
| [**getTelephonyProvidersEdgesOutboundroutes**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesOutboundroutes)                                                                                                 | Get outbound routes                                                                                                                                       |
| [**getTelephonyProvidersEdgesPhone**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhone)                                                                                                                   | Get a Phone by ID                                                                                                                                         |
| [**getTelephonyProvidersEdgesPhonebasesetting**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesetting)                                                                                             | Get a Phone Base Settings object by ID                                                                                                                    |
| [**getTelephonyProvidersEdgesPhonebasesettings**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettings)                                                                                           | Get a list of Phone Base Settings objects                                                                                                                 |
| [**getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases)                                                       | Get a list of available makes and models to create a new Phone Base Settings                                                                              |
| [**getTelephonyProvidersEdgesPhonebasesettingsTemplate**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonebasesettingsTemplate)                                                                           | Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance |
| [**getTelephonyProvidersEdgesPhones**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhones)                                                                                                                 | Get a list of Phone Instances                                                                                                                             |
| [**getTelephonyProvidersEdgesPhonesTemplate**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhonesTemplate)                                                                                                 | Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance                   |
| [**getTelephonyProvidersEdgesPhysicalinterfaces**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesPhysicalinterfaces)                                                                                         | Get physical interfaces for edges.                                                                                                                        |
| [**getTelephonyProvidersEdgesSite**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSite)                                                                                                                     | Get a Site by ID.                                                                                                                                         |
| [**getTelephonyProvidersEdgesSiteNumberplan**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplan)                                                                                                 | Get a Number Plan by ID.                                                                                                                                  |
| [**getTelephonyProvidersEdgesSiteNumberplans**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplans)                                                                                               | Get the list of Number Plans for this Site. Only fetches the first 200 records.                                                                           |
| [**getTelephonyProvidersEdgesSiteNumberplansClassifications**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteNumberplansClassifications)                                                                 | Get a list of Classifications for this Site                                                                                                               |
| [**getTelephonyProvidersEdgesSiteOutboundroute**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteOutboundroute)                                                                                           | Get an outbound route                                                                                                                                     |
| [**getTelephonyProvidersEdgesSiteOutboundroutes**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSiteOutboundroutes)                                                                                         | Get outbound routes                                                                                                                                       |
| [**getTelephonyProvidersEdgesSites**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesSites)                                                                                                                   | Get the list of Sites.                                                                                                                                    |
| [**getTelephonyProvidersEdgesTimezones**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTimezones)                                                                                                           | Get a list of Edge-compatible time zones                                                                                                                  |
| [**getTelephonyProvidersEdgesTrunk**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunk)                                                                                                                   | Get a Trunk by ID                                                                                                                                         |
| [**getTelephonyProvidersEdgesTrunkMetrics**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkMetrics)                                                                                                     | Get the trunk metrics.                                                                                                                                    |
| [**getTelephonyProvidersEdgesTrunkbasesetting**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesetting)                                                                                             | Get a Trunk Base Settings object by ID                                                                                                                    |
| [**getTelephonyProvidersEdgesTrunkbasesettings**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettings)                                                                                           | Get Trunk Base Settings listing                                                                                                                           |
| [**getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases)                                                       | Get a list of available makes and models to create a new Trunk Base Settings                                                                              |
| [**getTelephonyProvidersEdgesTrunkbasesettingsTemplate**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkbasesettingsTemplate)                                                                           | Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance |
| [**getTelephonyProvidersEdgesTrunks**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunks)                                                                                                                 | Get the list of available trunks.                                                                                                                         |
| [**getTelephonyProvidersEdgesTrunksMetrics**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunksMetrics)                                                                                                   | Get the metrics for a list of trunks.                                                                                                                     |
| [**getTelephonyProvidersEdgesTrunkswithrecording**](TelephonyProvidersEdgeApi.md#getTelephonyProvidersEdgesTrunkswithrecording)                                                                                       | Get Counts of trunks that have recording disabled or enabled                                                                                              |
| [**postTelephonyProvidersEdgeDiagnosticNslookup**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeDiagnosticNslookup)                                                                                         | Nslookup request command to collect networking-related information from an Edge for a target IP or host.                                                  |
| [**postTelephonyProvidersEdgeDiagnosticPing**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeDiagnosticPing)                                                                                                 | Ping Request command to collect networking-related information from an Edge for a target IP or host.                                                      |
| [**postTelephonyProvidersEdgeDiagnosticRoute**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeDiagnosticRoute)                                                                                               | Route request command to collect networking-related information from an Edge for a target IP or host.                                                     |
| [**postTelephonyProvidersEdgeDiagnosticTracepath**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeDiagnosticTracepath)                                                                                       | Tracepath request command to collect networking-related information from an Edge for a target IP or host.                                                 |
| [**postTelephonyProvidersEdgeLogicalinterfaces**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogicalinterfaces)                                                                                           | Create an edge logical interface.                                                                                                                         |
| [**postTelephonyProvidersEdgeLogsJobUpload**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogsJobUpload)                                                                                                   | Request that the specified fileIds be uploaded from the Edge.                                                                                             |
| [**postTelephonyProvidersEdgeLogsJobs**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeLogsJobs)                                                                                                             | Create a job to upload a list of Edge logs.                                                                                                               |
| [**postTelephonyProvidersEdgeReboot**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeReboot)                                                                                                                 | Reboot an Edge                                                                                                                                            |
| [**postTelephonyProvidersEdgeSoftwareupdate**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeSoftwareupdate)                                                                                                 | Starts a software update for this edge.                                                                                                                   |
| [**postTelephonyProvidersEdgeStatuscode**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeStatuscode)                                                                                                         | Take an Edge in or out of service                                                                                                                         |
| [**postTelephonyProvidersEdgeUnpair**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgeUnpair)                                                                                                                 | Unpair an Edge                                                                                                                                            |
| [**postTelephonyProvidersEdges**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdges)                                                                                                                           | Create an edge.                                                                                                                                           |
| [**postTelephonyProvidersEdgesAddressvalidation**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesAddressvalidation)                                                                                         | Validates a street address                                                                                                                                |
| [**postTelephonyProvidersEdgesCertificateauthorities**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesCertificateauthorities)                                                                               | Create a certificate authority.                                                                                                                           |
| [**postTelephonyProvidersEdgesDidpools**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesDidpools)                                                                                                           | Create a new DID pool                                                                                                                                     |
| [**postTelephonyProvidersEdgesEdgegroups**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesEdgegroups)                                                                                                       | Create an edge group.                                                                                                                                     |
| [**postTelephonyProvidersEdgesExtensionpools**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesExtensionpools)                                                                                               | Create a new extension pool                                                                                                                               |
| [**postTelephonyProvidersEdgesOutboundroutes**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesOutboundroutes)                                                                                               | Create outbound rule                                                                                                                                      |
| [**postTelephonyProvidersEdgesPhoneReboot**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhoneReboot)                                                                                                     | Reboot a Phone                                                                                                                                            |
| [**postTelephonyProvidersEdgesPhonebasesettings**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhonebasesettings)                                                                                         | Create a new Phone Base Settings object                                                                                                                   |
| [**postTelephonyProvidersEdgesPhones**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhones)                                                                                                               | Create a new Phone                                                                                                                                        |
| [**postTelephonyProvidersEdgesPhonesReboot**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesPhonesReboot)                                                                                                   | Reboot Multiple Phones                                                                                                                                    |
| [**postTelephonyProvidersEdgesSiteOutboundroutes**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSiteOutboundroutes)                                                                                       | Create outbound route                                                                                                                                     |
| [**postTelephonyProvidersEdgesSiteRebalance**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSiteRebalance)                                                                                                 | Triggers the rebalance operation.                                                                                                                         |
| [**postTelephonyProvidersEdgesSites**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesSites)                                                                                                                 | Create a Site.                                                                                                                                            |
| [**postTelephonyProvidersEdgesTrunkbasesettings**](TelephonyProvidersEdgeApi.md#postTelephonyProvidersEdgesTrunkbasesettings)                                                                                         | Create a Trunk Base Settings object                                                                                                                       |
| [**putTelephonyProvidersEdge**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdge)                                                                                                                               | Update a edge.                                                                                                                                            |
| [**putTelephonyProvidersEdgeLine**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgeLine)                                                                                                                       | Update a line.                                                                                                                                            |
| [**putTelephonyProvidersEdgeLogicalinterface**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgeLogicalinterface)                                                                                               | Update an edge logical interface.                                                                                                                         |
| [**putTelephonyProvidersEdgesCertificateauthority**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesCertificateauthority)                                                                                     | Update a certificate authority.                                                                                                                           |
| [**putTelephonyProvidersEdgesDid**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesDid)                                                                                                                       | Update a DID by ID.                                                                                                                                       |
| [**putTelephonyProvidersEdgesDidpool**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesDidpool)                                                                                                               | Update a DID Pool by ID.                                                                                                                                  |
| [**putTelephonyProvidersEdgesEdgegroup**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesEdgegroup)                                                                                                           | Update an edge group.                                                                                                                                     |
| [**putTelephonyProvidersEdgesEdgegroupEdgetrunkbase**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesEdgegroupEdgetrunkbase)                                                                                 | Update the edge trunk base associated with the edge group                                                                                                 |
| [**putTelephonyProvidersEdgesExtension**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesExtension)                                                                                                           | Update an extension by ID.                                                                                                                                |
| [**putTelephonyProvidersEdgesExtensionpool**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesExtensionpool)                                                                                                   | Update an extension pool by ID                                                                                                                            |
| [**putTelephonyProvidersEdgesOutboundroute**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesOutboundroute)                                                                                                   | Update outbound route                                                                                                                                     |
| [**putTelephonyProvidersEdgesPhone**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesPhone)                                                                                                                   | Update a Phone by ID                                                                                                                                      |
| [**putTelephonyProvidersEdgesPhonebasesetting**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesPhonebasesetting)                                                                                             | Update a Phone Base Settings by ID                                                                                                                        |
| [**putTelephonyProvidersEdgesSite**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSite)                                                                                                                     | Update a Site by ID.                                                                                                                                      |
| [**putTelephonyProvidersEdgesSiteNumberplans**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSiteNumberplans)                                                                                               | Update the list of Number Plans. A user can update maximum 200 number plans at a time.                                                                    |
| [**putTelephonyProvidersEdgesSiteOutboundroute**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesSiteOutboundroute)                                                                                           | Update outbound route                                                                                                                                     |
| [**putTelephonyProvidersEdgesTrunkbasesetting**](TelephonyProvidersEdgeApi.md#putTelephonyProvidersEdgesTrunkbasesetting)                                                                                             | Update a Trunk Base Settings object by ID                                                                                                                 |

{: class="table-striped"}

<a name="deleteTelephonyProvidersEdge"></a>

# **deleteTelephonyProvidersEdge**

> Void deleteTelephonyProvidersEdge(edgeId)

Delete a edge.

Wraps DELETE /api/v2/telephony/providers/edges/{edgeId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    apiInstance.deleteTelephonyProvidersEdge(edgeId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdge");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgeLogicalinterface"></a>

# **deleteTelephonyProvidersEdgeLogicalinterface**

> Void deleteTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId)

Delete an edge logical interface

Wraps DELETE /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
try {
    apiInstance.deleteTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgeLogicalinterface");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **edgeId**      | **String** | Edge ID      |
| **interfaceId** | **String** | Interface ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgeSoftwareupdate"></a>

# **deleteTelephonyProvidersEdgeSoftwareupdate**

> Void deleteTelephonyProvidersEdgeSoftwareupdate(edgeId)

Cancels any in-progress update for this edge.

Wraps DELETE /api/v2/telephony/providers/edges/{edgeId}/softwareupdate

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    apiInstance.deleteTelephonyProvidersEdgeSoftwareupdate(edgeId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgeSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesCertificateauthority"></a>

# **deleteTelephonyProvidersEdgesCertificateauthority**

> Void deleteTelephonyProvidersEdgesCertificateauthority(certificateId)

Delete a certificate authority.

Wraps DELETE /api/v2/telephony/providers/edges/certificateauthorities/{certificateId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    apiInstance.deleteTelephonyProvidersEdgesCertificateauthority(certificateId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesCertificateauthority");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **certificateId** | **String** | Certificate ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesDidpool"></a>

# **deleteTelephonyProvidersEdgesDidpool**

> Void deleteTelephonyProvidersEdgesDidpool(didPoolId)

Delete a DID Pool by ID.

Wraps DELETE /api/v2/telephony/providers/edges/didpools/{didPoolId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
try {
    apiInstance.deleteTelephonyProvidersEdgesDidpool(didPoolId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesDidpool");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **didPoolId** | **String** | DID pool ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesEdgegroup"></a>

# **deleteTelephonyProvidersEdgesEdgegroup**

> Void deleteTelephonyProvidersEdgesEdgegroup(edgeGroupId)

Delete an edge group.

Wraps DELETE /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
try {
    apiInstance.deleteTelephonyProvidersEdgesEdgegroup(edgeGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesEdgegroup");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description   | Notes |
| --------------- | ---------- | ------------- | ----- |
| **edgeGroupId** | **String** | Edge group ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesExtensionpool"></a>

# **deleteTelephonyProvidersEdgesExtensionpool**

> Void deleteTelephonyProvidersEdgesExtensionpool(extensionPoolId)

Delete an extension pool by ID

Wraps DELETE /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
try {
    apiInstance.deleteTelephonyProvidersEdgesExtensionpool(extensionPoolId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesExtensionpool");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **extensionPoolId** | **String** | Extension pool ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesOutboundroute"></a>

# **deleteTelephonyProvidersEdgesOutboundroute**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteTelephonyProvidersEdgesOutboundroute(outboundRouteId)

Delete Outbound Route

This route is deprecated, use /telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} instead.

Wraps DELETE /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    apiInstance.deleteTelephonyProvidersEdgesOutboundroute(outboundRouteId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **outboundRouteId** | **String** | Outbound route ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesPhone"></a>

# **deleteTelephonyProvidersEdgesPhone**

> Void deleteTelephonyProvidersEdgesPhone(phoneId)

Delete a Phone by ID

Wraps DELETE /api/v2/telephony/providers/edges/phones/{phoneId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
try {
    apiInstance.deleteTelephonyProvidersEdgesPhone(phoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesPhone");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **phoneId** | **String** | Phone ID    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesPhonebasesetting"></a>

# **deleteTelephonyProvidersEdgesPhonebasesetting**

> Void deleteTelephonyProvidersEdgesPhonebasesetting(phoneBaseId)

Delete a Phone Base Settings by ID

Wraps DELETE /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
try {
    apiInstance.deleteTelephonyProvidersEdgesPhonebasesetting(phoneBaseId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesPhonebasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description   | Notes |
| --------------- | ---------- | ------------- | ----- |
| **phoneBaseId** | **String** | Phone base ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesSite"></a>

# **deleteTelephonyProvidersEdgesSite**

> Void deleteTelephonyProvidersEdgesSite(siteId)

Delete a Site by ID

Wraps DELETE /api/v2/telephony/providers/edges/sites/{siteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    apiInstance.deleteTelephonyProvidersEdgesSite(siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesSite");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **siteId** | **String** | Site ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesSiteOutboundroute"></a>

# **deleteTelephonyProvidersEdgesSiteOutboundroute**

> Void deleteTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId)

Delete Outbound Route

Wraps DELETE /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    apiInstance.deleteTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesSiteOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **siteId**          | **String** | Site ID           |
| **outboundRouteId** | **String** | Outbound route ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="deleteTelephonyProvidersEdgesTrunkbasesetting"></a>

# **deleteTelephonyProvidersEdgesTrunkbasesetting**

> Void deleteTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId)

Delete a Trunk Base Settings object by ID

Wraps DELETE /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
try {
    apiInstance.deleteTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#deleteTelephonyProvidersEdgesTrunkbasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type       | Description   | Notes |
| ----------------------- | ---------- | ------------- | ----- |
| **trunkBaseSettingsId** | **String** | Trunk Base ID |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="getConfigurationSchemasEdgesVnext"></a>

# **getConfigurationSchemasEdgesVnext**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [SchemaCategoryEntityListing](SchemaCategoryEntityListing.md) getConfigurationSchemasEdgesVnext(pageSize, pageNumber)

Lists available schema categories (Deprecated)

Wraps GET /api/v2/configuration/schemas/edges/vnext

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaCategoryEntityListing result = apiInstance.getConfigurationSchemasEdgesVnext(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getConfigurationSchemasEdgesVnext");
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

[**SchemaCategoryEntityListing**](SchemaCategoryEntityListing.md)

<a name="getConfigurationSchemasEdgesVnextSchemaCategory"></a>

# **getConfigurationSchemasEdgesVnextSchemaCategory**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [SchemaReferenceEntityListing](SchemaReferenceEntityListing.md) getConfigurationSchemasEdgesVnextSchemaCategory(schemaCategory, pageSize, pageNumber)

List schemas of a specific category (Deprecated)

Wraps GET /api/v2/configuration/schemas/edges/vnext/{schemaCategory}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaReferenceEntityListing result = apiInstance.getConfigurationSchemasEdgesVnextSchemaCategory(schemaCategory, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getConfigurationSchemasEdgesVnextSchemaCategory");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description     | Notes                      |
| ------------------ | ----------- | --------------- | -------------------------- |
| **schemaCategory** | **String**  | Schema category |
| **pageSize**       | **Integer** | Page size       | [optional] [default to 25] |
| **pageNumber**     | **Integer** | Page number     | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**SchemaReferenceEntityListing**](SchemaReferenceEntityListing.md)

<a name="getConfigurationSchemasEdgesVnextSchemaCategorySchemaType"></a>

# **getConfigurationSchemasEdgesVnextSchemaCategorySchemaType**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [SchemaReferenceEntityListing](SchemaReferenceEntityListing.md) getConfigurationSchemasEdgesVnextSchemaCategorySchemaType(schemaCategory, schemaType, pageSize, pageNumber)

List schemas of a specific category (Deprecated)

Wraps GET /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    SchemaReferenceEntityListing result = apiInstance.getConfigurationSchemasEdgesVnextSchemaCategorySchemaType(schemaCategory, schemaType, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getConfigurationSchemasEdgesVnextSchemaCategorySchemaType");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type        | Description     | Notes                      |
| ------------------ | ----------- | --------------- | -------------------------- |
| **schemaCategory** | **String**  | Schema category |
| **schemaType**     | **String**  | Schema type     |
| **pageSize**       | **Integer** | Page size       | [optional] [default to 25] |
| **pageNumber**     | **Integer** | Page number     | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**SchemaReferenceEntityListing**](SchemaReferenceEntityListing.md)

<a name="getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId"></a>

# **getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [Organization](Organization.md) getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId(schemaCategory, schemaType, schemaId)

Get a json schema (Deprecated)

Wraps GET /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
String schemaId = "schemaId_example"; // String | Schema ID
try {
    Organization result = apiInstance.getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId(schemaCategory, schemaType, schemaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaId");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes |
| ------------------ | ---------- | --------------- | ----- |
| **schemaCategory** | **String** | Schema category |
| **schemaType**     | **String** | Schema type     |
| **schemaId**       | **String** | Schema ID       |

{: class="table-striped"}

### Return type

[**Organization**](Organization.md)

<a name="getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId"></a>

# **getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [Organization](Organization.md) getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type)

Get metadata for a schema (Deprecated)

Wraps GET /api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId}

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String schemaCategory = "schemaCategory_example"; // String | Schema category
String schemaType = "schemaType_example"; // String | Schema type
String schemaId = "schemaId_example"; // String | Schema ID
String extensionType = "extensionType_example"; // String | extension
String metadataId = "metadataId_example"; // String | Metadata ID
String type = "type_example"; // String | Type
try {
    Organization result = apiInstance.getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId(schemaCategory, schemaType, schemaId, extensionType, metadataId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataId");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description     | Notes      |
| ------------------ | ---------- | --------------- | ---------- |
| **schemaCategory** | **String** | Schema category |
| **schemaType**     | **String** | Schema type     |
| **schemaId**       | **String** | Schema ID       |
| **extensionType**  | **String** | extension       |
| **metadataId**     | **String** | Metadata ID     |
| **type**           | **String** | Type            | [optional] |

{: class="table-striped"}

### Return type

[**Organization**](Organization.md)

<a name="getTelephonyProvidersEdge"></a>

# **getTelephonyProvidersEdge**

> [Edge](Edge.md) getTelephonyProvidersEdge(edgeId, expand)

Get edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
try {
    Edge result = apiInstance.getTelephonyProvidersEdge(edgeId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdge");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                                       | Notes                            |
| ---------- | ----------------------------------- | ------------------------------------------------- | -------------------------------- |
| **edgeId** | **String**                          | Edge ID                                           |
| **expand** | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated | [optional]<br />**Values**: site |

{: class="table-striped"}

### Return type

[**Edge**](Edge.md)

<a name="getTelephonyProvidersEdgeDiagnosticNslookup"></a>

# **getTelephonyProvidersEdgeDiagnosticNslookup**

> [EdgeNetworkDiagnosticResponse](EdgeNetworkDiagnosticResponse.md) getTelephonyProvidersEdgeDiagnosticNslookup(edgeId)

Get networking-related information from an Edge for a target IP or host.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/diagnostic/nslookup

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    EdgeNetworkDiagnosticResponse result = apiInstance.getTelephonyProvidersEdgeDiagnosticNslookup(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeDiagnosticNslookup");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnosticResponse**](EdgeNetworkDiagnosticResponse.md)

<a name="getTelephonyProvidersEdgeDiagnosticPing"></a>

# **getTelephonyProvidersEdgeDiagnosticPing**

> [EdgeNetworkDiagnosticResponse](EdgeNetworkDiagnosticResponse.md) getTelephonyProvidersEdgeDiagnosticPing(edgeId)

Get networking-related information from an Edge for a target IP or host.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/diagnostic/ping

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    EdgeNetworkDiagnosticResponse result = apiInstance.getTelephonyProvidersEdgeDiagnosticPing(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeDiagnosticPing");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnosticResponse**](EdgeNetworkDiagnosticResponse.md)

<a name="getTelephonyProvidersEdgeDiagnosticRoute"></a>

# **getTelephonyProvidersEdgeDiagnosticRoute**

> [EdgeNetworkDiagnosticResponse](EdgeNetworkDiagnosticResponse.md) getTelephonyProvidersEdgeDiagnosticRoute(edgeId)

Get networking-related information from an Edge for a target IP or host.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/diagnostic/route

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    EdgeNetworkDiagnosticResponse result = apiInstance.getTelephonyProvidersEdgeDiagnosticRoute(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeDiagnosticRoute");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnosticResponse**](EdgeNetworkDiagnosticResponse.md)

<a name="getTelephonyProvidersEdgeDiagnosticTracepath"></a>

# **getTelephonyProvidersEdgeDiagnosticTracepath**

> [EdgeNetworkDiagnosticResponse](EdgeNetworkDiagnosticResponse.md) getTelephonyProvidersEdgeDiagnosticTracepath(edgeId)

Get networking-related information from an Edge for a target IP or host.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/diagnostic/tracepath

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    EdgeNetworkDiagnosticResponse result = apiInstance.getTelephonyProvidersEdgeDiagnosticTracepath(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeDiagnosticTracepath");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnosticResponse**](EdgeNetworkDiagnosticResponse.md)

<a name="getTelephonyProvidersEdgeLine"></a>

# **getTelephonyProvidersEdgeLine**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EdgeLine](EdgeLine.md) getTelephonyProvidersEdgeLine(edgeId, lineId)

Get line

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String lineId = "lineId_example"; // String | Line ID
try {
    EdgeLine result = apiInstance.getTelephonyProvidersEdgeLine(edgeId, lineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeLine");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |
| **lineId** | **String** | Line ID     |

{: class="table-striped"}

### Return type

[**EdgeLine**](EdgeLine.md)

<a name="getTelephonyProvidersEdgeLines"></a>

# **getTelephonyProvidersEdgeLines**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EdgeLineEntityListing](EdgeLineEntityListing.md) getTelephonyProvidersEdgeLines(edgeId, pageSize, pageNumber)

Get the list of lines.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/lines

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EdgeLineEntityListing result = apiInstance.getTelephonyProvidersEdgeLines(edgeId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeLines");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **edgeId**     | **String**  | Edge ID     |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |

{: class="table-striped"}

### Return type

[**EdgeLineEntityListing**](EdgeLineEntityListing.md)

<a name="getTelephonyProvidersEdgeLogicalinterface"></a>

# **getTelephonyProvidersEdgeLogicalinterface**

> [DomainLogicalInterface](DomainLogicalInterface.md) getTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId, expand)

Get an edge logical interface

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Field to expand in the response
try {
    DomainLogicalInterface result = apiInstance.getTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeLogicalinterface");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description                     | Notes                                                                               |
| --------------- | ----------------------------------- | ------------------------------- | ----------------------------------------------------------------------------------- |
| **edgeId**      | **String**                          | Edge ID                         |
| **interfaceId** | **String**                          | Interface ID                    |
| **expand**      | [**List&lt;String&gt;**](String.md) | Field to expand in the response | [optional]<br />**Values**: externalTrunkBaseAssignments, phoneTrunkBaseAssignments |

{: class="table-striped"}

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

<a name="getTelephonyProvidersEdgeLogicalinterfaces"></a>

# **getTelephonyProvidersEdgeLogicalinterfaces**

> [LogicalInterfaceEntityListing](LogicalInterfaceEntityListing.md) getTelephonyProvidersEdgeLogicalinterfaces(edgeId, expand)

Get edge logical interfaces.

Retrieve a list of all configured logical interfaces from a specific edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Field to expand in the response
try {
    LogicalInterfaceEntityListing result = apiInstance.getTelephonyProvidersEdgeLogicalinterfaces(edgeId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeLogicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                | Description                     | Notes                                                                               |
| ---------- | ----------------------------------- | ------------------------------- | ----------------------------------------------------------------------------------- |
| **edgeId** | **String**                          | Edge ID                         |
| **expand** | [**List&lt;String&gt;**](String.md) | Field to expand in the response | [optional]<br />**Values**: externalTrunkBaseAssignments, phoneTrunkBaseAssignments |

{: class="table-striped"}

### Return type

[**LogicalInterfaceEntityListing**](LogicalInterfaceEntityListing.md)

<a name="getTelephonyProvidersEdgeLogsJob"></a>

# **getTelephonyProvidersEdgeLogsJob**

> [EdgeLogsJob](EdgeLogsJob.md) getTelephonyProvidersEdgeLogsJob(edgeId, jobId)

Get an Edge logs job.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String jobId = "jobId_example"; // String | Job ID
try {
    EdgeLogsJob result = apiInstance.getTelephonyProvidersEdgeLogsJob(edgeId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeLogsJob");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |
| **jobId**  | **String** | Job ID      |

{: class="table-striped"}

### Return type

[**EdgeLogsJob**](EdgeLogsJob.md)

<a name="getTelephonyProvidersEdgeMetrics"></a>

# **getTelephonyProvidersEdgeMetrics**

> [EdgeMetrics](EdgeMetrics.md) getTelephonyProvidersEdgeMetrics(edgeId)

Get the edge metrics.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/metrics

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    EdgeMetrics result = apiInstance.getTelephonyProvidersEdgeMetrics(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

[**EdgeMetrics**](EdgeMetrics.md)

<a name="getTelephonyProvidersEdgePhysicalinterface"></a>

# **getTelephonyProvidersEdgePhysicalinterface**

> [DomainPhysicalInterface](DomainPhysicalInterface.md) getTelephonyProvidersEdgePhysicalinterface(edgeId, interfaceId)

Get edge physical interface.

Retrieve a physical interface from a specific edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces/{interfaceId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
try {
    DomainPhysicalInterface result = apiInstance.getTelephonyProvidersEdgePhysicalinterface(edgeId, interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgePhysicalinterface");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **edgeId**      | **String** | Edge ID      |
| **interfaceId** | **String** | Interface ID |

{: class="table-striped"}

### Return type

[**DomainPhysicalInterface**](DomainPhysicalInterface.md)

<a name="getTelephonyProvidersEdgePhysicalinterfaces"></a>

# **getTelephonyProvidersEdgePhysicalinterfaces**

> [PhysicalInterfaceEntityListing](PhysicalInterfaceEntityListing.md) getTelephonyProvidersEdgePhysicalinterfaces(edgeId)

Retrieve a list of all configured physical interfaces from a specific edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/physicalinterfaces

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    PhysicalInterfaceEntityListing result = apiInstance.getTelephonyProvidersEdgePhysicalinterfaces(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgePhysicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

[**PhysicalInterfaceEntityListing**](PhysicalInterfaceEntityListing.md)

<a name="getTelephonyProvidersEdgeSetuppackage"></a>

# **getTelephonyProvidersEdgeSetuppackage**

> [VmPairingInfo](VmPairingInfo.md) getTelephonyProvidersEdgeSetuppackage(edgeId)

Get the setup package for a locally deployed edge device. This is needed to complete the setup process for the virtual edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/setuppackage

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    VmPairingInfo result = apiInstance.getTelephonyProvidersEdgeSetuppackage(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeSetuppackage");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

[**VmPairingInfo**](VmPairingInfo.md)

<a name="getTelephonyProvidersEdgeSoftwareupdate"></a>

# **getTelephonyProvidersEdgeSoftwareupdate**

> [DomainEdgeSoftwareUpdateDto](DomainEdgeSoftwareUpdateDto.md) getTelephonyProvidersEdgeSoftwareupdate(edgeId)

Gets software update status information about any edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/softwareupdate

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    DomainEdgeSoftwareUpdateDto result = apiInstance.getTelephonyProvidersEdgeSoftwareupdate(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

[**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md)

<a name="getTelephonyProvidersEdgeSoftwareversions"></a>

# **getTelephonyProvidersEdgeSoftwareversions**

> [DomainEdgeSoftwareVersionDtoEntityListing](DomainEdgeSoftwareVersionDtoEntityListing.md) getTelephonyProvidersEdgeSoftwareversions(edgeId)

Gets all the available software versions for this edge.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/softwareversions

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
try {
    DomainEdgeSoftwareVersionDtoEntityListing result = apiInstance.getTelephonyProvidersEdgeSoftwareversions(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeSoftwareversions");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge ID     |

{: class="table-striped"}

### Return type

[**DomainEdgeSoftwareVersionDtoEntityListing**](DomainEdgeSoftwareVersionDtoEntityListing.md)

<a name="getTelephonyProvidersEdgeTrunks"></a>

# **getTelephonyProvidersEdgeTrunks**

> [TrunkEntityListing](TrunkEntityListing.md) getTelephonyProvidersEdgeTrunks(edgeId, pageNumber, pageSize, sortBy, sortOrder, trunkBaseId, trunkType)

Get the list of available trunks for the given Edge.

Trunks are created by assigning trunk base settings to an Edge or Edge Group.

Wraps GET /api/v2/telephony/providers/edges/{edgeId}/trunks

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
String trunkBaseId = "trunkBaseId_example"; // String | Filter by Trunk Base Ids
String trunkType = "trunkType_example"; // String | Filter by a Trunk type
try {
    TrunkEntityListing result = apiInstance.getTelephonyProvidersEdgeTrunks(edgeId, pageNumber, pageSize, sortBy, sortOrder, trunkBaseId, trunkType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgeTrunks");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description              | Notes                                             |
| --------------- | ----------- | ------------------------ | ------------------------------------------------- |
| **edgeId**      | **String**  | Edge ID                  |
| **pageNumber**  | **Integer** | Page number              | [optional] [default to 1]                         |
| **pageSize**    | **Integer** | Page size                | [optional] [default to 25]                        |
| **sortBy**      | **String**  | Value by which to sort   | [optional] [default to name]                      |
| **sortOrder**   | **String**  | Sort order               | [optional] [default to ASC]                       |
| **trunkBaseId** | **String**  | Filter by Trunk Base Ids | [optional]                                        |
| **trunkType**   | **String**  | Filter by a Trunk type   | [optional]<br />**Values**: EXTERNAL, PHONE, EDGE |

{: class="table-striped"}

### Return type

[**TrunkEntityListing**](TrunkEntityListing.md)

<a name="getTelephonyProvidersEdges"></a>

# **getTelephonyProvidersEdges**

> [EdgeEntityListing](EdgeEntityListing.md) getTelephonyProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy, managed)

Get the list of edges.

Wraps GET /api/v2/telephony/providers/edges

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String siteId = "siteId_example"; // String | Filter by site.id
String edgeGroupId = "edgeGroupId_example"; // String | Filter by edgeGroup.id
String sortBy = "name"; // String | Sort by
Boolean managed = true; // Boolean | Filter by managed
try {
    EdgeEntityListing result = apiInstance.getTelephonyProvidersEdges(pageSize, pageNumber, name, siteId, edgeGroupId, sortBy, managed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdges");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description            | Notes                        |
| --------------- | ----------- | ---------------------- | ---------------------------- |
| **pageSize**    | **Integer** | Page size              | [optional] [default to 25]   |
| **pageNumber**  | **Integer** | Page number            | [optional] [default to 1]    |
| **name**        | **String**  | Name                   | [optional]                   |
| **siteId**      | **String**  | Filter by site.id      | [optional]                   |
| **edgeGroupId** | **String**  | Filter by edgeGroup.id | [optional]                   |
| **sortBy**      | **String**  | Sort by                | [optional] [default to name] |
| **managed**     | **Boolean** | Filter by managed      | [optional]                   |

{: class="table-striped"}

### Return type

[**EdgeEntityListing**](EdgeEntityListing.md)

<a name="getTelephonyProvidersEdgesAvailablelanguages"></a>

# **getTelephonyProvidersEdgesAvailablelanguages**

> [AvailableLanguageList](AvailableLanguageList.md) getTelephonyProvidersEdgesAvailablelanguages()

Get the list of available languages.

Wraps GET /api/v2/telephony/providers/edges/availablelanguages

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    AvailableLanguageList result = apiInstance.getTelephonyProvidersEdgesAvailablelanguages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesAvailablelanguages");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**AvailableLanguageList**](AvailableLanguageList.md)

<a name="getTelephonyProvidersEdgesCertificateauthorities"></a>

# **getTelephonyProvidersEdgesCertificateauthorities**

> [CertificateAuthorityEntityListing](CertificateAuthorityEntityListing.md) getTelephonyProvidersEdgesCertificateauthorities()

Get the list of certificate authorities.

Wraps GET /api/v2/telephony/providers/edges/certificateauthorities

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    CertificateAuthorityEntityListing result = apiInstance.getTelephonyProvidersEdgesCertificateauthorities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesCertificateauthorities");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**CertificateAuthorityEntityListing**](CertificateAuthorityEntityListing.md)

<a name="getTelephonyProvidersEdgesCertificateauthority"></a>

# **getTelephonyProvidersEdgesCertificateauthority**

> [DomainCertificateAuthority](DomainCertificateAuthority.md) getTelephonyProvidersEdgesCertificateauthority(certificateId)

Get a certificate authority.

Wraps GET /api/v2/telephony/providers/edges/certificateauthorities/{certificateId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    DomainCertificateAuthority result = apiInstance.getTelephonyProvidersEdgesCertificateauthority(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesCertificateauthority");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type       | Description    | Notes |
| ----------------- | ---------- | -------------- | ----- |
| **certificateId** | **String** | Certificate ID |

{: class="table-striped"}

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

<a name="getTelephonyProvidersEdgesDid"></a>

# **getTelephonyProvidersEdgesDid**

> [DID](DID.md) getTelephonyProvidersEdgesDid(didId)

Get a DID by ID.

Wraps GET /api/v2/telephony/providers/edges/dids/{didId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didId = "didId_example"; // String | DID ID
try {
    DID result = apiInstance.getTelephonyProvidersEdgesDid(didId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesDid");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type       | Description | Notes |
| --------- | ---------- | ----------- | ----- |
| **didId** | **String** | DID ID      |

{: class="table-striped"}

### Return type

[**DID**](DID.md)

<a name="getTelephonyProvidersEdgesDidpool"></a>

# **getTelephonyProvidersEdgesDidpool**

> [DIDPool](DIDPool.md) getTelephonyProvidersEdgesDidpool(didPoolId)

Get a DID Pool by ID.

Wraps GET /api/v2/telephony/providers/edges/didpools/{didPoolId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
try {
    DIDPool result = apiInstance.getTelephonyProvidersEdgesDidpool(didPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesDidpool");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description | Notes |
| ------------- | ---------- | ----------- | ----- |
| **didPoolId** | **String** | DID pool ID |

{: class="table-striped"}

### Return type

[**DIDPool**](DIDPool.md)

<a name="getTelephonyProvidersEdgesDidpools"></a>

# **getTelephonyProvidersEdgesDidpools**

> [DIDPoolEntityListing](DIDPoolEntityListing.md) getTelephonyProvidersEdgesDidpools(pageSize, pageNumber, sortBy, id)

Get a listing of DID Pools

Wraps GET /api/v2/telephony/providers/edges/didpools

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
List<String> id = Arrays.asList("id_example"); // List<String> | Filter by a specific list of ID's
try {
    DIDPoolEntityListing result = apiInstance.getTelephonyProvidersEdgesDidpools(pageSize, pageNumber, sortBy, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesDidpools");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                           | Notes                          |
| -------------- | ----------------------------------- | ------------------------------------- | ------------------------------ |
| **pageSize**   | **Integer**                         | Page size                             | [optional] [default to 25]     |
| **pageNumber** | **Integer**                         | Page number                           | [optional] [default to 1]      |
| **sortBy**     | **String**                          | Sort by                               | [optional] [default to number] |
| **id**         | [**List&lt;String&gt;**](String.md) | Filter by a specific list of ID&#39;s | [optional]                     |

{: class="table-striped"}

### Return type

[**DIDPoolEntityListing**](DIDPoolEntityListing.md)

<a name="getTelephonyProvidersEdgesDidpoolsDids"></a>

# **getTelephonyProvidersEdgesDidpoolsDids**

> [DIDNumberEntityListing](DIDNumberEntityListing.md) getTelephonyProvidersEdgesDidpoolsDids(type, id, numberMatch, pageSize, pageNumber, sortOrder)

Get a listing of unassigned and/or assigned numbers in a set of DID Pools.

Wraps GET /api/v2/telephony/providers/edges/didpools/dids

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String type = "type_example"; // String | The type of numbers to return.
List<String> id = Arrays.asList("id_example"); // List<String> | Filter by a specific list of DID Pools.  If this is not provided, numbers from all DID Pools will be returned.
String numberMatch = "numberMatch_example"; // String | A number to filter the results by.
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "ascending"; // String | Sort order
try {
    DIDNumberEntityListing result = apiInstance.getTelephonyProvidersEdgesDidpoolsDids(type, id, numberMatch, pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesDidpoolsDids");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description                                                                                                   | Notes                                                 |
| --------------- | ----------------------------------- | ------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| **type**        | **String**                          | The type of numbers to return.                                                                                | <br />**Values**: ASSIGNED_AND_UNASSIGNED, UNASSIGNED |
| **id**          | [**List&lt;String&gt;**](String.md) | Filter by a specific list of DID Pools. If this is not provided, numbers from all DID Pools will be returned. | [optional]                                            |
| **numberMatch** | **String**                          | A number to filter the results by.                                                                            | [optional]                                            |
| **pageSize**    | **Integer**                         | Page size                                                                                                     | [optional] [default to 25]                            |
| **pageNumber**  | **Integer**                         | Page number                                                                                                   | [optional] [default to 1]                             |
| **sortOrder**   | **String**                          | Sort order                                                                                                    | [optional] [default to ascending]                     |

{: class="table-striped"}

### Return type

[**DIDNumberEntityListing**](DIDNumberEntityListing.md)

<a name="getTelephonyProvidersEdgesDids"></a>

# **getTelephonyProvidersEdgesDids**

> [DIDEntityListing](DIDEntityListing.md) getTelephonyProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber, ownerId, didPoolId, id)

Get a listing of DIDs

Wraps GET /api/v2/telephony/providers/edges/dids

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String phoneNumber = "phoneNumber_example"; // String | Filter by phoneNumber
String ownerId = "ownerId_example"; // String | Filter by the owner of a phone number
String didPoolId = "didPoolId_example"; // String | Filter by the DID Pool assignment
List<String> id = Arrays.asList("id_example"); // List<String> | Filter by a specific list of ID's
try {
    DIDEntityListing result = apiInstance.getTelephonyProvidersEdgesDids(pageSize, pageNumber, sortBy, sortOrder, phoneNumber, ownerId, didPoolId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesDids");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description                           | Notes                          |
| --------------- | ----------------------------------- | ------------------------------------- | ------------------------------ |
| **pageSize**    | **Integer**                         | Page size                             | [optional] [default to 25]     |
| **pageNumber**  | **Integer**                         | Page number                           | [optional] [default to 1]      |
| **sortBy**      | **String**                          | Sort by                               | [optional] [default to number] |
| **sortOrder**   | **String**                          | Sort order                            | [optional] [default to ASC]    |
| **phoneNumber** | **String**                          | Filter by phoneNumber                 | [optional]                     |
| **ownerId**     | **String**                          | Filter by the owner of a phone number | [optional]                     |
| **didPoolId**   | **String**                          | Filter by the DID Pool assignment     | [optional]                     |
| **id**          | [**List&lt;String&gt;**](String.md) | Filter by a specific list of ID&#39;s | [optional]                     |

{: class="table-striped"}

### Return type

[**DIDEntityListing**](DIDEntityListing.md)

<a name="getTelephonyProvidersEdgesEdgegroup"></a>

# **getTelephonyProvidersEdgesEdgegroup**

> [EdgeGroup](EdgeGroup.md) getTelephonyProvidersEdgesEdgegroup(edgeGroupId, expand)

Get edge group.

Wraps GET /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response
try {
    EdgeGroup result = apiInstance.getTelephonyProvidersEdgesEdgegroup(edgeGroupId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesEdgegroup");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                | Description                      | Notes                                                                |
| --------------- | ----------------------------------- | -------------------------------- | -------------------------------------------------------------------- |
| **edgeGroupId** | **String**                          | Edge group ID                    |
| **expand**      | [**List&lt;String&gt;**](String.md) | Fields to expand in the response | [optional]<br />**Values**: phoneTrunkBases, edgeTrunkBaseAssignment |

{: class="table-striped"}

### Return type

[**EdgeGroup**](EdgeGroup.md)

<a name="getTelephonyProvidersEdgesEdgegroupEdgetrunkbase"></a>

# **getTelephonyProvidersEdgesEdgegroupEdgetrunkbase**

> [EdgeTrunkBase](EdgeTrunkBase.md) getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(edgegroupId, edgetrunkbaseId)

Gets the edge trunk base associated with the edge group

Wraps GET /api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgegroupId = "edgegroupId_example"; // String | Edge Group ID
String edgetrunkbaseId = "edgetrunkbaseId_example"; // String | Edge Trunk Base ID
try {
    EdgeTrunkBase result = apiInstance.getTelephonyProvidersEdgesEdgegroupEdgetrunkbase(edgegroupId, edgetrunkbaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesEdgegroupEdgetrunkbase");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description        | Notes |
| ------------------- | ---------- | ------------------ | ----- |
| **edgegroupId**     | **String** | Edge Group ID      |
| **edgetrunkbaseId** | **String** | Edge Trunk Base ID |

{: class="table-striped"}

### Return type

[**EdgeTrunkBase**](EdgeTrunkBase.md)

<a name="getTelephonyProvidersEdgesEdgegroups"></a>

# **getTelephonyProvidersEdgesEdgegroups**

> [EdgeGroupEntityListing](EdgeGroupEntityListing.md) getTelephonyProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy, managed)

Get the list of edge groups.

Wraps GET /api/v2/telephony/providers/edges/edgegroups

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String sortBy = "name"; // String | Sort by
Boolean managed = true; // Boolean | Filter by managed
try {
    EdgeGroupEntityListing result = apiInstance.getTelephonyProvidersEdgesEdgegroups(pageSize, pageNumber, name, sortBy, managed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesEdgegroups");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description       | Notes                        |
| -------------- | ----------- | ----------------- | ---------------------------- |
| **pageSize**   | **Integer** | Page size         | [optional] [default to 25]   |
| **pageNumber** | **Integer** | Page number       | [optional] [default to 1]    |
| **name**       | **String**  | Name              | [optional]                   |
| **sortBy**     | **String**  | Sort by           | [optional] [default to name] |
| **managed**    | **Boolean** | Filter by managed | [optional]                   |

{: class="table-striped"}

### Return type

[**EdgeGroupEntityListing**](EdgeGroupEntityListing.md)

<a name="getTelephonyProvidersEdgesEdgeversionreport"></a>

# **getTelephonyProvidersEdgesEdgeversionreport**

> [EdgeVersionReport](EdgeVersionReport.md) getTelephonyProvidersEdgesEdgeversionreport()

Get the edge version report.

The report will not have consistent data about the edge version(s) until all edges have been reset.

Wraps GET /api/v2/telephony/providers/edges/edgeversionreport

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    EdgeVersionReport result = apiInstance.getTelephonyProvidersEdgesEdgeversionreport();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesEdgeversionreport");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**EdgeVersionReport**](EdgeVersionReport.md)

<a name="getTelephonyProvidersEdgesExpired"></a>

# **getTelephonyProvidersEdgesExpired**

> [ExpiredEdgeListing](ExpiredEdgeListing.md) getTelephonyProvidersEdgesExpired()

List of edges more than 4 edge versions behind the latest software.

Wraps GET /api/v2/telephony/providers/edges/expired

Requires ANY permissions:

- telephony:plugin:all
- internal:edge:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
try {
    ExpiredEdgeListing result = apiInstance.getTelephonyProvidersEdgesExpired();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesExpired");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.

### Return type

[**ExpiredEdgeListing**](ExpiredEdgeListing.md)

<a name="getTelephonyProvidersEdgesExtension"></a>

# **getTelephonyProvidersEdgesExtension**

> [Extension](Extension.md) getTelephonyProvidersEdgesExtension(extensionId)

Get an extension by ID.

Wraps GET /api/v2/telephony/providers/edges/extensions/{extensionId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionId = "extensionId_example"; // String | Extension ID
try {
    Extension result = apiInstance.getTelephonyProvidersEdgesExtension(extensionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesExtension");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description  | Notes |
| --------------- | ---------- | ------------ | ----- |
| **extensionId** | **String** | Extension ID |

{: class="table-striped"}

### Return type

[**Extension**](Extension.md)

<a name="getTelephonyProvidersEdgesExtensionpool"></a>

# **getTelephonyProvidersEdgesExtensionpool**

> [ExtensionPool](ExtensionPool.md) getTelephonyProvidersEdgesExtensionpool(extensionPoolId)

Get an extension pool by ID

Wraps GET /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
try {
    ExtensionPool result = apiInstance.getTelephonyProvidersEdgesExtensionpool(extensionPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesExtensionpool");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **extensionPoolId** | **String** | Extension pool ID |

{: class="table-striped"}

### Return type

[**ExtensionPool**](ExtensionPool.md)

<a name="getTelephonyProvidersEdgesExtensionpools"></a>

# **getTelephonyProvidersEdgesExtensionpools**

> [ExtensionPoolEntityListing](ExtensionPoolEntityListing.md) getTelephonyProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number)

Get a listing of extension pools

Wraps GET /api/v2/telephony/providers/edges/extensionpools

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "sortBy_example"; // String | Sort by
String number = "number_example"; // String | Number
try {
    ExtensionPoolEntityListing result = apiInstance.getTelephonyProvidersEdgesExtensionpools(pageSize, pageNumber, sortBy, number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesExtensionpools");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                      |
| -------------- | ----------- | ----------- | -------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 25] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]  |
| **sortBy**     | **String**  | Sort by     | [optional]                 |
| **number**     | **String**  | Number      | [optional]                 |

{: class="table-striped"}

### Return type

[**ExtensionPoolEntityListing**](ExtensionPoolEntityListing.md)

<a name="getTelephonyProvidersEdgesExtensions"></a>

# **getTelephonyProvidersEdgesExtensions**

> [ExtensionEntityListing](ExtensionEntityListing.md) getTelephonyProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number)

Get a listing of extensions

Wraps GET /api/v2/telephony/providers/edges/extensions

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "number"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String number = "number_example"; // String | Filter by number
try {
    ExtensionEntityListing result = apiInstance.getTelephonyProvidersEdgesExtensions(pageSize, pageNumber, sortBy, sortOrder, number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesExtensions");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description      | Notes                          |
| -------------- | ----------- | ---------------- | ------------------------------ |
| **pageSize**   | **Integer** | Page size        | [optional] [default to 25]     |
| **pageNumber** | **Integer** | Page number      | [optional] [default to 1]      |
| **sortBy**     | **String**  | Sort by          | [optional] [default to number] |
| **sortOrder**  | **String**  | Sort order       | [optional] [default to ASC]    |
| **number**     | **String**  | Filter by number | [optional]                     |

{: class="table-striped"}

### Return type

[**ExtensionEntityListing**](ExtensionEntityListing.md)

<a name="getTelephonyProvidersEdgesLine"></a>

# **getTelephonyProvidersEdgesLine**

> [Line](Line.md) getTelephonyProvidersEdgesLine(lineId)

Get a Line by ID

Wraps GET /api/v2/telephony/providers/edges/lines/{lineId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineId = "lineId_example"; // String | Line ID
try {
    Line result = apiInstance.getTelephonyProvidersEdgesLine(lineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLine");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **lineId** | **String** | Line ID     |

{: class="table-striped"}

### Return type

[**Line**](Line.md)

<a name="getTelephonyProvidersEdgesLinebasesetting"></a>

# **getTelephonyProvidersEdgesLinebasesetting**

> [LineBase](LineBase.md) getTelephonyProvidersEdgesLinebasesetting(lineBaseId)

Get a line base settings object by ID

Wraps GET /api/v2/telephony/providers/edges/linebasesettings/{lineBaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineBaseId = "lineBaseId_example"; // String | Line base ID
try {
    LineBase result = apiInstance.getTelephonyProvidersEdgesLinebasesetting(lineBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLinebasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type       | Description  | Notes |
| -------------- | ---------- | ------------ | ----- |
| **lineBaseId** | **String** | Line base ID |

{: class="table-striped"}

### Return type

[**LineBase**](LineBase.md)

<a name="getTelephonyProvidersEdgesLinebasesettings"></a>

# **getTelephonyProvidersEdgesLinebasesettings**

> [LineBaseEntityListing](LineBaseEntityListing.md) getTelephonyProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder, expand)

Get a listing of line base settings objects

Wraps GET /api/v2/telephony/providers/edges/linebasesettings

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
try {
    LineBaseEntityListing result = apiInstance.getTelephonyProvidersEdgesLinebasesettings(pageNumber, pageSize, sortBy, sortOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLinebasesettings");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                       | Notes                                  |
| -------------- | ----------------------------------- | ------------------------------------------------- | -------------------------------------- |
| **pageNumber** | **Integer**                         | Page number                                       | [optional] [default to 1]              |
| **pageSize**   | **Integer**                         | Page size                                         | [optional] [default to 25]             |
| **sortBy**     | **String**                          | Value by which to sort                            | [optional] [default to name]           |
| **sortOrder**  | **String**                          | Sort order                                        | [optional] [default to ASC]            |
| **expand**     | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated | [optional]<br />**Values**: properties |

{: class="table-striped"}

### Return type

[**LineBaseEntityListing**](LineBaseEntityListing.md)

<a name="getTelephonyProvidersEdgesLines"></a>

# **getTelephonyProvidersEdgesLines**

> [LineEntityListing](LineEntityListing.md) getTelephonyProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand)

Get a list of Lines

Wraps GET /api/v2/telephony/providers/edges/lines

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String sortBy = "name"; // String | Value by which to sort
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
try {
    LineEntityListing result = apiInstance.getTelephonyProvidersEdgesLines(pageSize, pageNumber, name, sortBy, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLines");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                       | Notes                                                                                                    |
| -------------- | ----------------------------------- | ------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| **pageSize**   | **Integer**                         | Page size                                         | [optional] [default to 25]                                                                               |
| **pageNumber** | **Integer**                         | Page number                                       | [optional] [default to 1]                                                                                |
| **name**       | **String**                          | Name                                              | [optional]                                                                                               |
| **sortBy**     | **String**                          | Value by which to sort                            | [optional] [default to name]                                                                             |
| **expand**     | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated | [optional]<br />**Values**: properties, site, edgeGroup, primaryEdge, secondaryEdge, edges, assignedUser |

{: class="table-striped"}

### Return type

[**LineEntityListing**](LineEntityListing.md)

<a name="getTelephonyProvidersEdgesLinesTemplate"></a>

# **getTelephonyProvidersEdgesLinesTemplate**

> [Line](Line.md) getTelephonyProvidersEdgesLinesTemplate(lineBaseSettingsId)

Get a Line instance template based on a Line Base Settings object. This object can then be modified and saved as a new Line instance

Wraps GET /api/v2/telephony/providers/edges/lines/template

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String lineBaseSettingsId = "lineBaseSettingsId_example"; // String | The id of a Line Base Settings object upon which to base this Line
try {
    Line result = apiInstance.getTelephonyProvidersEdgesLinesTemplate(lineBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLinesTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                   | Type       | Description                                                        | Notes |
| ---------------------- | ---------- | ------------------------------------------------------------------ | ----- |
| **lineBaseSettingsId** | **String** | The id of a Line Base Settings object upon which to base this Line |

{: class="table-striped"}

### Return type

[**Line**](Line.md)

<a name="getTelephonyProvidersEdgesLogicalinterfaces"></a>

# **getTelephonyProvidersEdgesLogicalinterfaces**

> [LogicalInterfaceEntityListing](LogicalInterfaceEntityListing.md) getTelephonyProvidersEdgesLogicalinterfaces(edgeIds, expand)

Get edge logical interfaces.

Retrieve the configured logical interfaces for a list edges. Only 100 edges can be requested at a time.

Wraps GET /api/v2/telephony/providers/edges/logicalinterfaces

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeIds = "edgeIds_example"; // String | Comma separated list of Edge Id's
List<String> expand = Arrays.asList("expand_example"); // List<String> | Field to expand in the response
try {
    LogicalInterfaceEntityListing result = apiInstance.getTelephonyProvidersEdgesLogicalinterfaces(edgeIds, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesLogicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                                | Description                           | Notes                                                                               |
| ----------- | ----------------------------------- | ------------------------------------- | ----------------------------------------------------------------------------------- |
| **edgeIds** | **String**                          | Comma separated list of Edge Id&#39;s |
| **expand**  | [**List&lt;String&gt;**](String.md) | Field to expand in the response       | [optional]<br />**Values**: externalTrunkBaseAssignments, phoneTrunkBaseAssignments |

{: class="table-striped"}

### Return type

[**LogicalInterfaceEntityListing**](LogicalInterfaceEntityListing.md)

<a name="getTelephonyProvidersEdgesMetrics"></a>

# **getTelephonyProvidersEdgesMetrics**

> [List&lt;EdgeMetrics&gt;](EdgeMetrics.md) getTelephonyProvidersEdgesMetrics(edgeIds)

Get the metrics for a list of edges.

Wraps GET /api/v2/telephony/providers/edges/metrics

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeIds = "edgeIds_example"; // String | Comma separated list of Edge Id's
try {
    List<EdgeMetrics> result = apiInstance.getTelephonyProvidersEdgesMetrics(edgeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description                           | Notes |
| ----------- | ---------- | ------------------------------------- | ----- |
| **edgeIds** | **String** | Comma separated list of Edge Id&#39;s |

{: class="table-striped"}

### Return type

[**List&lt;EdgeMetrics&gt;**](EdgeMetrics.md)

<a name="getTelephonyProvidersEdgesOutboundroute"></a>

# **getTelephonyProvidersEdgesOutboundroute**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OutboundRoute](OutboundRoute.md) getTelephonyProvidersEdgesOutboundroute(outboundRouteId)

Get outbound route

This route is deprecated, use /telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} instead.

Wraps GET /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    OutboundRoute result = apiInstance.getTelephonyProvidersEdgesOutboundroute(outboundRouteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **outboundRouteId** | **String** | Outbound route ID |

{: class="table-striped"}

### Return type

[**OutboundRoute**](OutboundRoute.md)

<a name="getTelephonyProvidersEdgesOutboundroutes"></a>

# **getTelephonyProvidersEdgesOutboundroutes**

> [OutboundRouteEntityListing](OutboundRouteEntityListing.md) getTelephonyProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, externalTrunkBasesIds, sortBy)

Get outbound routes

Wraps GET /api/v2/telephony/providers/edges/outboundroutes

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String siteId = "siteId_example"; // String | Filter by site.id
String externalTrunkBasesIds = "externalTrunkBasesIds_example"; // String | Filter by externalTrunkBases.ids
String sortBy = "name"; // String | Sort by
try {
    OutboundRouteEntityListing result = apiInstance.getTelephonyProvidersEdgesOutboundroutes(pageSize, pageNumber, name, siteId, externalTrunkBasesIds, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type        | Description                      | Notes                        |
| ------------------------- | ----------- | -------------------------------- | ---------------------------- |
| **pageSize**              | **Integer** | Page size                        | [optional] [default to 25]   |
| **pageNumber**            | **Integer** | Page number                      | [optional] [default to 1]    |
| **name**                  | **String**  | Name                             | [optional]                   |
| **siteId**                | **String**  | Filter by site.id                | [optional]                   |
| **externalTrunkBasesIds** | **String**  | Filter by externalTrunkBases.ids | [optional]                   |
| **sortBy**                | **String**  | Sort by                          | [optional] [default to name] |

{: class="table-striped"}

### Return type

[**OutboundRouteEntityListing**](OutboundRouteEntityListing.md)

<a name="getTelephonyProvidersEdgesPhone"></a>

# **getTelephonyProvidersEdgesPhone**

> [Phone](Phone.md) getTelephonyProvidersEdgesPhone(phoneId)

Get a Phone by ID

Wraps GET /api/v2/telephony/providers/edges/phones/{phoneId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
try {
    Phone result = apiInstance.getTelephonyProvidersEdgesPhone(phoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhone");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **phoneId** | **String** | Phone ID    |

{: class="table-striped"}

### Return type

[**Phone**](Phone.md)

<a name="getTelephonyProvidersEdgesPhonebasesetting"></a>

# **getTelephonyProvidersEdgesPhonebasesetting**

> [PhoneBase](PhoneBase.md) getTelephonyProvidersEdgesPhonebasesetting(phoneBaseId)

Get a Phone Base Settings object by ID

Wraps GET /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
try {
    PhoneBase result = apiInstance.getTelephonyProvidersEdgesPhonebasesetting(phoneBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhonebasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type       | Description   | Notes |
| --------------- | ---------- | ------------- | ----- |
| **phoneBaseId** | **String** | Phone base ID |

{: class="table-striped"}

### Return type

[**PhoneBase**](PhoneBase.md)

<a name="getTelephonyProvidersEdgesPhonebasesettings"></a>

# **getTelephonyProvidersEdgesPhonebasesettings**

> [PhoneBaseEntityListing](PhoneBaseEntityListing.md) getTelephonyProvidersEdgesPhonebasesettings(pageSize, pageNumber, sortBy, sortOrder, expand, name)

Get a list of Phone Base Settings objects

Wraps GET /api/v2/telephony/providers/edges/phonebasesettings

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
String name = "name_example"; // String | Name
try {
    PhoneBaseEntityListing result = apiInstance.getTelephonyProvidersEdgesPhonebasesettings(pageSize, pageNumber, sortBy, sortOrder, expand, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhonebasesettings");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type                                | Description                                       | Notes                                         |
| -------------- | ----------------------------------- | ------------------------------------------------- | --------------------------------------------- |
| **pageSize**   | **Integer**                         | Page size                                         | [optional] [default to 25]                    |
| **pageNumber** | **Integer**                         | Page number                                       | [optional] [default to 1]                     |
| **sortBy**     | **String**                          | Value by which to sort                            | [optional] [default to name]                  |
| **sortOrder**  | **String**                          | Sort order                                        | [optional] [default to ASC]                   |
| **expand**     | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated | [optional]<br />**Values**: properties, lines |
| **name**       | **String**                          | Name                                              | [optional]                                    |

{: class="table-striped"}

### Return type

[**PhoneBaseEntityListing**](PhoneBaseEntityListing.md)

<a name="getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases"></a>

# **getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases**

> [PhoneMetaBaseEntityListing](PhoneMetaBaseEntityListing.md) getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber)

Get a list of available makes and models to create a new Phone Base Settings

Wraps GET /api/v2/telephony/providers/edges/phonebasesettings/availablemetabases

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    PhoneMetaBaseEntityListing result = apiInstance.getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhonebasesettingsAvailablemetabases");
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

[**PhoneMetaBaseEntityListing**](PhoneMetaBaseEntityListing.md)

<a name="getTelephonyProvidersEdgesPhonebasesettingsTemplate"></a>

# **getTelephonyProvidersEdgesPhonebasesettingsTemplate**

> [PhoneBase](PhoneBase.md) getTelephonyProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId)

Get a Phone Base Settings instance template from a given make and model. This object can then be modified and saved as a new Phone Base Settings instance

Wraps GET /api/v2/telephony/providers/edges/phonebasesettings/template

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneMetabaseId = "phoneMetabaseId_example"; // String | The id of a metabase object upon which to base this Phone Base Settings
try {
    PhoneBase result = apiInstance.getTelephonyProvidersEdgesPhonebasesettingsTemplate(phoneMetabaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhonebasesettingsTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                                                             | Notes |
| ------------------- | ---------- | ----------------------------------------------------------------------- | ----- |
| **phoneMetabaseId** | **String** | The id of a metabase object upon which to base this Phone Base Settings |

{: class="table-striped"}

### Return type

[**PhoneBase**](PhoneBase.md)

<a name="getTelephonyProvidersEdgesPhones"></a>

# **getTelephonyProvidersEdgesPhones**

> [PhoneEntityListing](PhoneEntityListing.md) getTelephonyProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, name, statusOperationalStatus, secondaryStatusOperationalStatus, expand, fields)

Get a list of Phone Instances

Wraps GET /api/v2/telephony/providers/edges/phones

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | The field to sort by
String sortOrder = "ASC"; // String | Sort order
String siteId = "siteId_example"; // String | Filter by site.id
String webRtcUserId = "webRtcUserId_example"; // String | Filter by webRtcUser.id
String phoneBaseSettingsId = "phoneBaseSettingsId_example"; // String | Filter by phoneBaseSettings.id
String linesLoggedInUserId = "linesLoggedInUserId_example"; // String | Filter by lines.loggedInUser.id
String linesDefaultForUserId = "linesDefaultForUserId_example"; // String | Filter by lines.defaultForUser.id
String phoneHardwareId = "phoneHardwareId_example"; // String | Filter by phone_hardwareId
String linesId = "linesId_example"; // String | Filter by lines.id
String linesName = "linesName_example"; // String | Filter by lines.name
String name = "name_example"; // String | Name of the Phone to filter by
String statusOperationalStatus = "statusOperationalStatus_example"; // String | The primary status to filter by
String secondaryStatusOperationalStatus = "secondaryStatusOperationalStatus_example"; // String | The secondary status to filter by
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields and properties to get, comma-separated
try {
    PhoneEntityListing result = apiInstance.getTelephonyProvidersEdgesPhones(pageNumber, pageSize, sortBy, sortOrder, siteId, webRtcUserId, phoneBaseSettingsId, linesLoggedInUserId, linesDefaultForUserId, phoneHardwareId, linesId, linesName, name, statusOperationalStatus, secondaryStatusOperationalStatus, expand, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhones");
    e.printStackTrace();
}
```

### Parameters

| Name                                 | Type                                | Description                                       | Notes                                                                                                                                  |
| ------------------------------------ | ----------------------------------- | ------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| **pageNumber**                       | **Integer**                         | Page number                                       | [optional] [default to 1]                                                                                                              |
| **pageSize**                         | **Integer**                         | Page size                                         | [optional] [default to 25]                                                                                                             |
| **sortBy**                           | **String**                          | The field to sort by                              | [optional] [default to name]<br />**Values**: name, status.operationalStatus, secondaryStatus.operationalStatus                        |
| **sortOrder**                        | **String**                          | Sort order                                        | [optional] [default to ASC]                                                                                                            |
| **siteId**                           | **String**                          | Filter by site.id                                 | [optional]                                                                                                                             |
| **webRtcUserId**                     | **String**                          | Filter by webRtcUser.id                           | [optional]                                                                                                                             |
| **phoneBaseSettingsId**              | **String**                          | Filter by phoneBaseSettings.id                    | [optional]                                                                                                                             |
| **linesLoggedInUserId**              | **String**                          | Filter by lines.loggedInUser.id                   | [optional]                                                                                                                             |
| **linesDefaultForUserId**            | **String**                          | Filter by lines.defaultForUser.id                 | [optional]                                                                                                                             |
| **phoneHardwareId**                  | **String**                          | Filter by phone_hardwareId                        | [optional]                                                                                                                             |
| **linesId**                          | **String**                          | Filter by lines.id                                | [optional]                                                                                                                             |
| **linesName**                        | **String**                          | Filter by lines.name                              | [optional]                                                                                                                             |
| **name**                             | **String**                          | Name of the Phone to filter by                    | [optional]                                                                                                                             |
| **statusOperationalStatus**          | **String**                          | The primary status to filter by                   | [optional]                                                                                                                             |
| **secondaryStatusOperationalStatus** | **String**                          | The secondary status to filter by                 | [optional]                                                                                                                             |
| **expand**                           | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated | [optional]<br />**Values**: properties, site, status, status.primaryEdgesStatus, status.secondaryEdgesStatus, phoneBaseSettings, lines |
| **fields**                           | [**List&lt;String&gt;**](String.md) | Fields and properties to get, comma-separated     | [optional]<br />**Values**: webRtcUser, properties.\*, lines.loggedInUser, lines.defaultForUser                                        |

{: class="table-striped"}

### Return type

[**PhoneEntityListing**](PhoneEntityListing.md)

<a name="getTelephonyProvidersEdgesPhonesTemplate"></a>

# **getTelephonyProvidersEdgesPhonesTemplate**

> [Phone](Phone.md) getTelephonyProvidersEdgesPhonesTemplate(phoneBaseSettingsId)

Get a Phone instance template based on a Phone Base Settings object. This object can then be modified and saved as a new Phone instance

Wraps GET /api/v2/telephony/providers/edges/phones/template

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseSettingsId = "phoneBaseSettingsId_example"; // String | The id of a Phone Base Settings object upon which to base this Phone
try {
    Phone result = apiInstance.getTelephonyProvidersEdgesPhonesTemplate(phoneBaseSettingsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhonesTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type       | Description                                                          | Notes |
| ----------------------- | ---------- | -------------------------------------------------------------------- | ----- |
| **phoneBaseSettingsId** | **String** | The id of a Phone Base Settings object upon which to base this Phone |

{: class="table-striped"}

### Return type

[**Phone**](Phone.md)

<a name="getTelephonyProvidersEdgesPhysicalinterfaces"></a>

# **getTelephonyProvidersEdgesPhysicalinterfaces**

> [PhysicalInterfaceEntityListing](PhysicalInterfaceEntityListing.md) getTelephonyProvidersEdgesPhysicalinterfaces(edgeIds)

Get physical interfaces for edges.

Retrieves a list of all configured physical interfaces for a list of edges. Only 100 edges can be requested at a time.

Wraps GET /api/v2/telephony/providers/edges/physicalinterfaces

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeIds = "edgeIds_example"; // String | Comma separated list of Edge Id's
try {
    PhysicalInterfaceEntityListing result = apiInstance.getTelephonyProvidersEdgesPhysicalinterfaces(edgeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesPhysicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description                           | Notes |
| ----------- | ---------- | ------------------------------------- | ----- |
| **edgeIds** | **String** | Comma separated list of Edge Id&#39;s |

{: class="table-striped"}

### Return type

[**PhysicalInterfaceEntityListing**](PhysicalInterfaceEntityListing.md)

<a name="getTelephonyProvidersEdgesSite"></a>

# **getTelephonyProvidersEdgesSite**

> [Site](Site.md) getTelephonyProvidersEdgesSite(siteId)

Get a Site by ID.

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}

Requires ANY permissions:

- telephony:plugin:all
- telephony:sites:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    Site result = apiInstance.getTelephonyProvidersEdgesSite(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSite");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **siteId** | **String** | Site ID     |

{: class="table-striped"}

### Return type

[**Site**](Site.md)

<a name="getTelephonyProvidersEdgesSiteNumberplan"></a>

# **getTelephonyProvidersEdgesSiteNumberplan**

> [NumberPlan](NumberPlan.md) getTelephonyProvidersEdgesSiteNumberplan(siteId, numberPlanId)

Get a Number Plan by ID.

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}/numberplans/{numberPlanId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String numberPlanId = "numberPlanId_example"; // String | Number Plan ID
try {
    NumberPlan result = apiInstance.getTelephonyProvidersEdgesSiteNumberplan(siteId, numberPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSiteNumberplan");
    e.printStackTrace();
}
```

### Parameters

| Name             | Type       | Description    | Notes |
| ---------------- | ---------- | -------------- | ----- |
| **siteId**       | **String** | Site ID        |
| **numberPlanId** | **String** | Number Plan ID |

{: class="table-striped"}

### Return type

[**NumberPlan**](NumberPlan.md)

<a name="getTelephonyProvidersEdgesSiteNumberplans"></a>

# **getTelephonyProvidersEdgesSiteNumberplans**

> [List&lt;NumberPlan&gt;](NumberPlan.md) getTelephonyProvidersEdgesSiteNumberplans(siteId)

Get the list of Number Plans for this Site. Only fetches the first 200 records.

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}/numberplans

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    List<NumberPlan> result = apiInstance.getTelephonyProvidersEdgesSiteNumberplans(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSiteNumberplans");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **siteId** | **String** | Site ID     |

{: class="table-striped"}

### Return type

[**List&lt;NumberPlan&gt;**](NumberPlan.md)

<a name="getTelephonyProvidersEdgesSiteNumberplansClassifications"></a>

# **getTelephonyProvidersEdgesSiteNumberplansClassifications**

> List&lt;String&gt; getTelephonyProvidersEdgesSiteNumberplansClassifications(siteId, classification)

Get a list of Classifications for this Site

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String classification = "classification_example"; // String | Classification
try {
    List<String> result = apiInstance.getTelephonyProvidersEdgesSiteNumberplansClassifications(siteId, classification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSiteNumberplansClassifications");
    e.printStackTrace();
}
```

### Parameters

| Name               | Type       | Description    | Notes      |
| ------------------ | ---------- | -------------- | ---------- |
| **siteId**         | **String** | Site ID        |
| **classification** | **String** | Classification | [optional] |

{: class="table-striped"}

### Return type

**List&lt;String&gt;**

<a name="getTelephonyProvidersEdgesSiteOutboundroute"></a>

# **getTelephonyProvidersEdgesSiteOutboundroute**

> [OutboundRouteBase](OutboundRouteBase.md) getTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId)

Get an outbound route

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
try {
    OutboundRouteBase result = apiInstance.getTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSiteOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description       | Notes |
| ------------------- | ---------- | ----------------- | ----- |
| **siteId**          | **String** | Site ID           |
| **outboundRouteId** | **String** | Outbound route ID |

{: class="table-striped"}

### Return type

[**OutboundRouteBase**](OutboundRouteBase.md)

<a name="getTelephonyProvidersEdgesSiteOutboundroutes"></a>

# **getTelephonyProvidersEdgesSiteOutboundroutes**

> [OutboundRouteBaseEntityListing](OutboundRouteBaseEntityListing.md) getTelephonyProvidersEdgesSiteOutboundroutes(siteId, pageSize, pageNumber, name, externalTrunkBasesIds, sortBy)

Get outbound routes

Wraps GET /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String name = "name_example"; // String | Name
String externalTrunkBasesIds = "externalTrunkBasesIds_example"; // String | externalTrunkBases.ids
String sortBy = "name"; // String | Sort by
try {
    OutboundRouteBaseEntityListing result = apiInstance.getTelephonyProvidersEdgesSiteOutboundroutes(siteId, pageSize, pageNumber, name, externalTrunkBasesIds, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSiteOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

| Name                      | Type        | Description            | Notes                        |
| ------------------------- | ----------- | ---------------------- | ---------------------------- |
| **siteId**                | **String**  | Site ID                |
| **pageSize**              | **Integer** | Page size              | [optional] [default to 25]   |
| **pageNumber**            | **Integer** | Page number            | [optional] [default to 1]    |
| **name**                  | **String**  | Name                   | [optional]                   |
| **externalTrunkBasesIds** | **String**  | externalTrunkBases.ids | [optional]                   |
| **sortBy**                | **String**  | Sort by                | [optional] [default to name] |

{: class="table-striped"}

### Return type

[**OutboundRouteBaseEntityListing**](OutboundRouteBaseEntityListing.md)

<a name="getTelephonyProvidersEdgesSites"></a>

# **getTelephonyProvidersEdgesSites**

> [SiteEntityListing](SiteEntityListing.md) getTelephonyProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId, managed)

Get the list of Sites.

Wraps GET /api/v2/telephony/providers/edges/sites

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String sortOrder = "ASC"; // String | Sort order
String name = "name_example"; // String | Name
String locationId = "locationId_example"; // String | Location Id
Boolean managed = true; // Boolean | Filter by managed
try {
    SiteEntityListing result = apiInstance.getTelephonyProvidersEdgesSites(pageSize, pageNumber, sortBy, sortOrder, name, locationId, managed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesSites");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description       | Notes                        |
| -------------- | ----------- | ----------------- | ---------------------------- |
| **pageSize**   | **Integer** | Page size         | [optional] [default to 25]   |
| **pageNumber** | **Integer** | Page number       | [optional] [default to 1]    |
| **sortBy**     | **String**  | Sort by           | [optional] [default to name] |
| **sortOrder**  | **String**  | Sort order        | [optional] [default to ASC]  |
| **name**       | **String**  | Name              | [optional]                   |
| **locationId** | **String**  | Location Id       | [optional]                   |
| **managed**    | **Boolean** | Filter by managed | [optional]                   |

{: class="table-striped"}

### Return type

[**SiteEntityListing**](SiteEntityListing.md)

<a name="getTelephonyProvidersEdgesTimezones"></a>

# **getTelephonyProvidersEdgesTimezones**

> [TimeZoneEntityListing](TimeZoneEntityListing.md) getTelephonyProvidersEdgesTimezones(pageSize, pageNumber)

Get a list of Edge-compatible time zones

Wraps GET /api/v2/telephony/providers/edges/timezones

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageSize = 1000; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    TimeZoneEntityListing result = apiInstance.getTelephonyProvidersEdgesTimezones(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTimezones");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                        |
| -------------- | ----------- | ----------- | ---------------------------- |
| **pageSize**   | **Integer** | Page size   | [optional] [default to 1000] |
| **pageNumber** | **Integer** | Page number | [optional] [default to 1]    |

{: class="table-striped"}

### Return type

[**TimeZoneEntityListing**](TimeZoneEntityListing.md)

<a name="getTelephonyProvidersEdgesTrunk"></a>

# **getTelephonyProvidersEdgesTrunk**

> [Trunk](Trunk.md) getTelephonyProvidersEdgesTrunk(trunkId)

Get a Trunk by ID

Wraps GET /api/v2/telephony/providers/edges/trunks/{trunkId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkId = "trunkId_example"; // String | Trunk ID
try {
    Trunk result = apiInstance.getTelephonyProvidersEdgesTrunk(trunkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunk");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **trunkId** | **String** | Trunk ID    |

{: class="table-striped"}

### Return type

[**Trunk**](Trunk.md)

<a name="getTelephonyProvidersEdgesTrunkMetrics"></a>

# **getTelephonyProvidersEdgesTrunkMetrics**

> [TrunkMetrics](TrunkMetrics.md) getTelephonyProvidersEdgesTrunkMetrics(trunkId)

Get the trunk metrics.

Wraps GET /api/v2/telephony/providers/edges/trunks/{trunkId}/metrics

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkId = "trunkId_example"; // String | Trunk Id
try {
    TrunkMetrics result = apiInstance.getTelephonyProvidersEdgesTrunkMetrics(trunkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **trunkId** | **String** | Trunk Id    |

{: class="table-striped"}

### Return type

[**TrunkMetrics**](TrunkMetrics.md)

<a name="getTelephonyProvidersEdgesTrunkbasesetting"></a>

# **getTelephonyProvidersEdgesTrunkbasesetting**

> [TrunkBase](TrunkBase.md) getTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId, ignoreHidden)

Get a Trunk Base Settings object by ID

Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.

Wraps GET /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
Boolean ignoreHidden = true; // Boolean | Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only.
try {
    TrunkBase result = apiInstance.getTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId, ignoreHidden);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkbasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type        | Description                                                                                                     | Notes      |
| ----------------------- | ----------- | --------------------------------------------------------------------------------------------------------------- | ---------- |
| **trunkBaseSettingsId** | **String**  | Trunk Base ID                                                                                                   |
| **ignoreHidden**        | **Boolean** | Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. | [optional] |

{: class="table-striped"}

### Return type

[**TrunkBase**](TrunkBase.md)

<a name="getTelephonyProvidersEdgesTrunkbasesettings"></a>

# **getTelephonyProvidersEdgesTrunkbasesettings**

> [TrunkBaseEntityListing](TrunkBaseEntityListing.md) getTelephonyProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled, ignoreHidden, managed, expand, name)

Get Trunk Base Settings listing

Managed properties will not be returned unless the user is assigned the internal:trunk:edit permission.

Wraps GET /api/v2/telephony/providers/edges/trunkbasesettings

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
Boolean recordingEnabled = true; // Boolean | Filter trunks by recording enabled
Boolean ignoreHidden = true; // Boolean | Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only.
Boolean managed = true; // Boolean | Filter by managed
List<String> expand = Arrays.asList("expand_example"); // List<String> | Fields to expand in the response, comma-separated
String name = "name_example"; // String | Name of the TrunkBase to filter by
try {
    TrunkBaseEntityListing result = apiInstance.getTelephonyProvidersEdgesTrunkbasesettings(pageNumber, pageSize, sortBy, sortOrder, recordingEnabled, ignoreHidden, managed, expand, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkbasesettings");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type                                | Description                                                                                                     | Notes                                  |
| -------------------- | ----------------------------------- | --------------------------------------------------------------------------------------------------------------- | -------------------------------------- |
| **pageNumber**       | **Integer**                         | Page number                                                                                                     | [optional] [default to 1]              |
| **pageSize**         | **Integer**                         | Page size                                                                                                       | [optional] [default to 25]             |
| **sortBy**           | **String**                          | Value by which to sort                                                                                          | [optional] [default to name]           |
| **sortOrder**        | **String**                          | Sort order                                                                                                      | [optional] [default to ASC]            |
| **recordingEnabled** | **Boolean**                         | Filter trunks by recording enabled                                                                              | [optional]                             |
| **ignoreHidden**     | **Boolean**                         | Set this to true to not receive trunk properties that are meant to be hidden or for internal system usage only. | [optional]                             |
| **managed**          | **Boolean**                         | Filter by managed                                                                                               | [optional]                             |
| **expand**           | [**List&lt;String&gt;**](String.md) | Fields to expand in the response, comma-separated                                                               | [optional]<br />**Values**: properties |
| **name**             | **String**                          | Name of the TrunkBase to filter by                                                                              | [optional]                             |

{: class="table-striped"}

### Return type

[**TrunkBaseEntityListing**](TrunkBaseEntityListing.md)

<a name="getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases"></a>

# **getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases**

> [TrunkMetabaseEntityListing](TrunkMetabaseEntityListing.md) getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber)

Get a list of available makes and models to create a new Trunk Base Settings

Wraps GET /api/v2/telephony/providers/edges/trunkbasesettings/availablemetabases

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String type = "type_example"; // String |
Integer pageSize = 25; // Integer |
Integer pageNumber = 1; // Integer |
try {
    TrunkMetabaseEntityListing result = apiInstance.getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases(type, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkbasesettingsAvailablemetabases");
    e.printStackTrace();
}
```

### Parameters

| Name           | Type        | Description | Notes                                             |
| -------------- | ----------- | ----------- | ------------------------------------------------- |
| **type**       | **String**  |             | [optional]<br />**Values**: EXTERNAL, PHONE, EDGE |
| **pageSize**   | **Integer** |             | [optional] [default to 25]                        |
| **pageNumber** | **Integer** |             | [optional] [default to 1]                         |

{: class="table-striped"}

### Return type

[**TrunkMetabaseEntityListing**](TrunkMetabaseEntityListing.md)

<a name="getTelephonyProvidersEdgesTrunkbasesettingsTemplate"></a>

# **getTelephonyProvidersEdgesTrunkbasesettingsTemplate**

> [TrunkBase](TrunkBase.md) getTelephonyProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId)

Get a Trunk Base Settings instance template from a given make and model. This object can then be modified and saved as a new Trunk Base Settings instance

Wraps GET /api/v2/telephony/providers/edges/trunkbasesettings/template

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkMetabaseId = "trunkMetabaseId_example"; // String | The id of a metabase object upon which to base this Trunk Base Settings
try {
    TrunkBase result = apiInstance.getTelephonyProvidersEdgesTrunkbasesettingsTemplate(trunkMetabaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkbasesettingsTemplate");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type       | Description                                                             | Notes |
| ------------------- | ---------- | ----------------------------------------------------------------------- | ----- |
| **trunkMetabaseId** | **String** | The id of a metabase object upon which to base this Trunk Base Settings |

{: class="table-striped"}

### Return type

[**TrunkBase**](TrunkBase.md)

<a name="getTelephonyProvidersEdgesTrunks"></a>

# **getTelephonyProvidersEdgesTrunks**

> [TrunkEntityListing](TrunkEntityListing.md) getTelephonyProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType)

Get the list of available trunks.

Trunks are created by assigning trunk base settings to an Edge or Edge Group.

Wraps GET /api/v2/telephony/providers/edges/trunks

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
String sortBy = "name"; // String | Value by which to sort
String sortOrder = "ASC"; // String | Sort order
String edgeId = "edgeId_example"; // String | Filter by Edge Ids
String trunkBaseId = "trunkBaseId_example"; // String | Filter by Trunk Base Ids
String trunkType = "trunkType_example"; // String | Filter by a Trunk type
try {
    TrunkEntityListing result = apiInstance.getTelephonyProvidersEdgesTrunks(pageNumber, pageSize, sortBy, sortOrder, edgeId, trunkBaseId, trunkType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunks");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type        | Description              | Notes                                             |
| --------------- | ----------- | ------------------------ | ------------------------------------------------- |
| **pageNumber**  | **Integer** | Page number              | [optional] [default to 1]                         |
| **pageSize**    | **Integer** | Page size                | [optional] [default to 25]                        |
| **sortBy**      | **String**  | Value by which to sort   | [optional] [default to name]                      |
| **sortOrder**   | **String**  | Sort order               | [optional] [default to ASC]                       |
| **edgeId**      | **String**  | Filter by Edge Ids       | [optional]                                        |
| **trunkBaseId** | **String**  | Filter by Trunk Base Ids | [optional]                                        |
| **trunkType**   | **String**  | Filter by a Trunk type   | [optional]<br />**Values**: EXTERNAL, PHONE, EDGE |

{: class="table-striped"}

### Return type

[**TrunkEntityListing**](TrunkEntityListing.md)

<a name="getTelephonyProvidersEdgesTrunksMetrics"></a>

# **getTelephonyProvidersEdgesTrunksMetrics**

> [List&lt;TrunkMetrics&gt;](TrunkMetrics.md) getTelephonyProvidersEdgesTrunksMetrics(trunkIds)

Get the metrics for a list of trunks.

Wraps GET /api/v2/telephony/providers/edges/trunks/metrics

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkIds = "trunkIds_example"; // String | Comma separated list of Trunk Id's
try {
    List<TrunkMetrics> result = apiInstance.getTelephonyProvidersEdgesTrunksMetrics(trunkIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunksMetrics");
    e.printStackTrace();
}
```

### Parameters

| Name         | Type       | Description                            | Notes |
| ------------ | ---------- | -------------------------------------- | ----- |
| **trunkIds** | **String** | Comma separated list of Trunk Id&#39;s |

{: class="table-striped"}

### Return type

[**List&lt;TrunkMetrics&gt;**](TrunkMetrics.md)

<a name="getTelephonyProvidersEdgesTrunkswithrecording"></a>

# **getTelephonyProvidersEdgesTrunkswithrecording**

> [TrunkRecordingEnabledCount](TrunkRecordingEnabledCount.md) getTelephonyProvidersEdgesTrunkswithrecording(trunkType)

Get Counts of trunks that have recording disabled or enabled

Wraps GET /api/v2/telephony/providers/edges/trunkswithrecording

Requires ANY permissions:

- recording:retentionPolicy:view
- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkType = "trunkType_example"; // String | The type of this trunk base.
try {
    TrunkRecordingEnabledCount result = apiInstance.getTelephonyProvidersEdgesTrunkswithrecording(trunkType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#getTelephonyProvidersEdgesTrunkswithrecording");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                  | Notes                                             |
| ------------- | ---------- | ---------------------------- | ------------------------------------------------- |
| **trunkType** | **String** | The type of this trunk base. | [optional]<br />**Values**: EXTERNAL, PHONE, EDGE |

{: class="table-striped"}

### Return type

[**TrunkRecordingEnabledCount**](TrunkRecordingEnabledCount.md)

<a name="postTelephonyProvidersEdgeDiagnosticNslookup"></a>

# **postTelephonyProvidersEdgeDiagnosticNslookup**

> [EdgeNetworkDiagnostic](EdgeNetworkDiagnostic.md) postTelephonyProvidersEdgeDiagnosticNslookup(edgeId, body)

Nslookup request command to collect networking-related information from an Edge for a target IP or host.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/diagnostic/nslookup

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
EdgeNetworkDiagnosticRequest body = new EdgeNetworkDiagnosticRequest(); // EdgeNetworkDiagnosticRequest | request payload to get network diagnostic
try {
    EdgeNetworkDiagnostic result = apiInstance.postTelephonyProvidersEdgeDiagnosticNslookup(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeDiagnosticNslookup");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                | Description                               | Notes |
| ---------- | ------------------------------------------------------------------- | ----------------------------------------- | ----- |
| **edgeId** | **String**                                                          | Edge Id                                   |
| **body**   | [**EdgeNetworkDiagnosticRequest**](EdgeNetworkDiagnosticRequest.md) | request payload to get network diagnostic |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnostic**](EdgeNetworkDiagnostic.md)

<a name="postTelephonyProvidersEdgeDiagnosticPing"></a>

# **postTelephonyProvidersEdgeDiagnosticPing**

> [EdgeNetworkDiagnostic](EdgeNetworkDiagnostic.md) postTelephonyProvidersEdgeDiagnosticPing(edgeId, body)

Ping Request command to collect networking-related information from an Edge for a target IP or host.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/diagnostic/ping

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
EdgeNetworkDiagnosticRequest body = new EdgeNetworkDiagnosticRequest(); // EdgeNetworkDiagnosticRequest | request payload to get network diagnostic
try {
    EdgeNetworkDiagnostic result = apiInstance.postTelephonyProvidersEdgeDiagnosticPing(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeDiagnosticPing");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                | Description                               | Notes |
| ---------- | ------------------------------------------------------------------- | ----------------------------------------- | ----- |
| **edgeId** | **String**                                                          | Edge Id                                   |
| **body**   | [**EdgeNetworkDiagnosticRequest**](EdgeNetworkDiagnosticRequest.md) | request payload to get network diagnostic |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnostic**](EdgeNetworkDiagnostic.md)

<a name="postTelephonyProvidersEdgeDiagnosticRoute"></a>

# **postTelephonyProvidersEdgeDiagnosticRoute**

> [EdgeNetworkDiagnostic](EdgeNetworkDiagnostic.md) postTelephonyProvidersEdgeDiagnosticRoute(edgeId, body)

Route request command to collect networking-related information from an Edge for a target IP or host.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/diagnostic/route

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
EdgeNetworkDiagnosticRequest body = new EdgeNetworkDiagnosticRequest(); // EdgeNetworkDiagnosticRequest | request payload to get network diagnostic
try {
    EdgeNetworkDiagnostic result = apiInstance.postTelephonyProvidersEdgeDiagnosticRoute(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeDiagnosticRoute");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                | Description                               | Notes |
| ---------- | ------------------------------------------------------------------- | ----------------------------------------- | ----- |
| **edgeId** | **String**                                                          | Edge Id                                   |
| **body**   | [**EdgeNetworkDiagnosticRequest**](EdgeNetworkDiagnosticRequest.md) | request payload to get network diagnostic |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnostic**](EdgeNetworkDiagnostic.md)

<a name="postTelephonyProvidersEdgeDiagnosticTracepath"></a>

# **postTelephonyProvidersEdgeDiagnosticTracepath**

> [EdgeNetworkDiagnostic](EdgeNetworkDiagnostic.md) postTelephonyProvidersEdgeDiagnosticTracepath(edgeId, body)

Tracepath request command to collect networking-related information from an Edge for a target IP or host.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/diagnostic/tracepath

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
EdgeNetworkDiagnosticRequest body = new EdgeNetworkDiagnosticRequest(); // EdgeNetworkDiagnosticRequest | request payload to get network diagnostic
try {
    EdgeNetworkDiagnostic result = apiInstance.postTelephonyProvidersEdgeDiagnosticTracepath(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeDiagnosticTracepath");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                                | Description                               | Notes |
| ---------- | ------------------------------------------------------------------- | ----------------------------------------- | ----- |
| **edgeId** | **String**                                                          | Edge Id                                   |
| **body**   | [**EdgeNetworkDiagnosticRequest**](EdgeNetworkDiagnosticRequest.md) | request payload to get network diagnostic |

{: class="table-striped"}

### Return type

[**EdgeNetworkDiagnostic**](EdgeNetworkDiagnostic.md)

<a name="postTelephonyProvidersEdgeLogicalinterfaces"></a>

# **postTelephonyProvidersEdgeLogicalinterfaces**

> [DomainLogicalInterface](DomainLogicalInterface.md) postTelephonyProvidersEdgeLogicalinterfaces(edgeId, body)

Create an edge logical interface.

Create

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
DomainLogicalInterface body = new DomainLogicalInterface(); // DomainLogicalInterface | Logical interface
try {
    DomainLogicalInterface result = apiInstance.postTelephonyProvidersEdgeLogicalinterfaces(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeLogicalinterfaces");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                    | Description       | Notes |
| ---------- | ------------------------------------------------------- | ----------------- | ----- |
| **edgeId** | **String**                                              | Edge ID           |
| **body**   | [**DomainLogicalInterface**](DomainLogicalInterface.md) | Logical interface |

{: class="table-striped"}

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

<a name="postTelephonyProvidersEdgeLogsJobUpload"></a>

# **postTelephonyProvidersEdgeLogsJobUpload**

> Void postTelephonyProvidersEdgeLogsJobUpload(edgeId, jobId, body)

Request that the specified fileIds be uploaded from the Edge.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/logs/jobs/{jobId}/upload

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String jobId = "jobId_example"; // String | Job ID
EdgeLogsJobUploadRequest body = new EdgeLogsJobUploadRequest(); // EdgeLogsJobUploadRequest | Log upload request
try {
    apiInstance.postTelephonyProvidersEdgeLogsJobUpload(edgeId, jobId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeLogsJobUpload");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                        | Description        | Notes |
| ---------- | ----------------------------------------------------------- | ------------------ | ----- |
| **edgeId** | **String**                                                  | Edge ID            |
| **jobId**  | **String**                                                  | Job ID             |
| **body**   | [**EdgeLogsJobUploadRequest**](EdgeLogsJobUploadRequest.md) | Log upload request |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postTelephonyProvidersEdgeLogsJobs"></a>

# **postTelephonyProvidersEdgeLogsJobs**

> [EdgeLogsJobResponse](EdgeLogsJobResponse.md) postTelephonyProvidersEdgeLogsJobs(edgeId, body)

Create a job to upload a list of Edge logs.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/logs/jobs

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
EdgeLogsJobRequest body = new EdgeLogsJobRequest(); // EdgeLogsJobRequest | EdgeLogsJobRequest
try {
    EdgeLogsJobResponse result = apiInstance.postTelephonyProvidersEdgeLogsJobs(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeLogsJobs");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                            | Description        | Notes |
| ---------- | ----------------------------------------------- | ------------------ | ----- |
| **edgeId** | **String**                                      | Edge ID            |
| **body**   | [**EdgeLogsJobRequest**](EdgeLogsJobRequest.md) | EdgeLogsJobRequest |

{: class="table-striped"}

### Return type

[**EdgeLogsJobResponse**](EdgeLogsJobResponse.md)

<a name="postTelephonyProvidersEdgeReboot"></a>

# **postTelephonyProvidersEdgeReboot**

> String postTelephonyProvidersEdgeReboot(edgeId, body)

Reboot an Edge

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/reboot

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
EdgeRebootParameters body = new EdgeRebootParameters(); // EdgeRebootParameters | Parameters for the edge reboot
try {
    String result = apiInstance.postTelephonyProvidersEdgeReboot(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeReboot");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                | Description                    | Notes      |
| ---------- | --------------------------------------------------- | ------------------------------ | ---------- |
| **edgeId** | **String**                                          | Edge ID                        |
| **body**   | [**EdgeRebootParameters**](EdgeRebootParameters.md) | Parameters for the edge reboot | [optional] |

{: class="table-striped"}

### Return type

**String**

<a name="postTelephonyProvidersEdgeSoftwareupdate"></a>

# **postTelephonyProvidersEdgeSoftwareupdate**

> [DomainEdgeSoftwareUpdateDto](DomainEdgeSoftwareUpdateDto.md) postTelephonyProvidersEdgeSoftwareupdate(edgeId, body)

Starts a software update for this edge.

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/softwareupdate

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
DomainEdgeSoftwareUpdateDto body = new DomainEdgeSoftwareUpdateDto(); // DomainEdgeSoftwareUpdateDto | Software update request
try {
    DomainEdgeSoftwareUpdateDto result = apiInstance.postTelephonyProvidersEdgeSoftwareupdate(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeSoftwareupdate");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                              | Description             | Notes |
| ---------- | ----------------------------------------------------------------- | ----------------------- | ----- |
| **edgeId** | **String**                                                        | Edge ID                 |
| **body**   | [**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md) | Software update request |

{: class="table-striped"}

### Return type

[**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.md)

<a name="postTelephonyProvidersEdgeStatuscode"></a>

# **postTelephonyProvidersEdgeStatuscode**

> String postTelephonyProvidersEdgeStatuscode(edgeId, body)

Take an Edge in or out of service

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/statuscode

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
EdgeServiceStateRequest body = new EdgeServiceStateRequest(); // EdgeServiceStateRequest | Edge Service State
try {
    String result = apiInstance.postTelephonyProvidersEdgeStatuscode(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeStatuscode");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                                      | Description        | Notes      |
| ---------- | --------------------------------------------------------- | ------------------ | ---------- |
| **edgeId** | **String**                                                | Edge ID            |
| **body**   | [**EdgeServiceStateRequest**](EdgeServiceStateRequest.md) | Edge Service State | [optional] |

{: class="table-striped"}

### Return type

**String**

<a name="postTelephonyProvidersEdgeUnpair"></a>

# **postTelephonyProvidersEdgeUnpair**

> String postTelephonyProvidersEdgeUnpair(edgeId)

Unpair an Edge

Wraps POST /api/v2/telephony/providers/edges/{edgeId}/unpair

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge Id
try {
    String result = apiInstance.postTelephonyProvidersEdgeUnpair(edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgeUnpair");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **edgeId** | **String** | Edge Id     |

{: class="table-striped"}

### Return type

**String**

<a name="postTelephonyProvidersEdges"></a>

# **postTelephonyProvidersEdges**

> [Edge](Edge.md) postTelephonyProvidersEdges(body)

Create an edge.

Wraps POST /api/v2/telephony/providers/edges

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Edge body = new Edge(); // Edge | Edge
try {
    Edge result = apiInstance.postTelephonyProvidersEdges(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdges");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                | Description | Notes |
| -------- | ------------------- | ----------- | ----- |
| **body** | [**Edge**](Edge.md) | Edge        |

{: class="table-striped"}

### Return type

[**Edge**](Edge.md)

<a name="postTelephonyProvidersEdgesAddressvalidation"></a>

# **postTelephonyProvidersEdgesAddressvalidation**

> [ValidateAddressResponse](ValidateAddressResponse.md) postTelephonyProvidersEdgesAddressvalidation(body)

Validates a street address

Wraps POST /api/v2/telephony/providers/edges/addressvalidation

Requires NO permissions:

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
ValidateAddressRequest body = new ValidateAddressRequest(); // ValidateAddressRequest | Address
try {
    ValidateAddressResponse result = apiInstance.postTelephonyProvidersEdgesAddressvalidation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesAddressvalidation");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                    | Description | Notes |
| -------- | ------------------------------------------------------- | ----------- | ----- |
| **body** | [**ValidateAddressRequest**](ValidateAddressRequest.md) | Address     |

{: class="table-striped"}

### Return type

[**ValidateAddressResponse**](ValidateAddressResponse.md)

<a name="postTelephonyProvidersEdgesCertificateauthorities"></a>

# **postTelephonyProvidersEdgesCertificateauthorities**

> [DomainCertificateAuthority](DomainCertificateAuthority.md) postTelephonyProvidersEdgesCertificateauthorities(body)

Create a certificate authority.

Wraps POST /api/v2/telephony/providers/edges/certificateauthorities

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
DomainCertificateAuthority body = new DomainCertificateAuthority(); // DomainCertificateAuthority | CertificateAuthority
try {
    DomainCertificateAuthority result = apiInstance.postTelephonyProvidersEdgesCertificateauthorities(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesCertificateauthorities");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                                            | Description          | Notes |
| -------- | --------------------------------------------------------------- | -------------------- | ----- |
| **body** | [**DomainCertificateAuthority**](DomainCertificateAuthority.md) | CertificateAuthority |

{: class="table-striped"}

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

<a name="postTelephonyProvidersEdgesDidpools"></a>

# **postTelephonyProvidersEdgesDidpools**

> [DIDPool](DIDPool.md) postTelephonyProvidersEdgesDidpools(body)

Create a new DID pool

Wraps POST /api/v2/telephony/providers/edges/didpools

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
DIDPool body = new DIDPool(); // DIDPool | DID pool
try {
    DIDPool result = apiInstance.postTelephonyProvidersEdgesDidpools(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesDidpools");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                      | Description | Notes |
| -------- | ------------------------- | ----------- | ----- |
| **body** | [**DIDPool**](DIDPool.md) | DID pool    |

{: class="table-striped"}

### Return type

[**DIDPool**](DIDPool.md)

<a name="postTelephonyProvidersEdgesEdgegroups"></a>

# **postTelephonyProvidersEdgesEdgegroups**

> [EdgeGroup](EdgeGroup.md) postTelephonyProvidersEdgesEdgegroups(body)

Create an edge group.

Wraps POST /api/v2/telephony/providers/edges/edgegroups

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
EdgeGroup body = new EdgeGroup(); // EdgeGroup | EdgeGroup
try {
    EdgeGroup result = apiInstance.postTelephonyProvidersEdgesEdgegroups(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesEdgegroups");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description | Notes |
| -------- | ----------------------------- | ----------- | ----- |
| **body** | [**EdgeGroup**](EdgeGroup.md) | EdgeGroup   |

{: class="table-striped"}

### Return type

[**EdgeGroup**](EdgeGroup.md)

<a name="postTelephonyProvidersEdgesExtensionpools"></a>

# **postTelephonyProvidersEdgesExtensionpools**

> [ExtensionPool](ExtensionPool.md) postTelephonyProvidersEdgesExtensionpools(body)

Create a new extension pool

Wraps POST /api/v2/telephony/providers/edges/extensionpools

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
ExtensionPool body = new ExtensionPool(); // ExtensionPool | ExtensionPool
try {
    ExtensionPool result = apiInstance.postTelephonyProvidersEdgesExtensionpools(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesExtensionpools");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description   | Notes |
| -------- | ------------------------------------- | ------------- | ----- |
| **body** | [**ExtensionPool**](ExtensionPool.md) | ExtensionPool |

{: class="table-striped"}

### Return type

[**ExtensionPool**](ExtensionPool.md)

<a name="postTelephonyProvidersEdgesOutboundroutes"></a>

# **postTelephonyProvidersEdgesOutboundroutes**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OutboundRoute](OutboundRoute.md) postTelephonyProvidersEdgesOutboundroutes(body)

Create outbound rule

This route is deprecated, use /telephony/providers/edges/sites/{siteId}/outboundroutes instead.

Wraps POST /api/v2/telephony/providers/edges/outboundroutes

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
OutboundRoute body = new OutboundRoute(); // OutboundRoute | OutboundRoute
try {
    OutboundRoute result = apiInstance.postTelephonyProvidersEdgesOutboundroutes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                  | Description   | Notes |
| -------- | ------------------------------------- | ------------- | ----- |
| **body** | [**OutboundRoute**](OutboundRoute.md) | OutboundRoute |

{: class="table-striped"}

### Return type

[**OutboundRoute**](OutboundRoute.md)

<a name="postTelephonyProvidersEdgesPhoneReboot"></a>

# **postTelephonyProvidersEdgesPhoneReboot**

> Void postTelephonyProvidersEdgesPhoneReboot(phoneId)

Reboot a Phone

Wraps POST /api/v2/telephony/providers/edges/phones/{phoneId}/reboot

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone Id
try {
    apiInstance.postTelephonyProvidersEdgesPhoneReboot(phoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesPhoneReboot");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **phoneId** | **String** | Phone Id    |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postTelephonyProvidersEdgesPhonebasesettings"></a>

# **postTelephonyProvidersEdgesPhonebasesettings**

> [PhoneBase](PhoneBase.md) postTelephonyProvidersEdgesPhonebasesettings(body)

Create a new Phone Base Settings object

Wraps POST /api/v2/telephony/providers/edges/phonebasesettings

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
PhoneBase body = new PhoneBase(); // PhoneBase | Phone base settings
try {
    PhoneBase result = apiInstance.postTelephonyProvidersEdgesPhonebasesettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesPhonebasesettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description         | Notes |
| -------- | ----------------------------- | ------------------- | ----- |
| **body** | [**PhoneBase**](PhoneBase.md) | Phone base settings |

{: class="table-striped"}

### Return type

[**PhoneBase**](PhoneBase.md)

<a name="postTelephonyProvidersEdgesPhones"></a>

# **postTelephonyProvidersEdgesPhones**

> [Phone](Phone.md) postTelephonyProvidersEdgesPhones(body)

Create a new Phone

Wraps POST /api/v2/telephony/providers/edges/phones

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Phone body = new Phone(); // Phone | Phone
try {
    Phone result = apiInstance.postTelephonyProvidersEdgesPhones(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesPhones");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                  | Description | Notes |
| -------- | --------------------- | ----------- | ----- |
| **body** | [**Phone**](Phone.md) | Phone       |

{: class="table-striped"}

### Return type

[**Phone**](Phone.md)

<a name="postTelephonyProvidersEdgesPhonesReboot"></a>

# **postTelephonyProvidersEdgesPhonesReboot**

> Void postTelephonyProvidersEdgesPhonesReboot(body)

Reboot Multiple Phones

Wraps POST /api/v2/telephony/providers/edges/phones/reboot

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
PhonesReboot body = new PhonesReboot(); // PhonesReboot | Phones
try {
    apiInstance.postTelephonyProvidersEdgesPhonesReboot(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesPhonesReboot");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                                | Description | Notes |
| -------- | ----------------------------------- | ----------- | ----- |
| **body** | [**PhonesReboot**](PhonesReboot.md) | Phones      |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postTelephonyProvidersEdgesSiteOutboundroutes"></a>

# **postTelephonyProvidersEdgesSiteOutboundroutes**

> [OutboundRouteBase](OutboundRouteBase.md) postTelephonyProvidersEdgesSiteOutboundroutes(siteId, body)

Create outbound route

Wraps POST /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
OutboundRouteBase body = new OutboundRouteBase(); // OutboundRouteBase | OutboundRoute
try {
    OutboundRouteBase result = apiInstance.postTelephonyProvidersEdgesSiteOutboundroutes(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesSiteOutboundroutes");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                          | Description   | Notes |
| ---------- | --------------------------------------------- | ------------- | ----- |
| **siteId** | **String**                                    | Site ID       |
| **body**   | [**OutboundRouteBase**](OutboundRouteBase.md) | OutboundRoute |

{: class="table-striped"}

### Return type

[**OutboundRouteBase**](OutboundRouteBase.md)

<a name="postTelephonyProvidersEdgesSiteRebalance"></a>

# **postTelephonyProvidersEdgesSiteRebalance**

> Void postTelephonyProvidersEdgesSiteRebalance(siteId)

Triggers the rebalance operation.

Wraps POST /api/v2/telephony/providers/edges/sites/{siteId}/rebalance

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
try {
    apiInstance.postTelephonyProvidersEdgesSiteRebalance(siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesSiteRebalance");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type       | Description | Notes |
| ---------- | ---------- | ----------- | ----- |
| **siteId** | **String** | Site ID     |

{: class="table-striped"}

### Return type

null (empty response body)

<a name="postTelephonyProvidersEdgesSites"></a>

# **postTelephonyProvidersEdgesSites**

> [Site](Site.md) postTelephonyProvidersEdgesSites(body)

Create a Site.

Wraps POST /api/v2/telephony/providers/edges/sites

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
Site body = new Site(); // Site | Site
try {
    Site result = apiInstance.postTelephonyProvidersEdgesSites(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesSites");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                | Description | Notes |
| -------- | ------------------- | ----------- | ----- |
| **body** | [**Site**](Site.md) | Site        |

{: class="table-striped"}

### Return type

[**Site**](Site.md)

<a name="postTelephonyProvidersEdgesTrunkbasesettings"></a>

# **postTelephonyProvidersEdgesTrunkbasesettings**

> [TrunkBase](TrunkBase.md) postTelephonyProvidersEdgesTrunkbasesettings(body)

Create a Trunk Base Settings object

Wraps POST /api/v2/telephony/providers/edges/trunkbasesettings

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
TrunkBase body = new TrunkBase(); // TrunkBase | Trunk base settings
try {
    TrunkBase result = apiInstance.postTelephonyProvidersEdgesTrunkbasesettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#postTelephonyProvidersEdgesTrunkbasesettings");
    e.printStackTrace();
}
```

### Parameters

| Name     | Type                          | Description         | Notes |
| -------- | ----------------------------- | ------------------- | ----- |
| **body** | [**TrunkBase**](TrunkBase.md) | Trunk base settings |

{: class="table-striped"}

### Return type

[**TrunkBase**](TrunkBase.md)

<a name="putTelephonyProvidersEdge"></a>

# **putTelephonyProvidersEdge**

> [Edge](Edge.md) putTelephonyProvidersEdge(edgeId, body)

Update a edge.

Wraps PUT /api/v2/telephony/providers/edges/{edgeId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
Edge body = new Edge(); // Edge | Edge
try {
    Edge result = apiInstance.putTelephonyProvidersEdge(edgeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdge");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                | Description | Notes |
| ---------- | ------------------- | ----------- | ----- |
| **edgeId** | **String**          | Edge ID     |
| **body**   | [**Edge**](Edge.md) | Edge        |

{: class="table-striped"}

### Return type

[**Edge**](Edge.md)

<a name="putTelephonyProvidersEdgeLine"></a>

# **putTelephonyProvidersEdgeLine**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [EdgeLine](EdgeLine.md) putTelephonyProvidersEdgeLine(edgeId, lineId, body)

Update a line.

Wraps PUT /api/v2/telephony/providers/edges/{edgeId}/lines/{lineId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String lineId = "lineId_example"; // String | Line ID
EdgeLine body = new EdgeLine(); // EdgeLine | Line
try {
    EdgeLine result = apiInstance.putTelephonyProvidersEdgeLine(edgeId, lineId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgeLine");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                        | Description | Notes |
| ---------- | --------------------------- | ----------- | ----- |
| **edgeId** | **String**                  | Edge ID     |
| **lineId** | **String**                  | Line ID     |
| **body**   | [**EdgeLine**](EdgeLine.md) | Line        |

{: class="table-striped"}

### Return type

[**EdgeLine**](EdgeLine.md)

<a name="putTelephonyProvidersEdgeLogicalinterface"></a>

# **putTelephonyProvidersEdgeLogicalinterface**

> [DomainLogicalInterface](DomainLogicalInterface.md) putTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId, body)

Update an edge logical interface.

Wraps PUT /api/v2/telephony/providers/edges/{edgeId}/logicalinterfaces/{interfaceId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeId = "edgeId_example"; // String | Edge ID
String interfaceId = "interfaceId_example"; // String | Interface ID
DomainLogicalInterface body = new DomainLogicalInterface(); // DomainLogicalInterface | Logical interface
try {
    DomainLogicalInterface result = apiInstance.putTelephonyProvidersEdgeLogicalinterface(edgeId, interfaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgeLogicalinterface");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                                                    | Description       | Notes |
| --------------- | ------------------------------------------------------- | ----------------- | ----- |
| **edgeId**      | **String**                                              | Edge ID           |
| **interfaceId** | **String**                                              | Interface ID      |
| **body**        | [**DomainLogicalInterface**](DomainLogicalInterface.md) | Logical interface |

{: class="table-striped"}

### Return type

[**DomainLogicalInterface**](DomainLogicalInterface.md)

<a name="putTelephonyProvidersEdgesCertificateauthority"></a>

# **putTelephonyProvidersEdgesCertificateauthority**

> [DomainCertificateAuthority](DomainCertificateAuthority.md) putTelephonyProvidersEdgesCertificateauthority(certificateId, body)

Update a certificate authority.

Wraps PUT /api/v2/telephony/providers/edges/certificateauthorities/{certificateId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String certificateId = "certificateId_example"; // String | Certificate ID
DomainCertificateAuthority body = new DomainCertificateAuthority(); // DomainCertificateAuthority | Certificate authority
try {
    DomainCertificateAuthority result = apiInstance.putTelephonyProvidersEdgesCertificateauthority(certificateId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesCertificateauthority");
    e.printStackTrace();
}
```

### Parameters

| Name              | Type                                                            | Description           | Notes |
| ----------------- | --------------------------------------------------------------- | --------------------- | ----- |
| **certificateId** | **String**                                                      | Certificate ID        |
| **body**          | [**DomainCertificateAuthority**](DomainCertificateAuthority.md) | Certificate authority |

{: class="table-striped"}

### Return type

[**DomainCertificateAuthority**](DomainCertificateAuthority.md)

<a name="putTelephonyProvidersEdgesDid"></a>

# **putTelephonyProvidersEdgesDid**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [DID](DID.md) putTelephonyProvidersEdgesDid(didId, body)

Update a DID by ID.

Wraps PUT /api/v2/telephony/providers/edges/dids/{didId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didId = "didId_example"; // String | DID ID
DID body = new DID(); // DID | DID
try {
    DID result = apiInstance.putTelephonyProvidersEdgesDid(didId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesDid");
    e.printStackTrace();
}
```

### Parameters

| Name      | Type              | Description | Notes |
| --------- | ----------------- | ----------- | ----- |
| **didId** | **String**        | DID ID      |
| **body**  | [**DID**](DID.md) | DID         |

{: class="table-striped"}

### Return type

[**DID**](DID.md)

<a name="putTelephonyProvidersEdgesDidpool"></a>

# **putTelephonyProvidersEdgesDidpool**

> [DIDPool](DIDPool.md) putTelephonyProvidersEdgesDidpool(didPoolId, body)

Update a DID Pool by ID.

Wraps PUT /api/v2/telephony/providers/edges/didpools/{didPoolId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String didPoolId = "didPoolId_example"; // String | DID pool ID
DIDPool body = new DIDPool(); // DIDPool | DID pool
try {
    DIDPool result = apiInstance.putTelephonyProvidersEdgesDidpool(didPoolId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesDidpool");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type                      | Description | Notes |
| ------------- | ------------------------- | ----------- | ----- |
| **didPoolId** | **String**                | DID pool ID |
| **body**      | [**DIDPool**](DIDPool.md) | DID pool    |

{: class="table-striped"}

### Return type

[**DIDPool**](DIDPool.md)

<a name="putTelephonyProvidersEdgesEdgegroup"></a>

# **putTelephonyProvidersEdgesEdgegroup**

> [EdgeGroup](EdgeGroup.md) putTelephonyProvidersEdgesEdgegroup(edgeGroupId, body)

Update an edge group.

Wraps PUT /api/v2/telephony/providers/edges/edgegroups/{edgeGroupId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgeGroupId = "edgeGroupId_example"; // String | Edge group ID
EdgeGroup body = new EdgeGroup(); // EdgeGroup | EdgeGroup
try {
    EdgeGroup result = apiInstance.putTelephonyProvidersEdgesEdgegroup(edgeGroupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesEdgegroup");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                          | Description   | Notes |
| --------------- | ----------------------------- | ------------- | ----- |
| **edgeGroupId** | **String**                    | Edge group ID |
| **body**        | [**EdgeGroup**](EdgeGroup.md) | EdgeGroup     |

{: class="table-striped"}

### Return type

[**EdgeGroup**](EdgeGroup.md)

<a name="putTelephonyProvidersEdgesEdgegroupEdgetrunkbase"></a>

# **putTelephonyProvidersEdgesEdgegroupEdgetrunkbase**

> [EdgeTrunkBase](EdgeTrunkBase.md) putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(edgegroupId, edgetrunkbaseId, body)

Update the edge trunk base associated with the edge group

Wraps PUT /api/v2/telephony/providers/edges/edgegroups/{edgegroupId}/edgetrunkbases/{edgetrunkbaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String edgegroupId = "edgegroupId_example"; // String | Edge Group ID
String edgetrunkbaseId = "edgetrunkbaseId_example"; // String | Edge Trunk Base ID
EdgeTrunkBase body = new EdgeTrunkBase(); // EdgeTrunkBase | EdgeTrunkBase
try {
    EdgeTrunkBase result = apiInstance.putTelephonyProvidersEdgesEdgegroupEdgetrunkbase(edgegroupId, edgetrunkbaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesEdgegroupEdgetrunkbase");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                  | Description        | Notes |
| ------------------- | ------------------------------------- | ------------------ | ----- |
| **edgegroupId**     | **String**                            | Edge Group ID      |
| **edgetrunkbaseId** | **String**                            | Edge Trunk Base ID |
| **body**            | [**EdgeTrunkBase**](EdgeTrunkBase.md) | EdgeTrunkBase      |

{: class="table-striped"}

### Return type

[**EdgeTrunkBase**](EdgeTrunkBase.md)

<a name="putTelephonyProvidersEdgesExtension"></a>

# **putTelephonyProvidersEdgesExtension**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [Extension](Extension.md) putTelephonyProvidersEdgesExtension(extensionId, body)

Update an extension by ID.

Wraps PUT /api/v2/telephony/providers/edges/extensions/{extensionId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionId = "extensionId_example"; // String | Extension ID
Extension body = new Extension(); // Extension | Extension
try {
    Extension result = apiInstance.putTelephonyProvidersEdgesExtension(extensionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesExtension");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                          | Description  | Notes |
| --------------- | ----------------------------- | ------------ | ----- |
| **extensionId** | **String**                    | Extension ID |
| **body**        | [**Extension**](Extension.md) | Extension    |

{: class="table-striped"}

### Return type

[**Extension**](Extension.md)

<a name="putTelephonyProvidersEdgesExtensionpool"></a>

# **putTelephonyProvidersEdgesExtensionpool**

> [ExtensionPool](ExtensionPool.md) putTelephonyProvidersEdgesExtensionpool(extensionPoolId, body)

Update an extension pool by ID

Wraps PUT /api/v2/telephony/providers/edges/extensionpools/{extensionPoolId}

Requires ALL permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String extensionPoolId = "extensionPoolId_example"; // String | Extension pool ID
ExtensionPool body = new ExtensionPool(); // ExtensionPool | ExtensionPool
try {
    ExtensionPool result = apiInstance.putTelephonyProvidersEdgesExtensionpool(extensionPoolId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesExtensionpool");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                  | Description       | Notes |
| ------------------- | ------------------------------------- | ----------------- | ----- |
| **extensionPoolId** | **String**                            | Extension pool ID |
| **body**            | [**ExtensionPool**](ExtensionPool.md) | ExtensionPool     |

{: class="table-striped"}

### Return type

[**ExtensionPool**](ExtensionPool.md)

<a name="putTelephonyProvidersEdgesOutboundroute"></a>

# **putTelephonyProvidersEdgesOutboundroute**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [OutboundRoute](OutboundRoute.md) putTelephonyProvidersEdgesOutboundroute(outboundRouteId, body)

Update outbound route

This route is deprecated, use /telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId} instead.

Wraps PUT /api/v2/telephony/providers/edges/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
OutboundRoute body = new OutboundRoute(); // OutboundRoute | OutboundRoute
try {
    OutboundRoute result = apiInstance.putTelephonyProvidersEdgesOutboundroute(outboundRouteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                  | Description       | Notes |
| ------------------- | ------------------------------------- | ----------------- | ----- |
| **outboundRouteId** | **String**                            | Outbound route ID |
| **body**            | [**OutboundRoute**](OutboundRoute.md) | OutboundRoute     |

{: class="table-striped"}

### Return type

[**OutboundRoute**](OutboundRoute.md)

<a name="putTelephonyProvidersEdgesPhone"></a>

# **putTelephonyProvidersEdgesPhone**

> [Phone](Phone.md) putTelephonyProvidersEdgesPhone(phoneId, body)

Update a Phone by ID

Wraps PUT /api/v2/telephony/providers/edges/phones/{phoneId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneId = "phoneId_example"; // String | Phone ID
Phone body = new Phone(); // Phone | Phone
try {
    Phone result = apiInstance.putTelephonyProvidersEdgesPhone(phoneId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesPhone");
    e.printStackTrace();
}
```

### Parameters

| Name        | Type                  | Description | Notes |
| ----------- | --------------------- | ----------- | ----- |
| **phoneId** | **String**            | Phone ID    |
| **body**    | [**Phone**](Phone.md) | Phone       |

{: class="table-striped"}

### Return type

[**Phone**](Phone.md)

<a name="putTelephonyProvidersEdgesPhonebasesetting"></a>

# **putTelephonyProvidersEdgesPhonebasesetting**

> [PhoneBase](PhoneBase.md) putTelephonyProvidersEdgesPhonebasesetting(phoneBaseId, body)

Update a Phone Base Settings by ID

Wraps PUT /api/v2/telephony/providers/edges/phonebasesettings/{phoneBaseId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String phoneBaseId = "phoneBaseId_example"; // String | Phone base ID
PhoneBase body = new PhoneBase(); // PhoneBase | Phone base settings
try {
    PhoneBase result = apiInstance.putTelephonyProvidersEdgesPhonebasesetting(phoneBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesPhonebasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type                          | Description         | Notes |
| --------------- | ----------------------------- | ------------------- | ----- |
| **phoneBaseId** | **String**                    | Phone base ID       |
| **body**        | [**PhoneBase**](PhoneBase.md) | Phone base settings |

{: class="table-striped"}

### Return type

[**PhoneBase**](PhoneBase.md)

<a name="putTelephonyProvidersEdgesSite"></a>

# **putTelephonyProvidersEdgesSite**

> [Site](Site.md) putTelephonyProvidersEdgesSite(siteId, body)

Update a Site by ID.

Wraps PUT /api/v2/telephony/providers/edges/sites/{siteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
Site body = new Site(); // Site | Site
try {
    Site result = apiInstance.putTelephonyProvidersEdgesSite(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesSite");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                | Description | Notes |
| ---------- | ------------------- | ----------- | ----- |
| **siteId** | **String**          | Site ID     |
| **body**   | [**Site**](Site.md) | Site        |

{: class="table-striped"}

### Return type

[**Site**](Site.md)

<a name="putTelephonyProvidersEdgesSiteNumberplans"></a>

# **putTelephonyProvidersEdgesSiteNumberplans**

> [List&lt;NumberPlan&gt;](NumberPlan.md) putTelephonyProvidersEdgesSiteNumberplans(siteId, body)

Update the list of Number Plans. A user can update maximum 200 number plans at a time.

Wraps PUT /api/v2/telephony/providers/edges/sites/{siteId}/numberplans

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
List<NumberPlan> body = Arrays.asList(new NumberPlan()); // List<NumberPlan> | List of number plans
try {
    List<NumberPlan> result = apiInstance.putTelephonyProvidersEdgesSiteNumberplans(siteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesSiteNumberplans");
    e.printStackTrace();
}
```

### Parameters

| Name       | Type                                        | Description          | Notes |
| ---------- | ------------------------------------------- | -------------------- | ----- |
| **siteId** | **String**                                  | Site ID              |
| **body**   | [**List&lt;NumberPlan&gt;**](NumberPlan.md) | List of number plans |

{: class="table-striped"}

### Return type

[**List&lt;NumberPlan&gt;**](NumberPlan.md)

<a name="putTelephonyProvidersEdgesSiteOutboundroute"></a>

# **putTelephonyProvidersEdgesSiteOutboundroute**

> [OutboundRouteBase](OutboundRouteBase.md) putTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId, body)

Update outbound route

Wraps PUT /api/v2/telephony/providers/edges/sites/{siteId}/outboundroutes/{outboundRouteId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String siteId = "siteId_example"; // String | Site ID
String outboundRouteId = "outboundRouteId_example"; // String | Outbound route ID
OutboundRouteBase body = new OutboundRouteBase(); // OutboundRouteBase | OutboundRoute
try {
    OutboundRouteBase result = apiInstance.putTelephonyProvidersEdgesSiteOutboundroute(siteId, outboundRouteId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesSiteOutboundroute");
    e.printStackTrace();
}
```

### Parameters

| Name                | Type                                          | Description       | Notes |
| ------------------- | --------------------------------------------- | ----------------- | ----- |
| **siteId**          | **String**                                    | Site ID           |
| **outboundRouteId** | **String**                                    | Outbound route ID |
| **body**            | [**OutboundRouteBase**](OutboundRouteBase.md) | OutboundRoute     |

{: class="table-striped"}

### Return type

[**OutboundRouteBase**](OutboundRouteBase.md)

<a name="putTelephonyProvidersEdgesTrunkbasesetting"></a>

# **putTelephonyProvidersEdgesTrunkbasesetting**

> [TrunkBase](TrunkBase.md) putTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId, body)

Update a Trunk Base Settings object by ID

Wraps PUT /api/v2/telephony/providers/edges/trunkbasesettings/{trunkBaseSettingsId}

Requires ANY permissions:

- telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TelephonyProvidersEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TelephonyProvidersEdgeApi apiInstance = new TelephonyProvidersEdgeApi();
String trunkBaseSettingsId = "trunkBaseSettingsId_example"; // String | Trunk Base ID
TrunkBase body = new TrunkBase(); // TrunkBase | Trunk base settings
try {
    TrunkBase result = apiInstance.putTelephonyProvidersEdgesTrunkbasesetting(trunkBaseSettingsId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TelephonyProvidersEdgeApi#putTelephonyProvidersEdgesTrunkbasesetting");
    e.printStackTrace();
}
```

### Parameters

| Name                    | Type                          | Description         | Notes |
| ----------------------- | ----------------------------- | ------------------- | ----- |
| **trunkBaseSettingsId** | **String**                    | Trunk Base ID       |
| **body**                | [**TrunkBase**](TrunkBase.md) | Trunk base settings |

{: class="table-striped"}

### Return type

[**TrunkBase**](TrunkBase.md)
