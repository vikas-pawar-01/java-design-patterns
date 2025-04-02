package com.designpattern.solid.srp;

// Class responsible for managing invoice data
public class Invoice {
  private String id;
  private double amount;

  public Invoice(String id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  public String getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }
}