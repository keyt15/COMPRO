package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> flavors1 = new ArrayList<>();
        flavors1.add("Chocolate");
        flavors1.add("Nutty");
        Coffee coffee1 = new Coffee("Espresso", "Arabica", "Medium", 4.99, "Dark", "Colombia", false, 10, flavors1, "Espresso");

        ArrayList<String> flavors2 = new ArrayList<>();
        flavors2.add("Citrus");
        flavors2.add("Floral");
        Coffee coffee2 = new Coffee("Latte", "Robusta", "Large", 5.99, "Medium", "Brazil", true, 5, flavors2, "Drip");

        System.out.println(coffee1.describe());
        System.out.println("Stock available: " + coffee1.checkStock());
        coffee1.discount(10);
        System.out.println("New price after discount: " + coffee1.price);

        coffee2.addFlavor("Vanilla");
        System.out.println(coffee2.describe());
        coffee2.updateStock(3);
        System.out.println("Updated stock: " + coffee2.stock);
    }
}
