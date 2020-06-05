package com.sapient.week9.StudentPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class JsPwithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsPwithSpringApplication.class, args);
		System.out.println("here");

	}

	@GetMapping(value = "/")
	public String welcome() {
		return "welcome";
	}

}
