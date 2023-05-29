import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine{

    private LinkedList<Product> hotDrinks;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrinks = item;
    }

    @Override
    public Product getProduct() {
        return hotDrinks.pollLast();
    }

    @Override
    public Product getProduct(String name, double volume, int temp) {
        for (Product hotDrink:hotDrinks) {
            if (hotDrink.name.equals(name)){
                return hotDrink;
            }
        }
        return null;
    }
}
