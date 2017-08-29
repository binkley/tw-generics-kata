package kata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class RupeeTest {
    @Test
    public void shouldDisplay() {
        assertThat(new Rupee(55).toString(), is("₹55"));
    }
}
