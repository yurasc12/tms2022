package Human;

public class Person implements IPerson {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }


    @Override
    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();

    }
}
