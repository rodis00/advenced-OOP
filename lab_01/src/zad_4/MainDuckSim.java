package zad_4;

import java.util.ArrayList;
import java.util.List;

public class MainDuckSim {
    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>();

        ducks.add(new MallarDuck(new FlyWithWings(), new Quack()));
        ducks.add(new RubberDuck(new FlyNoWay(), new Squeak()));
        ducks.add(new ModelDuck(new FlyNoWay(), new MuteQuack()));

        for (Duck duck: ducks) {
            duck.performFly();
            duck.performQuack();
        }

        ducks.get(1).setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying on a rocket.");
            }
        });

        ducks.get(1).performFly();
    }
}
