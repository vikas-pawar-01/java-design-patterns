package com.designpattern.solid.dip;

public class EmailNotificationService implements NotificationService {
  @Override
  public void sendNotification(String message) {
    System.out.println("Sending email: " + message);
  }
}