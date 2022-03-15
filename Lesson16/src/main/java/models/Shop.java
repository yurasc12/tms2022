package models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Shop implements IShop, Serializable {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean appendProduct(int id, String name, BigDecimal price) {
        if (findElement(id, name, price) == -1) {
            products.add(new Product(id, name, price));
            return true;
        } else {
            return false;
        }

    }

    private int findElement(int id, String name, BigDecimal price) {
        int index = -1;
        int i = 0;
        for (Product product : products) {
            if (product.getId() == id && product.getName().equals(name) && product.getPrice().equals(price)) {
                return i;
            }
            i++;
        }
        return index;
    }

    @Override
    public List<Product> getListProducts() {
        return products;
    }

    @Override
    public boolean removeProduct(int id, String name, BigDecimal price) {

        int index = findElement(id, name, price);
        if (index == -1) {
            return false;
        } else {
            products.remove(index);
            return true;
        }
    }

    @Override
    public void changeProduct() {

    }

    @Override
    public void sellProduct() {

    }
}
