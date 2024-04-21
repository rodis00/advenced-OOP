package zad_1;

public class MissionThirsty implements Observer{
    private final Items requiredItem = Items.BEER;
    private final int requiredAmount = 100;
    private Subject subject;

    public MissionThirsty(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    private void missionPassed() {
        System.out.println("Alcoholic - Mission passed (drink 100 beers)");
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

