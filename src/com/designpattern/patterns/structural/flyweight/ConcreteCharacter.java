package com.designpattern.patterns.structural.flyweight;

public class ConcreteCharacter implements Character {
  private final char symbol; // Intrinsic state
  private final String font; // Intrinsic state

  public ConcreteCharacter(char symbol, String font) {
    this.symbol = symbol;
    this.font = font;
  }

  @Override
  public void display(int x, int y) { // Extrinsic state
    System.out.println("Character: " + symbol + ", Font: " + font + ", Position: (" + x + ", " + y + ")");
  }
}