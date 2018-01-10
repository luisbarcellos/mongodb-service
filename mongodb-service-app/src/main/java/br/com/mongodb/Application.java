package br.com.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.mongodb")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}