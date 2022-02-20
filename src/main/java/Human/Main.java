package Human;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петя", new Jacket(), new Pants(), new Shoes());
        person.getDressed();
        person.undress();
    }
}
