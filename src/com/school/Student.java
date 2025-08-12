package com.school;

public class Student {
    private static int nextId = 1;
    public String name;
    public int id;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public void displayDetails() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}