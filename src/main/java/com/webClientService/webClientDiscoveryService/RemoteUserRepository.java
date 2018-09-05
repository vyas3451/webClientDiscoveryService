package com.webClientService.webClientDiscoveryService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteUserRepository implements UserRepository{
	
	@Autowired
	protected RestTemplate restTemplate;
	

	protected  String serviceUrl;
	
	
	public RemoteUserRepository(String serviceUrl)
	{
		this.serviceUrl=serviceUrl.startsWith("http")?serviceUrl : "http://"+serviceUrl;
	}
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		User[] user=restTemplate.getForObject(serviceUrl+"/users", User[].class);
		return Arrays.asList(user);
		
	}

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(serviceUrl+"/users/{id}", User.class,id);
	}

}
