package com.jwtExample.Confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyAppConfig {
	
	@Bean
	public UserDetailsService userDetailsService() {
		System.out.println("User Details Service executed");
		UserDetails user1 = User.builder().username("vikram").password(passwordEncoder().encode("vikram123")).roles("ADMIN").build();
		//UserDetails user2 = User.builder().username("vikrant").password("vikrant123").roles("ADMIN").build();
		UserDetails user2 = User.builder().username("vikrant").password(passwordEncoder().encode("vikram123")).roles("ADMIN").build();
		
		return  new InMemoryUserDetailsManager(user1, user2);
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
		System.out.println("Authentication Manager Called");
        return builder.getAuthenticationManager();
	}
}
