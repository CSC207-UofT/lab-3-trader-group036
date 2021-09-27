public class drugdealer implements Domesticatable, Tradable {

    private int san_value;

    public drugdealer() {
        this.san_value = 1;
    }

    @Override
    public String sound() {
        return "OHHHHHHH im fking HHHHHHHHHigh";
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String toString(){
        String id = toString();
        return id + " (My sanity is freaking low as " + this.san_value +")";
    }
}
