package com.Zeyad.restdemo.exception;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(value = {StudentNotFoundException.class})
    public ResponseEntity<Object> handleStudentNotFoundException(
            StudentNotFoundException studentNotFoundException)
    {
        StudentException studentException = new StudentException(
                studentNotFoundException.getMessage(),//message
                studentNotFoundException.getCause(),// throwable
                HttpStatus.NOT_FOUND //httpStatus
        );
        return new ResponseEntity<>(studentException,HttpStatus.NOT_FOUND);
    }


}
