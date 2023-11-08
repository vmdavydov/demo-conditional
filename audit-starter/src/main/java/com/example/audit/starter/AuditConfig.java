package com.example.audit.starter;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AuditConfig {


    @Bean
    @ConditionalOnMissingBean
    public AuditService auditService() {
        return new AuditServiceImpl();
    }

}
