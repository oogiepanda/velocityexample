package com.oogie.velocityexample;

import com.oogie.velocityexample.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Autowired
	private ServiceFacade userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(ApplicationArguments arg0) throws Exception {
		userService.doService("insert");
	}
}
