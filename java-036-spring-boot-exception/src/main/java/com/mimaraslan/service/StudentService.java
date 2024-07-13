package com.mimaraslan.service;

import com.mimaraslan.exception.ResourceNotFoundException_404;
import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Transactional
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



    public Student getOneStudentV1(Long id) {
        return studentRepository.findById(id).get();
        // FIXME - hata mesajını incele
        //return studentRepository.getReferenceById(id);
    }




    public ResponseEntity <Student> getOneStudent(Long id) throws ResourceNotFoundException_404 {

        // Kontrol id
        Student student = studentRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Student not found ID:"+ id)    );


        return ResponseEntity.ok().body(student);
    }

    public Student createStudent(Student student) {

        // FIXME null dönülmeden ne yapabilirsiniz?
        if (studentRepository.findById(student.getId()).isPresent())
            return null;


        return studentRepository.save(student);
    }

    public Map<String, Boolean> deleteStudent(Long id) throws ResourceNotFoundException_404 {

        // Kontrol id
        Student student = studentRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Student not found ID:"+ id)    );

         studentRepository.deleteById(id);


        Map<String, Boolean> deleteResult = new HashMap<>();
        deleteResult.put("Deleted ID: " + id,   Boolean.TRUE);

        return deleteResult;
    }

    public Student updateStudentV1(Long id, Student student) throws ResourceNotFoundException_404 {

        // Kontrol id
        Student studentInfo = studentRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Student not found ID:"+ id)    );


        student.setId(id);
        return studentRepository.save(student);
    }


    public ResponseEntity <Student> updateStudent(Long id, Student student) throws ResourceNotFoundException_404 {

        // Kontrol id
        Student studentInfo = studentRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Student not found ID:"+ id)    );

        student.setId(id);
        return  ResponseEntity.ok(studentRepository.save(student));
    }


}
