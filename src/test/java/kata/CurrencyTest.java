package kata;

import org.junit.Test;

import static kata.Currency.getCurrency;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class CurrencyTest {
    @Test
    public void shouldGetDollar() {
        assertThat(getCurrency("USD"), is(instanceOf(DollarCurrency.class)));
    }

    @Test
    public void shouldGetRupee() {
        assertThat(getCurrency("RUP"), is(instanceOf(RupeeCurrency.class)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldComplainAtUnsupportedSymbol() {
        getCurrency("???");
    }
}
