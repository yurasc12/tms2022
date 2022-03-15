package models;

import java.math.BigDecimal;
import java.util.List;

public interface IShop {
    boolean appendProduct(int id, String name, BigDecimal price); // добавить продукт

    List<Product> getListProducts(); //возвращает список продуктов

    boolean removeProduct(int id, String name, BigDecimal price); //удаляет продукт

    void changeProduct(); // изменить продуукт

    void sellProduct();// продать продукт

}
