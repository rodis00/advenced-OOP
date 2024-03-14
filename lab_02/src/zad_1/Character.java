package zad_1;

public class Character {
    private IWeapon weapon;

    public Character(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
