import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Neigh!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, d.getMaxSpeed());
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
        assertEquals(100000, d.getPrice());
    }
<<<<<<< HEAD
aaaaaaaaaaa
=======

>>>>>>> c5d5a9f1bb0014a81adcb95b78128b1a7b3d405a
}