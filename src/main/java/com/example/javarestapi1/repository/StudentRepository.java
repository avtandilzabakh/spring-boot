package com.example.javarestapi1.repository;

import com.example.javarestapi1.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("select a from Student a where a.email =?1")
    Optional<Student> findStudentByEmail(String email);
}
