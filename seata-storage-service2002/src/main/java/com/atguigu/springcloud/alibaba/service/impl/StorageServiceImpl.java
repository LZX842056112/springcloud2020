package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    //扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----> StorageService中扣减库存");
        storageDao.decrease(productId, count);
        log.info("----> StorageService中扣减库存完成");
    }
}