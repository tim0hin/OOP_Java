import java.util.LinkedList;

public class sem1 {
    public static void main(String[] args) {
//        WaterVendingMachine wvm = new WaterVendingMachine();
//
//        Product bonAqua = new Water("bonAqua", 50);
//        Product redKey = new Water("redKey", 60);
//
//        LinkedList<Product> l = new LinkedList<>();
//        l.add(bonAqua);
//        l.add(redKey);
//
//        wvm.putProduct(l);
//        System.out.println(wvm.getProduct());
//        System.out.println(wvm.getProduct());
//        System.out.println(wvm.getProduct());

        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();

        Product coffe = new HotDrink("coffe", 100,91,0.3);
        Product tea = new HotDrink("tea", 60,56, 0.5);
        Product cacao = new HotDrink("cacao",120,70, 0.4);

        LinkedList<Product> hd = new LinkedList<>();
        hd.add(coffe);
        hd.add(tea);
        hd.add(cacao);

        hdvm.putProduct(hd);

//        System.out.println(hdvm.getProduct("coffe",0.3, 91));
        System.out.println(hdvm.getProduct("tea",0.5,56));
//        System.out.println(hdvm.getProduct("cacao",0.4,70));

    }
}
