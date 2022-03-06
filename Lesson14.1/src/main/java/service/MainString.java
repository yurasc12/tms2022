package service;

import static utils.StringUtils.*;

public class MainString {
    public static void main(String[] args) {
        //  MyUtilsString utilsString = new MyUtilsString();
        System.out.println(validate("zxee15"));
        System.out.println(validate("zxee15_"));
        System.out.println(validate("Qzxee15"));
        System.out.println(validate("zxe"));
        System.out.println(validate("zxe+"));

        getCountWord("One two three раз два три one1 two2 123 ");

        System.out.println(getWord("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.", "Java\\s+\\d{1,3}"));
        System.out.println(getWord("cab, ccab, cccab", "c+ab"));

        System.out.println(getMidlChar("string"));
    }
}
