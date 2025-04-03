package com.designpattern.patterns.structural.proxy;

public class ProxyPatternDemo {
  public static void run() {
    Image image1 = new ProxyImage("photo1.jpg");
    Image image2 = new ProxyImage("photo2.jpg");

    // Image will be loaded and displayed
    image1.display();

    // Image will not be loaded again, only displayed
    image1.display();

    // Image will be loaded and displayed
    image2.display();
  }
}