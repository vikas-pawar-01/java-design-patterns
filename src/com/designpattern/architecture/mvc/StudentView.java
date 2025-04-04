package com.designpattern.architecture.mvc;

public class StudentView {
    public void printStudentDetails(String studentName, int rollNo) {
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
    }
}