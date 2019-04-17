package com.yifeng.yfshop.commons.mapper;

import com.yifeng.yfshop.commons.domain.TbUser;
import com.yifeng.yfshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;
@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}