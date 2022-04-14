---
title: EdgeMetrics
---

## EdgeMetrics

## Properties

| Name           | Type                                                                                 | Description                                                                             | Notes      |
| -------------- | ------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------- | ---------- |
| **edge**       | <!----><!---->[**DomainEntityRef**](DomainEntityRef.md)<!---->                       |                                                                                         | [optional] |
| **eventTime**  | <!----><!---->[**Date**](Date.md)<!---->                                             | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z | [optional] |
| **upTimeMsec** | <!----><!---->**Long**<!---->                                                        |                                                                                         | [optional] |
| **processors** | <!----><!---->[**List&lt;EdgeMetricsProcessor&gt;**](EdgeMetricsProcessor.md)<!----> |                                                                                         | [optional] |
| **memory**     | <!----><!---->[**List&lt;EdgeMetricsMemory&gt;**](EdgeMetricsMemory.md)<!---->       |                                                                                         | [optional] |
| **disks**      | <!----><!---->[**List&lt;EdgeMetricsDisk&gt;**](EdgeMetricsDisk.md)<!---->           |                                                                                         | [optional] |
| **subsystems** | <!----><!---->[**List&lt;EdgeMetricsSubsystem&gt;**](EdgeMetricsSubsystem.md)<!----> |                                                                                         | [optional] |
| **networks**   | <!----><!---->[**List&lt;EdgeMetricsNetwork&gt;**](EdgeMetricsNetwork.md)<!---->     |                                                                                         | [optional] |

{: class="table table-striped"}
