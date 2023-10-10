package com.SpringBoot.cassandraDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CassandraDemoProjectApplication {

      public static void main(String[] args) {


        SpringApplication.run(CassandraDemoProjectApplication.class, args);
    }

}
