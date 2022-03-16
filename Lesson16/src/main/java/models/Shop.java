package models;

import java.io.Serializable;
import java.util.List;

public class Shop implements IShop, Serializable {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean appendProduct(Product product) {
        if (findElement(product)) {
            products.add(product);
            return true;
        } else {
            return false;
        }
    }

    private boolean findElement(Product newProduct) {
        for (Product product : products) {
            if (product.equals(newProduct)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getListProducts() {
        return products;
    }

    @Override
    public boolean removeProduct(Product product) {
        if (findElement(product)) {
            products.remove(product);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void changeProduct() {

    }

    @Override
    public void sellProduct() {

    }
}
