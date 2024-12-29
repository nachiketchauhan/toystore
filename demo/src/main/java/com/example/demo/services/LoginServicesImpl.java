package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;

import jakarta.transaction.Transactional;

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
		return loginRepo.save(login).equals(null) ? "Added successfully" : "Fail to add User Detail";
	}

	@Transactional
	@Override
	public String updateUserDetails(Login login) {
		return "y";
//		return loginRepo.setUser(login.getUserName(), login.getEmailId(), login.getPhoneNumber(), login.getPassword(),
//				login.getReEnterPassword(), login.getRoles(), login.getUpdatedBy(), login.getUpdatedDate(),
//				login.getCreatedBy(), login.getCreatedDate(), login.getUserId());
	}
	
	
	@Transactional
	@Override
	public void deleteUserDetails(Long userid) {
//		loginRepo.deleteUserDetails(userid);
		
	}

}
