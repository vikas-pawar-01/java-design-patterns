package com.designpattern.patterns.behavioral.interpreter;

public class InterpreterPatternDemo {
  public static void run() {
    // Represent the expression: 5 + 3 - 2
    Expression number1 = new NumberExpression(5);
    Expression number2 = new NumberExpression(3);
    Expression number3 = new NumberExpression(2);

    // Create addition and subtraction expressions
    Expression addition = new AddExpression(number1, number2); // 5 + 3
    Expression subtraction = new SubtractExpression(addition, number3); // (5 + 3) - 2

    // Interpret the final expression
    System.out.println("Result of the expression (5 + 3 - 2): " + subtraction.interpret());
  }
}