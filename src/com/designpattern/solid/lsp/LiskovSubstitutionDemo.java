package com.designpattern.solid.lsp;

public class LiskovSubstitutionDemo {
  public static void run() {
    Bird sparrow = new Sparrow();
    sparrow.fly();
  }
}