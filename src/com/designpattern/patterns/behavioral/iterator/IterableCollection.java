package com.designpattern.patterns.behavioral.iterator;

public interface IterableCollection<T> {
  Iterator<T> createIterator();
}