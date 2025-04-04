package com.designpattern.patterns.behavioral.iterator;

import java.util.List;

public class BookIterator implements Iterator<Book> {
  private List<Book> books;
  private int position = 0;

  public BookIterator(List<Book> books) {
    this.books = books;
  }

  @Override
  public boolean hasNext() {
    return position < books.size();
  }

  @Override
  public Book next() {
    return books.get(position++);
  }
}