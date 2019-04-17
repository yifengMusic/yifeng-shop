package com.yifeng.yfshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yifeng.yfshop.commons.domain.TbUser;
import com.yifeng.yfshop.commons.mapper.TbUserMapper;
import com.yifeng.yfshop.service.redis.api.RedisService;
import com.yifeng.yfshop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service(version = "${services.versions.user.v1}")
@Transactional(readOnly = true)
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Reference(version = "${services.versions.redis.v1}")
    private RedisService redisService;


    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }

    @Override
    public PageInfo<TbUser> page(int pageNum, int pageSize, TbUser tbUser) {
        redisService.set("Hello","Heloo redis");
        Example example=new Example(TbUser.class);
        PageHelper.offsetPage(pageNum, pageSize);
        PageInfo<TbUser> pageInfo=new PageInfo<>(tbUserMapper.selectByExample(example));
        return pageInfo;
    }
}
