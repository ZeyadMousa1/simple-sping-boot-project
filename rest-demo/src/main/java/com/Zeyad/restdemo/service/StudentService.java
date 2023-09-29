package com.Zeyad.restdemo.service;

import com.Zeyad.restdemo.model.Student;
import com.Zeyad.restdemo.repository.StudentRepository;

import java.util.List;

public interface StudentService  {
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public  String deleteStudent(Long studentId);
    public Student getStudent(Long studentId);
    public List<Student> getAllStudents();
}
