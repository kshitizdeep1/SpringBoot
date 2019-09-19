package com.zensar.ashw.springdemo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
// @ConfigurationProperties("spring.datasource")
@Component
public class DbConfiguration {

//	@Profile("dev")
	@Bean
	public String devDb() {

		return "DataBase connectivity for dev";
	}

//	@Profile("test")
	@Bean
	public String testDb() {

		return "DataBase connectivity for test";
	}

}
