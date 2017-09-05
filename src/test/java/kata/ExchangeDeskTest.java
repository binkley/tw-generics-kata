package kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public final class ExchangeDeskTest {
    private ExchangeDesk exchangeDesk;

    @Before
    public void setUp() throws Exception {
        exchangeDesk = new ExchangeDesk();
    }

    @Test
    public void firstTestReplaceMe() {
        assertThat(exchangeDesk, is(not(nullValue())));
    }
}
