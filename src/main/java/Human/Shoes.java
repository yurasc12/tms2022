package Human;

public class Shoes implements IShoes {
    private boolean dressed;

    @Override
    public void putOn() {
        if (dressed) {
            System.out.println("Вы уже надели обувь");
        } else {
            System.out.println("Обувь надета");
            dressed = true;
        }

    }

    @Override
    public void takeOff() {
        if (dressed) {
            System.out.println("Обувь снята");
            dressed = false;
        } else {
            System.out.println("Вы еще не надели обувь");
        }
    }

    public boolean isDressed() {
        return dressed;
    }
}
