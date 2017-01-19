package io.shahab.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@SpringBootApplication
public class AuthServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
