import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("coffee", 100, 100, 80));
        productList.add(new HotDrink("latte", 150, 150, 50));
        productList.add(new HotDrink("cappuccino", 120, 130, 70));
        productList.add(new HotDrink("black tea", 80, 100, 70));
        productList.add(new HotDrink("green tea", 100, 100, 70));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("latte", 150, 50));
    }
}