package zad_5;

public class MainShop {
    public static void main(String[] args) {

        Shop shop = new Shop(new GermanyTax());
        System.out.println(shop.calculateTax(1000));

        shop.setTaxCalculator(new GreatBritainTax());
        System.out.println(shop.calculateTax(1000));

        shop.setTaxCalculator(new PolishTax());
        System.out.println(shop.calculateTax(1000));
    }
}
