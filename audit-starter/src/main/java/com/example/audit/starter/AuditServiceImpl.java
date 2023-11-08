package com.example.audit.starter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuditServiceImpl implements AuditService {
    @Override
    public void sendEven(String event) {
      log.info("Из стартера " + event);
    }
}
