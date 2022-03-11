package models;

import java.io.Serializable;

/**
 * Обобщенный класс с тремя параметрами
 * Создать обобщенный класс с тремя параметрами (T, V, K).
 * Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
 * методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
 * Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (String),
 * V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.
 *
 * @param <T>
 */
public class GenericClass<T extends Serializable, V extends Animals & Serializable, K extends Number> {
    private T arg1;
    private V arg2;
    private K arg3;

    public GenericClass(T arg1, V arg2, K arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public V getArg2() {
        return arg2;
    }

    public K getArg3() {
        return arg3;
    }

    public T getArg1() {
        return arg1;
    }

    public void info() {
        System.out.println(arg1.getClass());
        System.out.println(arg2.getClass());
        System.out.println(arg3.getClass());
    }
}
