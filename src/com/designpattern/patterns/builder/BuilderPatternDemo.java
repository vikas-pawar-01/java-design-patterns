package com.designpattern.patterns.builder;

public class BuilderPatternDemo {
  public static void run() {
    HouseBuilder builder = new ConcreteHouseBuilder();
    HouseDirector director = new HouseDirector(builder);

    House house = director.constructHouse();
    System.out.println("Constructed House: " + house);
  }
}