---
title: OpenMessageContent
---

## OpenMessageContent

## Properties

| Name            | Type                                                               | Description                                                                                       | Notes      |
| --------------- | ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------- | ---------- |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!---->                     | Type of this content element. If contentType = \&quot;Attachment\&quot; only one item is allowed. |            |
| **attachment**  | <!----><!---->[**ContentAttachment**](ContentAttachment.md)<!----> | Attachment content.                                                                               | [optional] |

{: class="table table-striped"}

<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ATTACHMENT         | &quot;Attachment&quot;         |

{: class="table table-striped"}
