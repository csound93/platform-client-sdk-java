---
title: UploadUrlRequest
---
## UploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | <!----><!---->**String**<!----> | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\&quot;&gt;[~&lt;#| |  [optional] |
| **contentMd5** | <!----><!---->**String**<!----> | Content MD-5 of the file to upload |  [optional] |
| **signedUrlTimeoutSeconds** | <!----><!---->**Integer**<!----> | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **serverSideEncryption** | [**ServerSideEncryptionEnum**](#ServerSideEncryptionEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ServerSideEncryptionEnum"></a>

## Enum: ServerSideEncryptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AES256 | &quot;AES256&quot; |
{: class="table table-striped"}



