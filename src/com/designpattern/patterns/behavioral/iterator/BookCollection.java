package com.designpattern.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IterableCollection<Book> {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public Iterator<Book> createIterator() {
    return new BookIterator(books);
  }
}