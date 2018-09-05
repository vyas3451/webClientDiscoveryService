package com.webClientService.webClientDiscoveryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/allusers")
	public String userList(Model model)
	{
		model.addAttribute("users",userRepository.getAllUsers());
		return "allUsers";
	}
	
	@RequestMapping("/userDetails")
	public String getUserDetails(@RequestParam("id") long id,Model model)
	{
		model.addAttribute("user",userRepository.getUser(id));
		return "userData";
	}
}
