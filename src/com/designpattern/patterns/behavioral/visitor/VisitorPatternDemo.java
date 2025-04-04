package com.designpattern.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void run() {
        List<FileElement> files = new ArrayList<>();
        files.add(new TextFile("document.txt"));
        files.add(new ImageFile("photo.jpg"));
        files.add(new VideoFile("movie.mp4"));

        Visitor compressionVisitor = new CompressionVisitor();
        Visitor virusScanVisitor = new VirusScanVisitor();

        System.out.println("Applying Compression Visitor:");
        for (FileElement file : files) {
            file.accept(compressionVisitor);
        }

        System.out.println("\nApplying Virus Scan Visitor:");
        for (FileElement file : files) {
            file.accept(virusScanVisitor);
        }
    }
}