public class Tractor implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;

    public Tractor() {
        this.maxSpeed = 100000;
    }

    @Override
    public int getPrice() {
        return 9999999;
    }

    @Override
    public String sound() {
        return "Bomb!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
