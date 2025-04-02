package com.designpattern.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
  private String name;
  private String position;
  private List<Employee> subordinates;

  public Manager(String name, String position) {
    this.name = name;
    this.position = position;
    this.subordinates = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    subordinates.add(employee);
  }

  public void removeEmployee(Employee employee) {
    subordinates.remove(employee);
  }

  @Override
  public void showDetails() {
    System.out.println("Manager: " + name + ", Position: " + position);
    for (Employee employee : subordinates) {
      employee.showDetails();
    }
  }
}