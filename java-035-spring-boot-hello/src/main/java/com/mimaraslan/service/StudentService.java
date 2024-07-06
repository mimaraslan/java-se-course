package com.mimaraslan.service;

import com.mimaraslan.model.Student;
import com.mimaraslan.repository.StudentRepository;
import org.springframework.transaction.annotation.Propagation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentService {

    // Data katmanını enjekte eder. - Eski
    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
          return studentRepository.findById(id).get();
//        return studentRepository.getReferenceById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Student student) {

        // FIXME güncelleme bu kısma taşınacak.

        return Optional.of(studentRepository.save(student));
    }

    public String deleteStudent(Long id) {

        Student studentInfo = studentRepository.getReferenceById(id);

        studentRepository.deleteById(id);

        // FIXME geri dönüşleri kontrol et.
        return  studentInfo.getFirstName() + " " + studentInfo.getLastName()
                + ": Başarılı olarak silindi.";
    }
}
