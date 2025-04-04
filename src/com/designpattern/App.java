package com.designpattern;

import com.designpattern.solid.dip.DependencyInversionDemo;
import com.designpattern.solid.isp.InterfaceSegregationDemo;
import com.designpattern.solid.lsp.LiskovSubstitutionDemo;
import com.designpattern.solid.ocp.OpenClosedDemo;
import com.designpattern.solid.srp.SingleResponsibilityDemo;
import com.designpattern.patterns.behavioral.chainofresponsibility.ChainOfResponsibilityDemo;
import com.designpattern.patterns.behavioral.command.CommandPatternDemo;
import com.designpattern.patterns.behavioral.interpreter.InterpreterPatternDemo;
import com.designpattern.patterns.behavioral.iterator.IteratorPatternDemo;
import com.designpattern.patterns.behavioral.mediator.MediatorPatternDemo;
import com.designpattern.patterns.behavioral.memento.MementoPatternDemo;
import com.designpattern.patterns.behavioral.observer.ObserverPatternDemo;
import com.designpattern.patterns.behavioral.state.StatePatternDemo;
import com.designpattern.patterns.behavioral.strategy.StrategyPatternDemo;
import com.designpattern.patterns.behavioral.template.TemplatePatternDemo;
import com.designpattern.patterns.creational.abstractfactory.AbstractFactoryPatternDemo;
import com.designpattern.patterns.creational.builder.BuilderPatternDemo;
import com.designpattern.patterns.creational.factory.FactoryPatternDemo;
import com.designpattern.patterns.creational.prototype.PrototypePatternDemo;
import com.designpattern.patterns.creational.singleton.SingletonPatternDemo;
import com.designpattern.patterns.structural.adapter.AdapterPatternDemo;
import com.designpattern.patterns.structural.bridge.BridgePatternDemo;
import com.designpattern.patterns.structural.composite.CompositePatternDemo;
import com.designpattern.patterns.structural.decorator.DecoratorPatternDemo;
import com.designpattern.patterns.structural.facade.FacadePatternDemo;
import com.designpattern.patterns.structural.flyweight.FlyweightPatternDemo;
import com.designpattern.patterns.structural.proxy.ProxyPatternDemo;

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

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Composite Pattern: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.");
    CompositePatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Decorator Pattern: Dynamically add additional responsibilities to an object at runtime.");
    DecoratorPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Proxy Pattern: Provide a surrogate or placeholder for another object to control access to it.");
    ProxyPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Facade Pattern: Provide a simplified interface to a larger body of code.");
    FacadePatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out
        .println("Flyweight Pattern: Reduces memory usage by sharing as much data as possible with similar objects.");
    FlyweightPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out
        .println("Chain of Responsibility Pattern: Passes a request along a chain of handlers until it is handled.");
    ChainOfResponsibilityDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println(
        "Command Pattern: Encapsulates a request as an object, allowing parameterization and undo functionality.");
    CommandPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Interpreter Pattern: Parses and evaluates expressions.");
    InterpreterPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Iterator Pattern: Provides a way to access elements of a collection sequentially.");
    IteratorPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Mediator Pattern: Defines an object to encapsulate how a set of objects interact.");
    MediatorPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Memento Pattern: Allows an object to save and restore its state.");
    MementoPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Observer Pattern: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.");
    ObserverPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("State Pattern: Allows an object to alter its behavior when its internal state changes.");
    StatePatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Strategy Pattern: Defines a family of algorithms and makes them interchangeable.");
    StrategyPatternDemo.run();

    System.out.println("||--------------------------------------------------||");
    System.out.println("Template Pattern: Defines the skeleton of an algorithm, deferring some steps to subclasses.");
    TemplatePatternDemo.run();

  }
}