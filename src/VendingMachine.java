
import java.util.LinkedList;

/**
 * Торговый автомат, содержащий методы загрузки и выдачи товаров.
 */
public interface VendingMachine {
    
    public void putProduct(LinkedList<Product> item);

    public Product getProduct();

    public Product getProduct(String name, double volume, int temp);
}
