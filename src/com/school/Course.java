package com.school;

public class Course {
    public String name;
    public int id;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Course: " + name + ", ID: " + id);
    }
}