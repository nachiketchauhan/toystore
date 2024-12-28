package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Long>{
//	
//	@Modifying
//	@Query("update login u set u.userName = ?1, u.lastname = ?2 where u.id = ?3")
//	void setUserInfoById(String firstname, String lastname, Integer userId);

}
