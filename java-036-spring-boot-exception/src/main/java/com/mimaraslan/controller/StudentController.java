package com.mimaraslan.controller;


// APIs

import com.mimaraslan.model.Student;
import com.mimaraslan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// http://localhost/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    // ESKI usul kod
/*
    @Autowired
    private  StudentService studentService;
 */

    // YENI
    private final  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

  /*
    getAllStudent
    getOneStudent
    createStudent
    deleteStudent
    updateStudent
    */

    // GET - SELECT ALL
    // http://localhost:8090/api/v1/student
    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/student/1
    @GetMapping("/student/{id}")
    public Student getOneStudent(@PathVariable Long id) {
        return studentService.getOneStudent(id);
    }


    // POST - INSERT
    // http://localhost:8090/api/v1/student
    @PostMapping ("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }


    // DELETE - DELETE
    // http://localhost:8090/api/v1/student/1
    @DeleteMapping ("/student/{id}")
    public Map<String, Boolean> deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }


    // PUT - UPDATE
    // http://localhost:8090/api/v1/student/1
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }



}
