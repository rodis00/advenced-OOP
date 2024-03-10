package zad_1;

public abstract class Character {
    private IWeapon weapon;

    public Character(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void selectWeapon(String weapon) {
        System.out.println(this.weapon.selectWeapon(weapon));
    }
}
