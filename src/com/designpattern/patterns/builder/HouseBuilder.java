package com.designpattern.patterns.builder;

public interface HouseBuilder {
  void buildFoundation();

  void buildStructure();

  void buildRoof();

  void buildGarage();

  void buildSwimmingPool();

  House getHouse();
}