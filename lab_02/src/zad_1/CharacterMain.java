package zad_1;

public class CharacterMain {
    public static void main(String[] args) {

        Archer archer = new Archer(new Weapon());
        archer.selectWeapon("Bow");

        Cannoneer cannoneer = new Cannoneer(new Weapon());
        cannoneer.selectWeapon("Cannon");

        Knight knight = new Knight(new Weapon());
        knight.selectWeapon("Sword");

        Shooter shooter = new Shooter(new Weapon());
        shooter.selectWeapon("Rifle");
    }
}
