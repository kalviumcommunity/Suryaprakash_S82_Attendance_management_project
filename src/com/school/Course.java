package com.school;

public class Course implements Storable {
    private static int nextCourseIdCounter = 101;
    private String name;
    private int id;

    public Course(String name) {
        this.name = name;
        this.id = nextCourseIdCounter++;
    }

    public String getCourseName() {
        return name;
    }

    public int getCourseId() {
        return id;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + getCourseId() + ", Name: " + getCourseName());
    }

    @Override
    public String toDataString() {
        return id + "," + name;
    }
}
