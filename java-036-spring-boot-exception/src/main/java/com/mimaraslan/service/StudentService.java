package com.mimaraslan.service;

import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
/*
    @Autowired
    private StudentRepository studentRepository;
*/

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    /*
    getAllStudent
    getOneStudent
    createStudent
    deleteStudent
    updateStudent
    */

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getOneStudent(Long id) {
        //return studentRepository.findById(id).get();
        return studentRepository.getReferenceById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Map<String, Boolean> deleteStudent(Long id) {
         studentRepository.deleteById(id);
        Map<String, Boolean> deleteResult = new HashMap<>();
        deleteResult.put("Deleted ID: " + id,   Boolean.TRUE);
        return deleteResult;
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }


}
