package com.nice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class GameStoreApplication {

	@Bean
	public String niceProdNotificationgfListener(){
		return "sadas";
	}


	public static void main(String[] args) {
		ConfigurableApplicationContext context =
					SpringApplication.run(GameStoreApplication.class, args);
		context.start();
	}
}
