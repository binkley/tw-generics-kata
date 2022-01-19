package kata.dollar;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public final class USDTest {
    @Test
    public void shouldDisplay() {
        final int cents = 105;

        assertThat(new USD(cents).toString(), is("$1.05"));
    }
}
