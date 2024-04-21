package zad_1;

public class MissionUniqueWeaponAxe implements Observer {

    private final Items requiredItem = Items.AXE;
    private final int requiredAmount = 1;
    private Subject subject;

    public MissionUniqueWeaponAxe(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    protected void missionPassed() {
        System.out.println("Woodsman - Mission passed (Get Axe)");
        subject.removeObserver(this);
    }

    @Override
    public void update(Item item, int amount) {
        if (item.getName().equals(requiredItem)) {
            if (amount == requiredAmount) {
                missionPassed();
            }
        }
    }
}
