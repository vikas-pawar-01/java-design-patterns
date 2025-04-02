package com.designpattern.patterns.factory;

public class FactoryPatternDemo {
  public static void run() {
    AnimalFactory animalFactory = new AnimalFactory();

    Animal dog = animalFactory.getAnimal("dog");
    dog.speak();

    Animal cat = animalFactory.getAnimal("cat");
    cat.speak();

    Animal lion = animalFactory.getAnimal("lion");
    lion.speak();
  }
}