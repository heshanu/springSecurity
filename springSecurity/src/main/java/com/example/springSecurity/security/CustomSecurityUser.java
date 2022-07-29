package com.example.springSecurity.security;

import com.example.springSecurity.domain.Authorities;
import com.example.springSecurity.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

public class CustomSecurityUser extends User implements UserDetails {

    public CustomSecurityUser() {
    }

    public CustomSecurityUser(User user) {
        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setPassword(user.getPassword());
        this.setUsername(user.getUsername());
    }

    @Override
    public Set<Authorities> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
