package com.designpattern.patterns.creational.singleton;

public class SingletonPatternDemo {
  public static void run() {
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();

    logger1.log("This is the first log message.");
    logger2.log("This is the second log message.");

    System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
  }
}