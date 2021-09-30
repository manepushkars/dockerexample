package com.dockerexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker")
public class dockerExampleController {
	Logger log = LoggerFactory.getLogger(dockerExampleController.class);
	
	@GetMapping(value = "/dockerexample")
	public String getdockeremample() {
		log.info("dockerExampleController- dockerexample");
		System.out.println("in dockerExampleController");
		return "Welcome to docker springboot!";
	}
	
	@GetMapping(value = "/dockerexampledemo")
	public String getdockerexampledemo() {
		log.info("dockerExampleController- dockerexampledemo");
		System.out.println("in dockerExampleControllerdemo");
		return "Welcome to docker springbootdemo!";
	}
}
