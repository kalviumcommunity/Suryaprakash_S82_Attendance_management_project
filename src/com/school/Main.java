package com.school;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Students
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "11th Grade");

        // Create Teacher
        Teacher t1 = new Teacher("Mr. Smith", "Mathematics");

        // Create Staff
        Staff st1 = new Staff("Mrs. Johnson", "Librarian");

        // Display Details
        System.out.println("\n--- People in School ---");
        s1.displayDetails();
        s2.displayDetails();
        t1.displayDetails();
        st1.displayDetails();

        // Create Courses
        Course c1 = new Course("Physics");
        Course c2 = new Course("Chemistry");

        // Display Courses
        System.out.println("\n--- Courses ---");
        c1.displayDetails();
        c2.displayDetails();

        // Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s1.getId(), c2.getCourseId(), "Late")); // Invalid test

        // Display Attendance
        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // ✅ Save Data to files (this must be INSIDE main method)
        FileStorageService storage = new FileStorageService();
        List<Student> students = Arrays.asList(s1, s2);
        List<Course> courses = Arrays.asList(c1, c2);

        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(attendanceLog, "attendance_log.txt");

        sc.close();
    }
}
