---
title: UserAggregateQueryPredicate
---

## UserAggregateQueryPredicate

## Properties

| Name          | Type                                                     | Description                              | Notes      |
| ------------- | -------------------------------------------------------- | ---------------------------------------- | ---------- |
| **type**      | [**TypeEnum**](#TypeEnum)<!---->                         | Optional type, can usually be inferred   | [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!---->               | Left hand side for dimension predicates  | [optional] |
| **operator**  | [**OperatorEnum**](#OperatorEnum)<!---->                 | Optional operator, default is matches    | [optional] |
| **value**     | <!----><!---->**String**<!---->                          | Right hand side for dimension predicates | [optional] |
| **range**     | <!----><!---->[**NumericRange**](NumericRange.md)<!----> | Right hand side for dimension predicates | [optional] |

{: class="table table-striped"}

<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIMENSION          | &quot;dimension&quot;          |
| PROPERTY           | &quot;property&quot;           |
| METRIC             | &quot;metric&quot;             |

{: class="table table-striped"}

<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| USERID             | &quot;userId&quot;             |

{: class="table table-striped"}

<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name               | Value                          |
| ------------------ | ------------------------------ |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MATCHES            | &quot;matches&quot;            |
| EXISTS             | &quot;exists&quot;             |
| NOTEXISTS          | &quot;notExists&quot;          |

{: class="table table-striped"}
