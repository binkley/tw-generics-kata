package kata.dollar;

import kata.Currency;
import lombok.Data;

import static java.lang.String.format;

@Data
public final class Dollar implements Currency {
    public static final int CENTS_TO_DOLLAR = 100;
    private final long units;

    public long dollars() {
        return units / CENTS_TO_DOLLAR;
    }

    public int cents() {
        return (int) (units % CENTS_TO_DOLLAR);
    }

    @Override
    public String toString() {
        return format("$%d.%02d", dollars(), cents());
    }
}
