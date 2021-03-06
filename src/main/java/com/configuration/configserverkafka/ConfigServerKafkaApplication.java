package com.configuration.configserverkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerKafkaApplication.class, args);
	}

}
