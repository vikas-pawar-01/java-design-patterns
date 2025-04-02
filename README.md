# Understanding Design Patterns

## Overview
Design patterns are reusable solutions to common problems in software design. They provide a template for solving problems in a way that is proven to be effective and efficient.

### Topics Covered:
- **What is a Design Pattern**: A reusable solution to a commonly occurring problem in software design.
- **Why Design Patterns**: They improve code readability, reusability, and maintainability.
- **Benefits and Drawbacks of Design Patterns**: Benefits include standardization and efficiency, while drawbacks include overuse and added complexity.
- **Pattern Analysis**: Evaluating patterns to determine their suitability for solving specific problems.
- **Anti-Patterns**: Common practices that appear to be solutions but are ineffective or counterproductive.

---

## SOLID Principles
The SOLID principles are a set of design principles that help developers create robust, maintainable, and scalable software.

1. **Intro to SOLID Principles**: A set of five principles to improve object-oriented design.
   - **S**: Single Responsibility Principle (SRP): A class should have only one reason to change.
   - **O**: Open/Closed Principle (OCP): Software entities should be open for extension but closed for modification.
   - **L**: Liskov Substitution Principle (LSP): Subtypes must be substitutable for their base types.
   - **I**: Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.
   - **D**: Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules; both should depend on abstractions.

---

## Design Patterns

### 1. Creational Patterns
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.

- **Factory Pattern**: Provides an interface for creating objects without specifying their concrete classes.

- **Abstract Factory**: Creates families of related objects without specifying their concrete classes.

- **Prototype**: Creates new objects by copying existing ones, improving performance.

- **Builder**: Constructs complex objects step by step, separating construction from representation.

### 2. Structural Patterns
Structural patterns deal with object composition and relationships, ensuring that if one part changes, the entire structure does not need to.

- **Adapter (Class vs Object)**: Converts the interface of a class into another interface clients expect.

- **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.

- **Façade**: Provides a simplified interface to a larger body of code.

- **Proxy**: Provides a placeholder or surrogate to control access to an object.

- **Decorator**: Dynamically adds behavior or responsibilities to an object.

- **Flyweight**: Reduces memory usage by sharing as much data as possible with similar objects.

- **Composite**: Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

### 3. Behavioral Patterns
Behavioral patterns focus on communication between objects and how responsibilities are distributed.

- **Strategy**: Defines a family of algorithms and makes them interchangeable.

- **Chain of Responsibility**: Passes a request along a chain of handlers until it is handled.

- **Command**: Encapsulates a request as an object, allowing parameterization and queuing of requests.

- **State**: Allows an object to alter its behavior when its internal state changes.

- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.

- **Template**: Defines the skeleton of an algorithm, deferring some steps to subclasses.

---

## Architecture Patterns
Architecture patterns provide solutions to common high-level software design problems.

- **MVVM (Model-View-ViewModel)**: Separates the development of the graphical user interface from the business logic or back-end logic.

- **WPF (Windows Presentation Foundation)**: A UI framework for building desktop client applications in Windows.

- **Microservices**: An architectural style that structures an application as a collection of small, autonomous services.

- **MVC (Model-View-Controller)**: Separates an application into three interconnected components to separate internal representations of information from the ways information is presented and accepted.