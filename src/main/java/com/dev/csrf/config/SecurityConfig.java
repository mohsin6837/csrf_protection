package com.dev.csrf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class SecurityConfig
{
  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception
  {
    http.authorizeHttpRequests(request -> request.requestMatchers("/api/v1/token").permitAll());
    http.csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()));
    http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    return http.build();
  }
}
