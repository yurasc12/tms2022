package service;

import utils.MyUtilsString;

public class MainString {
    public static void main(String[] args) {
        MyUtilsString utilsString = new MyUtilsString();
        System.out.println(utilsString.validate("zxee15", 5, 20));
        System.out.println(utilsString.validate("zxee15_", 5, 20));
        utilsString.getCountWord("One two three раз два три one1 two2 123 ");

        utilsString.printWord("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.", "Java\\s+\\d{1,3}");
        utilsString.printWord("cab, ccab, cccab", "c+ab");

        System.out.println(utilsString.getMidlChar("string"));
    }
}
