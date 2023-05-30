import java.util.ArrayList;
import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine{

    private LinkedList<Product> hotDrinks;

    public void putProduct(LinkedList<Product> item) {
        this.hotDrinks = item;
    }

    @Override
    public Product getProduct() {
        return hotDrinks.pollLast();
    }

    public ArrayList<Product> getProduct(String name, double volume, int temp) {
        ArrayList<Product> hdList = new ArrayList<>();
        for (Product hotDrink: hotDrinks){
            if (((HotDrink)(hotDrink)).getTemp() == temp &&
                    ((HotDrink)(hotDrink)).getVolume() == volume &&
                    hotDrink.name == name) {
                hdList.add(hotDrink);
            }
        }
        return hdList;
    }
}
