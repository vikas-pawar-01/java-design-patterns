package com.designpattern.patterns.behavioral.iterator;

public class IteratorPatternDemo {
  public static void run() {
    BookCollection bookCollection = new BookCollection();

    bookCollection.addBook(new Book("Design Patterns", "Erich Gamma"));
    bookCollection.addBook(new Book("Clean Code", "Robert C. Martin"));
    bookCollection.addBook(new Book("Refactoring", "Martin Fowler"));

    Iterator<Book> iterator = bookCollection.createIterator();

    System.out.println("Books in the collection:");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}