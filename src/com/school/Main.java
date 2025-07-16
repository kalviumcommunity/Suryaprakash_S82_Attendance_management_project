package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Attendance System Project!");
        System.out.println("Session 1: Project Setup and Orientation Complete.");

        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        // Create and set details for students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student" + (i + 1), 100 + i);
        }

        // Create and set details for courses
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course("Course" + (i + 1), 200 + i);
        }

        // Display all students
        System.out.println("=== Students ===");
        for (Student s : students) {
            s.displayDetails();
            System.out.println();
        }

        // Display all courses
        System.out.println("=== Courses ===");
        for (Course c : courses) {
            c.displayDetails();
            System.out.println();
        }

        System.out.println("Session 2: Students and Courses Created Successfully.");
    }
}