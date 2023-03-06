package com.vti.frontend;

import com.vti.entity.Student;

public class Program2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student); // gradin = 0 -> yeu
        System.out.println("------------");
        student.setGrading(5);// gradin = 5 -> trung binh
        System.out.println(student);
        System.out.println("------------");
        student.addGrading(2);// grading = 5+2 -> Kha
        System.out.println(student);
    }
}
