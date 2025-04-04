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


```
Client
   |
   v
PaymentContext (Context)
   |
   +--> setPaymentStrategy(strategy)
   |
   +--> pay(amount)
           |
           +--> CreditCardPayment.pay(amount)
           |
           +--> PayPalPayment.pay(amount)
           |
           +--> GooglePayPayment.pay(amount)
```

        +-------------------------+
        |    PaymentStrategy      |  <--- Strategy Interface
        +-------------------------+
        | + pay(amount: double): void |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+          +-------------------------+
    |   CreditCardPayment     |          |     PayPalPayment       |          |   GooglePayPayment      |
    +-------------------------+          +-------------------------+          +-------------------------+
    | - cardNumber: String    |          | - email: String         |          | - phoneNumber: String   |
    +-------------------------+          +-------------------------+          +-------------------------+
    | + pay(amount: double): void |      | + pay(amount: double): void |      | + pay(amount: double): void |
    +-------------------------+          +-------------------------+          +-------------------------+
               ^
               |
        +-------------------------+
        |     PaymentContext      |  <--- Context
        +-------------------------+
        | - paymentStrategy: PaymentStrategy |
        +-------------------------+
        | + setPaymentStrategy(strategy: PaymentStrategy): void |
        | + pay(amount: double): void                          |
        +-------------------------+

- **Chain of Responsibility**: Passes a request along a chain of handlers until it is handled.

```
Client
   |
   v
LoggerChain
   |
   +--> InfoLogger
   |       |
   |       +--> If level matches, process message
   |       +--> Else, pass to DebugLogger
   |
   +--> DebugLogger
   |       |
   |       +--> If level matches, process message
   |       +--> Else, pass to ErrorLogger
   |
   +--> ErrorLogger
           |
           +--> If level matches, process message
           +--> Else, end of chain
```

        +-------------------------+
        |        Logger           |  <--- Abstract Handler
        +-------------------------+
        | - level: int            |
        | - nextLogger: Logger    |
        +-------------------------+
        | + setNextLogger(Logger): void |
        | + logMessage(level: int, message: String): void |
        | + write(message: String): void (abstract)      |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+          +-------------------------+
    |       InfoLogger        |          |      DebugLogger        |          |      ErrorLogger        |
    +-------------------------+          +-------------------------+          +-------------------------+
    | + write(message: String): void |   | + write(message: String): void |   | + write(message: String): void |
    +-------------------------+          +-------------------------+          +-------------------------+

- **Command**: Encapsulates a request as an object, allowing parameterization and queuing of requests.


```
Client
   |
   v
RemoteControl (Invoker)
   |
   +--> Command (Interface)
           |
           +--> LightOnCommand (Concrete Command)
           |       |
           |       +--> Light (Receiver)
           |
           +--> FanOnCommand (Concrete Command)
                   |
                   +--> Fan (Receiver)
```

        +-------------------------+
        |       Command           |  <--- Command Interface
        +-------------------------+
        | + execute(): void       |
        | + undo(): void          |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |   LightOnCommand        |          |   FanOnCommand          |
    +-------------------------+          +-------------------------+
    | - light: Light          |          | - fan: Fan              |
    | + execute(): void       |          | + execute(): void       |
    | + undo(): void          |          | + undo(): void          |
    +-------------------------+          +-------------------------+
               ^
               |
        +-------------------------+
        |       RemoteControl     |  <--- Invoker
        +-------------------------+
        | - command: Command      |
        | + setCommand(Command): void |
        | + pressButton(): void   |
        | + pressUndo(): void     |
        +-------------------------+
               ^
               |
    +-------------------------+
    |       Light             |  <--- Receiver
    +-------------------------+
    | + turnOn(): void        |
    | + turnOff(): void       |
    +-------------------------+


- **State**: Allows an object to alter its behavior when its internal state changes.


```
Client
   |
   v
TrafficLightContext (Context)
   |
   +--> currentState.handleState(context)
           |
           +--> RedState.handleState(context)
           |       |
           |       +--> Transition to GreenState
           |
           +--> GreenState.handleState(context)
           |       |
           |       +--> Transition to YellowState
           |
           +--> YellowState.handleState(context)
                   |
                   +--> Transition to RedState
```


        +-------------------------+
        |   TrafficLightState     |  <--- State Interface
        +-------------------------+
        | + handleState(context: TrafficLightContext): void |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+          +-------------------------+
    |       RedState          |          |      GreenState         |          |      YellowState        |
    +-------------------------+          +-------------------------+          +-------------------------+
    | + handleState(context): void |     | + handleState(context): void |     | + handleState(context): void |
    +-------------------------+          +-------------------------+          +-------------------------+
               ^
               |
        +-------------------------+
        |   TrafficLightContext   |  <--- Context
        +-------------------------+
        | - currentState: TrafficLightState |
        +-------------------------+
        | + setState(state: TrafficLightState): void |
        | + changeState(): void                     |
        +-------------------------+


- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.


```
Client
   |
   v
NewsAgency (Subject)
   |
   +--> addObserver(Observer)
   |
   +--> setLatestNews(news)
           |
           +--> notifyObservers()
                   |
                   +--> EmailSubscriber.update(news)
                   +--> MobileSubscriber.update(news)
```

        +-------------------------+
        |       Subject           |  <--- Subject Interface
        +-------------------------+
        | + addObserver(o: Observer): void |
        | + removeObserver(o: Observer): void |
        | + notifyObservers(): void         |
        +-------------------------+
               ^
               |
        +-------------------------+
        |      NewsAgency         |  <--- Concrete Subject
        +-------------------------+
        | - observers: List<Observer>      |
        | - latestNews: String             |
        +-------------------------+
        | + addObserver(o: Observer): void |
        | + removeObserver(o: Observer): void |
        | + notifyObservers(): void         |
        | + setLatestNews(news: String): void |
        +-------------------------+
               ^
               |
        +-------------------------+
        |       Observer          |  <--- Observer Interface
        +-------------------------+
        | + update(news: String): void    |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |    EmailSubscriber      |          |    MobileSubscriber     |
    +-------------------------+          +-------------------------+
    | - name: String          |          | - name: String          |
    +-------------------------+          +-------------------------+
    | + update(news: String): void |     | + update(news: String): void |
    +-------------------------+          +-------------------------+


- **Template**: Defines the skeleton of an algorithm, deferring some steps to subclasses.

```
Client
   |
   v
DataProcessor (Abstract Class)
   |
   +--> process() (Template Method)
           |
           +--> readData() (Abstract Method - implemented by subclasses)
           |
           +--> processData() (Abstract Method - implemented by subclasses)
           |
           +--> saveData() (Concrete Method - common to all subclasses)
```

        +-------------------------+
        |     DataProcessor       |  <--- Abstract Class
        +-------------------------+
        | + process(): void       |  // Template Method
        | + readData(): void      |  // Abstract Method
        | + processData(): void   |  // Abstract Method
        | + saveData(): void      |  // Concrete Method
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |   CSVDataProcessor      |          |   JSONDataProcessor     |
    +-------------------------+          +-------------------------+
    | + readData(): void      |          | + readData(): void      |
    | + processData(): void   |          | + processData(): void   |
    +-------------------------+          +-------------------------+


- **Interpreter**: Defines a representation for a language's grammar and provides an interpreter to evaluate sentences in the language. It is commonly used for parsing and interpreting expressions.

```
Client
   |
   v
Expression (Interface)
   |
   +--> NumberExpression (Terminal Expression)
   |
   +--> AddExpression (Non-Terminal Expression)
   |       |
   |       +--> NumberExpression (Left Operand)
   |       +--> NumberExpression (Right Operand)
   |
   +--> SubtractExpression (Non-Terminal Expression)
           |
           +--> AddExpression (Left Operand)
           +--> NumberExpression (Right Operand)
```


        +-------------------------+
        |      Expression         |  <--- Abstract Expression
        +-------------------------+
        | + interpret(): int      |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |   NumberExpression      |          |   AddExpression         |
    +-------------------------+          +-------------------------+
    | - number: int           |          | - leftExpression: Expression |
    | + interpret(): int      |          | - rightExpression: Expression|
    +-------------------------+          | + interpret(): int      |
                                         +-------------------------+
                                                   ^
                                                   |
                                         +-------------------------+
                                         |   SubtractExpression    |
                                         +-------------------------+
                                         | - leftExpression: Expression |
                                         | - rightExpression: Expression|
                                         | + interpret(): int      |
                                         +-------------------------+

- **Iterator**: Provides a way to access the elements of a collection sequentially without exposing its underlying representation.

```
Client
   |
   v
BookCollection (Concrete Collection)
   |
   +--> createIterator()
           |
           v
BookIterator (Concrete Iterator)
   |
   +--> hasNext() -> Checks if there are more elements
   |
   +--> next() -> Returns the next element
```


        +-------------------------+
        |       Iterator<T>       |  <--- Iterator Interface
        +-------------------------+
        | + hasNext(): boolean    |
        | + next(): T             |
        +-------------------------+
               ^
               |
    +-------------------------+
    |     BookIterator        |  <--- Concrete Iterator
    +-------------------------+
    | - books: List<Book>     |
    | - position: int         |
    +-------------------------+
    | + hasNext(): boolean    |
    | + next(): Book          |
    +-------------------------+

        +-------------------------+
        | IterableCollection<T>   |  <--- Aggregate Interface
        +-------------------------+
        | + createIterator():     |
        |       Iterator<T>       |
        +-------------------------+
               ^
               |
    +-------------------------+
    |     BookCollection      |  <--- Concrete Collection
    +-------------------------+
    | - books: List<Book>     |
    +-------------------------+
    | + addBook(book: Book): void |
    | + createIterator(): Iterator<Book> |
    +-------------------------+

        +-------------------------+
        |         Book            |  <--- Element
        +-------------------------+
        | - title: String         |
        | - author: String        |
        +-------------------------+
        | + toString(): String    |
        +-------------------------+

- **Mediator**: Defines an object (the mediator) to encapsulate how a set of objects interact. This pattern promotes loose coupling by preventing objects from referring to each other explicitly and allows their interaction to be managed by the mediator.

```
Client
   |
   v
ChatRoom (Mediator)
   |
   +--> addUser(User)
   |
   +--> sendMessage(message, sender)
           |
           +--> Notify all users except the sender
```

        +-------------------------+
        |     ChatMediator        |  <--- Mediator Interface
        +-------------------------+
        | + sendMessage(String, User): void |
        | + addUser(User): void             |
        +-------------------------+
               ^
               |
        +-------------------------+
        |       ChatRoom          |  <--- Concrete Mediator
        +-------------------------+
        | - users: List<User>     |
        +-------------------------+
        | + sendMessage(String, User): void |
        | + addUser(User): void             |
        +-------------------------+
               ^
               |
        +-------------------------+
        |        User             |  <--- Colleague (Abstract Class)
        +-------------------------+
        | - mediator: ChatMediator|
        | - name: String          |
        +-------------------------+
        | + send(String): void    |
        | + receive(String): void |
        +-------------------------+
               ^
               |
        +-------------------------+
        |      ChatUser           |  <--- Concrete Colleague
        +-------------------------+
        | + send(String): void    |
        | + receive(String): void |
        +-------------------------+

- **Memento**: Allows an object to save and restore its state without exposing its internal details. It is commonly used for undo/redo functionality.

```
Client
   |
   v
TextEditor (Originator)
   |
   +--> save() -> Creates a Memento
   |
   +--> restore(memento) -> Restores state from a Memento
   |
Caretaker
   |
   +--> saveState(memento) -> Saves Memento to undo stack
   |
   +--> undo() -> Retrieves the last Memento from undo stack
   |
   +--> redo() -> Retrieves the last Memento from redo stack
```

        +-------------------------+
        |        Memento          |  <--- Memento
        +-------------------------+
        | - state: String         |
        +-------------------------+
        | + getState(): String    |
        +-------------------------+

        +-------------------------+
        |      TextEditor         |  <--- Originator
        +-------------------------+
        | - text: String          |
        +-------------------------+
        | + setText(text: String): void |
        | + getText(): String     |
        | + save(): Memento       |
        | + restore(memento: Memento): void |
        +-------------------------+

        +-------------------------+
        |       Caretaker         |  <--- Caretaker
        +-------------------------+
        | - undoStack: Stack<Memento> |
        | - redoStack: Stack<Memento> |
        +-------------------------+
        | + saveState(memento: Memento): void |
        | + undo(): Memento         |
        | + redo(): Memento         |
        +-------------------------+

- **Visitor**: Allows you to add new operations to a group of objects without modifying their structure. It achieves this by separating the operation logic into a separate object called the Visitor.

```
Client
   |
   v
FileElement (Element Interface)
   |
   +--> accept(Visitor)
           |
           +--> Visitor.visit(Element)
                   |
                   +--> CompressionVisitor.visit(Element)
                   +--> VirusScanVisitor.visit(Element)
```

        +-------------------------+
        |        Visitor          |  <--- Visitor Interface
        +-------------------------+
        | + visit(TextFile): void |
        | + visit(ImageFile): void|
        | + visit(VideoFile): void|
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+
    |  CompressionVisitor     |          |    VirusScanVisitor     |
    +-------------------------+          +-------------------------+
    | + visit(TextFile): void |          | + visit(TextFile): void |
    | + visit(ImageFile): void|          | + visit(ImageFile): void|
    | + visit(VideoFile): void|          | + visit(VideoFile): void|
    +-------------------------+          +-------------------------+

        +-------------------------+
        |      FileElement        |  <--- Element Interface
        +-------------------------+
        | + accept(Visitor): void |
        +-------------------------+
               ^
               |
    +-------------------------+          +-------------------------+          +-------------------------+
    |       TextFile          |          |       ImageFile         |          |       VideoFile         |
    +-------------------------+          +-------------------------+          +-------------------------+
    | - name: String          |          | - name: String          |          | - name: String          |
    +-------------------------+          +-------------------------+          +-------------------------+
    | + accept(Visitor): void |          | + accept(Visitor): void |          | + accept(Visitor): void |
    | + getName(): String     |          | + getName(): String     |          | + getName(): String     |
    +-------------------------+          +-------------------------+          +-------------------------+


---

## Architecture Patterns
Architecture patterns provide solutions to common high-level software design problems.

- **MVVM (Model-View-ViewModel)**: Separates the development of the graphical user interface from the business logic or back-end logic.

```
Client
   |
   v
LoginView (View)
   |
   +--> setUser(username, password) -> LoginViewModel (ViewModel)
   |
   +--> validateUser() -> LoginViewModel (ViewModel)
           |
           +--> isValid() -> UserModel (Model)
```

        +-------------------------+
        |       UserModel         |  <--- Model
        +-------------------------+
        | - username: String      |
        | - password: String      |
        +-------------------------+
        | + isValid(): boolean    |
        | + getUsername(): String |
        | + getPassword(): String |
        +-------------------------+
               ^
               |
        +-------------------------+
        |     LoginViewModel      |  <--- ViewModel
        +-------------------------+
        | - userModel: UserModel  |
        +-------------------------+
        | + setUser(username, password): void |
        | + validateUser(): String            |
        +-------------------------+
               ^
               |
        +-------------------------+
        |       LoginView         |  <--- View
        +-------------------------+
        | - viewModel: LoginViewModel |
        +-------------------------+
        | + display(): void       |
        +-------------------------+

- **Layered/n-tier Architecture**:  Organizes an application into layers, where each layer has a specific responsibility. This pattern promotes separation of concerns, making the application easier to maintain and scale.

```
Client
   |
   v
ProductController (Presentation Layer)
   |
   +--> getProductById(productId) -> ProductService (Service Layer)
           |
           +--> findById(productId) -> ProductRepository (Data Access Layer)
                   |
                   +--> Retrieve product from database
```

        +-------------------------+
        |   ProductController     |  <--- Presentation Layer
        +-------------------------+
        | - productService: ProductService |
        +-------------------------+
        | + displayProductDetails(productId: int): void |
        +-------------------------+
               |
               v
        +-------------------------+
        |     ProductService      |  <--- Service Layer
        +-------------------------+
        | - productRepository: ProductRepository |
        +-------------------------+
        | + getProductById(productId: int): Product |
        +-------------------------+
               |
               v
        +-------------------------+
        |    ProductRepository    |  <--- Data Access Layer
        +-------------------------+
        | - productDatabase: Map<Integer, Product> |
        +-------------------------+
        | + findById(productId: int): Product      |
        +-------------------------+
               |
               v
        +-------------------------+
        |        Product          |  <--- Model
        +-------------------------+
        | - id: int               |
        | - name: String          |
        | - price: double         |
        +-------------------------+
        | + getId(): int          |
        | + getName(): String     |
        | + getPrice(): double    |
        +-------------------------+


- **WPF (Windows Presentation Foundation)**: A UI framework for building desktop client applications in Windows.

- **Microservices**: An architectural style that structures an application as a collection of small, autonomous services.

```
Client
   |
   v
OrderService (Microservice)
   |
   +--> getProductById(productId) -> ProductService (Microservice)
   |
   +--> processPayment(orderDetails, amount) -> PaymentService (Microservice)
   |
   +--> sendNotification(message) -> NotificationService (Microservice)
```

        +-------------------------+
        |     ProductService      |  <--- Microservice
        +-------------------------+
        | + getProductById(id): String |
        +-------------------------+
               ^
               |
        +-------------------------+
        |      OrderService       |  <--- Microservice
        +-------------------------+
        | - productService: ProductService |
        +-------------------------+
        | + placeOrder(id, qty): void      |
        +-------------------------+
               ^
               |
        +-------------------------+
        |     PaymentService      |  <--- Microservice
        +-------------------------+
        | + processPayment(order, amount): void |
        +-------------------------+
               ^
               |
        +-------------------------+
        |  NotificationService    |  <--- Microservice
        +-------------------------+
        | + sendNotification(msg): void      |
        +-------------------------+


- **MVC (Model-View-Controller)**: Separates an application into three interconnected components to separate internal representations of information from the ways information is presented and accepted.

```
Client
   |
   v
StudentController (Controller)
   |
   +--> Updates the Student (Model)
   |
   +--> Refreshes the StudentView (View)
           |
           +--> Displays updated details
```

        +-------------------------+
        |       Student           |  <--- Model
        +-------------------------+
        | - name: String          |
        | - rollNo: int           |
        +-------------------------+
        | + getName(): String     |
        | + setName(name: String): void |
        | + getRollNo(): int      |
        | + setRollNo(rollNo: int): void |
        +-------------------------+
               ^
               |
        +-------------------------+
        |    StudentController    |  <--- Controller
        +-------------------------+
        | - model: Student        |
        | - view: StudentView     |
        +-------------------------+
        | + setStudentName(name: String): void |
        | + getStudentName(): String           |
        | + setStudentRollNo(rollNo: int): void|
        | + getStudentRollNo(): int            |
        | + updateView(): void                 |
        +-------------------------+
               ^
               |
        +-------------------------+
        |      StudentView        |  <--- View
        +-------------------------+
        | + printStudentDetails(name: String, rollNo: int): void |
        +-------------------------+
