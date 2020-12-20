package com.github.AndrzejKieler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

//@EntityScan("com.github.AndrzejKieler.domain.notes")
//@EnableJpaRepositories("com.github.AndrzejKieler.repository")
//@ComponentScan(basePackages = {"com.github.AndrzejKieler.service", "com.github.AndrzejKieler.servlets", "com.github.AndrzejKieler.repository", "com.github.AndrzejKieler.controller"})
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Logger logger = LoggerFactory.getLogger(App.class);
        SpringApplication.run(App.class, args);
    }
}
