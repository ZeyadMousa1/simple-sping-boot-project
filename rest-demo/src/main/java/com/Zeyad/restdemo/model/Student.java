package com.Zeyad.restdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class Student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhoneNumber;

    public Student(){

    }

    public Student(
            Long studentId, String studentName, String studentAddress, String studentPhoneNumber
    ){
        this.studentId = studentId;
        this.studentName= studentName;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }
}
