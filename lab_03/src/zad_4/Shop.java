package zad_4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getPurchases() {
        double totalPrice = 0.0;

        System.out.println("List of Products:");
        for(Product product: products) {
            System.out.printf("%s: %.2f%n", product.getDescription(), product.getPrice());
            totalPrice += product.getPrice();
        }

        if (totalPrice < 0)
            totalPrice = 0;

        System.out.printf("%nTotal price: %.2f PLN%n", totalPrice);
    }
}
