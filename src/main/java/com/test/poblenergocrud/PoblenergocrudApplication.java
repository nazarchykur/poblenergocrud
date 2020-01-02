package com.test.poblenergocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.test.poblenergocrud")
@EnableJpaRepositories(basePackages = "com.test.poblenergocrud.repositories")
@EnableTransactionManagement
@EntityScan(basePackages = "com.test.poblenergocrud.entities")
public class PoblenergocrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoblenergocrudApplication.class, args);
	}

}
