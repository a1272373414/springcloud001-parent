package com.tang.springcloud001.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 监控中心启动类
 *
 * @author stylefeng
 * @Date 2018/6/24 22:28
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class MonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
        System.out.println("=========================================================200");
    }

    @Configuration
    public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()
                    .and().csrf().disable();
        }
    }
}

