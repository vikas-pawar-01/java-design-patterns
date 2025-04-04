package com.designpattern.patterns.behavioral.visitor;

public class VideoFile implements FileElement {
    private String name;

    public VideoFile(String name) {
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