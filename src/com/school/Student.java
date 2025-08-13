package com.school;

public class Student {
    private static int nextId = 1;
    private String name;
    private int id;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }
    public int getStudentId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Student: " + getName() + ", ID: " + getStudentId());
    }
}