package com.jp.springbootlesson8jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jp.springbootlesson8jpa.entity")
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBootLesson8JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringBootLesson8JpaApplication.class, args );
    }
}
