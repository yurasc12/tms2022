package com.tms.service;

import com.tms.models.*;

import static com.tms.models.Figure.Type.*;

//import static com.tms.models.Figure.NameFigure.*;

/**
 * Задача5*(звездочка)
 * Используя перечисления(enum), реализовать программу по вычислению площади фигуры (метод getSquare).
 * Создать классы Фигура, Линия, Треугольник, Прямоугольник. Можно пользоваться интерфейсами, при необходимости!
 * Если у фигуры нельзя вычислить площадь, то метод не должен быть реализован в в этом классе.
 * Добавить фигуры в массив, пробежать по массиву и вызвать метод getSquare.
 * Внимание!!! пользоваться instanceof НЕЛЬЗЯ, тут нужно применить перечисления.
 */
public class MainSquare {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Rectangle(RECTANGLE, 5, 10);
        figures[1] = new Triangle(TRIANGLE, 7, 5);
        figures[2] = new Line(LINE, 10);

        for (Figure figure : figures) {
           /* if (figure.getName() == RECTANGLE) {
                Rectangle figure1 = (Rectangle) figure;
                System.out.println("Площадь прямоугольника: " + figure1.getSquare());
            } else if (figure.getName() == TRIANGLE) {
                Triangle figure1 = (Triangle) figure;
                System.out.println("Площадь треугольника: " + figure1.getSquare());
            } else {
                System.out.println("У линии площадь не вычисляется!!!");
            }*/
            if (figure.getName().equals(LINE)) {
                System.out.println("У линии площадь не вычисляется!!!");
            } else {
                ISquare figure1 = (ISquare) figure;
                System.out.println("Площадь равна: " + figure1.getSquare());
            }
        }

    }
}
