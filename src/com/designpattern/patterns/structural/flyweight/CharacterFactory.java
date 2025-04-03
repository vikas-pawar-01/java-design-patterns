package com.designpattern.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
  private final Map<String, Character> characters = new HashMap<>();

  public Character getCharacter(char symbol, String font) {
    String key = symbol + "-" + font;
    if (!characters.containsKey(key)) {
      characters.put(key, new ConcreteCharacter(symbol, font));
      System.out.println("Creating new character: " + key);
    }
    return characters.get(key);
  }
}