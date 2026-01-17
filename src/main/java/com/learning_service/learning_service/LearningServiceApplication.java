package com.learning_service.learning_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@SpringBootApplication
public class LearningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningServiceApplication.class, args);
	}
}
