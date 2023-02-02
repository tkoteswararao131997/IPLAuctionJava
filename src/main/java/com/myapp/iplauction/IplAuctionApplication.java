package com.myapp.iplauction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EntityScan("com.myapp.iplauction.model")
@SpringBootApplication
//@EnableSwagger2
public class IplAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplAuctionApplication.class, args);
	}

}
