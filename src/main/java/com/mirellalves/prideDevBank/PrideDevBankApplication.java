package com.mirellalves.prideDevBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan({"com.mirellalves.prideDevBank"})
@EntityScan("com.mirellalves.prideDevBank.entity")
@EnableJpaRepositories("com.mirellalves.prideDevBank.repository")
@SpringBootApplication

public class PrideDevBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrideDevBankApplication.class, args);
	}

}
