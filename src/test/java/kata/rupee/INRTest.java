package kata.rupee;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class INRTest {
    @Test
    public void shouldDisplay() {
        final int rupees = 55;
        assertThat(new INR(rupees).toString(), is("₹55"));
    }
}
