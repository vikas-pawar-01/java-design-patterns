package com.designpattern.patterns.behavioral.visitor;

public class VirusScanVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for viruses: " + textFile.getName());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Scanning image file for viruses: " + imageFile.getName());
    }

    @Override
    public void visit(VideoFile videoFile) {
        System.out.println("Scanning video file for viruses: " + videoFile.getName());
    }
}