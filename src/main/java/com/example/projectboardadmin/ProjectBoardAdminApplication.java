package com.example.projectboardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
@EntityScan
public class ProjectBoardAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectBoardAdminApplication.class, args);
    }

}
