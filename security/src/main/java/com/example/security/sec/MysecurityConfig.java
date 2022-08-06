package com.example.security.sec;

import com.example.security.sec.filter.MySecurityFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;


//AuthenticationProvider
@Configuration
public class MysecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;

    /*
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            //super.configure(auth);
            //save user details inmemory
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
            UserDetails user = User.withUsername("tom").password(passwordEncoder.encode("123")).authorities("read").build();
            userDetailsService.createUser(user);
            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
        }
    */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        //save user details inmemory
        auth.authenticationProvider(customAuthenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        //http.httpBasic();

        //formbase auth
        //http.formLogin();
        http.httpBasic();
        http
                .authorizeRequests()
                .antMatchers("/hello")
                .authenticated();

        http
                .addFilterBefore(new MySecurityFilter(), BasicAuthenticationFilter.class);
    }

    /*
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
       */
}
