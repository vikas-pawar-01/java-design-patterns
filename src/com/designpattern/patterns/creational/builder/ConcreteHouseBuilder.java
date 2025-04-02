package com.designpattern.patterns.creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {
  private House house;

  public ConcreteHouseBuilder() {
    this.house = new House();
  }

  @Override
  public void buildFoundation() {
    house.setFoundation("Concrete Foundation");
  }

  @Override
  public void buildStructure() {
    house.setStructure("Wooden Structure");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Shingle Roof");
  }

  @Override
  public void buildGarage() {
    house.setHasGarage(true);
  }

  @Override
  public void buildSwimmingPool() {
    house.setHasSwimmingPool(false);
  }

  @Override
  public House getHouse() {
    return this.house;
  }
}