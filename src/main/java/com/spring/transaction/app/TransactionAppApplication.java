package com.spring.transaction.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionAppApplication.class, args);
	}

}
