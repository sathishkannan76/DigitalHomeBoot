package com.digital.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EntityScan
@SpringBootApplication
@EnableJpaAuditing
public class DigitalHomeBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(DigitalHomeBootApplication.class, args);
	}

}
