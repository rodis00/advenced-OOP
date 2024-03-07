package zad_6;

import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker(
                new DeliverLetters(),
                new DriveByBicycle(),
                new PopularScienceLiterature(),
                "Postman")
        );

        workers.add(new Worker(
                new Treatment(),
                new DriveByCar(),
                new PopularScienceLiterature(),
                "Doctor")
        );

        workers.add(new Worker(
                new FixCars(),
                new DriveByCar(),
                new Gym(),
                "Mechanic")
        );

        for (Worker worker : workers) {
            System.out.println(worker.getProfession());
            worker.work();
            worker.drive();
            worker.spendFreeTime();

            System.out.println();
        }

    }
}
