package com.learning_service.learning_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner printHelloWorld() {
		return args -> {
			System.out.println("\n");
			System.out.println("    ██╗  ██╗███████╗██╗     ██╗      ██████╗     ██╗    ██╗ ██████╗ ██████╗ ██╗     ██╗");
			System.out.println("    ██║  ██║██╔════╝██║     ██║     ██╔═══██╗    ██║    ██║██╔═══██╗██╔══██╗██║     ██║");
			System.out.println("    ███████║█████╗  ██║     ██║     ██║   ██║    ██║ █╗ ██║██║   ██║██████╔╝██║     ██║");
			System.out.println("    ██╔══██║██╔══╝  ██║     ██║     ██║   ██║    ██║███╗██║██║   ██║██╔══██╗██║     ██║");
			System.out.println("    ██║  ██║███████╗███████╗███████╗╚██████╔╝    ╚███╔███╔╝╚██████╔╝██║  ██║███████╗██║");
			System.out.println("    ╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝ ╚═════╝      ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝");
			System.out.println("");
			System.out.println("    ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			System.out.println("    │  �  Learning Service - Your Gateway to Knowledge  �                      │");
			System.out.println("    │                                                                            │");
			System.out.println("    │  ✓ Application Status   : 🟢 RUNNING                                      │");
			System.out.println("    │  ✓ Environment          : Development                                     │");
			System.out.println("    │  ✓ Spring Boot Version  : 4.0.1                                           │");
			System.out.println("    │                                                                            │");
			System.out.println("    │  💡 Ready to empower your learning journey!                               │");
			System.out.println("    ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
			System.out.println("\n");
		};
	}

}
