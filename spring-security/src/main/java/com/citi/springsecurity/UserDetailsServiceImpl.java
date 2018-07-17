package com.citi.springsecurity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add( new GrantedAuthorityImpl("ROLE_ADMIN"));
        authorities.add( new GrantedAuthorityImpl("AUTH_WRITE"));

        return new org.springframework.security.core.userdetails.User("admin", "admin", authorities);
    }

}