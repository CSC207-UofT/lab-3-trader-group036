import org.junit.*;

import static org.junit.Assert.assertEquals;

public class drugdealerTest {
    drugdealer h;

    @Before
    public void setUp() throws Exception {
        h = new drugdealer();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("OHHHHHHH im fking HHHHHHHHHigh", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, h.getPrice());
    }
}
