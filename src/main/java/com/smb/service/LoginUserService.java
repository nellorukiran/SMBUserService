package com.smb.service;

import java.util.Optional;

import com.smb.entity.LoginUser;

public interface LoginUserService {

	Optional<LoginUser> getUser(String userName);

	LoginUser addUser(LoginUser user);
	
}
