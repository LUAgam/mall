package org.linlinjava.litemall.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.linlinjava.litemall.admin","org.linlinjava.litemall.db"})
@MapperScan("org.linlinjava.litemall.db.dao")
public class AdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApiApplication.class, args);
    }

}