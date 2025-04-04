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
      Memento memento = undoStack.pop();
      redoStack.push(memento);
      return memento;
    }
    return null;
  }

  public Memento redo() {
    if (!redoStack.isEmpty()) {
      Memento memento = redoStack.pop();
      undoStack.push(memento);
      return memento;
    }
    return null;
  }
}