package ru.psstd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ComponentScan({"ru.psstd"})
@EnableAsync
public class Application extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}