package org.sblm.lib.dto;

public class Student extends User{
    private int rollNo;
    private String course;

    public Student() {
        super();
    }

    public Student(String name, String email, int rollNo, String course) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
