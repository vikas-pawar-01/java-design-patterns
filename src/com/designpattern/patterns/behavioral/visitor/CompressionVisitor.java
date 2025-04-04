package com.designpattern.patterns.behavioral.visitor;

public class CompressionVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Compressing text file: " + textFile.getName());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Compressing image file: " + imageFile.getName());
    }

    @Override
    public void visit(VideoFile videoFile) {
        System.out.println("Compressing video file: " + videoFile.getName());
    }
}