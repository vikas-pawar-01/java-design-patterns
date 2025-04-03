package com.designpattern.patterns.structural.flyweight;

public class FlyweightPatternDemo {
  public static void run() {
    CharacterFactory factory = new CharacterFactory();

    // Create and reuse characters
    Character c1 = factory.getCharacter('A', "Arial");
    c1.display(10, 20);

    Character c2 = factory.getCharacter('B', "Arial");
    c2.display(30, 40);

    Character c3 = factory.getCharacter('A', "Arial"); // Reuses existing 'A' with Arial
    c3.display(50, 60);

    Character c4 = factory.getCharacter('A', "Times New Roman"); // New character
    c4.display(70, 80);
  }
}