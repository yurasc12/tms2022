package com.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * ФИО,
 * номер читательского билета,
 * факультет,
 * дата рождения,
 * телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг.
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
 * Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги"
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    /*private int year;
    private int month;
    private int day;
    private GregorianCalendar calendar = new GregorianCalendar(year, month, day);*/
    private String dateBirth;
    private String telefon;

    public void takeBook(int numberBooks) {
        System.out.println(fullName + " взял " + numberBooks + " книги");
    }

    public void takeBook(String... nameBooks) {
        String result = fullName + " взял книги: ";
        if (nameBooks.length > 0) {

            for (String nameBook : nameBooks) {
                result = result + nameBook + ",";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    public void takeBook(Book... books) {
        String result = fullName + " взял книги: ";
        if (books.length > 0) {

            for (Book book : books) {
                result = result + book.getNameBook() + ",";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    public void returnBook(int numberBooks) {
        System.out.println(fullName + " вернул " + numberBooks + " книги");
    }

    public void returnBook(String... nameBooks) {
        String result = fullName + " вернул книги: ";
        if (nameBooks.length > 0) {

            for (String nameBook : nameBooks) {
                result = result + nameBook + ",";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    public void returnBook(Book... books) {
        String result = fullName + " вернул книги: ";
        if (books.length > 0) {

            for (Book book : books) {
                result = result + book.getNameBook() + ",";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}