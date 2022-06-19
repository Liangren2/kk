package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Demo333ApplicationTests")
public class Demo333Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo333Application.class, args);

    }

}
