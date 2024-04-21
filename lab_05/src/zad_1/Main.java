package zad_1;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        MissionMillionaire millionaire = new MissionMillionaire(inventory);
        MissionUniqueWeaponAxe uniqueWeaponAxe = new MissionUniqueWeaponAxe(inventory);
        MissionThirsty thirsty = new MissionThirsty(inventory);

        Item goldBar = new Item(Items.GOLD_BAR);
        for (int i = 0; i < 49; i++) {
            inventory.addItem(goldBar);

        }
        inventory.removeItem(goldBar);
        inventory.addItem(goldBar);

        inventory.addItem(goldBar);

        inventory.removeObserver(millionaire);

        inventory.addItem(goldBar);

        Item axe = new Item(Items.AXE);
        inventory.addItem(axe);

        inventory.removeObserver(uniqueWeaponAxe);

        Item beer = new Item(Items.BEER);
        for (int i = 0; i < 99; i++) {
            inventory.addItem(beer);
        }
        inventory.addItem(beer);

        inventory.removeObserver(thirsty);
    }
}
