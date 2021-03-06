package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication(scanBasePackages = "org.demo")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
