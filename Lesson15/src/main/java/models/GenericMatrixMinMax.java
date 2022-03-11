package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
 *
 * @param <Type>
 */
@Getter
@Setter
@ToString
public class GenericMatrixMinMax<Type> {
    Type[] array;

    public GenericMatrixMinMax(Type[] array) {
        this.array = array;
    }

    public Type getMinMatrix() {
        Arrays.sort(array);
        return array[0];

        //  хотел сделать так java послала.  не разобраля почему.  у min тип Type и массив типа Type
        /*Type min = array[0];
        for (Type type : array) {
            if (min < type) {
                min = type;
            }
        }
        return min;*/
    }

    public Type getMaxMatrix() {
        Arrays.sort(array);

        return array[array.length - 1];
    }

}
