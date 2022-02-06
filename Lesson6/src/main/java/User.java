/**
 * 1) Создать класс User для хранения о обработки данных о пользователе.
 * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
 * - Возврата имени и фамилии полностью
 * - Увеличения возраста
 * - Вывода общей информации о пользователе
 * В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
 * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
 * В этом конструкторе сделать вызов другого конструктора этого же класса.
 * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
 */
public class User {
    private String name;
    private String surname;
    private String gender;
    private int age;

    public User(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public User(String name, String surname, int age) {
        this(age);
        this.name = name;
        this.surname = surname;

    }

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    // изменил метод использовал переменную age
    public void incrementAge(int age) {
        this.age += age;
    }

    // переимеовал метод
    public String getNameSurname() {
        return name + " " + surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User " + '\n' +
                "name=" + name + '\n' +
                "surname=" + surname + '\n' +
                "gender=" + gender + '\n' +
                "age=" + age;
    }
}
