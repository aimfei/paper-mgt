package com.paper.papermgt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages={"com.paper.papermgt.mapper"})
public class PaperMgtApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaperMgtApplication.class, args);
    }

}
