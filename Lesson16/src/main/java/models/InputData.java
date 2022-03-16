package models;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class InputData {
    private static final Scanner scanner = new Scanner(System.in);
    private String nameProduct;
    private Integer idProduct;
    private Double priceProduct;

    public void getData() {
        idProduct = getIdProduct();
        nameProduct = getNameProduct();
        priceProduct = getPriceProduct();
    }


    public String getNameProduct() {
        String value = "";
        do {
            System.out.print("Название товара:");
            if (scanner.hasNext()) {
                value = scanner.nextLine();
            } else {
                scanner.next();
            }
        } while (value.trim().isEmpty());

        return value;
    }

    public int getIdProduct() {
        int value = 0;
        do {
            System.out.print("ID товара:");
            if (scanner.hasNext()) {
                value = scanner.nextInt();
            } else {
                scanner.next();
            }
        } while (value == 0);

        return value;
    }

    public Double getPriceProduct() {
        double value = 0.00;
        do {
            System.out.print("цена товара :");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
            } else {
                scanner.next();
            }
        } while (value == 0.00);

        return value;
    }

}
