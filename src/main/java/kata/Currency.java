package kata;

import kata.dollar.Dollar;
import kata.rupee.Rupee;

public interface Currency {
    static Currency getCurrency(final String symbol, final long units) {
        switch (symbol) {
            case "USD":
                return new Dollar(units);
            case "RUP":
                return new Rupee(units);
            default:
                throw new IllegalArgumentException("Unsupported currency: " + symbol);
        }
    }
}
