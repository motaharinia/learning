//package com.motaharinia.base.configuration.securityconfig;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//public class CustomSpringSecurity {
//    @Autowired
//    UserDetailsService userDetailsService;
//
//    public String login(){
//        String loginFormUsername="ddddd";
//        String loginFormPassword="ddddd";
//        UserDetails userDetails= userDetailsService.loadUserByUsername(loginFormUsername);
//        if(userDetails.getPassword().equals(loginFormPassword) && userDetails.isEnabled()){
//            return "200";
//        }else{
//            return "401";
//        }
//    }
//}
