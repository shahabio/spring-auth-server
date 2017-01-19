package io.shahab.authserver;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class DefaultUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equalsIgnoreCase("shahab")) {
            System.out.printf("Username: %s \n", username);
            return new User(username, "123", Collections.singleton(new SimpleGrantedAuthority("USER")));
        }
        throw new SecurityException("Username " + username + " not found");
    }
}
