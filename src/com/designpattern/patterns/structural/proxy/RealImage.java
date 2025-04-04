package com.designpattern.patterns.structural.proxy;

public class RealImage implements Image {
  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk();
  }

  private void loadFromDisk() {
    System.out.println("Loading " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying " + fileName);
  }
}