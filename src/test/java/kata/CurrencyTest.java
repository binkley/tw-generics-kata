package kata;

import kata.dollar.Dollar;
import kata.rupee.Rupee;
import org.junit.Test;

import static kata.Currency.getCurrency;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class CurrencyTest {
    @Test
    public void shouldGetDollar() {
        assertThat(getCurrency("USD", 1), is(new Dollar(1)));
    }

    @Test
    public void shouldGetRupee() {
        assertThat(getCurrency("RUP", 1), is(new Rupee(1)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldComplainAtUnsupportedSymbol() {
        getCurrency("???", 1);
    }
}
