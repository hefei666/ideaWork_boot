package com.example.sp_1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.sp_1.Dao")
@SpringBootApplication
public class Sp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sp1Application.class, args);
    }

}
