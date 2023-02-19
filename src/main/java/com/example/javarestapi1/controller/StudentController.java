package com.example.javarestapi1.controller;

import com.example.javarestapi1.domain.Student;
import com.example.javarestapi1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1" )
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/get" )
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("/post")
    public void registerNewStudent(@RequestBody Student student) {
        service.addNewStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("/{studentId}") Long studentId){
        service.deleteStudent(studentId);
    }
}
