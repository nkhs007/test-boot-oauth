package com.naveen.test.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getName() {
		return this.restTemplate.getForObject("http://localhost:9000/resource", String.class);
	}
}
