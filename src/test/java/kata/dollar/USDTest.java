package kata.dollar;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class USDTest {
    @Test
    public void shouldDisplay() {
        final int cents = 105;
        assertThat(new USD(cents).toString(), is("$1.05"));
    }
}
