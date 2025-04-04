package com.designpattern.patterns.behavioral.iterator;

public class Book {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book [Title: " + title + ", Author: " + author + "]";
  }
}