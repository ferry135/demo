package com.ferry.demo.account;

import com.ferry.demo.user.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("account")
@AllArgsConstructor
@Slf4j
public class AccountController {

    private final RestTemplate restTemplate;
    @PostMapping
    public User creteAccount(User user) {
        log.info("create account");
        return restTemplate.postForObject("http://localhost:9090/user", user, User.class);
    }
}
