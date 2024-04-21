package zad_1;

public class MissionMillionaire implements Observer {
    private final Items requiredItem = Items.GOLD_BAR;
    private final int requiredAmount = 50;
    private Subject subject;

    public MissionMillionaire(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    private void missionPassed() {
        System.out.println("Millionaire - Mission passed (Collect $1 000 000 from gold bars)");
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
