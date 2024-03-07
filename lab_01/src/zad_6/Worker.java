package zad_6;

public class Worker {
    private WorkBehavior workBehavior;
    private DriveBehavior driveBehavior;
    private SpendingFreeTimeBehavior spendingFreeTimeBehavior;
    private String profession;

    public Worker(
            WorkBehavior workBehavior,
            DriveBehavior driveBehavior,
            SpendingFreeTimeBehavior spendingFreeTimeBehavior,
            String profession
    ) {
        this.workBehavior = workBehavior;
        this.driveBehavior = driveBehavior;
        this.spendingFreeTimeBehavior = spendingFreeTimeBehavior;
        this.profession = profession;
    }

    public void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }

    public void setDriveBehavior(DriveBehavior driveBehavior) {
        this.driveBehavior = driveBehavior;
    }

    public void setSpendingFreeTimeBehavior(SpendingFreeTimeBehavior spendingFreeTimeBehavior) {
        this.spendingFreeTimeBehavior = spendingFreeTimeBehavior;
    }

    public void work() {
        workBehavior.work();
    }

    public void drive() {
        driveBehavior.drive();
    }

    public void spendFreeTime() {
        spendingFreeTimeBehavior.spendFreeTime();
    }

    public String getProfession() {
        return profession;
    }


}
