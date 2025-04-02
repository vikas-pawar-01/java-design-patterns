package com.designpattern;

import com.designpattern.solid.dip.DependencyInversionDemo;
import com.designpattern.solid.isp.InterfaceSegregationDemo;
import com.designpattern.solid.lsp.LiskovSubstitutionDemo;
import com.designpattern.solid.ocp.OpenClosedDemo;
import com.designpattern.solid.srp.SingleResponsibilityDemo;
import com.designpattern.patterns.creational.abstractfactory.AbstractFactoryPatternDemo;
import com.designpattern.patterns.creational.builder.BuilderPatternDemo;
import com.designpattern.patterns.creational.factory.FactoryPatternDemo;
import com.designpattern.patterns.creational.prototype.PrototypePatternDemo;
import com.designpattern.patterns.creational.singleton.SingletonPatternDemo;
import com.designpattern.patterns.structural.adapter.AdapterPatternDemo;
import com.designpattern.patterns.structural.bridge.BridgePatternDemo;

public class App {
  public static void main(String[] args) {
    // SOLID Principles

    System.out.println("||--------------------------------------------------||");
    System.out.println("Single Responsibility Principle (SRP): A class should have only one reason to change.");
    SingleResponsibilityDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Open/Closed Principle (OCP): Software entities should be open for extension but closed for modification.");
    OpenClosedDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.");
    LiskovSubstitutionDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.");
    InterfaceSegregationDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions.");
    DependencyInversionDemo.run();

    // Design Patterns
    System.out.println("||--------------------------------------------------||");
    System.out
        .println("Singleton Pattern: Ensure a class has only one instance and provide a global point of access to it.");
    SingletonPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Factory Pattern: Define an interface for creating an object, but let subclasses alter the type of objects that will be created.");
    FactoryPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Prototype Pattern: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.");
    PrototypePatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Builder Pattern: Separate the construction of a complex object from its representation so that the same construction process can create different representations.");
    BuilderPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Abstract Factory Pattern: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.");
    AbstractFactoryPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Adapter Pattern: Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.");
    AdapterPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Bridge Pattern: Decouple an abstraction from its implementation so that the two can vary independently.");
    BridgePatternDemo.run();
  }
}