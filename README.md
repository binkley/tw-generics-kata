# Kata for Java Generics

## Goal

Write a `ExchangeDesk` class to change currencies, like the foreign currency desk of an airport.  Avoid hard-coding
any particular currency class in the converter.

The currency conversion call should look like:

```java
final INR rupees = new INRs(1_000);
final USD dollar = exchangeDesk.convert(rupees, USD.class); 
```

Remember: Your "exchange desk" will need to know exchange rates (try https://www.google.com/search?q=USD+to+INR for
example rates), but *not* look them up in real-time&mdash;assume static rates for the kata:

```java
exchangeDesk.addRate(INR.class, USD.class, 0.016d);
```

## Rules for success

* Keep test coverage at 100%
* No type casting (exception for casting to a generic parameter, if required)
* Look up conversions with class tokens (e.g., `USD.class`)

## Extra credit

* Use `ServiceLoader` from the JDK to find and use supported currencies