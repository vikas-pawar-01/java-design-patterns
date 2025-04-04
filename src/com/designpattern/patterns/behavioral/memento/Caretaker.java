package com.designpattern.patterns.behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(Memento memento) {
        undoStack.push(memento);
        redoStack.clear(); // Clear redo stack when a new state is saved
    }

    public Memento undo() {
        if (!undoStack.isEmpty()) {
            Memento currentState = undoStack.pop(); // Move the current state to the redo stack
            redoStack.push(currentState);
            return !undoStack.isEmpty() ? undoStack.peek() : null; // Return the previous state
        }
        return null;
    }

    public Memento redo() {
        if (!redoStack.isEmpty()) {
            Memento redoState = redoStack.pop(); // Restore the last undone state
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}