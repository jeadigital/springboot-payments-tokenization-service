package com.jea.payments.token.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity, adjust as needed
            .authorizeRequests(auth -> auth
                .requestMatchers("/api/tokenization/**").authenticated() // Protects tokenization endpoints
                .anyRequest().permitAll() // Allows all other requests
            )
            .httpBasic(); // Enables basic authentication

        return http.build();
    }
}
