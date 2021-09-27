public class Dragon implements Drivable, Domesticatable, Tradable{
    private String color;
    private int damage;
    private int maxSpeed;

    public Dragon(String color, int damage, int maxSpeed) {
        this.color = color;
        this.damage = damage;
        this.maxSpeed = 10000;
    }

    @Override
    public String sound() {
        return "HHHHHOOOOOO!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10000;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10000;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")" + "(Color:" + this.color + ")" + "(damage:" + this.damage + ")";
    }
    q
}
