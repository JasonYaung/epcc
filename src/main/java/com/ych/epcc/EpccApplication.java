package com.ych.epcc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Administrator
 */
@MapperScan("com.ych.epcc.mapper")
@SpringBootApplication
public class EpccApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpccApplication.class, args);
    }

}
