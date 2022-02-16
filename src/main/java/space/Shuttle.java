package space;

import java.util.Random;

public class Shuttle implements IStart {
    private Random random = new Random();

    @Override
    public boolean cheсkSystems() {
        if (random.nextInt(11) < 3) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены !!!\n Все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");

    }
}
