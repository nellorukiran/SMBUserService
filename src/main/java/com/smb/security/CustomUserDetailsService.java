/*
 * package com.smb.security;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Component; import
 * org.springframework.stereotype.Service;
 * 
 * import com.smb.entity.LoginUser; import
 * com.smb.repository.LoginUserRepository;
 * 
 * @Service public class CustomUserDetailsService implements UserDetailsService
 * {
 * 
 * @Autowired LoginUserRepository userRepository;
 * 
 * @Override public UserDetails loadUserByUsername(String userName) throws
 * UsernameNotFoundException { Optional<LoginUser> user=
 * userRepository.findByUserName(userName); //.orElseThrow(() -> new
 * UsernameNotFoundException("User not found")); //return new
 * User(user.getUserName(),user.getPassword(),new ArrayList<>()); return
 * user.map(CustomUserDetails::new).orElseThrow(() -> new
 * UsernameNotFoundException("User not found"));
 * 
 * }
 * 
 * }
 */