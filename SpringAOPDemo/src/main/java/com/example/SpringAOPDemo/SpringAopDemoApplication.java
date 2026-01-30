package com.example.SpringAOPDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopDemoApplication implements CommandLineRunner{
	
	@Autowired
	private BankService bankService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopDemoApplication.class, args);
		
	}

	//@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bankService.depositAmount("ACC123", 2500);
		bankService.withdrawAmount("ACC123", 200);
		bankService.transferFund("ACC123", "ACC456", 100);
	}	
}
