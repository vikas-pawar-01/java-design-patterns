package com.designpattern.solid.dip;

public class SMSNotificationService implements NotificationService {
  @Override
  public void sendNotification(String message) {
    System.out.println("Sending SMS: " + message);
  }
}