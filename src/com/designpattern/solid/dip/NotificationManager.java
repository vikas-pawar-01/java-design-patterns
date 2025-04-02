package com.designpattern.solid.dip;

public class NotificationManager {
  private NotificationService notificationService;

  public NotificationManager(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void notify(String message) {
    notificationService.sendNotification(message);
  }
}