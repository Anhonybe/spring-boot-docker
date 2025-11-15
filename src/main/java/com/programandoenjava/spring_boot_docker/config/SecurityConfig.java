package com.programandoenjava.spring_boot_docker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // RUTAS PROTEGIDAS
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/publico").permitAll()       // sin login
                        .anyRequest().authenticated()                  // requiere login
                )
                .formLogin()                                          // login por formulario
                .and()
                .httpBasic();                                         // login por Basic Auth (opcional)

        return http.build();
    }

    // USUARIO EN MEMORIA
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User
                .withUsername("admin")
                .password("{noop}12345")     // {noop} = sin encriptación
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}

