package com.ihormanzii.monobankcurrencychecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MonobankCurrencyCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonobankCurrencyCheckerApplication.class, args);
	}

}
