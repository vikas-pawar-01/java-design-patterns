package com.designpattern.patterns.behavioral.visitor;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ImageFile imageFile);
    void visit(VideoFile videoFile);
}