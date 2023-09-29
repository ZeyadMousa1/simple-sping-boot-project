package com.Zeyad.restdemo.cotroller;

import com.Zeyad.restdemo.model.Student;
import com.Zeyad.restdemo.response.ResponseHandler;
import com.Zeyad.restdemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentAPIController {


    StudentService studentService;

    public StudentAPIController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();

    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Object> getOneStudent(@PathVariable("id") Long studentId){
        return ResponseHandler.responseBuilder(
                "Get one Student",
                HttpStatus.OK,
                studentService.getStudent(studentId)
        );
//        return studentService.getStudent(studentId);
    }

    @PostMapping("/students")
    public String createNewStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return "Success";
    }

    @PutMapping("/students")
    public  String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "success";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable("id") Long studentId){
        studentService.deleteStudent(studentId);
        return "success";
    }
}


