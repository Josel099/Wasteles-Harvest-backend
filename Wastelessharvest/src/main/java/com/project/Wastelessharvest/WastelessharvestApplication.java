package com.project.Wastelessharvest;

import com.project.Wastelessharvest.Config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WastelessharvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WastelessharvestApplication.class, args);
	}

}
