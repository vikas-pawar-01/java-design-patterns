package com.designpattern.patterns.structural.proxy;

public class ProxyImage implements Image {
  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(fileName); // Load the image only when needed
    }
    realImage.display();
  }
}