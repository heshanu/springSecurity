package com.example.springSecurity.domain;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Authorities> authorities=new HashSet<Authorities>();

    public User() {
    }

    public Set<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authorities> authorities) {
        this.authorities = authorities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
