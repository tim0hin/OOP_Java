public class HotDrink extends Product {

    private int temp;   // температура
    private double volume; // объем

    public HotDrink(String name, int price, int temp, double volume){
        super.name = name;
        super.price = price;
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemp() {
        return this.temp;
    }

    public double getVolume() {
        return this.volume;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
    }

    @Override
    public String toString() {
        return "HotDrink {" + "name= " + name +
                ", price= " + price +
                ", temp= " + temp +
                ", volume=" + volume + "}";
    }
}
