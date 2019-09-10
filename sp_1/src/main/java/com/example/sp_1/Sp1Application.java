package com.example.sp_1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan("com.example.sp_1.*.Dao")
@SpringBootApplication
@ServletComponentScan("com.example.sp_1.utils.*")
public class Sp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sp1Application.class, args);
    }

}
