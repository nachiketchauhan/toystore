package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long userId;
	String userName;
	String emailId;
	long phoneNumber;
	String password;
	String reEnterPassword;
	String roles;
	String updatedBy;
	Date updatedDate;
	String createdBy;
	Date createdDate;

}
