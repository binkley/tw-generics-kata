# Kata for Java Generics

## Goal

Write a conversion class to change currencies, like at the foreign currency desk at an airport.  Avoid hard-coding any
particular currency class in the converter.

Assume the current dollar to rupee rate is today's market rate (ask Google, "dollar to rupee").

## Rules for success

* No type casting (exception for casting to a generic parameter, if required)

## Extra credit

* Use `ServiceLoader` from the JDK to find and use supported currencies
