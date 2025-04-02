package com.designpattern.solid.srp;

// Class responsible for printing the invoice
public class InvoicePrinter {
  public void printInvoice(Invoice invoice) {
    System.out.println("Invoice ID: " + invoice.getId());
    System.out.println("Amount: $" + invoice.getAmount());
  }
}