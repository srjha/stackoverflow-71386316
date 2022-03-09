package com.sr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.demo.model.ReleveBancaireEntity;

@RestController
@SpringBootApplication
public class Practice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice1Application.class, args);
	}

	@PostMapping("/test")
	public String save(ReleveBancaireEntity toSave) {
		System.out.println(toSave);
		return "all well";
	}
}
