package com.kodilla2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorProject2Application {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorProject2Application.class, args);

        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(5,2));
    }
}
