# Kata for Java Generics

## Goal

Write a conversion class to change currencies, like at the foreign currency desk of an airport.  Avoid hard-coding any
particular currency class in the converter.

Remember: Your "exchange desk" will need to know exchange rates (try https://www.google.com/search?q=USD+to+INR for
example rates), but *not* look them up in real-time!

Assume the current dollar to rupee rate is today's market rate (ask Google, "dollar to rupee").

## Rules for success

* No type casting (exception for casting to a generic parameter, if required)
* I can still access specific methods of generic subtypes, example:
   ```java
   final Dollar dollar = genericThing<Dollar>.someMethod();
   System.out.println(dollar.cents());
   final Currency alsoDollar = genericThing<Dollar>.someMethod(); // Also compiles
   ```

## Extra credit

* Use `ServiceLoader` from the JDK to find and use supported currencies
