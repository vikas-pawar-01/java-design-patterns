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

Client
   |
   v
+-------------------------+
|       Employee          |
+-------------------------+
   |
   v
+-------------------------+          +-------------------------+
|   EmployeeReport        |          |   EmployeeDatabase      |
+-------------------------+          +-------------------------+
| + generateReport()      |          | + save()                |
|                         |          | + delete()              |
+-------------------------+          +-------------------------+



        +-------------------------+
        |       Employee          |  <--- Class with Single Responsibility
        +-------------------------+
        | - name: String          |
        | - position: String      |
        +-------------------------+
        | + getName(): String     |
        | + getPosition(): String |
        +-------------------------+

        +-------------------------+
        |       EmployeeReport    |  <--- Class with Single Responsibility
        +-------------------------+
        | + generateReport(emp: Employee): String |
        +-------------------------+

        +-------------------------+
        |       EmployeeDatabase  |  <--- Class with Single Responsibility
        +-------------------------+
        | + save(emp: Employee): void |
        | + delete(emp: Employee): void |
        +-------------------------+

   - **O**: Open/Closed Principle (OCP): Software entities should be open for extension but closed for modification.

```
Client
   |
   v
ShapeCalculator
   |
   +--> calculateTotalArea(List<Shape>)
           |
           +--> Circle.calculateArea()
           |
           +--> Rectangle.calculateArea()
```

        +-------------------------+
        |       Shape             |  <--- Abstract Class (Open for Extension)
        +-------------------------+
        | + calculateArea(): double |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |       Circle            |          |       Rectangle         |
    +-------------------------+          +-------------------------+
    | - radius: double        |          | - length: double        |
    |                         |          | - width: double         |
    +-------------------------+          +-------------------------+
    | + calculateArea(): double |        | + calculateArea(): double |
    +-------------------------+          +-------------------------+

        +-------------------------+
        |   ShapeCalculator       |  <--- Class (Closed for Modification)
        +-------------------------+
        | + calculateTotalArea(shapes: List<Shape>): double |
        +-------------------------+

   - **L**: Liskov Substitution Principle (LSP): Subtypes must be substitutable for their base types.

```
Client
   |
   v
Bird (Base Class)
   |
   +--> Sparrow (Derived Class)
   |       |
   |       +--> fly() works as expected
   |
   +--> Penguin (Derived Class)
           |
           +--> fly() throws exception or provides alternative behavior
```

        +-------------------------+
        |       Bird              |  <--- Base Class
        +-------------------------+
        | + fly(): void           |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |       Sparrow           |          |       Penguin           |
    +-------------------------+          +-------------------------+
    | + fly(): void           |          | + fly(): void           |
    +-------------------------+          +-------------------------+


   - **I**: Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use.

```
Client
   |
   v
Worker Interface
   |
   +--> HumanWorker
   |       |
   |       +--> work()
   |       +--> eat() (via Eater Interface)
   |
   +--> RobotWorker
           |
           +--> work()
```

        +-------------------------+
        |       Worker            |  <--- Segregated Interface
        +-------------------------+
        | + work(): void          |
        +-------------------------+

        +-------------------------+
        |       HumanWorker       |  <--- Implements Worker
        +-------------------------+
        | + work(): void          |
        | + eat(): void           |
        +-------------------------+

        +-------------------------+
        |       RobotWorker       |  <--- Implements Worker
        +-------------------------+
        | + work(): void          |
        +-------------------------+

        +-------------------------+
        |       Eater             |  <--- Segregated Interface
        +-------------------------+
        | + eat(): void           |
        +-------------------------+

   - **D**: Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules; both should depend on abstractions.

```
Client
   |
   v
NotificationManager
   |
   +--> Notification (Abstraction)
           |
           +--> EmailService (Concrete Implementation)
           |
           +--> SMSService (Concrete Implementation)
```

        +-------------------------+
        |       Notification      |  <--- High-Level Module (Abstraction)
        +-------------------------+
        | + send(message: String): void |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |       EmailService      |          |       SMSService        |
    +-------------------------+          +-------------------------+
    | + send(message: String): void |    | + send(message: String): void |
    +-------------------------+          +-------------------------+

        +-------------------------+
        |   NotificationManager   |  <--- High-Level Module
        +-------------------------+
        | - service: Notification |
        +-------------------------+
        | + notify(message: String): void |
        +-------------------------+


---

## Design Patterns

### 1. Creational Patterns
Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.

```
Client
   |
   v
Singleton.getInstance()
   |
   +--> If instance == null
   |       |
   |       v
   |   Create new Singleton instance
   |
   +--> Return the Singleton instance
```

        +--------------------+
        |    Singleton       |  <--- Singleton Class
        +--------------------+
        | - instance: Singleton (static) |
        +--------------------+
        | + getInstance(): Singleton     |
        | + otherMethods()   |
        +--------------------+


- **Factory Pattern**: Provides an interface for creating objects without specifying their concrete classes.

```
Client
   |
   v
Factory (Creator)
   |
   +--> createProduct()
           |
           +--> ConcreteProductA or ConcreteProductB
                   |
                   v
               Product (Interface)
```

        +--------------------+
        |    Product         |  <--- Interface
        +--------------------+
        | + operation()      |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | ConcreteProductA   |          | ConcreteProductB   |
    +--------------------+          +--------------------+
    | + operation()      |          | + operation()      |
    +--------------------+          +--------------------+
               ^
               |
        +--------------------+
        |   Factory          |  <--- Creator
        +--------------------+
        | + createProduct()  |
        +--------------------+

- **Abstract Factory**: Creates families of related objects without specifying their concrete classes.

```
Client
   |
   v
FactoryProvider
   |
   +--> ShapeFactory
   |       |
   |       +--> Circle
   |       +--> Rectangle
   |
   +--> ColorFactory
           |
           +--> Red
           +--> Blue
```

        +--------------------+
        | AbstractFactory    |  <--- Abstract Factory
        +--------------------+
        | + createShape()    |
        | + createColor()    |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | ShapeFactory       |          | ColorFactory       |
    +--------------------+          +--------------------+
    | + createShape()    |          | + createColor()    |
    | - createColor()    |          | - createShape()    |
    +--------------------+          +--------------------+
               ^
               |
        +--------------------+
        | FactoryProvider    |  <--- Factory Selector
        +--------------------+
        | + getFactory()     |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | Shape              |          | Color              |
    +--------------------+          +--------------------+
    | + draw()           |          | + fill()           |
    +--------------------+          +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | Circle             |          | Red                |
    +--------------------+          +--------------------+
    | + draw()           |          | + fill()           |
    +--------------------+          +--------------------+
    | Rectangle          |          | Blue               |
    +--------------------+          +--------------------+
    | + draw()           |          | + fill()           |
    +--------------------+          +--------------------+


- **Prototype**: Creates new objects by copying existing ones, improving performance.

```
Client
   |
   v
Prototype (Interface)
   |
   +--> ConcretePrototype1
   |       |
   |       +--> clone() creates a copy of ConcretePrototype1
   |
   +--> ConcretePrototype2
           |
           +--> clone() creates a copy of ConcretePrototype2
```

        +--------------------+
        |   Prototype        |  <--- Interface
        +--------------------+
        | + clone(): Object  |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | ConcretePrototype1 |          | ConcretePrototype2 |
    +--------------------+          +--------------------+
    | - field1           |          | - field2           |
    | - field2           |          | - field3           |
    +--------------------+          +--------------------+
    | + clone(): Object  |          | + clone(): Object  |
    +--------------------+          +--------------------+

- **Builder**: Constructs complex objects step by step, separating construction from representation.

```
Client
   |
   v
HouseDirector
   |
   +--> HouseBuilder (Interface)
           |
           +--> ConcreteHouseBuilder
                   |
                   +--> Build parts of the House
                           |
                           v
                        House (Product)
```

        +--------------------+
        |      House         |  <--- Product
        +--------------------+
        | - foundation       |
        | - structure        |
        | - roof             |
        | - hasGarage        |
        | - hasSwimmingPool  |
        +--------------------+
        | + getters/setters  |
        +--------------------+
               ^
               |
        +--------------------+
        |   HouseBuilder     |  <--- Builder Interface
        +--------------------+
        | + buildFoundation()|
        | + buildStructure() |
        | + buildRoof()      |
        | + buildGarage()    |
        | + buildSwimmingPool()|
        | + getHouse()       |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    | ConcreteHouseBuilder|         |  HouseDirector     |
    +--------------------+          +--------------------+
    | + buildFoundation()|          | - builder: HouseBuilder |
    | + buildStructure() |          +--------------------+
    | + buildRoof()      |          | + constructHouse() |
    | + buildGarage()    |          +--------------------+
    | + buildSwimmingPool()|
    | + getHouse()       |
    +--------------------+


### 2. Structural Patterns
Structural patterns deal with object composition and relationships, ensuring that if one part changes, the entire structure does not need to.

- **Adapter (Class vs Object)**: Converts the interface of a class into another interface clients expect.

```
Client (AudioPlayer)
   |
   v
MediaPlayer (Target Interface)
   |
   +--> If audioType == "mp3"
   |       |
   |       v
   |   Play directly
   |
   +--> If audioType == "mp4" or "vlc"
           |
           v
   MediaAdapter (Adapter)
           |
           +--> AdvancedMediaPlayer (Adaptee Interface)
                   |
                   +--> VlcPlayer or Mp4Player (Concrete Adaptees)
```

        +--------------------+
        |    MediaPlayer     |  <--- Target Interface
        +--------------------+
        | + play(String,     |
        |       String)      |
        +--------------------+
               ^
               |
    +--------------------+          +-------------------------+
    |   AudioPlayer      |          |   MediaAdapter          |
    +--------------------+          +-------------------------+
    | + play(String,     |          | - advancedMediaPlayer:  |
    |       String)      |          |     AdvancedMediaPlayer |
    +--------------------+          +-------------------------+
               |                    | + play(String, String)  |
               |                    +-------------------------+
               |
        +--------------------+
        | AdvancedMediaPlayer|  <--- Adaptee Interface
        +--------------------+
        | + playVlc(String)  |
        | + playMp4(String)  |
        +--------------------+
               ^
               |
    +--------------------+          +--------------------+
    |   VlcPlayer        |          |   Mp4Player        |
    +--------------------+          +--------------------+
    | + playVlc(String)  |          | + playMp4(String)  |
    | + playMp4(String)  |          | + playVlc(String)  |
    +--------------------+          +--------------------+


- **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.

```
Client
   |
   v
Shape (Abstraction)
   |
   +--> Circle (Refined Abstraction)
   |       |
   |       +--> Color (Implementor)
   |               |
   |               +--> Red (Concrete Implementor)
   |
   +--> Rectangle (Refined Abstraction)
           |
           +--> Color (Implementor)
                   |
                   +--> Blue (Concrete Implementor)
```

        +----------------+
        |    Shape       |  <--- Abstraction
        +----------------+
        | - color: Color |
        +----------------+
        | + draw()       |
        +----------------+
               ^
               |
    +-------------------+          +-------------------+
    |    Circle         |          |   Rectangle       |
    +-------------------+          +-------------------+
    | + draw()          |          | + draw()          |
    +-------------------+          +-------------------+
               ^
               |
        +----------------+
        |    Color       |  <--- Implementor
        +----------------+
        | + applyColor() |
        +----------------+
               ^
               |
    +-------------------+          +-------------------+
    |    Red            |          |   Blue           |
    +-------------------+          +-------------------+
    | + applyColor()    |          | + applyColor()    |
    +-------------------+          +-------------------+


- **Façade**: Provides a simplified interface to a larger body of code.

```
Client
   |
   v
HomeTheaterFacade
   |
   +--> Lights.dim()
   |
   +--> Projector.on()
   |       |
   |       +--> Projector.setInput("DVD")
   |
   +--> SoundSystem.on()
   |       |
   |       +--> SoundSystem.setVolume(10)
   |
   +--> DVDPlayer.on()
           |
           +--> DVDPlayer.play("Inception")
```

        +-----------------------+
        |   HomeTheaterFacade   |  <--- Facade
        +-----------------------+
        | - dvdPlayer: DVDPlayer|
        | - projector: Projector|
        | - soundSystem: SoundSystem |
        | - lights: Lights       |
        +-----------------------+
        | + watchMovie(movie: String): void |
        | + endMovie(): void                |
        +-----------------------+
                 |
                 v
    +-------------------+   +-------------------+   +-------------------+   +-------------------+
    |     DVDPlayer     |   |     Projector     |   |    SoundSystem    |   |      Lights       |
    +-------------------+   +-------------------+   +-------------------+   +-------------------+
    | + on(): void      |   | + on(): void      |   | + on(): void      |   | + dim(): void     |
    | + play(movie: String):|   | + setInput(input: String): void |   | + setVolume(level: int):|   | + on(): void      |
    | + off(): void     |   | + off(): void     |   | + off(): void     |   |                   |
    +-------------------+   +-------------------+   +-------------------+   +-------------------+


- **Proxy**: Provides a placeholder or surrogate to control access to an object.

```
 Client
   |
   v
ProxyImage (image1)
   |
   +--> If realImage == null
   |       |
   |       v
   |   RealImage (Load image from disk)
   |
   +--> Call display() on RealImage
```

     +----------------+
        |    Image       |  <--- Interface
        +----------------+
        | + display()    |
        +----------------+
               ^
               |
    +-------------------+          +-------------------+
    |   ProxyImage      |          |   RealImage       |
    +-------------------+          +-------------------+
    | - realImage       |          | - fileName        |
    | - fileName        |          +-------------------+
    +-------------------+          | + display()       |
    | + display()       |          | + loadFromDisk()  |
    +-------------------+          +-------------------+

- **Decorator**: Dynamically adds behavior or responsibilities to an object.

```
Client
   |
   v
SimpleCoffee
   |
   v
MilkDecorator (adds milk behavior)
   |
   v
SugarDecorator (adds sugar behavior)
   |
   v
Final Decorated Coffee (description and cost updated)
```

        +----------------+
        |    Coffee      |  <--- Interface
        +----------------+
        | + getCost()    |
        | + getDescription() |
        +----------------+
               ^
               |
    +-------------------+          +-------------------------+
    |   SimpleCoffee    |          |   CoffeeDecorator       |
    +-------------------+          +-------------------------+
    | + getCost()       |          | - coffee: Coffee        |
    | + getDescription()|          +-------------------------+
    +-------------------+          | + getCost()             |
                                   | + getDescription()      |
                                   +-------------------------+
                                             ^
                                             |
    +-------------------+          +-------------------+
    |   MilkDecorator   |          |   SugarDecorator  |
    +-------------------+          +-------------------+
    | + getCost()       |          | + getCost()       |
    | + getDescription()|          | + getDescription()|
    +-------------------+          +-------------------+

- **Flyweight**: Reduces memory usage by sharing as much data as possible with similar objects.

```
Client
   |
   v
CharacterFactory
   |
   +--> Check if Character exists in Map
   |       |
   |       +--> If exists, return existing Character
   |       |
   |       +--> If not, create new ConcreteCharacter and store in Map
   |
   v
ConcreteCharacter
   |
   +--> Display Character with extrinsic state (x, y)
```

        +-------------------------+
        |      Character          |  <--- Flyweight Interface
        +-------------------------+
        | + display(x: int, y: int): void |
        +-------------------------+
               ^
               |
    +-------------------------+
    |   ConcreteCharacter     |  <--- Concrete Flyweight
    +-------------------------+
    | - symbol: char          |  // Intrinsic state
    | - font: String          |  // Intrinsic state
    +-------------------------+
    | + display(x: int, y: int): void |
    +-------------------------+
               ^
               |
        +-------------------------+
        |   CharacterFactory      |  <--- Flyweight Factory
        +-------------------------+
        | - characters: Map       |
        +-------------------------+
        | + getCharacter(symbol: char, font: String): Character |
        +-------------------------+


- **Composite**: Composes objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

```
Client
   |
   v
Manager (General Manager)
   |
   +--> Manager (Team Lead)
   |       |
   |       +--> Developer (Alice)
   |       +--> Developer (Bob)
   |       +--> Designer (Charlie)
   |
   +--> Developer (Independent Consultant)
```

        +----------------+
        |   Employee     |  <--- Interface
        +----------------+
        | + showDetails()|
        +----------------+
               ^
               |
    +-------------------+          +-------------------+
    |    Developer      |          |     Manager       |
    +-------------------+          +-------------------+
    | - name            |          | - name            |
    | - position        |          | - position        |
    +-------------------+          | - subordinates    |
    | + showDetails()   |          +-------------------+
                                   | + addEmployee()   |
                                   | + removeEmployee()|
                                   | + showDetails()   |
                                   +-------------------+



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