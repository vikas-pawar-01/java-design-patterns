package com.designpattern.patterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
  public static void run() {
    Logger loggerChain = LoggerChain.getChainOfLoggers();

    System.out.println("Sending INFO level message:");
    loggerChain.logMessage(Logger.INFO, "This is an informational message.");

    System.out.println("\nSending DEBUG level message:");
    loggerChain.logMessage(Logger.DEBUG, "This is a debug message.");

    System.out.println("\nSending ERROR level message:");
    loggerChain.logMessage(Logger.ERROR, "This is an error message.");
  }
}