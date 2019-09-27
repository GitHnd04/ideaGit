package com.testGit;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestGitAddApp {
    public static void main(String[] args) {
        SpringApplication.run(TestGitAddApp.class,args);
        log.info("***********TestGitAddApp 服务启动成功！*****");
    }
}
