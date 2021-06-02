package com.kuroneko.auto.code.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kuroneko.auto.code.generator.mapper")
public class AutoCodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoCodeGeneratorApplication.class, args);
    }

}
