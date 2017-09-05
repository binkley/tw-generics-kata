# Kata for Java Generics

## Goal

Write a `ExchangeDesk` class to change currencies, like the foreign currency desk of an airport.  Avoid hard-coding
any particular currency class in the converter.

The currency conversion call should look like:

```java
final INR rupees = new INR(1_000);
final USD dollar = exchangeDesk.convert(rupees, USD.class); 
```

Remember: Your "exchange desk" will need to know exchange rates (try
[INR to USD](https://www.google.com/search?q=INR+to+USD) for example rates), but *not* look them up in
real-time&mdash;assume static rates for the kata:

```java
exchangeDesk.addRate(INR.class, USD.class, 0.016d);
```

## Rules for success

* Keep test coverage at 100%
* No type casting (exception for casting to a generic parameter, if required)
* Look up conversions with class tokens (e.g., `USD.class`)
* No use of reflection: use lambdas and/or method references

## Extra credit

* Use `ServiceLoader` from the JDK to find and use supported currencies.  You may find
  [META-INF/services generator](http://metainf-services.kohsuke.org/) helpful.
* Use `Locale` and `NumberFormat` from the JDK to format currencies.  This is not related to generics, but introduces
  you to more of the JDK.  You may find
  [Using Predefined Formats (The Java&trade; Tutorials &gt; Internationalization &gt; Formatting)](https://docs.oracle.com/javase/tutorial/i18n/format/numberFormat.html)
  helpful.  
