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
        Memento undoState = caretaker.undo();
        if (undoState != null) {
            editor.restore(undoState);
        }
        System.out.println("After Undo: " + editor.getText());

        // Redo
        Memento redoState = caretaker.redo();
        if (redoState != null) {
            editor.restore(redoState);
        }
        System.out.println("After Redo: " + editor.getText());
    }
}