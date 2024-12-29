package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Long> {

	


	@Modifying(clearAutomatically = true)
	@NativeQuery("update login a set a.user_name =:userName where user_id = :userId")
	void markEntryAsRead(@Param("userName") Long userName, @Param("userId") long userId);
	
	
//	@Modifying
//	@Query("update login  set user_name = ?1, email_id = ?2,phone_number=?3,password=?4"
//			+ ",re_enter_password=?5,roles=?6,updated_by=?7,updated_date=?8,"
//			+ "created_by=?9,created_date=?10 where user_id = ?11")
//	void setUser(String userName, String emailId, Long phoneNumber, String password, String reEnterPassword,
//			String roles, String updatedBy, Date updatedDate, String createdBy, Date createdDate, Long userId);
//
//	@Modifying
//	@Query("delete from login where user_id=?1")
//	void deleteUserDetails(Long userid);

}
