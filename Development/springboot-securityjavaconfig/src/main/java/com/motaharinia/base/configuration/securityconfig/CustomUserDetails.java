//package com.motaharinia.base.configuration.securityconfig;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//
//@Component
//public class CustomUserDetails implements UserDetailsService {
//
//    HashMap<String , UserDetails> myHashmap = new HashMap<>();
//    public CustomUserDetails() {
//       UserDetails userDetails = User.withDefaultPasswordEncoder()
//                .username("motaharinia")
//                .password("123456789")
//                .roles("USER")
//                .build();
//        myHashmap.put("motaharinia",userDetails);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserDetails userDetails = myHashmap.get(s);
//        return userDetails;
//    }
//}
