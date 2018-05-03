package com.bozgold.payeezyclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.firstdata.payeezy", "com.bozgold.payeezyclient"})
public class PayeezyClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(PayeezyClientApplication.class, args);
	}
}
