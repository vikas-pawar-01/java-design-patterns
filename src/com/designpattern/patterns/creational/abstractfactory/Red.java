package com.designpattern.patterns.creational.abstractfactory;

public class Red implements Color {
  @Override
  public void fill() {
    System.out.println("Filling with Red color");
  }
}