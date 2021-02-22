package com.tw.mywebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebApplication.class, args);
    }

}
