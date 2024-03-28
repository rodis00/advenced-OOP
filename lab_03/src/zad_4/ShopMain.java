package zad_4;

public class ShopMain {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.addProduct(new ShopMascot());
        shop.addProduct(new ShopMascot());
        shop.addProduct(new Lanyard());
        shop.addProduct(new ShippingCost());
        shop.addProduct(new Discount(10));

        shop.getPurchases();
    }
}
