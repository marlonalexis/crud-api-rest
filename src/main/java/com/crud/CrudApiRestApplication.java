package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("com.crud.dao")
@EntityScan("com.crud.domain")
@ComponentScan
public class CrudApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiRestApplication.class, args);
	}
}
