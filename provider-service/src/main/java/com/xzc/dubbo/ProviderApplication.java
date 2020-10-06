package com.xzc.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ray
 * @date created in 2020/9/27 23:12
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.xzc.dubbo")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
