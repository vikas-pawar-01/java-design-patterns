package com.designpattern.patterns.structural.flyweight;

public interface Character {
  void display(int x, int y); // Intrinsic state is shared, extrinsic state is passed
}