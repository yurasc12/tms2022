public class Main {
    public static void main(String[] args) {
        User user = new User("Иван", "Иванов", "Мужской", 33);
        System.out.println(user.toString());
        user.setName("Петя");
        System.out.println(user.toString());
        user.incrementAge(3);
        int age = user.getAge();
        System.out.println(age);
        String nameSurname = user.returnNameSurname();
        System.out.println(nameSurname);

        User user1 = new User("Иван", "Петров", 34);
        System.out.println(user1);
        user1.incrementAge(5);
        System.out.println(user1.getAge());

    }

}
