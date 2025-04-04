package com.designpattern.architecture.mvc;

public class MVCPatternDemo {
    public static void run() {
        // Create the model
        Student model = new Student("John Doe", 1);

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update the model
        controller.setStudentName("Jane Doe");
        controller.setStudentRollNo(2);

        // Display updated details
        controller.updateView();
    }
}