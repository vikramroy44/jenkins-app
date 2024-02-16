package com.jwtExample.Confg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.jwtExample.Security.JWTAuthenticationEntryPoint;
import com.jwtExample.Security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {
	@Autowired
    private JWTAuthenticationEntryPoint jwtAuthEntPoint;
    @Autowired
    private JwtAuthenticationFilter jwtAuthFilter;
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	System.out.println("Security Config Executed");
    	http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(t -> t.requestMatchers("/home/*").
    			authenticated().requestMatchers("/auth/login").permitAll().anyRequest()
    			.authenticated()).exceptionHandling(ex ->ex.authenticationEntryPoint(jwtAuthEntPoint))
    	.sessionManagement(t -> t.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    	http.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
    	return http.build();
    }

	

}
