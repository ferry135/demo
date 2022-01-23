package com.ferry.demo.log;

import lombok.Data;

import java.util.Date;

@Data
public class Log {
    private Integer id;
    private String tenant;
    private String bizKey;
    private String bizNo;
    private String operator;
    private String action;
    private String category;
    private Date createTime;
    private String detail;
}
