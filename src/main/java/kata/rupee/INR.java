package kata.rupee;

import kata.Currency;
import lombok.Data;

import static java.lang.String.format;

@Data
public final class INR implements Currency {
    private final long units;

    public long rupees() {
        return units;
    }

    @Override
    public String toString() {
        return format("₹%d", rupees());
    }
}
