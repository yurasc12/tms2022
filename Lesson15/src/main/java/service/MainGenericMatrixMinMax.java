package service;

import models.GenericMatrixMinMax;

/**
 * Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
 */
public class MainGenericMatrixMinMax {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};


        GenericMatrixMinMax<Integer> integerGenericMatrixMinMax = new GenericMatrixMinMax<Integer>(array);
        System.out.println(integerGenericMatrixMinMax.getMinMatrix());
        System.out.println(integerGenericMatrixMinMax.getMaxMatrix());
        ifo(integerGenericMatrixMinMax);
    }

    public static void ifo(GenericMatrixMinMax<Integer> integerGenericMatrixMinMax) {
        Integer[] array = integerGenericMatrixMinMax.getArray();
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }

    }
}
