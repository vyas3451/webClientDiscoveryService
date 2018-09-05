package com.webClientService.webClientDiscoveryService;

import java.util.List;

public interface UserRepository {

	
	List<User> getAllUsers();
	
	User getUser(long id);
	
}
