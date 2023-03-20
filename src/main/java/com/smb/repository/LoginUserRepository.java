package com.smb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.LoginUser;

public interface LoginUserRepository extends JpaRepository<LoginUser, String> {
	
	public List<LoginUser> findByUserName(String userName);

}
