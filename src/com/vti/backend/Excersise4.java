package com.vti.backend;

public class Excersise4 {
    // Quesstion 1 A
    private int id;

    private String name;
    private String hometown;
    private Float score;
// Question1 b
    public void Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = (float) 0;
    }
// question 1c
public void setScore(Float score) {
    this.score = score;
}
//question 1d
public void plusScore(Float score) {
    this.score = this.score + score;
}
    @Override
    public String toString() {
        String rank = null;
        if (this.score < 4.0) {
            rank = "Yếu";
        } else if (this.score < 6.0) {
            rank = "Trung Bình";
        } else if (this.score < 8.0) {
            rank = "Khá";
        }else {
            rank = "Giỏi";
        }
        return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + ", Xếp loại=" + rank + "]";
    }
}


