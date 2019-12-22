package com.hkoo.blackjack.config;

import com.hkoo.blackjack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.web.filter.CompositeFilter;

import java.util.Arrays;
import java.util.logging.Filter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and().csrf().disable()
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/", "/view/**", "/login**", "/webjars/**", "/error**" ,"/blackjack/**", "/h2-console/**")
                .permitAll().anyRequest().authenticated()
                .and()
                .exceptionHandling().authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/"))
                .and()
                .logout().logoutSuccessUrl("/").permitAll()
                .and()
                .headers().frameOptions().disable()
    }
    private Filter ssoFilter(){
        CompositeFilter compositeFilter = new CompositeFilter();
        compositeFilter.setFilters(Arrays.asList());
    }
}
