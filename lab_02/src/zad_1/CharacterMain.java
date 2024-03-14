package zad_1;

public class CharacterMain {
    public static void main(String[] args) {

        Character character = new Character(new Knight());
        character.attack();

        character.setWeapon(new Cannoneer());
        character.attack();

        character.setWeapon(new Shooter());
        character.attack();

        character.setWeapon(new Archer());
        character.attack();
    }
}
