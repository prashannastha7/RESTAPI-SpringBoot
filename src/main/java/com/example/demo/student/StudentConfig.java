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
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
             Student prashanna = new Student(

                    "Prashanna",
                    "prashanna@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 21)
            );

            Student sus = new Student(
                    "Sus",
                    "sus74@gmail.com",
                    LocalDate.of(2002, Month.OCTOBER, 10)
            );

            repository.saveAll(
                    List.of(prashanna, sus)
            );
        };

    }
}
