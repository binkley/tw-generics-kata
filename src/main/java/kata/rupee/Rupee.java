package kata.rupee;

import lombok.Data;

import static java.lang.String.format;

@Data
public final class Rupee {
    private final long units;

    public long rupees() {
        return units;
    }

    @Override
    public String toString() {
        return format("₹%d", rupees());
    }
}
