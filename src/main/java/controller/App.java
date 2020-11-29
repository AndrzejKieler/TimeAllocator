package controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Logger logger = LoggerFactory.getLogger(App.class);
        SpringApplication.run(App.class, args);
    }
}
