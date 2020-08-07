package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    //收集现在服务集群上一共有多少台能够提供的机器，放在list里
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
