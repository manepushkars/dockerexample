package com.dockerexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class dockerexample {
	static Logger log = LoggerFactory.getLogger(dockerexample.class);
	
	public static void main(String[] args) {
		log.info("dockerexample -main");
		SpringApplication.run(dockerexample.class, args);
	}
}
