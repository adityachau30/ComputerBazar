package com.example.computer_estore.service;

import com.example.computer_estore.entity.CustomUserDetail;
import com.example.computer_estore.entity.User;
import com.example.computer_estore.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Optional<User> user = userRepo.findUserByEmail(email);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user.map(CustomUserDetail::new).get();
    }
}
