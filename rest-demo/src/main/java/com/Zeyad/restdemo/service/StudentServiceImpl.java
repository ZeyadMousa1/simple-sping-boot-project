package com.Zeyad.restdemo.service;

import com.Zeyad.restdemo.exception.StudentNotFoundException;
import com.Zeyad.restdemo.model.Student;
import com.Zeyad.restdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public String createStudent(Student student) {
        Student st = studentRepository.save(student);
        if (st.getStudentName().isEmpty() && st.getStudentAddress().isEmpty() && st.getStudentPhoneNumber().isEmpty())
            throw new StudentNotFoundException("Student does not exist");
        studentRepository.save(student);
        return "Success created";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Success updated";
    }

    @Override
    public String deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
        return "Success deleted";
    }

    @Override
    public Student getStudent(Long studentId) {
        if (studentRepository.findById(studentId).isEmpty())
            throw new StudentNotFoundException("Student does not exist");
        return studentRepository.findById(studentId).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
