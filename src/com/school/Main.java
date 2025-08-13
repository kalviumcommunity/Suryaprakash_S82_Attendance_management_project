package com.school;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[]=new Student[2];
        for(int i=0;i<2;i++){
            students[i] = new Student(sc.nextLine());
        }
        Course courses[]=new Course[2];
        for(int i=0;i<2;i++){
            courses[i] = new Course(sc.nextLine());
        }
        for(Student s: students){
            s.displayDetails();
        }
        for(Course c: courses){
            c.displayDetails();
        }
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[1].getCourseId(), "Late")); // Invalid test

        // Display Attendance Records
        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        sc.close();
    }
}