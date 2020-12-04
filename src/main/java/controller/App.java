package controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

//@EntityScan("domain.notes")
//@EnableJpaRepositories("repository")
@ComponentScan(basePackages = {"service", "servlets","repository","controller"})
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Logger logger = LoggerFactory.getLogger(App.class);
        SpringApplication.run(App.class, args);
    }
}
