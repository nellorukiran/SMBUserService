package com.smb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.LoginUser;

public interface LoginUserRepository extends JpaRepository<LoginUser, String> {
	
	public Optional<LoginUser> findByUserName(String userName);

}
