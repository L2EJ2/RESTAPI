package com.ohgiraffers.jwtrestapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 전체 패키지가 아닌 config 패키지로 들어와서 프젝 전체를 볼 수 없으니가 컴포넌트스캔 어노테션 걸어서 스캔 범위 정해주기
@ComponentScan("com.ohgiraffers.jwtrestapi")
public class RestApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiServerApplication.class, args);
    }

}
