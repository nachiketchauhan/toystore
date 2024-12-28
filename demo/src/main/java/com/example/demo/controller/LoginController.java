package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.services.LoginService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/getUserList")
	public List<Login> getUserList() {
	List<Login> a=	loginService.getUserList();
		return a;
	}
	
	@PostMapping("/addNewUser")
	public String addNewUser(@RequestBody Login login){
		return loginService.addNewUser(login);
	}
//	
//	@PutMapping("/updateUserDetails")
//	public String updateUserDetails(@RequestBody Login login) {
//		return loginService.updateUserDetails(login);
//	}
	

}
