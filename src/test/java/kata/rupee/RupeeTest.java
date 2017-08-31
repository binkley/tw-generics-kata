package kata.rupee;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class RupeeTest {
    @Test
    public void shouldDisplay() {
        final int rupees = 55;
        assertThat(new Rupee(rupees).toString(), is("₹55"));
    }
}
