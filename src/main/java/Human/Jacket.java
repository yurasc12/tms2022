package Human;

public class Jacket implements IJacket {
    private boolean dressed;

    @Override
    public void putOn() {
        if (dressed) {
            System.out.println("Вы уже надели куртку");
        } else {
            System.out.println("Куртка надета");
            dressed = true;
        }

    }

    @Override
    public void takeOff() {
        if (dressed) {
            System.out.println("Куртка снята");
            dressed = false;
        } else {
            System.out.println("Вы еще не надели куртку");
        }

    }

    public boolean isDressed() {
        return dressed;
    }
}
