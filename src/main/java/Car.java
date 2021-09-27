public class Car implements Tradable, Drivable{
    private int maxSpeed;
    private int price;
    private String name;

    public Car(String name){
        this.maxSpeed = 10;
        this.price = 100;
        this.name = name;
    }

    public String getName(){
        return super.toString() + ": " + name;
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public void upgradeSpeed(){
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed(){
        this.maxSpeed -= 10;
    }

    @Override
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String toString(){
        String id = super.toString();
        return name + ": " + id + "\n" +
                " (Max speed: " + this.maxSpeed +")" + " (Price: " + this.price +")";
    }
}
