package com.example.demo.conditional;

import com.example.audit.starter.AuditService;
import com.example.audit.starter.EnableAudit;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAudit
@RequiredArgsConstructor
public class DemoConditionalApplication implements CommandLineRunner {

    private final AuditService auditService;

    public static void main(String[] args) {
        SpringApplication.run(DemoConditionalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        auditService.sendEven("Бла бла бла бла бла бла!!!");
    }
}
