package com.designpattern.patterns.structural.composite;

public class CompositePatternDemo {
  public static void run() {
    // Leaf objects
    Employee dev1 = new Developer("Alice", "Frontend Developer");
    Employee dev2 = new Developer("Bob", "Backend Developer");
    Employee designer = new Designer("Charlie", "UI/UX Designer");

    // Composite object (Manager)
    Manager manager = new Manager("David", "Team Lead");
    manager.addEmployee(dev1);
    manager.addEmployee(dev2);
    manager.addEmployee(designer);

    // Another Composite object (General Manager)
    Manager generalManager = new Manager("Eve", "General Manager");
    generalManager.addEmployee(manager);

    // Display the hierarchy
    System.out.println("Organization Structure:");
    generalManager.showDetails();
  }
}