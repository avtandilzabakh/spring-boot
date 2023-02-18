package com.example.javarestapi1;

import com.example.javarestapi1.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class JavaRestApi1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaRestApi1Application.class, args);
    }

}
