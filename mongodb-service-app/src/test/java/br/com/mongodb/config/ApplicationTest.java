package br.com.mongodb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@EnableAutoConfiguration
@ComponentScan
public class ApplicationTest {
    public static void main(String[] args) throws IOException {
        new SpringApplication(ApplicationTest.class).run(args);
    }
}