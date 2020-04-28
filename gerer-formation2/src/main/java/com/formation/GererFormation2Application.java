package com.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.formation.repository.UserDAO;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = UserDAO.class)
@EnableConfigurationProperties(AppProperties.class)
public class GererFormation2Application {

	public static void main(String[] args) {
		SpringApplication.run(GererFormation2Application.class, args);
	}


}
