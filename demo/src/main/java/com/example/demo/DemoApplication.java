package com.example.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static final Logger LOG = Logger.getLogger(DemoApplication.class.getName());

    public static void main(String[] args) {
        LOG.log(Level.INFO, "------- in main ! ----");
        SpringApplication.run(DemoApplication.class, args);
    }
}
