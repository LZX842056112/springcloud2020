package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentHystrixService fall back-paymentInfo_OK, O(∩_∩)O哈哈~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentHystrixService fall back-paymentInfo_TimeOut, O(∩_∩)O哈哈~";
    }
}
