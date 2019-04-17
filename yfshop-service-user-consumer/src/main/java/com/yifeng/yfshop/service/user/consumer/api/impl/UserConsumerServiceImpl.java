package com.yifeng.yfshop.service.user.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yifeng.yfshop.service.user.api.UserConsumerService;

@Service(version = "${services.versions.user.v1}")
public class UserConsumerServiceImpl implements UserConsumerService {
    @Override
    public void info() {

    }
}
