package com.hkoo.blackjack.controller;


import com.hkoo.blackjack.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {

    @GetMapping("/myself")
    public User getMyself(@AuthenticationPrincipal User user){
        log.info("{}",user);
        return user;
    }

}
