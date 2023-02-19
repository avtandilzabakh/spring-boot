package com.example.javarestapi1.service;

import com.example.javarestapi1.domain.Student;
import com.example.javarestapi1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional =
                repository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        repository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean b = repository.existsById(studentId);
        if (!b){
            throw new IllegalStateException("this id does not exist");
        }
        repository.deleteById(studentId);
    }
}
