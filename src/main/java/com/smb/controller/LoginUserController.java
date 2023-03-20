package com.smb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.entity.LoginUser;
import com.smb.service.LoginUserService;

@RestController
@RequestMapping("/smbUser")
public class LoginUserController {

	@Autowired
	LoginUserService userService;
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome</h1>";
	}
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/normal")
	public String user() {
		return "<h1>Hi User</h1>";
	}
	@GetMapping("/public")
	public String publicUser() {
		return "<h1>Hi Public user</h1>";
	}
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Hi Admin</h1>";
	}
	
	@GetMapping("/verifyUser/{userName}")
	public ResponseEntity<List<LoginUser>> getPaymentHistoryByCusId(@PathVariable String userName){
		//List<LoginUser> user = userService.getUser(userName);
		/*
		 * if(user.isEmpty()) { return new
		 * ResponseEntity<>(userService.getUser(userName),HttpStatus.OK); }else { return
		 * new ResponseEntity<>(userService.getUser(userName),HttpStatus.NOT_FOUND); }
		 */
		return new ResponseEntity<>(userService.getUser(userName),HttpStatus.OK);
		
	}
	
}
