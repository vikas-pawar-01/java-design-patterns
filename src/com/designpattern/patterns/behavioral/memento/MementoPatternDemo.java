package com.designpattern.patterns.behavioral.memento;

public class MementoPatternDemo {
  public static void run() {
    TextEditor editor = new TextEditor();
    Caretaker caretaker = new Caretaker();

    // Initial state
    editor.setText("Hello");
    caretaker.saveState(editor.save());
    System.out.println("Text: " + editor.getText());

    // Modify state
    editor.setText("Hello, World!");
    caretaker.saveState(editor.save());
    System.out.println("Text: " + editor.getText());

    // Undo
    editor.restore(caretaker.undo());
    System.out.println("After Undo: " + editor.getText());

    // Redo
    editor.restore(caretaker.redo());
    System.out.println("After Redo: " + editor.getText());
  }
}