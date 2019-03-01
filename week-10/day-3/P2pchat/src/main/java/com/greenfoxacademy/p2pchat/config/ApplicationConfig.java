package com.greenfoxacademy.p2pchat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
//@Order(SecurityProperties.BASIC_AUTH_ORDER - 10)
public class ApplicationConfig extends WebSecurityConfigurerAdapter {

  private BasicAuthenticationPoint basicAuthenticationPoint;

  @Autowired
  public void setAuthenticationPoint(BasicAuthenticationPoint point){
    this.basicAuthenticationPoint = point;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception{
    http.csrf().disable();
    http.authorizeRequests().
        antMatchers("/login").permitAll().
    antMatchers("/", "/**").access("hasRole('USER')").
//        anyRequest().authenticated().
        and().formLogin();
   //     and().httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
//    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }

  @Autowired
  public void configureInMemory(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("aze").password("{noop}secure").roles("USER");
  }
}
