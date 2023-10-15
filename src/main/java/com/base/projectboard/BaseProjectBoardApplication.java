package com.base.projectboard;

import com.base.projectboard.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BaseProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProjectBoardApplication.class, args);
	}

}
