package com.royalholiday.ws.royalholidayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wsclient.OwnerInfoClient;

@SpringBootApplication
public class RoyalholidayclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoyalholidayclientApplication.class, args);
		
		OwnerInfoClient test = new OwnerInfoClient();
		test.setSearchParams();
	}

}
