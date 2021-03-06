package com.morozov.spring;

import com.morozov.spring.model.Parents;
import com.morozov.spring.repositories.ParentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Application implements ApplicationRunner {
    private final ParentsRepository parentsRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        parentsRepository.save(new Parents("Ivan", "Ivanov", null, null));
        parentsRepository.save(new Parents("Petr", "Petrov", null, null));
    }
}
