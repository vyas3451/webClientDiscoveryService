package com.webClientService.webClientDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class WebClientDiscoveryServiceApplication {

	
	public static final String USER_SERVICE_URL="http://a2ml23173.mindtree.com:2222";
	public static void main(String[] args) {
		SpringApplication.run(WebClientDiscoveryServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public UserRepository userRepository()
	{
		return new RemoteUserRepository(USER_SERVICE_URL);
	}
	
	
}
