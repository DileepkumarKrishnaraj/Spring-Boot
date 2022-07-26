package com.samco.getAllUsersAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.samco")
@SpringBootApplication
public class GetAllUsersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetAllUsersApiApplication.class, args);
	}

}
