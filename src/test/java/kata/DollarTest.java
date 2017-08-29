package kata;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public final class DollarTest {
    @Test
    public void shouldDisplay() {
        assertThat(new Dollar(105).toString(), is("$1.05"));
    }
}
