package by.tms.model;

/**
 * класс описывает человека
 */
public class Person {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private Address address;

    public Person(String name, String surname, String gender, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public Person() {
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

    public void setAddress(Address address) {
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person " +
                "name= " + name + '\n' +
                "surname= " + surname + '\n' +
                "gender=" + gender + '\n' +
                "age=" + age + '\n' +
                "address=" + address;

    }
}
