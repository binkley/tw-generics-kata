package kata;

public interface Currency {
    static Currency getCurrency(final String symbol) {
        switch (symbol) {
            case "USD":
                return new DollarCurrency();
            case "RUP":
                return new RupeeCurrency();
            default:
                throw new IllegalArgumentException("Unsupported currency: " + symbol);
        }
    }
}
