package com.designpattern.patterns.creational.abstractfactory;

public interface AbstractFactory<T> {
  T create(String type);
}