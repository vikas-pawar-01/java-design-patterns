package com.designpattern.patterns.prototype;

public abstract class Shape implements Prototype {
  private String id;
  private String type;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public abstract Shape clone();
}