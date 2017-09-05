# Kata for Java Generics

Level: Intermediate  
Timebox: 1hr

This kata helps you be more comfortable with Java
[_generics_](https://docs.oracle.com/javase/tutorial/java/generics/index.html) beyond `List<String>`.  You will practice
writing generics classes and methods, and not just using them.  You will also practice
[_lambda expressions_](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html) and
[_method references_](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html).

## Goal

Write a `ExchangeDesk` class to change currencies, like the foreign currency desk of an airport.  Avoid hard-coding
any particular currency class in the converter.  Preserve currency types in the conversion.

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
* Keep clean code style
* No type casting (exception for casting to a generic parameter, if required)
* No use of reflection: use lambdas and/or method references

## Tips

* Fork the kata (https://github.com/binkley/tw-generics-kata) to your github account; work from there, pushing your
  local changes back to your fork
* Use the "ABC" pattern to your advantage: `git add . && ./gradlew test && git commit` (or amend)
* Commit every time the tests pass; save `./gradlew clean build` for pushing your commit

## Extra credit

* Refer to currencies by string ("INR", "USD") rather than class token (`INR.class`, `USD.class`)
* Use `ServiceLoader` from the JDK to find and use supported currencies.  You may find
  [META-INF/services generator](http://metainf-services.kohsuke.org/) helpful.
* Use `Locale` and `NumberFormat` from the JDK to format currencies.  This is not related to generics, but introduces
  you to more of the JDK.  You may find
  [Using Predefined Formats (The Java&trade; Tutorials &gt; Internationalization &gt; Formatting)](https://docs.oracle.com/javase/tutorial/i18n/format/numberFormat.html)
  helpful.  
