package com.frankmoley.boot.essentials.initialbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(final HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/", "/api")
                // when it comes to / or /api/*, no need to check
                .permitAll()
                // any other reuqest should have authentication
                .anyRequest().authenticated()
            .and()
            .formLogin()
                // allow /login for form login
            .loginPage("/login")
            .permitAll()
            .and()
                // allow logout
            .logout()
            .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // not production code
        auth.inMemoryAuthentication()
                // just demo
                // in real world, use BCryptPasswordEncoder
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user").password("password").roles("USER");
    }
}
