package com.base.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BaseProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectBoardApplication.class, args);
	}

}
