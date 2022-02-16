package space;

import java.util.Random;

public class SpaceX implements IStart {
    private Random random = new Random();

    @Override
    public boolean cheсkSystems() {
        if (random.nextInt(11) % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены !!!\n Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");

    }
}
