package models;

import java.util.List;

public interface IShop {
    boolean appendProduct(Product product); // добавить продукт

    List<Product> getListProducts(); //возвращает список продуктов

    boolean removeProduct(Product product); //удаляет продукт

    void changeProduct(); // изменить продуукт

    void sellProduct();// продать продукт

}
