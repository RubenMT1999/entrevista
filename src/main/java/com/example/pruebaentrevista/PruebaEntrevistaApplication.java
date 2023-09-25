package com.example.pruebaentrevista;

import com.example.pruebaentrevista.config.SwaggerConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EntityScan("com.example.pruebaentrevista.models")
public class PruebaEntrevistaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaEntrevistaApplication.class, args);
    }



}
