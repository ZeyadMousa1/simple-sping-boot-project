package com.Zeyad.restdemo.repository;

import com.Zeyad.restdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
