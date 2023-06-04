package sem1;

import java.util.LinkedList;

/**
 * sem1.WaterVendingMachine
 */
public class WaterVendingMachine implements VendingMachine{
    private LinkedList<Product> waters;

    public void putProduct(LinkedList<Product> item){
        this.waters = item;
    }

    public Product getProduct(){
        return waters.pollLast();
    }

    public Product getProduct(String name, double volume, double temp){
        return null;
    }

}