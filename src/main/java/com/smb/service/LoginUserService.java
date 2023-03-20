package com.smb.service;

import java.util.List;

import com.smb.entity.LoginUser;

public interface LoginUserService {

	List<LoginUser> getUser(String userName);
	
}
