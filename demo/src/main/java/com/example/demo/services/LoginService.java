package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Login;

public interface LoginService {

	List<Login> getUserList();

	String addNewUser(Login login);

}