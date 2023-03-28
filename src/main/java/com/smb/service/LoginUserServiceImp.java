package com.smb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.smb.entity.LoginUser;
import com.smb.exceptions.EmptyInputException;
import com.smb.exceptions.UserServiceException;
import com.smb.repository.LoginUserRepository;

@Service
public class LoginUserServiceImp implements LoginUserService {
	
	@Autowired
	LoginUserRepository userRepository;
	
	@Bean
	public PasswordEncoder passwordEncoder1() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public Optional<LoginUser> getUser(String userName) {
		try {
			if(userName.isEmpty() || userName.length() <= 0) {
				throw new UserServiceException("601","Please send username");
			}
			return userRepository.findByUserName(userName);
		}catch (IllegalArgumentException e) {
			throw new UserServiceException("602","Username is empty"+e.getMessage());
		}catch (Exception e) {
			throw new UserServiceException("603","Something went wrong "+e.getMessage());
		}
	}

	@Override
	public LoginUser addUser(LoginUser user) {
		
			if(user.getUserName().isEmpty() || user.getUserName().length() <= 0) {
				throw new EmptyInputException("601","Please send username");
			}
		try {
			user.setPassword(passwordEncoder1().encode(user.getPassword()));
			return userRepository.save(user);
		}catch (IllegalArgumentException e) {
			throw new UserServiceException("602","Username is empty"+e.getMessage());
		}catch (Exception e) {
			throw new UserServiceException("603","Something went wrong in service layer."+e.getMessage());
		}
	}

}
