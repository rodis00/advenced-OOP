package zad_5;

import java.util.ArrayList;
import java.util.List;

public class MainShop {
    public static void main(String[] args) {

        List<Shop> shops = new ArrayList<>();

        shops.add(new PolishShop(new PolishTax()));
        shops.add(new GreatBritainShop(new GreatBritainTax()));
        shops.add(new GermanyShop(new GermanyTax()));

        for (Shop shop: shops) {
            System.out.println(shop.getClass().getName());
            System.out.println(shop.calculateTax(1000));
            System.out.println();
        }
    }
}
