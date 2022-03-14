package models;

import lombok.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

@Getter
public class InputData {
    private static final Scanner scanner = new Scanner(System.in);
    private String nameProduct;
    private Integer idProduct;
    private BigDecimal priceProduct;

    public void getData() {
        idProduct = getValueInt();
        nameProduct = getValueString();
        priceProduct = getValueBigDe();
    }


    private static String getValueString() {
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

    private static int getValueInt() {
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

    private static BigDecimal getValueBigDe() {
        BigDecimal value = new BigDecimal(BigInteger.ZERO);
        do {
            System.out.print(" цена товара :");
            if (scanner.hasNextBigDecimal()) {
                value = (BigDecimal) scanner.nextBigDecimal();
            } else {
                scanner.next();
            }
        } while (!value.equals(BigDecimal.ZERO));

        return value;
    }

}
