package com.base.projectboard.config;

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

//        http
//                .formLogin(
//                        form -> form
//                                .loginPage("/login")
//                                .defaultSuccessUrl("/")
//                );

//        http.
//                logout(
//                        logout -> logout
//                                .logoutRequestMatcher(new AntPathRequestMatcher("/members/logout"))
//                                .logoutSuccessUrl("/")
//                );
//
//
        http
                .authorizeHttpRequests(
                        auth -> auth
                                .anyRequest().permitAll()
                );

        return http.build();
    }
}
