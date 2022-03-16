package service;

import models.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Алгоритм работы магазина:
 * • Выберите действие:
 * ◦ Вывод всех товаров. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести:
 * ▪ по цене(возрастание)
 * ▪ по цене(убывание)
 * ▪ по добавлению(сначала новые, потом более старые)
 * После выбора сортировки, из магазина получаете список товаров, сортируете их таким образом как выбрал пользователь и выводите в консоль.
 * ◦ Добавление товара. При выборе этого действия:
 * ▪ пользователь должен ввести из консоли 3 параметра (id, название, цена).
 * ▪ создаем объект товара(поля заполняются данными введенными пользователем)
 * ▪ добавляем товар в магазин(напоминаю, если в списке товаров уже существует товар с таким id, то новый товар не добавляется)
 * ◦ Удаление товара. При выборе этого действия:
 * ▪ пользователь вводит id товара который нужно удалить
 * ▪ удаляем товар из магазина
 * ◦ Редактирование товара. При выборе этого действия:
 * ▪ пользователь должен ввести из консоли 3 параметра (id товара для редактирования, новое название, новую цену).
 * ▪ создаем объект товара(поля заполняются данными введенными пользователем)
 * ▪ редактируем товар в магазине
 * ◦ Выход. При выборе этого действия, работа магазина завершается.
 * В main создаем объект вашей консольной менюшки (приложения, Application). И вызываем метод старт. Магазин должен работать по замкнутому циклу,
 * до тех пор пока пользователь в меню не выберет выход. Естественно незабываем про обработку всевозможных ошибок.))
 */

public class MainShop {
    public static final String DIR_NAME = "Lesson16/src/main/resources/";


    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product = new Product(1, "мясо", 20.5);
        products.add(product);
        Product product1 = new Product(2, "гречка", 5.5);
        products.add(product1);
        Product product3 = new Product(3, "рис", 105.5);
        products.add(product3);
        IShop shop = new Shop(products);

        CaseMenu caseMenu = new CaseMenu();
        InputData inputData = new InputData();
        while (true) {
            int key = caseMenu.start();
            switch (key) {
                case 1:
                    inputData.getData();
                    Product newProduct = new Product(inputData.getIdProduct(), inputData.getNameProduct(), inputData.getPriceProduct());
                    System.out.println(inputData.getPriceProduct());
                    if (shop.appendProduct(newProduct)) {
                        System.out.println("товар добавлен");
                    } else {
                        System.out.println("товар уже существует");
                    }
                    break;
                case 2:
                    inputData.getData();
                    Product newProductRemove = new Product(inputData.getIdProduct(), inputData.getNameProduct(), inputData.getPriceProduct());
                    if (shop.removeProduct(newProductRemove)) {
                        System.out.println("товар удален");
                    } else {
                        System.out.println("повторите операцию");
                    }
                    break;
                case 3:
                    int keySub = caseMenu.startSubMenu();
                    List<Product> listProducts = shop.getListProducts();
                    List<Product> sortedList;
                    switch (keySub) {
                        case 1:
                            sortedList = listProducts.stream()
                                    .sorted(Comparator.comparingDouble(o -> o.getPrice()))
                                    .collect(Collectors.toList());
                            break;
                        case 2:
                            sortedList = listProducts.stream()
                                    .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                                    .collect(Collectors.toList());
                            break;
                        case 3:
                            sortedList = listProducts;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + keySub);
                    }

                    for (Product product2 : sortedList) {
                        System.out.println("Наименование : " + product2.getName() + " " + product2.getPrice() + " руб.");
                    }
                    break;
                case 5:
                    String filename = DIR_NAME + "Shop.dat";
                    endWork(filename, shop);
                    System.out.println("Завершение работы...");
                    return;
            }
        }


    }

    public static void endWork(String filename, IShop shop) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(shop);
            System.out.println("Запись произошла");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}

