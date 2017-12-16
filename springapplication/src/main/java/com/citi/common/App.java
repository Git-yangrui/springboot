package com.citi.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class App  implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        reports.stream().forEach(Report::generate);
    }

    @Autowired
    List<Report> reports;

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
