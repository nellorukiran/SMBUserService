/*
 * package com.smb.security;
 * 
 * import java.util.Arrays; import java.util.Collection; import java.util.List;
 * import java.util.stream.Collectors;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import com.smb.entity.LoginUser;
 * 
 * 
 * public class CustomUserDetails implements UserDetails {
 * 
 *//**
	* 
	*//*
		 * private static final long serialVersionUID = 1L; private String userName;
		 * private String password; private List<GrantedAuthority> authorities;
		 * 
		 * public CustomUserDetails(LoginUser user) { this.userName =
		 * user.getUserName(); this.password = user.getPassword(); authorities =
		 * Arrays.stream(user.getUserRole().split(","))
		 * .map(SimpleGrantedAuthority::new) .collect(Collectors.toList()); }
		 * 
		 * @Override public Collection<? extends GrantedAuthority> getAuthorities() { //
		 * TODO Auto-generated method stub return authorities; }
		 * 
		 * @Override public String getPassword() { // TODO Auto-generated method stub
		 * return password; }
		 * 
		 * @Override public String getUsername() { // TODO Auto-generated method stub
		 * return userName; }
		 * 
		 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
		 * method stub return true; }
		 * 
		 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
		 * stub return true; }
		 * 
		 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
		 * method stub return true; }
		 * 
		 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
		 * return true; }
		 * 
		 * public String getUserName() { return userName; }
		 * 
		 * public void setUserName(String userName) { this.userName = userName; }
		 * 
		 * public void setPassword(String password) { this.password = password; }
		 * 
		 * public void setAuthorities(List<GrantedAuthority> authorities) {
		 * this.authorities = authorities; }
		 * 
		 * 
		 * 
		 * }
		 */