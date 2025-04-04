package com.designpattern.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
  private List<User> users;

  public ChatRoom() {
    this.users = new ArrayList<>();
  }

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void sendMessage(String message, User sender) {
    for (User user : users) {
      // Do not send the message to the sender
      if (user != sender) {
        user.receive(message);
      }
    }
  }
}