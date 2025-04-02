package com.designpattern.solid.srp;

public class SingleResponsibilityDemo {
  public static void run() {
    Invoice invoice = new Invoice("123", 100.0);
    InvoicePrinter printer = new InvoicePrinter();
    printer.printInvoice(invoice);
  }
}