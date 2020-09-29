package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;
    private Long userId;//用户id
    private BigDecimal total;//总余额
    private BigDecimal used;//已用余额
    private BigDecimal residue;//剩余余额
}
