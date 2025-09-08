package com.school;

public class AttendanceRecord implements Storable {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        if (status.equals("Present") || status.equals("Absent")) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Invalid attendance status.");
        }
    }

    public int getStudentId() {
        return studentId;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId +
                           ", Course ID: " + courseId +
                           ", Status: " + status);
    }

    @Override
    public String toDataString() {
        return studentId + "," + courseId + "," + status;
    }
}
