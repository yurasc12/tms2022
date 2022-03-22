package service;

import models.Dog;
import models.GenericClass;

public class MainGenericClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dog");
        GenericClass<Integer, Dog, Double> genericClass = new GenericClass<Integer, Dog, Double>(100, dog, 55.00);
        System.out.println(genericClass.getArg1());
        System.out.println(genericClass.getArg2());
        System.out.println(genericClass.getArg3());
        genericClass.info();
    }
}
