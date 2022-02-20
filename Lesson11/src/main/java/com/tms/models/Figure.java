package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Задача5*(звездочка)
 * Используя перечисления(enum), реализовать программу по вычислению площади фигуры (метод getSquare).
 * Создать классы Фигура, Линия, Треугольник, Прямоугольник. Можно пользоваться интерфейсами, при необходимости!
 * Если у фигуры нельзя вычислить площадь, то метод не должен быть реализован в в этом классе.
 * Добавить фигуры в массив, пробежать по массиву и вызвать метод getSquare.
 * Внимание!!! пользоваться instanceof НЕЛЬЗЯ, тут нужно применить перечисления.
 * /
 */
@Getter
@AllArgsConstructor
public abstract class Figure {
    public enum NameFigure {TRIANGLE, RECTANGLE, LINE}

    NameFigure name;


}
