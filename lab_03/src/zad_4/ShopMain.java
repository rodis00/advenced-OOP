package zad_4;

public class ShopMain {
    public static void main(String[] args) {

        Product shop = new Shop();
        System.out.printf("%s - %.2f%n", shop.getDescription(), shop.getPrice());

        Product shop2 = new Discount(new Lanyard(new Shop()));
        System.out.printf("%s - %.2f%n", shop2.getDescription(), shop2.getPrice());

        Product shop3 = new Discount(new Lanyard(new ShopMascot(new Lanyard(new Shop()))));
        System.out.printf("%s - %.2f%n", shop3.getDescription(), shop3.getPrice());
    }
}
