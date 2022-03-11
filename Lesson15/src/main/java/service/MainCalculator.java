package service;

import static models.Calculator.sum;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println(sum(new Integer(5), new Integer(10)));
        System.out.println(sum(new Integer(9), new Double(11.5)));
    }
}
