package com.designpattern.patterns.singleton;

public class Logger {
  // Static variable to hold the single instance
  private static Logger instance;

  // Private constructor to prevent instantiation
  private Logger() {
  }

  // Public method to provide access to the single instance
  public static Logger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null) {
          instance = new Logger();
        }
      }
    }
    return instance;
  }

  // Example method to log messages
  public void log(String message) {
    System.out.println("LOG: " + message);
  }
}