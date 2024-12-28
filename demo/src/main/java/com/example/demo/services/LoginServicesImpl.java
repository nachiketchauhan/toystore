package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;

@Service
public class LoginServicesImpl implements LoginService {
	
	@Autowired
	LoginRepo loginRepo;

	@Override
	public List<Login> getUserList() {
		
		return loginRepo.findAll();
	}


	@Override
	public String addNewUser(Login login) {
		// TODO Auto-generated method stub
		return loginRepo.save(login).equals(null)?"Added successfully":"Fail to add User Detail";
	}

}
