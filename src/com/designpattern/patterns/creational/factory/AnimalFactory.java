package com.designpattern.patterns.creational.factory;

public class AnimalFactory {
  // Factory method to create animals
  public Animal getAnimal(String animalType) {
    if (animalType == null) {
      return null;
    }
    switch (animalType.toLowerCase()) {
      case "dog":
        return new Dog();
      case "cat":
        return new Cat();
      case "lion":
        return new Lion();
      default:
        throw new IllegalArgumentException("Unknown animal type: " + animalType);
    }
  }
}