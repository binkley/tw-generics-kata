package kata;

import kata.dollar.Dollar;
import kata.rupee.Rupee;

public interface Currency {
    static Currency getCurrency(final String symbol, final long units) {
        switch (symbol) {
            case Dollar.SYMBOL:
                return new Dollar(units);
            case Rupee.SYMBOL:
                return new Rupee(units);
            default:
                throw new IllegalArgumentException("Unsupported currency: " + symbol);
        }
    }
}
