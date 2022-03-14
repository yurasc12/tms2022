package models;

import java.util.Scanner;

public class CaseMenu {
    private static final Scanner scanner = new Scanner(System.in);


    public void printMenu() {
        System.out.println("1. Поступление товара;");
        System.out.println("2. Удаление товара;");
        System.out.println("3. Вывод спика товаров;");
        System.out.println("4. Корректировка товара;");
        System.out.println("5. Завершение работы;");
    }

    public int start() {

        int key;
        do {
            printMenu();
            System.out.print("Введите номер меню: ");
            key = scanner.nextInt();

        } while (key < 1 || key > 5);
        return key;
    }

    public void printSubMenu() {
        System.out.println("----Сортировать по----");
        System.out.println("1. По возрастанию цены;");
        System.out.println("2. По убыванию цены;");
        System.out.println("3. По поступлению;");
    }

    public int startSubMenu() {

        int key;
        do {
            printSubMenu();
            System.out.print("Введите номер меню: ");
            key = scanner.nextInt();

        } while (key < 1 || key > 3);
        return key;
    }

}
