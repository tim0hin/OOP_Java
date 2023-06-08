package sem1;

public class HotDrink extends Product implements Comparable<HotDrink> {

    private double temp;   // температура
    private double volume; // объем

    public HotDrink(String name, int price, int temp, double volume){
        super.name = name;
        super.price = price;
        this.temp = temp;
        this.volume = volume;
    }

    public double getTemp() {
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
        return "sem1.HotDrink {" + "name= " + name +
                ", price= " + price +
                ", temp= " + temp +
                ", volume=" + volume + "}";
    }

    @Override
    public int compareTo(HotDrink o) {
        return this.getPrice() - o.getPrice();
    }
}
