/*
 * package com.smb.security;
 * 
 * import org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class CustomSecurityConfig{
 * 
 * //@Bean //public PasswordEncoder passwordEncoder() { //return new
 * BCryptPasswordEncoder(); //}
 * 
 * //@Bean // public UserDetailsService userDetailsService() {
 * 
 * UserDetails normalUser = User .withUsername("meena")
 * .password(passwordEncoder().encode("meena")) .roles("NORMAL") .build();
 * UserDetails adminUser = User .withUsername("kiran")
 * .password(passwordEncoder().encode("kiran")) .roles("ADMIN") .build(); return
 * new InMemoryUserDetailsManager(normalUser,adminUser);
 * 
 * //return new CustomUserDetailsService(); //}
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity httpSecurity)
 * throws Exception { return httpSecurity.csrf().disable()
 * .authorizeHttpRequests()
 * .requestMatchers(HttpMethod.POST,"/smbUser/addUser*").permitAll()
 * .anyRequest() .authenticated() .and() .formLogin().and().build(); }
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity httpSecurity)
 * throws Exception { return httpSecurity.csrf().disable()
 * .authorizeHttpRequests() .requestMatchers("/*").permitAll() .anyRequest()
 * .authenticated() .and() .formLogin().and().build(); } public
 * AuthenticationProvider authenticationProvider() { DaoAuthenticationProvider
 * authenticationProvider = new DaoAuthenticationProvider();
 * authenticationProvider.setUserDetailsService(userDetailsService());
 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
 * authenticationProvider; }
 * 
 * }
 */