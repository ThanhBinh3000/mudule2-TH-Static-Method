package com.BinhAn;

public class Main {

    public static void main(String[] args) {
        Student.change();

        Student s1 =new Student(111, "hoang");
        Student s2 = new Student(222, "khang");
        Student s3 = new Student(333, "nam");


        s1.display();
        s2.display();
        s3.display();

    }
}
