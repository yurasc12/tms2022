package service;

import models.Car;
import models.Person;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<Integer> listNumber = getListNumber();
        for (Integer integer : listNumber) {
            System.out.print(integer + " ");
        }

        System.out.println(countElemetsList());

        List<String> strings = Arrays.asList("john", "arya", "sansa");
        strings.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);
        printNotEmptyNumberCar();
        printSurname();
        printCountStaff();
    }

    // вывод списка  элементов *2
    public static List getListNumber() {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println(integers);
        return integers.stream()
                .map((s) -> s * 2)
                .collect(Collectors.toList());
    }


    //  Подсчет четных чисел
    public static int countElemetsList() {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(100) + 1);
        }

        return (int) integers.stream()
                .filter((s) -> s % 2 == 0)
                .count();
    }

    // Вывод не пустых номеров
    public static void printNotEmptyNumberCar() {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));
        cars.stream()
                .filter(p -> StringUtils.isNotEmpty(p.getNumber()))
                .filter(p -> p.getYear() > 2010)
                .forEach(System.out::println);
    }

    // вывод фамилий нач. с буквы Д
    public static void printSurname() {
        List<Person> persons = Arrays.asList(
                new Person("Петя", "Денисов"),
                new Person("Иван", "Иванов"),
                new Person("Федор", "Достоевский"));
        persons.stream()
                .filter(p -> p.getSurname().substring(0, 1).equals("Д"))
                .forEach(p -> System.out.println(p.getSurname()));
    }

    // подсчет сотрудников
    public static void printCountStaff() {
        List<Person> persons = Arrays.asList(
                new Person("Петя", "Денисов"),
                new Person("Иван", "Иванов"),
                new Person("Федор", "Достоевский"));


        Map<String, Long> result = persons.stream().collect(Collectors.groupingBy(p -> p.getSurname().substring(0, 1), Collectors.counting()));
        System.out.println(result);
        /*List<String> transform = persons.stream()
                .map(p -> p.getSurname().substring(0, 1))
                .distinct()
                .collect(Collectors.toList());
        for (String s : transform) {
            int count = (int) persons.stream()
                    .filter(p -> p.getSurname().substring(0, 1).equals(s))
                    .count();
            System.out.println(s + "- " + count);
        }*/
    }

}
