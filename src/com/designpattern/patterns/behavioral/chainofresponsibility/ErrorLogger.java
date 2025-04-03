package com.designpattern.patterns.behavioral.chainofresponsibility;

public class ErrorLogger extends Logger {
  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("ERROR: " + message);
  }
}