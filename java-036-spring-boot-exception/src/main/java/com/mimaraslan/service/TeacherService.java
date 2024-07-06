package com.mimaraslan.service;

import com.mimaraslan.exception.ResourceNotFoundException_404;
import com.mimaraslan.model.Teacher;
import com.mimaraslan.repository.TeacherRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherService {
/*
    @Autowired
    private TeacherRepository teacherRepository;
*/

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    /*
    getAllTeacher
    getOneTeacher
    createTeacher
    deleteTeacher
    updateTeacher
    */

    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }



    public Teacher getOneTeacherV1(Long id) {
        return teacherRepository.findById(id).get();
        // FIXME - hata mesajını incele
        //return teacherRepository.getReferenceById(id);
    }




    public ResponseEntity <Teacher> getOneTeacher(Long id) throws ResourceNotFoundException_404 {

        // Kontrol id
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Teacher not found ID:"+ id)    );


        return ResponseEntity.ok().body(teacher);
    }

    public Teacher createTeacher(Teacher teacher) {

        // FIXME null dönülmeden ne yapabilirsiniz?
        if (teacherRepository.findById(teacher.getId()).isPresent())
            return null;


        return teacherRepository.save(teacher);
    }

    public Map<String, Boolean> deleteTeacher(Long id) throws ResourceNotFoundException_404 {

        // Kontrol id
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Teacher not found ID:"+ id)    );

         teacherRepository.deleteById(id);


        Map<String, Boolean> deleteResult = new HashMap<>();
        deleteResult.put("Deleted ID: " + id,   Boolean.TRUE);

        return deleteResult;
    }

    public Teacher updateTeacherV1(Long id, Teacher teacher) throws ResourceNotFoundException_404 {

        // Kontrol id
        Teacher teacherInfo = teacherRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Teacher not found ID:"+ id)    );


        teacher.setId(id);
        return teacherRepository.save(teacher);
    }


    public ResponseEntity <Teacher> updateTeacher(Long id, Teacher teacher) throws ResourceNotFoundException_404 {

        // Kontrol id
        Teacher teacherInfo = teacherRepository.findById(id)
                .orElseThrow(    ()-> new ResourceNotFoundException_404("Teacher not found ID:"+ id)    );

        teacher.setId(id);
        return  ResponseEntity.ok(teacherRepository.save(teacher));
    }


}
