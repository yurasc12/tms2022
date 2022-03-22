package models;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide,
 * subtraction. Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static <T extends Number, Y extends Number> double sum(T one, Y two) {
        return one.doubleValue() + two.doubleValue();
    }

    public static <T extends Number, Y extends Number> double multiply(T one, Y two) {
        return one.doubleValue() * two.doubleValue();
    }

    public static <T extends Number, Y extends Number> double divide(T one, Y two) {
        return one.doubleValue() / two.doubleValue();
    }

    public static <T extends Number, Y extends Number> double subtraction(T one, Y two) {
        return one.doubleValue() - two.doubleValue();
    }
}

