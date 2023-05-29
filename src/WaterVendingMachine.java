import java.util.LinkedList;

/**
 * WaterVendingMachine
 */
public class WaterVendingMachine implements VendingMachine{
    private LinkedList<Product> waters;

    public void putProduct(LinkedList<Product> item){
        this.waters = item;
    }

    public Product getProduct(){
        return waters.pollLast();
    }

    @Override
    public Product getProduct(String name, double volume, int temp){
        return null;
    }

}