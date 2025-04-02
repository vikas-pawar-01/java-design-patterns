package com.designpattern.solid.dip;

public class DependencyInversionDemo {
  public static void run() {
    NotificationService emailService = new EmailNotificationService();
    NotificationManager manager = new NotificationManager(emailService);
    manager.notify("Hello, Dependency Inversion!");
  }
}