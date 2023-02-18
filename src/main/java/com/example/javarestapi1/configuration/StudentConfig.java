package com.example.javarestapi1.configuration;

import com.example.javarestapi1.domain.Student;
import com.example.javarestapi1.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return args -> {
            Student marko = new Student(
                    "marko",
                    "marko@gmail.com",
                    LocalDate.of(2001, 5, 24));
            Student anna = new Student(
                    "anna",
                    "anna@gmail.com",
                    LocalDate.of(2003, 2, 22));
            repository.saveAll(
                    List.of(marko, anna)
            );
        };

    }

}
