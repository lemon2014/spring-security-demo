package org.lemon.spring.springsecurity.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("longmeng");
        System.out.println("{bcrypt}" + password);
        System.out.println(encoder.matches("longmeng", password));
    }
}
