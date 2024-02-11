package com.poc.itriangleMob;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.poc.itriangleMob", "com.poc.itriangleMob.config"}) // Add package containing SecurityConfig

public class AuthServer {
	public static void main(String[] args) {
		SpringApplication.run(AuthServer.class, args);
	}
}