package com.example.demo.conditional;

import com.example.audit.starter.AuditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyAuditService implements AuditService {
    @Override
    public void sendEven(String event) {
      log.info("Из мейн проекта " + event);
    }
}
