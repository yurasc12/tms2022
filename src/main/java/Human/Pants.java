package Human;

/**
 * класс штаны
 * dressed признак что штаны надеты
 * 2 метода снять и одеть
 */
public class Pants implements IPants {
    private boolean dressed;

    @Override
    public void putOn() {
        if (dressed) {
            System.out.println("Вы уже надели штаны");
        } else {
            System.out.println("Штаны надеты");
            dressed = true;
        }

    }

    @Override
    public void takeOff() {
        if (dressed) {
            System.out.println("Штаны сняты");
            dressed = false;
        } else {
            System.out.println("Вы еще не надели штаны");
        }
    }

    public boolean isDressed() {
        return dressed;
    }
}
