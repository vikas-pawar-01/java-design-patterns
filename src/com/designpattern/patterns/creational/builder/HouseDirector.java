package com.designpattern.patterns.creational.builder;

public class HouseDirector {
  private HouseBuilder builder;

  public HouseDirector(HouseBuilder builder) {
    this.builder = builder;
  }

  public House constructHouse() {
    builder.buildFoundation();
    builder.buildStructure();
    builder.buildRoof();
    builder.buildGarage();
    builder.buildSwimmingPool();
    return builder.getHouse();
  }
}