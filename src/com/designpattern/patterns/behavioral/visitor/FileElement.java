package com.designpattern.patterns.behavioral.visitor;

public interface FileElement {
    void accept(Visitor visitor);
}