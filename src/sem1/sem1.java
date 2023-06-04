package sem1;

import java.util.LinkedList;

public class sem1 {
    public static void main(String[] args) {
//        sem1.WaterVendingMachine wvm = new sem1.WaterVendingMachine();
//
//        sem1.Product bonAqua = new sem1.Water("bonAqua", 50);
//        sem1.Product redKey = new sem1.Water("redKey", 60);
//
//        LinkedList<sem1.Product> l = new LinkedList<>();
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
        Product tea2 = new HotDrink("tea", 60,65, 0.6);
        Product tea3 = new HotDrink("tea", 50,65, 0.6);
        Product cacao = new HotDrink("cacao",120,70, 0.4);

        LinkedList<Product> hd = new LinkedList<>();
        hd.add(coffe);
        hd.add(tea);
        hd.add(tea2);
        hd.add(tea3);
        hd.add(cacao);

        hdvm.putProduct(hd);

//        System.out.println(hdvm.getProduct("coffe",0.3, 91));
        System.out.println(hdvm.getProduct("tea",0.6,65));
//        System.out.println(hdvm.getProduct("cacao",0.4,70));

    }
}
