package com.example.appserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/demo")
	public class DemoController{
		
		@GetMapping("/info")
		public String info(){
			return "{ \"application\": \"1.0\" }";
		}
	}
}
