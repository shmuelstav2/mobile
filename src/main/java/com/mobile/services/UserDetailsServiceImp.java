package com.mobile.services;


import com.mobile.domain.User;
import com.mobile.repositories.UserRepository;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;


public class UserDetailsServiceImp implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailsServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /*@Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }*/


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       // Long userNameLong = Long.parseLong(username, 10);
        User user =getUserByIdNumber(username);
        //user.g
        UserBuilder builder = null;
        if (user != null) {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
            builder.roles(user.getRole().toString());
        } else {
            throw new UsernameNotFoundException("User not found.");
        }

        return builder.build();
    }
    public User getUserByIdNumber(String username) {
       User foundUser = userRepository.getDistinctFirstByUsername(username);
       return  foundUser;
    }
}
