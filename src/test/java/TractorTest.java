import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TractorTest {
    Tractor t;

    @Before
    public void setUp() throws Exception {
        s = new Tractor();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bomb!", t.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100000, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(100001, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(99999, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(9999999, t.getPrice());
    }
}
