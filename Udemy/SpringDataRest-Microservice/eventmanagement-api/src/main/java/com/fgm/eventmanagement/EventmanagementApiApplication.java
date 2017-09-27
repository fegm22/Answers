package com.fgm.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackageClasses= {EventmanagementApiApplication.class, Jsr310Converters.class})
@EnableSwagger2
public class EventmanagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmanagementApiApplication.class, args);
	}
}
