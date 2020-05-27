//package com.motaharinia.base.configuration.securityconfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.stereotype.Component;
//
//@Configuration
//@Component
//public class AzishRad {
//    @Bean
//    public UserDetailsService userDetailsService() throws Exception {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User
//                .withDefaultPasswordEncoder()
//                .username("motaharinia")
//                .password("123456789")
//                .roles("USER")
//                .build()
//        );
//        return manager;
//    }
//}
