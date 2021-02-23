package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
             Student Andre = new Student(
                    "Andre",
                    "Andre.colaris98@live.ca",
                    LocalDate.of(1998, Month.FEBRUARY, 25)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex@live.ca",
                    LocalDate.of(1963, Month.FEBRUARY, 25)
            );

            repository.saveAll(
                    List.of(Andre, Alex)
            );
        };
    }
}
