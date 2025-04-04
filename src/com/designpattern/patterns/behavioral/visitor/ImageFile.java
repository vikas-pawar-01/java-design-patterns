package com.designpattern.patterns.behavioral.visitor;

public class ImageFile implements FileElement {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}