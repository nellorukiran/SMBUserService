package com.smb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.LoginUser;
import com.smb.repository.LoginUserRepository;

@Service
public class LoginUserServiceImp implements LoginUserService {
	
	@Autowired
	LoginUserRepository userRepository;

	@Override
	public List<LoginUser> getUser(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(userName);
	}

}
