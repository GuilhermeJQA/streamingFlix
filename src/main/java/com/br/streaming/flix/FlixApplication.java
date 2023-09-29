package com.br.streaming.flix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.br.streaming.flix")
public class FlixApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlixApplication.class, args);
	}

}
