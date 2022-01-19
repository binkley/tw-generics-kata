package kata.rupee;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public final class INRTest {
    @Test
    public void shouldDisplay() {
        final int rupees = 55;

        assertThat(new INR(rupees).toString(), is("₹55"));
    }
}
