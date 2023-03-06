package com.vti.entity;

import java.util.Scanner;

public class Student {
    private int id ;
    private String name ;
    private String hometown;
    private float grading ;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        String name = scanner.nextLine();
        this.name = name;
        System.out.println("Nhap vao dia chi");
        String hometown = scanner.nextLine();
        this.hometown = hometown ;
        this.grading = 0;
    }

    public void setGrading(float grading) {
        this.grading = grading;
    }

    public void  addGrading(float grading ){
        this.grading += grading ;
    }

    @Override
    public String toString() {
        String type = "";
        if (this.grading < 4){
            type = "yeu";
        } else if (this.grading >= 4 && this.grading < 6){
            type = "Trung binh ";
        } else if (this.grading >= 6 && this.grading < 8){
            type = "Kha";
        }else {
            type = "Gioi";
        }
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", grading=" + grading +
                '}';
    }
}
