package com.school;

public class Course {
    private static int nextCourseIdCounter=101;
    public String name;
    public int id;

    public Course(String name) {
        this.name = name;
        this.id = nextCourseIdCounter++;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + id + ", Name: " + name);
    }
}