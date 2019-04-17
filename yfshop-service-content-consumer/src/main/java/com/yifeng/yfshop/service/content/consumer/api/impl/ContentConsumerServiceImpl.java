package com.yifeng.yfshop.service.content.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yifeng.yfshop.service.content.api.ContentConsumerService;

@Service(version = "${services.versions.content.v1}")
public class ContentConsumerServiceImpl implements ContentConsumerService {
    @Override
    public void info() {

    }
}
