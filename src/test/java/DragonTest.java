import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon("Red", 999, 9999);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("HHHHHOOOOOO!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10000, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(20000, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(0, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000000, d.getPrice());
    }

}