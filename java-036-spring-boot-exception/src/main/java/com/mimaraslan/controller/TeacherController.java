package com.mimaraslan.controller;


// APIs

import com.mimaraslan.exception.ResourceNotFoundException_404;
import com.mimaraslan.model.Teacher;
import com.mimaraslan.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

// http://localhost/api/v1

@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    // ESKI usul kod
/*
    @Autowired
    private  TeacherService teacherService;
 */

    // YENI
    private final  TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

  /*
    getAllTeacher
    getOneTeacher
    createTeacher
    deleteTeacher
    updateTeacher
    */

    // GET - SELECT ALL
    // http://localhost:8090/api/v1/teacher
    @GetMapping("/teacher")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/teacher/v1/1
    @GetMapping("/teacher/v1/{id}")
    public Teacher getOneTeacherV1(@PathVariable Long id) {
        return teacherService.getOneTeacherV1(id);
    }



    @GetMapping("/teacher/{id}")
    public ResponseEntity<Teacher> getOneTeacher(@PathVariable Long id)  throws ResourceNotFoundException_404 {
        return teacherService.getOneTeacher(id);
    }




    // POST - INSERT
    // http://localhost:8090/api/v1/teacher
    @PostMapping ("/teacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }


    // DELETE - DELETE
    // http://localhost:8090/api/v1/teacher/1
    @DeleteMapping ("/teacher/{id}")
    public Map<String, Boolean> deleteTeacher(@PathVariable Long id) throws ResourceNotFoundException_404 {
        return teacherService.deleteTeacher(id);
    }



/*
    // PUT - UPDATE
    // http://localhost:8090/api/v1/teacher/1
    @PutMapping("/teacher/{id}")
    public Teacher updateTeacher(@PathVariable Long id,
                                 @RequestBody Teacher teacher) throws ResourceNotFoundException {
        return teacherService.updateTeacher(id, teacher);
    }
*/

    // PUT - UPDATE
    // http://localhost:8090/api/v1/teacher/1
    @PutMapping("/teacher/{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id,
                                 @RequestBody Teacher teacher) throws ResourceNotFoundException_404 {
        return teacherService.updateTeacher(id, teacher);
    }


}
