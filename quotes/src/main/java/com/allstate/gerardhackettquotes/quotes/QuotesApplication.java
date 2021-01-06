package com.allstate.gerardhackettquotes.quotes;
//import org.springframework.data.SpringApplication;
//import org.springframework.data.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Use jpa repositories, component scan everything under
public class QuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesApplication.class, args);
	}

}
