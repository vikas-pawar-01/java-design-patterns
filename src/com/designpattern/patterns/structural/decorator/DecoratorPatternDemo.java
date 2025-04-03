package com.designpattern.patterns.structural.decorator;

public class DecoratorPatternDemo {
  public static void run() {
    Coffee simpleCoffee = new SimpleCoffee();
    System.out.println(simpleCoffee.getDescription() + " -> Cost: $" + simpleCoffee.getCost());

    Coffee milkCoffee = new MilkDecorator(simpleCoffee);
    System.out.println(milkCoffee.getDescription() + " -> Cost: $" + milkCoffee.getCost());

    Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
    System.out.println(sugarMilkCoffee.getDescription() + " -> Cost: $" + sugarMilkCoffee.getCost());
  }
}