package by.tms.service;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;
import by.tms.model.PersonRegistry;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

import static by.tms.utils.Constans.FMALE;
import static by.tms.utils.Constans.MALE;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Person> citizens = new ArrayList<>();

    public static void main(String[] args) {

        int number = 1;
        int key = 1; //выход из цикла ввода

        do {
            System.out.println("Введите данные по человеку № " + number);

            String name = getValueString(" Имя ");
            String surName = getValueString(" Фамилия ");
            int age = getValueInt(" Возраст ");
            int sex = getValueSex(" Пол (0 - мужкой 1- женский) ");

            System.out.println("--------Адрес----------");
            String country = getValueString(" Страна ");
            String city = getValueString(" Город ");
            String house = getValueString(" № дома ");
            String room = getValueString(" № квартиры ");


            String gender;
            if (sex == 0) {
                gender = MALE;
            } else {
                gender = FMALE;
            }
            Address address = new Address(country, city, house, room);
            Person person = new Person(name, surName, gender, age, address);
            System.out.println(person.toString());
            citizens.add(person);
            number++;
            key = getValueSex(" Сделайте выбор (0 - Выход 1- Продолжить) ");
        } while (key == 1);

        //Person[] citizensArray = citizens.toArray(new Person[0]); //объявляем массив объектов и присваеваем ему список

        // PersonRegistry personRegistry = new PersonRegistry(citizensArray);

        PersonRegistry personRegistry = new PersonRegistry(citizens);

        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        System.out.println("Количество призывников с именем Александр: " + militaryOffice.getRecruitsName("Александр"));

        AbstractList<Person> byRecruit = militaryOffice.getRecruits();
        if (!byRecruit.isEmpty()) {
            System.out.println(" Имена подлежащих призыву: ");
            for (int i = 0; i < byRecruit.size(); i++) {
                System.out.println(byRecruit.get(i).getName() + " " + byRecruit.get(i).getSurname());
            }
        }

        System.out.println("Количество призывников  в городе Минск: " + militaryOffice.getRecruitsByCity("Минск"));
        int ageMin = 25;
        int ageMax = 27;
        System.out.println("Количество призывников  в возрасте с - " + ageMin + " по " + ageMax + " равно :" + militaryOffice.getRecruitsByAge(25, 27));

        //Car car = new Car();
    }

    private static String getValueString(String nameValue) {
        String value = "";
        do {
            System.out.print(nameValue + ":");
            if (scanner.hasNext()) {
                value = scanner.nextLine();
            } else {
                scanner.next();
            }
        } while (value.trim().equals(""));

        return value;
    }

    private static int getValueInt(String nameValue) {
        int value = 0;
        do {
            System.out.print(nameValue + ":");
            if (scanner.hasNext()) {
                value = scanner.nextInt();
            } else {
                scanner.next();
            }
        } while (value == 0);

        return value;
    }

    private static int getValueSex(String nameValue) {
        int value = 0;
        do {
            System.out.print(nameValue + ":");
            if (scanner.hasNext()) {
                value = scanner.nextInt();
            } else {
                scanner.next();
            }
        } while (!(value == 0 || value == 1));

        return value;
    }

}


