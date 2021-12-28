package com.ferry.demo;

import com.mzt.logapi.starter.annotation.EnableLogRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableLogRecord(tenant = "com.ferry.demo.operate.log")
@EnableTransactionManagement
public class OperateLogApplication {
    public static void main(String[] args) {
        SpringApplication.run(OperateLogApplication.class, args);
    }
}
