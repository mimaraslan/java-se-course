package com.mimaraslan.service;

import com.mimaraslan.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Transactional
@Service
public class StudentService {

    // Data katmanını enjekte eder.
    @Autowired
    StudentRepository studentRepository;

}
