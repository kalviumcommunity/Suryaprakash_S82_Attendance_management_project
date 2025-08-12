package com.school;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[]=new Student[2];
        for(int i=0;i<2;i++){
            students[i] = new Student(sc.nextLine());
        }
        for(Student s: students){
            s.displayDetails();
        }
    }
}