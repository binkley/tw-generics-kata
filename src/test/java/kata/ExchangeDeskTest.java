package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

public final class ExchangeDeskTest {
    private ExchangeDesk exchangeDesk;

    @BeforeEach
    public void setUp() throws Exception {
        exchangeDesk = new ExchangeDesk();
    }

    @Test
    public void firstTestReplaceMe() {
        assertThat(exchangeDesk, is(not(nullValue())));
    }
}
