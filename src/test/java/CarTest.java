import org.junit.*;

import static org.junit.Assert.*;


public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car("BMW");
    }

    @Test(timeout = 50)
    public void TestName() {
        assertEquals("BMW", c.getName());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(20, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, c.getPrice());
    }

}