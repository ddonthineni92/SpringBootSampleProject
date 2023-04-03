package com.sampleproject;

import com.sampleproject.repo.PlayerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class IplCricketApplication implements CommandLineRunner {

    @Value("${app.message}")
    private String message;
    @Autowired
    private PlayerRepo playerRepo;

   public static void main(String[] args) {
       SpringApplication.run(IplCricketApplication.class,args);

    }

    @Override
    public void run(String... args) {

    }
}
