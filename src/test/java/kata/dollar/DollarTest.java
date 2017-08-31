package kata.dollar;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class DollarTest {
    @Test
    public void shouldDisplay() {
        final int cents = 105;
        assertThat(new Dollar(cents).toString(), is("$1.05"));
    }
}
