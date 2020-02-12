package br.com.chronos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChronosApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ChronosApplication.class, args);
		
		System.out.println("------------------");
		System.out.println("Chronos em pé");

	}
}
